import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;

import javax.net.ssl.SSLException;

import static java.lang.System.out;

class Program {
    public static void main(String[] args) throws SSLException {

//        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5001)
//                .useTransportSecurity().build();

        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 5001)
                .sslContext(GrpcSslContexts.forClient()
                .trustManager(InsecureTrustManagerFactory.INSTANCE) // allow localhost self-signed certificates
                .build())
            .build();

        GrpcServicesGrpc.GrpcServicesBlockingStub client = GrpcServicesGrpc.newBlockingStub(channel);

        out.println("TODO EXAMPLE");
        client.postResetTodos(Services.ResetTodos.newBuilder().build());

        //POST /todos
        Services.Todo todo = client.postCreateTodo(Services.CreateTodo.newBuilder().setTitle("ServiceStack").build()).getResult();
        out.println("new todo Id: " + todo.getId() + ", Title: " + todo.getTitle());

        //GET /todos
        Services.GetTodosResponse all = client.callGetTodos(Services.GetTodos.newBuilder().build());
        out.println("todos: " + all.getResultsCount());

        //GET /todos/1
        todo = (client.callGetTodo(Services.GetTodo.newBuilder().setId(todo.getId()).build())).getResult();
        out.println("get todo Id: " + todo.getId() + ", Title: " + todo.getTitle());

        //PUT /todos/1
        client.putUpdateTodo(Services.UpdateTodo.newBuilder().setId(todo.getId()).setTitle("gRPC").build());

        //GET /todos/1
        todo = (client.callGetTodo(Services.GetTodo.newBuilder().setId(todo.getId()).build())).getResult();
        out.println("get todo Id: " + todo.getId() + ", Title: " + todo.getTitle());

        //DELETE /todos/1
        client.callDeleteTodo(Services.DeleteTodo.newBuilder().setId(todo.getId()).build());

        //GET /todos
        all = client.callGetTodos(Services.GetTodos.newBuilder().build());
        out.println("todos: " + all.getResultsCount());
    }
}