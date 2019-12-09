///
//  Generated code. Do not modify.
//  source: services.proto
//
// @dart = 2.3
// ignore_for_file: camel_case_types,non_constant_identifier_names,library_prefixes,unused_import,unused_shown_name,return_of_invalid_type

import 'dart:core' as $core;

import 'package:fixnum/fixnum.dart' as $fixnum;
import 'package:protobuf/protobuf.dart' as $pb;

class AssignRoles extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('AssignRoles', createEmptyInstance: create)
    ..aOS(1, 'UserName', protoName: 'UserName')
    ..pPS(2, 'Permissions', protoName: 'Permissions')
    ..pPS(3, 'Roles', protoName: 'Roles')
    ..m<$core.String, $core.String>(4, 'Meta', protoName: 'Meta', entryClassName: 'AssignRoles.MetaEntry', keyFieldType: $pb.PbFieldType.OS, valueFieldType: $pb.PbFieldType.OS)
    ..hasRequiredFields = false
  ;

  AssignRoles._() : super();
  factory AssignRoles() => create();
  factory AssignRoles.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory AssignRoles.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  AssignRoles clone() => AssignRoles()..mergeFromMessage(this);
  AssignRoles copyWith(void Function(AssignRoles) updates) => super.copyWith((message) => updates(message as AssignRoles));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static AssignRoles create() => AssignRoles._();
  AssignRoles createEmptyInstance() => create();
  static $pb.PbList<AssignRoles> createRepeated() => $pb.PbList<AssignRoles>();
  @$core.pragma('dart2js:noInline')
  static AssignRoles getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<AssignRoles>(create);
  static AssignRoles _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get userName => $_getSZ(0);
  @$pb.TagNumber(1)
  set userName($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasUserName() => $_has(0);
  @$pb.TagNumber(1)
  void clearUserName() => clearField(1);

  @$pb.TagNumber(2)
  $core.List<$core.String> get permissions => $_getList(1);

  @$pb.TagNumber(3)
  $core.List<$core.String> get roles => $_getList(2);

  @$pb.TagNumber(4)
  $core.Map<$core.String, $core.String> get meta => $_getMap(3);
}

class AssignRolesResponse extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('AssignRolesResponse', createEmptyInstance: create)
    ..pPS(1, 'AllRoles', protoName: 'AllRoles')
    ..pPS(2, 'AllPermissions', protoName: 'AllPermissions')
    ..m<$core.String, $core.String>(3, 'Meta', protoName: 'Meta', entryClassName: 'AssignRolesResponse.MetaEntry', keyFieldType: $pb.PbFieldType.OS, valueFieldType: $pb.PbFieldType.OS)
    ..aOM<ResponseStatus>(4, 'ResponseStatus', protoName: 'ResponseStatus', subBuilder: ResponseStatus.create)
    ..hasRequiredFields = false
  ;

  AssignRolesResponse._() : super();
  factory AssignRolesResponse() => create();
  factory AssignRolesResponse.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory AssignRolesResponse.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  AssignRolesResponse clone() => AssignRolesResponse()..mergeFromMessage(this);
  AssignRolesResponse copyWith(void Function(AssignRolesResponse) updates) => super.copyWith((message) => updates(message as AssignRolesResponse));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static AssignRolesResponse create() => AssignRolesResponse._();
  AssignRolesResponse createEmptyInstance() => create();
  static $pb.PbList<AssignRolesResponse> createRepeated() => $pb.PbList<AssignRolesResponse>();
  @$core.pragma('dart2js:noInline')
  static AssignRolesResponse getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<AssignRolesResponse>(create);
  static AssignRolesResponse _defaultInstance;

  @$pb.TagNumber(1)
  $core.List<$core.String> get allRoles => $_getList(0);

  @$pb.TagNumber(2)
  $core.List<$core.String> get allPermissions => $_getList(1);

  @$pb.TagNumber(3)
  $core.Map<$core.String, $core.String> get meta => $_getMap(2);

  @$pb.TagNumber(4)
  ResponseStatus get responseStatus => $_getN(3);
  @$pb.TagNumber(4)
  set responseStatus(ResponseStatus v) { setField(4, v); }
  @$pb.TagNumber(4)
  $core.bool hasResponseStatus() => $_has(3);
  @$pb.TagNumber(4)
  void clearResponseStatus() => clearField(4);
  @$pb.TagNumber(4)
  ResponseStatus ensureResponseStatus() => $_ensure(3);
}

class Authenticate extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('Authenticate', createEmptyInstance: create)
    ..aOS(1, 'provider')
    ..aOS(2, 'State', protoName: 'State')
    ..aOS(3, 'oauthToken')
    ..aOS(4, 'oauthVerifier')
    ..aOS(5, 'UserName', protoName: 'UserName')
    ..aOS(6, 'Password', protoName: 'Password')
    ..aOB(7, 'RememberMe', protoName: 'RememberMe')
    ..aOS(8, 'Continue', protoName: 'Continue')
    ..aOS(9, 'ErrorView', protoName: 'ErrorView')
    ..aOS(10, 'nonce')
    ..aOS(11, 'uri')
    ..aOS(12, 'response')
    ..aOS(13, 'qop')
    ..aOS(14, 'nc')
    ..aOS(15, 'cnonce')
    ..aOB(16, 'UseTokenCookie', protoName: 'UseTokenCookie')
    ..aOS(17, 'AccessToken', protoName: 'AccessToken')
    ..aOS(18, 'AccessTokenSecret', protoName: 'AccessTokenSecret')
    ..aOS(19, 'scope')
    ..m<$core.String, $core.String>(20, 'Meta', protoName: 'Meta', entryClassName: 'Authenticate.MetaEntry', keyFieldType: $pb.PbFieldType.OS, valueFieldType: $pb.PbFieldType.OS)
    ..hasRequiredFields = false
  ;

  Authenticate._() : super();
  factory Authenticate() => create();
  factory Authenticate.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory Authenticate.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  Authenticate clone() => Authenticate()..mergeFromMessage(this);
  Authenticate copyWith(void Function(Authenticate) updates) => super.copyWith((message) => updates(message as Authenticate));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static Authenticate create() => Authenticate._();
  Authenticate createEmptyInstance() => create();
  static $pb.PbList<Authenticate> createRepeated() => $pb.PbList<Authenticate>();
  @$core.pragma('dart2js:noInline')
  static Authenticate getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<Authenticate>(create);
  static Authenticate _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get provider => $_getSZ(0);
  @$pb.TagNumber(1)
  set provider($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasProvider() => $_has(0);
  @$pb.TagNumber(1)
  void clearProvider() => clearField(1);

  @$pb.TagNumber(2)
  $core.String get state => $_getSZ(1);
  @$pb.TagNumber(2)
  set state($core.String v) { $_setString(1, v); }
  @$pb.TagNumber(2)
  $core.bool hasState() => $_has(1);
  @$pb.TagNumber(2)
  void clearState() => clearField(2);

  @$pb.TagNumber(3)
  $core.String get oauthToken => $_getSZ(2);
  @$pb.TagNumber(3)
  set oauthToken($core.String v) { $_setString(2, v); }
  @$pb.TagNumber(3)
  $core.bool hasOauthToken() => $_has(2);
  @$pb.TagNumber(3)
  void clearOauthToken() => clearField(3);

  @$pb.TagNumber(4)
  $core.String get oauthVerifier => $_getSZ(3);
  @$pb.TagNumber(4)
  set oauthVerifier($core.String v) { $_setString(3, v); }
  @$pb.TagNumber(4)
  $core.bool hasOauthVerifier() => $_has(3);
  @$pb.TagNumber(4)
  void clearOauthVerifier() => clearField(4);

  @$pb.TagNumber(5)
  $core.String get userName => $_getSZ(4);
  @$pb.TagNumber(5)
  set userName($core.String v) { $_setString(4, v); }
  @$pb.TagNumber(5)
  $core.bool hasUserName() => $_has(4);
  @$pb.TagNumber(5)
  void clearUserName() => clearField(5);

  @$pb.TagNumber(6)
  $core.String get password => $_getSZ(5);
  @$pb.TagNumber(6)
  set password($core.String v) { $_setString(5, v); }
  @$pb.TagNumber(6)
  $core.bool hasPassword() => $_has(5);
  @$pb.TagNumber(6)
  void clearPassword() => clearField(6);

  @$pb.TagNumber(7)
  $core.bool get rememberMe => $_getBF(6);
  @$pb.TagNumber(7)
  set rememberMe($core.bool v) { $_setBool(6, v); }
  @$pb.TagNumber(7)
  $core.bool hasRememberMe() => $_has(6);
  @$pb.TagNumber(7)
  void clearRememberMe() => clearField(7);

  @$pb.TagNumber(8)
  $core.String get continue_8 => $_getSZ(7);
  @$pb.TagNumber(8)
  set continue_8($core.String v) { $_setString(7, v); }
  @$pb.TagNumber(8)
  $core.bool hasContinue_8() => $_has(7);
  @$pb.TagNumber(8)
  void clearContinue_8() => clearField(8);

  @$pb.TagNumber(9)
  $core.String get errorView => $_getSZ(8);
  @$pb.TagNumber(9)
  set errorView($core.String v) { $_setString(8, v); }
  @$pb.TagNumber(9)
  $core.bool hasErrorView() => $_has(8);
  @$pb.TagNumber(9)
  void clearErrorView() => clearField(9);

  @$pb.TagNumber(10)
  $core.String get nonce => $_getSZ(9);
  @$pb.TagNumber(10)
  set nonce($core.String v) { $_setString(9, v); }
  @$pb.TagNumber(10)
  $core.bool hasNonce() => $_has(9);
  @$pb.TagNumber(10)
  void clearNonce() => clearField(10);

  @$pb.TagNumber(11)
  $core.String get uri => $_getSZ(10);
  @$pb.TagNumber(11)
  set uri($core.String v) { $_setString(10, v); }
  @$pb.TagNumber(11)
  $core.bool hasUri() => $_has(10);
  @$pb.TagNumber(11)
  void clearUri() => clearField(11);

  @$pb.TagNumber(12)
  $core.String get response => $_getSZ(11);
  @$pb.TagNumber(12)
  set response($core.String v) { $_setString(11, v); }
  @$pb.TagNumber(12)
  $core.bool hasResponse() => $_has(11);
  @$pb.TagNumber(12)
  void clearResponse() => clearField(12);

  @$pb.TagNumber(13)
  $core.String get qop => $_getSZ(12);
  @$pb.TagNumber(13)
  set qop($core.String v) { $_setString(12, v); }
  @$pb.TagNumber(13)
  $core.bool hasQop() => $_has(12);
  @$pb.TagNumber(13)
  void clearQop() => clearField(13);

  @$pb.TagNumber(14)
  $core.String get nc => $_getSZ(13);
  @$pb.TagNumber(14)
  set nc($core.String v) { $_setString(13, v); }
  @$pb.TagNumber(14)
  $core.bool hasNc() => $_has(13);
  @$pb.TagNumber(14)
  void clearNc() => clearField(14);

  @$pb.TagNumber(15)
  $core.String get cnonce => $_getSZ(14);
  @$pb.TagNumber(15)
  set cnonce($core.String v) { $_setString(14, v); }
  @$pb.TagNumber(15)
  $core.bool hasCnonce() => $_has(14);
  @$pb.TagNumber(15)
  void clearCnonce() => clearField(15);

  @$pb.TagNumber(16)
  $core.bool get useTokenCookie => $_getBF(15);
  @$pb.TagNumber(16)
  set useTokenCookie($core.bool v) { $_setBool(15, v); }
  @$pb.TagNumber(16)
  $core.bool hasUseTokenCookie() => $_has(15);
  @$pb.TagNumber(16)
  void clearUseTokenCookie() => clearField(16);

  @$pb.TagNumber(17)
  $core.String get accessToken => $_getSZ(16);
  @$pb.TagNumber(17)
  set accessToken($core.String v) { $_setString(16, v); }
  @$pb.TagNumber(17)
  $core.bool hasAccessToken() => $_has(16);
  @$pb.TagNumber(17)
  void clearAccessToken() => clearField(17);

  @$pb.TagNumber(18)
  $core.String get accessTokenSecret => $_getSZ(17);
  @$pb.TagNumber(18)
  set accessTokenSecret($core.String v) { $_setString(17, v); }
  @$pb.TagNumber(18)
  $core.bool hasAccessTokenSecret() => $_has(17);
  @$pb.TagNumber(18)
  void clearAccessTokenSecret() => clearField(18);

  @$pb.TagNumber(19)
  $core.String get scope => $_getSZ(18);
  @$pb.TagNumber(19)
  set scope($core.String v) { $_setString(18, v); }
  @$pb.TagNumber(19)
  $core.bool hasScope() => $_has(18);
  @$pb.TagNumber(19)
  void clearScope() => clearField(19);

  @$pb.TagNumber(20)
  $core.Map<$core.String, $core.String> get meta => $_getMap(19);
}

