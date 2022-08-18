/**
 * @fileoverview gRPC-Web generated client stub for 
 * @enhanceable
 * @public
 */

// GENERATED CODE -- DO NOT EDIT!



const grpc = {};
grpc.web = require('grpc-web');

const proto = require('./services_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.GrpcServicesClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

};


/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.GrpcServicesPromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.AssignRoles,
 *   !proto.AssignRolesResponse>}
 */
const methodDescriptor_GrpcServices_PostAssignRoles = new grpc.web.MethodDescriptor(
  '/GrpcServices/PostAssignRoles',
  grpc.web.MethodType.UNARY,
  proto.AssignRoles,
  proto.AssignRolesResponse,
  /**
   * @param {!proto.AssignRoles} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.AssignRolesResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.AssignRoles,
 *   !proto.AssignRolesResponse>}
 */
const methodInfo_GrpcServices_PostAssignRoles = new grpc.web.AbstractClientBase.MethodInfo(
  proto.AssignRolesResponse,
  /**
   * @param {!proto.AssignRoles} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.AssignRolesResponse.deserializeBinary
);


/**
 * @param {!proto.AssignRoles} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.AssignRolesResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.AssignRolesResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.postAssignRoles =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/PostAssignRoles',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostAssignRoles,
      callback);
};


/**
 * @param {!proto.AssignRoles} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.AssignRolesResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.postAssignRoles =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/PostAssignRoles',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostAssignRoles);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.Authenticate,
 *   !proto.AuthenticateResponse>}
 */
const methodDescriptor_GrpcServices_OptionsAuthenticate = new grpc.web.MethodDescriptor(
  '/GrpcServices/OptionsAuthenticate',
  grpc.web.MethodType.UNARY,
  proto.Authenticate,
  proto.AuthenticateResponse,
  /**
   * @param {!proto.Authenticate} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.AuthenticateResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.Authenticate,
 *   !proto.AuthenticateResponse>}
 */
const methodInfo_GrpcServices_OptionsAuthenticate = new grpc.web.AbstractClientBase.MethodInfo(
  proto.AuthenticateResponse,
  /**
   * @param {!proto.Authenticate} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.AuthenticateResponse.deserializeBinary
);


/**
 * @param {!proto.Authenticate} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.AuthenticateResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.AuthenticateResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.optionsAuthenticate =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/OptionsAuthenticate',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_OptionsAuthenticate,
      callback);
};


/**
 * @param {!proto.Authenticate} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.AuthenticateResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.optionsAuthenticate =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/OptionsAuthenticate',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_OptionsAuthenticate);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.Authenticate,
 *   !proto.AuthenticateResponse>}
 */
const methodDescriptor_GrpcServices_GetAuthenticate = new grpc.web.MethodDescriptor(
  '/GrpcServices/GetAuthenticate',
  grpc.web.MethodType.UNARY,
  proto.Authenticate,
  proto.AuthenticateResponse,
  /**
   * @param {!proto.Authenticate} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.AuthenticateResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.Authenticate,
 *   !proto.AuthenticateResponse>}
 */
const methodInfo_GrpcServices_GetAuthenticate = new grpc.web.AbstractClientBase.MethodInfo(
  proto.AuthenticateResponse,
  /**
   * @param {!proto.Authenticate} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.AuthenticateResponse.deserializeBinary
);


/**
 * @param {!proto.Authenticate} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.AuthenticateResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.AuthenticateResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.getAuthenticate =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/GetAuthenticate',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_GetAuthenticate,
      callback);
};


/**
 * @param {!proto.Authenticate} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.AuthenticateResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.getAuthenticate =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/GetAuthenticate',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_GetAuthenticate);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.Authenticate,
 *   !proto.AuthenticateResponse>}
 */
const methodDescriptor_GrpcServices_PostAuthenticate = new grpc.web.MethodDescriptor(
  '/GrpcServices/PostAuthenticate',
  grpc.web.MethodType.UNARY,
  proto.Authenticate,
  proto.AuthenticateResponse,
  /**
   * @param {!proto.Authenticate} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.AuthenticateResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.Authenticate,
 *   !proto.AuthenticateResponse>}
 */
const methodInfo_GrpcServices_PostAuthenticate = new grpc.web.AbstractClientBase.MethodInfo(
  proto.AuthenticateResponse,
  /**
   * @param {!proto.Authenticate} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.AuthenticateResponse.deserializeBinary
);


/**
 * @param {!proto.Authenticate} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.AuthenticateResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.AuthenticateResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.postAuthenticate =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/PostAuthenticate',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostAuthenticate,
      callback);
};


/**
 * @param {!proto.Authenticate} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.AuthenticateResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.postAuthenticate =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/PostAuthenticate',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostAuthenticate);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.Authenticate,
 *   !proto.AuthenticateResponse>}
 */
const methodDescriptor_GrpcServices_DeleteAuthenticate = new grpc.web.MethodDescriptor(
  '/GrpcServices/DeleteAuthenticate',
  grpc.web.MethodType.UNARY,
  proto.Authenticate,
  proto.AuthenticateResponse,
  /**
   * @param {!proto.Authenticate} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.AuthenticateResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.Authenticate,
 *   !proto.AuthenticateResponse>}
 */
const methodInfo_GrpcServices_DeleteAuthenticate = new grpc.web.AbstractClientBase.MethodInfo(
  proto.AuthenticateResponse,
  /**
   * @param {!proto.Authenticate} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.AuthenticateResponse.deserializeBinary
);


/**
 * @param {!proto.Authenticate} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.AuthenticateResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.AuthenticateResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.deleteAuthenticate =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/DeleteAuthenticate',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_DeleteAuthenticate,
      callback);
};


/**
 * @param {!proto.Authenticate} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.AuthenticateResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.deleteAuthenticate =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/DeleteAuthenticate',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_DeleteAuthenticate);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.ConvertSessionToToken,
 *   !proto.ConvertSessionToTokenResponse>}
 */
const methodDescriptor_GrpcServices_PostConvertSessionToToken = new grpc.web.MethodDescriptor(
  '/GrpcServices/PostConvertSessionToToken',
  grpc.web.MethodType.UNARY,
  proto.ConvertSessionToToken,
  proto.ConvertSessionToTokenResponse,
  /**
   * @param {!proto.ConvertSessionToToken} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ConvertSessionToTokenResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ConvertSessionToToken,
 *   !proto.ConvertSessionToTokenResponse>}
 */
const methodInfo_GrpcServices_PostConvertSessionToToken = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ConvertSessionToTokenResponse,
  /**
   * @param {!proto.ConvertSessionToToken} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ConvertSessionToTokenResponse.deserializeBinary
);


/**
 * @param {!proto.ConvertSessionToToken} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ConvertSessionToTokenResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ConvertSessionToTokenResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.postConvertSessionToToken =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/PostConvertSessionToToken',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostConvertSessionToToken,
      callback);
};


/**
 * @param {!proto.ConvertSessionToToken} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ConvertSessionToTokenResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.postConvertSessionToToken =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/PostConvertSessionToToken',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostConvertSessionToToken);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.CreateTodo,
 *   !proto.CreateTodoResponse>}
 */
const methodDescriptor_GrpcServices_PostCreateTodo = new grpc.web.MethodDescriptor(
  '/GrpcServices/PostCreateTodo',
  grpc.web.MethodType.UNARY,
  proto.CreateTodo,
  proto.CreateTodoResponse,
  /**
   * @param {!proto.CreateTodo} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.CreateTodoResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.CreateTodo,
 *   !proto.CreateTodoResponse>}
 */
const methodInfo_GrpcServices_PostCreateTodo = new grpc.web.AbstractClientBase.MethodInfo(
  proto.CreateTodoResponse,
  /**
   * @param {!proto.CreateTodo} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.CreateTodoResponse.deserializeBinary
);


/**
 * @param {!proto.CreateTodo} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.CreateTodoResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.CreateTodoResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.postCreateTodo =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/PostCreateTodo',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostCreateTodo,
      callback);
};


/**
 * @param {!proto.CreateTodo} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.CreateTodoResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.postCreateTodo =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/PostCreateTodo',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostCreateTodo);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.DeleteTodo,
 *   !proto.EmptyResponse>}
 */
const methodDescriptor_GrpcServices_CallDeleteTodo = new grpc.web.MethodDescriptor(
  '/GrpcServices/CallDeleteTodo',
  grpc.web.MethodType.UNARY,
  proto.DeleteTodo,
  proto.EmptyResponse,
  /**
   * @param {!proto.DeleteTodo} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.EmptyResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.DeleteTodo,
 *   !proto.EmptyResponse>}
 */
const methodInfo_GrpcServices_CallDeleteTodo = new grpc.web.AbstractClientBase.MethodInfo(
  proto.EmptyResponse,
  /**
   * @param {!proto.DeleteTodo} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.EmptyResponse.deserializeBinary
);


/**
 * @param {!proto.DeleteTodo} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.EmptyResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.EmptyResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.callDeleteTodo =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/CallDeleteTodo',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_CallDeleteTodo,
      callback);
};


/**
 * @param {!proto.DeleteTodo} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.EmptyResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.callDeleteTodo =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/CallDeleteTodo',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_CallDeleteTodo);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.DeleteTodos,
 *   !proto.EmptyResponse>}
 */
const methodDescriptor_GrpcServices_CallDeleteTodos = new grpc.web.MethodDescriptor(
  '/GrpcServices/CallDeleteTodos',
  grpc.web.MethodType.UNARY,
  proto.DeleteTodos,
  proto.EmptyResponse,
  /**
   * @param {!proto.DeleteTodos} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.EmptyResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.DeleteTodos,
 *   !proto.EmptyResponse>}
 */
const methodInfo_GrpcServices_CallDeleteTodos = new grpc.web.AbstractClientBase.MethodInfo(
  proto.EmptyResponse,
  /**
   * @param {!proto.DeleteTodos} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.EmptyResponse.deserializeBinary
);


/**
 * @param {!proto.DeleteTodos} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.EmptyResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.EmptyResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.callDeleteTodos =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/CallDeleteTodos',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_CallDeleteTodos,
      callback);
};


/**
 * @param {!proto.DeleteTodos} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.EmptyResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.callDeleteTodos =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/CallDeleteTodos',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_CallDeleteTodos);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.GetAccessToken,
 *   !proto.GetAccessTokenResponse>}
 */
const methodDescriptor_GrpcServices_PostGetAccessToken = new grpc.web.MethodDescriptor(
  '/GrpcServices/PostGetAccessToken',
  grpc.web.MethodType.UNARY,
  proto.GetAccessToken,
  proto.GetAccessTokenResponse,
  /**
   * @param {!proto.GetAccessToken} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.GetAccessTokenResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.GetAccessToken,
 *   !proto.GetAccessTokenResponse>}
 */
const methodInfo_GrpcServices_PostGetAccessToken = new grpc.web.AbstractClientBase.MethodInfo(
  proto.GetAccessTokenResponse,
  /**
   * @param {!proto.GetAccessToken} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.GetAccessTokenResponse.deserializeBinary
);


/**
 * @param {!proto.GetAccessToken} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.GetAccessTokenResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.GetAccessTokenResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.postGetAccessToken =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/PostGetAccessToken',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostGetAccessToken,
      callback);
};


/**
 * @param {!proto.GetAccessToken} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.GetAccessTokenResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.postGetAccessToken =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/PostGetAccessToken',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostGetAccessToken);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.GetTodo,
 *   !proto.GetTodoResponse>}
 */
const methodDescriptor_GrpcServices_CallGetTodo = new grpc.web.MethodDescriptor(
  '/GrpcServices/CallGetTodo',
  grpc.web.MethodType.UNARY,
  proto.GetTodo,
  proto.GetTodoResponse,
  /**
   * @param {!proto.GetTodo} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.GetTodoResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.GetTodo,
 *   !proto.GetTodoResponse>}
 */
const methodInfo_GrpcServices_CallGetTodo = new grpc.web.AbstractClientBase.MethodInfo(
  proto.GetTodoResponse,
  /**
   * @param {!proto.GetTodo} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.GetTodoResponse.deserializeBinary
);


/**
 * @param {!proto.GetTodo} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.GetTodoResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.GetTodoResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.callGetTodo =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/CallGetTodo',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_CallGetTodo,
      callback);
};


/**
 * @param {!proto.GetTodo} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.GetTodoResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.callGetTodo =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/CallGetTodo',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_CallGetTodo);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.GetTodos,
 *   !proto.GetTodosResponse>}
 */
const methodDescriptor_GrpcServices_CallGetTodos = new grpc.web.MethodDescriptor(
  '/GrpcServices/CallGetTodos',
  grpc.web.MethodType.UNARY,
  proto.GetTodos,
  proto.GetTodosResponse,
  /**
   * @param {!proto.GetTodos} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.GetTodosResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.GetTodos,
 *   !proto.GetTodosResponse>}
 */
const methodInfo_GrpcServices_CallGetTodos = new grpc.web.AbstractClientBase.MethodInfo(
  proto.GetTodosResponse,
  /**
   * @param {!proto.GetTodos} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.GetTodosResponse.deserializeBinary
);


/**
 * @param {!proto.GetTodos} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.GetTodosResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.GetTodosResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.callGetTodos =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/CallGetTodos',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_CallGetTodos,
      callback);
};


/**
 * @param {!proto.GetTodos} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.GetTodosResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.callGetTodos =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/CallGetTodos',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_CallGetTodos);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.Hello,
 *   !proto.HelloResponse>}
 */
const methodDescriptor_GrpcServices_GetHello = new grpc.web.MethodDescriptor(
  '/GrpcServices/GetHello',
  grpc.web.MethodType.UNARY,
  proto.Hello,
  proto.HelloResponse,
  /**
   * @param {!proto.Hello} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.Hello,
 *   !proto.HelloResponse>}
 */
const methodInfo_GrpcServices_GetHello = new grpc.web.AbstractClientBase.MethodInfo(
  proto.HelloResponse,
  /**
   * @param {!proto.Hello} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @param {!proto.Hello} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.HelloResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.HelloResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.getHello =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/GetHello',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_GetHello,
      callback);
};


/**
 * @param {!proto.Hello} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.HelloResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.getHello =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/GetHello',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_GetHello);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.Hello,
 *   !proto.HelloResponse>}
 */
const methodDescriptor_GrpcServices_PostHello = new grpc.web.MethodDescriptor(
  '/GrpcServices/PostHello',
  grpc.web.MethodType.UNARY,
  proto.Hello,
  proto.HelloResponse,
  /**
   * @param {!proto.Hello} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.Hello,
 *   !proto.HelloResponse>}
 */
const methodInfo_GrpcServices_PostHello = new grpc.web.AbstractClientBase.MethodInfo(
  proto.HelloResponse,
  /**
   * @param {!proto.Hello} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @param {!proto.Hello} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.HelloResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.HelloResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.postHello =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/PostHello',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostHello,
      callback);
};


/**
 * @param {!proto.Hello} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.HelloResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.postHello =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/PostHello',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostHello);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.Hello,
 *   !proto.HelloResponse>}
 */
const methodDescriptor_GrpcServices_PutHello = new grpc.web.MethodDescriptor(
  '/GrpcServices/PutHello',
  grpc.web.MethodType.UNARY,
  proto.Hello,
  proto.HelloResponse,
  /**
   * @param {!proto.Hello} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.Hello,
 *   !proto.HelloResponse>}
 */
const methodInfo_GrpcServices_PutHello = new grpc.web.AbstractClientBase.MethodInfo(
  proto.HelloResponse,
  /**
   * @param {!proto.Hello} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @param {!proto.Hello} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.HelloResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.HelloResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.putHello =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/PutHello',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PutHello,
      callback);
};


/**
 * @param {!proto.Hello} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.HelloResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.putHello =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/PutHello',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PutHello);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.Hello,
 *   !proto.HelloResponse>}
 */
const methodDescriptor_GrpcServices_DeleteHello = new grpc.web.MethodDescriptor(
  '/GrpcServices/DeleteHello',
  grpc.web.MethodType.UNARY,
  proto.Hello,
  proto.HelloResponse,
  /**
   * @param {!proto.Hello} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.Hello,
 *   !proto.HelloResponse>}
 */
const methodInfo_GrpcServices_DeleteHello = new grpc.web.AbstractClientBase.MethodInfo(
  proto.HelloResponse,
  /**
   * @param {!proto.Hello} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @param {!proto.Hello} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.HelloResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.HelloResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.deleteHello =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/DeleteHello',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_DeleteHello,
      callback);
};


/**
 * @param {!proto.Hello} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.HelloResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.deleteHello =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/DeleteHello',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_DeleteHello);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.Hello,
 *   !proto.HelloResponse>}
 */
const methodDescriptor_GrpcServices_PatchHello = new grpc.web.MethodDescriptor(
  '/GrpcServices/PatchHello',
  grpc.web.MethodType.UNARY,
  proto.Hello,
  proto.HelloResponse,
  /**
   * @param {!proto.Hello} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.Hello,
 *   !proto.HelloResponse>}
 */
const methodInfo_GrpcServices_PatchHello = new grpc.web.AbstractClientBase.MethodInfo(
  proto.HelloResponse,
  /**
   * @param {!proto.Hello} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @param {!proto.Hello} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.HelloResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.HelloResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.patchHello =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/PatchHello',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PatchHello,
      callback);
};


/**
 * @param {!proto.Hello} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.HelloResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.patchHello =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/PatchHello',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PatchHello);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.HelloSecure,
 *   !proto.HelloResponse>}
 */
const methodDescriptor_GrpcServices_GetHelloSecure = new grpc.web.MethodDescriptor(
  '/GrpcServices/GetHelloSecure',
  grpc.web.MethodType.UNARY,
  proto.HelloSecure,
  proto.HelloResponse,
  /**
   * @param {!proto.HelloSecure} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.HelloSecure,
 *   !proto.HelloResponse>}
 */
const methodInfo_GrpcServices_GetHelloSecure = new grpc.web.AbstractClientBase.MethodInfo(
  proto.HelloResponse,
  /**
   * @param {!proto.HelloSecure} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @param {!proto.HelloSecure} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.HelloResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.HelloResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.getHelloSecure =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/GetHelloSecure',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_GetHelloSecure,
      callback);
};


/**
 * @param {!proto.HelloSecure} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.HelloResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.getHelloSecure =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/GetHelloSecure',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_GetHelloSecure);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.HelloSecure,
 *   !proto.HelloResponse>}
 */
const methodDescriptor_GrpcServices_PostHelloSecure = new grpc.web.MethodDescriptor(
  '/GrpcServices/PostHelloSecure',
  grpc.web.MethodType.UNARY,
  proto.HelloSecure,
  proto.HelloResponse,
  /**
   * @param {!proto.HelloSecure} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.HelloSecure,
 *   !proto.HelloResponse>}
 */
const methodInfo_GrpcServices_PostHelloSecure = new grpc.web.AbstractClientBase.MethodInfo(
  proto.HelloResponse,
  /**
   * @param {!proto.HelloSecure} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @param {!proto.HelloSecure} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.HelloResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.HelloResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.postHelloSecure =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/PostHelloSecure',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostHelloSecure,
      callback);
};


/**
 * @param {!proto.HelloSecure} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.HelloResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.postHelloSecure =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/PostHelloSecure',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostHelloSecure);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.HelloSecure,
 *   !proto.HelloResponse>}
 */
const methodDescriptor_GrpcServices_PutHelloSecure = new grpc.web.MethodDescriptor(
  '/GrpcServices/PutHelloSecure',
  grpc.web.MethodType.UNARY,
  proto.HelloSecure,
  proto.HelloResponse,
  /**
   * @param {!proto.HelloSecure} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.HelloSecure,
 *   !proto.HelloResponse>}
 */
const methodInfo_GrpcServices_PutHelloSecure = new grpc.web.AbstractClientBase.MethodInfo(
  proto.HelloResponse,
  /**
   * @param {!proto.HelloSecure} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @param {!proto.HelloSecure} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.HelloResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.HelloResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.putHelloSecure =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/PutHelloSecure',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PutHelloSecure,
      callback);
};


/**
 * @param {!proto.HelloSecure} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.HelloResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.putHelloSecure =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/PutHelloSecure',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PutHelloSecure);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.HelloSecure,
 *   !proto.HelloResponse>}
 */
const methodDescriptor_GrpcServices_DeleteHelloSecure = new grpc.web.MethodDescriptor(
  '/GrpcServices/DeleteHelloSecure',
  grpc.web.MethodType.UNARY,
  proto.HelloSecure,
  proto.HelloResponse,
  /**
   * @param {!proto.HelloSecure} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.HelloSecure,
 *   !proto.HelloResponse>}
 */
const methodInfo_GrpcServices_DeleteHelloSecure = new grpc.web.AbstractClientBase.MethodInfo(
  proto.HelloResponse,
  /**
   * @param {!proto.HelloSecure} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @param {!proto.HelloSecure} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.HelloResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.HelloResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.deleteHelloSecure =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/DeleteHelloSecure',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_DeleteHelloSecure,
      callback);
};


/**
 * @param {!proto.HelloSecure} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.HelloResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.deleteHelloSecure =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/DeleteHelloSecure',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_DeleteHelloSecure);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.HelloSecure,
 *   !proto.HelloResponse>}
 */
const methodDescriptor_GrpcServices_PatchHelloSecure = new grpc.web.MethodDescriptor(
  '/GrpcServices/PatchHelloSecure',
  grpc.web.MethodType.UNARY,
  proto.HelloSecure,
  proto.HelloResponse,
  /**
   * @param {!proto.HelloSecure} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.HelloSecure,
 *   !proto.HelloResponse>}
 */
const methodInfo_GrpcServices_PatchHelloSecure = new grpc.web.AbstractClientBase.MethodInfo(
  proto.HelloResponse,
  /**
   * @param {!proto.HelloSecure} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloResponse.deserializeBinary
);


/**
 * @param {!proto.HelloSecure} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.HelloResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.HelloResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.patchHelloSecure =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/PatchHelloSecure',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PatchHelloSecure,
      callback);
};


/**
 * @param {!proto.HelloSecure} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.HelloResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.patchHelloSecure =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/PatchHelloSecure',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PatchHelloSecure);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.Register,
 *   !proto.RegisterResponse>}
 */
const methodDescriptor_GrpcServices_PutRegister = new grpc.web.MethodDescriptor(
  '/GrpcServices/PutRegister',
  grpc.web.MethodType.UNARY,
  proto.Register,
  proto.RegisterResponse,
  /**
   * @param {!proto.Register} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.RegisterResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.Register,
 *   !proto.RegisterResponse>}
 */
const methodInfo_GrpcServices_PutRegister = new grpc.web.AbstractClientBase.MethodInfo(
  proto.RegisterResponse,
  /**
   * @param {!proto.Register} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.RegisterResponse.deserializeBinary
);


/**
 * @param {!proto.Register} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.RegisterResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.RegisterResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.putRegister =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/PutRegister',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PutRegister,
      callback);
};


/**
 * @param {!proto.Register} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.RegisterResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.putRegister =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/PutRegister',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PutRegister);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.Register,
 *   !proto.RegisterResponse>}
 */
const methodDescriptor_GrpcServices_PostRegister = new grpc.web.MethodDescriptor(
  '/GrpcServices/PostRegister',
  grpc.web.MethodType.UNARY,
  proto.Register,
  proto.RegisterResponse,
  /**
   * @param {!proto.Register} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.RegisterResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.Register,
 *   !proto.RegisterResponse>}
 */
const methodInfo_GrpcServices_PostRegister = new grpc.web.AbstractClientBase.MethodInfo(
  proto.RegisterResponse,
  /**
   * @param {!proto.Register} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.RegisterResponse.deserializeBinary
);


/**
 * @param {!proto.Register} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.RegisterResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.RegisterResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.postRegister =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/PostRegister',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostRegister,
      callback);
};


/**
 * @param {!proto.Register} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.RegisterResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.postRegister =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/PostRegister',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostRegister);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.ResetTodos,
 *   !proto.EmptyResponse>}
 */
const methodDescriptor_GrpcServices_PostResetTodos = new grpc.web.MethodDescriptor(
  '/GrpcServices/PostResetTodos',
  grpc.web.MethodType.UNARY,
  proto.ResetTodos,
  proto.EmptyResponse,
  /**
   * @param {!proto.ResetTodos} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.EmptyResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ResetTodos,
 *   !proto.EmptyResponse>}
 */
const methodInfo_GrpcServices_PostResetTodos = new grpc.web.AbstractClientBase.MethodInfo(
  proto.EmptyResponse,
  /**
   * @param {!proto.ResetTodos} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.EmptyResponse.deserializeBinary
);


/**
 * @param {!proto.ResetTodos} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.EmptyResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.EmptyResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.postResetTodos =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/PostResetTodos',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostResetTodos,
      callback);
};


/**
 * @param {!proto.ResetTodos} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.EmptyResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.postResetTodos =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/PostResetTodos',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostResetTodos);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.StreamFiles,
 *   !proto.FileContent>}
 */
const methodDescriptor_GrpcServices_ServerStreamFiles = new grpc.web.MethodDescriptor(
  '/GrpcServices/ServerStreamFiles',
  grpc.web.MethodType.SERVER_STREAMING,
  proto.StreamFiles,
  proto.FileContent,
  /**
   * @param {!proto.StreamFiles} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.FileContent.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.StreamFiles,
 *   !proto.FileContent>}
 */
const methodInfo_GrpcServices_ServerStreamFiles = new grpc.web.AbstractClientBase.MethodInfo(
  proto.FileContent,
  /**
   * @param {!proto.StreamFiles} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.FileContent.deserializeBinary
);


/**
 * @param {!proto.StreamFiles} request The request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.FileContent>}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.serverStreamFiles =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/GrpcServices/ServerStreamFiles',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_ServerStreamFiles);
};


/**
 * @param {!proto.StreamFiles} request The request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.FileContent>}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesPromiseClient.prototype.serverStreamFiles =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/GrpcServices/ServerStreamFiles',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_ServerStreamFiles);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.StreamServerEvents,
 *   !proto.StreamServerEventsResponse>}
 */
const methodDescriptor_GrpcServices_ServerStreamServerEvents = new grpc.web.MethodDescriptor(
  '/GrpcServices/ServerStreamServerEvents',
  grpc.web.MethodType.SERVER_STREAMING,
  proto.StreamServerEvents,
  proto.StreamServerEventsResponse,
  /**
   * @param {!proto.StreamServerEvents} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.StreamServerEventsResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.StreamServerEvents,
 *   !proto.StreamServerEventsResponse>}
 */
const methodInfo_GrpcServices_ServerStreamServerEvents = new grpc.web.AbstractClientBase.MethodInfo(
  proto.StreamServerEventsResponse,
  /**
   * @param {!proto.StreamServerEvents} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.StreamServerEventsResponse.deserializeBinary
);


/**
 * @param {!proto.StreamServerEvents} request The request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.StreamServerEventsResponse>}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.serverStreamServerEvents =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/GrpcServices/ServerStreamServerEvents',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_ServerStreamServerEvents);
};


/**
 * @param {!proto.StreamServerEvents} request The request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.StreamServerEventsResponse>}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesPromiseClient.prototype.serverStreamServerEvents =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/GrpcServices/ServerStreamServerEvents',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_ServerStreamServerEvents);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.UnAssignRoles,
 *   !proto.UnAssignRolesResponse>}
 */
const methodDescriptor_GrpcServices_PostUnAssignRoles = new grpc.web.MethodDescriptor(
  '/GrpcServices/PostUnAssignRoles',
  grpc.web.MethodType.UNARY,
  proto.UnAssignRoles,
  proto.UnAssignRolesResponse,
  /**
   * @param {!proto.UnAssignRoles} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.UnAssignRolesResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.UnAssignRoles,
 *   !proto.UnAssignRolesResponse>}
 */
const methodInfo_GrpcServices_PostUnAssignRoles = new grpc.web.AbstractClientBase.MethodInfo(
  proto.UnAssignRolesResponse,
  /**
   * @param {!proto.UnAssignRoles} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.UnAssignRolesResponse.deserializeBinary
);


/**
 * @param {!proto.UnAssignRoles} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.UnAssignRolesResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.UnAssignRolesResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.postUnAssignRoles =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/PostUnAssignRoles',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostUnAssignRoles,
      callback);
};


/**
 * @param {!proto.UnAssignRoles} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.UnAssignRolesResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.postUnAssignRoles =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/PostUnAssignRoles',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PostUnAssignRoles);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.UpdateTodo,
 *   !proto.EmptyResponse>}
 */
const methodDescriptor_GrpcServices_PutUpdateTodo = new grpc.web.MethodDescriptor(
  '/GrpcServices/PutUpdateTodo',
  grpc.web.MethodType.UNARY,
  proto.UpdateTodo,
  proto.EmptyResponse,
  /**
   * @param {!proto.UpdateTodo} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.EmptyResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.UpdateTodo,
 *   !proto.EmptyResponse>}
 */
const methodInfo_GrpcServices_PutUpdateTodo = new grpc.web.AbstractClientBase.MethodInfo(
  proto.EmptyResponse,
  /**
   * @param {!proto.UpdateTodo} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.EmptyResponse.deserializeBinary
);


/**
 * @param {!proto.UpdateTodo} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.EmptyResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.EmptyResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GrpcServicesClient.prototype.putUpdateTodo =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/GrpcServices/PutUpdateTodo',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PutUpdateTodo,
      callback);
};


/**
 * @param {!proto.UpdateTodo} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.EmptyResponse>}
 *     A native promise that resolves to the response
 */
proto.GrpcServicesPromiseClient.prototype.putUpdateTodo =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/GrpcServices/PutUpdateTodo',
      request,
      metadata || {},
      methodDescriptor_GrpcServices_PutUpdateTodo);
};


module.exports = proto;

