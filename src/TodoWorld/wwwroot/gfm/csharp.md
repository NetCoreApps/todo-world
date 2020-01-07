
## C# Google protoc generated GrpcServiceClient Example

Install [x dotnet tool](https://docs.servicestack.net/dotnet-tool):
    
    $ dotnet tool install --global x 

Create a new C# Console App:

    $ dotnet new console

Add required NuGet Packages:

    $ dotnet add package Google.Protobuf
    $ dotnet add package ServiceStack.GrpcClient
    
Download TodoWorld SSL Certificate used for its gRPC HTTP/2 Services:

    $ x get https://todoworld.servicestack.net/grpc.crt 

Add protoc generated TodoWorld DTOs and gRPC GrpcServiceClient:

    $ x proto-csharp https://todoworld.servicestack.net
    
Use protoc generated DTOs and  `GrpcServiceClient` to call TodoWorld gRPC Service:

### C# smart gRPC GrpcServicesClient Example

The smart client registers a ServiceStack Interceptor to enable the richer integration features in ServiceStack
Services as found in ServiceStack's Generic `GrpcServiceClient` above, including detailed structured Exception handling,
built-in JWT, Session, Credentials Auth support, 
[Automatically refreshing Access Tokens](https://docs.servicestack.net/jwt-authprovider#automatically-refreshing-access-tokens), etc.

This ServiceStack Interceptor can be registered using `GrpcServiceStack.Client()`  when creating the protoc `GrpcServicesClient`:

```csharp
using System;
using System.Security.Cryptography.X509Certificates;
using System.Threading.Tasks;
using ServiceStack;

namespace TodoWorld
{
    class Program
    {
        static async Task Main(string[] args)
        {
            var client = new GrpcServices.GrpcServicesClient(
                GrpcServiceStack.Client("https://todoworld.servicestack.net:50051", 
                    new X509Certificate2("grpc.crt"),
                    GrpcUtils.AllowSelfSignedCertificatesFrom("todoworld.servicestack.net")));

            var response = await client.GetHelloAsync(new Hello { Name = "gRPC C#" });

            Console.WriteLine(response.Result);
        }
    }
}
```

Override `Program.cs` with the above C# Example: 

    $ x mix todoworld-csharp-smart

Run example:

    $ dotnet run

### protoc-only generated Service Client

Alternatively clients can opt to use the vanilla protoc generated ServiceClient without any dependency to 
**ServiceStack.GrpcClient** which will fallback to gRPC's default behavior of basic error handling with any
auth headers needing to be populated manually.

Add required core package dependencies:

    $ dotnet add package Grpc.Core
    $ dotnet add package Grpc.Net.Client

### C# protoc gRPC insecure Example

```csharp
using System;
using System.Threading.Tasks;
using Grpc.Core;
using Grpc.Net.Client;

namespace TodoWorld
{
    class Program
    {
        static async Task Main(string[] args)
        {
            AppContext.SetSwitch("System.Net.Http.SocketsHttpHandler.Http2UnencryptedSupport", true);
            var client = new GrpcServices.GrpcServicesClient(
                GrpcChannel.ForAddress("http://todoworld.servicestack.net:5054"));

            var response = await client.GetHelloAsync(new Hello { Name = "gRPC C#" });

            Console.WriteLine(response.Result);
        }
    }
}
```

Override `Program.cs` with the above C# Example: 

    $ x mix todoworld-csharp

Run example:

    $ dotnet run

### C# protoc gRPC SSL Example

```csharp
using System;
using System.Linq;
using System.Net.Security;
using System.Security.Cryptography.X509Certificates;
using System.Threading.Tasks;
using Grpc.Core;
using Grpc.Net.Client;

namespace TodoWorld
{
    class Program
    {
        static async Task Main(string[] args)
        {
            var client = new GrpcServices.GrpcServicesClient(
                GrpcChannel.ForAddress("https://todoworld.servicestack.net:50051", new GrpcChannelOptions {
                    HttpClient = new System.Net.Http.HttpClient(new System.Net.Http.HttpClientHandler {
                        ClientCertificates = { new X509Certificate2("grpc.crt") },
                        ServerCertificateCustomValidationCallback = (req, cert, certChain, sslErrors) =>
                            cert.SubjectName.RawData.SequenceEqual(cert.IssuerName.RawData) && // self-signed
                            cert.GetNameInfo(X509NameType.DnsName, forIssuer:false) == "todoworld.servicestack.net" &&
                            (sslErrors & ~sslErrors.RemoteCertificateChainErrors) == sslErrors.None // only this
                    })
                }));

            var response = await client.GetHelloAsync(new Hello { Name = "gRPC C#" });

            Console.WriteLine(response.Result);
        }
    }
}
```

Override `Program.cs` with the above C# Example: 

    $ x mix todoworld-csharp-ssl

Run example:

    $ dotnet run

### C# Local Development gRPC SSL CRUD Example

```csharp
using System;
using System.Threading.Tasks;
using Grpc.Net.Client;
using TodoWorld;

namespace CSharp
{
    public class Program
    {
        static async Task Main(string[] args)
        {
            // Certificate registration not required when using trusted local development certificate  
            var client = new GrpcServices.GrpcServicesClient(GrpcChannel.ForAddress("https://localhost:5001"));
            await client.PostResetTodosAsync(new ResetTodos());

            //POST /todos
            var todo = (await client.PostCreateTodoAsync(new CreateTodo { Title = "ServiceStack" })).Result;
            Console.WriteLine($"new todo Id: {todo.Id}, Title: {todo.Title}");
            
            //GET /todos
            var all = await client.CallGetTodosAsync(new GetTodos());
            Console.WriteLine($"todos: {all.Results?.Count ?? 0}");

            //GET /todos/1
            todo = (await client.CallGetTodoAsync(new GetTodo { Id = todo.Id })).Result;
            Console.WriteLine($"get todo Id: {todo.Id}, Title: {todo.Title}");

            //GET /todos
            all = await client.CallGetTodosAsync(new GetTodos());
            Console.WriteLine($"todos: {all.Results?.Count ?? 0}");

            //PUT /todos/1
            await client.PutUpdateTodoAsync(new UpdateTodo { Id = todo.Id, Title = "gRPC" });

            //GET /todos/1
            todo = (await client.CallGetTodoAsync(new GetTodo { Id = todo.Id })).Result;
            Console.WriteLine($"updated todo Title: {todo.Title}");

            //DELETE /todos/1
            await client.CallDeleteTodoAsync(new DeleteTodo { Id = todo.Id });

            //GET /todos
            all = await client.CallGetTodosAsync(new GetTodos());
            Console.WriteLine($"todos: {all.Results?.Count ?? 0}");
        }
    }
}
```

Refer to [/src/clients/csharp](https://github.com/NetCoreApps/todo-world/tree/master/src/clients/csharp)
for a complete example project.