class AuthenticateResponse extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('AuthenticateResponse', createEmptyInstance: create)
    ..aOS(1, 'UserId', protoName: 'UserId')
    ..aOS(2, 'SessionId', protoName: 'SessionId')
    ..aOS(3, 'UserName', protoName: 'UserName')
    ..aOS(4, 'DisplayName', protoName: 'DisplayName')
    ..aOS(5, 'ReferrerUrl', protoName: 'ReferrerUrl')
    ..aOS(6, 'BearerToken', protoName: 'BearerToken')
    ..aOS(7, 'RefreshToken', protoName: 'RefreshToken')
    ..aOS(8, 'ProfileUrl', protoName: 'ProfileUrl')
    ..pPS(9, 'Roles', protoName: 'Roles')
    ..pPS(10, 'Permissions', protoName: 'Permissions')
    ..aOM<ResponseStatus>(11, 'ResponseStatus', protoName: 'ResponseStatus', subBuilder: ResponseStatus.create)
    ..m<$core.String, $core.String>(12, 'Meta', protoName: 'Meta', entryClassName: 'AuthenticateResponse.MetaEntry', keyFieldType: $pb.PbFieldType.OS, valueFieldType: $pb.PbFieldType.OS)
    ..hasRequiredFields = false
  ;

  AuthenticateResponse._() : super();
  factory AuthenticateResponse() => create();
  factory AuthenticateResponse.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory AuthenticateResponse.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  AuthenticateResponse clone() => AuthenticateResponse()..mergeFromMessage(this);
  AuthenticateResponse copyWith(void Function(AuthenticateResponse) updates) => super.copyWith((message) => updates(message as AuthenticateResponse));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static AuthenticateResponse create() => AuthenticateResponse._();
  AuthenticateResponse createEmptyInstance() => create();
  static $pb.PbList<AuthenticateResponse> createRepeated() => $pb.PbList<AuthenticateResponse>();
  @$core.pragma('dart2js:noInline')
  static AuthenticateResponse getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<AuthenticateResponse>(create);
  static AuthenticateResponse _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get userId => $_getSZ(0);
  @$pb.TagNumber(1)
  set userId($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasUserId() => $_has(0);
  @$pb.TagNumber(1)
  void clearUserId() => clearField(1);

  @$pb.TagNumber(2)
  $core.String get sessionId => $_getSZ(1);
  @$pb.TagNumber(2)
  set sessionId($core.String v) { $_setString(1, v); }
  @$pb.TagNumber(2)
  $core.bool hasSessionId() => $_has(1);
  @$pb.TagNumber(2)
  void clearSessionId() => clearField(2);

  @$pb.TagNumber(3)
  $core.String get userName => $_getSZ(2);
  @$pb.TagNumber(3)
  set userName($core.String v) { $_setString(2, v); }
  @$pb.TagNumber(3)
  $core.bool hasUserName() => $_has(2);
  @$pb.TagNumber(3)
  void clearUserName() => clearField(3);

  @$pb.TagNumber(4)
  $core.String get displayName => $_getSZ(3);
  @$pb.TagNumber(4)
  set displayName($core.String v) { $_setString(3, v); }
  @$pb.TagNumber(4)
  $core.bool hasDisplayName() => $_has(3);
  @$pb.TagNumber(4)
  void clearDisplayName() => clearField(4);

  @$pb.TagNumber(5)
  $core.String get referrerUrl => $_getSZ(4);
  @$pb.TagNumber(5)
  set referrerUrl($core.String v) { $_setString(4, v); }
  @$pb.TagNumber(5)
  $core.bool hasReferrerUrl() => $_has(4);
  @$pb.TagNumber(5)
  void clearReferrerUrl() => clearField(5);

  @$pb.TagNumber(6)
  $core.String get bearerToken => $_getSZ(5);
  @$pb.TagNumber(6)
  set bearerToken($core.String v) { $_setString(5, v); }
  @$pb.TagNumber(6)
  $core.bool hasBearerToken() => $_has(5);
  @$pb.TagNumber(6)
  void clearBearerToken() => clearField(6);

  @$pb.TagNumber(7)
  $core.String get refreshToken => $_getSZ(6);
  @$pb.TagNumber(7)
  set refreshToken($core.String v) { $_setString(6, v); }
  @$pb.TagNumber(7)
  $core.bool hasRefreshToken() => $_has(6);
  @$pb.TagNumber(7)
  void clearRefreshToken() => clearField(7);

  @$pb.TagNumber(8)
  $core.String get profileUrl => $_getSZ(7);
  @$pb.TagNumber(8)
  set profileUrl($core.String v) { $_setString(7, v); }
  @$pb.TagNumber(8)
  $core.bool hasProfileUrl() => $_has(7);
  @$pb.TagNumber(8)
  void clearProfileUrl() => clearField(8);

  @$pb.TagNumber(9)
  $core.List<$core.String> get roles => $_getList(8);

  @$pb.TagNumber(10)
  $core.List<$core.String> get permissions => $_getList(9);

  @$pb.TagNumber(11)
  ResponseStatus get responseStatus => $_getN(10);
  @$pb.TagNumber(11)
  set responseStatus(ResponseStatus v) { setField(11, v); }
  @$pb.TagNumber(11)
  $core.bool hasResponseStatus() => $_has(10);
  @$pb.TagNumber(11)
  void clearResponseStatus() => clearField(11);
  @$pb.TagNumber(11)
  ResponseStatus ensureResponseStatus() => $_ensure(10);

  @$pb.TagNumber(12)
  $core.Map<$core.String, $core.String> get meta => $_getMap(11);
}

