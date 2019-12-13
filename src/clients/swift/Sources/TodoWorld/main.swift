import Foundation
import GRPC
import NIO
import NIOSSL

do {

    let configuration = ClientConnection.Configuration(
        target: .hostAndPort("localhost", 5000),
        eventLoopGroup: MultiThreadedEventLoopGroup(numberOfThreads: 1)
        //tls: .init(certificateChain: try NIOSSLCertificate.fromPEMFile("../cert/localhost.cer").map { .certificate($0) })
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
