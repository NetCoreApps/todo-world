
## C# Generic GrpcServiceClient Example

Install [x dotnet tool](https://docs.servicestack.net/web-tool):
    
    $ dotnet tool install --global x 

Create a new C# App:

    $ dotnet new console

Add [ServiceStack.GrpcClient](https://www.nuget.org/packages/ServiceStack.GrpcClient) NuGet Package:

    $ dotnet add package ServiceStack.GrpcClient

Add TodoWorld DTOs:

    $ x csharp https://todoworld.servicestack.net
    
Use TodoWorld DTOs with generic `GrpcServiceClient` to call TodoWorld gRPC Service:

### C# gRPC insecure Example

```csharp
using System;
using System.Threading.Tasks;
using ServiceStack;
using TodoWorld.ServiceModel;

namespace TodoWorld
{
    class Program
    {
        public static async Task Main(string[] args)
        {
            ProtoBuf.Grpc.Client.GrpcClientFactory.AllowUnencryptedHttp2 = true;
            var client = new GrpcServiceClient("http://todoworld.servicestack.net:5054");

            var response = await client.GetAsync(new Hello { Name = "gRPC C#" });

            Console.WriteLine(response.Result);
        }
    }
}
```

Override `Program.cs` with the above C# Example: 

    $ x mix todoworld-cs

Run example:

    $ dotnet run

### C# gRPC SSL Example

```csharp
using System;
using System.Threading.Tasks;
using System.Security.Cryptography.X509Certificates;
using ServiceStack;
using TodoWorld.ServiceModel;

namespace TodoWorld
{
    class Program
    {
        public static async Task Main(string[] args)
        {
            var client = new GrpcServiceClient("https://todoworld.servicestack.net:50051", 
                new X509Certificate2("https://todoworld.servicestack.net/grpc.crt".GetBytesFromUrl()), 
                GrpcUtils.AllowSelfSignedCertificatesFrom("todoworld.servicestack.net"));

            var response = await client.GetAsync(new Hello { Name = "gRPC C#" });

            Console.WriteLine(response.Result);
        }
    }
}
```

Override `Program.cs` with the above C# Example: 

    $ x mix todoworld-cs-ssl

Run example:

    $ dotnet run

### C# Local Development gRPC SSL CRUD Example

```csharp
using System.Threading.Tasks;
using ServiceStack;
using ServiceStack.Text;
using TodoWorld.ServiceModel;

namespace CSharpGeneric
{
    public class Program
    {
        public static async Task Main(string[] args)
        {
            // Certificate registration not required when using trusted local development certificate  
            var client = new GrpcServiceClient("https://localhost:5001");
            await client.PostAsync(new ResetTodos());

            //POST /todos
            var todo = (await client.PostAsync(new CreateTodo { Title = "ServiceStack" })).Result;
            $"new todo Id: {todo.Id}, Title: {todo.Title}".Print();
            
            //GET /todos
            var all = await client.GetAsync(new GetTodos());
            $"todos: {all.Results?.Count ?? 0}".Print();

            //GET /todos/1
            todo = (await client.GetAsync(new GetTodo { Id = todo.Id })).Result;
            $"get todo Id: {todo.Id}, Title: {todo.Title}".Print();

            //GET /todos
            all = await client.GetAsync(new GetTodos());
            $"todos: {all.Results?.Count ?? 0}".Print();

            //PUT /todos/1
            await client.PutAsync(new UpdateTodo { Id = todo.Id, Title = "gRPC" });

            //GET /todos/1
            todo = (await client.GetAsync(new GetTodo { Id = todo.Id })).Result;
            $"updated todo Title: {todo.Title}".Print();

            //DELETE /todos/1
            await client.DeleteAsync(new DeleteTodo { Id = todo.Id });

            //GET /todos
            all = await client.GetAsync(new GetTodos());
            $"todos: {all.Results?.Count ?? 0}".Print();
        }
    }
}
```

Refer to [/src/clients/csharp-generic](https://github.com/NetCoreApps/todo-world/tree/master/src/clients/csharp-generic)
for a complete example project.
