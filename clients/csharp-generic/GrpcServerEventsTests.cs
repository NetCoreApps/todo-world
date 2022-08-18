using System.Collections.Generic;
using System.Security.Cryptography.X509Certificates;
using System.Threading.Tasks;
using NUnit.Framework;
using ServiceStack;
using ServiceStack.Text;

namespace CSharpGeneric
{
    public class GrpcServerEventsTests
    {
        [Test]
        public async Task Can_stream_ServerEvents()
        {
            var client = Program.CreateClient();
            var stream = client.StreamAsync(new StreamServerEvents {
                Channels = new[] {"todos"}
            });
            
            var todoTask = Program.Run(client);

            var i = 0;
            await foreach (var msg in stream)
            {
                if (msg.Selector.StartsWith("todos"))
                {
                    var obj = JSON.parse(msg.Json);
                    if (obj is Dictionary<string, object> map)
                    {
                        var id = map["id"];
                        var title = map["title"];
                        $"EVENT {msg.Selector} [{msg.Channel}]: #{id} {title}".Print();
                    }
                    else
                    {
                        $"EVENT {msg.Selector} [{msg.Channel}]: {obj}".Print();
                    }
                }
                else
                {
                    $"EVENT {msg.Selector} [{msg.Channel}]: #{msg.UserId} {msg.DisplayName}".Print();
                }
                
                if (++i >= 6) 
                    break;
            }

            await todoTask;
        }
    }
}