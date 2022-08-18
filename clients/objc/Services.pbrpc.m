#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Services.pbrpc.h"
#import "Services.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>


@implementation GrpcServices

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@""
                 serviceName:@"GrpcServices"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@""
                 serviceName:@"GrpcServices"];
}

#pragma clang diagnostic pop

// Override superclass initializer to disallow different package and service names.
- (instancetype)initWithHost:(NSString *)host
                 packageName:(NSString *)packageName
                 serviceName:(NSString *)serviceName {
  return [self initWithHost:host];
}

- (instancetype)initWithHost:(NSString *)host
                 packageName:(NSString *)packageName
                 serviceName:(NSString *)serviceName
                 callOptions:(GRPCCallOptions *)callOptions {
  return [self initWithHost:host callOptions:callOptions];
}

#pragma mark - Class Methods

+ (instancetype)serviceWithHost:(NSString *)host {
  return [[self alloc] initWithHost:host];
}

+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [[self alloc] initWithHost:host callOptions:callOptions];
}

#pragma mark - Method Implementations

#pragma mark PostAssignRoles(AssignRoles) returns (AssignRolesResponse)

// Deprecated methods.
- (void)postAssignRolesWithRequest:(AssignRoles *)request handler:(void(^)(AssignRolesResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPostAssignRolesWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToPostAssignRolesWithRequest:(AssignRoles *)request handler:(void(^)(AssignRolesResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PostAssignRoles"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[AssignRolesResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)postAssignRolesWithMessage:(AssignRoles *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PostAssignRoles"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[AssignRolesResponse class]];
}

#pragma mark OptionsAuthenticate(Authenticate) returns (AuthenticateResponse)

// Deprecated methods.
- (void)optionsAuthenticateWithRequest:(Authenticate *)request handler:(void(^)(AuthenticateResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToOptionsAuthenticateWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToOptionsAuthenticateWithRequest:(Authenticate *)request handler:(void(^)(AuthenticateResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"OptionsAuthenticate"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[AuthenticateResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)optionsAuthenticateWithMessage:(Authenticate *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"OptionsAuthenticate"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[AuthenticateResponse class]];
}

#pragma mark GetAuthenticate(Authenticate) returns (AuthenticateResponse)

// Deprecated methods.
- (void)getAuthenticateWithRequest:(Authenticate *)request handler:(void(^)(AuthenticateResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToGetAuthenticateWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToGetAuthenticateWithRequest:(Authenticate *)request handler:(void(^)(AuthenticateResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"GetAuthenticate"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[AuthenticateResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)getAuthenticateWithMessage:(Authenticate *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetAuthenticate"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[AuthenticateResponse class]];
}

#pragma mark PostAuthenticate(Authenticate) returns (AuthenticateResponse)

// Deprecated methods.
- (void)postAuthenticateWithRequest:(Authenticate *)request handler:(void(^)(AuthenticateResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPostAuthenticateWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToPostAuthenticateWithRequest:(Authenticate *)request handler:(void(^)(AuthenticateResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PostAuthenticate"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[AuthenticateResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)postAuthenticateWithMessage:(Authenticate *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PostAuthenticate"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[AuthenticateResponse class]];
}

#pragma mark DeleteAuthenticate(Authenticate) returns (AuthenticateResponse)

// Deprecated methods.
- (void)deleteAuthenticateWithRequest:(Authenticate *)request handler:(void(^)(AuthenticateResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToDeleteAuthenticateWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToDeleteAuthenticateWithRequest:(Authenticate *)request handler:(void(^)(AuthenticateResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"DeleteAuthenticate"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[AuthenticateResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)deleteAuthenticateWithMessage:(Authenticate *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"DeleteAuthenticate"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[AuthenticateResponse class]];
}

#pragma mark PostConvertSessionToToken(ConvertSessionToToken) returns (ConvertSessionToTokenResponse)

// Deprecated methods.
- (void)postConvertSessionToTokenWithRequest:(ConvertSessionToToken *)request handler:(void(^)(ConvertSessionToTokenResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPostConvertSessionToTokenWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToPostConvertSessionToTokenWithRequest:(ConvertSessionToToken *)request handler:(void(^)(ConvertSessionToTokenResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PostConvertSessionToToken"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ConvertSessionToTokenResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)postConvertSessionToTokenWithMessage:(ConvertSessionToToken *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PostConvertSessionToToken"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ConvertSessionToTokenResponse class]];
}

#pragma mark PostCreateTodo(CreateTodo) returns (CreateTodoResponse)

// Deprecated methods.
- (void)postCreateTodoWithRequest:(CreateTodo *)request handler:(void(^)(CreateTodoResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPostCreateTodoWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToPostCreateTodoWithRequest:(CreateTodo *)request handler:(void(^)(CreateTodoResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PostCreateTodo"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[CreateTodoResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)postCreateTodoWithMessage:(CreateTodo *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PostCreateTodo"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[CreateTodoResponse class]];
}

#pragma mark CallDeleteTodo(DeleteTodo) returns (EmptyResponse)

// Deprecated methods.
- (void)callDeleteTodoWithRequest:(DeleteTodo *)request handler:(void(^)(EmptyResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToCallDeleteTodoWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToCallDeleteTodoWithRequest:(DeleteTodo *)request handler:(void(^)(EmptyResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"CallDeleteTodo"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[EmptyResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)callDeleteTodoWithMessage:(DeleteTodo *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"CallDeleteTodo"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[EmptyResponse class]];
}

#pragma mark CallDeleteTodos(DeleteTodos) returns (EmptyResponse)

// Deprecated methods.
- (void)callDeleteTodosWithRequest:(DeleteTodos *)request handler:(void(^)(EmptyResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToCallDeleteTodosWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToCallDeleteTodosWithRequest:(DeleteTodos *)request handler:(void(^)(EmptyResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"CallDeleteTodos"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[EmptyResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)callDeleteTodosWithMessage:(DeleteTodos *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"CallDeleteTodos"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[EmptyResponse class]];
}

#pragma mark PostGetAccessToken(GetAccessToken) returns (GetAccessTokenResponse)

// Deprecated methods.
- (void)postGetAccessTokenWithRequest:(GetAccessToken *)request handler:(void(^)(GetAccessTokenResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPostGetAccessTokenWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToPostGetAccessTokenWithRequest:(GetAccessToken *)request handler:(void(^)(GetAccessTokenResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PostGetAccessToken"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetAccessTokenResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)postGetAccessTokenWithMessage:(GetAccessToken *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PostGetAccessToken"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetAccessTokenResponse class]];
}

#pragma mark CallGetTodo(GetTodo) returns (GetTodoResponse)

// Deprecated methods.
- (void)callGetTodoWithRequest:(GetTodo *)request handler:(void(^)(GetTodoResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToCallGetTodoWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToCallGetTodoWithRequest:(GetTodo *)request handler:(void(^)(GetTodoResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"CallGetTodo"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetTodoResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)callGetTodoWithMessage:(GetTodo *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"CallGetTodo"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetTodoResponse class]];
}

#pragma mark CallGetTodos(GetTodos) returns (GetTodosResponse)

// Deprecated methods.
- (void)callGetTodosWithRequest:(GetTodos *)request handler:(void(^)(GetTodosResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToCallGetTodosWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToCallGetTodosWithRequest:(GetTodos *)request handler:(void(^)(GetTodosResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"CallGetTodos"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetTodosResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)callGetTodosWithMessage:(GetTodos *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"CallGetTodos"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetTodosResponse class]];
}

#pragma mark GetHello(Hello) returns (HelloResponse)

// Deprecated methods.
- (void)getHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToGetHelloWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToGetHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"GetHello"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[HelloResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)getHelloWithMessage:(Hello *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetHello"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[HelloResponse class]];
}

#pragma mark PostHello(Hello) returns (HelloResponse)

// Deprecated methods.
- (void)postHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPostHelloWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToPostHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PostHello"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[HelloResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)postHelloWithMessage:(Hello *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PostHello"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[HelloResponse class]];
}

#pragma mark PutHello(Hello) returns (HelloResponse)

// Deprecated methods.
- (void)putHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPutHelloWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToPutHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PutHello"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[HelloResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)putHelloWithMessage:(Hello *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PutHello"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[HelloResponse class]];
}

#pragma mark DeleteHello(Hello) returns (HelloResponse)

// Deprecated methods.
- (void)deleteHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToDeleteHelloWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToDeleteHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"DeleteHello"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[HelloResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)deleteHelloWithMessage:(Hello *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"DeleteHello"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[HelloResponse class]];
}

#pragma mark PatchHello(Hello) returns (HelloResponse)

// Deprecated methods.
- (void)patchHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPatchHelloWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToPatchHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PatchHello"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[HelloResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)patchHelloWithMessage:(Hello *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PatchHello"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[HelloResponse class]];
}

#pragma mark GetHelloSecure(HelloSecure) returns (HelloResponse)

// Deprecated methods.
- (void)getHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToGetHelloSecureWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToGetHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"GetHelloSecure"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[HelloResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)getHelloSecureWithMessage:(HelloSecure *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetHelloSecure"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[HelloResponse class]];
}

#pragma mark PostHelloSecure(HelloSecure) returns (HelloResponse)

// Deprecated methods.
- (void)postHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPostHelloSecureWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToPostHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PostHelloSecure"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[HelloResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)postHelloSecureWithMessage:(HelloSecure *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PostHelloSecure"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[HelloResponse class]];
}

#pragma mark PutHelloSecure(HelloSecure) returns (HelloResponse)

// Deprecated methods.
- (void)putHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPutHelloSecureWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToPutHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PutHelloSecure"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[HelloResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)putHelloSecureWithMessage:(HelloSecure *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PutHelloSecure"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[HelloResponse class]];
}

#pragma mark DeleteHelloSecure(HelloSecure) returns (HelloResponse)

// Deprecated methods.
- (void)deleteHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToDeleteHelloSecureWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToDeleteHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"DeleteHelloSecure"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[HelloResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)deleteHelloSecureWithMessage:(HelloSecure *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"DeleteHelloSecure"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[HelloResponse class]];
}

#pragma mark PatchHelloSecure(HelloSecure) returns (HelloResponse)

// Deprecated methods.
- (void)patchHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPatchHelloSecureWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToPatchHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PatchHelloSecure"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[HelloResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)patchHelloSecureWithMessage:(HelloSecure *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PatchHelloSecure"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[HelloResponse class]];
}

#pragma mark PutRegister(Register) returns (RegisterResponse)

// Deprecated methods.
- (void)putRegisterWithRequest:(Register *)request handler:(void(^)(RegisterResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPutRegisterWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToPutRegisterWithRequest:(Register *)request handler:(void(^)(RegisterResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PutRegister"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[RegisterResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)putRegisterWithMessage:(Register *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PutRegister"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[RegisterResponse class]];
}

#pragma mark PostRegister(Register) returns (RegisterResponse)

// Deprecated methods.
- (void)postRegisterWithRequest:(Register *)request handler:(void(^)(RegisterResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPostRegisterWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToPostRegisterWithRequest:(Register *)request handler:(void(^)(RegisterResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PostRegister"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[RegisterResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)postRegisterWithMessage:(Register *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PostRegister"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[RegisterResponse class]];
}

#pragma mark PostResetTodos(ResetTodos) returns (EmptyResponse)

// Deprecated methods.
- (void)postResetTodosWithRequest:(ResetTodos *)request handler:(void(^)(EmptyResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPostResetTodosWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToPostResetTodosWithRequest:(ResetTodos *)request handler:(void(^)(EmptyResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PostResetTodos"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[EmptyResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)postResetTodosWithMessage:(ResetTodos *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PostResetTodos"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[EmptyResponse class]];
}

#pragma mark ServerStreamFiles(StreamFiles) returns (stream FileContent)

// Deprecated methods.
- (void)serverStreamFilesWithRequest:(StreamFiles *)request eventHandler:(void(^)(BOOL done, FileContent *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToServerStreamFilesWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToServerStreamFilesWithRequest:(StreamFiles *)request eventHandler:(void(^)(BOOL done, FileContent *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"ServerStreamFiles"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[FileContent class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
- (GRPCUnaryProtoCall *)serverStreamFilesWithMessage:(StreamFiles *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ServerStreamFiles"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[FileContent class]];
}

#pragma mark ServerStreamServerEvents(StreamServerEvents) returns (stream StreamServerEventsResponse)

// Deprecated methods.
- (void)serverStreamServerEventsWithRequest:(StreamServerEvents *)request eventHandler:(void(^)(BOOL done, StreamServerEventsResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToServerStreamServerEventsWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToServerStreamServerEventsWithRequest:(StreamServerEvents *)request eventHandler:(void(^)(BOOL done, StreamServerEventsResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"ServerStreamServerEvents"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[StreamServerEventsResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
- (GRPCUnaryProtoCall *)serverStreamServerEventsWithMessage:(StreamServerEvents *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ServerStreamServerEvents"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[StreamServerEventsResponse class]];
}

#pragma mark PostUnAssignRoles(UnAssignRoles) returns (UnAssignRolesResponse)

// Deprecated methods.
- (void)postUnAssignRolesWithRequest:(UnAssignRoles *)request handler:(void(^)(UnAssignRolesResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPostUnAssignRolesWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToPostUnAssignRolesWithRequest:(UnAssignRoles *)request handler:(void(^)(UnAssignRolesResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PostUnAssignRoles"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[UnAssignRolesResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)postUnAssignRolesWithMessage:(UnAssignRoles *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PostUnAssignRoles"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[UnAssignRolesResponse class]];
}

#pragma mark PutUpdateTodo(UpdateTodo) returns (EmptyResponse)

// Deprecated methods.
- (void)putUpdateTodoWithRequest:(UpdateTodo *)request handler:(void(^)(EmptyResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPutUpdateTodoWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToPutUpdateTodoWithRequest:(UpdateTodo *)request handler:(void(^)(EmptyResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PutUpdateTodo"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[EmptyResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)putUpdateTodoWithMessage:(UpdateTodo *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PutUpdateTodo"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[EmptyResponse class]];
}

@end
#endif
