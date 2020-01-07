using System.Security.Cryptography.X509Certificates;
using System.Threading.Tasks;
using ServiceStack;
using ServiceStack.Text;
using TodoWorld.ServiceModel;

namespace CSharpGeneric
{
    public class Program
    {
        public static GrpcServiceClient CreateClient() => new GrpcServiceClient("https://localhost:5001",
            new X509Certificate2("../../../../certs/dev.crt"),
            GrpcUtils.AllowSelfSignedCertificatesFrom("localhost"));

        public static async Task Main(string[] args)
        {
            await Run(CreateClient());
        }

        public static async Task Run(GrpcServiceClient client)
        {
            await client.PostAsync(new ResetTodos());

            //POST /todos
            var todo = (await client.PostAsync(new CreateTodo {Title = "ServiceStack"})).Result;
            $"new todo Id: {todo.Id}, Title: {todo.Title}".Print();

            //GET /todos
            var all = await client.GetAsync(new GetTodos());
            $"todos: {all.Results?.Count ?? 0}".Print();

            //GET /todos/1
            todo = (await client.GetAsync(new GetTodo {Id = todo.Id})).Result;
            $"get todo Id: {todo.Id}, Title: {todo.Title}".Print();

            //GET /todos
            all = await client.GetAsync(new GetTodos());
            $"todos: {all.Results?.Count ?? 0}".Print();

            //PUT /todos/1
            await client.PutAsync(new UpdateTodo {Id = todo.Id, Title = "gRPC"});

            //GET /todos/1
            todo = (await client.GetAsync(new GetTodo {Id = todo.Id})).Result;
            $"updated todo Title: {todo.Title}".Print();

            //DELETE /todos/1
            await client.DeleteAsync(new DeleteTodo {Id = todo.Id});

            //GET /todos
            all = await client.GetAsync(new GetTodos());
            $"todos: {all.Results?.Count ?? 0}".Print();
        }
    }
}