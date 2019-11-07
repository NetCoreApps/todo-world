using System.Threading.Tasks;
using Funq;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Server.Kestrel.Core;
using Microsoft.Extensions.DependencyInjection;
using ServiceStack;
using NUnit.Framework;
using TodoWorld.ServiceInterface;
using TodoWorld.ServiceModel;
using ProtoBuf.Grpc.Client;

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

        [Test] // Requires Host project running on https://localhost:5001 (default)
        public async Task Can_GET_Hello_WebHost()
        {
            var client = new GrpcServiceClient("https://localhost:5001");

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