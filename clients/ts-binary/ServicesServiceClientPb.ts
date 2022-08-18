/**
 * @fileoverview gRPC-Web generated client stub for 
 * @enhanceable
 * @public
 */

// GENERATED CODE -- DO NOT EDIT!


import * as grpcWeb from 'grpc-web';

import {
  AssignRoles,
  AssignRolesResponse,
  Authenticate,
  AuthenticateResponse,
  ConvertSessionToToken,
  ConvertSessionToTokenResponse,
  CreateTodo,
  CreateTodoResponse,
  DeleteTodo,
  DeleteTodos,
  EmptyResponse,
  FileContent,
  GetAccessToken,
  GetAccessTokenResponse,
  GetTodo,
  GetTodoResponse,
  GetTodos,
  GetTodosResponse,
  Hello,
  HelloResponse,
  HelloSecure,
  Register,
  RegisterResponse,
  ResetTodos,
  StreamFiles,
  StreamServerEvents,
  StreamServerEventsResponse,
  UnAssignRoles,
  UnAssignRolesResponse,
  UpdateTodo} from './services_pb';

export class GrpcServicesClient {
  client_: grpcWeb.AbstractClientBase;
  hostname_: string;
  credentials_: null | { [index: string]: string; };
  options_: null | { [index: string]: string; };

  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: string; }) {
    if (!options) options = {};
    if (!credentials) credentials = {};
    options['format'] = 'binary';

    this.client_ = new grpcWeb.GrpcWebClientBase(options);
    this.hostname_ = hostname;
    this.credentials_ = credentials;
    this.options_ = options;
  }

  methodInfoPostAssignRoles = new grpcWeb.AbstractClientBase.MethodInfo(
    AssignRolesResponse,
    (request: AssignRoles) => {
      return request.serializeBinary();
    },
    AssignRolesResponse.deserializeBinary
  );

  postAssignRoles(
    request: AssignRoles,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: AssignRolesResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/PostAssignRoles',
      request,
      metadata || {},
      this.methodInfoPostAssignRoles,
      callback);
  }

  methodInfoOptionsAuthenticate = new grpcWeb.AbstractClientBase.MethodInfo(
    AuthenticateResponse,
    (request: Authenticate) => {
      return request.serializeBinary();
    },
    AuthenticateResponse.deserializeBinary
  );

  optionsAuthenticate(
    request: Authenticate,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: AuthenticateResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/OptionsAuthenticate',
      request,
      metadata || {},
      this.methodInfoOptionsAuthenticate,
      callback);
  }

  methodInfoGetAuthenticate = new grpcWeb.AbstractClientBase.MethodInfo(
    AuthenticateResponse,
    (request: Authenticate) => {
      return request.serializeBinary();
    },
    AuthenticateResponse.deserializeBinary
  );

  getAuthenticate(
    request: Authenticate,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: AuthenticateResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/GetAuthenticate',
      request,
      metadata || {},
      this.methodInfoGetAuthenticate,
      callback);
  }

  methodInfoPostAuthenticate = new grpcWeb.AbstractClientBase.MethodInfo(
    AuthenticateResponse,
    (request: Authenticate) => {
      return request.serializeBinary();
    },
    AuthenticateResponse.deserializeBinary
  );

  postAuthenticate(
    request: Authenticate,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: AuthenticateResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/PostAuthenticate',
      request,
      metadata || {},
      this.methodInfoPostAuthenticate,
      callback);
  }

  methodInfoDeleteAuthenticate = new grpcWeb.AbstractClientBase.MethodInfo(
    AuthenticateResponse,
    (request: Authenticate) => {
      return request.serializeBinary();
    },
    AuthenticateResponse.deserializeBinary
  );

  deleteAuthenticate(
    request: Authenticate,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: AuthenticateResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/DeleteAuthenticate',
      request,
      metadata || {},
      this.methodInfoDeleteAuthenticate,
      callback);
  }

  methodInfoPostConvertSessionToToken = new grpcWeb.AbstractClientBase.MethodInfo(
    ConvertSessionToTokenResponse,
    (request: ConvertSessionToToken) => {
      return request.serializeBinary();
    },
    ConvertSessionToTokenResponse.deserializeBinary
  );

  postConvertSessionToToken(
    request: ConvertSessionToToken,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: ConvertSessionToTokenResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/PostConvertSessionToToken',
      request,
      metadata || {},
      this.methodInfoPostConvertSessionToToken,
      callback);
  }

  methodInfoPostCreateTodo = new grpcWeb.AbstractClientBase.MethodInfo(
    CreateTodoResponse,
    (request: CreateTodo) => {
      return request.serializeBinary();
    },
    CreateTodoResponse.deserializeBinary
  );

  postCreateTodo(
    request: CreateTodo,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: CreateTodoResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/PostCreateTodo',
      request,
      metadata || {},
      this.methodInfoPostCreateTodo,
      callback);
  }

  methodInfoCallDeleteTodo = new grpcWeb.AbstractClientBase.MethodInfo(
    EmptyResponse,
    (request: DeleteTodo) => {
      return request.serializeBinary();
    },
    EmptyResponse.deserializeBinary
  );

  callDeleteTodo(
    request: DeleteTodo,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: EmptyResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/CallDeleteTodo',
      request,
      metadata || {},
      this.methodInfoCallDeleteTodo,
      callback);
  }

  methodInfoCallDeleteTodos = new grpcWeb.AbstractClientBase.MethodInfo(
    EmptyResponse,
    (request: DeleteTodos) => {
      return request.serializeBinary();
    },
    EmptyResponse.deserializeBinary
  );

  callDeleteTodos(
    request: DeleteTodos,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: EmptyResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/CallDeleteTodos',
      request,
      metadata || {},
      this.methodInfoCallDeleteTodos,
      callback);
  }

  methodInfoPostGetAccessToken = new grpcWeb.AbstractClientBase.MethodInfo(
    GetAccessTokenResponse,
    (request: GetAccessToken) => {
      return request.serializeBinary();
    },
    GetAccessTokenResponse.deserializeBinary
  );

  postGetAccessToken(
    request: GetAccessToken,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: GetAccessTokenResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/PostGetAccessToken',
      request,
      metadata || {},
      this.methodInfoPostGetAccessToken,
      callback);
  }

  methodInfoCallGetTodo = new grpcWeb.AbstractClientBase.MethodInfo(
    GetTodoResponse,
    (request: GetTodo) => {
      return request.serializeBinary();
    },
    GetTodoResponse.deserializeBinary
  );

  callGetTodo(
    request: GetTodo,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: GetTodoResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/CallGetTodo',
      request,
      metadata || {},
      this.methodInfoCallGetTodo,
      callback);
  }

  methodInfoCallGetTodos = new grpcWeb.AbstractClientBase.MethodInfo(
    GetTodosResponse,
    (request: GetTodos) => {
      return request.serializeBinary();
    },
    GetTodosResponse.deserializeBinary
  );

  callGetTodos(
    request: GetTodos,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: GetTodosResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/CallGetTodos',
      request,
      metadata || {},
      this.methodInfoCallGetTodos,
      callback);
  }

  methodInfoGetHello = new grpcWeb.AbstractClientBase.MethodInfo(
    HelloResponse,
    (request: Hello) => {
      return request.serializeBinary();
    },
    HelloResponse.deserializeBinary
  );

  getHello(
    request: Hello,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: HelloResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/GetHello',
      request,
      metadata || {},
      this.methodInfoGetHello,
      callback);
  }

  methodInfoPostHello = new grpcWeb.AbstractClientBase.MethodInfo(
    HelloResponse,
    (request: Hello) => {
      return request.serializeBinary();
    },
    HelloResponse.deserializeBinary
  );

  postHello(
    request: Hello,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: HelloResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/PostHello',
      request,
      metadata || {},
      this.methodInfoPostHello,
      callback);
  }

  methodInfoPutHello = new grpcWeb.AbstractClientBase.MethodInfo(
    HelloResponse,
    (request: Hello) => {
      return request.serializeBinary();
    },
    HelloResponse.deserializeBinary
  );

  putHello(
    request: Hello,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: HelloResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/PutHello',
      request,
      metadata || {},
      this.methodInfoPutHello,
      callback);
  }

  methodInfoDeleteHello = new grpcWeb.AbstractClientBase.MethodInfo(
    HelloResponse,
    (request: Hello) => {
      return request.serializeBinary();
    },
    HelloResponse.deserializeBinary
  );

  deleteHello(
    request: Hello,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: HelloResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/DeleteHello',
      request,
      metadata || {},
      this.methodInfoDeleteHello,
      callback);
  }

  methodInfoPatchHello = new grpcWeb.AbstractClientBase.MethodInfo(
    HelloResponse,
    (request: Hello) => {
      return request.serializeBinary();
    },
    HelloResponse.deserializeBinary
  );

  patchHello(
    request: Hello,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: HelloResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/PatchHello',
      request,
      metadata || {},
      this.methodInfoPatchHello,
      callback);
  }

  methodInfoGetHelloSecure = new grpcWeb.AbstractClientBase.MethodInfo(
    HelloResponse,
    (request: HelloSecure) => {
      return request.serializeBinary();
    },
    HelloResponse.deserializeBinary
  );

  getHelloSecure(
    request: HelloSecure,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: HelloResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/GetHelloSecure',
      request,
      metadata || {},
      this.methodInfoGetHelloSecure,
      callback);
  }

  methodInfoPostHelloSecure = new grpcWeb.AbstractClientBase.MethodInfo(
    HelloResponse,
    (request: HelloSecure) => {
      return request.serializeBinary();
    },
    HelloResponse.deserializeBinary
  );

  postHelloSecure(
    request: HelloSecure,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: HelloResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/PostHelloSecure',
      request,
      metadata || {},
      this.methodInfoPostHelloSecure,
      callback);
  }

  methodInfoPutHelloSecure = new grpcWeb.AbstractClientBase.MethodInfo(
    HelloResponse,
    (request: HelloSecure) => {
      return request.serializeBinary();
    },
    HelloResponse.deserializeBinary
  );

  putHelloSecure(
    request: HelloSecure,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: HelloResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/PutHelloSecure',
      request,
      metadata || {},
      this.methodInfoPutHelloSecure,
      callback);
  }

  methodInfoDeleteHelloSecure = new grpcWeb.AbstractClientBase.MethodInfo(
    HelloResponse,
    (request: HelloSecure) => {
      return request.serializeBinary();
    },
    HelloResponse.deserializeBinary
  );

  deleteHelloSecure(
    request: HelloSecure,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: HelloResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/DeleteHelloSecure',
      request,
      metadata || {},
      this.methodInfoDeleteHelloSecure,
      callback);
  }

  methodInfoPatchHelloSecure = new grpcWeb.AbstractClientBase.MethodInfo(
    HelloResponse,
    (request: HelloSecure) => {
      return request.serializeBinary();
    },
    HelloResponse.deserializeBinary
  );

  patchHelloSecure(
    request: HelloSecure,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: HelloResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/PatchHelloSecure',
      request,
      metadata || {},
      this.methodInfoPatchHelloSecure,
      callback);
  }

  methodInfoPutRegister = new grpcWeb.AbstractClientBase.MethodInfo(
    RegisterResponse,
    (request: Register) => {
      return request.serializeBinary();
    },
    RegisterResponse.deserializeBinary
  );

  putRegister(
    request: Register,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: RegisterResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/PutRegister',
      request,
      metadata || {},
      this.methodInfoPutRegister,
      callback);
  }

  methodInfoPostRegister = new grpcWeb.AbstractClientBase.MethodInfo(
    RegisterResponse,
    (request: Register) => {
      return request.serializeBinary();
    },
    RegisterResponse.deserializeBinary
  );

  postRegister(
    request: Register,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: RegisterResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/PostRegister',
      request,
      metadata || {},
      this.methodInfoPostRegister,
      callback);
  }

  methodInfoPostResetTodos = new grpcWeb.AbstractClientBase.MethodInfo(
    EmptyResponse,
    (request: ResetTodos) => {
      return request.serializeBinary();
    },
    EmptyResponse.deserializeBinary
  );

  postResetTodos(
    request: ResetTodos,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: EmptyResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/PostResetTodos',
      request,
      metadata || {},
      this.methodInfoPostResetTodos,
      callback);
  }

  methodInfoServerStreamFiles = new grpcWeb.AbstractClientBase.MethodInfo(
    FileContent,
    (request: StreamFiles) => {
      return request.serializeBinary();
    },
    FileContent.deserializeBinary
  );

  serverStreamFiles(
    request: StreamFiles,
    metadata?: grpcWeb.Metadata) {
    return this.client_.serverStreaming(
      this.hostname_ +
        '/GrpcServices/ServerStreamFiles',
      request,
      metadata || {},
      this.methodInfoServerStreamFiles);
  }

  methodInfoServerStreamServerEvents = new grpcWeb.AbstractClientBase.MethodInfo(
    StreamServerEventsResponse,
    (request: StreamServerEvents) => {
      return request.serializeBinary();
    },
    StreamServerEventsResponse.deserializeBinary
  );

  serverStreamServerEvents(
    request: StreamServerEvents,
    metadata?: grpcWeb.Metadata) {
    return this.client_.serverStreaming(
      this.hostname_ +
        '/GrpcServices/ServerStreamServerEvents',
      request,
      metadata || {},
      this.methodInfoServerStreamServerEvents);
  }

  methodInfoPostUnAssignRoles = new grpcWeb.AbstractClientBase.MethodInfo(
    UnAssignRolesResponse,
    (request: UnAssignRoles) => {
      return request.serializeBinary();
    },
    UnAssignRolesResponse.deserializeBinary
  );

  postUnAssignRoles(
    request: UnAssignRoles,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: UnAssignRolesResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/PostUnAssignRoles',
      request,
      metadata || {},
      this.methodInfoPostUnAssignRoles,
      callback);
  }

  methodInfoPutUpdateTodo = new grpcWeb.AbstractClientBase.MethodInfo(
    EmptyResponse,
    (request: UpdateTodo) => {
      return request.serializeBinary();
    },
    EmptyResponse.deserializeBinary
  );

  putUpdateTodo(
    request: UpdateTodo,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: EmptyResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/GrpcServices/PutUpdateTodo',
      request,
      metadata || {},
      this.methodInfoPutUpdateTodo,
      callback);
  }

}

