/* Options:
Date: 2020-02-03 23:00:08
Version: 5.81
Tip: To override a DTO option, remove "//" prefix before updating
BaseUrl: https://todoworld.servicestack.net

GlobalNamespace: dtos
//AddServiceStackTypes: True
//AddResponseStatus: False
//AddImplicitVersion: 
//AddDescriptionAsComments: True
//IncludeTypes: 
//ExcludeTypes: 
//DefaultImports: package:servicestack/servicestack.dart
*/


library dtos;
import 'package:servicestack/servicestack.dart';

// @DataContract
class Todo implements IConvertible
{
    // @DataMember(Order=1)
    int id;

    // @DataMember(Order=2)
    String title;

    // @DataMember(Order=3)
    int order;

    // @DataMember(Order=4)
    bool completed;

    Todo({this.id,this.title,this.order,this.completed});
    Todo.fromJson(Map<String, dynamic> json) { fromMap(json); }

    fromMap(Map<String, dynamic> json) {
        id = json['id'];
        title = json['title'];
        order = json['order'];
        completed = json['completed'];
        return this;
    }

    Map<String, dynamic> toJson() => {
        'id': id,
        'title': title,
        'order': order,
        'completed': completed
    };

    TypeContext context = _ctx;
}

// @DataContract
class HelloResponse implements IConvertible
{
    // @DataMember(Order=1)
    String result;

    // @DataMember(Order=2)
    ResponseStatus responseStatus;

    HelloResponse({this.result,this.responseStatus});
    HelloResponse.fromJson(Map<String, dynamic> json) { fromMap(json); }

    fromMap(Map<String, dynamic> json) {
        result = json['result'];
        responseStatus = JsonConverters.fromJson(json['responseStatus'],'ResponseStatus',context);
        return this;
    }

    Map<String, dynamic> toJson() => {
        'result': result,
        'responseStatus': JsonConverters.toJson(responseStatus,'ResponseStatus',context)
    };

    TypeContext context = _ctx;
}

// @DataContract
class GetTodoResponse implements IConvertible
{
    // @DataMember(Order=1)
    Todo result;

    // @DataMember(Order=2)
    ResponseStatus responseStatus;

    GetTodoResponse({this.result,this.responseStatus});
    GetTodoResponse.fromJson(Map<String, dynamic> json) { fromMap(json); }

    fromMap(Map<String, dynamic> json) {
        result = JsonConverters.fromJson(json['result'],'Todo',context);
        responseStatus = JsonConverters.fromJson(json['responseStatus'],'ResponseStatus',context);
        return this;
    }

    Map<String, dynamic> toJson() => {
        'result': JsonConverters.toJson(result,'Todo',context),
        'responseStatus': JsonConverters.toJson(responseStatus,'ResponseStatus',context)
    };

    TypeContext context = _ctx;
}

// @DataContract
class GetTodosResponse implements IConvertible
{
    // @DataMember(Order=1)
    List<Todo> results;

    // @DataMember(Order=2)
    ResponseStatus responseStatus;

    GetTodosResponse({this.results,this.responseStatus});
    GetTodosResponse.fromJson(Map<String, dynamic> json) { fromMap(json); }

    fromMap(Map<String, dynamic> json) {
        results = JsonConverters.fromJson(json['results'],'List<Todo>',context);
        responseStatus = JsonConverters.fromJson(json['responseStatus'],'ResponseStatus',context);
        return this;
    }

    Map<String, dynamic> toJson() => {
        'results': JsonConverters.toJson(results,'List<Todo>',context),
        'responseStatus': JsonConverters.toJson(responseStatus,'ResponseStatus',context)
    };

    TypeContext context = _ctx;
}

// @DataContract
class CreateTodoResponse implements IConvertible
{
    // @DataMember(Order=1)
    Todo result;

    // @DataMember(Order=2)
    ResponseStatus responseStatus;