class ConvertSessionToToken extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('ConvertSessionToToken', createEmptyInstance: create)
    ..aOB(1, 'PreserveSession', protoName: 'PreserveSession')
    ..m<$core.String, $core.String>(2, 'Meta', protoName: 'Meta', entryClassName: 'ConvertSessionToToken.MetaEntry', keyFieldType: $pb.PbFieldType.OS, valueFieldType: $pb.PbFieldType.OS)
    ..hasRequiredFields = false
  ;

  ConvertSessionToToken._() : super();
  factory ConvertSessionToToken() => create();
  factory ConvertSessionToToken.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory ConvertSessionToToken.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  ConvertSessionToToken clone() => ConvertSessionToToken()..mergeFromMessage(this);
  ConvertSessionToToken copyWith(void Function(ConvertSessionToToken) updates) => super.copyWith((message) => updates(message as ConvertSessionToToken));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static ConvertSessionToToken create() => ConvertSessionToToken._();
  ConvertSessionToToken createEmptyInstance() => create();
  static $pb.PbList<ConvertSessionToToken> createRepeated() => $pb.PbList<ConvertSessionToToken>();
  @$core.pragma('dart2js:noInline')
  static ConvertSessionToToken getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<ConvertSessionToToken>(create);
  static ConvertSessionToToken _defaultInstance;

  @$pb.TagNumber(1)
  $core.bool get preserveSession => $_getBF(0);
  @$pb.TagNumber(1)
  set preserveSession($core.bool v) { $_setBool(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasPreserveSession() => $_has(0);
  @$pb.TagNumber(1)
  void clearPreserveSession() => clearField(1);

  @$pb.TagNumber(2)
  $core.Map<$core.String, $core.String> get meta => $_getMap(1);
}

class ConvertSessionToTokenResponse extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('ConvertSessionToTokenResponse', createEmptyInstance: create)
    ..m<$core.String, $core.String>(1, 'Meta', protoName: 'Meta', entryClassName: 'ConvertSessionToTokenResponse.MetaEntry', keyFieldType: $pb.PbFieldType.OS, valueFieldType: $pb.PbFieldType.OS)
    ..aOS(2, 'AccessToken', protoName: 'AccessToken')
    ..aOS(3, 'RefreshToken', protoName: 'RefreshToken')
    ..aOM<ResponseStatus>(4, 'ResponseStatus', protoName: 'ResponseStatus', subBuilder: ResponseStatus.create)
    ..hasRequiredFields = false
  ;

  ConvertSessionToTokenResponse._() : super();
  factory ConvertSessionToTokenResponse() => create();
  factory ConvertSessionToTokenResponse.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory ConvertSessionToTokenResponse.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  ConvertSessionToTokenResponse clone() => ConvertSessionToTokenResponse()..mergeFromMessage(this);
  ConvertSessionToTokenResponse copyWith(void Function(ConvertSessionToTokenResponse) updates) => super.copyWith((message) => updates(message as ConvertSessionToTokenResponse));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static ConvertSessionToTokenResponse create() => ConvertSessionToTokenResponse._();
  ConvertSessionToTokenResponse createEmptyInstance() => create();
  static $pb.PbList<ConvertSessionToTokenResponse> createRepeated() => $pb.PbList<ConvertSessionToTokenResponse>();
  @$core.pragma('dart2js:noInline')
  static ConvertSessionToTokenResponse getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<ConvertSessionToTokenResponse>(create);
  static ConvertSessionToTokenResponse _defaultInstance;

  @$pb.TagNumber(1)
  $core.Map<$core.String, $core.String> get meta => $_getMap(0);

  @$pb.TagNumber(2)
  $core.String get accessToken => $_getSZ(1);
  @$pb.TagNumber(2)
  set accessToken($core.String v) { $_setString(1, v); }
  @$pb.TagNumber(2)
  $core.bool hasAccessToken() => $_has(1);
  @$pb.TagNumber(2)
  void clearAccessToken() => clearField(2);

  @$pb.TagNumber(3)
  $core.String get refreshToken => $_getSZ(2);
  @$pb.TagNumber(3)
  set refreshToken($core.String v) { $_setString(2, v); }
  @$pb.TagNumber(3)
  $core.bool hasRefreshToken() => $_has(2);
  @$pb.TagNumber(3)
  void clearRefreshToken() => clearField(3);

  @$pb.TagNumber(4)
  ResponseStatus get responseStatus => $_getN(3);
  @$pb.TagNumber(4)
  set responseStatus(ResponseStatus v) { setField(4, v); }
  @$pb.TagNumber(4)
  $core.bool hasResponseStatus() => $_has(3);
  @$pb.TagNumber(4)
  void clearResponseStatus() => clearField(4);
  @$pb.TagNumber(4)
  ResponseStatus ensureResponseStatus() => $_ensure(3);
}

class CreateTodo extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('CreateTodo', createEmptyInstance: create)
    ..aOS(1, 'Title', protoName: 'Title')
    ..a<$core.int>(2, 'Order', $pb.PbFieldType.O3, protoName: 'Order')
    ..hasRequiredFields = false
  ;

  CreateTodo._() : super();
  factory CreateTodo() => create();
  factory CreateTodo.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory CreateTodo.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  CreateTodo clone() => CreateTodo()..mergeFromMessage(this);
  CreateTodo copyWith(void Function(CreateTodo) updates) => super.copyWith((message) => updates(message as CreateTodo));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static CreateTodo create() => CreateTodo._();
  CreateTodo createEmptyInstance() => create();
  static $pb.PbList<CreateTodo> createRepeated() => $pb.PbList<CreateTodo>();
  @$core.pragma('dart2js:noInline')
  static CreateTodo getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<CreateTodo>(create);
  static CreateTodo _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get title => $_getSZ(0);
  @$pb.TagNumber(1)
  set title($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasTitle() => $_has(0);
  @$pb.TagNumber(1)
  void clearTitle() => clearField(1);

  @$pb.TagNumber(2)
  $core.int get order => $_getIZ(1);
  @$pb.TagNumber(2)
  set order($core.int v) { $_setSignedInt32(1, v); }
  @$pb.TagNumber(2)
  $core.bool hasOrder() => $_has(1);
  @$pb.TagNumber(2)
  void clearOrder() => clearField(2);
}

class CreateTodoResponse extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('CreateTodoResponse', createEmptyInstance: create)
    ..aOM<Todo>(1, 'Result', protoName: 'Result', subBuilder: Todo.create)
    ..aOM<ResponseStatus>(2, 'ResponseStatus', protoName: 'ResponseStatus', subBuilder: ResponseStatus.create)
    ..hasRequiredFields = false
  ;

  CreateTodoResponse._() : super();
  factory CreateTodoResponse() => create();
  factory CreateTodoResponse.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory CreateTodoResponse.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  CreateTodoResponse clone() => CreateTodoResponse()..mergeFromMessage(this);
  CreateTodoResponse copyWith(void Function(CreateTodoResponse) updates) => super.copyWith((message) => updates(message as CreateTodoResponse));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static CreateTodoResponse create() => CreateTodoResponse._();
  CreateTodoResponse createEmptyInstance() => create();
  static $pb.PbList<CreateTodoResponse> createRepeated() => $pb.PbList<CreateTodoResponse>();
  @$core.pragma('dart2js:noInline')
  static CreateTodoResponse getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<CreateTodoResponse>(create);
  static CreateTodoResponse _defaultInstance;

  @$pb.TagNumber(1)
  Todo get result => $_getN(0);
  @$pb.TagNumber(1)
  set result(Todo v) { setField(1, v); }
  @$pb.TagNumber(1)
  $core.bool hasResult() => $_has(0);
  @$pb.TagNumber(1)
  void clearResult() => clearField(1);
  @$pb.TagNumber(1)
  Todo ensureResult() => $_ensure(0);

  @$pb.TagNumber(2)
  ResponseStatus get responseStatus => $_getN(1);
  @$pb.TagNumber(2)
  set responseStatus(ResponseStatus v) { setField(2, v); }
  @$pb.TagNumber(2)
  $core.bool hasResponseStatus() => $_has(1);
  @$pb.TagNumber(2)
  void clearResponseStatus() => clearField(2);
  @$pb.TagNumber(2)
  ResponseStatus ensureResponseStatus() => $_ensure(1);
}

class DeleteTodo extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('DeleteTodo', createEmptyInstance: create)
    ..aInt64(1, 'Id', protoName: 'Id')
    ..hasRequiredFields = false
  ;

  DeleteTodo._() : super();
  factory DeleteTodo() => create();
  factory DeleteTodo.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory DeleteTodo.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  DeleteTodo clone() => DeleteTodo()..mergeFromMessage(this);
  DeleteTodo copyWith(void Function(DeleteTodo) updates) => super.copyWith((message) => updates(message as DeleteTodo));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static DeleteTodo create() => DeleteTodo._();
  DeleteTodo createEmptyInstance() => create();
  static $pb.PbList<DeleteTodo> createRepeated() => $pb.PbList<DeleteTodo>();
  @$core.pragma('dart2js:noInline')
  static DeleteTodo getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<DeleteTodo>(create);
  static DeleteTodo _defaultInstance;

  @$pb.TagNumber(1)
  $fixnum.Int64 get id => $_getI64(0);
  @$pb.TagNumber(1)
  set id($fixnum.Int64 v) { $_setInt64(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasId() => $_has(0);
  @$pb.TagNumber(1)
  void clearId() => clearField(1);
}

class DeleteTodos extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('DeleteTodos', createEmptyInstance: create)
    ..p<$fixnum.Int64>(1, 'Ids', $pb.PbFieldType.P6, protoName: 'Ids')
    ..hasRequiredFields = false
  ;

  DeleteTodos._() : super();
  factory DeleteTodos() => create();
  factory DeleteTodos.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory DeleteTodos.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  DeleteTodos clone() => DeleteTodos()..mergeFromMessage(this);
  DeleteTodos copyWith(void Function(DeleteTodos) updates) => super.copyWith((message) => updates(message as DeleteTodos));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static DeleteTodos create() => DeleteTodos._();
  DeleteTodos createEmptyInstance() => create();
  static $pb.PbList<DeleteTodos> createRepeated() => $pb.PbList<DeleteTodos>();
  @$core.pragma('dart2js:noInline')
  static DeleteTodos getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<DeleteTodos>(create);
  static DeleteTodos _defaultInstance;

  @$pb.TagNumber(1)
  $core.List<$fixnum.Int64> get ids => $_getList(0);
}

class EmptyResponse extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('EmptyResponse', createEmptyInstance: create)
    ..aOM<ResponseStatus>(1, 'ResponseStatus', protoName: 'ResponseStatus', subBuilder: ResponseStatus.create)
    ..hasRequiredFields = false
  ;

  EmptyResponse._() : super();
  factory EmptyResponse() => create();
  factory EmptyResponse.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory EmptyResponse.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  EmptyResponse clone() => EmptyResponse()..mergeFromMessage(this);
  EmptyResponse copyWith(void Function(EmptyResponse) updates) => super.copyWith((message) => updates(message as EmptyResponse));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static EmptyResponse create() => EmptyResponse._();
  EmptyResponse createEmptyInstance() => create();
  static $pb.PbList<EmptyResponse> createRepeated() => $pb.PbList<EmptyResponse>();
  @$core.pragma('dart2js:noInline')
  static EmptyResponse getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<EmptyResponse>(create);
  static EmptyResponse _defaultInstance;

  @$pb.TagNumber(1)
  ResponseStatus get responseStatus => $_getN(0);
  @$pb.TagNumber(1)
  set responseStatus(ResponseStatus v) { setField(1, v); }
  @$pb.TagNumber(1)
  $core.bool hasResponseStatus() => $_has(0);
  @$pb.TagNumber(1)
  void clearResponseStatus() => clearField(1);
  @$pb.TagNumber(1)
  ResponseStatus ensureResponseStatus() => $_ensure(0);
}

