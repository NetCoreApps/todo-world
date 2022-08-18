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


export interface IReturn<T>
{
    createResponse(): T;
}

export interface IReturnVoid
{
    createResponse(): void;
}

export interface IGet
{
}

// @DataContract
export class ResponseError
{
    // @DataMember(Order=1, EmitDefaultValue=false)
    public errorCode: string;

    // @DataMember(Order=2, EmitDefaultValue=false)
    public fieldName: string;

    // @DataMember(Order=3, EmitDefaultValue=false)
    public message: string;

    // @DataMember(Order=4, EmitDefaultValue=false)
    public meta: { [index: string]: string; };

    public constructor(init?: Partial<ResponseError>) { (Object as any).assign(this, init); }
}

// @DataContract
export class ResponseStatus
{
    // @DataMember(Order=1)
    public errorCode: string;

    // @DataMember(Order=2)
    public message: string;

    // @DataMember(Order=3)
    public stackTrace: string;

    // @DataMember(Order=4)
    public errors: ResponseError[];

    // @DataMember(Order=5)
    public meta: { [index: string]: string; };

    public constructor(init?: Partial<ResponseStatus>) { (Object as any).assign(this, init); }
}

// @DataContract
export class Todo
{
    // @DataMember(Order=1)
    public id: number;

    // @DataMember(Order=2)
    public title: string;

    // @DataMember(Order=3)
    public order: number;

    // @DataMember(Order=4)
    public completed: boolean;

    public constructor(init?: Partial<Todo>) { (Object as any).assign(this, init); }
}

// @DataContract
export class HelloResponse
{
    // @DataMember(Order=1)
    public result: string;

    // @DataMember(Order=2)
    public responseStatus: ResponseStatus;

    public constructor(init?: Partial<HelloResponse>) { (Object as any).assign(this, init); }
}

// @DataContract
export class GetTodosResponse
{
    // @DataMember(Order=1)
    public results: Todo[];

    // @DataMember(Order=2)
    public responseStatus: ResponseStatus;

    public constructor(init?: Partial<GetTodosResponse>) { (Object as any).assign(this, init); }
}

// @DataContract
export class CreateTodoResponse
{
    // @DataMember(Order=1)
    public result: Todo;

    // @DataMember(Order=2)
    public responseStatus: ResponseStatus;

    public constructor(init?: Partial<CreateTodoResponse>) { (Object as any).assign(this, init); }
}

// @DataContract
export class FileContent
{
    // @DataMember(Order=1)
    public name: string;

    // @DataMember(Order=2)
    public type: string;

    // @DataMember(Order=3)
    public length: number;

    // @DataMember(Order=4)
    public body: Uint8Array;

    // @DataMember(Order=5)
    public responseStatus: ResponseStatus;

    public constructor(init?: Partial<FileContent>) { (Object as any).assign(this, init); }
}

// @Route("/hello")
// @Route("/hello/{Name}")
// @DataContract
export class Hello implements IReturn<HelloResponse>
{
    // @DataMember(Order=1)
    public name: string;

    public constructor(init?: Partial<Hello>) { (Object as any).assign(this, init); }
    public createResponse() { return new HelloResponse(); }
    public getTypeName() { return 'Hello'; }
}

// @Route("/todos/{Id}", "GET")
// @DataContract
export class GetTodo implements IReturn<GetTodosResponse>
{
    // @DataMember(Order=1)
    public id: number;

    public constructor(init?: Partial<GetTodo>) { (Object as any).assign(this, init); }
    public createResponse() { return new GetTodosResponse(); }
    public getTypeName() { return 'GetTodo'; }
}

// @Route("/todos", "GET")
// @DataContract
export class GetTodos implements IReturn<GetTodosResponse>
{

    public constructor(init?: Partial<GetTodos>) { (Object as any).assign(this, init); }
    public createResponse() { return new GetTodosResponse(); }
    public getTypeName() { return 'GetTodos'; }
}

// @Route("/todos", "POST")
// @DataContract
export class CreateTodo implements IReturn<CreateTodoResponse>
{
    // @DataMember(Order=1)
    public title: string;

    // @DataMember(Order=2)
    public order: number;

    public constructor(init?: Partial<CreateTodo>) { (Object as any).assign(this, init); }
    public createResponse() { return new CreateTodoResponse(); }
    public getTypeName() { return 'CreateTodo'; }
}

// @Route("/todos/{Id}", "PUT")
// @DataContract
export class UpdateTodo implements IReturnVoid
{
    // @DataMember(Order=1)
    public id: number;

    // @DataMember(Order=2)
    public title: string;

    // @DataMember(Order=3)
    public order: number;

    // @DataMember(Order=4)
    public completed: boolean;

    public constructor(init?: Partial<UpdateTodo>) { (Object as any).assign(this, init); }
    public createResponse() {}
    public getTypeName() { return 'UpdateTodo'; }
}

// @Route("/todos/{Id}", "DELETE")
// @DataContract
export class DeleteTodo implements IReturnVoid
{
    // @DataMember(Order=1)
    public id: number;

    public constructor(init?: Partial<DeleteTodo>) { (Object as any).assign(this, init); }
    public createResponse() {}
    public getTypeName() { return 'DeleteTodo'; }
}

// @Route("/todos", "DELETE")
// @DataContract
export class DeleteTodos implements IReturnVoid
{
    // @DataMember(Order=1)
    public ids: number[];

    public constructor(init?: Partial<DeleteTodos>) { (Object as any).assign(this, init); }
    public createResponse() {}
    public getTypeName() { return 'DeleteTodos'; }
}

// @DataContract
export class GetFile implements IReturn<FileContent>, IGet
{
    // @DataMember(Order=1)
    public path: string;

    public constructor(init?: Partial<GetFile>) { (Object as any).assign(this, init); }
    public createResponse() { return new FileContent(); }
    public getTypeName() { return 'GetFile'; }
}