    CreateTodoResponse({this.result,this.responseStatus});
    CreateTodoResponse.fromJson(Map<String, dynamic> json) { fromMap(json); }

    fromMap(Map<String, dynamic> json) {
        result = JsonConverters.fromJson(json['result'],'Todo',context);
        responseStatus = JsonConverters.fromJson(json['responseStatus'],'ResponseStatus',context);
        return this;
    }

    Map<String, dynamic> toJson() => {
        'result': JsonConverters.toJson(result,'Todo',context),
        'responseStatus': JsonConverters.toJson(responseStatus,'ResponseStatus',context)
    };

    TypeContext context = _ctx;
}

// @Route("/hello")
// @Route("/hello/{Name}")
// @DataContract
class Hello implements IReturn<HelloResponse>, IConvertible
{
    // @DataMember(Order=1)
    String name;

    Hello({this.name});
    Hello.fromJson(Map<String, dynamic> json) { fromMap(json); }

    fromMap(Map<String, dynamic> json) {
        name = json['name'];
        return this;
    }

    Map<String, dynamic> toJson() => {
        'name': name
    };

    createResponse() { return new HelloResponse(); }
    String getTypeName() { return "Hello"; }
    TypeContext context = _ctx;
}

// @Route("/hello-secure")
// @Route("/hello-secure/{Name}")
// @DataContract
class HelloSecure implements IReturn<HelloResponse>, IConvertible
{
    // @DataMember(Order=1)
    String name;

    HelloSecure({this.name});
    HelloSecure.fromJson(Map<String, dynamic> json) { fromMap(json); }

    fromMap(Map<String, dynamic> json) {
        name = json['name'];
        return this;
    }

    Map<String, dynamic> toJson() => {
        'name': name
    };

    createResponse() { return new HelloResponse(); }
    String getTypeName() { return "HelloSecure"; }
    TypeContext context = _ctx;
}

// @Route("/todos/{Id}", "GET")
// @DataContract
class GetTodo implements IReturn<GetTodoResponse>, IConvertible
{
    // @DataMember(Order=1)
    int id;

    GetTodo({this.id});
    GetTodo.fromJson(Map<String, dynamic> json) { fromMap(json); }

    fromMap(Map<String, dynamic> json) {
        id = json['id'];
        return this;
    }

    Map<String, dynamic> toJson() => {
        'id': id
    };

    createResponse() { return new GetTodoResponse(); }
    String getTypeName() { return "GetTodo"; }
    TypeContext context = _ctx;
}

// @Route("/todos", "GET")
// @DataContract
class GetTodos implements IReturn<GetTodosResponse>, IConvertible
{
    GetTodos();
    GetTodos.fromJson(Map<String, dynamic> json) : super();
    fromMap(Map<String, dynamic> json) {
        return this;
    }

    Map<String, dynamic> toJson() => {};
    createResponse() { return new GetTodosResponse(); }
    String getTypeName() { return "GetTodos"; }
    TypeContext context = _ctx;
}

// @Route("/todos", "POST")
// @DataContract
class CreateTodo implements IReturn<CreateTodoResponse>, IConvertible
{
    // @DataMember(Order=1)
    String title;

    // @DataMember(Order=2)
    int order;

    CreateTodo({this.title,this.order});
    CreateTodo.fromJson(Map<String, dynamic> json) { fromMap(json); }

    fromMap(Map<String, dynamic> json) {
        title = json['title'];
        order = json['order'];
        return this;
    }

    Map<String, dynamic> toJson() => {
        'title': title,
        'order': order
    };

    createResponse() { return new CreateTodoResponse(); }
    String getTypeName() { return "CreateTodo"; }
    TypeContext context = _ctx;
}

// @Route("/todos/{Id}", "PUT")
// @DataContract
class UpdateTodo implements IReturnVoid, IConvertible
{
    // @DataMember(Order=1)
    int id;

    // @DataMember(Order=2)
    String title;

    // @DataMember(Order=3)
    int order;

    // @DataMember(Order=4)
    bool completed;

