
## F# Generic GrpcServiceClient Example

Install [x dotnet tool](https://docs.servicestack.net/dotnet-tool):
    
    $ dotnet tool install --global x 

Create a new F# App:

    $ dotnet new console -lang f#

Add [ServiceStack.GrpcClient](https://www.nuget.org/packages/ServiceStack.GrpcClient) NuGet Package:

    $ dotnet add package ServiceStack.GrpcClient

Add [TaskBuilder.fs](https://www.nuget.org/packages/TaskBuilder.fs) NuGet Package

    $ dotnet add package TaskBuilder.fs

Add TodoWorld DTOs:

    $ x fsharp https://todoworld.servicestack.net

Register `dto.fs` source file to `*.fsproj`:

```xml
<ItemGroup>
    <Compile Include="dtos.fs"/>
    <Compile Include="Program.fs"/>
</ItemGroup>
```
    
Use TodoWorld DTOs with generic `GrpcServiceClient` to call TodoWorld gRPC Service:

### F# gRPC insecure Example

```fs
open System
open System.Threading
open System.Threading.Tasks
open ServiceStack
open TodoWorld.ServiceModel
open FSharp.Control.Tasks.V2

let todo () = 
    task {
        ProtoBuf.Grpc.Client.GrpcClientFactory.AllowUnencryptedHttp2 = true
        let client = new GrpcServiceClient("http://todoworld.servicestack.net:5054")
        
        let! response = client.GetAsync(new Hello(Name = "gRPC F#"))
        printfn "%s" response.Result
    }

[<EntryPoint>]
let main argv =
    todo().Wait()
    0
```

Override `Program.fs` with the above F# Example: 

    $ x mix todoworld-fs

Run example:

    $ dotnet run

### F# gRPC SSL Example

```fs
open System
open System.Threading
open System.Threading.Tasks
open System.Security.Cryptography.X509Certificates
open ServiceStack
open TodoWorld.ServiceModel
open FSharp.Control.Tasks.V2

let todo () = 
    task {
        let client = new GrpcServiceClient("https://todoworld.servicestack.net:50051", 
                new X509Certificate2("https://todoworld.servicestack.net/grpc.crt".GetBytesFromUrl()), 
                GrpcUtils.AllowSelfSignedCertificatesFrom("todoworld.servicestack.net"))
        
        let! response = client.GetAsync(new Hello(Name = "gRPC F#"))
        printfn "%s" response.Result
    }

[<EntryPoint>]
let main argv =
    todo().Wait()
    0
```

Override `Program.fs` with the above F# Example: 

    $ x mix todoworld-fs-ssl

Run example:

    $ dotnet run

### F# Local Development gRPC SSL CRUD Example

```fsharp

open System
open System.Collections.Generic
open System.Threading
open System.Threading.Tasks
open ServiceStack
open TodoWorld.ServiceModel
open FSharp.Control.Tasks.V2

let todo () = 
    let seqCount (c: List<Todo>) = if c <> null then c.Count else 0    
    task {
        // Certificate registration not required when using trusted local development certificate  
        let client = new GrpcServiceClient("https://localhost:5001")
        do! client.PostAsync(new ResetTodos())

        //POST /todos
        let! t = client.PostAsync(new CreateTodo(Title = "ServiceStack"))
        let todo = t.Result;
        printfn "new todo Id: %i, Title: %s" todo.Id todo.Title

        //GET /todos
        let! all = client.GetAsync(new GetTodos())
        printfn "todos: %i" (seqCount all.Results)
        
        //GET /todos/1
        let! t = client.GetAsync(new GetTodo(Id = todo.Id))
        let todo = t.Result;
        printfn "get todo Id: %i, Title: %s" todo.Id todo.Title

        //GET /todos
        let! all = client.GetAsync(new GetTodos())
        printfn "todos: %i" (seqCount all.Results)
        
        //PUT /todos/1
        do! client.PutAsync(new UpdateTodo(Id = todo.Id, Title = "gRPC"))

        //GET /todos/1
        let! t = client.GetAsync(new GetTodo(Id = todo.Id))
        let todo = t.Result;
        printfn "updated todo Title: %s" todo.Title

        //DELETE /todos/1
        do! client.DeleteAsync(new DeleteTodo(Id = todo.Id))

        //GET /todos
        let! all = client.GetAsync(new GetTodos())
        printfn "todos: %i" (seqCount all.Results)
    }

[<EntryPoint>]
let main argv =
    todo().Wait()
    0
```

Refer to [/src/clients/fsharp-generic](https://github.com/NetCoreApps/todo-world/tree/master/src/clients/fsharp-generic)
for a complete example project.