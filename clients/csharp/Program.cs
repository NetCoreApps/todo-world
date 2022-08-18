using System;
using System.Threading.Tasks;
using Grpc.Net.Client;
using TodoWorld;

namespace CSharp
{
    public class Program
    {
        static async Task Main(string[] args)
        {
            var client = new GrpcServices.GrpcServicesClient(GrpcChannel.ForAddress("https://localhost:5001"));
            await client.PostResetTodosAsync(new ResetTodos());

            //POST /todos
            var todo = (await client.PostCreateTodoAsync(new CreateTodo { Title = "ServiceStack" })).Result;
            Console.WriteLine($"new todo Id: {todo.Id}, Title: {todo.Title}");
            
            //GET /todos
            var all = await client.CallGetTodosAsync(new GetTodos());
            Console.WriteLine($"todos: {all.Results?.Count ?? 0}");

            //GET /todos/1
            todo = (await client.CallGetTodoAsync(new GetTodo { Id = todo.Id })).Result;
            Console.WriteLine($"get todo Id: {todo.Id}, Title: {todo.Title}");

            //GET /todos
            all = await client.CallGetTodosAsync(new GetTodos());
            Console.WriteLine($"todos: {all.Results?.Count ?? 0}");

            //PUT /todos/1
            await client.PutUpdateTodoAsync(new UpdateTodo { Id = todo.Id, Title = "gRPC" });

            //GET /todos/1
            todo = (await client.CallGetTodoAsync(new GetTodo { Id = todo.Id })).Result;
            Console.WriteLine($"updated todo Title: {todo.Title}");

            //DELETE /todos/1
            await client.CallDeleteTodoAsync(new DeleteTodo { Id = todo.Id });

            //GET /todos
            all = await client.CallGetTodosAsync(new GetTodos());
            Console.WriteLine($"todos: {all.Results?.Count ?? 0}");
        }
    }
}