Imports System
Imports System.Collections.Generic
Imports System.Threading.Tasks
Imports ServiceStack
Imports TodoWorld.ServiceModel
Imports TodoWorld.ServiceModel.Types

Module Program
    Function SeqCount(c As List(Of Todo)) As Integer
        Return IF(c Is Nothing, 0, c.Count)
    End Function
    
    Async Function TodoExample() As Task
        Dim client = new GrpcServiceClient("https://localhost:5001")
        Await client.PostAsync(New ResetTodos())

        'GET /todos
        Dim all = Await client.GetAsync(New GetTodos())
        Console.WriteLine($"todos: {SeqCount(all.Results)}")

        'POST /todos
        Dim todo As Todo = (Await client.PostAsync(New CreateTodo With { .Title = "ServiceStack" })).Result
        Console.WriteLine($"new todo Id: {todo.Id}, Title: {todo.Title}")
            
        'GET /todos/1
        todo = (Await client.GetAsync(New GetTodo With { .Id = todo.Id })).Result
        Console.WriteLine($"get todo Id: {todo.Id}, Title: {todo.Title}")

        'GET /todos
        all = await client.GetAsync(new GetTodos())
        Console.WriteLine($"todos: {SeqCount(all.Results)}")

        'PUT /todos/1
        Await client.PutAsync(New UpdateTodo With { .Id = todo.Id, .Title = "gRPC" })

        'GET /todos/1
        todo = (Await client.GetAsync(New GetTodo With { .Id = todo.Id })).Result
        Console.WriteLine("updated todo Title: {todo.Title}")

        'DELETE /todos/1
        Await client.DeleteAsync(new DeleteTodo With { .Id = todo.Id })

        'GET /todos
        all = Await client.GetAsync(new GetTodos())
        Console.WriteLine($"todos: {SeqCount(all.Results)}")
        
    End Function
    
    Sub Main(args As String())
        Task.WaitAll(TodoExample())
    End Sub
    
End Module
