
## Python Google protoc generated GrpcServicesStub Client Example

Install [x dotnet tool](https://docs.servicestack.net/web-tool):
    
    $ dotnet tool install --global x 

Install [grpcio-tools](https://pypi.org/project/grpcio-tools/):

    $ pip install grpcio-tools

Add protoc generated TodoWorld DTOs and gRPC Service Client:

    $ x proto-python https://todoworld.servicestack.net

### Python protoc gRPC insecure Example

Use protoc generated DTOs and `GrpcServicesStub` to call TodoWorld gRPC Service in `main.py`:

```python
import grpc
import services_pb2
import services_pb2_grpc

def run():
    with grpc.insecure_channel('todoworld.servicestack.net:5054') as channel:

        client = services_pb2_grpc.GrpcServicesStub(channel)
        response = client.GetHello(services_pb2.Hello(Name="gRPC Python"))
        print(response.Result)

if __name__ == '__main__':
    run()
```

Create `main.py` with the above Python Example: 

    $ x mix todoworld-python

Run example:

    $ python main.py

### Python protoc gRPC SSL Example

Download TodoWorld SSL Certificate used for its gRPC HTTP/2 Services:

    $ x get https://todoworld.servicestack.net/grpc.crt 

Use certificate when initializing `GrpcServicesStub`:

```python
import grpc
import services_pb2
import services_pb2_grpc

def run():
    with open('grpc.crt', 'rb') as f:
        credentials = grpc.ssl_channel_credentials(f.read())
    with grpc.secure_channel('todoworld.servicestack.net:50051', credentials) as channel:

        client = services_pb2_grpc.GrpcServicesStub(channel)
        response = client.GetHello(services_pb2.Hello(Name="gRPC Python"))
        print(response.Result)

if __name__ == '__main__':
    run()
```

Override `main.py` with the above Python Example: 

    $ x mix todoworld-python-ssl

Run example:

    $ python main.py

### Python Local Development gRPC SSL CRUD Example

```python
import grpc
import services_pb2
import services_pb2_grpc

def run():

    with open('dev.crt', 'rb') as f:
        cer = f.read()
    credentials = grpc.ssl_channel_credentials(cer)
    with grpc.secure_channel('localhost:5001', credentials) as channel:

        client = services_pb2_grpc.GrpcServicesStub(channel)
        client.PostResetTodos(services_pb2.ResetTodos())

        print("TODO EXAMPLE")

        # POST /todos
        todo = client.PostCreateTodo(services_pb2.CreateTodo(Title="ServiceStack")).Result
        print(f'new todo Id: {todo.Id}, Title: {todo.Title}')

        # GET /todos
        all = client.CallGetTodos(services_pb2.GetTodos())
        print(f'todos: {len(all.Results)}')

        # GET /todos/1
        todo = (client.CallGetTodo(services_pb2.GetTodo(Id=todo.Id))).Result
        print(f'get todo Id: {todo.Id}, Title: {todo.Title}')

        # PUT /todos/1
        client.PutUpdateTodo(services_pb2.UpdateTodo(Id=todo.Id, Title='gRPC'))

        # GET /todos/1
        todo = (client.CallGetTodo(services_pb2.GetTodo(Id=todo.Id))).Result
        print(f'get todo Id: {todo.Id}, Title: {todo.Title}')

        # DELETE /todos/1
        client.CallDeleteTodo(services_pb2.DeleteTodo(Id=todo.Id))

        # GET /todos
        all = client.CallGetTodos(services_pb2.GetTodos())
        print(f'todos: {len(all.Results)}')

if __name__ == '__main__':
    run()
```

Refer to [/src/clients/python](https://github.com/NetCoreApps/todo-world/tree/master/src/clients/python)
for a complete example project.
