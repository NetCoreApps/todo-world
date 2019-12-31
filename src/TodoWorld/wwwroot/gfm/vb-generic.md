
## VB.NET Generic GrpcServiceClient Example

Install [x dotnet tool](https://docs.servicestack.net/web-tool):
    
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