class FileContent extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('FileContent', createEmptyInstance: create)
    ..aOS(1, 'Name', protoName: 'Name')
    ..aOS(2, 'Type', protoName: 'Type')
    ..a<$core.int>(3, 'Length', $pb.PbFieldType.O3, protoName: 'Length')
    ..a<$core.List<$core.int>>(4, 'Body', $pb.PbFieldType.OY, protoName: 'Body')
    ..aOM<ResponseStatus>(5, 'ResponseStatus', protoName: 'ResponseStatus', subBuilder: ResponseStatus.create)
    ..hasRequiredFields = false
  ;

  FileContent._() : super();
  factory FileContent() => create();
  factory FileContent.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory FileContent.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  FileContent clone() => FileContent()..mergeFromMessage(this);
  FileContent copyWith(void Function(FileContent) updates) => super.copyWith((message) => updates(message as FileContent));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static FileContent create() => FileContent._();
  FileContent createEmptyInstance() => create();
  static $pb.PbList<FileContent> createRepeated() => $pb.PbList<FileContent>();
  @$core.pragma('dart2js:noInline')
  static FileContent getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<FileContent>(create);
  static FileContent _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get name => $_getSZ(0);
  @$pb.TagNumber(1)
  set name($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasName() => $_has(0);
  @$pb.TagNumber(1)
  void clearName() => clearField(1);

  @$pb.TagNumber(2)
  $core.String get type => $_getSZ(1);
  @$pb.TagNumber(2)
  set type($core.String v) { $_setString(1, v); }
  @$pb.TagNumber(2)
  $core.bool hasType() => $_has(1);
  @$pb.TagNumber(2)
  void clearType() => clearField(2);

  @$pb.TagNumber(3)
  $core.int get length => $_getIZ(2);
  @$pb.TagNumber(3)
  set length($core.int v) { $_setSignedInt32(2, v); }
  @$pb.TagNumber(3)
  $core.bool hasLength() => $_has(2);
  @$pb.TagNumber(3)
  void clearLength() => clearField(3);

  @$pb.TagNumber(4)
  $core.List<$core.int> get body => $_getN(3);
  @$pb.TagNumber(4)
  set body($core.List<$core.int> v) { $_setBytes(3, v); }
  @$pb.TagNumber(4)
  $core.bool hasBody() => $_has(3);
  @$pb.TagNumber(4)
  void clearBody() => clearField(4);

  @$pb.TagNumber(5)
  ResponseStatus get responseStatus => $_getN(4);
  @$pb.TagNumber(5)
  set responseStatus(ResponseStatus v) { setField(5, v); }
  @$pb.TagNumber(5)
  $core.bool hasResponseStatus() => $_has(4);
  @$pb.TagNumber(5)
  void clearResponseStatus() => clearField(5);
  @$pb.TagNumber(5)
  ResponseStatus ensureResponseStatus() => $_ensure(4);
}

class GetAccessToken extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('GetAccessToken', createEmptyInstance: create)
    ..aOS(1, 'RefreshToken', protoName: 'RefreshToken')
    ..aOB(2, 'UseTokenCookie', protoName: 'UseTokenCookie')
    ..m<$core.String, $core.String>(3, 'Meta', protoName: 'Meta', entryClassName: 'GetAccessToken.MetaEntry', keyFieldType: $pb.PbFieldType.OS, valueFieldType: $pb.PbFieldType.OS)
    ..hasRequiredFields = false
  ;

  GetAccessToken._() : super();
  factory GetAccessToken() => create();
  factory GetAccessToken.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory GetAccessToken.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  GetAccessToken clone() => GetAccessToken()..mergeFromMessage(this);
  GetAccessToken copyWith(void Function(GetAccessToken) updates) => super.copyWith((message) => updates(message as GetAccessToken));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static GetAccessToken create() => GetAccessToken._();
  GetAccessToken createEmptyInstance() => create();
  static $pb.PbList<GetAccessToken> createRepeated() => $pb.PbList<GetAccessToken>();
  @$core.pragma('dart2js:noInline')
  static GetAccessToken getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<GetAccessToken>(create);
  static GetAccessToken _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get refreshToken => $_getSZ(0);
  @$pb.TagNumber(1)
  set refreshToken($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasRefreshToken() => $_has(0);
  @$pb.TagNumber(1)
  void clearRefreshToken() => clearField(1);

  @$pb.TagNumber(2)
  $core.bool get useTokenCookie => $_getBF(1);
  @$pb.TagNumber(2)
  set useTokenCookie($core.bool v) { $_setBool(1, v); }
  @$pb.TagNumber(2)
  $core.bool hasUseTokenCookie() => $_has(1);
  @$pb.TagNumber(2)
  void clearUseTokenCookie() => clearField(2);

  @$pb.TagNumber(3)
  $core.Map<$core.String, $core.String> get meta => $_getMap(2);
}

class GetAccessTokenResponse extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('GetAccessTokenResponse', createEmptyInstance: create)
    ..aOS(1, 'AccessToken', protoName: 'AccessToken')
    ..m<$core.String, $core.String>(2, 'Meta', protoName: 'Meta', entryClassName: 'GetAccessTokenResponse.MetaEntry', keyFieldType: $pb.PbFieldType.OS, valueFieldType: $pb.PbFieldType.OS)
    ..aOM<ResponseStatus>(3, 'ResponseStatus', protoName: 'ResponseStatus', subBuilder: ResponseStatus.create)
    ..hasRequiredFields = false
  ;

  GetAccessTokenResponse._() : super();
  factory GetAccessTokenResponse() => create();
  factory GetAccessTokenResponse.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory GetAccessTokenResponse.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  GetAccessTokenResponse clone() => GetAccessTokenResponse()..mergeFromMessage(this);
  GetAccessTokenResponse copyWith(void Function(GetAccessTokenResponse) updates) => super.copyWith((message) => updates(message as GetAccessTokenResponse));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static GetAccessTokenResponse create() => GetAccessTokenResponse._();
  GetAccessTokenResponse createEmptyInstance() => create();
  static $pb.PbList<GetAccessTokenResponse> createRepeated() => $pb.PbList<GetAccessTokenResponse>();
  @$core.pragma('dart2js:noInline')
  static GetAccessTokenResponse getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<GetAccessTokenResponse>(create);
  static GetAccessTokenResponse _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get accessToken => $_getSZ(0);
  @$pb.TagNumber(1)
  set accessToken($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasAccessToken() => $_has(0);
  @$pb.TagNumber(1)
  void clearAccessToken() => clearField(1);

  @$pb.TagNumber(2)
  $core.Map<$core.String, $core.String> get meta => $_getMap(1);

  @$pb.TagNumber(3)
  ResponseStatus get responseStatus => $_getN(2);
  @$pb.TagNumber(3)
  set responseStatus(ResponseStatus v) { setField(3, v); }
  @$pb.TagNumber(3)
  $core.bool hasResponseStatus() => $_has(2);
  @$pb.TagNumber(3)
  void clearResponseStatus() => clearField(3);
  @$pb.TagNumber(3)
  ResponseStatus ensureResponseStatus() => $_ensure(2);
}

class GetTodo extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('GetTodo', createEmptyInstance: create)
    ..aInt64(1, 'Id', protoName: 'Id')
    ..hasRequiredFields = false
  ;

  GetTodo._() : super();
  factory GetTodo() => create();
  factory GetTodo.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory GetTodo.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  GetTodo clone() => GetTodo()..mergeFromMessage(this);
  GetTodo copyWith(void Function(GetTodo) updates) => super.copyWith((message) => updates(message as GetTodo));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static GetTodo create() => GetTodo._();
  GetTodo createEmptyInstance() => create();
  static $pb.PbList<GetTodo> createRepeated() => $pb.PbList<GetTodo>();
  @$core.pragma('dart2js:noInline')
  static GetTodo getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<GetTodo>(create);
  static GetTodo _defaultInstance;

  @$pb.TagNumber(1)
  $fixnum.Int64 get id => $_getI64(0);
  @$pb.TagNumber(1)
  set id($fixnum.Int64 v) { $_setInt64(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasId() => $_has(0);
  @$pb.TagNumber(1)
  void clearId() => clearField(1);
}

class GetTodoResponse extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('GetTodoResponse', createEmptyInstance: create)
    ..aOM<Todo>(1, 'Result', protoName: 'Result', subBuilder: Todo.create)
    ..aOM<ResponseStatus>(2, 'ResponseStatus', protoName: 'ResponseStatus', subBuilder: ResponseStatus.create)
    ..hasRequiredFields = false
  ;

  GetTodoResponse._() : super();
  factory GetTodoResponse() => create();
  factory GetTodoResponse.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory GetTodoResponse.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  GetTodoResponse clone() => GetTodoResponse()..mergeFromMessage(this);
  GetTodoResponse copyWith(void Function(GetTodoResponse) updates) => super.copyWith((message) => updates(message as GetTodoResponse));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static GetTodoResponse create() => GetTodoResponse._();
  GetTodoResponse createEmptyInstance() => create();
  static $pb.PbList<GetTodoResponse> createRepeated() => $pb.PbList<GetTodoResponse>();
  @$core.pragma('dart2js:noInline')
  static GetTodoResponse getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<GetTodoResponse>(create);
  static GetTodoResponse _defaultInstance;

  @$pb.TagNumber(1)
  Todo get result => $_getN(0);
  @$pb.TagNumber(1)
  set result(Todo v) { setField(1, v); }
  @$pb.TagNumber(1)
  $core.bool hasResult() => $_has(0);
  @$pb.TagNumber(1)
  void clearResult() => clearField(1);
  @$pb.TagNumber(1)
  Todo ensureResult() => $_ensure(0);

  @$pb.TagNumber(2)
  ResponseStatus get responseStatus => $_getN(1);
  @$pb.TagNumber(2)
  set responseStatus(ResponseStatus v) { setField(2, v); }
  @$pb.TagNumber(2)
  $core.bool hasResponseStatus() => $_has(1);
  @$pb.TagNumber(2)
  void clearResponseStatus() => clearField(2);
  @$pb.TagNumber(2)
  ResponseStatus ensureResponseStatus() => $_ensure(1);
}

class GetTodos extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('GetTodos', createEmptyInstance: create)
    ..hasRequiredFields = false
  ;

  GetTodos._() : super();
  factory GetTodos() => create();
  factory GetTodos.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory GetTodos.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  GetTodos clone() => GetTodos()..mergeFromMessage(this);
  GetTodos copyWith(void Function(GetTodos) updates) => super.copyWith((message) => updates(message as GetTodos));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static GetTodos create() => GetTodos._();
  GetTodos createEmptyInstance() => create();
  static $pb.PbList<GetTodos> createRepeated() => $pb.PbList<GetTodos>();
  @$core.pragma('dart2js:noInline')
  static GetTodos getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<GetTodos>(create);
  static GetTodos _defaultInstance;
}

