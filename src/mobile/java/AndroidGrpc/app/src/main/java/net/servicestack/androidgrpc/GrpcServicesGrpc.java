package net.servicestack.androidgrpc;

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
  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.AssignRoles,
      net.servicestack.androidgrpc.Services.AssignRolesResponse> getPostAssignRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostAssignRoles",
      requestType = net.servicestack.androidgrpc.Services.AssignRoles.class,
      responseType = net.servicestack.androidgrpc.Services.AssignRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.AssignRoles,
      net.servicestack.androidgrpc.Services.AssignRolesResponse> getPostAssignRolesMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.AssignRoles, net.servicestack.androidgrpc.Services.AssignRolesResponse> getPostAssignRolesMethod;
    if ((getPostAssignRolesMethod = GrpcServicesGrpc.getPostAssignRolesMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostAssignRolesMethod = GrpcServicesGrpc.getPostAssignRolesMethod) == null) {
          GrpcServicesGrpc.getPostAssignRolesMethod = getPostAssignRolesMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.AssignRoles, net.servicestack.androidgrpc.Services.AssignRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostAssignRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.AssignRoles.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.AssignRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("PostAssignRoles"))
              .build();
        }
      }
    }
    return getPostAssignRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Authenticate,
      net.servicestack.androidgrpc.Services.AuthenticateResponse> getOptionsAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OptionsAuthenticate",
      requestType = net.servicestack.androidgrpc.Services.Authenticate.class,
      responseType = net.servicestack.androidgrpc.Services.AuthenticateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Authenticate,
      net.servicestack.androidgrpc.Services.AuthenticateResponse> getOptionsAuthenticateMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Authenticate, net.servicestack.androidgrpc.Services.AuthenticateResponse> getOptionsAuthenticateMethod;
    if ((getOptionsAuthenticateMethod = GrpcServicesGrpc.getOptionsAuthenticateMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getOptionsAuthenticateMethod = GrpcServicesGrpc.getOptionsAuthenticateMethod) == null) {
          GrpcServicesGrpc.getOptionsAuthenticateMethod = getOptionsAuthenticateMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.Authenticate, net.servicestack.androidgrpc.Services.AuthenticateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OptionsAuthenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.Authenticate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.AuthenticateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("OptionsAuthenticate"))
              .build();
        }
      }
    }
    return getOptionsAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Authenticate,
      net.servicestack.androidgrpc.Services.AuthenticateResponse> getGetAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthenticate",
      requestType = net.servicestack.androidgrpc.Services.Authenticate.class,
      responseType = net.servicestack.androidgrpc.Services.AuthenticateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Authenticate,
      net.servicestack.androidgrpc.Services.AuthenticateResponse> getGetAuthenticateMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Authenticate, net.servicestack.androidgrpc.Services.AuthenticateResponse> getGetAuthenticateMethod;
    if ((getGetAuthenticateMethod = GrpcServicesGrpc.getGetAuthenticateMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getGetAuthenticateMethod = GrpcServicesGrpc.getGetAuthenticateMethod) == null) {
          GrpcServicesGrpc.getGetAuthenticateMethod = getGetAuthenticateMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.Authenticate, net.servicestack.androidgrpc.Services.AuthenticateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.Authenticate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.AuthenticateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("GetAuthenticate"))
              .build();
        }
      }
    }
    return getGetAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Authenticate,
      net.servicestack.androidgrpc.Services.AuthenticateResponse> getPostAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostAuthenticate",
      requestType = net.servicestack.androidgrpc.Services.Authenticate.class,
      responseType = net.servicestack.androidgrpc.Services.AuthenticateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Authenticate,
      net.servicestack.androidgrpc.Services.AuthenticateResponse> getPostAuthenticateMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Authenticate, net.servicestack.androidgrpc.Services.AuthenticateResponse> getPostAuthenticateMethod;
    if ((getPostAuthenticateMethod = GrpcServicesGrpc.getPostAuthenticateMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostAuthenticateMethod = GrpcServicesGrpc.getPostAuthenticateMethod) == null) {
          GrpcServicesGrpc.getPostAuthenticateMethod = getPostAuthenticateMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.Authenticate, net.servicestack.androidgrpc.Services.AuthenticateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostAuthenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.Authenticate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.AuthenticateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("PostAuthenticate"))
              .build();
        }
      }
    }
    return getPostAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Authenticate,
      net.servicestack.androidgrpc.Services.AuthenticateResponse> getDeleteAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAuthenticate",
      requestType = net.servicestack.androidgrpc.Services.Authenticate.class,
      responseType = net.servicestack.androidgrpc.Services.AuthenticateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Authenticate,
      net.servicestack.androidgrpc.Services.AuthenticateResponse> getDeleteAuthenticateMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Authenticate, net.servicestack.androidgrpc.Services.AuthenticateResponse> getDeleteAuthenticateMethod;
    if ((getDeleteAuthenticateMethod = GrpcServicesGrpc.getDeleteAuthenticateMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getDeleteAuthenticateMethod = GrpcServicesGrpc.getDeleteAuthenticateMethod) == null) {
          GrpcServicesGrpc.getDeleteAuthenticateMethod = getDeleteAuthenticateMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.Authenticate, net.servicestack.androidgrpc.Services.AuthenticateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAuthenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.Authenticate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.AuthenticateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("DeleteAuthenticate"))
              .build();
        }
      }
    }
    return getDeleteAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.ConvertSessionToToken,
      net.servicestack.androidgrpc.Services.ConvertSessionToTokenResponse> getPostConvertSessionToTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostConvertSessionToToken",
      requestType = net.servicestack.androidgrpc.Services.ConvertSessionToToken.class,
      responseType = net.servicestack.androidgrpc.Services.ConvertSessionToTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.ConvertSessionToToken,
      net.servicestack.androidgrpc.Services.ConvertSessionToTokenResponse> getPostConvertSessionToTokenMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.ConvertSessionToToken, net.servicestack.androidgrpc.Services.ConvertSessionToTokenResponse> getPostConvertSessionToTokenMethod;
    if ((getPostConvertSessionToTokenMethod = GrpcServicesGrpc.getPostConvertSessionToTokenMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostConvertSessionToTokenMethod = GrpcServicesGrpc.getPostConvertSessionToTokenMethod) == null) {
          GrpcServicesGrpc.getPostConvertSessionToTokenMethod = getPostConvertSessionToTokenMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.ConvertSessionToToken, net.servicestack.androidgrpc.Services.ConvertSessionToTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostConvertSessionToToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.ConvertSessionToToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.ConvertSessionToTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("PostConvertSessionToToken"))
              .build();
        }
      }
    }
    return getPostConvertSessionToTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.CreateTodo,
      net.servicestack.androidgrpc.Services.CreateTodoResponse> getPostCreateTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostCreateTodo",
      requestType = net.servicestack.androidgrpc.Services.CreateTodo.class,
      responseType = net.servicestack.androidgrpc.Services.CreateTodoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.CreateTodo,
      net.servicestack.androidgrpc.Services.CreateTodoResponse> getPostCreateTodoMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.CreateTodo, net.servicestack.androidgrpc.Services.CreateTodoResponse> getPostCreateTodoMethod;
    if ((getPostCreateTodoMethod = GrpcServicesGrpc.getPostCreateTodoMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostCreateTodoMethod = GrpcServicesGrpc.getPostCreateTodoMethod) == null) {
          GrpcServicesGrpc.getPostCreateTodoMethod = getPostCreateTodoMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.CreateTodo, net.servicestack.androidgrpc.Services.CreateTodoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostCreateTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.CreateTodo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.CreateTodoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("PostCreateTodo"))
              .build();
        }
      }
    }
    return getPostCreateTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.DeleteTodo,
      net.servicestack.androidgrpc.Services.EmptyResponse> getCallDeleteTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallDeleteTodo",
      requestType = net.servicestack.androidgrpc.Services.DeleteTodo.class,
      responseType = net.servicestack.androidgrpc.Services.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.DeleteTodo,
      net.servicestack.androidgrpc.Services.EmptyResponse> getCallDeleteTodoMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.DeleteTodo, net.servicestack.androidgrpc.Services.EmptyResponse> getCallDeleteTodoMethod;
    if ((getCallDeleteTodoMethod = GrpcServicesGrpc.getCallDeleteTodoMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getCallDeleteTodoMethod = GrpcServicesGrpc.getCallDeleteTodoMethod) == null) {
          GrpcServicesGrpc.getCallDeleteTodoMethod = getCallDeleteTodoMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.DeleteTodo, net.servicestack.androidgrpc.Services.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallDeleteTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.DeleteTodo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("CallDeleteTodo"))
              .build();
        }
      }
    }
    return getCallDeleteTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.DeleteTodos,
      net.servicestack.androidgrpc.Services.EmptyResponse> getCallDeleteTodosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallDeleteTodos",
      requestType = net.servicestack.androidgrpc.Services.DeleteTodos.class,
      responseType = net.servicestack.androidgrpc.Services.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.DeleteTodos,
      net.servicestack.androidgrpc.Services.EmptyResponse> getCallDeleteTodosMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.DeleteTodos, net.servicestack.androidgrpc.Services.EmptyResponse> getCallDeleteTodosMethod;
    if ((getCallDeleteTodosMethod = GrpcServicesGrpc.getCallDeleteTodosMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getCallDeleteTodosMethod = GrpcServicesGrpc.getCallDeleteTodosMethod) == null) {
          GrpcServicesGrpc.getCallDeleteTodosMethod = getCallDeleteTodosMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.DeleteTodos, net.servicestack.androidgrpc.Services.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallDeleteTodos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.DeleteTodos.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("CallDeleteTodos"))
              .build();
        }
      }
    }
    return getCallDeleteTodosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.GetAccessToken,
      net.servicestack.androidgrpc.Services.GetAccessTokenResponse> getPostGetAccessTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostGetAccessToken",
      requestType = net.servicestack.androidgrpc.Services.GetAccessToken.class,
      responseType = net.servicestack.androidgrpc.Services.GetAccessTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.GetAccessToken,
      net.servicestack.androidgrpc.Services.GetAccessTokenResponse> getPostGetAccessTokenMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.GetAccessToken, net.servicestack.androidgrpc.Services.GetAccessTokenResponse> getPostGetAccessTokenMethod;
    if ((getPostGetAccessTokenMethod = GrpcServicesGrpc.getPostGetAccessTokenMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostGetAccessTokenMethod = GrpcServicesGrpc.getPostGetAccessTokenMethod) == null) {
          GrpcServicesGrpc.getPostGetAccessTokenMethod = getPostGetAccessTokenMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.GetAccessToken, net.servicestack.androidgrpc.Services.GetAccessTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostGetAccessToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.GetAccessToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.GetAccessTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("PostGetAccessToken"))
              .build();
        }
      }
    }
    return getPostGetAccessTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.GetTodo,
      net.servicestack.androidgrpc.Services.GetTodoResponse> getCallGetTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallGetTodo",
      requestType = net.servicestack.androidgrpc.Services.GetTodo.class,
      responseType = net.servicestack.androidgrpc.Services.GetTodoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.GetTodo,
      net.servicestack.androidgrpc.Services.GetTodoResponse> getCallGetTodoMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.GetTodo, net.servicestack.androidgrpc.Services.GetTodoResponse> getCallGetTodoMethod;
    if ((getCallGetTodoMethod = GrpcServicesGrpc.getCallGetTodoMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getCallGetTodoMethod = GrpcServicesGrpc.getCallGetTodoMethod) == null) {
          GrpcServicesGrpc.getCallGetTodoMethod = getCallGetTodoMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.GetTodo, net.servicestack.androidgrpc.Services.GetTodoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallGetTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.GetTodo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.GetTodoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("CallGetTodo"))
              .build();
        }
      }
    }
    return getCallGetTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.GetTodos,
      net.servicestack.androidgrpc.Services.GetTodosResponse> getCallGetTodosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallGetTodos",
      requestType = net.servicestack.androidgrpc.Services.GetTodos.class,
      responseType = net.servicestack.androidgrpc.Services.GetTodosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.GetTodos,
      net.servicestack.androidgrpc.Services.GetTodosResponse> getCallGetTodosMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.GetTodos, net.servicestack.androidgrpc.Services.GetTodosResponse> getCallGetTodosMethod;
    if ((getCallGetTodosMethod = GrpcServicesGrpc.getCallGetTodosMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getCallGetTodosMethod = GrpcServicesGrpc.getCallGetTodosMethod) == null) {
          GrpcServicesGrpc.getCallGetTodosMethod = getCallGetTodosMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.GetTodos, net.servicestack.androidgrpc.Services.GetTodosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallGetTodos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.GetTodos.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.GetTodosResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("CallGetTodos"))
              .build();
        }
      }
    }
    return getCallGetTodosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Hello,
      net.servicestack.androidgrpc.Services.HelloResponse> getGetHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHello",
      requestType = net.servicestack.androidgrpc.Services.Hello.class,
      responseType = net.servicestack.androidgrpc.Services.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Hello,
      net.servicestack.androidgrpc.Services.HelloResponse> getGetHelloMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Hello, net.servicestack.androidgrpc.Services.HelloResponse> getGetHelloMethod;
    if ((getGetHelloMethod = GrpcServicesGrpc.getGetHelloMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getGetHelloMethod = GrpcServicesGrpc.getGetHelloMethod) == null) {
          GrpcServicesGrpc.getGetHelloMethod = getGetHelloMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.Hello, net.servicestack.androidgrpc.Services.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.Hello.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("GetHello"))
              .build();
        }
      }
    }
    return getGetHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Hello,
      net.servicestack.androidgrpc.Services.HelloResponse> getPostHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostHello",
      requestType = net.servicestack.androidgrpc.Services.Hello.class,
      responseType = net.servicestack.androidgrpc.Services.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Hello,
      net.servicestack.androidgrpc.Services.HelloResponse> getPostHelloMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Hello, net.servicestack.androidgrpc.Services.HelloResponse> getPostHelloMethod;
    if ((getPostHelloMethod = GrpcServicesGrpc.getPostHelloMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostHelloMethod = GrpcServicesGrpc.getPostHelloMethod) == null) {
          GrpcServicesGrpc.getPostHelloMethod = getPostHelloMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.Hello, net.servicestack.androidgrpc.Services.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.Hello.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("PostHello"))
              .build();
        }
      }
    }
    return getPostHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Hello,
      net.servicestack.androidgrpc.Services.HelloResponse> getPutHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutHello",
      requestType = net.servicestack.androidgrpc.Services.Hello.class,
      responseType = net.servicestack.androidgrpc.Services.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Hello,
      net.servicestack.androidgrpc.Services.HelloResponse> getPutHelloMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Hello, net.servicestack.androidgrpc.Services.HelloResponse> getPutHelloMethod;
    if ((getPutHelloMethod = GrpcServicesGrpc.getPutHelloMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPutHelloMethod = GrpcServicesGrpc.getPutHelloMethod) == null) {
          GrpcServicesGrpc.getPutHelloMethod = getPutHelloMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.Hello, net.servicestack.androidgrpc.Services.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.Hello.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("PutHello"))
              .build();
        }
      }
    }
    return getPutHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Hello,
      net.servicestack.androidgrpc.Services.HelloResponse> getDeleteHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHello",
      requestType = net.servicestack.androidgrpc.Services.Hello.class,
      responseType = net.servicestack.androidgrpc.Services.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Hello,
      net.servicestack.androidgrpc.Services.HelloResponse> getDeleteHelloMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Hello, net.servicestack.androidgrpc.Services.HelloResponse> getDeleteHelloMethod;
    if ((getDeleteHelloMethod = GrpcServicesGrpc.getDeleteHelloMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getDeleteHelloMethod = GrpcServicesGrpc.getDeleteHelloMethod) == null) {
          GrpcServicesGrpc.getDeleteHelloMethod = getDeleteHelloMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.Hello, net.servicestack.androidgrpc.Services.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.Hello.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("DeleteHello"))
              .build();
        }
      }
    }
    return getDeleteHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.HelloSecure,
      net.servicestack.androidgrpc.Services.HelloResponse> getGetHelloSecureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHelloSecure",
      requestType = net.servicestack.androidgrpc.Services.HelloSecure.class,
      responseType = net.servicestack.androidgrpc.Services.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.HelloSecure,
      net.servicestack.androidgrpc.Services.HelloResponse> getGetHelloSecureMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.HelloSecure, net.servicestack.androidgrpc.Services.HelloResponse> getGetHelloSecureMethod;
    if ((getGetHelloSecureMethod = GrpcServicesGrpc.getGetHelloSecureMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getGetHelloSecureMethod = GrpcServicesGrpc.getGetHelloSecureMethod) == null) {
          GrpcServicesGrpc.getGetHelloSecureMethod = getGetHelloSecureMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.HelloSecure, net.servicestack.androidgrpc.Services.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHelloSecure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.HelloSecure.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("GetHelloSecure"))
              .build();
        }
      }
    }
    return getGetHelloSecureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.HelloSecure,
      net.servicestack.androidgrpc.Services.HelloResponse> getPostHelloSecureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostHelloSecure",
      requestType = net.servicestack.androidgrpc.Services.HelloSecure.class,
      responseType = net.servicestack.androidgrpc.Services.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.HelloSecure,
      net.servicestack.androidgrpc.Services.HelloResponse> getPostHelloSecureMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.HelloSecure, net.servicestack.androidgrpc.Services.HelloResponse> getPostHelloSecureMethod;
    if ((getPostHelloSecureMethod = GrpcServicesGrpc.getPostHelloSecureMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostHelloSecureMethod = GrpcServicesGrpc.getPostHelloSecureMethod) == null) {
          GrpcServicesGrpc.getPostHelloSecureMethod = getPostHelloSecureMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.HelloSecure, net.servicestack.androidgrpc.Services.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostHelloSecure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.HelloSecure.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("PostHelloSecure"))
              .build();
        }
      }
    }
    return getPostHelloSecureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.HelloSecure,
      net.servicestack.androidgrpc.Services.HelloResponse> getPutHelloSecureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutHelloSecure",
      requestType = net.servicestack.androidgrpc.Services.HelloSecure.class,
      responseType = net.servicestack.androidgrpc.Services.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.HelloSecure,
      net.servicestack.androidgrpc.Services.HelloResponse> getPutHelloSecureMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.HelloSecure, net.servicestack.androidgrpc.Services.HelloResponse> getPutHelloSecureMethod;
    if ((getPutHelloSecureMethod = GrpcServicesGrpc.getPutHelloSecureMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPutHelloSecureMethod = GrpcServicesGrpc.getPutHelloSecureMethod) == null) {
          GrpcServicesGrpc.getPutHelloSecureMethod = getPutHelloSecureMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.HelloSecure, net.servicestack.androidgrpc.Services.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutHelloSecure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.HelloSecure.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("PutHelloSecure"))
              .build();
        }
      }
    }
    return getPutHelloSecureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.HelloSecure,
      net.servicestack.androidgrpc.Services.HelloResponse> getDeleteHelloSecureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHelloSecure",
      requestType = net.servicestack.androidgrpc.Services.HelloSecure.class,
      responseType = net.servicestack.androidgrpc.Services.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.HelloSecure,
      net.servicestack.androidgrpc.Services.HelloResponse> getDeleteHelloSecureMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.HelloSecure, net.servicestack.androidgrpc.Services.HelloResponse> getDeleteHelloSecureMethod;
    if ((getDeleteHelloSecureMethod = GrpcServicesGrpc.getDeleteHelloSecureMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getDeleteHelloSecureMethod = GrpcServicesGrpc.getDeleteHelloSecureMethod) == null) {
          GrpcServicesGrpc.getDeleteHelloSecureMethod = getDeleteHelloSecureMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.HelloSecure, net.servicestack.androidgrpc.Services.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHelloSecure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.HelloSecure.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("DeleteHelloSecure"))
              .build();
        }
      }
    }
    return getDeleteHelloSecureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Register,
      net.servicestack.androidgrpc.Services.RegisterResponse> getPutRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutRegister",
      requestType = net.servicestack.androidgrpc.Services.Register.class,
      responseType = net.servicestack.androidgrpc.Services.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Register,
      net.servicestack.androidgrpc.Services.RegisterResponse> getPutRegisterMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Register, net.servicestack.androidgrpc.Services.RegisterResponse> getPutRegisterMethod;
    if ((getPutRegisterMethod = GrpcServicesGrpc.getPutRegisterMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPutRegisterMethod = GrpcServicesGrpc.getPutRegisterMethod) == null) {
          GrpcServicesGrpc.getPutRegisterMethod = getPutRegisterMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.Register, net.servicestack.androidgrpc.Services.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.Register.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("PutRegister"))
              .build();
        }
      }
    }
    return getPutRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Register,
      net.servicestack.androidgrpc.Services.RegisterResponse> getPostRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostRegister",
      requestType = net.servicestack.androidgrpc.Services.Register.class,
      responseType = net.servicestack.androidgrpc.Services.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Register,
      net.servicestack.androidgrpc.Services.RegisterResponse> getPostRegisterMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.Register, net.servicestack.androidgrpc.Services.RegisterResponse> getPostRegisterMethod;
    if ((getPostRegisterMethod = GrpcServicesGrpc.getPostRegisterMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostRegisterMethod = GrpcServicesGrpc.getPostRegisterMethod) == null) {
          GrpcServicesGrpc.getPostRegisterMethod = getPostRegisterMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.Register, net.servicestack.androidgrpc.Services.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.Register.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("PostRegister"))
              .build();
        }
      }
    }
    return getPostRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.ResetTodos,
      net.servicestack.androidgrpc.Services.EmptyResponse> getPostResetTodosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostResetTodos",
      requestType = net.servicestack.androidgrpc.Services.ResetTodos.class,
      responseType = net.servicestack.androidgrpc.Services.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.ResetTodos,
      net.servicestack.androidgrpc.Services.EmptyResponse> getPostResetTodosMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.ResetTodos, net.servicestack.androidgrpc.Services.EmptyResponse> getPostResetTodosMethod;
    if ((getPostResetTodosMethod = GrpcServicesGrpc.getPostResetTodosMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostResetTodosMethod = GrpcServicesGrpc.getPostResetTodosMethod) == null) {
          GrpcServicesGrpc.getPostResetTodosMethod = getPostResetTodosMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.ResetTodos, net.servicestack.androidgrpc.Services.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostResetTodos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.ResetTodos.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("PostResetTodos"))
              .build();
        }
      }
    }
    return getPostResetTodosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.StreamFiles,
      net.servicestack.androidgrpc.Services.FileContent> getServerStreamFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServerStreamFiles",
      requestType = net.servicestack.androidgrpc.Services.StreamFiles.class,
      responseType = net.servicestack.androidgrpc.Services.FileContent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.StreamFiles,
      net.servicestack.androidgrpc.Services.FileContent> getServerStreamFilesMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.StreamFiles, net.servicestack.androidgrpc.Services.FileContent> getServerStreamFilesMethod;
    if ((getServerStreamFilesMethod = GrpcServicesGrpc.getServerStreamFilesMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getServerStreamFilesMethod = GrpcServicesGrpc.getServerStreamFilesMethod) == null) {
          GrpcServicesGrpc.getServerStreamFilesMethod = getServerStreamFilesMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.StreamFiles, net.servicestack.androidgrpc.Services.FileContent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerStreamFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.StreamFiles.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.FileContent.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("ServerStreamFiles"))
              .build();
        }
      }
    }
    return getServerStreamFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.StreamServerEvents,
      net.servicestack.androidgrpc.Services.StreamServerEventsResponse> getServerStreamServerEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServerStreamServerEvents",
      requestType = net.servicestack.androidgrpc.Services.StreamServerEvents.class,
      responseType = net.servicestack.androidgrpc.Services.StreamServerEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.StreamServerEvents,
      net.servicestack.androidgrpc.Services.StreamServerEventsResponse> getServerStreamServerEventsMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.StreamServerEvents, net.servicestack.androidgrpc.Services.StreamServerEventsResponse> getServerStreamServerEventsMethod;
    if ((getServerStreamServerEventsMethod = GrpcServicesGrpc.getServerStreamServerEventsMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getServerStreamServerEventsMethod = GrpcServicesGrpc.getServerStreamServerEventsMethod) == null) {
          GrpcServicesGrpc.getServerStreamServerEventsMethod = getServerStreamServerEventsMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.StreamServerEvents, net.servicestack.androidgrpc.Services.StreamServerEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerStreamServerEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.StreamServerEvents.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.StreamServerEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("ServerStreamServerEvents"))
              .build();
        }
      }
    }
    return getServerStreamServerEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.UnAssignRoles,
      net.servicestack.androidgrpc.Services.UnAssignRolesResponse> getPostUnAssignRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostUnAssignRoles",
      requestType = net.servicestack.androidgrpc.Services.UnAssignRoles.class,
      responseType = net.servicestack.androidgrpc.Services.UnAssignRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.UnAssignRoles,
      net.servicestack.androidgrpc.Services.UnAssignRolesResponse> getPostUnAssignRolesMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.UnAssignRoles, net.servicestack.androidgrpc.Services.UnAssignRolesResponse> getPostUnAssignRolesMethod;
    if ((getPostUnAssignRolesMethod = GrpcServicesGrpc.getPostUnAssignRolesMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPostUnAssignRolesMethod = GrpcServicesGrpc.getPostUnAssignRolesMethod) == null) {
          GrpcServicesGrpc.getPostUnAssignRolesMethod = getPostUnAssignRolesMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.UnAssignRoles, net.servicestack.androidgrpc.Services.UnAssignRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostUnAssignRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.UnAssignRoles.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.UnAssignRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("PostUnAssignRoles"))
              .build();
        }
      }
    }
    return getPostUnAssignRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.UpdateTodo,
      net.servicestack.androidgrpc.Services.EmptyResponse> getPutUpdateTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutUpdateTodo",
      requestType = net.servicestack.androidgrpc.Services.UpdateTodo.class,
      responseType = net.servicestack.androidgrpc.Services.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.UpdateTodo,
      net.servicestack.androidgrpc.Services.EmptyResponse> getPutUpdateTodoMethod() {
    io.grpc.MethodDescriptor<net.servicestack.androidgrpc.Services.UpdateTodo, net.servicestack.androidgrpc.Services.EmptyResponse> getPutUpdateTodoMethod;
    if ((getPutUpdateTodoMethod = GrpcServicesGrpc.getPutUpdateTodoMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getPutUpdateTodoMethod = GrpcServicesGrpc.getPutUpdateTodoMethod) == null) {
          GrpcServicesGrpc.getPutUpdateTodoMethod = getPutUpdateTodoMethod =
              io.grpc.MethodDescriptor.<net.servicestack.androidgrpc.Services.UpdateTodo, net.servicestack.androidgrpc.Services.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutUpdateTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.UpdateTodo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.servicestack.androidgrpc.Services.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("PutUpdateTodo"))
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
    public void postAssignRoles(net.servicestack.androidgrpc.Services.AssignRoles request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.AssignRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostAssignRolesMethod(), responseObserver);
    }

    /**
     */
    public void optionsAuthenticate(net.servicestack.androidgrpc.Services.Authenticate request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.AuthenticateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOptionsAuthenticateMethod(), responseObserver);
    }

    /**
     */
    public void getAuthenticate(net.servicestack.androidgrpc.Services.Authenticate request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.AuthenticateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAuthenticateMethod(), responseObserver);
    }

    /**
     */
    public void postAuthenticate(net.servicestack.androidgrpc.Services.Authenticate request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.AuthenticateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostAuthenticateMethod(), responseObserver);
    }

    /**
     */
    public void deleteAuthenticate(net.servicestack.androidgrpc.Services.Authenticate request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.AuthenticateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAuthenticateMethod(), responseObserver);
    }

    /**
     */
    public void postConvertSessionToToken(net.servicestack.androidgrpc.Services.ConvertSessionToToken request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.ConvertSessionToTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostConvertSessionToTokenMethod(), responseObserver);
    }

    /**
     */
    public void postCreateTodo(net.servicestack.androidgrpc.Services.CreateTodo request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.CreateTodoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostCreateTodoMethod(), responseObserver);
    }

    /**
     */
    public void callDeleteTodo(net.servicestack.androidgrpc.Services.DeleteTodo request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCallDeleteTodoMethod(), responseObserver);
    }

    /**
     */
    public void callDeleteTodos(net.servicestack.androidgrpc.Services.DeleteTodos request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCallDeleteTodosMethod(), responseObserver);
    }

    /**
     */
    public void postGetAccessToken(net.servicestack.androidgrpc.Services.GetAccessToken request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.GetAccessTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostGetAccessTokenMethod(), responseObserver);
    }

    /**
     */
    public void callGetTodo(net.servicestack.androidgrpc.Services.GetTodo request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.GetTodoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCallGetTodoMethod(), responseObserver);
    }

    /**
     */
    public void callGetTodos(net.servicestack.androidgrpc.Services.GetTodos request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.GetTodosResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCallGetTodosMethod(), responseObserver);
    }

    /**
     */
    public void getHello(net.servicestack.androidgrpc.Services.Hello request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHelloMethod(), responseObserver);
    }

    /**
     */
    public void postHello(net.servicestack.androidgrpc.Services.Hello request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostHelloMethod(), responseObserver);
    }

    /**
     */
    public void putHello(net.servicestack.androidgrpc.Services.Hello request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutHelloMethod(), responseObserver);
    }

    /**
     */
    public void deleteHello(net.servicestack.androidgrpc.Services.Hello request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteHelloMethod(), responseObserver);
    }

    /**
     */
    public void getHelloSecure(net.servicestack.androidgrpc.Services.HelloSecure request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHelloSecureMethod(), responseObserver);
    }

    /**
     */
    public void postHelloSecure(net.servicestack.androidgrpc.Services.HelloSecure request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostHelloSecureMethod(), responseObserver);
    }

    /**
     */
    public void putHelloSecure(net.servicestack.androidgrpc.Services.HelloSecure request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutHelloSecureMethod(), responseObserver);
    }

    /**
     */
    public void deleteHelloSecure(net.servicestack.androidgrpc.Services.HelloSecure request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteHelloSecureMethod(), responseObserver);
    }

    /**
     */
    public void putRegister(net.servicestack.androidgrpc.Services.Register request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.RegisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutRegisterMethod(), responseObserver);
    }

    /**
     */
    public void postRegister(net.servicestack.androidgrpc.Services.Register request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.RegisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostRegisterMethod(), responseObserver);
    }

    /**
     */
    public void postResetTodos(net.servicestack.androidgrpc.Services.ResetTodos request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostResetTodosMethod(), responseObserver);
    }

    /**
     */
    public void serverStreamFiles(net.servicestack.androidgrpc.Services.StreamFiles request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.FileContent> responseObserver) {
      asyncUnimplementedUnaryCall(getServerStreamFilesMethod(), responseObserver);
    }

    /**
     */
    public void serverStreamServerEvents(net.servicestack.androidgrpc.Services.StreamServerEvents request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.StreamServerEventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getServerStreamServerEventsMethod(), responseObserver);
    }

    /**
     */
    public void postUnAssignRoles(net.servicestack.androidgrpc.Services.UnAssignRoles request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.UnAssignRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostUnAssignRolesMethod(), responseObserver);
    }

    /**
     */
    public void putUpdateTodo(net.servicestack.androidgrpc.Services.UpdateTodo request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutUpdateTodoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPostAssignRolesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.AssignRoles,
                net.servicestack.androidgrpc.Services.AssignRolesResponse>(
                  this, METHODID_POST_ASSIGN_ROLES)))
          .addMethod(
            getOptionsAuthenticateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.Authenticate,
                net.servicestack.androidgrpc.Services.AuthenticateResponse>(
                  this, METHODID_OPTIONS_AUTHENTICATE)))
          .addMethod(
            getGetAuthenticateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.Authenticate,
                net.servicestack.androidgrpc.Services.AuthenticateResponse>(
                  this, METHODID_GET_AUTHENTICATE)))
          .addMethod(
            getPostAuthenticateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.Authenticate,
                net.servicestack.androidgrpc.Services.AuthenticateResponse>(
                  this, METHODID_POST_AUTHENTICATE)))
          .addMethod(
            getDeleteAuthenticateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.Authenticate,
                net.servicestack.androidgrpc.Services.AuthenticateResponse>(
                  this, METHODID_DELETE_AUTHENTICATE)))
          .addMethod(
            getPostConvertSessionToTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.ConvertSessionToToken,
                net.servicestack.androidgrpc.Services.ConvertSessionToTokenResponse>(
                  this, METHODID_POST_CONVERT_SESSION_TO_TOKEN)))
          .addMethod(
            getPostCreateTodoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.CreateTodo,
                net.servicestack.androidgrpc.Services.CreateTodoResponse>(
                  this, METHODID_POST_CREATE_TODO)))
          .addMethod(
            getCallDeleteTodoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.DeleteTodo,
                net.servicestack.androidgrpc.Services.EmptyResponse>(
                  this, METHODID_CALL_DELETE_TODO)))
          .addMethod(
            getCallDeleteTodosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.DeleteTodos,
                net.servicestack.androidgrpc.Services.EmptyResponse>(
                  this, METHODID_CALL_DELETE_TODOS)))
          .addMethod(
            getPostGetAccessTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.GetAccessToken,
                net.servicestack.androidgrpc.Services.GetAccessTokenResponse>(
                  this, METHODID_POST_GET_ACCESS_TOKEN)))
          .addMethod(
            getCallGetTodoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.GetTodo,
                net.servicestack.androidgrpc.Services.GetTodoResponse>(
                  this, METHODID_CALL_GET_TODO)))
          .addMethod(
            getCallGetTodosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.GetTodos,
                net.servicestack.androidgrpc.Services.GetTodosResponse>(
                  this, METHODID_CALL_GET_TODOS)))
          .addMethod(
            getGetHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.Hello,
                net.servicestack.androidgrpc.Services.HelloResponse>(
                  this, METHODID_GET_HELLO)))
          .addMethod(
            getPostHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.Hello,
                net.servicestack.androidgrpc.Services.HelloResponse>(
                  this, METHODID_POST_HELLO)))
          .addMethod(
            getPutHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.Hello,
                net.servicestack.androidgrpc.Services.HelloResponse>(
                  this, METHODID_PUT_HELLO)))
          .addMethod(
            getDeleteHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.Hello,
                net.servicestack.androidgrpc.Services.HelloResponse>(
                  this, METHODID_DELETE_HELLO)))
          .addMethod(
            getGetHelloSecureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.HelloSecure,
                net.servicestack.androidgrpc.Services.HelloResponse>(
                  this, METHODID_GET_HELLO_SECURE)))
          .addMethod(
            getPostHelloSecureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.HelloSecure,
                net.servicestack.androidgrpc.Services.HelloResponse>(
                  this, METHODID_POST_HELLO_SECURE)))
          .addMethod(
            getPutHelloSecureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.HelloSecure,
                net.servicestack.androidgrpc.Services.HelloResponse>(
                  this, METHODID_PUT_HELLO_SECURE)))
          .addMethod(
            getDeleteHelloSecureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.HelloSecure,
                net.servicestack.androidgrpc.Services.HelloResponse>(
                  this, METHODID_DELETE_HELLO_SECURE)))
          .addMethod(
            getPutRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.Register,
                net.servicestack.androidgrpc.Services.RegisterResponse>(
                  this, METHODID_PUT_REGISTER)))
          .addMethod(
            getPostRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.Register,
                net.servicestack.androidgrpc.Services.RegisterResponse>(
                  this, METHODID_POST_REGISTER)))
          .addMethod(
            getPostResetTodosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.ResetTodos,
                net.servicestack.androidgrpc.Services.EmptyResponse>(
                  this, METHODID_POST_RESET_TODOS)))
          .addMethod(
            getServerStreamFilesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.StreamFiles,
                net.servicestack.androidgrpc.Services.FileContent>(
                  this, METHODID_SERVER_STREAM_FILES)))
          .addMethod(
            getServerStreamServerEventsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.StreamServerEvents,
                net.servicestack.androidgrpc.Services.StreamServerEventsResponse>(
                  this, METHODID_SERVER_STREAM_SERVER_EVENTS)))
          .addMethod(
            getPostUnAssignRolesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.UnAssignRoles,
                net.servicestack.androidgrpc.Services.UnAssignRolesResponse>(
                  this, METHODID_POST_UN_ASSIGN_ROLES)))
          .addMethod(
            getPutUpdateTodoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.servicestack.androidgrpc.Services.UpdateTodo,
                net.servicestack.androidgrpc.Services.EmptyResponse>(
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
    public void postAssignRoles(net.servicestack.androidgrpc.Services.AssignRoles request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.AssignRolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostAssignRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void optionsAuthenticate(net.servicestack.androidgrpc.Services.Authenticate request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.AuthenticateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOptionsAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAuthenticate(net.servicestack.androidgrpc.Services.Authenticate request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.AuthenticateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postAuthenticate(net.servicestack.androidgrpc.Services.Authenticate request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.AuthenticateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAuthenticate(net.servicestack.androidgrpc.Services.Authenticate request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.AuthenticateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postConvertSessionToToken(net.servicestack.androidgrpc.Services.ConvertSessionToToken request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.ConvertSessionToTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostConvertSessionToTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postCreateTodo(net.servicestack.androidgrpc.Services.CreateTodo request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.CreateTodoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostCreateTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callDeleteTodo(net.servicestack.androidgrpc.Services.DeleteTodo request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCallDeleteTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callDeleteTodos(net.servicestack.androidgrpc.Services.DeleteTodos request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCallDeleteTodosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postGetAccessToken(net.servicestack.androidgrpc.Services.GetAccessToken request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.GetAccessTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostGetAccessTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callGetTodo(net.servicestack.androidgrpc.Services.GetTodo request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.GetTodoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCallGetTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callGetTodos(net.servicestack.androidgrpc.Services.GetTodos request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.GetTodosResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCallGetTodosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHello(net.servicestack.androidgrpc.Services.Hello request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postHello(net.servicestack.androidgrpc.Services.Hello request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putHello(net.servicestack.androidgrpc.Services.Hello request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteHello(net.servicestack.androidgrpc.Services.Hello request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHelloSecure(net.servicestack.androidgrpc.Services.HelloSecure request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHelloSecureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postHelloSecure(net.servicestack.androidgrpc.Services.HelloSecure request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostHelloSecureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putHelloSecure(net.servicestack.androidgrpc.Services.HelloSecure request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutHelloSecureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteHelloSecure(net.servicestack.androidgrpc.Services.HelloSecure request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteHelloSecureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putRegister(net.servicestack.androidgrpc.Services.Register request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.RegisterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postRegister(net.servicestack.androidgrpc.Services.Register request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.RegisterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postResetTodos(net.servicestack.androidgrpc.Services.ResetTodos request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostResetTodosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serverStreamFiles(net.servicestack.androidgrpc.Services.StreamFiles request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.FileContent> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getServerStreamFilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serverStreamServerEvents(net.servicestack.androidgrpc.Services.StreamServerEvents request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.StreamServerEventsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getServerStreamServerEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postUnAssignRoles(net.servicestack.androidgrpc.Services.UnAssignRoles request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.UnAssignRolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostUnAssignRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putUpdateTodo(net.servicestack.androidgrpc.Services.UpdateTodo request,
        io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.EmptyResponse> responseObserver) {
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
    public net.servicestack.androidgrpc.Services.AssignRolesResponse postAssignRoles(net.servicestack.androidgrpc.Services.AssignRoles request) {
      return blockingUnaryCall(
          getChannel(), getPostAssignRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.AuthenticateResponse optionsAuthenticate(net.servicestack.androidgrpc.Services.Authenticate request) {
      return blockingUnaryCall(
          getChannel(), getOptionsAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.AuthenticateResponse getAuthenticate(net.servicestack.androidgrpc.Services.Authenticate request) {
      return blockingUnaryCall(
          getChannel(), getGetAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.AuthenticateResponse postAuthenticate(net.servicestack.androidgrpc.Services.Authenticate request) {
      return blockingUnaryCall(
          getChannel(), getPostAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.AuthenticateResponse deleteAuthenticate(net.servicestack.androidgrpc.Services.Authenticate request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.ConvertSessionToTokenResponse postConvertSessionToToken(net.servicestack.androidgrpc.Services.ConvertSessionToToken request) {
      return blockingUnaryCall(
          getChannel(), getPostConvertSessionToTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.CreateTodoResponse postCreateTodo(net.servicestack.androidgrpc.Services.CreateTodo request) {
      return blockingUnaryCall(
          getChannel(), getPostCreateTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.EmptyResponse callDeleteTodo(net.servicestack.androidgrpc.Services.DeleteTodo request) {
      return blockingUnaryCall(
          getChannel(), getCallDeleteTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.EmptyResponse callDeleteTodos(net.servicestack.androidgrpc.Services.DeleteTodos request) {
      return blockingUnaryCall(
          getChannel(), getCallDeleteTodosMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.GetAccessTokenResponse postGetAccessToken(net.servicestack.androidgrpc.Services.GetAccessToken request) {
      return blockingUnaryCall(
          getChannel(), getPostGetAccessTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.GetTodoResponse callGetTodo(net.servicestack.androidgrpc.Services.GetTodo request) {
      return blockingUnaryCall(
          getChannel(), getCallGetTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.GetTodosResponse callGetTodos(net.servicestack.androidgrpc.Services.GetTodos request) {
      return blockingUnaryCall(
          getChannel(), getCallGetTodosMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.HelloResponse getHello(net.servicestack.androidgrpc.Services.Hello request) {
      return blockingUnaryCall(
          getChannel(), getGetHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.HelloResponse postHello(net.servicestack.androidgrpc.Services.Hello request) {
      return blockingUnaryCall(
          getChannel(), getPostHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.HelloResponse putHello(net.servicestack.androidgrpc.Services.Hello request) {
      return blockingUnaryCall(
          getChannel(), getPutHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.HelloResponse deleteHello(net.servicestack.androidgrpc.Services.Hello request) {
      return blockingUnaryCall(
          getChannel(), getDeleteHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.HelloResponse getHelloSecure(net.servicestack.androidgrpc.Services.HelloSecure request) {
      return blockingUnaryCall(
          getChannel(), getGetHelloSecureMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.HelloResponse postHelloSecure(net.servicestack.androidgrpc.Services.HelloSecure request) {
      return blockingUnaryCall(
          getChannel(), getPostHelloSecureMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.HelloResponse putHelloSecure(net.servicestack.androidgrpc.Services.HelloSecure request) {
      return blockingUnaryCall(
          getChannel(), getPutHelloSecureMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.HelloResponse deleteHelloSecure(net.servicestack.androidgrpc.Services.HelloSecure request) {
      return blockingUnaryCall(
          getChannel(), getDeleteHelloSecureMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.RegisterResponse putRegister(net.servicestack.androidgrpc.Services.Register request) {
      return blockingUnaryCall(
          getChannel(), getPutRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.RegisterResponse postRegister(net.servicestack.androidgrpc.Services.Register request) {
      return blockingUnaryCall(
          getChannel(), getPostRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.EmptyResponse postResetTodos(net.servicestack.androidgrpc.Services.ResetTodos request) {
      return blockingUnaryCall(
          getChannel(), getPostResetTodosMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<net.servicestack.androidgrpc.Services.FileContent> serverStreamFiles(
        net.servicestack.androidgrpc.Services.StreamFiles request) {
      return blockingServerStreamingCall(
          getChannel(), getServerStreamFilesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<net.servicestack.androidgrpc.Services.StreamServerEventsResponse> serverStreamServerEvents(
        net.servicestack.androidgrpc.Services.StreamServerEvents request) {
      return blockingServerStreamingCall(
          getChannel(), getServerStreamServerEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.UnAssignRolesResponse postUnAssignRoles(net.servicestack.androidgrpc.Services.UnAssignRoles request) {
      return blockingUnaryCall(
          getChannel(), getPostUnAssignRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.servicestack.androidgrpc.Services.EmptyResponse putUpdateTodo(net.servicestack.androidgrpc.Services.UpdateTodo request) {
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
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.AssignRolesResponse> postAssignRoles(
        net.servicestack.androidgrpc.Services.AssignRoles request) {
      return futureUnaryCall(
          getChannel().newCall(getPostAssignRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.AuthenticateResponse> optionsAuthenticate(
        net.servicestack.androidgrpc.Services.Authenticate request) {
      return futureUnaryCall(
          getChannel().newCall(getOptionsAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.AuthenticateResponse> getAuthenticate(
        net.servicestack.androidgrpc.Services.Authenticate request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.AuthenticateResponse> postAuthenticate(
        net.servicestack.androidgrpc.Services.Authenticate request) {
      return futureUnaryCall(
          getChannel().newCall(getPostAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.AuthenticateResponse> deleteAuthenticate(
        net.servicestack.androidgrpc.Services.Authenticate request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.ConvertSessionToTokenResponse> postConvertSessionToToken(
        net.servicestack.androidgrpc.Services.ConvertSessionToToken request) {
      return futureUnaryCall(
          getChannel().newCall(getPostConvertSessionToTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.CreateTodoResponse> postCreateTodo(
        net.servicestack.androidgrpc.Services.CreateTodo request) {
      return futureUnaryCall(
          getChannel().newCall(getPostCreateTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.EmptyResponse> callDeleteTodo(
        net.servicestack.androidgrpc.Services.DeleteTodo request) {
      return futureUnaryCall(
          getChannel().newCall(getCallDeleteTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.EmptyResponse> callDeleteTodos(
        net.servicestack.androidgrpc.Services.DeleteTodos request) {
      return futureUnaryCall(
          getChannel().newCall(getCallDeleteTodosMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.GetAccessTokenResponse> postGetAccessToken(
        net.servicestack.androidgrpc.Services.GetAccessToken request) {
      return futureUnaryCall(
          getChannel().newCall(getPostGetAccessTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.GetTodoResponse> callGetTodo(
        net.servicestack.androidgrpc.Services.GetTodo request) {
      return futureUnaryCall(
          getChannel().newCall(getCallGetTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.GetTodosResponse> callGetTodos(
        net.servicestack.androidgrpc.Services.GetTodos request) {
      return futureUnaryCall(
          getChannel().newCall(getCallGetTodosMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.HelloResponse> getHello(
        net.servicestack.androidgrpc.Services.Hello request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.HelloResponse> postHello(
        net.servicestack.androidgrpc.Services.Hello request) {
      return futureUnaryCall(
          getChannel().newCall(getPostHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.HelloResponse> putHello(
        net.servicestack.androidgrpc.Services.Hello request) {
      return futureUnaryCall(
          getChannel().newCall(getPutHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.HelloResponse> deleteHello(
        net.servicestack.androidgrpc.Services.Hello request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.HelloResponse> getHelloSecure(
        net.servicestack.androidgrpc.Services.HelloSecure request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHelloSecureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.HelloResponse> postHelloSecure(
        net.servicestack.androidgrpc.Services.HelloSecure request) {
      return futureUnaryCall(
          getChannel().newCall(getPostHelloSecureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.HelloResponse> putHelloSecure(
        net.servicestack.androidgrpc.Services.HelloSecure request) {
      return futureUnaryCall(
          getChannel().newCall(getPutHelloSecureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.HelloResponse> deleteHelloSecure(
        net.servicestack.androidgrpc.Services.HelloSecure request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteHelloSecureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.RegisterResponse> putRegister(
        net.servicestack.androidgrpc.Services.Register request) {
      return futureUnaryCall(
          getChannel().newCall(getPutRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.RegisterResponse> postRegister(
        net.servicestack.androidgrpc.Services.Register request) {
      return futureUnaryCall(
          getChannel().newCall(getPostRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.EmptyResponse> postResetTodos(
        net.servicestack.androidgrpc.Services.ResetTodos request) {
      return futureUnaryCall(
          getChannel().newCall(getPostResetTodosMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.UnAssignRolesResponse> postUnAssignRoles(
        net.servicestack.androidgrpc.Services.UnAssignRoles request) {
      return futureUnaryCall(
          getChannel().newCall(getPostUnAssignRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.servicestack.androidgrpc.Services.EmptyResponse> putUpdateTodo(
        net.servicestack.androidgrpc.Services.UpdateTodo request) {
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
  private static final int METHODID_CALL_GET_TODO = 10;
  private static final int METHODID_CALL_GET_TODOS = 11;
  private static final int METHODID_GET_HELLO = 12;
  private static final int METHODID_POST_HELLO = 13;
  private static final int METHODID_PUT_HELLO = 14;
  private static final int METHODID_DELETE_HELLO = 15;
  private static final int METHODID_GET_HELLO_SECURE = 16;
  private static final int METHODID_POST_HELLO_SECURE = 17;
  private static final int METHODID_PUT_HELLO_SECURE = 18;
  private static final int METHODID_DELETE_HELLO_SECURE = 19;
  private static final int METHODID_PUT_REGISTER = 20;
  private static final int METHODID_POST_REGISTER = 21;
  private static final int METHODID_POST_RESET_TODOS = 22;
  private static final int METHODID_SERVER_STREAM_FILES = 23;
  private static final int METHODID_SERVER_STREAM_SERVER_EVENTS = 24;
  private static final int METHODID_POST_UN_ASSIGN_ROLES = 25;
  private static final int METHODID_PUT_UPDATE_TODO = 26;

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
          serviceImpl.postAssignRoles((net.servicestack.androidgrpc.Services.AssignRoles) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.AssignRolesResponse>) responseObserver);
          break;
        case METHODID_OPTIONS_AUTHENTICATE:
          serviceImpl.optionsAuthenticate((net.servicestack.androidgrpc.Services.Authenticate) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.AuthenticateResponse>) responseObserver);
          break;
        case METHODID_GET_AUTHENTICATE:
          serviceImpl.getAuthenticate((net.servicestack.androidgrpc.Services.Authenticate) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.AuthenticateResponse>) responseObserver);
          break;
        case METHODID_POST_AUTHENTICATE:
          serviceImpl.postAuthenticate((net.servicestack.androidgrpc.Services.Authenticate) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.AuthenticateResponse>) responseObserver);
          break;
        case METHODID_DELETE_AUTHENTICATE:
          serviceImpl.deleteAuthenticate((net.servicestack.androidgrpc.Services.Authenticate) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.AuthenticateResponse>) responseObserver);
          break;
        case METHODID_POST_CONVERT_SESSION_TO_TOKEN:
          serviceImpl.postConvertSessionToToken((net.servicestack.androidgrpc.Services.ConvertSessionToToken) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.ConvertSessionToTokenResponse>) responseObserver);
          break;
        case METHODID_POST_CREATE_TODO:
          serviceImpl.postCreateTodo((net.servicestack.androidgrpc.Services.CreateTodo) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.CreateTodoResponse>) responseObserver);
          break;
        case METHODID_CALL_DELETE_TODO:
          serviceImpl.callDeleteTodo((net.servicestack.androidgrpc.Services.DeleteTodo) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.EmptyResponse>) responseObserver);
          break;
        case METHODID_CALL_DELETE_TODOS:
          serviceImpl.callDeleteTodos((net.servicestack.androidgrpc.Services.DeleteTodos) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.EmptyResponse>) responseObserver);
          break;
        case METHODID_POST_GET_ACCESS_TOKEN:
          serviceImpl.postGetAccessToken((net.servicestack.androidgrpc.Services.GetAccessToken) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.GetAccessTokenResponse>) responseObserver);
          break;
        case METHODID_CALL_GET_TODO:
          serviceImpl.callGetTodo((net.servicestack.androidgrpc.Services.GetTodo) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.GetTodoResponse>) responseObserver);
          break;
        case METHODID_CALL_GET_TODOS:
          serviceImpl.callGetTodos((net.servicestack.androidgrpc.Services.GetTodos) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.GetTodosResponse>) responseObserver);
          break;
        case METHODID_GET_HELLO:
          serviceImpl.getHello((net.servicestack.androidgrpc.Services.Hello) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse>) responseObserver);
          break;
        case METHODID_POST_HELLO:
          serviceImpl.postHello((net.servicestack.androidgrpc.Services.Hello) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse>) responseObserver);
          break;
        case METHODID_PUT_HELLO:
          serviceImpl.putHello((net.servicestack.androidgrpc.Services.Hello) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse>) responseObserver);
          break;
        case METHODID_DELETE_HELLO:
          serviceImpl.deleteHello((net.servicestack.androidgrpc.Services.Hello) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse>) responseObserver);
          break;
        case METHODID_GET_HELLO_SECURE:
          serviceImpl.getHelloSecure((net.servicestack.androidgrpc.Services.HelloSecure) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse>) responseObserver);
          break;
        case METHODID_POST_HELLO_SECURE:
          serviceImpl.postHelloSecure((net.servicestack.androidgrpc.Services.HelloSecure) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse>) responseObserver);
          break;
        case METHODID_PUT_HELLO_SECURE:
          serviceImpl.putHelloSecure((net.servicestack.androidgrpc.Services.HelloSecure) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse>) responseObserver);
          break;
        case METHODID_DELETE_HELLO_SECURE:
          serviceImpl.deleteHelloSecure((net.servicestack.androidgrpc.Services.HelloSecure) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.HelloResponse>) responseObserver);
          break;
        case METHODID_PUT_REGISTER:
          serviceImpl.putRegister((net.servicestack.androidgrpc.Services.Register) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.RegisterResponse>) responseObserver);
          break;
        case METHODID_POST_REGISTER:
          serviceImpl.postRegister((net.servicestack.androidgrpc.Services.Register) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.RegisterResponse>) responseObserver);
          break;
        case METHODID_POST_RESET_TODOS:
          serviceImpl.postResetTodos((net.servicestack.androidgrpc.Services.ResetTodos) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.EmptyResponse>) responseObserver);
          break;
        case METHODID_SERVER_STREAM_FILES:
          serviceImpl.serverStreamFiles((net.servicestack.androidgrpc.Services.StreamFiles) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.FileContent>) responseObserver);
          break;
        case METHODID_SERVER_STREAM_SERVER_EVENTS:
          serviceImpl.serverStreamServerEvents((net.servicestack.androidgrpc.Services.StreamServerEvents) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.StreamServerEventsResponse>) responseObserver);
          break;
        case METHODID_POST_UN_ASSIGN_ROLES:
          serviceImpl.postUnAssignRoles((net.servicestack.androidgrpc.Services.UnAssignRoles) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.UnAssignRolesResponse>) responseObserver);
          break;
        case METHODID_PUT_UPDATE_TODO:
          serviceImpl.putUpdateTodo((net.servicestack.androidgrpc.Services.UpdateTodo) request,
              (io.grpc.stub.StreamObserver<net.servicestack.androidgrpc.Services.EmptyResponse>) responseObserver);
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

  private static abstract class GrpcServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GrpcServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.servicestack.androidgrpc.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GrpcServices");
    }
  }

  private static final class GrpcServicesFileDescriptorSupplier
      extends GrpcServicesBaseDescriptorSupplier {
    GrpcServicesFileDescriptorSupplier() {}
  }

  private static final class GrpcServicesMethodDescriptorSupplier
      extends GrpcServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GrpcServicesMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
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
              .setSchemaDescriptor(new GrpcServicesFileDescriptorSupplier())
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
              .addMethod(getCallGetTodoMethod())
              .addMethod(getCallGetTodosMethod())
              .addMethod(getGetHelloMethod())
              .addMethod(getPostHelloMethod())
              .addMethod(getPutHelloMethod())
              .addMethod(getDeleteHelloMethod())
              .addMethod(getGetHelloSecureMethod())
              .addMethod(getPostHelloSecureMethod())
              .addMethod(getPutHelloSecureMethod())
              .addMethod(getDeleteHelloSecureMethod())
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
