using System.Collections.Generic;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;
using ServiceStack;
using TodoWorld.ServiceModel;
using TodoWorld.ServiceModel.Types;

namespace TodoWorld.ServiceInterface
{
    public class TodoServices : Service
    {
        private static long Counter = 0;
        public static List<Todo> Todos { get; } = new List<Todo>();
        
        public IServerEvents ServerEvents { get; set; }
        
        public object Get(GetTodo request) => new GetTodoResponse { Result = Todos.FirstOrDefault(x => x.Id == request.Id) };

        public object Get(GetTodos request) => new GetTodosResponse { Results = Todos };

        public async Task<object> Post(CreateTodo request)
        {
            var todo = request.ConvertTo<Todo>();
            todo.Id = Interlocked.Increment(ref Counter);
            Todos.Add(todo);
            await ServerEvents.NotifyChannelAsync("todos", "todos.create", todo);
            return new CreateTodoResponse { Result = todo };
        }

        public Task Put(UpdateTodo request)
        {
            var todo = Todos.FirstOrDefault(x => x.Id == request.Id)
                ?? throw HttpError.NotFound($"Todo with Id '{request.Id}' does not exit");
            todo.PopulateWith(request);
            return ServerEvents.NotifyChannelAsync("todos", "todos.update", todo);
        }

        public Task Delete(DeleteTodo request)
        {
            Todos.RemoveAll(x => x.Id == request.Id);
            return ServerEvents.NotifyChannelAsync("todos", "todos.delete", request.Id);
        }

        public Task Delete(DeleteTodos request)
        {
            if (request.Ids.IsEmpty())
                return Task.CompletedTask;
            
            Todos.RemoveAll(x => request.Ids.Contains(x.Id));
            var tasks = request.Ids.Map(x => ServerEvents.NotifyChannelAsync("todos", "todos.delete", x));
            return Task.WhenAll(tasks);
        }

        public void Post(ResetTodos request)
        {
            Counter = 0;
            Todos.Clear();
        }
    }
}