class GetTodosResponse extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('GetTodosResponse', createEmptyInstance: create)
    ..pc<Todo>(1, 'Results', $pb.PbFieldType.PM, protoName: 'Results', subBuilder: Todo.create)
    ..aOM<ResponseStatus>(2, 'ResponseStatus', protoName: 'ResponseStatus', subBuilder: ResponseStatus.create)
    ..hasRequiredFields = false
  ;

  GetTodosResponse._() : super();
  factory GetTodosResponse() => create();
  factory GetTodosResponse.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory GetTodosResponse.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  GetTodosResponse clone() => GetTodosResponse()..mergeFromMessage(this);
  GetTodosResponse copyWith(void Function(GetTodosResponse) updates) => super.copyWith((message) => updates(message as GetTodosResponse));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static GetTodosResponse create() => GetTodosResponse._();
  GetTodosResponse createEmptyInstance() => create();
  static $pb.PbList<GetTodosResponse> createRepeated() => $pb.PbList<GetTodosResponse>();
  @$core.pragma('dart2js:noInline')
  static GetTodosResponse getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<GetTodosResponse>(create);
  static GetTodosResponse _defaultInstance;

  @$pb.TagNumber(1)
  $core.List<Todo> get results => $_getList(0);

  @$pb.TagNumber(2)
  ResponseStatus get responseStatus => $_getN(1);
  @$pb.TagNumber(2)
  set responseStatus(ResponseStatus v) { setField(2, v); }
  @$pb.TagNumber(2)
  $core.bool hasResponseStatus() => $_has(1);
  @$pb.TagNumber(2)
  void clearResponseStatus() => clearField(2);
  @$pb.TagNumber(2)
  ResponseStatus ensureResponseStatus() => $_ensure(1);
}

class Hello extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('Hello', createEmptyInstance: create)
    ..aOS(1, 'Name', protoName: 'Name')
    ..hasRequiredFields = false
  ;

  Hello._() : super();
  factory Hello() => create();
  factory Hello.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory Hello.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  Hello clone() => Hello()..mergeFromMessage(this);
  Hello copyWith(void Function(Hello) updates) => super.copyWith((message) => updates(message as Hello));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static Hello create() => Hello._();
  Hello createEmptyInstance() => create();
  static $pb.PbList<Hello> createRepeated() => $pb.PbList<Hello>();
  @$core.pragma('dart2js:noInline')
  static Hello getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<Hello>(create);
  static Hello _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get name => $_getSZ(0);
  @$pb.TagNumber(1)
  set name($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasName() => $_has(0);
  @$pb.TagNumber(1)
  void clearName() => clearField(1);
}

class HelloResponse extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('HelloResponse', createEmptyInstance: create)
    ..aOS(1, 'Result', protoName: 'Result')
    ..aOM<ResponseStatus>(2, 'ResponseStatus', protoName: 'ResponseStatus', subBuilder: ResponseStatus.create)
    ..hasRequiredFields = false
  ;

  HelloResponse._() : super();
  factory HelloResponse() => create();
  factory HelloResponse.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory HelloResponse.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  HelloResponse clone() => HelloResponse()..mergeFromMessage(this);
  HelloResponse copyWith(void Function(HelloResponse) updates) => super.copyWith((message) => updates(message as HelloResponse));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static HelloResponse create() => HelloResponse._();
  HelloResponse createEmptyInstance() => create();
  static $pb.PbList<HelloResponse> createRepeated() => $pb.PbList<HelloResponse>();
  @$core.pragma('dart2js:noInline')
  static HelloResponse getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<HelloResponse>(create);
  static HelloResponse _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get result => $_getSZ(0);
  @$pb.TagNumber(1)
  set result($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasResult() => $_has(0);
  @$pb.TagNumber(1)
  void clearResult() => clearField(1);

  @$pb.TagNumber(2)
  ResponseStatus get responseStatus => $_getN(1);
  @$pb.TagNumber(2)
  set responseStatus(ResponseStatus v) { setField(2, v); }
  @$pb.TagNumber(2)
  $core.bool hasResponseStatus() => $_has(1);
  @$pb.TagNumber(2)
  void clearResponseStatus() => clearField(2);
  @$pb.TagNumber(2)
  ResponseStatus ensureResponseStatus() => $_ensure(1);
}

class HelloSecure extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('HelloSecure', createEmptyInstance: create)
    ..aOS(1, 'Name', protoName: 'Name')
    ..hasRequiredFields = false
  ;

  HelloSecure._() : super();
  factory HelloSecure() => create();
  factory HelloSecure.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory HelloSecure.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  HelloSecure clone() => HelloSecure()..mergeFromMessage(this);
  HelloSecure copyWith(void Function(HelloSecure) updates) => super.copyWith((message) => updates(message as HelloSecure));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static HelloSecure create() => HelloSecure._();
  HelloSecure createEmptyInstance() => create();
  static $pb.PbList<HelloSecure> createRepeated() => $pb.PbList<HelloSecure>();
  @$core.pragma('dart2js:noInline')
  static HelloSecure getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<HelloSecure>(create);
  static HelloSecure _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get name => $_getSZ(0);
  @$pb.TagNumber(1)
  set name($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasName() => $_has(0);
  @$pb.TagNumber(1)
  void clearName() => clearField(1);
}

class Register extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('Register', createEmptyInstance: create)
    ..aOS(1, 'UserName', protoName: 'UserName')
    ..aOS(2, 'FirstName', protoName: 'FirstName')
    ..aOS(3, 'LastName', protoName: 'LastName')
    ..aOS(4, 'DisplayName', protoName: 'DisplayName')
    ..aOS(5, 'Email', protoName: 'Email')
    ..aOS(6, 'Password', protoName: 'Password')
    ..aOS(7, 'ConfirmPassword', protoName: 'ConfirmPassword')
    ..aOB(8, 'AutoLogin', protoName: 'AutoLogin')
    ..aOS(9, 'Continue', protoName: 'Continue')
    ..aOS(10, 'ErrorView', protoName: 'ErrorView')
    ..m<$core.String, $core.String>(11, 'Meta', protoName: 'Meta', entryClassName: 'Register.MetaEntry', keyFieldType: $pb.PbFieldType.OS, valueFieldType: $pb.PbFieldType.OS)
    ..hasRequiredFields = false
  ;

  Register._() : super();
  factory Register() => create();
  factory Register.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory Register.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  Register clone() => Register()..mergeFromMessage(this);
  Register copyWith(void Function(Register) updates) => super.copyWith((message) => updates(message as Register));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static Register create() => Register._();
  Register createEmptyInstance() => create();
  static $pb.PbList<Register> createRepeated() => $pb.PbList<Register>();
  @$core.pragma('dart2js:noInline')
  static Register getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<Register>(create);
  static Register _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get userName => $_getSZ(0);
  @$pb.TagNumber(1)
  set userName($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasUserName() => $_has(0);
  @$pb.TagNumber(1)
  void clearUserName() => clearField(1);

  @$pb.TagNumber(2)
  $core.String get firstName => $_getSZ(1);
  @$pb.TagNumber(2)
  set firstName($core.String v) { $_setString(1, v); }
  @$pb.TagNumber(2)
  $core.bool hasFirstName() => $_has(1);
  @$pb.TagNumber(2)
  void clearFirstName() => clearField(2);

  @$pb.TagNumber(3)
  $core.String get lastName => $_getSZ(2);
  @$pb.TagNumber(3)
  set lastName($core.String v) { $_setString(2, v); }
  @$pb.TagNumber(3)
  $core.bool hasLastName() => $_has(2);
  @$pb.TagNumber(3)
  void clearLastName() => clearField(3);

  @$pb.TagNumber(4)
  $core.String get displayName => $_getSZ(3);
  @$pb.TagNumber(4)
  set displayName($core.String v) { $_setString(3, v); }
  @$pb.TagNumber(4)
  $core.bool hasDisplayName() => $_has(3);
  @$pb.TagNumber(4)
  void clearDisplayName() => clearField(4);

  @$pb.TagNumber(5)
  $core.String get email => $_getSZ(4);
  @$pb.TagNumber(5)
  set email($core.String v) { $_setString(4, v); }
  @$pb.TagNumber(5)
  $core.bool hasEmail() => $_has(4);
  @$pb.TagNumber(5)
  void clearEmail() => clearField(5);

  @$pb.TagNumber(6)
  $core.String get password => $_getSZ(5);
  @$pb.TagNumber(6)
  set password($core.String v) { $_setString(5, v); }
  @$pb.TagNumber(6)
  $core.bool hasPassword() => $_has(5);
  @$pb.TagNumber(6)
  void clearPassword() => clearField(6);

  @$pb.TagNumber(7)
  $core.String get confirmPassword => $_getSZ(6);
  @$pb.TagNumber(7)
  set confirmPassword($core.String v) { $_setString(6, v); }
  @$pb.TagNumber(7)
  $core.bool hasConfirmPassword() => $_has(6);
  @$pb.TagNumber(7)
  void clearConfirmPassword() => clearField(7);

  @$pb.TagNumber(8)
  $core.bool get autoLogin => $_getBF(7);
  @$pb.TagNumber(8)
  set autoLogin($core.bool v) { $_setBool(7, v); }
  @$pb.TagNumber(8)
  $core.bool hasAutoLogin() => $_has(7);
  @$pb.TagNumber(8)
  void clearAutoLogin() => clearField(8);

  @$pb.TagNumber(9)
  $core.String get continue_9 => $_getSZ(8);
  @$pb.TagNumber(9)
  set continue_9($core.String v) { $_setString(8, v); }
  @$pb.TagNumber(9)
  $core.bool hasContinue_9() => $_has(8);
  @$pb.TagNumber(9)
  void clearContinue_9() => clearField(9);

  @$pb.TagNumber(10)
  $core.String get errorView => $_getSZ(9);
  @$pb.TagNumber(10)
  set errorView($core.String v) { $_setString(9, v); }
  @$pb.TagNumber(10)
  $core.bool hasErrorView() => $_has(9);
  @$pb.TagNumber(10)
  void clearErrorView() => clearField(10);

  @$pb.TagNumber(11)
  $core.Map<$core.String, $core.String> get meta => $_getMap(10);
}

