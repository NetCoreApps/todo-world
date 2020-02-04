"use strict";
/* Options:
Date: 2020-02-02 06:17:12
Version: 5.81
Tip: To override a DTO option, remove "//" prefix before updating
BaseUrl: https://todoworld.servicestack.net

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
var GetTodoResponse = /** @class */ (function () {
    function GetTodoResponse(init) {
        Object.assign(this, init);
    }
    return GetTodoResponse;
}());
exports.GetTodoResponse = GetTodoResponse;
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
var AuthenticateResponse = /** @class */ (function () {
    function AuthenticateResponse(init) {
        Object.assign(this, init);
    }
    return AuthenticateResponse;
}());
exports.AuthenticateResponse = AuthenticateResponse;
// @DataContract
var AssignRolesResponse = /** @class */ (function () {
    function AssignRolesResponse(init) {
        Object.assign(this, init);
    }
    return AssignRolesResponse;
}());
exports.AssignRolesResponse = AssignRolesResponse;
// @DataContract
var UnAssignRolesResponse = /** @class */ (function () {
    function UnAssignRolesResponse(init) {
        Object.assign(this, init);
    }
    return UnAssignRolesResponse;
}());
exports.UnAssignRolesResponse = UnAssignRolesResponse;
// @DataContract
var ConvertSessionToTokenResponse = /** @class */ (function () {
    function ConvertSessionToTokenResponse(init) {
        Object.assign(this, init);
    }
    return ConvertSessionToTokenResponse;
}());
exports.ConvertSessionToTokenResponse = ConvertSessionToTokenResponse;
// @DataContract
var GetAccessTokenResponse = /** @class */ (function () {
    function GetAccessTokenResponse(init) {
        Object.assign(this, init);
    }
    return GetAccessTokenResponse;
}());
exports.GetAccessTokenResponse = GetAccessTokenResponse;
// @DataContract
var RegisterResponse = /** @class */ (function () {
    function RegisterResponse(init) {
        Object.assign(this, init);
    }
    return RegisterResponse;
}());
exports.RegisterResponse = RegisterResponse;
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
// @Route("/hello-secure")
// @Route("/hello-secure/{Name}")
// @DataContract
var HelloSecure = /** @class */ (function () {
    function HelloSecure(init) {
        Object.assign(this, init);
    }
    HelloSecure.prototype.createResponse = function () { return new HelloResponse(); };
    HelloSecure.prototype.getTypeName = function () { return 'HelloSecure'; };
    return HelloSecure;
}());
exports.HelloSecure = HelloSecure;
// @Route("/todos/{Id}", "GET")
// @DataContract
var GetTodo = /** @class */ (function () {
    function GetTodo(init) {
        Object.assign(this, init);
    }
    GetTodo.prototype.createResponse = function () { return new GetTodoResponse(); };
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
// @Route("/todos/reset", "POST")
// @DataContract
var ResetTodos = /** @class */ (function () {
    function ResetTodos(init) {
        Object.assign(this, init);
    }
    ResetTodos.prototype.createResponse = function () { };
    ResetTodos.prototype.getTypeName = function () { return 'ResetTodos'; };
    return ResetTodos;
}());
exports.ResetTodos = ResetTodos;
// @Route("/auth")
// @Route("/auth/{provider}")
// @DataContract
var Authenticate = /** @class */ (function () {
    function Authenticate(init) {
        Object.assign(this, init);
    }
    Authenticate.prototype.createResponse = function () { return new AuthenticateResponse(); };
    Authenticate.prototype.getTypeName = function () { return 'Authenticate'; };
    return Authenticate;
}());
exports.Authenticate = Authenticate;
// @Route("/assignroles")
// @DataContract
var AssignRoles = /** @class */ (function () {
    function AssignRoles(init) {
        Object.assign(this, init);
    }
    AssignRoles.prototype.createResponse = function () { return new AssignRolesResponse(); };
    AssignRoles.prototype.getTypeName = function () { return 'AssignRoles'; };
    return AssignRoles;
}());
exports.AssignRoles = AssignRoles;
// @Route("/unassignroles")
// @DataContract
var UnAssignRoles = /** @class */ (function () {
    function UnAssignRoles(init) {
        Object.assign(this, init);
    }
    UnAssignRoles.prototype.createResponse = function () { return new UnAssignRolesResponse(); };
    UnAssignRoles.prototype.getTypeName = function () { return 'UnAssignRoles'; };
    return UnAssignRoles;
}());
exports.UnAssignRoles = UnAssignRoles;
// @Route("/session-to-token")
// @DataContract
var ConvertSessionToToken = /** @class */ (function () {
    function ConvertSessionToToken(init) {
        Object.assign(this, init);
    }
    ConvertSessionToToken.prototype.createResponse = function () { return new ConvertSessionToTokenResponse(); };
    ConvertSessionToToken.prototype.getTypeName = function () { return 'ConvertSessionToToken'; };
    return ConvertSessionToToken;
}());
exports.ConvertSessionToToken = ConvertSessionToToken;
// @Route("/access-token")
// @DataContract
var GetAccessToken = /** @class */ (function () {
    function GetAccessToken(init) {
        Object.assign(this, init);
    }
    GetAccessToken.prototype.createResponse = function () { return new GetAccessTokenResponse(); };
    GetAccessToken.prototype.getTypeName = function () { return 'GetAccessToken'; };
    return GetAccessToken;
}());
exports.GetAccessToken = GetAccessToken;
// @Route("/register")
// @DataContract
var Register = /** @class */ (function () {
    function Register(init) {
        Object.assign(this, init);
    }
    Register.prototype.createResponse = function () { return new RegisterResponse(); };
    Register.prototype.getTypeName = function () { return 'Register'; };
    return Register;
}());
exports.Register = Register;
