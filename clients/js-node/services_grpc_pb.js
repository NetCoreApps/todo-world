// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Options:
// Date: 2019-12-10 21:43:59
// Version: 5.71
// Tip: To override a DTO option, remove "//" prefix before updating
// BaseUrl: https://localhost:5001
//
// //GlobalNamespace: 
// //AddDescriptionAsComments: True
//
'use strict';
var grpc = require('grpc');
var services_pb = require('./services_pb.js');

function serialize_AssignRoles(arg) {
  if (!(arg instanceof services_pb.AssignRoles)) {
    throw new Error('Expected argument of type AssignRoles');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_AssignRoles(buffer_arg) {
  return services_pb.AssignRoles.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_AssignRolesResponse(arg) {
  if (!(arg instanceof services_pb.AssignRolesResponse)) {
    throw new Error('Expected argument of type AssignRolesResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_AssignRolesResponse(buffer_arg) {
  return services_pb.AssignRolesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_Authenticate(arg) {
  if (!(arg instanceof services_pb.Authenticate)) {
    throw new Error('Expected argument of type Authenticate');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_Authenticate(buffer_arg) {
  return services_pb.Authenticate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_AuthenticateResponse(arg) {
  if (!(arg instanceof services_pb.AuthenticateResponse)) {
    throw new Error('Expected argument of type AuthenticateResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_AuthenticateResponse(buffer_arg) {
  return services_pb.AuthenticateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ConvertSessionToToken(arg) {
  if (!(arg instanceof services_pb.ConvertSessionToToken)) {
    throw new Error('Expected argument of type ConvertSessionToToken');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_ConvertSessionToToken(buffer_arg) {
  return services_pb.ConvertSessionToToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ConvertSessionToTokenResponse(arg) {
  if (!(arg instanceof services_pb.ConvertSessionToTokenResponse)) {
    throw new Error('Expected argument of type ConvertSessionToTokenResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_ConvertSessionToTokenResponse(buffer_arg) {
  return services_pb.ConvertSessionToTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_CreateTodo(arg) {
  if (!(arg instanceof services_pb.CreateTodo)) {
    throw new Error('Expected argument of type CreateTodo');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_CreateTodo(buffer_arg) {
  return services_pb.CreateTodo.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_CreateTodoResponse(arg) {
  if (!(arg instanceof services_pb.CreateTodoResponse)) {
    throw new Error('Expected argument of type CreateTodoResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_CreateTodoResponse(buffer_arg) {
  return services_pb.CreateTodoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_DeleteTodo(arg) {
  if (!(arg instanceof services_pb.DeleteTodo)) {
    throw new Error('Expected argument of type DeleteTodo');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_DeleteTodo(buffer_arg) {
  return services_pb.DeleteTodo.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_DeleteTodos(arg) {
  if (!(arg instanceof services_pb.DeleteTodos)) {
    throw new Error('Expected argument of type DeleteTodos');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_DeleteTodos(buffer_arg) {
  return services_pb.DeleteTodos.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_EmptyResponse(arg) {
  if (!(arg instanceof services_pb.EmptyResponse)) {
    throw new Error('Expected argument of type EmptyResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_EmptyResponse(buffer_arg) {
  return services_pb.EmptyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_FileContent(arg) {
  if (!(arg instanceof services_pb.FileContent)) {
    throw new Error('Expected argument of type FileContent');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_FileContent(buffer_arg) {
  return services_pb.FileContent.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_GetAccessToken(arg) {
  if (!(arg instanceof services_pb.GetAccessToken)) {
    throw new Error('Expected argument of type GetAccessToken');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_GetAccessToken(buffer_arg) {
  return services_pb.GetAccessToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_GetAccessTokenResponse(arg) {
  if (!(arg instanceof services_pb.GetAccessTokenResponse)) {
    throw new Error('Expected argument of type GetAccessTokenResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_GetAccessTokenResponse(buffer_arg) {
  return services_pb.GetAccessTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_GetTodo(arg) {
  if (!(arg instanceof services_pb.GetTodo)) {
    throw new Error('Expected argument of type GetTodo');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_GetTodo(buffer_arg) {
  return services_pb.GetTodo.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_GetTodoResponse(arg) {
  if (!(arg instanceof services_pb.GetTodoResponse)) {
    throw new Error('Expected argument of type GetTodoResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_GetTodoResponse(buffer_arg) {
  return services_pb.GetTodoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_GetTodos(arg) {
  if (!(arg instanceof services_pb.GetTodos)) {
    throw new Error('Expected argument of type GetTodos');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_GetTodos(buffer_arg) {
  return services_pb.GetTodos.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_GetTodosResponse(arg) {
  if (!(arg instanceof services_pb.GetTodosResponse)) {
    throw new Error('Expected argument of type GetTodosResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_GetTodosResponse(buffer_arg) {
  return services_pb.GetTodosResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_Hello(arg) {
  if (!(arg instanceof services_pb.Hello)) {
    throw new Error('Expected argument of type Hello');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_Hello(buffer_arg) {
  return services_pb.Hello.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_HelloResponse(arg) {
  if (!(arg instanceof services_pb.HelloResponse)) {
    throw new Error('Expected argument of type HelloResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_HelloResponse(buffer_arg) {
  return services_pb.HelloResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_HelloSecure(arg) {
  if (!(arg instanceof services_pb.HelloSecure)) {
    throw new Error('Expected argument of type HelloSecure');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_HelloSecure(buffer_arg) {
  return services_pb.HelloSecure.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_Register(arg) {
  if (!(arg instanceof services_pb.Register)) {
    throw new Error('Expected argument of type Register');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_Register(buffer_arg) {
  return services_pb.Register.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_RegisterResponse(arg) {
  if (!(arg instanceof services_pb.RegisterResponse)) {
    throw new Error('Expected argument of type RegisterResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_RegisterResponse(buffer_arg) {
  return services_pb.RegisterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ResetTodos(arg) {
  if (!(arg instanceof services_pb.ResetTodos)) {
    throw new Error('Expected argument of type ResetTodos');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_ResetTodos(buffer_arg) {
  return services_pb.ResetTodos.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_StreamFiles(arg) {
  if (!(arg instanceof services_pb.StreamFiles)) {
    throw new Error('Expected argument of type StreamFiles');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_StreamFiles(buffer_arg) {
  return services_pb.StreamFiles.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_StreamServerEvents(arg) {
  if (!(arg instanceof services_pb.StreamServerEvents)) {
    throw new Error('Expected argument of type StreamServerEvents');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_StreamServerEvents(buffer_arg) {
  return services_pb.StreamServerEvents.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_StreamServerEventsResponse(arg) {
  if (!(arg instanceof services_pb.StreamServerEventsResponse)) {
    throw new Error('Expected argument of type StreamServerEventsResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_StreamServerEventsResponse(buffer_arg) {
  return services_pb.StreamServerEventsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_UnAssignRoles(arg) {
  if (!(arg instanceof services_pb.UnAssignRoles)) {
    throw new Error('Expected argument of type UnAssignRoles');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_UnAssignRoles(buffer_arg) {
  return services_pb.UnAssignRoles.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_UnAssignRolesResponse(arg) {
  if (!(arg instanceof services_pb.UnAssignRolesResponse)) {
    throw new Error('Expected argument of type UnAssignRolesResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_UnAssignRolesResponse(buffer_arg) {
  return services_pb.UnAssignRolesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_UpdateTodo(arg) {
  if (!(arg instanceof services_pb.UpdateTodo)) {
    throw new Error('Expected argument of type UpdateTodo');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_UpdateTodo(buffer_arg) {
  return services_pb.UpdateTodo.deserializeBinary(new Uint8Array(buffer_arg));
}


var GrpcServicesService = exports.GrpcServicesService = {
  postAssignRoles: {
    path: '/GrpcServices/PostAssignRoles',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.AssignRoles,
    responseType: services_pb.AssignRolesResponse,
    requestSerialize: serialize_AssignRoles,
    requestDeserialize: deserialize_AssignRoles,
    responseSerialize: serialize_AssignRolesResponse,
    responseDeserialize: deserialize_AssignRolesResponse,
  },
  optionsAuthenticate: {
    path: '/GrpcServices/OptionsAuthenticate',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.Authenticate,
    responseType: services_pb.AuthenticateResponse,
    requestSerialize: serialize_Authenticate,
    requestDeserialize: deserialize_Authenticate,
    responseSerialize: serialize_AuthenticateResponse,
    responseDeserialize: deserialize_AuthenticateResponse,
  },
  getAuthenticate: {
    path: '/GrpcServices/GetAuthenticate',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.Authenticate,
    responseType: services_pb.AuthenticateResponse,
    requestSerialize: serialize_Authenticate,
    requestDeserialize: deserialize_Authenticate,
    responseSerialize: serialize_AuthenticateResponse,
    responseDeserialize: deserialize_AuthenticateResponse,
  },
  postAuthenticate: {
    path: '/GrpcServices/PostAuthenticate',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.Authenticate,
    responseType: services_pb.AuthenticateResponse,
    requestSerialize: serialize_Authenticate,
    requestDeserialize: deserialize_Authenticate,
    responseSerialize: serialize_AuthenticateResponse,
    responseDeserialize: deserialize_AuthenticateResponse,
  },
  deleteAuthenticate: {
    path: '/GrpcServices/DeleteAuthenticate',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.Authenticate,
    responseType: services_pb.AuthenticateResponse,
    requestSerialize: serialize_Authenticate,
    requestDeserialize: deserialize_Authenticate,
    responseSerialize: serialize_AuthenticateResponse,
    responseDeserialize: deserialize_AuthenticateResponse,
  },
  postConvertSessionToToken: {
    path: '/GrpcServices/PostConvertSessionToToken',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.ConvertSessionToToken,
    responseType: services_pb.ConvertSessionToTokenResponse,
    requestSerialize: serialize_ConvertSessionToToken,
    requestDeserialize: deserialize_ConvertSessionToToken,
    responseSerialize: serialize_ConvertSessionToTokenResponse,
    responseDeserialize: deserialize_ConvertSessionToTokenResponse,
  },
  postCreateTodo: {
    path: '/GrpcServices/PostCreateTodo',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.CreateTodo,
    responseType: services_pb.CreateTodoResponse,
    requestSerialize: serialize_CreateTodo,
    requestDeserialize: deserialize_CreateTodo,
    responseSerialize: serialize_CreateTodoResponse,
    responseDeserialize: deserialize_CreateTodoResponse,
  },
  callDeleteTodo: {
    path: '/GrpcServices/CallDeleteTodo',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.DeleteTodo,
    responseType: services_pb.EmptyResponse,
    requestSerialize: serialize_DeleteTodo,
    requestDeserialize: deserialize_DeleteTodo,
    responseSerialize: serialize_EmptyResponse,
    responseDeserialize: deserialize_EmptyResponse,
  },
  callDeleteTodos: {
    path: '/GrpcServices/CallDeleteTodos',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.DeleteTodos,
    responseType: services_pb.EmptyResponse,
    requestSerialize: serialize_DeleteTodos,
    requestDeserialize: deserialize_DeleteTodos,
    responseSerialize: serialize_EmptyResponse,
    responseDeserialize: deserialize_EmptyResponse,
  },
  postGetAccessToken: {
    path: '/GrpcServices/PostGetAccessToken',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.GetAccessToken,
    responseType: services_pb.GetAccessTokenResponse,
    requestSerialize: serialize_GetAccessToken,
    requestDeserialize: deserialize_GetAccessToken,
    responseSerialize: serialize_GetAccessTokenResponse,
    responseDeserialize: deserialize_GetAccessTokenResponse,
  },
  callGetTodo: {
    path: '/GrpcServices/CallGetTodo',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.GetTodo,
    responseType: services_pb.GetTodoResponse,
    requestSerialize: serialize_GetTodo,
    requestDeserialize: deserialize_GetTodo,
    responseSerialize: serialize_GetTodoResponse,
    responseDeserialize: deserialize_GetTodoResponse,
  },
  callGetTodos: {
    path: '/GrpcServices/CallGetTodos',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.GetTodos,
    responseType: services_pb.GetTodosResponse,
    requestSerialize: serialize_GetTodos,
    requestDeserialize: deserialize_GetTodos,
    responseSerialize: serialize_GetTodosResponse,
    responseDeserialize: deserialize_GetTodosResponse,
  },
  getHello: {
    path: '/GrpcServices/GetHello',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.Hello,
    responseType: services_pb.HelloResponse,
    requestSerialize: serialize_Hello,
    requestDeserialize: deserialize_Hello,
    responseSerialize: serialize_HelloResponse,
    responseDeserialize: deserialize_HelloResponse,
  },
  postHello: {
    path: '/GrpcServices/PostHello',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.Hello,
    responseType: services_pb.HelloResponse,
    requestSerialize: serialize_Hello,
    requestDeserialize: deserialize_Hello,
    responseSerialize: serialize_HelloResponse,
    responseDeserialize: deserialize_HelloResponse,
  },
  putHello: {
    path: '/GrpcServices/PutHello',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.Hello,
    responseType: services_pb.HelloResponse,
    requestSerialize: serialize_Hello,
    requestDeserialize: deserialize_Hello,
    responseSerialize: serialize_HelloResponse,
    responseDeserialize: deserialize_HelloResponse,
  },
  deleteHello: {
    path: '/GrpcServices/DeleteHello',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.Hello,
    responseType: services_pb.HelloResponse,
    requestSerialize: serialize_Hello,
    requestDeserialize: deserialize_Hello,
    responseSerialize: serialize_HelloResponse,
    responseDeserialize: deserialize_HelloResponse,
  },
  patchHello: {
    path: '/GrpcServices/PatchHello',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.Hello,
    responseType: services_pb.HelloResponse,
    requestSerialize: serialize_Hello,
    requestDeserialize: deserialize_Hello,
    responseSerialize: serialize_HelloResponse,
    responseDeserialize: deserialize_HelloResponse,
  },
  getHelloSecure: {
    path: '/GrpcServices/GetHelloSecure',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.HelloSecure,
    responseType: services_pb.HelloResponse,
    requestSerialize: serialize_HelloSecure,
    requestDeserialize: deserialize_HelloSecure,
    responseSerialize: serialize_HelloResponse,
    responseDeserialize: deserialize_HelloResponse,
  },
  postHelloSecure: {
    path: '/GrpcServices/PostHelloSecure',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.HelloSecure,
    responseType: services_pb.HelloResponse,
    requestSerialize: serialize_HelloSecure,
    requestDeserialize: deserialize_HelloSecure,
    responseSerialize: serialize_HelloResponse,
    responseDeserialize: deserialize_HelloResponse,
  },
  putHelloSecure: {
    path: '/GrpcServices/PutHelloSecure',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.HelloSecure,
    responseType: services_pb.HelloResponse,
    requestSerialize: serialize_HelloSecure,
    requestDeserialize: deserialize_HelloSecure,
    responseSerialize: serialize_HelloResponse,
    responseDeserialize: deserialize_HelloResponse,
  },
  deleteHelloSecure: {
    path: '/GrpcServices/DeleteHelloSecure',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.HelloSecure,
    responseType: services_pb.HelloResponse,
    requestSerialize: serialize_HelloSecure,
    requestDeserialize: deserialize_HelloSecure,
    responseSerialize: serialize_HelloResponse,
    responseDeserialize: deserialize_HelloResponse,
  },
  patchHelloSecure: {
    path: '/GrpcServices/PatchHelloSecure',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.HelloSecure,
    responseType: services_pb.HelloResponse,
    requestSerialize: serialize_HelloSecure,
    requestDeserialize: deserialize_HelloSecure,
    responseSerialize: serialize_HelloResponse,
    responseDeserialize: deserialize_HelloResponse,
  },
  putRegister: {
    path: '/GrpcServices/PutRegister',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.Register,
    responseType: services_pb.RegisterResponse,
    requestSerialize: serialize_Register,
    requestDeserialize: deserialize_Register,
    responseSerialize: serialize_RegisterResponse,
    responseDeserialize: deserialize_RegisterResponse,
  },
  postRegister: {
    path: '/GrpcServices/PostRegister',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.Register,
    responseType: services_pb.RegisterResponse,
    requestSerialize: serialize_Register,
    requestDeserialize: deserialize_Register,
    responseSerialize: serialize_RegisterResponse,
    responseDeserialize: deserialize_RegisterResponse,
  },
  postResetTodos: {
    path: '/GrpcServices/PostResetTodos',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.ResetTodos,
    responseType: services_pb.EmptyResponse,
    requestSerialize: serialize_ResetTodos,
    requestDeserialize: deserialize_ResetTodos,
    responseSerialize: serialize_EmptyResponse,
    responseDeserialize: deserialize_EmptyResponse,
  },
  serverStreamFiles: {
    path: '/GrpcServices/ServerStreamFiles',
    requestStream: false,
    responseStream: true,
    requestType: services_pb.StreamFiles,
    responseType: services_pb.FileContent,
    requestSerialize: serialize_StreamFiles,
    requestDeserialize: deserialize_StreamFiles,
    responseSerialize: serialize_FileContent,
    responseDeserialize: deserialize_FileContent,
  },
  serverStreamServerEvents: {
    path: '/GrpcServices/ServerStreamServerEvents',
    requestStream: false,
    responseStream: true,
    requestType: services_pb.StreamServerEvents,
    responseType: services_pb.StreamServerEventsResponse,
    requestSerialize: serialize_StreamServerEvents,
    requestDeserialize: deserialize_StreamServerEvents,
    responseSerialize: serialize_StreamServerEventsResponse,
    responseDeserialize: deserialize_StreamServerEventsResponse,
  },
  postUnAssignRoles: {
    path: '/GrpcServices/PostUnAssignRoles',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.UnAssignRoles,
    responseType: services_pb.UnAssignRolesResponse,
    requestSerialize: serialize_UnAssignRoles,
    requestDeserialize: deserialize_UnAssignRoles,
    responseSerialize: serialize_UnAssignRolesResponse,
    responseDeserialize: deserialize_UnAssignRolesResponse,
  },
  putUpdateTodo: {
    path: '/GrpcServices/PutUpdateTodo',
    requestStream: false,
    responseStream: false,
    requestType: services_pb.UpdateTodo,
    responseType: services_pb.EmptyResponse,
    requestSerialize: serialize_UpdateTodo,
    requestDeserialize: deserialize_UpdateTodo,
    responseSerialize: serialize_EmptyResponse,
    responseDeserialize: deserialize_EmptyResponse,
  },
};

exports.GrpcServicesClient = grpc.makeGenericClientConstructor(GrpcServicesService);