    UpdateTodo({this.id,this.title,this.order,this.completed});
    UpdateTodo.fromJson(Map<String, dynamic> json) { fromMap(json); }

    fromMap(Map<String, dynamic> json) {
        id = json['id'];
        title = json['title'];
        order = json['order'];
        completed = json['completed'];
        return this;
    }

    Map<String, dynamic> toJson() => {
        'id': id,
        'title': title,
        'order': order,
        'completed': completed
    };

    createResponse() {}
    String getTypeName() { return "UpdateTodo"; }
    TypeContext context = _ctx;
}

// @Route("/todos/{Id}", "DELETE")
// @DataContract
class DeleteTodo implements IReturnVoid, IConvertible
{
    // @DataMember(Order=1)
    int id;

    DeleteTodo({this.id});
    DeleteTodo.fromJson(Map<String, dynamic> json) { fromMap(json); }

    fromMap(Map<String, dynamic> json) {
        id = json['id'];
        return this;
    }

    Map<String, dynamic> toJson() => {
        'id': id
    };

    createResponse() {}
    String getTypeName() { return "DeleteTodo"; }
    TypeContext context = _ctx;
}

// @Route("/todos", "DELETE")
// @DataContract
class DeleteTodos implements IReturnVoid, IConvertible
{
    // @DataMember(Order=1)
    List<int> ids;

    DeleteTodos({this.ids});
    DeleteTodos.fromJson(Map<String, dynamic> json) { fromMap(json); }

    fromMap(Map<String, dynamic> json) {
        ids = JsonConverters.fromJson(json['ids'],'List<int>',context);
        return this;
    }

    Map<String, dynamic> toJson() => {
        'ids': JsonConverters.toJson(ids,'List<int>',context)
    };

    createResponse() {}
    String getTypeName() { return "DeleteTodos"; }
    TypeContext context = _ctx;
}

// @Route("/todos/reset", "POST")
// @DataContract
class ResetTodos implements IReturnVoid, IConvertible
{
    ResetTodos();
    ResetTodos.fromJson(Map<String, dynamic> json) : super();
    fromMap(Map<String, dynamic> json) {
        return this;
    }

    Map<String, dynamic> toJson() => {};
    createResponse() {}
    String getTypeName() { return "ResetTodos"; }
    TypeContext context = _ctx;
}

TypeContext _ctx = new TypeContext(library: 'dtos', types: <String, TypeInfo> {
    'Todo': new TypeInfo(TypeOf.Class, create:() => new Todo()),
    'HelloResponse': new TypeInfo(TypeOf.Class, create:() => new HelloResponse()),
    'GetTodoResponse': new TypeInfo(TypeOf.Class, create:() => new GetTodoResponse()),
    'GetTodosResponse': new TypeInfo(TypeOf.Class, create:() => new GetTodosResponse()),
    'List<Todo>': new TypeInfo(TypeOf.Class, create:() => new List<Todo>()),
    'CreateTodoResponse': new TypeInfo(TypeOf.Class, create:() => new CreateTodoResponse()),
    'Hello': new TypeInfo(TypeOf.Class, create:() => new Hello()),
    'HelloSecure': new TypeInfo(TypeOf.Class, create:() => new HelloSecure()),
    'GetTodo': new TypeInfo(TypeOf.Class, create:() => new GetTodo()),
    'GetTodos': new TypeInfo(TypeOf.Class, create:() => new GetTodos()),
    'CreateTodo': new TypeInfo(TypeOf.Class, create:() => new CreateTodo()),
    'UpdateTodo': new TypeInfo(TypeOf.Class, create:() => new UpdateTodo()),
    'DeleteTodo': new TypeInfo(TypeOf.Class, create:() => new DeleteTodo()),
    'DeleteTodos': new TypeInfo(TypeOf.Class, create:() => new DeleteTodos()),
    'ResetTodos': new TypeInfo(TypeOf.Class, create:() => new ResetTodos()),
});