class RegisterResponse extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('RegisterResponse', createEmptyInstance: create)
    ..aOS(1, 'UserId', protoName: 'UserId')
    ..aOS(2, 'SessionId', protoName: 'SessionId')
    ..aOS(3, 'UserName', protoName: 'UserName')
    ..aOS(4, 'ReferrerUrl', protoName: 'ReferrerUrl')
    ..aOS(5, 'BearerToken', protoName: 'BearerToken')
    ..aOS(6, 'RefreshToken', protoName: 'RefreshToken')
    ..aOM<ResponseStatus>(7, 'ResponseStatus', protoName: 'ResponseStatus', subBuilder: ResponseStatus.create)
    ..m<$core.String, $core.String>(8, 'Meta', protoName: 'Meta', entryClassName: 'RegisterResponse.MetaEntry', keyFieldType: $pb.PbFieldType.OS, valueFieldType: $pb.PbFieldType.OS)
    ..hasRequiredFields = false
  ;

  RegisterResponse._() : super();
  factory RegisterResponse() => create();
  factory RegisterResponse.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory RegisterResponse.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  RegisterResponse clone() => RegisterResponse()..mergeFromMessage(this);
  RegisterResponse copyWith(void Function(RegisterResponse) updates) => super.copyWith((message) => updates(message as RegisterResponse));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static RegisterResponse create() => RegisterResponse._();
  RegisterResponse createEmptyInstance() => create();
  static $pb.PbList<RegisterResponse> createRepeated() => $pb.PbList<RegisterResponse>();
  @$core.pragma('dart2js:noInline')
  static RegisterResponse getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<RegisterResponse>(create);
  static RegisterResponse _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get userId => $_getSZ(0);
  @$pb.TagNumber(1)
  set userId($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasUserId() => $_has(0);
  @$pb.TagNumber(1)
  void clearUserId() => clearField(1);

  @$pb.TagNumber(2)
  $core.String get sessionId => $_getSZ(1);
  @$pb.TagNumber(2)
  set sessionId($core.String v) { $_setString(1, v); }
  @$pb.TagNumber(2)
  $core.bool hasSessionId() => $_has(1);
  @$pb.TagNumber(2)
  void clearSessionId() => clearField(2);

  @$pb.TagNumber(3)
  $core.String get userName => $_getSZ(2);
  @$pb.TagNumber(3)
  set userName($core.String v) { $_setString(2, v); }
  @$pb.TagNumber(3)
  $core.bool hasUserName() => $_has(2);
  @$pb.TagNumber(3)
  void clearUserName() => clearField(3);

  @$pb.TagNumber(4)
  $core.String get referrerUrl => $_getSZ(3);
  @$pb.TagNumber(4)
  set referrerUrl($core.String v) { $_setString(3, v); }
  @$pb.TagNumber(4)
  $core.bool hasReferrerUrl() => $_has(3);
  @$pb.TagNumber(4)
  void clearReferrerUrl() => clearField(4);

  @$pb.TagNumber(5)
  $core.String get bearerToken => $_getSZ(4);
  @$pb.TagNumber(5)
  set bearerToken($core.String v) { $_setString(4, v); }
  @$pb.TagNumber(5)
  $core.bool hasBearerToken() => $_has(4);
  @$pb.TagNumber(5)
  void clearBearerToken() => clearField(5);

  @$pb.TagNumber(6)
  $core.String get refreshToken => $_getSZ(5);
  @$pb.TagNumber(6)
  set refreshToken($core.String v) { $_setString(5, v); }
  @$pb.TagNumber(6)
  $core.bool hasRefreshToken() => $_has(5);
  @$pb.TagNumber(6)
  void clearRefreshToken() => clearField(6);

  @$pb.TagNumber(7)
  ResponseStatus get responseStatus => $_getN(6);
  @$pb.TagNumber(7)
  set responseStatus(ResponseStatus v) { setField(7, v); }
  @$pb.TagNumber(7)
  $core.bool hasResponseStatus() => $_has(6);
  @$pb.TagNumber(7)
  void clearResponseStatus() => clearField(7);
  @$pb.TagNumber(7)
  ResponseStatus ensureResponseStatus() => $_ensure(6);

  @$pb.TagNumber(8)
  $core.Map<$core.String, $core.String> get meta => $_getMap(7);
}

class ResetTodos extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('ResetTodos', createEmptyInstance: create)
    ..hasRequiredFields = false
  ;

  ResetTodos._() : super();
  factory ResetTodos() => create();
  factory ResetTodos.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory ResetTodos.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  ResetTodos clone() => ResetTodos()..mergeFromMessage(this);
  ResetTodos copyWith(void Function(ResetTodos) updates) => super.copyWith((message) => updates(message as ResetTodos));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static ResetTodos create() => ResetTodos._();
  ResetTodos createEmptyInstance() => create();
  static $pb.PbList<ResetTodos> createRepeated() => $pb.PbList<ResetTodos>();
  @$core.pragma('dart2js:noInline')
  static ResetTodos getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<ResetTodos>(create);
  static ResetTodos _defaultInstance;
}

class ResponseError extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('ResponseError', createEmptyInstance: create)
    ..aOS(1, 'ErrorCode', protoName: 'ErrorCode')
    ..aOS(2, 'FieldName', protoName: 'FieldName')
    ..aOS(3, 'Message', protoName: 'Message')
    ..m<$core.String, $core.String>(4, 'Meta', protoName: 'Meta', entryClassName: 'ResponseError.MetaEntry', keyFieldType: $pb.PbFieldType.OS, valueFieldType: $pb.PbFieldType.OS)
    ..hasRequiredFields = false
  ;

  ResponseError._() : super();
  factory ResponseError() => create();
  factory ResponseError.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory ResponseError.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  ResponseError clone() => ResponseError()..mergeFromMessage(this);
  ResponseError copyWith(void Function(ResponseError) updates) => super.copyWith((message) => updates(message as ResponseError));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static ResponseError create() => ResponseError._();
  ResponseError createEmptyInstance() => create();
  static $pb.PbList<ResponseError> createRepeated() => $pb.PbList<ResponseError>();
  @$core.pragma('dart2js:noInline')
  static ResponseError getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<ResponseError>(create);
  static ResponseError _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get errorCode => $_getSZ(0);
  @$pb.TagNumber(1)
  set errorCode($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasErrorCode() => $_has(0);
  @$pb.TagNumber(1)
  void clearErrorCode() => clearField(1);

  @$pb.TagNumber(2)
  $core.String get fieldName => $_getSZ(1);
  @$pb.TagNumber(2)
  set fieldName($core.String v) { $_setString(1, v); }
  @$pb.TagNumber(2)
  $core.bool hasFieldName() => $_has(1);
  @$pb.TagNumber(2)
  void clearFieldName() => clearField(2);

  @$pb.TagNumber(3)
  $core.String get message => $_getSZ(2);
  @$pb.TagNumber(3)
  set message($core.String v) { $_setString(2, v); }
  @$pb.TagNumber(3)
  $core.bool hasMessage() => $_has(2);
  @$pb.TagNumber(3)
  void clearMessage() => clearField(3);

  @$pb.TagNumber(4)
  $core.Map<$core.String, $core.String> get meta => $_getMap(3);
}

class ResponseStatus extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('ResponseStatus', createEmptyInstance: create)
    ..aOS(1, 'ErrorCode', protoName: 'ErrorCode')
    ..aOS(2, 'Message', protoName: 'Message')
    ..aOS(3, 'StackTrace', protoName: 'StackTrace')
    ..pc<ResponseError>(4, 'Errors', $pb.PbFieldType.PM, protoName: 'Errors', subBuilder: ResponseError.create)
    ..m<$core.String, $core.String>(5, 'Meta', protoName: 'Meta', entryClassName: 'ResponseStatus.MetaEntry', keyFieldType: $pb.PbFieldType.OS, valueFieldType: $pb.PbFieldType.OS)
    ..hasRequiredFields = false
  ;

  ResponseStatus._() : super();
  factory ResponseStatus() => create();
  factory ResponseStatus.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory ResponseStatus.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  ResponseStatus clone() => ResponseStatus()..mergeFromMessage(this);
  ResponseStatus copyWith(void Function(ResponseStatus) updates) => super.copyWith((message) => updates(message as ResponseStatus));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static ResponseStatus create() => ResponseStatus._();
  ResponseStatus createEmptyInstance() => create();
  static $pb.PbList<ResponseStatus> createRepeated() => $pb.PbList<ResponseStatus>();
  @$core.pragma('dart2js:noInline')
  static ResponseStatus getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<ResponseStatus>(create);
  static ResponseStatus _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get errorCode => $_getSZ(0);
  @$pb.TagNumber(1)
  set errorCode($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasErrorCode() => $_has(0);
  @$pb.TagNumber(1)
  void clearErrorCode() => clearField(1);

  @$pb.TagNumber(2)
  $core.String get message => $_getSZ(1);
  @$pb.TagNumber(2)
  set message($core.String v) { $_setString(1, v); }
  @$pb.TagNumber(2)
  $core.bool hasMessage() => $_has(1);
  @$pb.TagNumber(2)
  void clearMessage() => clearField(2);

  @$pb.TagNumber(3)
  $core.String get stackTrace => $_getSZ(2);
  @$pb.TagNumber(3)
  set stackTrace($core.String v) { $_setString(2, v); }
  @$pb.TagNumber(3)
  $core.bool hasStackTrace() => $_has(2);
  @$pb.TagNumber(3)
  void clearStackTrace() => clearField(3);

  @$pb.TagNumber(4)
  $core.List<ResponseError> get errors => $_getList(3);

  @$pb.TagNumber(5)
  $core.Map<$core.String, $core.String> get meta => $_getMap(4);
}

