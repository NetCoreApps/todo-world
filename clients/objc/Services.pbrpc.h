#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Services.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class AssignRoles;
@class AssignRolesResponse;
@class Authenticate;
@class AuthenticateResponse;
@class ConvertSessionToToken;
@class ConvertSessionToTokenResponse;
@class CreateTodo;
@class CreateTodoResponse;
@class DeleteTodo;
@class DeleteTodos;
@class EmptyResponse;
@class FileContent;
@class GetAccessToken;
@class GetAccessTokenResponse;
@class GetTodo;
@class GetTodoResponse;
@class GetTodos;
@class GetTodosResponse;
@class Hello;
@class HelloResponse;
@class HelloSecure;
@class Register;
@class RegisterResponse;
@class ResetTodos;
@class StreamFiles;
@class StreamServerEvents;
@class StreamServerEventsResponse;
@class UnAssignRoles;
@class UnAssignRolesResponse;
@class UpdateTodo;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol GrpcServices2 <NSObject>

#pragma mark PostAssignRoles(AssignRoles) returns (AssignRolesResponse)

- (GRPCUnaryProtoCall *)postAssignRolesWithMessage:(AssignRoles *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark OptionsAuthenticate(Authenticate) returns (AuthenticateResponse)

- (GRPCUnaryProtoCall *)optionsAuthenticateWithMessage:(Authenticate *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetAuthenticate(Authenticate) returns (AuthenticateResponse)

- (GRPCUnaryProtoCall *)getAuthenticateWithMessage:(Authenticate *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PostAuthenticate(Authenticate) returns (AuthenticateResponse)

- (GRPCUnaryProtoCall *)postAuthenticateWithMessage:(Authenticate *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark DeleteAuthenticate(Authenticate) returns (AuthenticateResponse)

- (GRPCUnaryProtoCall *)deleteAuthenticateWithMessage:(Authenticate *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PostConvertSessionToToken(ConvertSessionToToken) returns (ConvertSessionToTokenResponse)

- (GRPCUnaryProtoCall *)postConvertSessionToTokenWithMessage:(ConvertSessionToToken *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PostCreateTodo(CreateTodo) returns (CreateTodoResponse)

- (GRPCUnaryProtoCall *)postCreateTodoWithMessage:(CreateTodo *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark CallDeleteTodo(DeleteTodo) returns (EmptyResponse)

- (GRPCUnaryProtoCall *)callDeleteTodoWithMessage:(DeleteTodo *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark CallDeleteTodos(DeleteTodos) returns (EmptyResponse)

- (GRPCUnaryProtoCall *)callDeleteTodosWithMessage:(DeleteTodos *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PostGetAccessToken(GetAccessToken) returns (GetAccessTokenResponse)

- (GRPCUnaryProtoCall *)postGetAccessTokenWithMessage:(GetAccessToken *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark CallGetTodo(GetTodo) returns (GetTodoResponse)

- (GRPCUnaryProtoCall *)callGetTodoWithMessage:(GetTodo *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark CallGetTodos(GetTodos) returns (GetTodosResponse)

- (GRPCUnaryProtoCall *)callGetTodosWithMessage:(GetTodos *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetHello(Hello) returns (HelloResponse)

- (GRPCUnaryProtoCall *)getHelloWithMessage:(Hello *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PostHello(Hello) returns (HelloResponse)

- (GRPCUnaryProtoCall *)postHelloWithMessage:(Hello *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PutHello(Hello) returns (HelloResponse)

- (GRPCUnaryProtoCall *)putHelloWithMessage:(Hello *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark DeleteHello(Hello) returns (HelloResponse)

- (GRPCUnaryProtoCall *)deleteHelloWithMessage:(Hello *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PatchHello(Hello) returns (HelloResponse)

- (GRPCUnaryProtoCall *)patchHelloWithMessage:(Hello *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetHelloSecure(HelloSecure) returns (HelloResponse)

- (GRPCUnaryProtoCall *)getHelloSecureWithMessage:(HelloSecure *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PostHelloSecure(HelloSecure) returns (HelloResponse)

- (GRPCUnaryProtoCall *)postHelloSecureWithMessage:(HelloSecure *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PutHelloSecure(HelloSecure) returns (HelloResponse)

- (GRPCUnaryProtoCall *)putHelloSecureWithMessage:(HelloSecure *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark DeleteHelloSecure(HelloSecure) returns (HelloResponse)

- (GRPCUnaryProtoCall *)deleteHelloSecureWithMessage:(HelloSecure *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PatchHelloSecure(HelloSecure) returns (HelloResponse)

- (GRPCUnaryProtoCall *)patchHelloSecureWithMessage:(HelloSecure *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PutRegister(Register) returns (RegisterResponse)

- (GRPCUnaryProtoCall *)putRegisterWithMessage:(Register *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PostRegister(Register) returns (RegisterResponse)

- (GRPCUnaryProtoCall *)postRegisterWithMessage:(Register *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PostResetTodos(ResetTodos) returns (EmptyResponse)

- (GRPCUnaryProtoCall *)postResetTodosWithMessage:(ResetTodos *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark ServerStreamFiles(StreamFiles) returns (stream FileContent)

- (GRPCUnaryProtoCall *)serverStreamFilesWithMessage:(StreamFiles *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark ServerStreamServerEvents(StreamServerEvents) returns (stream StreamServerEventsResponse)

- (GRPCUnaryProtoCall *)serverStreamServerEventsWithMessage:(StreamServerEvents *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PostUnAssignRoles(UnAssignRoles) returns (UnAssignRolesResponse)

- (GRPCUnaryProtoCall *)postUnAssignRolesWithMessage:(UnAssignRoles *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PutUpdateTodo(UpdateTodo) returns (EmptyResponse)

- (GRPCUnaryProtoCall *)putUpdateTodoWithMessage:(UpdateTodo *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

@protocol GrpcServices <NSObject>

#pragma mark PostAssignRoles(AssignRoles) returns (AssignRolesResponse)

- (void)postAssignRolesWithRequest:(AssignRoles *)request handler:(void(^)(AssignRolesResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToPostAssignRolesWithRequest:(AssignRoles *)request handler:(void(^)(AssignRolesResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark OptionsAuthenticate(Authenticate) returns (AuthenticateResponse)

- (void)optionsAuthenticateWithRequest:(Authenticate *)request handler:(void(^)(AuthenticateResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToOptionsAuthenticateWithRequest:(Authenticate *)request handler:(void(^)(AuthenticateResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark GetAuthenticate(Authenticate) returns (AuthenticateResponse)

- (void)getAuthenticateWithRequest:(Authenticate *)request handler:(void(^)(AuthenticateResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToGetAuthenticateWithRequest:(Authenticate *)request handler:(void(^)(AuthenticateResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PostAuthenticate(Authenticate) returns (AuthenticateResponse)

- (void)postAuthenticateWithRequest:(Authenticate *)request handler:(void(^)(AuthenticateResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToPostAuthenticateWithRequest:(Authenticate *)request handler:(void(^)(AuthenticateResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark DeleteAuthenticate(Authenticate) returns (AuthenticateResponse)

- (void)deleteAuthenticateWithRequest:(Authenticate *)request handler:(void(^)(AuthenticateResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToDeleteAuthenticateWithRequest:(Authenticate *)request handler:(void(^)(AuthenticateResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PostConvertSessionToToken(ConvertSessionToToken) returns (ConvertSessionToTokenResponse)

- (void)postConvertSessionToTokenWithRequest:(ConvertSessionToToken *)request handler:(void(^)(ConvertSessionToTokenResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToPostConvertSessionToTokenWithRequest:(ConvertSessionToToken *)request handler:(void(^)(ConvertSessionToTokenResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PostCreateTodo(CreateTodo) returns (CreateTodoResponse)

- (void)postCreateTodoWithRequest:(CreateTodo *)request handler:(void(^)(CreateTodoResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToPostCreateTodoWithRequest:(CreateTodo *)request handler:(void(^)(CreateTodoResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark CallDeleteTodo(DeleteTodo) returns (EmptyResponse)

- (void)callDeleteTodoWithRequest:(DeleteTodo *)request handler:(void(^)(EmptyResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToCallDeleteTodoWithRequest:(DeleteTodo *)request handler:(void(^)(EmptyResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark CallDeleteTodos(DeleteTodos) returns (EmptyResponse)

- (void)callDeleteTodosWithRequest:(DeleteTodos *)request handler:(void(^)(EmptyResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToCallDeleteTodosWithRequest:(DeleteTodos *)request handler:(void(^)(EmptyResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PostGetAccessToken(GetAccessToken) returns (GetAccessTokenResponse)

- (void)postGetAccessTokenWithRequest:(GetAccessToken *)request handler:(void(^)(GetAccessTokenResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToPostGetAccessTokenWithRequest:(GetAccessToken *)request handler:(void(^)(GetAccessTokenResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark CallGetTodo(GetTodo) returns (GetTodoResponse)

- (void)callGetTodoWithRequest:(GetTodo *)request handler:(void(^)(GetTodoResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToCallGetTodoWithRequest:(GetTodo *)request handler:(void(^)(GetTodoResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark CallGetTodos(GetTodos) returns (GetTodosResponse)

- (void)callGetTodosWithRequest:(GetTodos *)request handler:(void(^)(GetTodosResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToCallGetTodosWithRequest:(GetTodos *)request handler:(void(^)(GetTodosResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark GetHello(Hello) returns (HelloResponse)

- (void)getHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToGetHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PostHello(Hello) returns (HelloResponse)

- (void)postHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToPostHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PutHello(Hello) returns (HelloResponse)

- (void)putHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToPutHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark DeleteHello(Hello) returns (HelloResponse)

- (void)deleteHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToDeleteHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PatchHello(Hello) returns (HelloResponse)

- (void)patchHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToPatchHelloWithRequest:(Hello *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark GetHelloSecure(HelloSecure) returns (HelloResponse)

- (void)getHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToGetHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PostHelloSecure(HelloSecure) returns (HelloResponse)

- (void)postHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToPostHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PutHelloSecure(HelloSecure) returns (HelloResponse)

- (void)putHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToPutHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark DeleteHelloSecure(HelloSecure) returns (HelloResponse)

- (void)deleteHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToDeleteHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PatchHelloSecure(HelloSecure) returns (HelloResponse)

- (void)patchHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToPatchHelloSecureWithRequest:(HelloSecure *)request handler:(void(^)(HelloResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PutRegister(Register) returns (RegisterResponse)

- (void)putRegisterWithRequest:(Register *)request handler:(void(^)(RegisterResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToPutRegisterWithRequest:(Register *)request handler:(void(^)(RegisterResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PostRegister(Register) returns (RegisterResponse)

- (void)postRegisterWithRequest:(Register *)request handler:(void(^)(RegisterResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToPostRegisterWithRequest:(Register *)request handler:(void(^)(RegisterResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PostResetTodos(ResetTodos) returns (EmptyResponse)

- (void)postResetTodosWithRequest:(ResetTodos *)request handler:(void(^)(EmptyResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToPostResetTodosWithRequest:(ResetTodos *)request handler:(void(^)(EmptyResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark ServerStreamFiles(StreamFiles) returns (stream FileContent)

- (void)serverStreamFilesWithRequest:(StreamFiles *)request eventHandler:(void(^)(BOOL done, FileContent *_Nullable response, NSError *_Nullable error))eventHandler;

- (GRPCProtoCall *)RPCToServerStreamFilesWithRequest:(StreamFiles *)request eventHandler:(void(^)(BOOL done, FileContent *_Nullable response, NSError *_Nullable error))eventHandler;


#pragma mark ServerStreamServerEvents(StreamServerEvents) returns (stream StreamServerEventsResponse)

- (void)serverStreamServerEventsWithRequest:(StreamServerEvents *)request eventHandler:(void(^)(BOOL done, StreamServerEventsResponse *_Nullable response, NSError *_Nullable error))eventHandler;

- (GRPCProtoCall *)RPCToServerStreamServerEventsWithRequest:(StreamServerEvents *)request eventHandler:(void(^)(BOOL done, StreamServerEventsResponse *_Nullable response, NSError *_Nullable error))eventHandler;


#pragma mark PostUnAssignRoles(UnAssignRoles) returns (UnAssignRolesResponse)

- (void)postUnAssignRolesWithRequest:(UnAssignRoles *)request handler:(void(^)(UnAssignRolesResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToPostUnAssignRolesWithRequest:(UnAssignRoles *)request handler:(void(^)(UnAssignRolesResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PutUpdateTodo(UpdateTodo) returns (EmptyResponse)

- (void)putUpdateTodoWithRequest:(UpdateTodo *)request handler:(void(^)(EmptyResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToPutUpdateTodoWithRequest:(UpdateTodo *)request handler:(void(^)(EmptyResponse *_Nullable response, NSError *_Nullable error))handler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface GrpcServices : GRPCProtoService<GrpcServices, GrpcServices2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

