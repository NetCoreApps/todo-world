"use strict";
/* Options:
Date: 2019-10-28 18:22:08
Version: 5.71
Tip: To override a DTO option, remove "//" prefix before updating
BaseUrl: https://localhost:5001

//GlobalNamespace:
//AddServiceStackTypes: True
//AddResponseStatus: False
//AddImplicitVersion:
//AddDescriptionAsComments: True
//IncludeTypes:
//ExcludeTypes:
//DefaultImports:
*/
exports.__esModule = true;
// @DataContract
var ResponseError = /** @class */ (function () {
    function ResponseError(init) {
        Object.assign(this, init);
    }
    return ResponseError;
}());
exports.ResponseError = ResponseError;
// @DataContract
var ResponseStatus = /** @class */ (function () {
    function ResponseStatus(init) {
        Object.assign(this, init);
    }
    return ResponseStatus;
}());
exports.ResponseStatus = ResponseStatus;
// @DataContract
var Todo = /** @class */ (function () {
    function Todo(init) {
        Object.assign(this, init);
    }
    return Todo;
}());
exports.Todo = Todo;
// @DataContract
var HelloResponse = /** @class */ (function () {
    function HelloResponse(init) {
        Object.assign(this, init);
    }
    return HelloResponse;
}());
exports.HelloResponse = HelloResponse;
// @DataContract
var GetTodosResponse = /** @class */ (function () {
    function GetTodosResponse(init) {
        Object.assign(this, init);
    }
    return GetTodosResponse;
}());
exports.GetTodosResponse = GetTodosResponse;
// @DataContract
var CreateTodoResponse = /** @class */ (function () {
    function CreateTodoResponse(init) {
        Object.assign(this, init);
    }
    return CreateTodoResponse;
}());
exports.CreateTodoResponse = CreateTodoResponse;
// @DataContract
var FileContent = /** @class */ (function () {
    function FileContent(init) {
        Object.assign(this, init);
    }
    return FileContent;
}());
exports.FileContent = FileContent;
// @Route("/hello")
// @Route("/hello/{Name}")
// @DataContract
var Hello = /** @class */ (function () {
    function Hello(init) {
        Object.assign(this, init);
    }
    Hello.prototype.createResponse = function () { return new HelloResponse(); };
    Hello.prototype.getTypeName = function () { return 'Hello'; };
    return Hello;
}());
exports.Hello = Hello;
// @Route("/todos/{Id}", "GET")
// @DataContract
var GetTodo = /** @class */ (function () {
    function GetTodo(init) {
        Object.assign(this, init);
    }
    GetTodo.prototype.createResponse = function () { return new GetTodosResponse(); };
    GetTodo.prototype.getTypeName = function () { return 'GetTodo'; };
    return GetTodo;
}());
exports.GetTodo = GetTodo;
// @Route("/todos", "GET")
// @DataContract
var GetTodos = /** @class */ (function () {
    function GetTodos(init) {
        Object.assign(this, init);
    }
    GetTodos.prototype.createResponse = function () { return new GetTodosResponse(); };
    GetTodos.prototype.getTypeName = function () { return 'GetTodos'; };
    return GetTodos;
}());
exports.GetTodos = GetTodos;
// @Route("/todos", "POST")
// @DataContract
var CreateTodo = /** @class */ (function () {
    function CreateTodo(init) {
        Object.assign(this, init);
    }
    CreateTodo.prototype.createResponse = function () { return new CreateTodoResponse(); };
    CreateTodo.prototype.getTypeName = function () { return 'CreateTodo'; };
    return CreateTodo;
}());
exports.CreateTodo = CreateTodo;
// @Route("/todos/{Id}", "PUT")
// @DataContract
var UpdateTodo = /** @class */ (function () {
    function UpdateTodo(init) {
        Object.assign(this, init);
    }
    UpdateTodo.prototype.createResponse = function () { };
    UpdateTodo.prototype.getTypeName = function () { return 'UpdateTodo'; };
    return UpdateTodo;
}());
exports.UpdateTodo = UpdateTodo;
// @Route("/todos/{Id}", "DELETE")
// @DataContract
var DeleteTodo = /** @class */ (function () {
    function DeleteTodo(init) {
        Object.assign(this, init);
    }
    DeleteTodo.prototype.createResponse = function () { };
    DeleteTodo.prototype.getTypeName = function () { return 'DeleteTodo'; };
    return DeleteTodo;
}());
exports.DeleteTodo = DeleteTodo;
// @Route("/todos", "DELETE")
// @DataContract
var DeleteTodos = /** @class */ (function () {
    function DeleteTodos(init) {
        Object.assign(this, init);
    }
    DeleteTodos.prototype.createResponse = function () { };
    DeleteTodos.prototype.getTypeName = function () { return 'DeleteTodos'; };
    return DeleteTodos;
}());
exports.DeleteTodos = DeleteTodos;
// @DataContract
var GetFile = /** @class */ (function () {
    function GetFile(init) {
        Object.assign(this, init);
    }
    GetFile.prototype.createResponse = function () { return new FileContent(); };
    GetFile.prototype.getTypeName = function () { return 'GetFile'; };
    return GetFile;
}());
exports.GetFile = GetFile;
