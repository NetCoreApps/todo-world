import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.25.0)",
        comments = "Source: services.proto")
public final class GrpcServicesGrpc {

  private GrpcServicesGrpc() {}

  public static final String SERVICE_NAME = "GrpcServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Services.AssignRoles,
          Services.AssignRolesResponse> getPostAssignRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "PostAssignRoles",
          requestType = Services.AssignRoles.class,
          responseType = Services.AssignRolesResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.AssignRoles,
          Services.AssignRolesResponse> getPostAssignRolesMethod() {
    io.grpc.MethodDescriptor<Services.AssignRoles, Services.AssignRolesResponse> getPostAssignRolesMethod;
    if ((getPostAssignRolesMethod = GrpcServicesGrpc.getPostAssignRolesMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostAssignRolesMethod = GrpcServicesGrpc.getPostAssignRolesMethod) == null) {
          GrpcServicesGrpc.getPostAssignRolesMethod = getPostAssignRolesMethod =
                  io.grpc.MethodDescriptor.<Services.AssignRoles, Services.AssignRolesResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostAssignRoles"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.AssignRoles.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.AssignRolesResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getPostAssignRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.Authenticate,
          Services.AuthenticateResponse> getOptionsAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "OptionsAuthenticate",
          requestType = Services.Authenticate.class,
          responseType = Services.AuthenticateResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.Authenticate,
          Services.AuthenticateResponse> getOptionsAuthenticateMethod() {
    io.grpc.MethodDescriptor<Services.Authenticate, Services.AuthenticateResponse> getOptionsAuthenticateMethod;
    if ((getOptionsAuthenticateMethod = GrpcServicesGrpc.getOptionsAuthenticateMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getOptionsAuthenticateMethod = GrpcServicesGrpc.getOptionsAuthenticateMethod) == null) {
          GrpcServicesGrpc.getOptionsAuthenticateMethod = getOptionsAuthenticateMethod =
                  io.grpc.MethodDescriptor.<Services.Authenticate, Services.AuthenticateResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OptionsAuthenticate"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.Authenticate.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.AuthenticateResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getOptionsAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.Authenticate,
          Services.AuthenticateResponse> getGetAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetAuthenticate",
          requestType = Services.Authenticate.class,
          responseType = Services.AuthenticateResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.Authenticate,
          Services.AuthenticateResponse> getGetAuthenticateMethod() {
    io.grpc.MethodDescriptor<Services.Authenticate, Services.AuthenticateResponse> getGetAuthenticateMethod;
    if ((getGetAuthenticateMethod = GrpcServicesGrpc.getGetAuthenticateMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getGetAuthenticateMethod = GrpcServicesGrpc.getGetAuthenticateMethod) == null) {
          GrpcServicesGrpc.getGetAuthenticateMethod = getGetAuthenticateMethod =
                  io.grpc.MethodDescriptor.<Services.Authenticate, Services.AuthenticateResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthenticate"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.Authenticate.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.AuthenticateResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getGetAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.Authenticate,
          Services.AuthenticateResponse> getPostAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "PostAuthenticate",
          requestType = Services.Authenticate.class,
          responseType = Services.AuthenticateResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.Authenticate,
          Services.AuthenticateResponse> getPostAuthenticateMethod() {
    io.grpc.MethodDescriptor<Services.Authenticate, Services.AuthenticateResponse> getPostAuthenticateMethod;
    if ((getPostAuthenticateMethod = GrpcServicesGrpc.getPostAuthenticateMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostAuthenticateMethod = GrpcServicesGrpc.getPostAuthenticateMethod) == null) {
          GrpcServicesGrpc.getPostAuthenticateMethod = getPostAuthenticateMethod =
                  io.grpc.MethodDescriptor.<Services.Authenticate, Services.AuthenticateResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostAuthenticate"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.Authenticate.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.AuthenticateResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getPostAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.Authenticate,
          Services.AuthenticateResponse> getDeleteAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "DeleteAuthenticate",
          requestType = Services.Authenticate.class,
          responseType = Services.AuthenticateResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.Authenticate,
          Services.AuthenticateResponse> getDeleteAuthenticateMethod() {
    io.grpc.MethodDescriptor<Services.Authenticate, Services.AuthenticateResponse> getDeleteAuthenticateMethod;
    if ((getDeleteAuthenticateMethod = GrpcServicesGrpc.getDeleteAuthenticateMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getDeleteAuthenticateMethod = GrpcServicesGrpc.getDeleteAuthenticateMethod) == null) {
          GrpcServicesGrpc.getDeleteAuthenticateMethod = getDeleteAuthenticateMethod =
                  io.grpc.MethodDescriptor.<Services.Authenticate, Services.AuthenticateResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAuthenticate"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.Authenticate.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.AuthenticateResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getDeleteAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.ConvertSessionToToken,
          Services.ConvertSessionToTokenResponse> getPostConvertSessionToTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "PostConvertSessionToToken",
          requestType = Services.ConvertSessionToToken.class,
          responseType = Services.ConvertSessionToTokenResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.ConvertSessionToToken,
          Services.ConvertSessionToTokenResponse> getPostConvertSessionToTokenMethod() {
    io.grpc.MethodDescriptor<Services.ConvertSessionToToken, Services.ConvertSessionToTokenResponse> getPostConvertSessionToTokenMethod;
    if ((getPostConvertSessionToTokenMethod = GrpcServicesGrpc.getPostConvertSessionToTokenMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostConvertSessionToTokenMethod = GrpcServicesGrpc.getPostConvertSessionToTokenMethod) == null) {
          GrpcServicesGrpc.getPostConvertSessionToTokenMethod = getPostConvertSessionToTokenMethod =
                  io.grpc.MethodDescriptor.<Services.ConvertSessionToToken, Services.ConvertSessionToTokenResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostConvertSessionToToken"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.ConvertSessionToToken.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.ConvertSessionToTokenResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getPostConvertSessionToTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.CreateTodo,
          Services.CreateTodoResponse> getPostCreateTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "PostCreateTodo",
          requestType = Services.CreateTodo.class,
          responseType = Services.CreateTodoResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.CreateTodo,
          Services.CreateTodoResponse> getPostCreateTodoMethod() {
    io.grpc.MethodDescriptor<Services.CreateTodo, Services.CreateTodoResponse> getPostCreateTodoMethod;
    if ((getPostCreateTodoMethod = GrpcServicesGrpc.getPostCreateTodoMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostCreateTodoMethod = GrpcServicesGrpc.getPostCreateTodoMethod) == null) {
          GrpcServicesGrpc.getPostCreateTodoMethod = getPostCreateTodoMethod =
                  io.grpc.MethodDescriptor.<Services.CreateTodo, Services.CreateTodoResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostCreateTodo"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.CreateTodo.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.CreateTodoResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getPostCreateTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.DeleteTodo,
          Services.EmptyResponse> getCallDeleteTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "CallDeleteTodo",
          requestType = Services.DeleteTodo.class,
          responseType = Services.EmptyResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.DeleteTodo,
          Services.EmptyResponse> getCallDeleteTodoMethod() {
    io.grpc.MethodDescriptor<Services.DeleteTodo, Services.EmptyResponse> getCallDeleteTodoMethod;
    if ((getCallDeleteTodoMethod = GrpcServicesGrpc.getCallDeleteTodoMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getCallDeleteTodoMethod = GrpcServicesGrpc.getCallDeleteTodoMethod) == null) {
          GrpcServicesGrpc.getCallDeleteTodoMethod = getCallDeleteTodoMethod =
                  io.grpc.MethodDescriptor.<Services.DeleteTodo, Services.EmptyResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallDeleteTodo"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.DeleteTodo.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.EmptyResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getCallDeleteTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.DeleteTodos,
          Services.EmptyResponse> getCallDeleteTodosMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "CallDeleteTodos",
          requestType = Services.DeleteTodos.class,
          responseType = Services.EmptyResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.DeleteTodos,
          Services.EmptyResponse> getCallDeleteTodosMethod() {
    io.grpc.MethodDescriptor<Services.DeleteTodos, Services.EmptyResponse> getCallDeleteTodosMethod;
    if ((getCallDeleteTodosMethod = GrpcServicesGrpc.getCallDeleteTodosMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getCallDeleteTodosMethod = GrpcServicesGrpc.getCallDeleteTodosMethod) == null) {
          GrpcServicesGrpc.getCallDeleteTodosMethod = getCallDeleteTodosMethod =
                  io.grpc.MethodDescriptor.<Services.DeleteTodos, Services.EmptyResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallDeleteTodos"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.DeleteTodos.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.EmptyResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getCallDeleteTodosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.GetAccessToken,
          Services.GetAccessTokenResponse> getPostGetAccessTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "PostGetAccessToken",
          requestType = Services.GetAccessToken.class,
          responseType = Services.GetAccessTokenResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.GetAccessToken,
          Services.GetAccessTokenResponse> getPostGetAccessTokenMethod() {
    io.grpc.MethodDescriptor<Services.GetAccessToken, Services.GetAccessTokenResponse> getPostGetAccessTokenMethod;
    if ((getPostGetAccessTokenMethod = GrpcServicesGrpc.getPostGetAccessTokenMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostGetAccessTokenMethod = GrpcServicesGrpc.getPostGetAccessTokenMethod) == null) {
          GrpcServicesGrpc.getPostGetAccessTokenMethod = getPostGetAccessTokenMethod =
                  io.grpc.MethodDescriptor.<Services.GetAccessToken, Services.GetAccessTokenResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostGetAccessToken"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.GetAccessToken.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.GetAccessTokenResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getPostGetAccessTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.GetFile,
          Services.FileContent> getCallGetFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "CallGetFile",
          requestType = Services.GetFile.class,
          responseType = Services.FileContent.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.GetFile,
          Services.FileContent> getCallGetFileMethod() {
    io.grpc.MethodDescriptor<Services.GetFile, Services.FileContent> getCallGetFileMethod;
    if ((getCallGetFileMethod = GrpcServicesGrpc.getCallGetFileMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getCallGetFileMethod = GrpcServicesGrpc.getCallGetFileMethod) == null) {
          GrpcServicesGrpc.getCallGetFileMethod = getCallGetFileMethod =
                  io.grpc.MethodDescriptor.<Services.GetFile, Services.FileContent>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallGetFile"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.GetFile.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.FileContent.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getCallGetFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.GetTodo,
          Services.GetTodoResponse> getCallGetTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "CallGetTodo",
          requestType = Services.GetTodo.class,
          responseType = Services.GetTodoResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.GetTodo,
          Services.GetTodoResponse> getCallGetTodoMethod() {
    io.grpc.MethodDescriptor<Services.GetTodo, Services.GetTodoResponse> getCallGetTodoMethod;
    if ((getCallGetTodoMethod = GrpcServicesGrpc.getCallGetTodoMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getCallGetTodoMethod = GrpcServicesGrpc.getCallGetTodoMethod) == null) {
          GrpcServicesGrpc.getCallGetTodoMethod = getCallGetTodoMethod =
                  io.grpc.MethodDescriptor.<Services.GetTodo, Services.GetTodoResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallGetTodo"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.GetTodo.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.GetTodoResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getCallGetTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.GetTodos,
          Services.GetTodosResponse> getCallGetTodosMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "CallGetTodos",
          requestType = Services.GetTodos.class,
          responseType = Services.GetTodosResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.GetTodos,
          Services.GetTodosResponse> getCallGetTodosMethod() {
    io.grpc.MethodDescriptor<Services.GetTodos, Services.GetTodosResponse> getCallGetTodosMethod;
    if ((getCallGetTodosMethod = GrpcServicesGrpc.getCallGetTodosMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getCallGetTodosMethod = GrpcServicesGrpc.getCallGetTodosMethod) == null) {
          GrpcServicesGrpc.getCallGetTodosMethod = getCallGetTodosMethod =
                  io.grpc.MethodDescriptor.<Services.GetTodos, Services.GetTodosResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallGetTodos"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.GetTodos.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.GetTodosResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getCallGetTodosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.Hello,
          Services.HelloResponse> getGetHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetHello",
          requestType = Services.Hello.class,
          responseType = Services.HelloResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.Hello,
          Services.HelloResponse> getGetHelloMethod() {
    io.grpc.MethodDescriptor<Services.Hello, Services.HelloResponse> getGetHelloMethod;
    if ((getGetHelloMethod = GrpcServicesGrpc.getGetHelloMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getGetHelloMethod = GrpcServicesGrpc.getGetHelloMethod) == null) {
          GrpcServicesGrpc.getGetHelloMethod = getGetHelloMethod =
                  io.grpc.MethodDescriptor.<Services.Hello, Services.HelloResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHello"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.Hello.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.HelloResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getGetHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.Hello,
          Services.HelloResponse> getPostHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "PostHello",
          requestType = Services.Hello.class,
          responseType = Services.HelloResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.Hello,
          Services.HelloResponse> getPostHelloMethod() {
    io.grpc.MethodDescriptor<Services.Hello, Services.HelloResponse> getPostHelloMethod;
    if ((getPostHelloMethod = GrpcServicesGrpc.getPostHelloMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostHelloMethod = GrpcServicesGrpc.getPostHelloMethod) == null) {
          GrpcServicesGrpc.getPostHelloMethod = getPostHelloMethod =
                  io.grpc.MethodDescriptor.<Services.Hello, Services.HelloResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostHello"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.Hello.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.HelloResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getPostHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.Hello,
          Services.HelloResponse> getPutHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "PutHello",
          requestType = Services.Hello.class,
          responseType = Services.HelloResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.Hello,
          Services.HelloResponse> getPutHelloMethod() {
    io.grpc.MethodDescriptor<Services.Hello, Services.HelloResponse> getPutHelloMethod;
    if ((getPutHelloMethod = GrpcServicesGrpc.getPutHelloMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPutHelloMethod = GrpcServicesGrpc.getPutHelloMethod) == null) {
          GrpcServicesGrpc.getPutHelloMethod = getPutHelloMethod =
                  io.grpc.MethodDescriptor.<Services.Hello, Services.HelloResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutHello"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.Hello.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.HelloResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getPutHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.Hello,
          Services.HelloResponse> getDeleteHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "DeleteHello",
          requestType = Services.Hello.class,
          responseType = Services.HelloResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.Hello,
          Services.HelloResponse> getDeleteHelloMethod() {
    io.grpc.MethodDescriptor<Services.Hello, Services.HelloResponse> getDeleteHelloMethod;
    if ((getDeleteHelloMethod = GrpcServicesGrpc.getDeleteHelloMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getDeleteHelloMethod = GrpcServicesGrpc.getDeleteHelloMethod) == null) {
          GrpcServicesGrpc.getDeleteHelloMethod = getDeleteHelloMethod =
                  io.grpc.MethodDescriptor.<Services.Hello, Services.HelloResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHello"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.Hello.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.HelloResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getDeleteHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.Hello,
          Services.HelloResponse> getPatchHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "PatchHello",
          requestType = Services.Hello.class,
          responseType = Services.HelloResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.Hello,
          Services.HelloResponse> getPatchHelloMethod() {
    io.grpc.MethodDescriptor<Services.Hello, Services.HelloResponse> getPatchHelloMethod;
    if ((getPatchHelloMethod = GrpcServicesGrpc.getPatchHelloMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPatchHelloMethod = GrpcServicesGrpc.getPatchHelloMethod) == null) {
          GrpcServicesGrpc.getPatchHelloMethod = getPatchHelloMethod =
                  io.grpc.MethodDescriptor.<Services.Hello, Services.HelloResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchHello"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.Hello.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.HelloResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getPatchHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.HelloSecure,
          Services.HelloResponse> getGetHelloSecureMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetHelloSecure",
          requestType = Services.HelloSecure.class,
          responseType = Services.HelloResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.HelloSecure,
          Services.HelloResponse> getGetHelloSecureMethod() {
    io.grpc.MethodDescriptor<Services.HelloSecure, Services.HelloResponse> getGetHelloSecureMethod;
    if ((getGetHelloSecureMethod = GrpcServicesGrpc.getGetHelloSecureMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getGetHelloSecureMethod = GrpcServicesGrpc.getGetHelloSecureMethod) == null) {
          GrpcServicesGrpc.getGetHelloSecureMethod = getGetHelloSecureMethod =
                  io.grpc.MethodDescriptor.<Services.HelloSecure, Services.HelloResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHelloSecure"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.HelloSecure.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.HelloResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getGetHelloSecureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.HelloSecure,
          Services.HelloResponse> getPostHelloSecureMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "PostHelloSecure",
          requestType = Services.HelloSecure.class,
          responseType = Services.HelloResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.HelloSecure,
          Services.HelloResponse> getPostHelloSecureMethod() {
    io.grpc.MethodDescriptor<Services.HelloSecure, Services.HelloResponse> getPostHelloSecureMethod;
    if ((getPostHelloSecureMethod = GrpcServicesGrpc.getPostHelloSecureMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostHelloSecureMethod = GrpcServicesGrpc.getPostHelloSecureMethod) == null) {
          GrpcServicesGrpc.getPostHelloSecureMethod = getPostHelloSecureMethod =
                  io.grpc.MethodDescriptor.<Services.HelloSecure, Services.HelloResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostHelloSecure"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.HelloSecure.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.HelloResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getPostHelloSecureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.HelloSecure,
          Services.HelloResponse> getPutHelloSecureMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "PutHelloSecure",
          requestType = Services.HelloSecure.class,
          responseType = Services.HelloResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.HelloSecure,
          Services.HelloResponse> getPutHelloSecureMethod() {
    io.grpc.MethodDescriptor<Services.HelloSecure, Services.HelloResponse> getPutHelloSecureMethod;
    if ((getPutHelloSecureMethod = GrpcServicesGrpc.getPutHelloSecureMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPutHelloSecureMethod = GrpcServicesGrpc.getPutHelloSecureMethod) == null) {
          GrpcServicesGrpc.getPutHelloSecureMethod = getPutHelloSecureMethod =
                  io.grpc.MethodDescriptor.<Services.HelloSecure, Services.HelloResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutHelloSecure"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.HelloSecure.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.HelloResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getPutHelloSecureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.HelloSecure,
          Services.HelloResponse> getDeleteHelloSecureMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "DeleteHelloSecure",
          requestType = Services.HelloSecure.class,
          responseType = Services.HelloResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.HelloSecure,
          Services.HelloResponse> getDeleteHelloSecureMethod() {
    io.grpc.MethodDescriptor<Services.HelloSecure, Services.HelloResponse> getDeleteHelloSecureMethod;
    if ((getDeleteHelloSecureMethod = GrpcServicesGrpc.getDeleteHelloSecureMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getDeleteHelloSecureMethod = GrpcServicesGrpc.getDeleteHelloSecureMethod) == null) {
          GrpcServicesGrpc.getDeleteHelloSecureMethod = getDeleteHelloSecureMethod =
                  io.grpc.MethodDescriptor.<Services.HelloSecure, Services.HelloResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHelloSecure"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.HelloSecure.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.HelloResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getDeleteHelloSecureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.HelloSecure,
          Services.HelloResponse> getPatchHelloSecureMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "PatchHelloSecure",
          requestType = Services.HelloSecure.class,
          responseType = Services.HelloResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.HelloSecure,
          Services.HelloResponse> getPatchHelloSecureMethod() {
    io.grpc.MethodDescriptor<Services.HelloSecure, Services.HelloResponse> getPatchHelloSecureMethod;
    if ((getPatchHelloSecureMethod = GrpcServicesGrpc.getPatchHelloSecureMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPatchHelloSecureMethod = GrpcServicesGrpc.getPatchHelloSecureMethod) == null) {
          GrpcServicesGrpc.getPatchHelloSecureMethod = getPatchHelloSecureMethod =
                  io.grpc.MethodDescriptor.<Services.HelloSecure, Services.HelloResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchHelloSecure"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.HelloSecure.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.HelloResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getPatchHelloSecureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.Register,
          Services.RegisterResponse> getPutRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "PutRegister",
          requestType = Services.Register.class,
          responseType = Services.RegisterResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.Register,
          Services.RegisterResponse> getPutRegisterMethod() {
    io.grpc.MethodDescriptor<Services.Register, Services.RegisterResponse> getPutRegisterMethod;
    if ((getPutRegisterMethod = GrpcServicesGrpc.getPutRegisterMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPutRegisterMethod = GrpcServicesGrpc.getPutRegisterMethod) == null) {
          GrpcServicesGrpc.getPutRegisterMethod = getPutRegisterMethod =
                  io.grpc.MethodDescriptor.<Services.Register, Services.RegisterResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutRegister"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.Register.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.RegisterResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getPutRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.Register,
          Services.RegisterResponse> getPostRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "PostRegister",
          requestType = Services.Register.class,
          responseType = Services.RegisterResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.Register,
          Services.RegisterResponse> getPostRegisterMethod() {
    io.grpc.MethodDescriptor<Services.Register, Services.RegisterResponse> getPostRegisterMethod;
    if ((getPostRegisterMethod = GrpcServicesGrpc.getPostRegisterMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostRegisterMethod = GrpcServicesGrpc.getPostRegisterMethod) == null) {
          GrpcServicesGrpc.getPostRegisterMethod = getPostRegisterMethod =
                  io.grpc.MethodDescriptor.<Services.Register, Services.RegisterResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostRegister"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.Register.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.RegisterResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getPostRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.ResetTodos,
          Services.EmptyResponse> getPostResetTodosMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "PostResetTodos",
          requestType = Services.ResetTodos.class,
          responseType = Services.EmptyResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.ResetTodos,
          Services.EmptyResponse> getPostResetTodosMethod() {
    io.grpc.MethodDescriptor<Services.ResetTodos, Services.EmptyResponse> getPostResetTodosMethod;
    if ((getPostResetTodosMethod = GrpcServicesGrpc.getPostResetTodosMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostResetTodosMethod = GrpcServicesGrpc.getPostResetTodosMethod) == null) {
          GrpcServicesGrpc.getPostResetTodosMethod = getPostResetTodosMethod =
                  io.grpc.MethodDescriptor.<Services.ResetTodos, Services.EmptyResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostResetTodos"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.ResetTodos.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.EmptyResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getPostResetTodosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.StreamFiles,
          Services.FileContent> getServerStreamFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "ServerStreamFiles",
          requestType = Services.StreamFiles.class,
          responseType = Services.FileContent.class,
          methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Services.StreamFiles,
          Services.FileContent> getServerStreamFilesMethod() {
    io.grpc.MethodDescriptor<Services.StreamFiles, Services.FileContent> getServerStreamFilesMethod;
    if ((getServerStreamFilesMethod = GrpcServicesGrpc.getServerStreamFilesMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getServerStreamFilesMethod = GrpcServicesGrpc.getServerStreamFilesMethod) == null) {
          GrpcServicesGrpc.getServerStreamFilesMethod = getServerStreamFilesMethod =
                  io.grpc.MethodDescriptor.<Services.StreamFiles, Services.FileContent>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerStreamFiles"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.StreamFiles.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.FileContent.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getServerStreamFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.StreamServerEvents,
          Services.StreamServerEventsResponse> getServerStreamServerEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "ServerStreamServerEvents",
          requestType = Services.StreamServerEvents.class,
          responseType = Services.StreamServerEventsResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Services.StreamServerEvents,
          Services.StreamServerEventsResponse> getServerStreamServerEventsMethod() {
    io.grpc.MethodDescriptor<Services.StreamServerEvents, Services.StreamServerEventsResponse> getServerStreamServerEventsMethod;
    if ((getServerStreamServerEventsMethod = GrpcServicesGrpc.getServerStreamServerEventsMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getServerStreamServerEventsMethod = GrpcServicesGrpc.getServerStreamServerEventsMethod) == null) {
          GrpcServicesGrpc.getServerStreamServerEventsMethod = getServerStreamServerEventsMethod =
                  io.grpc.MethodDescriptor.<Services.StreamServerEvents, Services.StreamServerEventsResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerStreamServerEvents"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.StreamServerEvents.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.StreamServerEventsResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getServerStreamServerEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.UnAssignRoles,
          Services.UnAssignRolesResponse> getPostUnAssignRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "PostUnAssignRoles",
          requestType = Services.UnAssignRoles.class,
          responseType = Services.UnAssignRolesResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.UnAssignRoles,
          Services.UnAssignRolesResponse> getPostUnAssignRolesMethod() {
    io.grpc.MethodDescriptor<Services.UnAssignRoles, Services.UnAssignRolesResponse> getPostUnAssignRolesMethod;
    if ((getPostUnAssignRolesMethod = GrpcServicesGrpc.getPostUnAssignRolesMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostUnAssignRolesMethod = GrpcServicesGrpc.getPostUnAssignRolesMethod) == null) {
          GrpcServicesGrpc.getPostUnAssignRolesMethod = getPostUnAssignRolesMethod =
                  io.grpc.MethodDescriptor.<Services.UnAssignRoles, Services.UnAssignRolesResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostUnAssignRoles"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.UnAssignRoles.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.UnAssignRolesResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getPostUnAssignRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Services.UpdateTodo,
          Services.EmptyResponse> getPutUpdateTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "PutUpdateTodo",
          requestType = Services.UpdateTodo.class,
          responseType = Services.EmptyResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Services.UpdateTodo,
          Services.EmptyResponse> getPutUpdateTodoMethod() {
    io.grpc.MethodDescriptor<Services.UpdateTodo, Services.EmptyResponse> getPutUpdateTodoMethod;
    if ((getPutUpdateTodoMethod = GrpcServicesGrpc.getPutUpdateTodoMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPutUpdateTodoMethod = GrpcServicesGrpc.getPutUpdateTodoMethod) == null) {
          GrpcServicesGrpc.getPutUpdateTodoMethod = getPutUpdateTodoMethod =
                  io.grpc.MethodDescriptor.<Services.UpdateTodo, Services.EmptyResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutUpdateTodo"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.UpdateTodo.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                                  Services.EmptyResponse.getDefaultInstance()))
                          .build();
        }
      }
    }
    return getPutUpdateTodoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrpcServicesStub newStub(io.grpc.Channel channel) {
    return new GrpcServicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrpcServicesBlockingStub newBlockingStub(
          io.grpc.Channel channel) {
    return new GrpcServicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GrpcServicesFutureStub newFutureStub(
          io.grpc.Channel channel) {
    return new GrpcServicesFutureStub(channel);
  }

  /**
   */
  public static abstract class GrpcServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void postAssignRoles(Services.AssignRoles request,
                                io.grpc.stub.StreamObserver<Services.AssignRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostAssignRolesMethod(), responseObserver);
    }

    /**
     */
    public void optionsAuthenticate(Services.Authenticate request,
                                    io.grpc.stub.StreamObserver<Services.AuthenticateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOptionsAuthenticateMethod(), responseObserver);
    }

    /**
     */
    public void getAuthenticate(Services.Authenticate request,
                                io.grpc.stub.StreamObserver<Services.AuthenticateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAuthenticateMethod(), responseObserver);
    }

    /**
     */
    public void postAuthenticate(Services.Authenticate request,
                                 io.grpc.stub.StreamObserver<Services.AuthenticateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostAuthenticateMethod(), responseObserver);
    }

    /**
     */
    public void deleteAuthenticate(Services.Authenticate request,
                                   io.grpc.stub.StreamObserver<Services.AuthenticateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAuthenticateMethod(), responseObserver);
    }

    /**
     */
    public void postConvertSessionToToken(Services.ConvertSessionToToken request,
                                          io.grpc.stub.StreamObserver<Services.ConvertSessionToTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostConvertSessionToTokenMethod(), responseObserver);
    }

    /**
     */
    public void postCreateTodo(Services.CreateTodo request,
                               io.grpc.stub.StreamObserver<Services.CreateTodoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostCreateTodoMethod(), responseObserver);
    }

    /**
     */
    public void callDeleteTodo(Services.DeleteTodo request,
                               io.grpc.stub.StreamObserver<Services.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCallDeleteTodoMethod(), responseObserver);
    }

    /**
     */
    public void callDeleteTodos(Services.DeleteTodos request,
                                io.grpc.stub.StreamObserver<Services.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCallDeleteTodosMethod(), responseObserver);
    }

    /**
     */
    public void postGetAccessToken(Services.GetAccessToken request,
                                   io.grpc.stub.StreamObserver<Services.GetAccessTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostGetAccessTokenMethod(), responseObserver);
    }

    /**
     */
    public void callGetFile(Services.GetFile request,
                            io.grpc.stub.StreamObserver<Services.FileContent> responseObserver) {
      asyncUnimplementedUnaryCall(getCallGetFileMethod(), responseObserver);
    }

    /**
     */
    public void callGetTodo(Services.GetTodo request,
                            io.grpc.stub.StreamObserver<Services.GetTodoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCallGetTodoMethod(), responseObserver);
    }

    /**
     */
    public void callGetTodos(Services.GetTodos request,
                             io.grpc.stub.StreamObserver<Services.GetTodosResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCallGetTodosMethod(), responseObserver);
    }

    /**
     */
    public void getHello(Services.Hello request,
                         io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHelloMethod(), responseObserver);
    }

    /**
     */
    public void postHello(Services.Hello request,
                          io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostHelloMethod(), responseObserver);
    }

    /**
     */
    public void putHello(Services.Hello request,
                         io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutHelloMethod(), responseObserver);
    }

    /**
     */
    public void deleteHello(Services.Hello request,
                            io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteHelloMethod(), responseObserver);
    }

    /**
     */
    public void patchHello(Services.Hello request,
                           io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchHelloMethod(), responseObserver);
    }

    /**
     */
    public void getHelloSecure(Services.HelloSecure request,
                               io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHelloSecureMethod(), responseObserver);
    }

    /**
     */
    public void postHelloSecure(Services.HelloSecure request,
                                io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostHelloSecureMethod(), responseObserver);
    }

    /**
     */
    public void putHelloSecure(Services.HelloSecure request,
                               io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutHelloSecureMethod(), responseObserver);
    }

    /**
     */
    public void deleteHelloSecure(Services.HelloSecure request,
                                  io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteHelloSecureMethod(), responseObserver);
    }

    /**
     */
    public void patchHelloSecure(Services.HelloSecure request,
                                 io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchHelloSecureMethod(), responseObserver);
    }

    /**
     */
    public void putRegister(Services.Register request,
                            io.grpc.stub.StreamObserver<Services.RegisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutRegisterMethod(), responseObserver);
    }

    /**
     */
    public void postRegister(Services.Register request,
                             io.grpc.stub.StreamObserver<Services.RegisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostRegisterMethod(), responseObserver);
    }

    /**
     */
    public void postResetTodos(Services.ResetTodos request,
                               io.grpc.stub.StreamObserver<Services.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostResetTodosMethod(), responseObserver);
    }

    /**
     */
    public void serverStreamFiles(Services.StreamFiles request,
                                  io.grpc.stub.StreamObserver<Services.FileContent> responseObserver) {
      asyncUnimplementedUnaryCall(getServerStreamFilesMethod(), responseObserver);
    }

    /**
     */
    public void serverStreamServerEvents(Services.StreamServerEvents request,
                                         io.grpc.stub.StreamObserver<Services.StreamServerEventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getServerStreamServerEventsMethod(), responseObserver);
    }

    /**
     */
    public void postUnAssignRoles(Services.UnAssignRoles request,
                                  io.grpc.stub.StreamObserver<Services.UnAssignRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostUnAssignRolesMethod(), responseObserver);
    }

    /**
     */
    public void putUpdateTodo(Services.UpdateTodo request,
                              io.grpc.stub.StreamObserver<Services.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutUpdateTodoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
              .addMethod(
                      getPostAssignRolesMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.AssignRoles,
                                      Services.AssignRolesResponse>(
                                      this, METHODID_POST_ASSIGN_ROLES)))
              .addMethod(
                      getOptionsAuthenticateMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.Authenticate,
                                      Services.AuthenticateResponse>(
                                      this, METHODID_OPTIONS_AUTHENTICATE)))
              .addMethod(
                      getGetAuthenticateMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.Authenticate,
                                      Services.AuthenticateResponse>(
                                      this, METHODID_GET_AUTHENTICATE)))
              .addMethod(
                      getPostAuthenticateMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.Authenticate,
                                      Services.AuthenticateResponse>(
                                      this, METHODID_POST_AUTHENTICATE)))
              .addMethod(
                      getDeleteAuthenticateMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.Authenticate,
                                      Services.AuthenticateResponse>(
                                      this, METHODID_DELETE_AUTHENTICATE)))
              .addMethod(
                      getPostConvertSessionToTokenMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.ConvertSessionToToken,
                                      Services.ConvertSessionToTokenResponse>(
                                      this, METHODID_POST_CONVERT_SESSION_TO_TOKEN)))
              .addMethod(
                      getPostCreateTodoMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.CreateTodo,
                                      Services.CreateTodoResponse>(
                                      this, METHODID_POST_CREATE_TODO)))
              .addMethod(
                      getCallDeleteTodoMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.DeleteTodo,
                                      Services.EmptyResponse>(
                                      this, METHODID_CALL_DELETE_TODO)))
              .addMethod(
                      getCallDeleteTodosMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.DeleteTodos,
                                      Services.EmptyResponse>(
                                      this, METHODID_CALL_DELETE_TODOS)))
              .addMethod(
                      getPostGetAccessTokenMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.GetAccessToken,
                                      Services.GetAccessTokenResponse>(
                                      this, METHODID_POST_GET_ACCESS_TOKEN)))
              .addMethod(
                      getCallGetFileMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.GetFile,
                                      Services.FileContent>(
                                      this, METHODID_CALL_GET_FILE)))
              .addMethod(
                      getCallGetTodoMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.GetTodo,
                                      Services.GetTodoResponse>(
                                      this, METHODID_CALL_GET_TODO)))
              .addMethod(
                      getCallGetTodosMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.GetTodos,
                                      Services.GetTodosResponse>(
                                      this, METHODID_CALL_GET_TODOS)))
              .addMethod(
                      getGetHelloMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.Hello,
                                      Services.HelloResponse>(
                                      this, METHODID_GET_HELLO)))
              .addMethod(
                      getPostHelloMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.Hello,
                                      Services.HelloResponse>(
                                      this, METHODID_POST_HELLO)))
              .addMethod(
                      getPutHelloMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.Hello,
                                      Services.HelloResponse>(
                                      this, METHODID_PUT_HELLO)))
              .addMethod(
                      getDeleteHelloMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.Hello,
                                      Services.HelloResponse>(
                                      this, METHODID_DELETE_HELLO)))
              .addMethod(
                      getPatchHelloMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.Hello,
                                      Services.HelloResponse>(
                                      this, METHODID_PATCH_HELLO)))
              .addMethod(
                      getGetHelloSecureMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.HelloSecure,
                                      Services.HelloResponse>(
                                      this, METHODID_GET_HELLO_SECURE)))
              .addMethod(
                      getPostHelloSecureMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.HelloSecure,
                                      Services.HelloResponse>(
                                      this, METHODID_POST_HELLO_SECURE)))
              .addMethod(
                      getPutHelloSecureMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.HelloSecure,
                                      Services.HelloResponse>(
                                      this, METHODID_PUT_HELLO_SECURE)))
              .addMethod(
                      getDeleteHelloSecureMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.HelloSecure,
                                      Services.HelloResponse>(
                                      this, METHODID_DELETE_HELLO_SECURE)))
              .addMethod(
                      getPatchHelloSecureMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.HelloSecure,
                                      Services.HelloResponse>(
                                      this, METHODID_PATCH_HELLO_SECURE)))
              .addMethod(
                      getPutRegisterMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.Register,
                                      Services.RegisterResponse>(
                                      this, METHODID_PUT_REGISTER)))
              .addMethod(
                      getPostRegisterMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.Register,
                                      Services.RegisterResponse>(
                                      this, METHODID_POST_REGISTER)))
              .addMethod(
                      getPostResetTodosMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.ResetTodos,
                                      Services.EmptyResponse>(
                                      this, METHODID_POST_RESET_TODOS)))
              .addMethod(
                      getServerStreamFilesMethod(),
                      asyncServerStreamingCall(
                              new MethodHandlers<
                                      Services.StreamFiles,
                                      Services.FileContent>(
                                      this, METHODID_SERVER_STREAM_FILES)))
              .addMethod(
                      getServerStreamServerEventsMethod(),
                      asyncServerStreamingCall(
                              new MethodHandlers<
                                      Services.StreamServerEvents,
                                      Services.StreamServerEventsResponse>(
                                      this, METHODID_SERVER_STREAM_SERVER_EVENTS)))
              .addMethod(
                      getPostUnAssignRolesMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.UnAssignRoles,
                                      Services.UnAssignRolesResponse>(
                                      this, METHODID_POST_UN_ASSIGN_ROLES)))
              .addMethod(
                      getPutUpdateTodoMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Services.UpdateTodo,
                                      Services.EmptyResponse>(
                                      this, METHODID_PUT_UPDATE_TODO)))
              .build();
    }
  }

  /**
   */
  public static final class GrpcServicesStub extends io.grpc.stub.AbstractStub<GrpcServicesStub> {
    private GrpcServicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GrpcServicesStub(io.grpc.Channel channel,
                             io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServicesStub build(io.grpc.Channel channel,
                                     io.grpc.CallOptions callOptions) {
      return new GrpcServicesStub(channel, callOptions);
    }

    /**
     */
    public void postAssignRoles(Services.AssignRoles request,
                                io.grpc.stub.StreamObserver<Services.AssignRolesResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getPostAssignRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void optionsAuthenticate(Services.Authenticate request,
                                    io.grpc.stub.StreamObserver<Services.AuthenticateResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getOptionsAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAuthenticate(Services.Authenticate request,
                                io.grpc.stub.StreamObserver<Services.AuthenticateResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postAuthenticate(Services.Authenticate request,
                                 io.grpc.stub.StreamObserver<Services.AuthenticateResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getPostAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAuthenticate(Services.Authenticate request,
                                   io.grpc.stub.StreamObserver<Services.AuthenticateResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getDeleteAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postConvertSessionToToken(Services.ConvertSessionToToken request,
                                          io.grpc.stub.StreamObserver<Services.ConvertSessionToTokenResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getPostConvertSessionToTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postCreateTodo(Services.CreateTodo request,
                               io.grpc.stub.StreamObserver<Services.CreateTodoResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getPostCreateTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callDeleteTodo(Services.DeleteTodo request,
                               io.grpc.stub.StreamObserver<Services.EmptyResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getCallDeleteTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callDeleteTodos(Services.DeleteTodos request,
                                io.grpc.stub.StreamObserver<Services.EmptyResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getCallDeleteTodosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postGetAccessToken(Services.GetAccessToken request,
                                   io.grpc.stub.StreamObserver<Services.GetAccessTokenResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getPostGetAccessTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callGetFile(Services.GetFile request,
                            io.grpc.stub.StreamObserver<Services.FileContent> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getCallGetFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callGetTodo(Services.GetTodo request,
                            io.grpc.stub.StreamObserver<Services.GetTodoResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getCallGetTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callGetTodos(Services.GetTodos request,
                             io.grpc.stub.StreamObserver<Services.GetTodosResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getCallGetTodosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHello(Services.Hello request,
                         io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postHello(Services.Hello request,
                          io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getPostHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putHello(Services.Hello request,
                         io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getPutHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteHello(Services.Hello request,
                            io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getDeleteHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void patchHello(Services.Hello request,
                           io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getPatchHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHelloSecure(Services.HelloSecure request,
                               io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetHelloSecureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postHelloSecure(Services.HelloSecure request,
                                io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getPostHelloSecureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putHelloSecure(Services.HelloSecure request,
                               io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getPutHelloSecureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteHelloSecure(Services.HelloSecure request,
                                  io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getDeleteHelloSecureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void patchHelloSecure(Services.HelloSecure request,
                                 io.grpc.stub.StreamObserver<Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getPatchHelloSecureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putRegister(Services.Register request,
                            io.grpc.stub.StreamObserver<Services.RegisterResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getPutRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postRegister(Services.Register request,
                             io.grpc.stub.StreamObserver<Services.RegisterResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getPostRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postResetTodos(Services.ResetTodos request,
                               io.grpc.stub.StreamObserver<Services.EmptyResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getPostResetTodosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serverStreamFiles(Services.StreamFiles request,
                                  io.grpc.stub.StreamObserver<Services.FileContent> responseObserver) {
      asyncServerStreamingCall(
              getChannel().newCall(getServerStreamFilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serverStreamServerEvents(Services.StreamServerEvents request,
                                         io.grpc.stub.StreamObserver<Services.StreamServerEventsResponse> responseObserver) {
      asyncServerStreamingCall(
              getChannel().newCall(getServerStreamServerEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postUnAssignRoles(Services.UnAssignRoles request,
                                  io.grpc.stub.StreamObserver<Services.UnAssignRolesResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getPostUnAssignRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putUpdateTodo(Services.UpdateTodo request,
                              io.grpc.stub.StreamObserver<Services.EmptyResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getPutUpdateTodoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GrpcServicesBlockingStub extends io.grpc.stub.AbstractStub<GrpcServicesBlockingStub> {
    private GrpcServicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GrpcServicesBlockingStub(io.grpc.Channel channel,
                                     io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServicesBlockingStub build(io.grpc.Channel channel,
                                             io.grpc.CallOptions callOptions) {
      return new GrpcServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public Services.AssignRolesResponse postAssignRoles(Services.AssignRoles request) {
      return blockingUnaryCall(
              getChannel(), getPostAssignRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.AuthenticateResponse optionsAuthenticate(Services.Authenticate request) {
      return blockingUnaryCall(
              getChannel(), getOptionsAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.AuthenticateResponse getAuthenticate(Services.Authenticate request) {
      return blockingUnaryCall(
              getChannel(), getGetAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.AuthenticateResponse postAuthenticate(Services.Authenticate request) {
      return blockingUnaryCall(
              getChannel(), getPostAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.AuthenticateResponse deleteAuthenticate(Services.Authenticate request) {
      return blockingUnaryCall(
              getChannel(), getDeleteAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.ConvertSessionToTokenResponse postConvertSessionToToken(Services.ConvertSessionToToken request) {
      return blockingUnaryCall(
              getChannel(), getPostConvertSessionToTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.CreateTodoResponse postCreateTodo(Services.CreateTodo request) {
      return blockingUnaryCall(
              getChannel(), getPostCreateTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.EmptyResponse callDeleteTodo(Services.DeleteTodo request) {
      return blockingUnaryCall(
              getChannel(), getCallDeleteTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.EmptyResponse callDeleteTodos(Services.DeleteTodos request) {
      return blockingUnaryCall(
              getChannel(), getCallDeleteTodosMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.GetAccessTokenResponse postGetAccessToken(Services.GetAccessToken request) {
      return blockingUnaryCall(
              getChannel(), getPostGetAccessTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.FileContent callGetFile(Services.GetFile request) {
      return blockingUnaryCall(
              getChannel(), getCallGetFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.GetTodoResponse callGetTodo(Services.GetTodo request) {
      return blockingUnaryCall(
              getChannel(), getCallGetTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.GetTodosResponse callGetTodos(Services.GetTodos request) {
      return blockingUnaryCall(
              getChannel(), getCallGetTodosMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.HelloResponse getHello(Services.Hello request) {
      return blockingUnaryCall(
              getChannel(), getGetHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.HelloResponse postHello(Services.Hello request) {
      return blockingUnaryCall(
              getChannel(), getPostHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.HelloResponse putHello(Services.Hello request) {
      return blockingUnaryCall(
              getChannel(), getPutHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.HelloResponse deleteHello(Services.Hello request) {
      return blockingUnaryCall(
              getChannel(), getDeleteHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.HelloResponse patchHello(Services.Hello request) {
      return blockingUnaryCall(
              getChannel(), getPatchHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.HelloResponse getHelloSecure(Services.HelloSecure request) {
      return blockingUnaryCall(
              getChannel(), getGetHelloSecureMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.HelloResponse postHelloSecure(Services.HelloSecure request) {
      return blockingUnaryCall(
              getChannel(), getPostHelloSecureMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.HelloResponse putHelloSecure(Services.HelloSecure request) {
      return blockingUnaryCall(
              getChannel(), getPutHelloSecureMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.HelloResponse deleteHelloSecure(Services.HelloSecure request) {
      return blockingUnaryCall(
              getChannel(), getDeleteHelloSecureMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.HelloResponse patchHelloSecure(Services.HelloSecure request) {
      return blockingUnaryCall(
              getChannel(), getPatchHelloSecureMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.RegisterResponse putRegister(Services.Register request) {
      return blockingUnaryCall(
              getChannel(), getPutRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.RegisterResponse postRegister(Services.Register request) {
      return blockingUnaryCall(
              getChannel(), getPostRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.EmptyResponse postResetTodos(Services.ResetTodos request) {
      return blockingUnaryCall(
              getChannel(), getPostResetTodosMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<Services.FileContent> serverStreamFiles(
            Services.StreamFiles request) {
      return blockingServerStreamingCall(
              getChannel(), getServerStreamFilesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<Services.StreamServerEventsResponse> serverStreamServerEvents(
            Services.StreamServerEvents request) {
      return blockingServerStreamingCall(
              getChannel(), getServerStreamServerEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.UnAssignRolesResponse postUnAssignRoles(Services.UnAssignRoles request) {
      return blockingUnaryCall(
              getChannel(), getPostUnAssignRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public Services.EmptyResponse putUpdateTodo(Services.UpdateTodo request) {
      return blockingUnaryCall(
              getChannel(), getPutUpdateTodoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GrpcServicesFutureStub extends io.grpc.stub.AbstractStub<GrpcServicesFutureStub> {
    private GrpcServicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GrpcServicesFutureStub(io.grpc.Channel channel,
                                   io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServicesFutureStub build(io.grpc.Channel channel,
                                           io.grpc.CallOptions callOptions) {
      return new GrpcServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.AssignRolesResponse> postAssignRoles(
            Services.AssignRoles request) {
      return futureUnaryCall(
              getChannel().newCall(getPostAssignRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.AuthenticateResponse> optionsAuthenticate(
            Services.Authenticate request) {
      return futureUnaryCall(
              getChannel().newCall(getOptionsAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.AuthenticateResponse> getAuthenticate(
            Services.Authenticate request) {
      return futureUnaryCall(
              getChannel().newCall(getGetAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.AuthenticateResponse> postAuthenticate(
            Services.Authenticate request) {
      return futureUnaryCall(
              getChannel().newCall(getPostAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.AuthenticateResponse> deleteAuthenticate(
            Services.Authenticate request) {
      return futureUnaryCall(
              getChannel().newCall(getDeleteAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.ConvertSessionToTokenResponse> postConvertSessionToToken(
            Services.ConvertSessionToToken request) {
      return futureUnaryCall(
              getChannel().newCall(getPostConvertSessionToTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.CreateTodoResponse> postCreateTodo(
            Services.CreateTodo request) {
      return futureUnaryCall(
              getChannel().newCall(getPostCreateTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.EmptyResponse> callDeleteTodo(
            Services.DeleteTodo request) {
      return futureUnaryCall(
              getChannel().newCall(getCallDeleteTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.EmptyResponse> callDeleteTodos(
            Services.DeleteTodos request) {
      return futureUnaryCall(
              getChannel().newCall(getCallDeleteTodosMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.GetAccessTokenResponse> postGetAccessToken(
            Services.GetAccessToken request) {
      return futureUnaryCall(
              getChannel().newCall(getPostGetAccessTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.FileContent> callGetFile(
            Services.GetFile request) {
      return futureUnaryCall(
              getChannel().newCall(getCallGetFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.GetTodoResponse> callGetTodo(
            Services.GetTodo request) {
      return futureUnaryCall(
              getChannel().newCall(getCallGetTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.GetTodosResponse> callGetTodos(
            Services.GetTodos request) {
      return futureUnaryCall(
              getChannel().newCall(getCallGetTodosMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.HelloResponse> getHello(
            Services.Hello request) {
      return futureUnaryCall(
              getChannel().newCall(getGetHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.HelloResponse> postHello(
            Services.Hello request) {
      return futureUnaryCall(
              getChannel().newCall(getPostHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.HelloResponse> putHello(
            Services.Hello request) {
      return futureUnaryCall(
              getChannel().newCall(getPutHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.HelloResponse> deleteHello(
            Services.Hello request) {
      return futureUnaryCall(
              getChannel().newCall(getDeleteHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.HelloResponse> patchHello(
            Services.Hello request) {
      return futureUnaryCall(
              getChannel().newCall(getPatchHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.HelloResponse> getHelloSecure(
            Services.HelloSecure request) {
      return futureUnaryCall(
              getChannel().newCall(getGetHelloSecureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.HelloResponse> postHelloSecure(
            Services.HelloSecure request) {
      return futureUnaryCall(
              getChannel().newCall(getPostHelloSecureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.HelloResponse> putHelloSecure(
            Services.HelloSecure request) {
      return futureUnaryCall(
              getChannel().newCall(getPutHelloSecureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.HelloResponse> deleteHelloSecure(
            Services.HelloSecure request) {
      return futureUnaryCall(
              getChannel().newCall(getDeleteHelloSecureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.HelloResponse> patchHelloSecure(
            Services.HelloSecure request) {
      return futureUnaryCall(
              getChannel().newCall(getPatchHelloSecureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.RegisterResponse> putRegister(
            Services.Register request) {
      return futureUnaryCall(
              getChannel().newCall(getPutRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.RegisterResponse> postRegister(
            Services.Register request) {
      return futureUnaryCall(
              getChannel().newCall(getPostRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.EmptyResponse> postResetTodos(
            Services.ResetTodos request) {
      return futureUnaryCall(
              getChannel().newCall(getPostResetTodosMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.UnAssignRolesResponse> postUnAssignRoles(
            Services.UnAssignRoles request) {
      return futureUnaryCall(
              getChannel().newCall(getPostUnAssignRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Services.EmptyResponse> putUpdateTodo(
            Services.UpdateTodo request) {
      return futureUnaryCall(
              getChannel().newCall(getPutUpdateTodoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POST_ASSIGN_ROLES = 0;
  private static final int METHODID_OPTIONS_AUTHENTICATE = 1;
  private static final int METHODID_GET_AUTHENTICATE = 2;
  private static final int METHODID_POST_AUTHENTICATE = 3;
  private static final int METHODID_DELETE_AUTHENTICATE = 4;
  private static final int METHODID_POST_CONVERT_SESSION_TO_TOKEN = 5;
  private static final int METHODID_POST_CREATE_TODO = 6;
  private static final int METHODID_CALL_DELETE_TODO = 7;
  private static final int METHODID_CALL_DELETE_TODOS = 8;
  private static final int METHODID_POST_GET_ACCESS_TOKEN = 9;
  private static final int METHODID_CALL_GET_FILE = 10;
  private static final int METHODID_CALL_GET_TODO = 11;
  private static final int METHODID_CALL_GET_TODOS = 12;
  private static final int METHODID_GET_HELLO = 13;
  private static final int METHODID_POST_HELLO = 14;
  private static final int METHODID_PUT_HELLO = 15;
  private static final int METHODID_DELETE_HELLO = 16;
  private static final int METHODID_PATCH_HELLO = 17;
  private static final int METHODID_GET_HELLO_SECURE = 18;
  private static final int METHODID_POST_HELLO_SECURE = 19;
  private static final int METHODID_PUT_HELLO_SECURE = 20;
  private static final int METHODID_DELETE_HELLO_SECURE = 21;
  private static final int METHODID_PATCH_HELLO_SECURE = 22;
  private static final int METHODID_PUT_REGISTER = 23;
  private static final int METHODID_POST_REGISTER = 24;
  private static final int METHODID_POST_RESET_TODOS = 25;
  private static final int METHODID_SERVER_STREAM_FILES = 26;
  private static final int METHODID_SERVER_STREAM_SERVER_EVENTS = 27;
  private static final int METHODID_POST_UN_ASSIGN_ROLES = 28;
  private static final int METHODID_PUT_UPDATE_TODO = 29;

  private static final class MethodHandlers<Req, Resp> implements
          io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GrpcServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GrpcServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POST_ASSIGN_ROLES:
          serviceImpl.postAssignRoles((Services.AssignRoles) request,
                  (io.grpc.stub.StreamObserver<Services.AssignRolesResponse>) responseObserver);
          break;
        case METHODID_OPTIONS_AUTHENTICATE:
          serviceImpl.optionsAuthenticate((Services.Authenticate) request,
                  (io.grpc.stub.StreamObserver<Services.AuthenticateResponse>) responseObserver);
          break;
        case METHODID_GET_AUTHENTICATE:
          serviceImpl.getAuthenticate((Services.Authenticate) request,
                  (io.grpc.stub.StreamObserver<Services.AuthenticateResponse>) responseObserver);
          break;
        case METHODID_POST_AUTHENTICATE:
          serviceImpl.postAuthenticate((Services.Authenticate) request,
                  (io.grpc.stub.StreamObserver<Services.AuthenticateResponse>) responseObserver);
          break;
        case METHODID_DELETE_AUTHENTICATE:
          serviceImpl.deleteAuthenticate((Services.Authenticate) request,
                  (io.grpc.stub.StreamObserver<Services.AuthenticateResponse>) responseObserver);
          break;
        case METHODID_POST_CONVERT_SESSION_TO_TOKEN:
          serviceImpl.postConvertSessionToToken((Services.ConvertSessionToToken) request,
                  (io.grpc.stub.StreamObserver<Services.ConvertSessionToTokenResponse>) responseObserver);
          break;
        case METHODID_POST_CREATE_TODO:
          serviceImpl.postCreateTodo((Services.CreateTodo) request,
                  (io.grpc.stub.StreamObserver<Services.CreateTodoResponse>) responseObserver);
          break;
        case METHODID_CALL_DELETE_TODO:
          serviceImpl.callDeleteTodo((Services.DeleteTodo) request,
                  (io.grpc.stub.StreamObserver<Services.EmptyResponse>) responseObserver);
          break;
        case METHODID_CALL_DELETE_TODOS:
          serviceImpl.callDeleteTodos((Services.DeleteTodos) request,
                  (io.grpc.stub.StreamObserver<Services.EmptyResponse>) responseObserver);
          break;
        case METHODID_POST_GET_ACCESS_TOKEN:
          serviceImpl.postGetAccessToken((Services.GetAccessToken) request,
                  (io.grpc.stub.StreamObserver<Services.GetAccessTokenResponse>) responseObserver);
          break;
        case METHODID_CALL_GET_FILE:
          serviceImpl.callGetFile((Services.GetFile) request,
                  (io.grpc.stub.StreamObserver<Services.FileContent>) responseObserver);
          break;
        case METHODID_CALL_GET_TODO:
          serviceImpl.callGetTodo((Services.GetTodo) request,
                  (io.grpc.stub.StreamObserver<Services.GetTodoResponse>) responseObserver);
          break;
        case METHODID_CALL_GET_TODOS:
          serviceImpl.callGetTodos((Services.GetTodos) request,
                  (io.grpc.stub.StreamObserver<Services.GetTodosResponse>) responseObserver);
          break;
        case METHODID_GET_HELLO:
          serviceImpl.getHello((Services.Hello) request,
                  (io.grpc.stub.StreamObserver<Services.HelloResponse>) responseObserver);
          break;
        case METHODID_POST_HELLO:
          serviceImpl.postHello((Services.Hello) request,
                  (io.grpc.stub.StreamObserver<Services.HelloResponse>) responseObserver);
          break;
        case METHODID_PUT_HELLO:
          serviceImpl.putHello((Services.Hello) request,
                  (io.grpc.stub.StreamObserver<Services.HelloResponse>) responseObserver);
          break;
        case METHODID_DELETE_HELLO:
          serviceImpl.deleteHello((Services.Hello) request,
                  (io.grpc.stub.StreamObserver<Services.HelloResponse>) responseObserver);
          break;
        case METHODID_PATCH_HELLO:
          serviceImpl.patchHello((Services.Hello) request,
                  (io.grpc.stub.StreamObserver<Services.HelloResponse>) responseObserver);
          break;
        case METHODID_GET_HELLO_SECURE:
          serviceImpl.getHelloSecure((Services.HelloSecure) request,
                  (io.grpc.stub.StreamObserver<Services.HelloResponse>) responseObserver);
          break;
        case METHODID_POST_HELLO_SECURE:
          serviceImpl.postHelloSecure((Services.HelloSecure) request,
                  (io.grpc.stub.StreamObserver<Services.HelloResponse>) responseObserver);
          break;
        case METHODID_PUT_HELLO_SECURE:
          serviceImpl.putHelloSecure((Services.HelloSecure) request,
                  (io.grpc.stub.StreamObserver<Services.HelloResponse>) responseObserver);
          break;
        case METHODID_DELETE_HELLO_SECURE:
          serviceImpl.deleteHelloSecure((Services.HelloSecure) request,
                  (io.grpc.stub.StreamObserver<Services.HelloResponse>) responseObserver);
          break;
        case METHODID_PATCH_HELLO_SECURE:
          serviceImpl.patchHelloSecure((Services.HelloSecure) request,
                  (io.grpc.stub.StreamObserver<Services.HelloResponse>) responseObserver);
          break;
        case METHODID_PUT_REGISTER:
          serviceImpl.putRegister((Services.Register) request,
                  (io.grpc.stub.StreamObserver<Services.RegisterResponse>) responseObserver);
          break;
        case METHODID_POST_REGISTER:
          serviceImpl.postRegister((Services.Register) request,
                  (io.grpc.stub.StreamObserver<Services.RegisterResponse>) responseObserver);
          break;
        case METHODID_POST_RESET_TODOS:
          serviceImpl.postResetTodos((Services.ResetTodos) request,
                  (io.grpc.stub.StreamObserver<Services.EmptyResponse>) responseObserver);
          break;
        case METHODID_SERVER_STREAM_FILES:
          serviceImpl.serverStreamFiles((Services.StreamFiles) request,
                  (io.grpc.stub.StreamObserver<Services.FileContent>) responseObserver);
          break;
        case METHODID_SERVER_STREAM_SERVER_EVENTS:
          serviceImpl.serverStreamServerEvents((Services.StreamServerEvents) request,
                  (io.grpc.stub.StreamObserver<Services.StreamServerEventsResponse>) responseObserver);
          break;
        case METHODID_POST_UN_ASSIGN_ROLES:
          serviceImpl.postUnAssignRoles((Services.UnAssignRoles) request,
                  (io.grpc.stub.StreamObserver<Services.UnAssignRolesResponse>) responseObserver);
          break;
        case METHODID_PUT_UPDATE_TODO:
          serviceImpl.putUpdateTodo((Services.UpdateTodo) request,
                  (io.grpc.stub.StreamObserver<Services.EmptyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
            io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GrpcServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                  .addMethod(getPostAssignRolesMethod())
                  .addMethod(getOptionsAuthenticateMethod())
                  .addMethod(getGetAuthenticateMethod())
                  .addMethod(getPostAuthenticateMethod())
                  .addMethod(getDeleteAuthenticateMethod())
                  .addMethod(getPostConvertSessionToTokenMethod())
                  .addMethod(getPostCreateTodoMethod())
                  .addMethod(getCallDeleteTodoMethod())
                  .addMethod(getCallDeleteTodosMethod())
                  .addMethod(getPostGetAccessTokenMethod())
                  .addMethod(getCallGetFileMethod())
                  .addMethod(getCallGetTodoMethod())
                  .addMethod(getCallGetTodosMethod())
                  .addMethod(getGetHelloMethod())
                  .addMethod(getPostHelloMethod())
                  .addMethod(getPutHelloMethod())
                  .addMethod(getDeleteHelloMethod())
                  .addMethod(getPatchHelloMethod())
                  .addMethod(getGetHelloSecureMethod())
                  .addMethod(getPostHelloSecureMethod())
                  .addMethod(getPutHelloSecureMethod())
                  .addMethod(getDeleteHelloSecureMethod())
                  .addMethod(getPatchHelloSecureMethod())
                  .addMethod(getPutRegisterMethod())
                  .addMethod(getPostRegisterMethod())
                  .addMethod(getPostResetTodosMethod())
                  .addMethod(getServerStreamFilesMethod())
                  .addMethod(getServerStreamServerEventsMethod())
                  .addMethod(getPostUnAssignRolesMethod())
                  .addMethod(getPutUpdateTodoMethod())
                  .build();
        }
      }
    }
    return result;
  }
}
