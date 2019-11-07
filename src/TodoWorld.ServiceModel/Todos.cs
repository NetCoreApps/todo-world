using System.Collections.Generic;
using System.Runtime.Serialization;
using ServiceStack;
using TodoWorld.ServiceModel.Types;

namespace TodoWorld.ServiceModel
{
    [Route("/todos", "GET")]
    [DataContract]
    public class GetTodos : IReturn<GetTodosResponse> {}
    [DataContract]
    public class GetTodosResponse
    {
        [DataMember(Order = 1)]
        public List<Todo> Results { get; set; }
        [DataMember(Order = 2)]
        public ResponseStatus ResponseStatus { get; set; }
    }

    [Route("/todos/{Id}", "GET")]
    [DataContract]
    public class GetTodo : IReturn<GetTodoResponse>
    {
        [DataMember(Order = 1)]
        public long Id { get; set; }
    }
    [DataContract]
    public class GetTodoResponse
    {
        [DataMember(Order = 1)]
        public Todo Result { get; set; }
        [DataMember(Order = 2)]
        public ResponseStatus ResponseStatus { get; set; }
    }

    [Route("/todos", "POST")]
    [DataContract]
    public class CreateTodo : IReturn<CreateTodoResponse>
    {
        [DataMember(Order = 1)]
        public string Title { get; set; }

        [DataMember(Order = 2)]
        public int Order { get; set; }
    }
    [DataContract]
    public class CreateTodoResponse
    {
        [DataMember(Order = 1)]
        public Todo Result { get; set; }
        [DataMember(Order = 2)]
        public ResponseStatus ResponseStatus { get; set; }
    }

    [Route("/todos/{Id}", "PUT")]
    [DataContract]
    public class UpdateTodo : IReturnVoid
    {
        [DataMember(Order = 1)]
        public long Id { get; set; }

        [DataMember(Order = 2)]
        public string Title { get; set; }

        [DataMember(Order = 3)]
        public int Order { get; set; }

        [DataMember(Order = 4)]
        public bool Completed { get; set; }
    }

    [Route("/todos/{Id}", "DELETE")]
    [DataContract]
    public class DeleteTodo : IReturnVoid
    {
        [DataMember(Order = 1)]
        public long Id { get; set; }
    }

    [Route("/todos", "DELETE")]
    [DataContract]
    public class DeleteTodos : IReturnVoid
    {
        [DataMember(Order = 1)]
        public List<long> Ids { get; set; }
    }
    
    [Route("/todos/reset", "POST")]
    [DataContract]
    public class ResetTodos : IReturnVoid {}
}