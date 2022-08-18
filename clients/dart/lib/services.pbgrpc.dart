///
//  Generated code. Do not modify.
//  source: services.proto
//
// @dart = 2.3
// ignore_for_file: camel_case_types,non_constant_identifier_names,library_prefixes,unused_import,unused_shown_name,return_of_invalid_type

import 'dart:async' as $async;

import 'dart:core' as $core;

import 'package:grpc/service_api.dart' as $grpc;
import 'services.pb.dart' as $0;
export 'services.pb.dart';

class GrpcServicesClient extends $grpc.Client {
  static final _$postAssignRoles =
      $grpc.ClientMethod<$0.AssignRoles, $0.AssignRolesResponse>(
          '/GrpcServices/PostAssignRoles',
          ($0.AssignRoles value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $0.AssignRolesResponse.fromBuffer(value));
  static final _$optionsAuthenticate =
      $grpc.ClientMethod<$0.Authenticate, $0.AuthenticateResponse>(
          '/GrpcServices/OptionsAuthenticate',
          ($0.Authenticate value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $0.AuthenticateResponse.fromBuffer(value));
  static final _$getAuthenticate =
      $grpc.ClientMethod<$0.Authenticate, $0.AuthenticateResponse>(
          '/GrpcServices/GetAuthenticate',
          ($0.Authenticate value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $0.AuthenticateResponse.fromBuffer(value));
  static final _$postAuthenticate =
      $grpc.ClientMethod<$0.Authenticate, $0.AuthenticateResponse>(
          '/GrpcServices/PostAuthenticate',
          ($0.Authenticate value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $0.AuthenticateResponse.fromBuffer(value));
  static final _$deleteAuthenticate =
      $grpc.ClientMethod<$0.Authenticate, $0.AuthenticateResponse>(
          '/GrpcServices/DeleteAuthenticate',
          ($0.Authenticate value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $0.AuthenticateResponse.fromBuffer(value));
  static final _$postConvertSessionToToken = $grpc.ClientMethod<
          $0.ConvertSessionToToken, $0.ConvertSessionToTokenResponse>(
      '/GrpcServices/PostConvertSessionToToken',
      ($0.ConvertSessionToToken value) => value.writeToBuffer(),
      ($core.List<$core.int> value) =>
          $0.ConvertSessionToTokenResponse.fromBuffer(value));
  static final _$postCreateTodo =
      $grpc.ClientMethod<$0.CreateTodo, $0.CreateTodoResponse>(
          '/GrpcServices/PostCreateTodo',
          ($0.CreateTodo value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $0.CreateTodoResponse.fromBuffer(value));
  static final _$callDeleteTodo =
      $grpc.ClientMethod<$0.DeleteTodo, $0.EmptyResponse>(
          '/GrpcServices/CallDeleteTodo',
          ($0.DeleteTodo value) => value.writeToBuffer(),
          ($core.List<$core.int> value) => $0.EmptyResponse.fromBuffer(value));
  static final _$callDeleteTodos =
      $grpc.ClientMethod<$0.DeleteTodos, $0.EmptyResponse>(
          '/GrpcServices/CallDeleteTodos',
          ($0.DeleteTodos value) => value.writeToBuffer(),
          ($core.List<$core.int> value) => $0.EmptyResponse.fromBuffer(value));
  static final _$postGetAccessToken =
      $grpc.ClientMethod<$0.GetAccessToken, $0.GetAccessTokenResponse>(
          '/GrpcServices/PostGetAccessToken',
          ($0.GetAccessToken value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $0.GetAccessTokenResponse.fromBuffer(value));
  static final _$callGetTodo =
      $grpc.ClientMethod<$0.GetTodo, $0.GetTodoResponse>(
          '/GrpcServices/CallGetTodo',
          ($0.GetTodo value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $0.GetTodoResponse.fromBuffer(value));
  static final _$callGetTodos =
      $grpc.ClientMethod<$0.GetTodos, $0.GetTodosResponse>(
          '/GrpcServices/CallGetTodos',
          ($0.GetTodos value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $0.GetTodosResponse.fromBuffer(value));
  static final _$getHello = $grpc.ClientMethod<$0.Hello, $0.HelloResponse>(
      '/GrpcServices/GetHello',
      ($0.Hello value) => value.writeToBuffer(),
      ($core.List<$core.int> value) => $0.HelloResponse.fromBuffer(value));
  static final _$postHello = $grpc.ClientMethod<$0.Hello, $0.HelloResponse>(
      '/GrpcServices/PostHello',
      ($0.Hello value) => value.writeToBuffer(),
      ($core.List<$core.int> value) => $0.HelloResponse.fromBuffer(value));
  static final _$putHello = $grpc.ClientMethod<$0.Hello, $0.HelloResponse>(
      '/GrpcServices/PutHello',
      ($0.Hello value) => value.writeToBuffer(),
      ($core.List<$core.int> value) => $0.HelloResponse.fromBuffer(value));
  static final _$deleteHello = $grpc.ClientMethod<$0.Hello, $0.HelloResponse>(
      '/GrpcServices/DeleteHello',
      ($0.Hello value) => value.writeToBuffer(),
      ($core.List<$core.int> value) => $0.HelloResponse.fromBuffer(value));
  static final _$patchHello = $grpc.ClientMethod<$0.Hello, $0.HelloResponse>(
      '/GrpcServices/PatchHello',
      ($0.Hello value) => value.writeToBuffer(),
      ($core.List<$core.int> value) => $0.HelloResponse.fromBuffer(value));
  static final _$getHelloSecure =
      $grpc.ClientMethod<$0.HelloSecure, $0.HelloResponse>(
          '/GrpcServices/GetHelloSecure',
          ($0.HelloSecure value) => value.writeToBuffer(),
          ($core.List<$core.int> value) => $0.HelloResponse.fromBuffer(value));
  static final _$postHelloSecure =
      $grpc.ClientMethod<$0.HelloSecure, $0.HelloResponse>(
          '/GrpcServices/PostHelloSecure',
          ($0.HelloSecure value) => value.writeToBuffer(),
          ($core.List<$core.int> value) => $0.HelloResponse.fromBuffer(value));
  static final _$putHelloSecure =
      $grpc.ClientMethod<$0.HelloSecure, $0.HelloResponse>(
          '/GrpcServices/PutHelloSecure',
          ($0.HelloSecure value) => value.writeToBuffer(),
          ($core.List<$core.int> value) => $0.HelloResponse.fromBuffer(value));
  static final _$deleteHelloSecure =
      $grpc.ClientMethod<$0.HelloSecure, $0.HelloResponse>(
          '/GrpcServices/DeleteHelloSecure',
          ($0.HelloSecure value) => value.writeToBuffer(),
          ($core.List<$core.int> value) => $0.HelloResponse.fromBuffer(value));
  static final _$patchHelloSecure =
      $grpc.ClientMethod<$0.HelloSecure, $0.HelloResponse>(
          '/GrpcServices/PatchHelloSecure',
          ($0.HelloSecure value) => value.writeToBuffer(),
          ($core.List<$core.int> value) => $0.HelloResponse.fromBuffer(value));
  static final _$putRegister =
      $grpc.ClientMethod<$0.Register, $0.RegisterResponse>(
          '/GrpcServices/PutRegister',
          ($0.Register value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $0.RegisterResponse.fromBuffer(value));
  static final _$postRegister =
      $grpc.ClientMethod<$0.Register, $0.RegisterResponse>(
          '/GrpcServices/PostRegister',
          ($0.Register value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $0.RegisterResponse.fromBuffer(value));
  static final _$postResetTodos =
      $grpc.ClientMethod<$0.ResetTodos, $0.EmptyResponse>(
          '/GrpcServices/PostResetTodos',
          ($0.ResetTodos value) => value.writeToBuffer(),
          ($core.List<$core.int> value) => $0.EmptyResponse.fromBuffer(value));
  static final _$serverStreamFiles =
      $grpc.ClientMethod<$0.StreamFiles, $0.FileContent>(
          '/GrpcServices/ServerStreamFiles',
          ($0.StreamFiles value) => value.writeToBuffer(),
          ($core.List<$core.int> value) => $0.FileContent.fromBuffer(value));
  static final _$serverStreamServerEvents =
      $grpc.ClientMethod<$0.StreamServerEvents, $0.StreamServerEventsResponse>(
          '/GrpcServices/ServerStreamServerEvents',
          ($0.StreamServerEvents value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $0.StreamServerEventsResponse.fromBuffer(value));
  static final _$postUnAssignRoles =
      $grpc.ClientMethod<$0.UnAssignRoles, $0.UnAssignRolesResponse>(
          '/GrpcServices/PostUnAssignRoles',
          ($0.UnAssignRoles value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $0.UnAssignRolesResponse.fromBuffer(value));
  static final _$putUpdateTodo =
      $grpc.ClientMethod<$0.UpdateTodo, $0.EmptyResponse>(
          '/GrpcServices/PutUpdateTodo',
          ($0.UpdateTodo value) => value.writeToBuffer(),
          ($core.List<$core.int> value) => $0.EmptyResponse.fromBuffer(value));

  GrpcServicesClient($grpc.ClientChannel channel, {$grpc.CallOptions options})
      : super(channel, options: options);

  $grpc.ResponseFuture<$0.AssignRolesResponse> postAssignRoles(
      $0.AssignRoles request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$postAssignRoles, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.AuthenticateResponse> optionsAuthenticate(
      $0.Authenticate request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$optionsAuthenticate, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.AuthenticateResponse> getAuthenticate(
      $0.Authenticate request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$getAuthenticate, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.AuthenticateResponse> postAuthenticate(
      $0.Authenticate request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$postAuthenticate, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.AuthenticateResponse> deleteAuthenticate(
      $0.Authenticate request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$deleteAuthenticate, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.ConvertSessionToTokenResponse>
      postConvertSessionToToken($0.ConvertSessionToToken request,
          {$grpc.CallOptions options}) {
    final call = $createCall(
        _$postConvertSessionToToken, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.CreateTodoResponse> postCreateTodo(
      $0.CreateTodo request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$postCreateTodo, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.EmptyResponse> callDeleteTodo($0.DeleteTodo request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$callDeleteTodo, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.EmptyResponse> callDeleteTodos($0.DeleteTodos request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$callDeleteTodos, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.GetAccessTokenResponse> postGetAccessToken(
      $0.GetAccessToken request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$postGetAccessToken, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.GetTodoResponse> callGetTodo($0.GetTodo request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$callGetTodo, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.GetTodosResponse> callGetTodos($0.GetTodos request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$callGetTodos, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.HelloResponse> getHello($0.Hello request,
      {$grpc.CallOptions options}) {
    final call = $createCall(_$getHello, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.HelloResponse> postHello($0.Hello request,
      {$grpc.CallOptions options}) {
    final call = $createCall(_$postHello, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.HelloResponse> putHello($0.Hello request,
      {$grpc.CallOptions options}) {
    final call = $createCall(_$putHello, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.HelloResponse> deleteHello($0.Hello request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$deleteHello, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.HelloResponse> patchHello($0.Hello request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$patchHello, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.HelloResponse> getHelloSecure($0.HelloSecure request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$getHelloSecure, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.HelloResponse> postHelloSecure($0.HelloSecure request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$postHelloSecure, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.HelloResponse> putHelloSecure($0.HelloSecure request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$putHelloSecure, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.HelloResponse> deleteHelloSecure(
      $0.HelloSecure request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$deleteHelloSecure, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.HelloResponse> patchHelloSecure(
      $0.HelloSecure request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$patchHelloSecure, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.RegisterResponse> putRegister($0.Register request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$putRegister, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.RegisterResponse> postRegister($0.Register request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$postRegister, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.EmptyResponse> postResetTodos($0.ResetTodos request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$postResetTodos, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseStream<$0.FileContent> serverStreamFiles($0.StreamFiles request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$serverStreamFiles, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseStream(call);
  }

  $grpc.ResponseStream<$0.StreamServerEventsResponse> serverStreamServerEvents(
      $0.StreamServerEvents request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$serverStreamServerEvents, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseStream(call);
  }

  $grpc.ResponseFuture<$0.UnAssignRolesResponse> postUnAssignRoles(
      $0.UnAssignRoles request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$postUnAssignRoles, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }

  $grpc.ResponseFuture<$0.EmptyResponse> putUpdateTodo($0.UpdateTodo request,
      {$grpc.CallOptions options}) {
    final call = $createCall(
        _$putUpdateTodo, $async.Stream.fromIterable([request]),
        options: options);
    return $grpc.ResponseFuture(call);
  }
}

abstract class GrpcServicesServiceBase extends $grpc.Service {
  $core.String get $name => 'GrpcServices';

  GrpcServicesServiceBase() {
    $addMethod($grpc.ServiceMethod<$0.AssignRoles, $0.AssignRolesResponse>(
        'PostAssignRoles',
        postAssignRoles_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.AssignRoles.fromBuffer(value),
        ($0.AssignRolesResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.Authenticate, $0.AuthenticateResponse>(
        'OptionsAuthenticate',
        optionsAuthenticate_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.Authenticate.fromBuffer(value),
        ($0.AuthenticateResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.Authenticate, $0.AuthenticateResponse>(
        'GetAuthenticate',
        getAuthenticate_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.Authenticate.fromBuffer(value),
        ($0.AuthenticateResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.Authenticate, $0.AuthenticateResponse>(
        'PostAuthenticate',
        postAuthenticate_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.Authenticate.fromBuffer(value),
        ($0.AuthenticateResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.Authenticate, $0.AuthenticateResponse>(
        'DeleteAuthenticate',
        deleteAuthenticate_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.Authenticate.fromBuffer(value),
        ($0.AuthenticateResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.ConvertSessionToToken,
            $0.ConvertSessionToTokenResponse>(
        'PostConvertSessionToToken',
        postConvertSessionToToken_Pre,
        false,
        false,
        ($core.List<$core.int> value) =>
            $0.ConvertSessionToToken.fromBuffer(value),
        ($0.ConvertSessionToTokenResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.CreateTodo, $0.CreateTodoResponse>(
        'PostCreateTodo',
        postCreateTodo_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.CreateTodo.fromBuffer(value),
        ($0.CreateTodoResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.DeleteTodo, $0.EmptyResponse>(
        'CallDeleteTodo',
        callDeleteTodo_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.DeleteTodo.fromBuffer(value),
        ($0.EmptyResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.DeleteTodos, $0.EmptyResponse>(
        'CallDeleteTodos',
        callDeleteTodos_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.DeleteTodos.fromBuffer(value),
        ($0.EmptyResponse value) => value.writeToBuffer()));
    $addMethod(
        $grpc.ServiceMethod<$0.GetAccessToken, $0.GetAccessTokenResponse>(
            'PostGetAccessToken',
            postGetAccessToken_Pre,
            false,
            false,
            ($core.List<$core.int> value) =>
                $0.GetAccessToken.fromBuffer(value),
            ($0.GetAccessTokenResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.GetTodo, $0.GetTodoResponse>(
        'CallGetTodo',
        callGetTodo_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.GetTodo.fromBuffer(value),
        ($0.GetTodoResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.GetTodos, $0.GetTodosResponse>(
        'CallGetTodos',
        callGetTodos_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.GetTodos.fromBuffer(value),
        ($0.GetTodosResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.Hello, $0.HelloResponse>(
        'GetHello',
        getHello_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.Hello.fromBuffer(value),
        ($0.HelloResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.Hello, $0.HelloResponse>(
        'PostHello',
        postHello_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.Hello.fromBuffer(value),
        ($0.HelloResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.Hello, $0.HelloResponse>(
        'PutHello',
        putHello_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.Hello.fromBuffer(value),
        ($0.HelloResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.Hello, $0.HelloResponse>(
        'DeleteHello',
        deleteHello_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.Hello.fromBuffer(value),
        ($0.HelloResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.Hello, $0.HelloResponse>(
        'PatchHello',
        patchHello_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.Hello.fromBuffer(value),
        ($0.HelloResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.HelloSecure, $0.HelloResponse>(
        'GetHelloSecure',
        getHelloSecure_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.HelloSecure.fromBuffer(value),
        ($0.HelloResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.HelloSecure, $0.HelloResponse>(
        'PostHelloSecure',
        postHelloSecure_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.HelloSecure.fromBuffer(value),
        ($0.HelloResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.HelloSecure, $0.HelloResponse>(
        'PutHelloSecure',
        putHelloSecure_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.HelloSecure.fromBuffer(value),
        ($0.HelloResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.HelloSecure, $0.HelloResponse>(
        'DeleteHelloSecure',
        deleteHelloSecure_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.HelloSecure.fromBuffer(value),
        ($0.HelloResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.HelloSecure, $0.HelloResponse>(
        'PatchHelloSecure',
        patchHelloSecure_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.HelloSecure.fromBuffer(value),
        ($0.HelloResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.Register, $0.RegisterResponse>(
        'PutRegister',
        putRegister_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.Register.fromBuffer(value),
        ($0.RegisterResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.Register, $0.RegisterResponse>(
        'PostRegister',
        postRegister_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.Register.fromBuffer(value),
        ($0.RegisterResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.ResetTodos, $0.EmptyResponse>(
        'PostResetTodos',
        postResetTodos_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.ResetTodos.fromBuffer(value),
        ($0.EmptyResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.StreamFiles, $0.FileContent>(
        'ServerStreamFiles',
        serverStreamFiles_Pre,
        false,
        true,
        ($core.List<$core.int> value) => $0.StreamFiles.fromBuffer(value),
        ($0.FileContent value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.StreamServerEvents,
            $0.StreamServerEventsResponse>(
        'ServerStreamServerEvents',
        serverStreamServerEvents_Pre,
        false,
        true,
        ($core.List<$core.int> value) =>
            $0.StreamServerEvents.fromBuffer(value),
        ($0.StreamServerEventsResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.UnAssignRoles, $0.UnAssignRolesResponse>(
        'PostUnAssignRoles',
        postUnAssignRoles_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.UnAssignRoles.fromBuffer(value),
        ($0.UnAssignRolesResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.UpdateTodo, $0.EmptyResponse>(
        'PutUpdateTodo',
        putUpdateTodo_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.UpdateTodo.fromBuffer(value),
        ($0.EmptyResponse value) => value.writeToBuffer()));
  }

  $async.Future<$0.AssignRolesResponse> postAssignRoles_Pre(
      $grpc.ServiceCall call, $async.Future<$0.AssignRoles> request) async {
    return postAssignRoles(call, await request);
  }

  $async.Future<$0.AuthenticateResponse> optionsAuthenticate_Pre(
      $grpc.ServiceCall call, $async.Future<$0.Authenticate> request) async {
    return optionsAuthenticate(call, await request);
  }

  $async.Future<$0.AuthenticateResponse> getAuthenticate_Pre(
      $grpc.ServiceCall call, $async.Future<$0.Authenticate> request) async {
    return getAuthenticate(call, await request);
  }

  $async.Future<$0.AuthenticateResponse> postAuthenticate_Pre(
      $grpc.ServiceCall call, $async.Future<$0.Authenticate> request) async {
    return postAuthenticate(call, await request);
  }

  $async.Future<$0.AuthenticateResponse> deleteAuthenticate_Pre(
      $grpc.ServiceCall call, $async.Future<$0.Authenticate> request) async {
    return deleteAuthenticate(call, await request);
  }

  $async.Future<$0.ConvertSessionToTokenResponse> postConvertSessionToToken_Pre(
      $grpc.ServiceCall call,
      $async.Future<$0.ConvertSessionToToken> request) async {
    return postConvertSessionToToken(call, await request);
  }

  $async.Future<$0.CreateTodoResponse> postCreateTodo_Pre(
      $grpc.ServiceCall call, $async.Future<$0.CreateTodo> request) async {
    return postCreateTodo(call, await request);
  }

  $async.Future<$0.EmptyResponse> callDeleteTodo_Pre(
      $grpc.ServiceCall call, $async.Future<$0.DeleteTodo> request) async {
    return callDeleteTodo(call, await request);
  }

  $async.Future<$0.EmptyResponse> callDeleteTodos_Pre(
      $grpc.ServiceCall call, $async.Future<$0.DeleteTodos> request) async {
    return callDeleteTodos(call, await request);
  }

  $async.Future<$0.GetAccessTokenResponse> postGetAccessToken_Pre(
      $grpc.ServiceCall call, $async.Future<$0.GetAccessToken> request) async {
    return postGetAccessToken(call, await request);
  }

  $async.Future<$0.GetTodoResponse> callGetTodo_Pre(
      $grpc.ServiceCall call, $async.Future<$0.GetTodo> request) async {
    return callGetTodo(call, await request);
  }

  $async.Future<$0.GetTodosResponse> callGetTodos_Pre(
      $grpc.ServiceCall call, $async.Future<$0.GetTodos> request) async {
    return callGetTodos(call, await request);
  }

  $async.Future<$0.HelloResponse> getHello_Pre(
      $grpc.ServiceCall call, $async.Future<$0.Hello> request) async {
    return getHello(call, await request);
  }

  $async.Future<$0.HelloResponse> postHello_Pre(
      $grpc.ServiceCall call, $async.Future<$0.Hello> request) async {
    return postHello(call, await request);
  }

  $async.Future<$0.HelloResponse> putHello_Pre(
      $grpc.ServiceCall call, $async.Future<$0.Hello> request) async {
    return putHello(call, await request);
  }

  $async.Future<$0.HelloResponse> deleteHello_Pre(
      $grpc.ServiceCall call, $async.Future<$0.Hello> request) async {
    return deleteHello(call, await request);
  }

  $async.Future<$0.HelloResponse> patchHello_Pre(
      $grpc.ServiceCall call, $async.Future<$0.Hello> request) async {
    return patchHello(call, await request);
  }

  $async.Future<$0.HelloResponse> getHelloSecure_Pre(
      $grpc.ServiceCall call, $async.Future<$0.HelloSecure> request) async {
    return getHelloSecure(call, await request);
  }

  $async.Future<$0.HelloResponse> postHelloSecure_Pre(
      $grpc.ServiceCall call, $async.Future<$0.HelloSecure> request) async {
    return postHelloSecure(call, await request);
  }

  $async.Future<$0.HelloResponse> putHelloSecure_Pre(
      $grpc.ServiceCall call, $async.Future<$0.HelloSecure> request) async {
    return putHelloSecure(call, await request);
  }

  $async.Future<$0.HelloResponse> deleteHelloSecure_Pre(
      $grpc.ServiceCall call, $async.Future<$0.HelloSecure> request) async {
    return deleteHelloSecure(call, await request);
  }

  $async.Future<$0.HelloResponse> patchHelloSecure_Pre(
      $grpc.ServiceCall call, $async.Future<$0.HelloSecure> request) async {
    return patchHelloSecure(call, await request);
  }

  $async.Future<$0.RegisterResponse> putRegister_Pre(
      $grpc.ServiceCall call, $async.Future<$0.Register> request) async {
    return putRegister(call, await request);
  }

  $async.Future<$0.RegisterResponse> postRegister_Pre(
      $grpc.ServiceCall call, $async.Future<$0.Register> request) async {
    return postRegister(call, await request);
  }

  $async.Future<$0.EmptyResponse> postResetTodos_Pre(
      $grpc.ServiceCall call, $async.Future<$0.ResetTodos> request) async {
    return postResetTodos(call, await request);
  }

  $async.Stream<$0.FileContent> serverStreamFiles_Pre(
      $grpc.ServiceCall call, $async.Future<$0.StreamFiles> request) async* {
    yield* serverStreamFiles(call, await request);
  }

  $async.Stream<$0.StreamServerEventsResponse> serverStreamServerEvents_Pre(
      $grpc.ServiceCall call,
      $async.Future<$0.StreamServerEvents> request) async* {
    yield* serverStreamServerEvents(call, await request);
  }

  $async.Future<$0.UnAssignRolesResponse> postUnAssignRoles_Pre(
      $grpc.ServiceCall call, $async.Future<$0.UnAssignRoles> request) async {
    return postUnAssignRoles(call, await request);
  }

  $async.Future<$0.EmptyResponse> putUpdateTodo_Pre(
      $grpc.ServiceCall call, $async.Future<$0.UpdateTodo> request) async {
    return putUpdateTodo(call, await request);
  }

  $async.Future<$0.AssignRolesResponse> postAssignRoles(
      $grpc.ServiceCall call, $0.AssignRoles request);
  $async.Future<$0.AuthenticateResponse> optionsAuthenticate(
      $grpc.ServiceCall call, $0.Authenticate request);
  $async.Future<$0.AuthenticateResponse> getAuthenticate(
      $grpc.ServiceCall call, $0.Authenticate request);
  $async.Future<$0.AuthenticateResponse> postAuthenticate(
      $grpc.ServiceCall call, $0.Authenticate request);
  $async.Future<$0.AuthenticateResponse> deleteAuthenticate(
      $grpc.ServiceCall call, $0.Authenticate request);
  $async.Future<$0.ConvertSessionToTokenResponse> postConvertSessionToToken(
      $grpc.ServiceCall call, $0.ConvertSessionToToken request);
  $async.Future<$0.CreateTodoResponse> postCreateTodo(
      $grpc.ServiceCall call, $0.CreateTodo request);
  $async.Future<$0.EmptyResponse> callDeleteTodo(
      $grpc.ServiceCall call, $0.DeleteTodo request);
  $async.Future<$0.EmptyResponse> callDeleteTodos(
      $grpc.ServiceCall call, $0.DeleteTodos request);
  $async.Future<$0.GetAccessTokenResponse> postGetAccessToken(
      $grpc.ServiceCall call, $0.GetAccessToken request);
  $async.Future<$0.GetTodoResponse> callGetTodo(
      $grpc.ServiceCall call, $0.GetTodo request);
  $async.Future<$0.GetTodosResponse> callGetTodos(
      $grpc.ServiceCall call, $0.GetTodos request);
  $async.Future<$0.HelloResponse> getHello(
      $grpc.ServiceCall call, $0.Hello request);
  $async.Future<$0.HelloResponse> postHello(
      $grpc.ServiceCall call, $0.Hello request);
  $async.Future<$0.HelloResponse> putHello(
      $grpc.ServiceCall call, $0.Hello request);
  $async.Future<$0.HelloResponse> deleteHello(
      $grpc.ServiceCall call, $0.Hello request);
  $async.Future<$0.HelloResponse> patchHello(
      $grpc.ServiceCall call, $0.Hello request);
  $async.Future<$0.HelloResponse> getHelloSecure(
      $grpc.ServiceCall call, $0.HelloSecure request);
  $async.Future<$0.HelloResponse> postHelloSecure(
      $grpc.ServiceCall call, $0.HelloSecure request);
  $async.Future<$0.HelloResponse> putHelloSecure(
      $grpc.ServiceCall call, $0.HelloSecure request);
  $async.Future<$0.HelloResponse> deleteHelloSecure(
      $grpc.ServiceCall call, $0.HelloSecure request);
  $async.Future<$0.HelloResponse> patchHelloSecure(
      $grpc.ServiceCall call, $0.HelloSecure request);
  $async.Future<$0.RegisterResponse> putRegister(
      $grpc.ServiceCall call, $0.Register request);
  $async.Future<$0.RegisterResponse> postRegister(
      $grpc.ServiceCall call, $0.Register request);
  $async.Future<$0.EmptyResponse> postResetTodos(
      $grpc.ServiceCall call, $0.ResetTodos request);
  $async.Stream<$0.FileContent> serverStreamFiles(
      $grpc.ServiceCall call, $0.StreamFiles request);
  $async.Stream<$0.StreamServerEventsResponse> serverStreamServerEvents(
      $grpc.ServiceCall call, $0.StreamServerEvents request);
  $async.Future<$0.UnAssignRolesResponse> postUnAssignRoles(
      $grpc.ServiceCall call, $0.UnAssignRoles request);
  $async.Future<$0.EmptyResponse> putUpdateTodo(
      $grpc.ServiceCall call, $0.UpdateTodo request);
}
