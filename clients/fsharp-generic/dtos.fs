(* Options:
Date: 2019-11-12 02:10:03
Version: 5.71
Tip: To override a DTO option, remove "//" prefix before updating
BaseUrl: https://localhost:5001

//GlobalNamespace: 
//MakeDataContractsExtensible: False
//AddReturnMarker: True
//AddDescriptionAsComments: True
//AddDataContractAttributes: False
//AddIndexesToDataMembers: False
//AddGeneratedCodeAttributes: False
//AddResponseStatus: False
//AddImplicitVersion: 
//ExportValueTypes: False
//IncludeTypes: 
//ExcludeTypes: 
//InitializeCollections: True
//AddNamespaces: 
*)

namespace TodoWorld.ServiceModel

open System
open System.Collections
open System.Collections.Generic
open System.Runtime.Serialization
open ServiceStack
open ServiceStack.DataAnnotations

    [<DataContract>]
    [<AllowNullLiteral>]
    type Todo() = 
        [<DataMember(Order=1)>]
        member val Id:Int64 = new Int64() with get,set

        [<DataMember(Order=2)>]
        member val Title:String = null with get,set

        [<DataMember(Order=3)>]
        member val Order:Int32 = new Int32() with get,set

        [<DataMember(Order=4)>]
        member val Completed:Boolean = new Boolean() with get,set

    [<DataContract>]
    [<AllowNullLiteral>]
    type HelloResponse() = 
        [<DataMember(Order=1)>]
        member val Result:String = null with get,set

        [<DataMember(Order=2)>]
        member val ResponseStatus:ResponseStatus = null with get,set

    [<DataContract>]
    [<AllowNullLiteral>]
    type GetTodoResponse() = 
        [<DataMember(Order=1)>]
        member val Result:Todo = null with get,set

        [<DataMember(Order=2)>]
        member val ResponseStatus:ResponseStatus = null with get,set

    [<DataContract>]
    [<AllowNullLiteral>]
    type GetTodosResponse() = 
        [<DataMember(Order=1)>]
        member val Results:List<Todo> = new List<Todo>() with get,set

        [<DataMember(Order=2)>]
        member val ResponseStatus:ResponseStatus = null with get,set

    [<DataContract>]
    [<AllowNullLiteral>]
    type CreateTodoResponse() = 
        [<DataMember(Order=1)>]
        member val Result:Todo = null with get,set

        [<DataMember(Order=2)>]
        member val ResponseStatus:ResponseStatus = null with get,set

    [<Route("/hello")>]
    [<Route("/hello/{Name}")>]
    [<DataContract>]
    [<AllowNullLiteral>]
    type Hello() = 
        interface IReturn<HelloResponse>
        [<DataMember(Order=1)>]
        member val Name:String = null with get,set

    [<Route("/hello-secure")>]
    [<Route("/hello-secure/{Name}")>]
    [<DataContract>]
    [<AllowNullLiteral>]
    type HelloSecure() = 
        interface IReturn<HelloResponse>
        [<DataMember(Order=1)>]
        member val Name:String = null with get,set

    [<Route("/todos/{Id}", "GET")>]
    [<DataContract>]
    [<AllowNullLiteral>]
    type GetTodo() = 
        interface IReturn<GetTodoResponse>
        [<DataMember(Order=1)>]
        member val Id:Int64 = new Int64() with get,set

    [<Route("/todos", "GET")>]
    [<DataContract>]
    [<AllowNullLiteral>]
    type GetTodos() = 
        interface IReturn<GetTodosResponse>

    [<Route("/todos", "POST")>]
    [<DataContract>]
    [<AllowNullLiteral>]
    type CreateTodo() = 
        interface IReturn<CreateTodoResponse>
        [<DataMember(Order=1)>]
        member val Title:String = null with get,set

        [<DataMember(Order=2)>]
        member val Order:Int32 = new Int32() with get,set

    [<Route("/todos/{Id}", "PUT")>]
    [<DataContract>]
    [<AllowNullLiteral>]
    type UpdateTodo() = 
        interface IReturnVoid
        [<DataMember(Order=1)>]
        member val Id:Int64 = new Int64() with get,set

        [<DataMember(Order=2)>]
        member val Title:String = null with get,set

        [<DataMember(Order=3)>]
        member val Order:Int32 = new Int32() with get,set

        [<DataMember(Order=4)>]
        member val Completed:Boolean = new Boolean() with get,set

    [<Route("/todos/{Id}", "DELETE")>]
    [<DataContract>]
    [<AllowNullLiteral>]
    type DeleteTodo() = 
        interface IReturnVoid
        [<DataMember(Order=1)>]
        member val Id:Int64 = new Int64() with get,set

    [<Route("/todos", "DELETE")>]
    [<DataContract>]
    [<AllowNullLiteral>]
    type DeleteTodos() = 
        interface IReturnVoid
        [<DataMember(Order=1)>]
        member val Ids:List<Int64> = new List<Int64>() with get,set

    [<Route("/todos/reset", "POST")>]
    [<DataContract>]
    [<AllowNullLiteral>]
    type ResetTodos() = 
        interface IReturnVoid

