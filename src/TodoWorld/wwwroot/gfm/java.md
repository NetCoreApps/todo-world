
## Java Google protoc generated GrpcServiceClient Example

Install [x dotnet tool](https://docs.servicestack.net/web-tool):
    
    $ dotnet tool install --global x 

Create a new **Gradle** Java Console App (example uses [IntelliJ IDEA Community](https://www.jetbrains.com/idea/download/)):

![](https://raw.githubusercontent.com/NetCoreApps/todo-world/master/src/TodoWorld/wwwroot/assets/img/java/create-01.png)

Update **build.gradle** with required dependencies:

```gradle
plugins {
    id 'java'
    id 'com.google.protobuf' version '0.8.8'
    id 'idea'
}

group 'org.example'
version '1.0-SNAPSHOT'

sourceCompatibility = 1.8

repositories {
    mavenCentral()
}

def grpcVersion = '1.25.0'
def nettyTcNativeVersion = '2.0.26.Final'
def protobufVersion = '3.11.0'

dependencies {
    implementation "io.grpc:grpc-netty:${grpcVersion}"
    implementation "io.grpc:grpc-protobuf:${grpcVersion}"
    implementation "io.grpc:grpc-stub:${grpcVersion}"
    compileOnly "javax.annotation:javax.annotation-api:1.2"

    implementation "com.google.protobuf:protobuf-java-util:${protobufVersion}"

    runtimeOnly "io.netty:netty-tcnative-boringssl-static:${nettyTcNativeVersion}"

    testImplementation "io.grpc:grpc-testing:${grpcVersion}"
    testImplementation "junit:junit:4.12"
    testImplementation "org.mockito:mockito-core:2.28.2"
}

dependencies {
    testCompile group: 'junit', name: 'junit', version: '4.12'
}
```

Add protoc generated TodoWorld DTOs and gRPC GrpcServicesBlockingStub:

    $ cd src\main\java
    $ x proto-java https://todoworld.servicestack.net
    
Use protoc generated DTOs and `GrpcServiceClient` to call TodoWorld gRPC Service:

### Java protoc gRPC insecure Example

```java
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Program {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(
                "todoworld.servicestack.net", 5054).usePlaintext().build();

        GrpcServicesGrpc.GrpcServicesBlockingStub client = GrpcServicesGrpc.newBlockingStub(channel);

        Services.Hello request = Services.Hello.newBuilder().setName("gRPC Java").build();
        String result = client.getHello(request).getResult();

        System.out.println(result);
    }
}
```

Create `Program.java` from the above Java Example: 

    $ x mix todoworld-java

Run example with `Shift+F10`:

![](https://raw.githubusercontent.com/NetCoreApps/todo-world/master/src/TodoWorld/wwwroot/assets/img/java/run-insecure.png)

### Java protoc gRPC SSL Example

Download TodoWorld SSL Certificate used for its gRPC HTTP/2 Services into **resources** folder:

    $ x get https://todoworld.servicestack.net/grpc.crt -out ../resources 

Use certificate when initializing gRPC Channel:

```java
import io.grpc.ManagedChannel;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import java.io.File;

public class Program {
    public static void main(String[] args) throws javax.net.ssl.SSLException {
        ManagedChannel channel = NettyChannelBuilder.forAddress("todoworld.servicestack.net", 50051)
            .sslContext(GrpcSslContexts.forClient()
                .trustManager(new File(Program.class.getClassLoader().getResource("grpc.crt").getFile()))
                .build())
            .build();

        GrpcServicesGrpc.GrpcServicesBlockingStub client = GrpcServicesGrpc.newBlockingStub(channel);

        Services.Hello request = Services.Hello.newBuilder().setName("gRPC Java").build();
        String result = client.getHello(request).getResult();

        System.out.println(result);
    }
}
```

Override `Program.java` with the above Java Example: 

    $ x mix todoworld-java-ssl

Run example with `Shift+F10`:

![](https://raw.githubusercontent.com/NetCoreApps/todo-world/master/src/TodoWorld/wwwroot/assets/img/java/run-ssl.png)

### Java Local Development gRPC SSL CRUD Example

```java
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;

import javax.net.ssl.SSLException;

import static java.lang.System.out;

class Program {
    public static void main(String[] args) throws SSLException {

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
```

Refer to [/src/clients/java](https://github.com/NetCoreApps/todo-world/tree/master/src/clients/java)
for a complete example project.
