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


export interface IReturn<T>
{
    createResponse(): T;
}

export interface IReturnVoid
{
    createResponse(): void;
}

export interface IHasSessionId
{
    sessionId: string;
}

export interface IHasBearerToken
{
    bearerToken: string;
}

export interface IPost
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
export class GetTodoResponse
{
    // @DataMember(Order=1)
    public result: Todo;

    // @DataMember(Order=2)
    public responseStatus: ResponseStatus;

    public constructor(init?: Partial<GetTodoResponse>) { (Object as any).assign(this, init); }
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
export class AuthenticateResponse implements IHasSessionId, IHasBearerToken
{
    // @DataMember(Order=1)
    public userId: string;

    // @DataMember(Order=2)
    public sessionId: string;

    // @DataMember(Order=3)
    public userName: string;

    // @DataMember(Order=4)
    public displayName: string;

    // @DataMember(Order=5)
    public referrerUrl: string;

    // @DataMember(Order=6)
    public bearerToken: string;

    // @DataMember(Order=7)
    public refreshToken: string;

    // @DataMember(Order=8)
    public profileUrl: string;

    // @DataMember(Order=9)
    public roles: string[];

    // @DataMember(Order=10)
    public permissions: string[];

    // @DataMember(Order=11)
    public responseStatus: ResponseStatus;

    // @DataMember(Order=12)
    public meta: { [index: string]: string; };

    public constructor(init?: Partial<AuthenticateResponse>) { (Object as any).assign(this, init); }
}

// @DataContract
export class AssignRolesResponse
{
    // @DataMember(Order=1)
    public allRoles: string[];

    // @DataMember(Order=2)
    public allPermissions: string[];

    // @DataMember(Order=3)
    public meta: { [index: string]: string; };

    // @DataMember(Order=4)
    public responseStatus: ResponseStatus;

    public constructor(init?: Partial<AssignRolesResponse>) { (Object as any).assign(this, init); }
}

// @DataContract
export class UnAssignRolesResponse
{
    // @DataMember(Order=1)
    public allRoles: string[];

    // @DataMember(Order=2)
    public allPermissions: string[];

    // @DataMember(Order=3)
    public meta: { [index: string]: string; };

    // @DataMember(Order=4)
    public responseStatus: ResponseStatus;

    public constructor(init?: Partial<UnAssignRolesResponse>) { (Object as any).assign(this, init); }
}

// @DataContract
export class ConvertSessionToTokenResponse
{
    // @DataMember(Order=1)
    public meta: { [index: string]: string; };

    // @DataMember(Order=2)
    public accessToken: string;

    // @DataMember(Order=3)
    public refreshToken: string;

    // @DataMember(Order=4)
    public responseStatus: ResponseStatus;

    public constructor(init?: Partial<ConvertSessionToTokenResponse>) { (Object as any).assign(this, init); }
}

// @DataContract
export class GetAccessTokenResponse
{
    // @DataMember(Order=1)
    public accessToken: string;

    // @DataMember(Order=2)
    public meta: { [index: string]: string; };

    // @DataMember(Order=3)
    public responseStatus: ResponseStatus;

    public constructor(init?: Partial<GetAccessTokenResponse>) { (Object as any).assign(this, init); }
}

// @DataContract
export class RegisterResponse
{
    // @DataMember(Order=1)
    public userId: string;

    // @DataMember(Order=2)
    public sessionId: string;

    // @DataMember(Order=3)
    public userName: string;

    // @DataMember(Order=4)
    public referrerUrl: string;

    // @DataMember(Order=5)
    public bearerToken: string;

    // @DataMember(Order=6)
    public refreshToken: string;

    // @DataMember(Order=7)
    public responseStatus: ResponseStatus;

    // @DataMember(Order=8)
    public meta: { [index: string]: string; };

    public constructor(init?: Partial<RegisterResponse>) { (Object as any).assign(this, init); }
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

// @Route("/hello-secure")
// @Route("/hello-secure/{Name}")
// @DataContract
export class HelloSecure implements IReturn<HelloResponse>
{
    // @DataMember(Order=1)
    public name: string;

    public constructor(init?: Partial<HelloSecure>) { (Object as any).assign(this, init); }
    public createResponse() { return new HelloResponse(); }
    public getTypeName() { return 'HelloSecure'; }
}

// @Route("/todos/{Id}", "GET")
// @DataContract
export class GetTodo implements IReturn<GetTodoResponse>
{
    // @DataMember(Order=1)
    public id: number;

    public constructor(init?: Partial<GetTodo>) { (Object as any).assign(this, init); }
    public createResponse() { return new GetTodoResponse(); }
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

// @Route("/todos/reset", "POST")
// @DataContract
export class ResetTodos implements IReturnVoid
{

