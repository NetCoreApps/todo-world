using System;
using System.IO;
using System.Linq;
using System.Net.Http;
using System.Net.Security;
using System.Security.Authentication;
using System.Security.Cryptography.X509Certificates;
using System.Threading.Tasks;
using Funq;
using Grpc.Core;
using Grpc.Net.Client;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Server.Kestrel.Core;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Logging;
using ServiceStack;
using NUnit.Framework;
using TodoWorld.ServiceInterface;
using TodoWorld.ServiceModel;
using ProtoBuf.Grpc.Client;
using ServiceStack.Text;

namespace TodoWorld.Tests
{
    public class GrpcTests
    {
        private const int Port = 2000;
        static readonly string BaseUri = $"http://localhost:{Port}/";
        private readonly ServiceStackHost appHost;

        class AppHost : AppSelfHostBase
        {
            public AppHost() : base(nameof(GrpcTests), typeof(TodoServices).Assembly) { }

            public override void Configure(Container container)
            {
                Plugins.Add(new GrpcFeature(App));
                Plugins.Add(new ServerEventsFeature());
            }

            public override void ConfigureKestrel(KestrelServerOptions options)
            {
                options.ListenLocalhost(2000, listenOptions =>
                {
                    listenOptions.Protocols = HttpProtocols.Http2;
                });
            }

            public override void Configure(IServiceCollection services)
            {
                services.AddServiceStackGrpc();
            }

            public override void Configure(IApplicationBuilder app)
            {
                app.UseRouting();
            }
        }

        public GrpcTests()
        {
            appHost = new AppHost()
                .Init()
                .Start(BaseUri);

            GrpcClientFactory.AllowUnencryptedHttp2 = true;
        }

        [OneTimeTearDown]
        public void OneTimeTearDown() => appHost.Dispose();

        [Test, Explicit] // Requires Host project running on http://localhost:5002 (HTTP2) 
        public async Task Can_GET_Hello_WebHost_Insecure()
        {
            var client = new GrpcServiceClient("http://localhost:5002");

            var response = await client.GetAsync(new Hello { Name = "World" });

            Assert.That(response.Result, Is.EqualTo("Hello, World!"));
        }

        [Test, Explicit] // Requires Host project running on https://localhost:5001 (HTTP2 SSL) 
        public async Task Can_GET_Hello_WebHost_Secure()
        {
            var client = new GrpcServiceClient(GrpcChannel.ForAddress("https://localhost:5001", new GrpcChannelOptions
            {
                HttpClient = new HttpClient(new HttpClientHandler()
                    .AddPemCertificateFromFile("../../../../clients/certs/dev.crt")
                    .AllowSelfSignedCertificatesFrom("localhost")),
            }));
                
            var response = await client.GetAsync(new Hello { Name = "World" });

            Assert.That(response.Result, Is.EqualTo("Hello, World!"));
        }

        [Test] 
        public async Task Can_GET_Hello_TodoWorld_Insecure()
        {
            var client = new GrpcServiceClient("http://todoworld.servicestack.net:5054");

            var response = await client.GetAsync(new Hello { Name = "World" });

            Assert.That(response.Result, Is.EqualTo("Hello, World!"));
        }

        [Test] 
        public async Task Can_GET_Hello_TodoWorld_Secure()
        {
            var client = new GrpcServiceClient(GrpcChannel.ForAddress("https://todoworld.servicestack.net:50051", new GrpcChannelOptions
            {
                HttpClient = new HttpClient(new HttpClientHandler()
                    .AddPemCertificateFromFile("../../../../clients/certs/prod.crt")
                    .AllowSelfSignedCertificatesFrom("todoworld.servicestack.net")),
            }));
                
            var response = await client.GetAsync(new Hello { Name = "World" });

            Assert.That(response.Result, Is.EqualTo("Hello, World!"));
        }

        [Test] 
        public async Task Can_GET_Hello_TodoWorld_Secure_grpc()
        {
            var client = new GrpcServiceClient(GrpcChannel.ForAddress("https://todoworld.servicestack.net:50052", new GrpcChannelOptions
            {
                HttpClient = new HttpClient(new HttpClientHandler()
                    .AddPemCertificateFromFile("../../../../clients/certs/prod.crt")
                    .AllowSelfSignedCertificatesFrom("todoworld.servicestack.net")),
            }));
                
            var response = await client.GetAsync(new Hello { Name = "World" });

            Assert.That(response.Result, Is.EqualTo("Hello, World!"));
        }

        public IServiceClientAsync CreateClient() => new GrpcServiceClient(BaseUri);

        [Test]
        public async Task Can_GET_Hello()
        {
            var client = CreateClient();

            var response = await client.GetAsync(new Hello { Name = "World" });

            Assert.That(response.Result, Is.EqualTo("Hello, World!"));
        }

        [Test]
        public async Task Does_CRUD_Example()
        {
            var client = CreateClient();
            await client.PostAsync(new ResetTodos());

            //GET /todos
            var all = await client.GetAsync(new GetTodos());
            Assert.That(all.Results?.Count ?? 0, Is.EqualTo(0));

            //POST /todos
            var todo = (await client.PostAsync(new CreateTodo { Title = "ServiceStack" })).Result;
            Assert.That(todo.Id, Is.EqualTo(1));
            //GET /todos/1
            todo = (await client.GetAsync(new GetTodo { Id = todo.Id })).Result;
            Assert.That(todo.Title, Is.EqualTo("ServiceStack"));

            //GET /todos
            all = await client.GetAsync(new GetTodos());
            Assert.That(all.Results.Count, Is.EqualTo(1));

            //PUT /todos/1
            await client.PutAsync(new UpdateTodo { Id = todo.Id, Title = "gRPC" });
            todo = (await client.GetAsync(new GetTodo { Id = todo.Id })).Result;
            Assert.That(todo.Title, Is.EqualTo("gRPC"));

            //DELETE /todos/1
            await client.DeleteAsync(new DeleteTodo { Id = todo.Id });
            //GET /todos
            all = await client.GetAsync(new GetTodos());
            Assert.That(all.Results?.Count ?? 0, Is.EqualTo(0));
        }
        
    }
}