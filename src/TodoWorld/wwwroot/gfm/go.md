
## Go Google protoc generated GrpcServiceClient Example

Install [x dotnet tool](https://docs.servicestack.net/dotnet-tool):
    
    $ dotnet tool install --global x 

Create new **TodoWorld** Go module:

    $ go mod init TodoWorld

Add protoc generated TodoWorld DTOs and gRPC GrpcServiceClient to `services/` folder:

    $ md services
    $ x proto-go https://todoworld.servicestack.net -out services

### Go protoc gRPC insecure Example

Create a new Go Console App in `client\main.go`:

```go
package main

import (
    context "context"
    "fmt"
    "log"

    "google.golang.org/grpc"

    pb "TodoWorld/services"
    "time"
)

func main() {
    conn, err := grpc.Dial("todoworld.servicestack.net:5054", grpc.WithInsecure())
    if err != nil {
        log.Fatalf("fail to dial: %v", err)
    }
    defer conn.Close()

    client := pb.NewGrpcServicesClient(conn)
    ctx, cancel := context.WithTimeout(context.Background(), time.Second)
    defer cancel()

    response, err := client.GetHello(ctx, &pb.Hello{Name: "gRPC Go"})
    if err != nil {
        log.Fatalf("GetHello: %v", err)
    }
    fmt.Println(response.Result)
}
```

Alternatively above Go example can be created with:

    $ md client
    $ x mix todoworld-go -out client

Run example:

    $ go run client\main.go

### Go protoc gRPC SSL Example

Download TodoWorld SSL Certificate used for its gRPC HTTP/2 Services:

    $ x get https://todoworld.servicestack.net/grpc.crt 

Use certificate when initializing `NewGrpcServicesClient`:

```go

package main

import (
    context "context"
    "fmt"
    "log"

    "google.golang.org/grpc"
    "google.golang.org/grpc/credentials"

    pb "TodoWorld/services"
    "time"
)

func main() {
    creds, err := credentials.NewClientTLSFromFile("grpc.crt", "")
    if err != nil {
        log.Fatalf("could not process the credentials: %v", err)
    }

    conn, err := grpc.Dial("todoworld.servicestack.net:50051", grpc.WithTransportCredentials(creds))
    if err != nil {
        log.Fatalf("fail to dial: %v", err)
    }
    defer conn.Close()

    client := pb.NewGrpcServicesClient(conn)
    ctx, cancel := context.WithTimeout(context.Background(), time.Second)
    defer cancel()

    response, err := client.GetHello(ctx, &pb.Hello{Name: "gRPC Go"})
    if err != nil {
        log.Fatalf("GetHello: %v", err)
    }
    fmt.Println(response.Result)
}
```

Override `client/main.go` with the above Go Example: 

    $ x mix todoworld-go-ssl -out client

Run example:

    $ go run client\main.go

### Go Local Development gRPC SSL CRUD Example

```go
package main

import (
    context "context"
    "fmt"
    "log"

    "google.golang.org/grpc"
    "google.golang.org/grpc/credentials"

    "time"
    pb "todoworld/services"
)

func main() {

    // Load the certificates from disk
    creds, err := credentials.NewClientTLSFromFile("dev.crt", "localhost:5001")
    if err != nil {
        log.Fatalf("could not process the credentials: %v", err)
    }

    conn, err := grpc.Dial(address, grpc.WithTransportCredentials(creds))
    if err != nil {
        log.Fatalf("fail to dial: %v", err)
    }
    defer conn.Close()

    client := pb.NewGrpcServicesClient(conn)
    ctx, cancel := context.WithTimeout(context.Background(), time.Second)
    defer cancel()


    _, err = client.PostResetTodos(ctx, &pb.ResetTodos{})
    if err != nil {
        log.Fatalf("PostResetTodos: %v", err)
    }

    fmt.Println("TODO EXAMPLE")

    //POST /todos
    r1, err := client.PostCreateTodo(ctx, &pb.CreateTodo{Title: "ServiceStack"})
    if err != nil {
        log.Fatalf("PostCreateTodo: %v", err)
    }
    todo := r1.Result
    fmt.Println("new todo Id:", todo.Id, "Title:", todo.Title)

    //GET /todos
    all, err := client.CallGetTodos(ctx, &pb.GetTodos{})
    if err != nil {
        log.Fatalf("CallGetTodos: %v", err)
    }
    fmt.Println("todos:", len(all.GetResults()))

    //GET /todos/1
    r2, err := client.CallGetTodo(ctx, &pb.GetTodo{Id: todo.Id})
    if err != nil {
        log.Fatalf("CallGetTodo: %v", err)
    }
    todo = r2.Result
    fmt.Println("get todo Id:", todo.Id, "Title:", todo.Title)

    //PUT /todos/1
    _, err = client.PutUpdateTodo(ctx, &pb.UpdateTodo{Id: todo.Id, Title: "gRPC"})
    if err != nil {
        log.Fatalf("PutUpdateTodo: %v", err)
    }

    //GET /todos/1
    r2, err = client.CallGetTodo(ctx, &pb.GetTodo{Id: todo.Id})
    if err != nil {
        log.Fatalf("CallGetTodo: %v", err)
    }
    todo = r2.Result
    fmt.Println("get todo Id:", todo.Id, "Title:", todo.Title)

    //DELETE /todos/1
    _, err = client.CallDeleteTodo(ctx, &pb.DeleteTodo{Id: todo.Id})
    if err != nil {
        log.Fatalf("CallDeleteTodo: %v", err)
    }

    //GET /todos
    all, err = client.CallGetTodos(ctx, &pb.GetTodos{})
    if err != nil {
        log.Fatalf("CallGetTodos: %v", err)
    }
    fmt.Println("todos:", len(all.GetResults()))
}
```

Refer to [/src/clients/go](https://github.com/NetCoreApps/todo-world/tree/master/src/clients/go)
for a complete example project.
