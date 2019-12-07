open System
open System.Collections.Generic
open System.Threading
open System.Threading.Tasks
open ServiceStack
open TodoWorld.ServiceModel
open FSharp.Control.Tasks.V2

let todo () = 
    let seqCount (c: List<Todo>) = if c <> null then c.Count else 0    
    task {
        let client = new GrpcServiceClient("https://localhost:5001")
        do! client.PostAsync(new ResetTodos())

        //GET /todos
        let! all = client.GetAsync(new GetTodos())
        printfn "todos: %i" (seqCount all.Results)
        
        //POST /todos
        let! t = client.PostAsync(new CreateTodo(Title = "ServiceStack"))
        let todo = t.Result;
        printfn "new todo Id: %i, Title: %s" todo.Id todo.Title

        //GET /todos/1
        let! t = client.GetAsync(new GetTodo(Id = todo.Id))
        let todo = t.Result;
        printfn "get todo Id: %i, Title: %s" todo.Id todo.Title

        //GET /todos
        let! all = client.GetAsync(new GetTodos())
        printfn "todos: %i" (seqCount all.Results)
        
        //PUT /todos/1
        do! client.PutAsync(new UpdateTodo(Id = todo.Id, Title = "gRPC"))

        //GET /todos/1
        let! t = client.GetAsync(new GetTodo(Id = todo.Id))
        let todo = t.Result;
        printfn "updated todo Title: %s" todo.Title

        //DELETE /todos/1
        do! client.DeleteAsync(new DeleteTodo(Id = todo.Id))

        //GET /todos
        let! all = client.GetAsync(new GetTodos())
        printfn "todos: %i" (seqCount all.Results)
    }

[<EntryPoint>]
let main argv =
    todo().Wait()
    0 // return an integer exit code