    public constructor(init?: Partial<ResetTodos>) { (Object as any).assign(this, init); }
    public createResponse() {}
    public getTypeName() { return 'ResetTodos'; }
}

// @Route("/auth")
// @Route("/auth/{provider}")
// @DataContract
export class Authenticate implements IReturn<AuthenticateResponse>, IPost
{
    // @DataMember(Order=1)
    public provider: string;

    // @DataMember(Order=2)
    public state: string;

    // @DataMember(Order=3)
    public oauth_token: string;

    // @DataMember(Order=4)
    public oauth_verifier: string;

    // @DataMember(Order=5)
    public userName: string;

    // @DataMember(Order=6)
    public password: string;

    // @DataMember(Order=7)
    public rememberMe: boolean;

    // @DataMember(Order=9)
    public errorView: string;

    // @DataMember(Order=10)
    public nonce: string;

    // @DataMember(Order=11)
    public uri: string;

    // @DataMember(Order=12)
    public response: string;

    // @DataMember(Order=13)
    public qop: string;

    // @DataMember(Order=14)
    public nc: string;

    // @DataMember(Order=15)
    public cnonce: string;

    // @DataMember(Order=16)
    public useTokenCookie: boolean;

    // @DataMember(Order=17)
    public accessToken: string;

    // @DataMember(Order=18)
    public accessTokenSecret: string;

    // @DataMember(Order=19)
    public scope: string;

    // @DataMember(Order=20)
    public meta: { [index: string]: string; };

    public constructor(init?: Partial<Authenticate>) { (Object as any).assign(this, init); }
    public createResponse() { return new AuthenticateResponse(); }
    public getTypeName() { return 'Authenticate'; }
}

// @Route("/assignroles")
// @DataContract
export class AssignRoles implements IReturn<AssignRolesResponse>, IPost
{
    // @DataMember(Order=1)
    public userName: string;

    // @DataMember(Order=2)
    public permissions: string[];

    // @DataMember(Order=3)
    public roles: string[];

    // @DataMember(Order=4)
    public meta: { [index: string]: string; };

    public constructor(init?: Partial<AssignRoles>) { (Object as any).assign(this, init); }
    public createResponse() { return new AssignRolesResponse(); }
    public getTypeName() { return 'AssignRoles'; }
}

// @Route("/unassignroles")
// @DataContract
export class UnAssignRoles implements IReturn<UnAssignRolesResponse>, IPost
{
    // @DataMember(Order=1)
    public userName: string;

    // @DataMember(Order=2)
    public permissions: string[];

    // @DataMember(Order=3)
    public roles: string[];

    // @DataMember(Order=4)
    public meta: { [index: string]: string; };

    public constructor(init?: Partial<UnAssignRoles>) { (Object as any).assign(this, init); }
    public createResponse() { return new UnAssignRolesResponse(); }
    public getTypeName() { return 'UnAssignRoles'; }
}

// @Route("/session-to-token")
// @DataContract
export class ConvertSessionToToken implements IReturn<ConvertSessionToTokenResponse>, IPost
{
    // @DataMember(Order=1)
    public preserveSession: boolean;

    // @DataMember(Order=2)
    public meta: { [index: string]: string; };

    public constructor(init?: Partial<ConvertSessionToToken>) { (Object as any).assign(this, init); }
    public createResponse() { return new ConvertSessionToTokenResponse(); }
    public getTypeName() { return 'ConvertSessionToToken'; }
}

// @Route("/access-token")
// @DataContract
export class GetAccessToken implements IReturn<GetAccessTokenResponse>, IPost
{
    // @DataMember(Order=1)
    public refreshToken: string;

    // @DataMember(Order=2)
    public useTokenCookie: boolean;

    // @DataMember(Order=3)
    public meta: { [index: string]: string; };

    public constructor(init?: Partial<GetAccessToken>) { (Object as any).assign(this, init); }
    public createResponse() { return new GetAccessTokenResponse(); }
    public getTypeName() { return 'GetAccessToken'; }
}

// @Route("/register")
// @DataContract
export class Register implements IReturn<RegisterResponse>, IPost
{
    // @DataMember(Order=1)
    public userName: string;

    // @DataMember(Order=2)
    public firstName: string;

    // @DataMember(Order=3)
    public lastName: string;

    // @DataMember(Order=4)
    public displayName: string;

    // @DataMember(Order=5)
    public email: string;

    // @DataMember(Order=6)
    public password: string;

    // @DataMember(Order=7)
    public confirmPassword: string;

    // @DataMember(Order=8)
    public autoLogin: boolean;

    // @DataMember(Order=10)
    public errorView: string;

    // @DataMember(Order=11)
    public meta: { [index: string]: string; };

    public constructor(init?: Partial<Register>) { (Object as any).assign(this, init); }
    public createResponse() { return new RegisterResponse(); }
    public getTypeName() { return 'Register'; }
}

