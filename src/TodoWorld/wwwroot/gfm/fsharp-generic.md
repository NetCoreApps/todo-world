
## F# Generic GrpcServiceClient Example

Install [x dotnet tool](https://docs.servicestack.net/web-tool):
    
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