class StreamFiles extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('StreamFiles', createEmptyInstance: create)
    ..pPS(1, 'Paths', protoName: 'Paths')
    ..hasRequiredFields = false
  ;

  StreamFiles._() : super();
  factory StreamFiles() => create();
  factory StreamFiles.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory StreamFiles.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  StreamFiles clone() => StreamFiles()..mergeFromMessage(this);
  StreamFiles copyWith(void Function(StreamFiles) updates) => super.copyWith((message) => updates(message as StreamFiles));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static StreamFiles create() => StreamFiles._();
  StreamFiles createEmptyInstance() => create();
  static $pb.PbList<StreamFiles> createRepeated() => $pb.PbList<StreamFiles>();
  @$core.pragma('dart2js:noInline')
  static StreamFiles getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<StreamFiles>(create);
  static StreamFiles _defaultInstance;

  @$pb.TagNumber(1)
  $core.List<$core.String> get paths => $_getList(0);
}

class StreamServerEvents extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('StreamServerEvents', createEmptyInstance: create)
    ..pPS(1, 'Channels', protoName: 'Channels')
    ..hasRequiredFields = false
  ;

  StreamServerEvents._() : super();
  factory StreamServerEvents() => create();
  factory StreamServerEvents.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory StreamServerEvents.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  StreamServerEvents clone() => StreamServerEvents()..mergeFromMessage(this);
  StreamServerEvents copyWith(void Function(StreamServerEvents) updates) => super.copyWith((message) => updates(message as StreamServerEvents));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static StreamServerEvents create() => StreamServerEvents._();
  StreamServerEvents createEmptyInstance() => create();
  static $pb.PbList<StreamServerEvents> createRepeated() => $pb.PbList<StreamServerEvents>();
  @$core.pragma('dart2js:noInline')
  static StreamServerEvents getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<StreamServerEvents>(create);
  static StreamServerEvents _defaultInstance;

  @$pb.TagNumber(1)
  $core.List<$core.String> get channels => $_getList(0);
}

