
## VB.NET Generic GrpcServiceClient Example

Install [x dotnet tool](https://docs.servicestack.net/dotnet-tool):
    
    $ dotnet tool install --global x 

Create a new VB.NET App:

    $ dotnet new console -lang vb

Add [ServiceStack.GrpcClient](https://www.nuget.org/packages/ServiceStack.GrpcClient) NuGet Package:

    $ dotnet add package ServiceStack.GrpcClient

Add TodoWorld DTOs:

    $ x vb https://todoworld.servicestack.net
    
Use TodoWorld DTOs with generic `GrpcServiceClient` to call TodoWorld gRPC Service:

### VB.NET gRPC insecure Example

```vb
Imports System
Imports System.Collections.Generic
Imports System.Threading.Tasks
Imports ServiceStack
Imports TodoWorld.ServiceModel

Module Program

    Async Function Todo() As Task
        ProtoBuf.Grpc.Client.GrpcClientFactory.AllowUnencryptedHttp2 = true
        Dim client = new GrpcServiceClient("http://todoworld.servicestack.net:5054")
        
        Dim response = Await client.GetAsync(New Hello With { .Name = "gRPC VB.NET" })

        Console.WriteLine(response.Result)
    End Function

    Sub Main(args As String())
        Task.WaitAll(Todo())
    End Sub

End Module
```

Override `Program.vb` with the above VB.NET Example: 

    $ x mix todoworld-vb

Run example:

    $ dotnet run

### VB.NET gRPC SSL Example

```vb
Imports System
Imports System.Collections.Generic
Imports System.Threading.Tasks
Imports System.Security.Cryptography.X509Certificates
Imports ServiceStack
Imports TodoWorld.ServiceModel

Module Program

    Async Function Todo() As Task
        Dim client = new GrpcServiceClient("https://todoworld.servicestack.net:50051", 
                new X509Certificate2("https://todoworld.servicestack.net/grpc.crt".GetBytesFromUrl()), 
                GrpcUtils.AllowSelfSignedCertificatesFrom("todoworld.servicestack.net"))
        
        Dim response = Await client.GetAsync(New Hello With { .Name = "gRPC VB.NET" })

        Console.WriteLine(response.Result)
    End Function

    Sub Main(args As String())
        Task.WaitAll(Todo())
    End Sub

End Module
```

Override `Program.vb` with the above VB.NET Example: 

    $ x mix todoworld-vb-ssl

Run example:

    $ dotnet run

### VB.NET Local Development gRPC SSL CRUD Example

```vb
Imports System
Imports System.Collections.Generic
Imports System.Threading.Tasks
Imports ServiceStack
Imports TodoWorld.ServiceModel
Imports TodoWorld.ServiceModel.Types

Module Program
    Function SeqCount(c As List(Of Todo)) As Integer
        Return IF(c Is Nothing, 0, c.Count)
    End Function
    
    Async Function TodoExample() As Task
        ' Certificate registration not required when using trusted local development certificate  
        Dim client = new GrpcServiceClient("https://localhost:5001")
        Await client.PostAsync(New ResetTodos())

        'GET /todos
        Dim all = Await client.GetAsync(New GetTodos())
        Console.WriteLine($"todos: {SeqCount(all.Results)}")

        'POST /todos
        Dim todo As Todo = (Await client.PostAsync(New CreateTodo With { .Title = "ServiceStack" })).Result
        Console.WriteLine($"new todo Id: {todo.Id}, Title: {todo.Title}")
            
        'GET /todos/1
        todo = (Await client.GetAsync(New GetTodo With { .Id = todo.Id })).Result
        Console.WriteLine($"get todo Id: {todo.Id}, Title: {todo.Title}")

        'GET /todos
        all = await client.GetAsync(new GetTodos())
        Console.WriteLine($"todos: {SeqCount(all.Results)}")

        'PUT /todos/1
        Await client.PutAsync(New UpdateTodo With { .Id = todo.Id, .Title = "gRPC" })

        'GET /todos/1
        todo = (Await client.GetAsync(New GetTodo With { .Id = todo.Id })).Result
        Console.WriteLine("updated todo Title: {todo.Title}")

        'DELETE /todos/1
        Await client.DeleteAsync(new DeleteTodo With { .Id = todo.Id })

        'GET /todos
        all = Await client.GetAsync(new GetTodos())
        Console.WriteLine($"todos: {SeqCount(all.Results)}")
        
    End Function
    
    Sub Main(args As String())
        Task.WaitAll(TodoExample())
    End Sub
    
End Module
```

Refer to [/src/clients/vb-generic](https://github.com/NetCoreApps/todo-world/tree/master/src/clients/vb-generic)
for a complete example project.