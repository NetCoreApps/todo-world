"""Python gRPC TodoWorld Example"""

import grpc

import services_pb2
import services_pb2_grpc

def run():
    with open('../certs/prod.crt', 'rb') as f:
        credentials = grpc.ssl_channel_credentials(f.read())
    with grpc.secure_channel('todoworld.servicestack.net:50051', credentials) as channel:

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
