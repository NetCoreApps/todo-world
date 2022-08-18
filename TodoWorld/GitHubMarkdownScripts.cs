using System.Collections.Generic;
using System.IO;
using System.Net.Http.Headers;
using System.Threading.Tasks;
using ServiceStack;
using ServiceStack.IO;
using ServiceStack.Script;
using ServiceStack.Text;
using HttpHeaders = ServiceStack.HttpHeaders;

namespace TodoWorld
{
    public class GitHubMarkdownScripts : ScriptMethods
    {
        public string ApiBaseUrl { get; set; } = "https://api.github.com";

        public bool UseMemoryCache { get; set; } = true;

        public string Mode { get; set; } = "gfm";

        public string RepositoryContext { get; set; }

        public IRawString markdown(ScriptScopeContext scope, string markdown)
        {
            var html = MarkdownConfig.Transformer.Transform(markdown);
            return html.ToRawString();
        }

        public static async Task<Stream> TransformToHtml(Stream markdownStream)
        {
            var md = await markdownStream.ReadToEndAsync();
            var html = MarkdownConfig.Transformer.Transform(md);
            return MemoryStreamFactory.GetStream(html.ToUtf8Bytes());
        }

        public async Task githubMarkdown(ScriptScopeContext scope, string markdownPath)
        {
            var file = Context.ProtectedMethods.ResolveFile(nameof(githubMarkdown), scope, markdownPath);
            var htmlFilePath = file.VirtualPath.LastLeftPart('.') + ".html";
            var cacheKey = nameof(GitHubMarkdownScripts) + ">" + htmlFilePath;

            var htmlFile = Context.VirtualFiles.GetFile(htmlFilePath);
            if (htmlFile != null && htmlFile.LastModified >= file.LastModified)
            {
                if (UseMemoryCache)
                {
                    byte[] bytes;
                    if (!Context.Cache.TryGetValue(cacheKey, out object oBytes))
                    {
                        using (var stream = htmlFile.OpenRead())
                        {
                            var ms = MemoryStreamFactory.GetStream();
                            using (ms)
                            {
                                await stream.CopyToAsync(ms);
                                ms.Position = 0;
                                bytes = ms.ToArray();
                                Context.Cache[cacheKey] = bytes;
                            }
                        }
                    }
                    else
                    {
                        bytes = (byte[]) oBytes;
                    }

                    scope.OutputStream.Write(bytes, 0, bytes.Length);
                }
                else
                {
                    using (var htmlReader = htmlFile.OpenRead())
                    {
                        await htmlReader.CopyToAsync(scope.OutputStream);
                    }
                }
            }
            else
            {
                var ms = MemoryStreamFactory.GetStream();
                using (ms)
                {
                    using (var stream = file.OpenRead())
                    {
                        await stream.CopyToAsync(ms);
                    }

                    ms.Position = 0;
                    var bytes = ms.ToArray();

                    var htmlBytes = RepositoryContext == null
                        ? await ApiBaseUrl.CombineWith("markdown", "raw")
                            .PostBytesToUrlAsync(bytes, contentType: MimeTypes.PlainText,
                                requestFilter: x => x.AddHeader(HttpHeaders.UserAgent,"#Script"))
                        : await ApiBaseUrl.CombineWith("markdown")
                            .PostBytesToUrlAsync(
                                new Dictionary<string, string> {
                                    {"text", bytes.FromUtf8Bytes()}, {"mode", Mode}, {"context", RepositoryContext}
                                }.ToJson().ToUtf8Bytes(),
                                contentType: MimeTypes.Json, requestFilter: x => x.AddHeader(HttpHeaders.UserAgent,"#Script"));


                    var headerBytes = "<div class=\"gfm\">".ToUtf8Bytes();
                    var footerBytes = "</div>".ToUtf8Bytes();

                    var wrappedBytes = new byte[headerBytes.Length + htmlBytes.Length + footerBytes.Length];
                    System.Buffer.BlockCopy(headerBytes, 0, wrappedBytes, 0, headerBytes.Length);
                    System.Buffer.BlockCopy(htmlBytes, 0, wrappedBytes, headerBytes.Length, htmlBytes.Length);
                    System.Buffer.BlockCopy(footerBytes, 0, wrappedBytes, headerBytes.Length + htmlBytes.Length,
                        footerBytes.Length);

                    if (Context.VirtualFiles is IVirtualFiles vfs)
                    {
                        var fs = vfs.GetFileSystemVirtualFiles();
                        fs.DeleteFile(htmlFilePath);
                        fs.WriteFile(htmlFilePath, wrappedBytes);
                    }

                    if (UseMemoryCache)
                    {
                        Context.Cache[cacheKey] = wrappedBytes;
                    }

                    await scope.OutputStream.WriteAsync(wrappedBytes, 0, wrappedBytes.Length);
                }
            }
        }
    }
}