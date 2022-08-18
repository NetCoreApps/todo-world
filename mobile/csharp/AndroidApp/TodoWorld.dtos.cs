/* Options:
Date: 2020-01-21 04:38:54
Version: 5.80
Tip: To override a DTO option, remove "//" prefix before updating
BaseUrl: https://todoworld.servicestack.net

//GlobalNamespace: 
//MakePartial: True
//MakeVirtual: True
//MakeInternal: False
//MakeDataContractsExtensible: False
//AddReturnMarker: True
//AddDescriptionAsComments: True
//AddDataContractAttributes: False
//AddIndexesToDataMembers: False
//AddGeneratedCodeAttributes: False
//AddResponseStatus: False
//AddImplicitVersion: 
//InitializeCollections: True
//ExportValueTypes: False
//IncludeTypes: 
//ExcludeTypes: 
//AddNamespaces: 
//AddDefaultXmlNamespace: http://schemas.servicestack.net/types
*/

using System;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using ServiceStack;
using ServiceStack.DataAnnotations;
using TodoWorld.ServiceModel.Types;
using TodoWorld.ServiceModel;


namespace TodoWorld.ServiceModel
{

    [Route("/todos", "POST")]
    [DataContract]
    public partial class CreateTodo
        : IReturn<CreateTodoResponse>
    {
        [DataMember(Order=1)]
        public virtual string Title { get; set; }

        [DataMember(Order=2)]
        public virtual int Order { get; set; }
    }

    [DataContract]
    public partial class CreateTodoResponse
    {
        [DataMember(Order=1)]
        public virtual Todo Result { get; set; }

        [DataMember(Order=2)]
        public virtual ResponseStatus ResponseStatus { get; set; }
    }

    [Route("/todos/{Id}", "DELETE")]
    [DataContract]
    public partial class DeleteTodo
        : IReturnVoid
    {
        [DataMember(Order=1)]
        public virtual long Id { get; set; }
    }

    [Route("/todos", "DELETE")]
    [DataContract]
    public partial class DeleteTodos
        : IReturnVoid
    {
        public DeleteTodos()
        {
            Ids = new List<long>{};
        }

        [DataMember(Order=1)]
        public virtual List<long> Ids { get; set; }
    }

    [Route("/todos/{Id}", "GET")]
    [DataContract]
    public partial class GetTodo
        : IReturn<GetTodoResponse>
    {
        [DataMember(Order=1)]
        public virtual long Id { get; set; }
    }

    [DataContract]
    public partial class GetTodoResponse
    {
        [DataMember(Order=1)]
        public virtual Todo Result { get; set; }

        [DataMember(Order=2)]
        public virtual ResponseStatus ResponseStatus { get; set; }
    }

    [Route("/todos", "GET")]
    [DataContract]
    public partial class GetTodos
        : IReturn<GetTodosResponse>
    {
    }

    [DataContract]
    public partial class GetTodosResponse
    {
        public GetTodosResponse()
        {
            Results = new List<Todo>{};
        }

        [DataMember(Order=1)]
        public virtual List<Todo> Results { get; set; }

        [DataMember(Order=2)]
        public virtual ResponseStatus ResponseStatus { get; set; }
    }

    [Route("/hello")]
    [Route("/hello/{Name}")]
    [DataContract]
    public partial class Hello
        : IReturn<HelloResponse>
    {
        [DataMember(Order=1)]
        public virtual string Name { get; set; }
    }

    [DataContract]
    public partial class HelloResponse
    {
        [DataMember(Order=1)]
        public virtual string Result { get; set; }

        [DataMember(Order=2)]
        public virtual ResponseStatus ResponseStatus { get; set; }
    }

    [Route("/hello-secure")]
    [Route("/hello-secure/{Name}")]
    [DataContract]
    public partial class HelloSecure
        : IReturn<HelloResponse>
    {
        [DataMember(Order=1)]
        public virtual string Name { get; set; }
    }

    [Route("/todos/reset", "POST")]
    [DataContract]
    public partial class ResetTodos
        : IReturnVoid
    {
    }

    [Route("/todos/{Id}", "PUT")]
    [DataContract]
    public partial class UpdateTodo
        : IReturnVoid
    {
        [DataMember(Order=1)]
        public virtual long Id { get; set; }

        [DataMember(Order=2)]
        public virtual string Title { get; set; }

        [DataMember(Order=3)]
        public virtual int Order { get; set; }

        [DataMember(Order=4)]
        public virtual bool Completed { get; set; }
    }
}

namespace TodoWorld.ServiceModel.Types
{

    [DataContract]
    public partial class Todo
    {
        [DataMember(Order=1)]
        public virtual long Id { get; set; }

        [DataMember(Order=2)]
        public virtual string Title { get; set; }

        [DataMember(Order=3)]
        public virtual int Order { get; set; }

        [DataMember(Order=4)]
        public virtual bool Completed { get; set; }
    }
}

