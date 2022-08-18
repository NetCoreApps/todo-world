import * as jspb from "google-protobuf"

export class AssignRoles extends jspb.Message {
  getUsername(): string;
  setUsername(value: string): void;

  getPermissionsList(): Array<string>;
  setPermissionsList(value: Array<string>): void;
  clearPermissionsList(): void;
  addPermissions(value: string, index?: number): void;

  getRolesList(): Array<string>;
  setRolesList(value: Array<string>): void;
  clearRolesList(): void;
  addRoles(value: string, index?: number): void;

  getMetaMap(): jspb.Map<string, string>;
  clearMetaMap(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AssignRoles.AsObject;
  static toObject(includeInstance: boolean, msg: AssignRoles): AssignRoles.AsObject;
  static serializeBinaryToWriter(message: AssignRoles, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AssignRoles;
  static deserializeBinaryFromReader(message: AssignRoles, reader: jspb.BinaryReader): AssignRoles;
}

export namespace AssignRoles {
  export type AsObject = {
    username: string,
    permissionsList: Array<string>,
    rolesList: Array<string>,
    metaMap: Array<[string, string]>,
  }
}

export class AssignRolesResponse extends jspb.Message {
  getAllrolesList(): Array<string>;
  setAllrolesList(value: Array<string>): void;
  clearAllrolesList(): void;
  addAllroles(value: string, index?: number): void;

  getAllpermissionsList(): Array<string>;
  setAllpermissionsList(value: Array<string>): void;
  clearAllpermissionsList(): void;
  addAllpermissions(value: string, index?: number): void;

  getMetaMap(): jspb.Map<string, string>;
  clearMetaMap(): void;

  getResponsestatus(): ResponseStatus | undefined;
  setResponsestatus(value?: ResponseStatus): void;
  hasResponsestatus(): boolean;
  clearResponsestatus(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AssignRolesResponse.AsObject;
  static toObject(includeInstance: boolean, msg: AssignRolesResponse): AssignRolesResponse.AsObject;
  static serializeBinaryToWriter(message: AssignRolesResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AssignRolesResponse;
  static deserializeBinaryFromReader(message: AssignRolesResponse, reader: jspb.BinaryReader): AssignRolesResponse;
}

export namespace AssignRolesResponse {
  export type AsObject = {
    allrolesList: Array<string>,
    allpermissionsList: Array<string>,
    metaMap: Array<[string, string]>,
    responsestatus?: ResponseStatus.AsObject,
  }
}

export class Authenticate extends jspb.Message {
  getProvider(): string;
  setProvider(value: string): void;

  getState(): string;
  setState(value: string): void;

  getOauthToken(): string;
  setOauthToken(value: string): void;

  getOauthVerifier(): string;
  setOauthVerifier(value: string): void;

  getUsername(): string;
  setUsername(value: string): void;

  getPassword(): string;
  setPassword(value: string): void;

  getRememberme(): boolean;
  setRememberme(value: boolean): void;

  getContinue(): string;
  setContinue(value: string): void;

  getErrorview(): string;
  setErrorview(value: string): void;

  getNonce(): string;
  setNonce(value: string): void;

  getUri(): string;
  setUri(value: string): void;

  getResponse(): string;
  setResponse(value: string): void;

  getQop(): string;
  setQop(value: string): void;

  getNc(): string;
  setNc(value: string): void;

  getCnonce(): string;
  setCnonce(value: string): void;

  getUsetokencookie(): boolean;
  setUsetokencookie(value: boolean): void;

  getAccesstoken(): string;
  setAccesstoken(value: string): void;

  getAccesstokensecret(): string;
  setAccesstokensecret(value: string): void;

  getScope(): string;
  setScope(value: string): void;

  getMetaMap(): jspb.Map<string, string>;
  clearMetaMap(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Authenticate.AsObject;
  static toObject(includeInstance: boolean, msg: Authenticate): Authenticate.AsObject;
  static serializeBinaryToWriter(message: Authenticate, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Authenticate;
  static deserializeBinaryFromReader(message: Authenticate, reader: jspb.BinaryReader): Authenticate;
}

export namespace Authenticate {
  export type AsObject = {
    provider: string,
    state: string,
    oauthToken: string,
    oauthVerifier: string,
    username: string,
    password: string,
    rememberme: boolean,
    pb_continue: string,
    errorview: string,
    nonce: string,
    uri: string,
    response: string,
    qop: string,
    nc: string,
    cnonce: string,
    usetokencookie: boolean,
    accesstoken: string,
    accesstokensecret: string,
    scope: string,
    metaMap: Array<[string, string]>,
  }
}

export class AuthenticateResponse extends jspb.Message {
  getUserid(): string;
  setUserid(value: string): void;

  getSessionid(): string;
  setSessionid(value: string): void;

  getUsername(): string;
  setUsername(value: string): void;

  getDisplayname(): string;
  setDisplayname(value: string): void;

  getReferrerurl(): string;
  setReferrerurl(value: string): void;

  getBearertoken(): string;
  setBearertoken(value: string): void;

  getRefreshtoken(): string;
  setRefreshtoken(value: string): void;

  getProfileurl(): string;
  setProfileurl(value: string): void;

  getRolesList(): Array<string>;
  setRolesList(value: Array<string>): void;
  clearRolesList(): void;
  addRoles(value: string, index?: number): void;

  getPermissionsList(): Array<string>;
  setPermissionsList(value: Array<string>): void;
  clearPermissionsList(): void;
  addPermissions(value: string, index?: number): void;

  getResponsestatus(): ResponseStatus | undefined;
  setResponsestatus(value?: ResponseStatus): void;
  hasResponsestatus(): boolean;
  clearResponsestatus(): void;

  getMetaMap(): jspb.Map<string, string>;
  clearMetaMap(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AuthenticateResponse.AsObject;
  static toObject(includeInstance: boolean, msg: AuthenticateResponse): AuthenticateResponse.AsObject;
  static serializeBinaryToWriter(message: AuthenticateResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AuthenticateResponse;
  static deserializeBinaryFromReader(message: AuthenticateResponse, reader: jspb.BinaryReader): AuthenticateResponse;
}

export namespace AuthenticateResponse {
  export type AsObject = {
    userid: string,
    sessionid: string,
    username: string,
    displayname: string,
    referrerurl: string,
    bearertoken: string,
    refreshtoken: string,
    profileurl: string,
    rolesList: Array<string>,
    permissionsList: Array<string>,
    responsestatus?: ResponseStatus.AsObject,
    metaMap: Array<[string, string]>,
  }
}

export class ConvertSessionToToken extends jspb.Message {
  getPreservesession(): boolean;
  setPreservesession(value: boolean): void;

  getMetaMap(): jspb.Map<string, string>;
  clearMetaMap(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ConvertSessionToToken.AsObject;
  static toObject(includeInstance: boolean, msg: ConvertSessionToToken): ConvertSessionToToken.AsObject;
  static serializeBinaryToWriter(message: ConvertSessionToToken, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ConvertSessionToToken;
  static deserializeBinaryFromReader(message: ConvertSessionToToken, reader: jspb.BinaryReader): ConvertSessionToToken;
}

export namespace ConvertSessionToToken {
  export type AsObject = {
    preservesession: boolean,
    metaMap: Array<[string, string]>,
  }
}

export class ConvertSessionToTokenResponse extends jspb.Message {
  getMetaMap(): jspb.Map<string, string>;
  clearMetaMap(): void;

  getAccesstoken(): string;
  setAccesstoken(value: string): void;

  getRefreshtoken(): string;
  setRefreshtoken(value: string): void;

  getResponsestatus(): ResponseStatus | undefined;
  setResponsestatus(value?: ResponseStatus): void;
  hasResponsestatus(): boolean;
  clearResponsestatus(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ConvertSessionToTokenResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ConvertSessionToTokenResponse): ConvertSessionToTokenResponse.AsObject;
  static serializeBinaryToWriter(message: ConvertSessionToTokenResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ConvertSessionToTokenResponse;
  static deserializeBinaryFromReader(message: ConvertSessionToTokenResponse, reader: jspb.BinaryReader): ConvertSessionToTokenResponse;
}

export namespace ConvertSessionToTokenResponse {
  export type AsObject = {
    metaMap: Array<[string, string]>,
    accesstoken: string,
    refreshtoken: string,
    responsestatus?: ResponseStatus.AsObject,
  }
}

export class CreateTodo extends jspb.Message {
  getTitle(): string;
  setTitle(value: string): void;

  getOrder(): number;
  setOrder(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreateTodo.AsObject;
  static toObject(includeInstance: boolean, msg: CreateTodo): CreateTodo.AsObject;
  static serializeBinaryToWriter(message: CreateTodo, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreateTodo;
  static deserializeBinaryFromReader(message: CreateTodo, reader: jspb.BinaryReader): CreateTodo;
}

export namespace CreateTodo {
  export type AsObject = {
    title: string,
    order: number,
  }
}

export class CreateTodoResponse extends jspb.Message {
  getResult(): Todo | undefined;
  setResult(value?: Todo): void;
  hasResult(): boolean;
  clearResult(): void;

  getResponsestatus(): ResponseStatus | undefined;
  setResponsestatus(value?: ResponseStatus): void;
  hasResponsestatus(): boolean;
  clearResponsestatus(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreateTodoResponse.AsObject;
  static toObject(includeInstance: boolean, msg: CreateTodoResponse): CreateTodoResponse.AsObject;
  static serializeBinaryToWriter(message: CreateTodoResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreateTodoResponse;
  static deserializeBinaryFromReader(message: CreateTodoResponse, reader: jspb.BinaryReader): CreateTodoResponse;
}

export namespace CreateTodoResponse {
  export type AsObject = {
    result?: Todo.AsObject,
    responsestatus?: ResponseStatus.AsObject,
  }
}

export class DeleteTodo extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteTodo.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteTodo): DeleteTodo.AsObject;
  static serializeBinaryToWriter(message: DeleteTodo, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteTodo;
  static deserializeBinaryFromReader(message: DeleteTodo, reader: jspb.BinaryReader): DeleteTodo;
}

export namespace DeleteTodo {
  export type AsObject = {
    id: number,
  }
}

export class DeleteTodos extends jspb.Message {
  getIdsList(): Array<number>;
  setIdsList(value: Array<number>): void;
  clearIdsList(): void;
  addIds(value: number, index?: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteTodos.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteTodos): DeleteTodos.AsObject;
  static serializeBinaryToWriter(message: DeleteTodos, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteTodos;
  static deserializeBinaryFromReader(message: DeleteTodos, reader: jspb.BinaryReader): DeleteTodos;
}

export namespace DeleteTodos {
  export type AsObject = {
    idsList: Array<number>,
  }
}

export class EmptyResponse extends jspb.Message {
  getResponsestatus(): ResponseStatus | undefined;
  setResponsestatus(value?: ResponseStatus): void;
  hasResponsestatus(): boolean;
  clearResponsestatus(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): EmptyResponse.AsObject;
  static toObject(includeInstance: boolean, msg: EmptyResponse): EmptyResponse.AsObject;
  static serializeBinaryToWriter(message: EmptyResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): EmptyResponse;
  static deserializeBinaryFromReader(message: EmptyResponse, reader: jspb.BinaryReader): EmptyResponse;
}

export namespace EmptyResponse {
  export type AsObject = {
    responsestatus?: ResponseStatus.AsObject,
  }
}

export class FileContent extends jspb.Message {
  getName(): string;
  setName(value: string): void;

  getType(): string;
  setType(value: string): void;

  getLength(): number;
  setLength(value: number): void;

  getBody(): Uint8Array | string;
  getBody_asU8(): Uint8Array;
  getBody_asB64(): string;
  setBody(value: Uint8Array | string): void;

  getResponsestatus(): ResponseStatus | undefined;
  setResponsestatus(value?: ResponseStatus): void;
  hasResponsestatus(): boolean;
  clearResponsestatus(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FileContent.AsObject;
  static toObject(includeInstance: boolean, msg: FileContent): FileContent.AsObject;
  static serializeBinaryToWriter(message: FileContent, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FileContent;
  static deserializeBinaryFromReader(message: FileContent, reader: jspb.BinaryReader): FileContent;
}

export namespace FileContent {
  export type AsObject = {
    name: string,
    type: string,
    length: number,
    body: Uint8Array | string,
    responsestatus?: ResponseStatus.AsObject,
  }
}

export class GetAccessToken extends jspb.Message {
  getRefreshtoken(): string;
  setRefreshtoken(value: string): void;

  getUsetokencookie(): boolean;
  setUsetokencookie(value: boolean): void;

  getMetaMap(): jspb.Map<string, string>;
  clearMetaMap(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetAccessToken.AsObject;
  static toObject(includeInstance: boolean, msg: GetAccessToken): GetAccessToken.AsObject;
  static serializeBinaryToWriter(message: GetAccessToken, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetAccessToken;
  static deserializeBinaryFromReader(message: GetAccessToken, reader: jspb.BinaryReader): GetAccessToken;
}

export namespace GetAccessToken {
  export type AsObject = {
    refreshtoken: string,
    usetokencookie: boolean,
    metaMap: Array<[string, string]>,
  }
}

export class GetAccessTokenResponse extends jspb.Message {
  getAccesstoken(): string;
  setAccesstoken(value: string): void;

  getMetaMap(): jspb.Map<string, string>;
  clearMetaMap(): void;

  getResponsestatus(): ResponseStatus | undefined;
  setResponsestatus(value?: ResponseStatus): void;
  hasResponsestatus(): boolean;
  clearResponsestatus(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetAccessTokenResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetAccessTokenResponse): GetAccessTokenResponse.AsObject;
  static serializeBinaryToWriter(message: GetAccessTokenResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetAccessTokenResponse;
  static deserializeBinaryFromReader(message: GetAccessTokenResponse, reader: jspb.BinaryReader): GetAccessTokenResponse;
}

export namespace GetAccessTokenResponse {
  export type AsObject = {
    accesstoken: string,
    metaMap: Array<[string, string]>,
    responsestatus?: ResponseStatus.AsObject,
  }
}

export class GetTodo extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetTodo.AsObject;
  static toObject(includeInstance: boolean, msg: GetTodo): GetTodo.AsObject;
  static serializeBinaryToWriter(message: GetTodo, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetTodo;
  static deserializeBinaryFromReader(message: GetTodo, reader: jspb.BinaryReader): GetTodo;
}

export namespace GetTodo {
  export type AsObject = {
    id: number,
  }
}

export class GetTodoResponse extends jspb.Message {
  getResult(): Todo | undefined;
  setResult(value?: Todo): void;
  hasResult(): boolean;
  clearResult(): void;

  getResponsestatus(): ResponseStatus | undefined;
  setResponsestatus(value?: ResponseStatus): void;
  hasResponsestatus(): boolean;
  clearResponsestatus(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetTodoResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetTodoResponse): GetTodoResponse.AsObject;
  static serializeBinaryToWriter(message: GetTodoResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetTodoResponse;
  static deserializeBinaryFromReader(message: GetTodoResponse, reader: jspb.BinaryReader): GetTodoResponse;
}

export namespace GetTodoResponse {
  export type AsObject = {
    result?: Todo.AsObject,
    responsestatus?: ResponseStatus.AsObject,
  }
}

export class GetTodos extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetTodos.AsObject;
  static toObject(includeInstance: boolean, msg: GetTodos): GetTodos.AsObject;
  static serializeBinaryToWriter(message: GetTodos, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetTodos;
  static deserializeBinaryFromReader(message: GetTodos, reader: jspb.BinaryReader): GetTodos;
}

export namespace GetTodos {
  export type AsObject = {
  }
}

export class GetTodosResponse extends jspb.Message {
  getResultsList(): Array<Todo>;
  setResultsList(value: Array<Todo>): void;
  clearResultsList(): void;
  addResults(value?: Todo, index?: number): Todo;

  getResponsestatus(): ResponseStatus | undefined;
  setResponsestatus(value?: ResponseStatus): void;
  hasResponsestatus(): boolean;
  clearResponsestatus(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetTodosResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetTodosResponse): GetTodosResponse.AsObject;
  static serializeBinaryToWriter(message: GetTodosResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetTodosResponse;
  static deserializeBinaryFromReader(message: GetTodosResponse, reader: jspb.BinaryReader): GetTodosResponse;
}

export namespace GetTodosResponse {
  export type AsObject = {
    resultsList: Array<Todo.AsObject>,
    responsestatus?: ResponseStatus.AsObject,
  }
}

export class Hello extends jspb.Message {
  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Hello.AsObject;
  static toObject(includeInstance: boolean, msg: Hello): Hello.AsObject;
  static serializeBinaryToWriter(message: Hello, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Hello;
  static deserializeBinaryFromReader(message: Hello, reader: jspb.BinaryReader): Hello;
}

export namespace Hello {
  export type AsObject = {
    name: string,
  }
}

export class HelloResponse extends jspb.Message {
  getResult(): string;
  setResult(value: string): void;

  getResponsestatus(): ResponseStatus | undefined;
  setResponsestatus(value?: ResponseStatus): void;
  hasResponsestatus(): boolean;
  clearResponsestatus(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): HelloResponse.AsObject;
  static toObject(includeInstance: boolean, msg: HelloResponse): HelloResponse.AsObject;
  static serializeBinaryToWriter(message: HelloResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): HelloResponse;
  static deserializeBinaryFromReader(message: HelloResponse, reader: jspb.BinaryReader): HelloResponse;
}

export namespace HelloResponse {
  export type AsObject = {
    result: string,
    responsestatus?: ResponseStatus.AsObject,
  }
}

export class HelloSecure extends jspb.Message {
  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): HelloSecure.AsObject;
  static toObject(includeInstance: boolean, msg: HelloSecure): HelloSecure.AsObject;
  static serializeBinaryToWriter(message: HelloSecure, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): HelloSecure;
  static deserializeBinaryFromReader(message: HelloSecure, reader: jspb.BinaryReader): HelloSecure;
}

export namespace HelloSecure {
  export type AsObject = {
    name: string,
  }
}

export class Register extends jspb.Message {
  getUsername(): string;
  setUsername(value: string): void;

  getFirstname(): string;
  setFirstname(value: string): void;

  getLastname(): string;
  setLastname(value: string): void;

  getDisplayname(): string;
  setDisplayname(value: string): void;

  getEmail(): string;
  setEmail(value: string): void;

  getPassword(): string;
  setPassword(value: string): void;

  getConfirmpassword(): string;
  setConfirmpassword(value: string): void;

  getAutologin(): boolean;
  setAutologin(value: boolean): void;

  getContinue(): string;
  setContinue(value: string): void;

  getErrorview(): string;
  setErrorview(value: string): void;

  getMetaMap(): jspb.Map<string, string>;
  clearMetaMap(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Register.AsObject;
  static toObject(includeInstance: boolean, msg: Register): Register.AsObject;
  static serializeBinaryToWriter(message: Register, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Register;
  static deserializeBinaryFromReader(message: Register, reader: jspb.BinaryReader): Register;
}

export namespace Register {
  export type AsObject = {
    username: string,
    firstname: string,
    lastname: string,
    displayname: string,
    email: string,
    password: string,
    confirmpassword: string,
    autologin: boolean,
    pb_continue: string,
    errorview: string,
    metaMap: Array<[string, string]>,
  }
}

export class RegisterResponse extends jspb.Message {
  getUserid(): string;
  setUserid(value: string): void;

  getSessionid(): string;
  setSessionid(value: string): void;

  getUsername(): string;
  setUsername(value: string): void;

  getReferrerurl(): string;
  setReferrerurl(value: string): void;

  getBearertoken(): string;
  setBearertoken(value: string): void;

  getRefreshtoken(): string;
  setRefreshtoken(value: string): void;

  getResponsestatus(): ResponseStatus | undefined;
  setResponsestatus(value?: ResponseStatus): void;
  hasResponsestatus(): boolean;
  clearResponsestatus(): void;

  getMetaMap(): jspb.Map<string, string>;
  clearMetaMap(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RegisterResponse.AsObject;
  static toObject(includeInstance: boolean, msg: RegisterResponse): RegisterResponse.AsObject;
  static serializeBinaryToWriter(message: RegisterResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RegisterResponse;
  static deserializeBinaryFromReader(message: RegisterResponse, reader: jspb.BinaryReader): RegisterResponse;
}

export namespace RegisterResponse {
  export type AsObject = {
    userid: string,
    sessionid: string,
    username: string,
    referrerurl: string,
    bearertoken: string,
    refreshtoken: string,
    responsestatus?: ResponseStatus.AsObject,
    metaMap: Array<[string, string]>,
  }
}

export class ResetTodos extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ResetTodos.AsObject;
  static toObject(includeInstance: boolean, msg: ResetTodos): ResetTodos.AsObject;
  static serializeBinaryToWriter(message: ResetTodos, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ResetTodos;
  static deserializeBinaryFromReader(message: ResetTodos, reader: jspb.BinaryReader): ResetTodos;
}

export namespace ResetTodos {
  export type AsObject = {
  }
}

export class ResponseError extends jspb.Message {
  getErrorcode(): string;
  setErrorcode(value: string): void;

  getFieldname(): string;
  setFieldname(value: string): void;

  getMessage(): string;
  setMessage(value: string): void;

  getMetaMap(): jspb.Map<string, string>;
  clearMetaMap(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ResponseError.AsObject;
  static toObject(includeInstance: boolean, msg: ResponseError): ResponseError.AsObject;
  static serializeBinaryToWriter(message: ResponseError, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ResponseError;
  static deserializeBinaryFromReader(message: ResponseError, reader: jspb.BinaryReader): ResponseError;
}

export namespace ResponseError {
  export type AsObject = {
    errorcode: string,
    fieldname: string,
    message: string,
    metaMap: Array<[string, string]>,
  }
}

export class ResponseStatus extends jspb.Message {
  getErrorcode(): string;
  setErrorcode(value: string): void;

  getMessage(): string;
  setMessage(value: string): void;

  getStacktrace(): string;
  setStacktrace(value: string): void;

  getErrorsList(): Array<ResponseError>;
  setErrorsList(value: Array<ResponseError>): void;
  clearErrorsList(): void;
  addErrors(value?: ResponseError, index?: number): ResponseError;

  getMetaMap(): jspb.Map<string, string>;
  clearMetaMap(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ResponseStatus.AsObject;
  static toObject(includeInstance: boolean, msg: ResponseStatus): ResponseStatus.AsObject;
  static serializeBinaryToWriter(message: ResponseStatus, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ResponseStatus;
  static deserializeBinaryFromReader(message: ResponseStatus, reader: jspb.BinaryReader): ResponseStatus;
}

export namespace ResponseStatus {
  export type AsObject = {
    errorcode: string,
    message: string,
    stacktrace: string,
    errorsList: Array<ResponseError.AsObject>,
    metaMap: Array<[string, string]>,
  }
}

export class StreamFiles extends jspb.Message {
  getPathsList(): Array<string>;
  setPathsList(value: Array<string>): void;
  clearPathsList(): void;
  addPaths(value: string, index?: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StreamFiles.AsObject;
  static toObject(includeInstance: boolean, msg: StreamFiles): StreamFiles.AsObject;
  static serializeBinaryToWriter(message: StreamFiles, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StreamFiles;
  static deserializeBinaryFromReader(message: StreamFiles, reader: jspb.BinaryReader): StreamFiles;
}

export namespace StreamFiles {
  export type AsObject = {
    pathsList: Array<string>,
  }
}

export class StreamServerEvents extends jspb.Message {
  getChannelsList(): Array<string>;
  setChannelsList(value: Array<string>): void;
  clearChannelsList(): void;
  addChannels(value: string, index?: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StreamServerEvents.AsObject;
  static toObject(includeInstance: boolean, msg: StreamServerEvents): StreamServerEvents.AsObject;
  static serializeBinaryToWriter(message: StreamServerEvents, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StreamServerEvents;
  static deserializeBinaryFromReader(message: StreamServerEvents, reader: jspb.BinaryReader): StreamServerEvents;
}

export namespace StreamServerEvents {
  export type AsObject = {
    channelsList: Array<string>,
  }
}

export class StreamServerEventsResponse extends jspb.Message {
  getEventid(): number;
  setEventid(value: number): void;

  getChannel(): string;
  setChannel(value: string): void;

  getSelector(): string;
  setSelector(value: string): void;

  getJson(): string;
  setJson(value: string): void;

  getOp(): string;
  setOp(value: string): void;

  getTarget(): string;
  setTarget(value: string): void;

  getCssselector(): string;
  setCssselector(value: string): void;

  getMetaMap(): jspb.Map<string, string>;
  clearMetaMap(): void;

  getUserid(): string;
  setUserid(value: string): void;

  getDisplayname(): string;
  setDisplayname(value: string): void;

  getProfileurl(): string;
  setProfileurl(value: string): void;

  getIsauthenticated(): boolean;
  setIsauthenticated(value: boolean): void;

  getChannelsList(): Array<string>;
  setChannelsList(value: Array<string>): void;
  clearChannelsList(): void;
  addChannels(value: string, index?: number): void;

  getCreatedat(): number;
  setCreatedat(value: number): void;

  getId(): string;
  setId(value: string): void;

  getUnregisterurl(): string;
  setUnregisterurl(value: string): void;

  getUpdatesubscriberurl(): string;
  setUpdatesubscriberurl(value: string): void;

  getHeartbeaturl(): string;
  setHeartbeaturl(value: string): void;

  getHeartbeatintervalms(): number;
  setHeartbeatintervalms(value: number): void;

  getIdletimeoutms(): number;
  setIdletimeoutms(value: number): void;

  getResponsestatus(): ResponseStatus | undefined;
  setResponsestatus(value?: ResponseStatus): void;
  hasResponsestatus(): boolean;
  clearResponsestatus(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StreamServerEventsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: StreamServerEventsResponse): StreamServerEventsResponse.AsObject;
  static serializeBinaryToWriter(message: StreamServerEventsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StreamServerEventsResponse;
  static deserializeBinaryFromReader(message: StreamServerEventsResponse, reader: jspb.BinaryReader): StreamServerEventsResponse;
}

export namespace StreamServerEventsResponse {
  export type AsObject = {
    eventid: number,
    channel: string,
    selector: string,
    json: string,
    op: string,
    target: string,
    cssselector: string,
    metaMap: Array<[string, string]>,
    userid: string,
    displayname: string,
    profileurl: string,
    isauthenticated: boolean,
    channelsList: Array<string>,
    createdat: number,
    id: string,
    unregisterurl: string,
    updatesubscriberurl: string,
    heartbeaturl: string,
    heartbeatintervalms: number,
    idletimeoutms: number,
    responsestatus?: ResponseStatus.AsObject,
  }
}

export class Todo extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getTitle(): string;
  setTitle(value: string): void;

  getOrder(): number;
  setOrder(value: number): void;

  getCompleted(): boolean;
  setCompleted(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Todo.AsObject;
  static toObject(includeInstance: boolean, msg: Todo): Todo.AsObject;
  static serializeBinaryToWriter(message: Todo, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Todo;
  static deserializeBinaryFromReader(message: Todo, reader: jspb.BinaryReader): Todo;
}

export namespace Todo {
  export type AsObject = {
    id: number,
    title: string,
    order: number,
    completed: boolean,
  }
}

export class UnAssignRoles extends jspb.Message {
  getUsername(): string;
  setUsername(value: string): void;

  getPermissionsList(): Array<string>;
  setPermissionsList(value: Array<string>): void;
  clearPermissionsList(): void;
  addPermissions(value: string, index?: number): void;

  getRolesList(): Array<string>;
  setRolesList(value: Array<string>): void;
  clearRolesList(): void;
  addRoles(value: string, index?: number): void;

  getMetaMap(): jspb.Map<string, string>;
  clearMetaMap(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UnAssignRoles.AsObject;
  static toObject(includeInstance: boolean, msg: UnAssignRoles): UnAssignRoles.AsObject;
  static serializeBinaryToWriter(message: UnAssignRoles, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UnAssignRoles;
  static deserializeBinaryFromReader(message: UnAssignRoles, reader: jspb.BinaryReader): UnAssignRoles;
}

export namespace UnAssignRoles {
  export type AsObject = {
    username: string,
    permissionsList: Array<string>,
    rolesList: Array<string>,
    metaMap: Array<[string, string]>,
  }
}

export class UnAssignRolesResponse extends jspb.Message {
  getAllrolesList(): Array<string>;
  setAllrolesList(value: Array<string>): void;
  clearAllrolesList(): void;
  addAllroles(value: string, index?: number): void;

  getAllpermissionsList(): Array<string>;
  setAllpermissionsList(value: Array<string>): void;
  clearAllpermissionsList(): void;
  addAllpermissions(value: string, index?: number): void;

  getMetaMap(): jspb.Map<string, string>;
  clearMetaMap(): void;

  getResponsestatus(): ResponseStatus | undefined;
  setResponsestatus(value?: ResponseStatus): void;
  hasResponsestatus(): boolean;
  clearResponsestatus(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UnAssignRolesResponse.AsObject;
  static toObject(includeInstance: boolean, msg: UnAssignRolesResponse): UnAssignRolesResponse.AsObject;
  static serializeBinaryToWriter(message: UnAssignRolesResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UnAssignRolesResponse;
  static deserializeBinaryFromReader(message: UnAssignRolesResponse, reader: jspb.BinaryReader): UnAssignRolesResponse;
}

export namespace UnAssignRolesResponse {
  export type AsObject = {
    allrolesList: Array<string>,
    allpermissionsList: Array<string>,
    metaMap: Array<[string, string]>,
    responsestatus?: ResponseStatus.AsObject,
  }
}

export class UpdateTodo extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getTitle(): string;
  setTitle(value: string): void;

  getOrder(): number;
  setOrder(value: number): void;

  getCompleted(): boolean;
  setCompleted(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateTodo.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateTodo): UpdateTodo.AsObject;
  static serializeBinaryToWriter(message: UpdateTodo, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateTodo;
  static deserializeBinaryFromReader(message: UpdateTodo, reader: jspb.BinaryReader): UpdateTodo;
}

export namespace UpdateTodo {
  export type AsObject = {
    id: number,
    title: string,
    order: number,
    completed: boolean,
  }
}

