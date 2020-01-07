
## Swift Google protoc generated GrpcServiceClient Example

Install [x dotnet tool](https://docs.servicestack.net/dotnet-tool):
    
    $ dotnet tool install --global x 

Create a new Swift Console App:

    $ swift package init --type executable

Add `grpc-swift` Swift Package in `Package.swift` and **"GRPC"** dependency to each target:

```swift
import PackageDescription

let package = Package(
    name: "TodoWorld",
    dependencies: [
        // Dependencies declare other packages that this package depends on.
        // .package(url: /* package url */, from: "1.0.0"),
        .package(url: "https://github.com/grpc/grpc-swift.git", from: "1.0.0-alpha.8")
    ],
    targets: [
        // Targets are the basic building blocks of a package. A target can define a module or a test suite.
        // Targets can depend on other targets in this package, and on products in packages which this package depends on.
        .target(
            name: "TodoWorld",
            dependencies: ["GRPC"]),
        .testTarget(
            name: "TodoWorldTests",
            dependencies: ["TodoWorld","GRPC"]),
    ]
)
```
    
Add protoc generated TodoWorld DTOs and gRPC GrpcServiceClient:

    $ cd Sources/TodoWorld
    $ x proto-swift https://todoworld.servicestack.net
    
Use protoc generated DTOs and `GrpcServiceClient` to call TodoWorld gRPC Service:

### Swift protoc gRPC insecure Example

```swift
import Foundation
import GRPC
import NIO
import NIOSSL

do {

    let configuration = ClientConnection.Configuration(
        target: .hostAndPort("todoworld.servicestack.net", 5054),
        eventLoopGroup: MultiThreadedEventLoopGroup(numberOfThreads: 1)
    )

    let client = GrpcServicesServiceClient(connection: ClientConnection(configuration: configuration))

    var request = Hello()
    request.name = "gRPC Swift"
    let response = try client.getHello(request).response.wait().result
    print(response)

} catch {
    print("ERROR\n\(error)")
}
```

Override `main.swift` with the above Swift Example: 

    $ x mix todoworld-swift

Run example:

    $ swift run

### Swift protoc gRPC SSL Example

Download TodoWorld SSL Certificate used for its gRPC HTTP/2 Services:

    $ x get https://todoworld.servicestack.net/grpc.crt 

Use certificate when initializing ClientConnection.Configuration:

```swift
import Foundation
import GRPC
import NIO
import NIOSSL

do {

    let configuration = ClientConnection.Configuration(
        target: .hostAndPort("todoworld.servicestack.net", 50051),
        eventLoopGroup: MultiThreadedEventLoopGroup(numberOfThreads: 1),
        tls: .init(certificateChain: try NIOSSLCertificate.fromPEMFile("grpc.crt").map { .certificate($0) }, 
                   certificateVerification: .none) //TODO enable SSL verification
    )

    let client = GrpcServicesServiceClient(connection: ClientConnection(configuration: configuration))

    var request = Hello()
    request.name = "gRPC Swift"
    let response = try client.getHello(request).response.wait().result
    print(response)

} catch {
    print("ERROR\n\(error)")
}
```

Override `main.swift` with the above Swift Example: 

    $ x mix todoworld-swift-ssl

Run example:

    $ swift run

### Swift Local Development gRPC SSL CRUD Example

```swift
import Foundation
import GRPC
import NIO
import NIOSSL

do {

    let configuration = ClientConnection.Configuration(
        target: .hostAndPort("localhost", 5001),
        eventLoopGroup: MultiThreadedEventLoopGroup(numberOfThreads: 1),
        tls: .init(certificateChain: try NIOSSLCertificate.fromPEMFile("dev.crt").map { .certificate($0) })
    )

    let client = GrpcServicesServiceClient(connection: ClientConnection(configuration: configuration))

    print("TODO EXAMPLE")

    _ = try client.postResetTodos(ResetTodos()).response.wait()

    //POST /todos
    var createTodo = CreateTodo()
    createTodo.title = "ServiceStack"
    var todo = try client.postCreateTodo(createTodo).response.wait().result
    print("new todo Id: \(todo.id), Title: \(todo.title)")

    //GET /todos
    var all = try client.callGetTodos(GetTodos()).response.wait()
    print("todos: \(all.results.count)")

    //GET /todos/1
    var getTodo = GetTodo()
    getTodo.id = todo.id
    todo = try client.callGetTodo(getTodo).response.wait().result
    print("get todo Id: \(todo.id), Title: \(todo.title)")

    //PUT /todos/1
    var updateTodo = UpdateTodo()
    updateTodo.id = todo.id
    updateTodo.title = "gRPC"
    _ = try client.putUpdateTodo(updateTodo).response.wait()

    //GET /todos/1
    todo = try client.callGetTodo(getTodo).response.wait().result
    print("get todo Id: \(todo.id), Title: \(todo.title)")

    //DELETE /todos/1
    var deleteTodo = DeleteTodo()
    deleteTodo.id = todo.id
    _ = try client.callDeleteTodo(deleteTodo).response.wait()

    //GET /todos
    all = try client.callGetTodos(GetTodos()).response.wait()
    print("todos: \(all.results.count)")

} catch {
    print("ERROR\n\(error)")
}
```

Refer to [/src/clients/swift](https://github.com/NetCoreApps/todo-world/tree/master/src/clients/swift)
for a complete example project.