class StreamServerEventsResponse extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('StreamServerEventsResponse', createEmptyInstance: create)
    ..aInt64(1, 'EventId', protoName: 'EventId')
    ..aOS(2, 'Channel', protoName: 'Channel')
    ..aOS(4, 'Selector', protoName: 'Selector')
    ..aOS(5, 'Json', protoName: 'Json')
    ..aOS(6, 'Op', protoName: 'Op')
    ..aOS(7, 'Target', protoName: 'Target')
    ..aOS(8, 'CssSelector', protoName: 'CssSelector')
    ..m<$core.String, $core.String>(9, 'Meta', protoName: 'Meta', entryClassName: 'StreamServerEventsResponse.MetaEntry', keyFieldType: $pb.PbFieldType.OS, valueFieldType: $pb.PbFieldType.OS)
    ..aOS(10, 'UserId', protoName: 'UserId')
    ..aOS(11, 'DisplayName', protoName: 'DisplayName')
    ..aOS(12, 'ProfileUrl', protoName: 'ProfileUrl')
    ..aOB(13, 'IsAuthenticated', protoName: 'IsAuthenticated')
    ..pPS(14, 'Channels', protoName: 'Channels')
    ..aInt64(15, 'CreatedAt', protoName: 'CreatedAt')
    ..aOS(21, 'Id', protoName: 'Id')
    ..aOS(22, 'UnRegisterUrl', protoName: 'UnRegisterUrl')
    ..aOS(23, 'UpdateSubscriberUrl', protoName: 'UpdateSubscriberUrl')
    ..aOS(24, 'HeartbeatUrl', protoName: 'HeartbeatUrl')
    ..aInt64(25, 'HeartbeatIntervalMs', protoName: 'HeartbeatIntervalMs')
    ..aInt64(26, 'IdleTimeoutMs', protoName: 'IdleTimeoutMs')
    ..aOM<ResponseStatus>(30, 'ResponseStatus', protoName: 'ResponseStatus', subBuilder: ResponseStatus.create)
    ..hasRequiredFields = false
  ;

  StreamServerEventsResponse._() : super();
  factory StreamServerEventsResponse() => create();
  factory StreamServerEventsResponse.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory StreamServerEventsResponse.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  StreamServerEventsResponse clone() => StreamServerEventsResponse()..mergeFromMessage(this);
  StreamServerEventsResponse copyWith(void Function(StreamServerEventsResponse) updates) => super.copyWith((message) => updates(message as StreamServerEventsResponse));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static StreamServerEventsResponse create() => StreamServerEventsResponse._();
  StreamServerEventsResponse createEmptyInstance() => create();
  static $pb.PbList<StreamServerEventsResponse> createRepeated() => $pb.PbList<StreamServerEventsResponse>();
  @$core.pragma('dart2js:noInline')
  static StreamServerEventsResponse getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<StreamServerEventsResponse>(create);
  static StreamServerEventsResponse _defaultInstance;

  @$pb.TagNumber(1)
  $fixnum.Int64 get eventId => $_getI64(0);
  @$pb.TagNumber(1)
  set eventId($fixnum.Int64 v) { $_setInt64(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasEventId() => $_has(0);
  @$pb.TagNumber(1)
  void clearEventId() => clearField(1);

  @$pb.TagNumber(2)
  $core.String get channel => $_getSZ(1);
  @$pb.TagNumber(2)
  set channel($core.String v) { $_setString(1, v); }
  @$pb.TagNumber(2)
  $core.bool hasChannel() => $_has(1);
  @$pb.TagNumber(2)
  void clearChannel() => clearField(2);

  @$pb.TagNumber(4)
  $core.String get selector => $_getSZ(2);
  @$pb.TagNumber(4)
  set selector($core.String v) { $_setString(2, v); }
  @$pb.TagNumber(4)
  $core.bool hasSelector() => $_has(2);
  @$pb.TagNumber(4)
  void clearSelector() => clearField(4);

  @$pb.TagNumber(5)
  $core.String get json => $_getSZ(3);
  @$pb.TagNumber(5)
  set json($core.String v) { $_setString(3, v); }
  @$pb.TagNumber(5)
  $core.bool hasJson() => $_has(3);
  @$pb.TagNumber(5)
  void clearJson() => clearField(5);

  @$pb.TagNumber(6)
  $core.String get op => $_getSZ(4);
  @$pb.TagNumber(6)
  set op($core.String v) { $_setString(4, v); }
  @$pb.TagNumber(6)
  $core.bool hasOp() => $_has(4);
  @$pb.TagNumber(6)
  void clearOp() => clearField(6);

  @$pb.TagNumber(7)
  $core.String get target => $_getSZ(5);
  @$pb.TagNumber(7)
  set target($core.String v) { $_setString(5, v); }
  @$pb.TagNumber(7)
  $core.bool hasTarget() => $_has(5);
  @$pb.TagNumber(7)
  void clearTarget() => clearField(7);

  @$pb.TagNumber(8)
  $core.String get cssSelector => $_getSZ(6);
  @$pb.TagNumber(8)
  set cssSelector($core.String v) { $_setString(6, v); }
  @$pb.TagNumber(8)
  $core.bool hasCssSelector() => $_has(6);
  @$pb.TagNumber(8)
  void clearCssSelector() => clearField(8);

  @$pb.TagNumber(9)
  $core.Map<$core.String, $core.String> get meta => $_getMap(7);

  @$pb.TagNumber(10)
  $core.String get userId => $_getSZ(8);
  @$pb.TagNumber(10)
  set userId($core.String v) { $_setString(8, v); }
  @$pb.TagNumber(10)
  $core.bool hasUserId() => $_has(8);
  @$pb.TagNumber(10)
  void clearUserId() => clearField(10);

  @$pb.TagNumber(11)
  $core.String get displayName => $_getSZ(9);
  @$pb.TagNumber(11)
  set displayName($core.String v) { $_setString(9, v); }
  @$pb.TagNumber(11)
  $core.bool hasDisplayName() => $_has(9);
  @$pb.TagNumber(11)
  void clearDisplayName() => clearField(11);

  @$pb.TagNumber(12)
  $core.String get profileUrl => $_getSZ(10);
  @$pb.TagNumber(12)
  set profileUrl($core.String v) { $_setString(10, v); }
  @$pb.TagNumber(12)
  $core.bool hasProfileUrl() => $_has(10);
  @$pb.TagNumber(12)
  void clearProfileUrl() => clearField(12);

  @$pb.TagNumber(13)
  $core.bool get isAuthenticated => $_getBF(11);
  @$pb.TagNumber(13)
  set isAuthenticated($core.bool v) { $_setBool(11, v); }
  @$pb.TagNumber(13)
  $core.bool hasIsAuthenticated() => $_has(11);
  @$pb.TagNumber(13)
  void clearIsAuthenticated() => clearField(13);

  @$pb.TagNumber(14)
  $core.List<$core.String> get channels => $_getList(12);

  @$pb.TagNumber(15)
  $fixnum.Int64 get createdAt => $_getI64(13);
  @$pb.TagNumber(15)
  set createdAt($fixnum.Int64 v) { $_setInt64(13, v); }
  @$pb.TagNumber(15)
  $core.bool hasCreatedAt() => $_has(13);
  @$pb.TagNumber(15)
  void clearCreatedAt() => clearField(15);

  @$pb.TagNumber(21)
  $core.String get id => $_getSZ(14);
  @$pb.TagNumber(21)
  set id($core.String v) { $_setString(14, v); }
  @$pb.TagNumber(21)
  $core.bool hasId() => $_has(14);
  @$pb.TagNumber(21)
  void clearId() => clearField(21);

  @$pb.TagNumber(22)
  $core.String get unRegisterUrl => $_getSZ(15);
  @$pb.TagNumber(22)
  set unRegisterUrl($core.String v) { $_setString(15, v); }
  @$pb.TagNumber(22)
  $core.bool hasUnRegisterUrl() => $_has(15);
  @$pb.TagNumber(22)
  void clearUnRegisterUrl() => clearField(22);

  @$pb.TagNumber(23)
  $core.String get updateSubscriberUrl => $_getSZ(16);
  @$pb.TagNumber(23)
  set updateSubscriberUrl($core.String v) { $_setString(16, v); }
  @$pb.TagNumber(23)
  $core.bool hasUpdateSubscriberUrl() => $_has(16);
  @$pb.TagNumber(23)
  void clearUpdateSubscriberUrl() => clearField(23);

  @$pb.TagNumber(24)
  $core.String get heartbeatUrl => $_getSZ(17);
  @$pb.TagNumber(24)
  set heartbeatUrl($core.String v) { $_setString(17, v); }
  @$pb.TagNumber(24)
  $core.bool hasHeartbeatUrl() => $_has(17);
  @$pb.TagNumber(24)
  void clearHeartbeatUrl() => clearField(24);

  @$pb.TagNumber(25)
  $fixnum.Int64 get heartbeatIntervalMs => $_getI64(18);
  @$pb.TagNumber(25)
  set heartbeatIntervalMs($fixnum.Int64 v) { $_setInt64(18, v); }
  @$pb.TagNumber(25)
  $core.bool hasHeartbeatIntervalMs() => $_has(18);
  @$pb.TagNumber(25)
  void clearHeartbeatIntervalMs() => clearField(25);

  @$pb.TagNumber(26)
  $fixnum.Int64 get idleTimeoutMs => $_getI64(19);
  @$pb.TagNumber(26)
  set idleTimeoutMs($fixnum.Int64 v) { $_setInt64(19, v); }
  @$pb.TagNumber(26)
  $core.bool hasIdleTimeoutMs() => $_has(19);
  @$pb.TagNumber(26)
  void clearIdleTimeoutMs() => clearField(26);

  @$pb.TagNumber(30)
  ResponseStatus get responseStatus => $_getN(20);
  @$pb.TagNumber(30)
  set responseStatus(ResponseStatus v) { setField(30, v); }
  @$pb.TagNumber(30)
  $core.bool hasResponseStatus() => $_has(20);
  @$pb.TagNumber(30)
  void clearResponseStatus() => clearField(30);
  @$pb.TagNumber(30)
  ResponseStatus ensureResponseStatus() => $_ensure(20);
}

class Todo extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('Todo', createEmptyInstance: create)
    ..aInt64(1, 'Id', protoName: 'Id')
    ..aOS(2, 'Title', protoName: 'Title')
    ..a<$core.int>(3, 'Order', $pb.PbFieldType.O3, protoName: 'Order')
    ..aOB(4, 'Completed', protoName: 'Completed')
    ..hasRequiredFields = false
  ;

  Todo._() : super();
  factory Todo() => create();
  factory Todo.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory Todo.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  Todo clone() => Todo()..mergeFromMessage(this);
  Todo copyWith(void Function(Todo) updates) => super.copyWith((message) => updates(message as Todo));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static Todo create() => Todo._();
  Todo createEmptyInstance() => create();
  static $pb.PbList<Todo> createRepeated() => $pb.PbList<Todo>();
  @$core.pragma('dart2js:noInline')
  static Todo getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<Todo>(create);
  static Todo _defaultInstance;

  @$pb.TagNumber(1)
  $fixnum.Int64 get id => $_getI64(0);
  @$pb.TagNumber(1)
  set id($fixnum.Int64 v) { $_setInt64(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasId() => $_has(0);
  @$pb.TagNumber(1)
  void clearId() => clearField(1);

  @$pb.TagNumber(2)
  $core.String get title => $_getSZ(1);
  @$pb.TagNumber(2)
  set title($core.String v) { $_setString(1, v); }
  @$pb.TagNumber(2)
  $core.bool hasTitle() => $_has(1);
  @$pb.TagNumber(2)
  void clearTitle() => clearField(2);

  @$pb.TagNumber(3)
  $core.int get order => $_getIZ(2);
  @$pb.TagNumber(3)
  set order($core.int v) { $_setSignedInt32(2, v); }
  @$pb.TagNumber(3)
  $core.bool hasOrder() => $_has(2);
  @$pb.TagNumber(3)
  void clearOrder() => clearField(3);

  @$pb.TagNumber(4)
  $core.bool get completed => $_getBF(3);
  @$pb.TagNumber(4)
  set completed($core.bool v) { $_setBool(3, v); }
  @$pb.TagNumber(4)
  $core.bool hasCompleted() => $_has(3);
  @$pb.TagNumber(4)
  void clearCompleted() => clearField(4);
}

class UnAssignRoles extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('UnAssignRoles', createEmptyInstance: create)
    ..aOS(1, 'UserName', protoName: 'UserName')
    ..pPS(2, 'Permissions', protoName: 'Permissions')
    ..pPS(3, 'Roles', protoName: 'Roles')
    ..m<$core.String, $core.String>(4, 'Meta', protoName: 'Meta', entryClassName: 'UnAssignRoles.MetaEntry', keyFieldType: $pb.PbFieldType.OS, valueFieldType: $pb.PbFieldType.OS)
    ..hasRequiredFields = false
  ;

  UnAssignRoles._() : super();
  factory UnAssignRoles() => create();
  factory UnAssignRoles.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory UnAssignRoles.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  UnAssignRoles clone() => UnAssignRoles()..mergeFromMessage(this);
  UnAssignRoles copyWith(void Function(UnAssignRoles) updates) => super.copyWith((message) => updates(message as UnAssignRoles));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static UnAssignRoles create() => UnAssignRoles._();
  UnAssignRoles createEmptyInstance() => create();
  static $pb.PbList<UnAssignRoles> createRepeated() => $pb.PbList<UnAssignRoles>();
  @$core.pragma('dart2js:noInline')
  static UnAssignRoles getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<UnAssignRoles>(create);
  static UnAssignRoles _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get userName => $_getSZ(0);
  @$pb.TagNumber(1)
  set userName($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasUserName() => $_has(0);
  @$pb.TagNumber(1)
  void clearUserName() => clearField(1);

  @$pb.TagNumber(2)
  $core.List<$core.String> get permissions => $_getList(1);

  @$pb.TagNumber(3)
  $core.List<$core.String> get roles => $_getList(2);

  @$pb.TagNumber(4)
  $core.Map<$core.String, $core.String> get meta => $_getMap(3);
}

class UnAssignRolesResponse extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('UnAssignRolesResponse', createEmptyInstance: create)
    ..pPS(1, 'AllRoles', protoName: 'AllRoles')
    ..pPS(2, 'AllPermissions', protoName: 'AllPermissions')
    ..m<$core.String, $core.String>(3, 'Meta', protoName: 'Meta', entryClassName: 'UnAssignRolesResponse.MetaEntry', keyFieldType: $pb.PbFieldType.OS, valueFieldType: $pb.PbFieldType.OS)
    ..aOM<ResponseStatus>(4, 'ResponseStatus', protoName: 'ResponseStatus', subBuilder: ResponseStatus.create)
    ..hasRequiredFields = false
  ;

  UnAssignRolesResponse._() : super();
  factory UnAssignRolesResponse() => create();
  factory UnAssignRolesResponse.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory UnAssignRolesResponse.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  UnAssignRolesResponse clone() => UnAssignRolesResponse()..mergeFromMessage(this);
  UnAssignRolesResponse copyWith(void Function(UnAssignRolesResponse) updates) => super.copyWith((message) => updates(message as UnAssignRolesResponse));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static UnAssignRolesResponse create() => UnAssignRolesResponse._();
  UnAssignRolesResponse createEmptyInstance() => create();
  static $pb.PbList<UnAssignRolesResponse> createRepeated() => $pb.PbList<UnAssignRolesResponse>();
  @$core.pragma('dart2js:noInline')
  static UnAssignRolesResponse getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<UnAssignRolesResponse>(create);
  static UnAssignRolesResponse _defaultInstance;

  @$pb.TagNumber(1)
  $core.List<$core.String> get allRoles => $_getList(0);

  @$pb.TagNumber(2)
  $core.List<$core.String> get allPermissions => $_getList(1);

  @$pb.TagNumber(3)
  $core.Map<$core.String, $core.String> get meta => $_getMap(2);

  @$pb.TagNumber(4)
  ResponseStatus get responseStatus => $_getN(3);
  @$pb.TagNumber(4)
  set responseStatus(ResponseStatus v) { setField(4, v); }
  @$pb.TagNumber(4)
  $core.bool hasResponseStatus() => $_has(3);
  @$pb.TagNumber(4)
  void clearResponseStatus() => clearField(4);
  @$pb.TagNumber(4)
  ResponseStatus ensureResponseStatus() => $_ensure(3);
}

class UpdateTodo extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo('UpdateTodo', createEmptyInstance: create)
    ..aInt64(1, 'Id', protoName: 'Id')
    ..aOS(2, 'Title', protoName: 'Title')
    ..a<$core.int>(3, 'Order', $pb.PbFieldType.O3, protoName: 'Order')
    ..aOB(4, 'Completed', protoName: 'Completed')
    ..hasRequiredFields = false
  ;

  UpdateTodo._() : super();
  factory UpdateTodo() => create();
  factory UpdateTodo.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory UpdateTodo.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  UpdateTodo clone() => UpdateTodo()..mergeFromMessage(this);
  UpdateTodo copyWith(void Function(UpdateTodo) updates) => super.copyWith((message) => updates(message as UpdateTodo));
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static UpdateTodo create() => UpdateTodo._();
  UpdateTodo createEmptyInstance() => create();
  static $pb.PbList<UpdateTodo> createRepeated() => $pb.PbList<UpdateTodo>();
  @$core.pragma('dart2js:noInline')
  static UpdateTodo getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<UpdateTodo>(create);
  static UpdateTodo _defaultInstance;

  @$pb.TagNumber(1)
  $fixnum.Int64 get id => $_getI64(0);
  @$pb.TagNumber(1)
  set id($fixnum.Int64 v) { $_setInt64(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasId() => $_has(0);
  @$pb.TagNumber(1)
  void clearId() => clearField(1);

  @$pb.TagNumber(2)
  $core.String get title => $_getSZ(1);
  @$pb.TagNumber(2)
  set title($core.String v) { $_setString(1, v); }
  @$pb.TagNumber(2)
  $core.bool hasTitle() => $_has(1);
  @$pb.TagNumber(2)
  void clearTitle() => clearField(2);

  @$pb.TagNumber(3)
  $core.int get order => $_getIZ(2);
  @$pb.TagNumber(3)
  set order($core.int v) { $_setSignedInt32(2, v); }
  @$pb.TagNumber(3)
  $core.bool hasOrder() => $_has(2);
  @$pb.TagNumber(3)
  void clearOrder() => clearField(3);

  @$pb.TagNumber(4)
  $core.bool get completed => $_getBF(3);
  @$pb.TagNumber(4)
  set completed($core.bool v) { $_setBool(3, v); }
  @$pb.TagNumber(4)
  $core.bool hasCompleted() => $_has(3);
  @$pb.TagNumber(4)
  void clearCompleted() => clearField(4);
}

