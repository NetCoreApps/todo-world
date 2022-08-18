///
//  Generated code. Do not modify.
//  source: services.proto
//
// @dart = 2.3
// ignore_for_file: camel_case_types,non_constant_identifier_names,library_prefixes,unused_import,unused_shown_name,return_of_invalid_type

const AssignRoles$json = const {
  '1': 'AssignRoles',
  '2': const [
    const {'1': 'UserName', '3': 1, '4': 1, '5': 9, '10': 'UserName'},
    const {'1': 'Permissions', '3': 2, '4': 3, '5': 9, '10': 'Permissions'},
    const {'1': 'Roles', '3': 3, '4': 3, '5': 9, '10': 'Roles'},
    const {'1': 'Meta', '3': 4, '4': 3, '5': 11, '6': '.AssignRoles.MetaEntry', '10': 'Meta'},
  ],
  '3': const [AssignRoles_MetaEntry$json],
};

const AssignRoles_MetaEntry$json = const {
  '1': 'MetaEntry',
  '2': const [
    const {'1': 'key', '3': 1, '4': 1, '5': 9, '10': 'key'},
    const {'1': 'value', '3': 2, '4': 1, '5': 9, '10': 'value'},
  ],
  '7': const {'7': true},
};

const AssignRolesResponse$json = const {
  '1': 'AssignRolesResponse',
  '2': const [
    const {'1': 'AllRoles', '3': 1, '4': 3, '5': 9, '10': 'AllRoles'},
    const {'1': 'AllPermissions', '3': 2, '4': 3, '5': 9, '10': 'AllPermissions'},
    const {'1': 'Meta', '3': 3, '4': 3, '5': 11, '6': '.AssignRolesResponse.MetaEntry', '10': 'Meta'},
    const {'1': 'ResponseStatus', '3': 4, '4': 1, '5': 11, '6': '.ResponseStatus', '10': 'ResponseStatus'},
  ],
  '3': const [AssignRolesResponse_MetaEntry$json],
};

const AssignRolesResponse_MetaEntry$json = const {
  '1': 'MetaEntry',
  '2': const [
    const {'1': 'key', '3': 1, '4': 1, '5': 9, '10': 'key'},
    const {'1': 'value', '3': 2, '4': 1, '5': 9, '10': 'value'},
  ],
  '7': const {'7': true},
};

const Authenticate$json = const {
  '1': 'Authenticate',
  '2': const [
    const {'1': 'provider', '3': 1, '4': 1, '5': 9, '10': 'provider'},
    const {'1': 'State', '3': 2, '4': 1, '5': 9, '10': 'State'},
    const {'1': 'oauth_token', '3': 3, '4': 1, '5': 9, '10': 'oauthToken'},
    const {'1': 'oauth_verifier', '3': 4, '4': 1, '5': 9, '10': 'oauthVerifier'},
    const {'1': 'UserName', '3': 5, '4': 1, '5': 9, '10': 'UserName'},
    const {'1': 'Password', '3': 6, '4': 1, '5': 9, '10': 'Password'},
    const {'1': 'RememberMe', '3': 7, '4': 1, '5': 8, '10': 'RememberMe'},
    const {'1': 'ErrorView', '3': 9, '4': 1, '5': 9, '10': 'ErrorView'},
    const {'1': 'nonce', '3': 10, '4': 1, '5': 9, '10': 'nonce'},
    const {'1': 'uri', '3': 11, '4': 1, '5': 9, '10': 'uri'},
    const {'1': 'response', '3': 12, '4': 1, '5': 9, '10': 'response'},
    const {'1': 'qop', '3': 13, '4': 1, '5': 9, '10': 'qop'},
    const {'1': 'nc', '3': 14, '4': 1, '5': 9, '10': 'nc'},
    const {'1': 'cnonce', '3': 15, '4': 1, '5': 9, '10': 'cnonce'},
    const {'1': 'UseTokenCookie', '3': 16, '4': 1, '5': 8, '10': 'UseTokenCookie'},
    const {'1': 'AccessToken', '3': 17, '4': 1, '5': 9, '10': 'AccessToken'},
    const {'1': 'AccessTokenSecret', '3': 18, '4': 1, '5': 9, '10': 'AccessTokenSecret'},
    const {'1': 'scope', '3': 19, '4': 1, '5': 9, '10': 'scope'},
    const {'1': 'Meta', '3': 20, '4': 3, '5': 11, '6': '.Authenticate.MetaEntry', '10': 'Meta'},
  ],
  '3': const [Authenticate_MetaEntry$json],
};

const Authenticate_MetaEntry$json = const {
  '1': 'MetaEntry',
  '2': const [
    const {'1': 'key', '3': 1, '4': 1, '5': 9, '10': 'key'},
    const {'1': 'value', '3': 2, '4': 1, '5': 9, '10': 'value'},
  ],
  '7': const {'7': true},
};

const AuthenticateResponse$json = const {
  '1': 'AuthenticateResponse',
  '2': const [
    const {'1': 'UserId', '3': 1, '4': 1, '5': 9, '10': 'UserId'},
    const {'1': 'SessionId', '3': 2, '4': 1, '5': 9, '10': 'SessionId'},
    const {'1': 'UserName', '3': 3, '4': 1, '5': 9, '10': 'UserName'},
    const {'1': 'DisplayName', '3': 4, '4': 1, '5': 9, '10': 'DisplayName'},
    const {'1': 'ReferrerUrl', '3': 5, '4': 1, '5': 9, '10': 'ReferrerUrl'},
    const {'1': 'BearerToken', '3': 6, '4': 1, '5': 9, '10': 'BearerToken'},
    const {'1': 'RefreshToken', '3': 7, '4': 1, '5': 9, '10': 'RefreshToken'},
    const {'1': 'ProfileUrl', '3': 8, '4': 1, '5': 9, '10': 'ProfileUrl'},
    const {'1': 'Roles', '3': 9, '4': 3, '5': 9, '10': 'Roles'},
    const {'1': 'Permissions', '3': 10, '4': 3, '5': 9, '10': 'Permissions'},
    const {'1': 'ResponseStatus', '3': 11, '4': 1, '5': 11, '6': '.ResponseStatus', '10': 'ResponseStatus'},
    const {'1': 'Meta', '3': 12, '4': 3, '5': 11, '6': '.AuthenticateResponse.MetaEntry', '10': 'Meta'},
  ],
  '3': const [AuthenticateResponse_MetaEntry$json],
};

const AuthenticateResponse_MetaEntry$json = const {
  '1': 'MetaEntry',
  '2': const [
    const {'1': 'key', '3': 1, '4': 1, '5': 9, '10': 'key'},
    const {'1': 'value', '3': 2, '4': 1, '5': 9, '10': 'value'},
  ],
  '7': const {'7': true},
};

const ConvertSessionToToken$json = const {
  '1': 'ConvertSessionToToken',
  '2': const [
    const {'1': 'PreserveSession', '3': 1, '4': 1, '5': 8, '10': 'PreserveSession'},
    const {'1': 'Meta', '3': 2, '4': 3, '5': 11, '6': '.ConvertSessionToToken.MetaEntry', '10': 'Meta'},
  ],
  '3': const [ConvertSessionToToken_MetaEntry$json],
};

const ConvertSessionToToken_MetaEntry$json = const {
  '1': 'MetaEntry',
  '2': const [
    const {'1': 'key', '3': 1, '4': 1, '5': 9, '10': 'key'},
    const {'1': 'value', '3': 2, '4': 1, '5': 9, '10': 'value'},
  ],
  '7': const {'7': true},
};

const ConvertSessionToTokenResponse$json = const {
  '1': 'ConvertSessionToTokenResponse',
  '2': const [
    const {'1': 'Meta', '3': 1, '4': 3, '5': 11, '6': '.ConvertSessionToTokenResponse.MetaEntry', '10': 'Meta'},
    const {'1': 'AccessToken', '3': 2, '4': 1, '5': 9, '10': 'AccessToken'},
    const {'1': 'RefreshToken', '3': 3, '4': 1, '5': 9, '10': 'RefreshToken'},
    const {'1': 'ResponseStatus', '3': 4, '4': 1, '5': 11, '6': '.ResponseStatus', '10': 'ResponseStatus'},
  ],
  '3': const [ConvertSessionToTokenResponse_MetaEntry$json],
};

const ConvertSessionToTokenResponse_MetaEntry$json = const {
  '1': 'MetaEntry',
  '2': const [
    const {'1': 'key', '3': 1, '4': 1, '5': 9, '10': 'key'},
    const {'1': 'value', '3': 2, '4': 1, '5': 9, '10': 'value'},
  ],
  '7': const {'7': true},
};

const CreateTodo$json = const {
  '1': 'CreateTodo',
  '2': const [
    const {'1': 'Title', '3': 1, '4': 1, '5': 9, '10': 'Title'},
    const {'1': 'Order', '3': 2, '4': 1, '5': 5, '10': 'Order'},
  ],
};

const CreateTodoResponse$json = const {
  '1': 'CreateTodoResponse',
  '2': const [
    const {'1': 'Result', '3': 1, '4': 1, '5': 11, '6': '.Todo', '10': 'Result'},
    const {'1': 'ResponseStatus', '3': 2, '4': 1, '5': 11, '6': '.ResponseStatus', '10': 'ResponseStatus'},
  ],
};

const DeleteTodo$json = const {
  '1': 'DeleteTodo',
  '2': const [
    const {'1': 'Id', '3': 1, '4': 1, '5': 3, '10': 'Id'},
  ],
};

const DeleteTodos$json = const {
  '1': 'DeleteTodos',
  '2': const [
    const {
      '1': 'Ids',
      '3': 1,
      '4': 3,
      '5': 3,
      '8': const {'2': false},
      '10': 'Ids',
    },
  ],
};

const EmptyResponse$json = const {
  '1': 'EmptyResponse',
  '2': const [
    const {'1': 'ResponseStatus', '3': 1, '4': 1, '5': 11, '6': '.ResponseStatus', '10': 'ResponseStatus'},
  ],
};

const FileContent$json = const {
  '1': 'FileContent',
  '2': const [
    const {'1': 'Name', '3': 1, '4': 1, '5': 9, '10': 'Name'},
    const {'1': 'Type', '3': 2, '4': 1, '5': 9, '10': 'Type'},
    const {'1': 'Length', '3': 3, '4': 1, '5': 5, '10': 'Length'},
    const {'1': 'Body', '3': 4, '4': 1, '5': 12, '10': 'Body'},
    const {'1': 'ResponseStatus', '3': 5, '4': 1, '5': 11, '6': '.ResponseStatus', '10': 'ResponseStatus'},
  ],
};

const GetAccessToken$json = const {
  '1': 'GetAccessToken',
  '2': const [
    const {'1': 'RefreshToken', '3': 1, '4': 1, '5': 9, '10': 'RefreshToken'},
    const {'1': 'UseTokenCookie', '3': 2, '4': 1, '5': 8, '10': 'UseTokenCookie'},
    const {'1': 'Meta', '3': 3, '4': 3, '5': 11, '6': '.GetAccessToken.MetaEntry', '10': 'Meta'},
  ],
  '3': const [GetAccessToken_MetaEntry$json],
};

const GetAccessToken_MetaEntry$json = const {
  '1': 'MetaEntry',
  '2': const [
    const {'1': 'key', '3': 1, '4': 1, '5': 9, '10': 'key'},
    const {'1': 'value', '3': 2, '4': 1, '5': 9, '10': 'value'},
  ],
  '7': const {'7': true},
};

const GetAccessTokenResponse$json = const {
  '1': 'GetAccessTokenResponse',
  '2': const [
    const {'1': 'AccessToken', '3': 1, '4': 1, '5': 9, '10': 'AccessToken'},
    const {'1': 'Meta', '3': 2, '4': 3, '5': 11, '6': '.GetAccessTokenResponse.MetaEntry', '10': 'Meta'},
    const {'1': 'ResponseStatus', '3': 3, '4': 1, '5': 11, '6': '.ResponseStatus', '10': 'ResponseStatus'},
  ],
  '3': const [GetAccessTokenResponse_MetaEntry$json],
};

const GetAccessTokenResponse_MetaEntry$json = const {
  '1': 'MetaEntry',
  '2': const [
    const {'1': 'key', '3': 1, '4': 1, '5': 9, '10': 'key'},
    const {'1': 'value', '3': 2, '4': 1, '5': 9, '10': 'value'},
  ],
  '7': const {'7': true},
};

const GetTodo$json = const {
  '1': 'GetTodo',
  '2': const [
    const {'1': 'Id', '3': 1, '4': 1, '5': 3, '10': 'Id'},
  ],
};

const GetTodoResponse$json = const {
  '1': 'GetTodoResponse',
  '2': const [
    const {'1': 'Result', '3': 1, '4': 1, '5': 11, '6': '.Todo', '10': 'Result'},
    const {'1': 'ResponseStatus', '3': 2, '4': 1, '5': 11, '6': '.ResponseStatus', '10': 'ResponseStatus'},
  ],
};

const GetTodos$json = const {
  '1': 'GetTodos',
};

const GetTodosResponse$json = const {
  '1': 'GetTodosResponse',
  '2': const [
    const {'1': 'Results', '3': 1, '4': 3, '5': 11, '6': '.Todo', '10': 'Results'},
    const {'1': 'ResponseStatus', '3': 2, '4': 1, '5': 11, '6': '.ResponseStatus', '10': 'ResponseStatus'},
  ],
};

const Hello$json = const {
  '1': 'Hello',
  '2': const [
    const {'1': 'Name', '3': 1, '4': 1, '5': 9, '10': 'Name'},
  ],
};

const HelloResponse$json = const {
  '1': 'HelloResponse',
  '2': const [
    const {'1': 'Result', '3': 1, '4': 1, '5': 9, '10': 'Result'},
    const {'1': 'ResponseStatus', '3': 2, '4': 1, '5': 11, '6': '.ResponseStatus', '10': 'ResponseStatus'},
  ],
};

const HelloSecure$json = const {
  '1': 'HelloSecure',
  '2': const [
    const {'1': 'Name', '3': 1, '4': 1, '5': 9, '10': 'Name'},
  ],
};

const Register$json = const {
  '1': 'Register',
  '2': const [
    const {'1': 'UserName', '3': 1, '4': 1, '5': 9, '10': 'UserName'},
    const {'1': 'FirstName', '3': 2, '4': 1, '5': 9, '10': 'FirstName'},
    const {'1': 'LastName', '3': 3, '4': 1, '5': 9, '10': 'LastName'},
    const {'1': 'DisplayName', '3': 4, '4': 1, '5': 9, '10': 'DisplayName'},
    const {'1': 'Email', '3': 5, '4': 1, '5': 9, '10': 'Email'},
    const {'1': 'Password', '3': 6, '4': 1, '5': 9, '10': 'Password'},
    const {'1': 'ConfirmPassword', '3': 7, '4': 1, '5': 9, '10': 'ConfirmPassword'},
    const {'1': 'AutoLogin', '3': 8, '4': 1, '5': 8, '10': 'AutoLogin'},
    const {'1': 'ErrorView', '3': 10, '4': 1, '5': 9, '10': 'ErrorView'},
    const {'1': 'Meta', '3': 11, '4': 3, '5': 11, '6': '.Register.MetaEntry', '10': 'Meta'},
  ],
  '3': const [Register_MetaEntry$json],
};

const Register_MetaEntry$json = const {
  '1': 'MetaEntry',
  '2': const [
    const {'1': 'key', '3': 1, '4': 1, '5': 9, '10': 'key'},
    const {'1': 'value', '3': 2, '4': 1, '5': 9, '10': 'value'},
  ],
  '7': const {'7': true},
};

const RegisterResponse$json = const {
  '1': 'RegisterResponse',
  '2': const [
    const {'1': 'UserId', '3': 1, '4': 1, '5': 9, '10': 'UserId'},
    const {'1': 'SessionId', '3': 2, '4': 1, '5': 9, '10': 'SessionId'},
    const {'1': 'UserName', '3': 3, '4': 1, '5': 9, '10': 'UserName'},
    const {'1': 'ReferrerUrl', '3': 4, '4': 1, '5': 9, '10': 'ReferrerUrl'},
    const {'1': 'BearerToken', '3': 5, '4': 1, '5': 9, '10': 'BearerToken'},
    const {'1': 'RefreshToken', '3': 6, '4': 1, '5': 9, '10': 'RefreshToken'},
    const {'1': 'ResponseStatus', '3': 7, '4': 1, '5': 11, '6': '.ResponseStatus', '10': 'ResponseStatus'},
    const {'1': 'Meta', '3': 8, '4': 3, '5': 11, '6': '.RegisterResponse.MetaEntry', '10': 'Meta'},
  ],
  '3': const [RegisterResponse_MetaEntry$json],
};

const RegisterResponse_MetaEntry$json = const {
  '1': 'MetaEntry',
  '2': const [
    const {'1': 'key', '3': 1, '4': 1, '5': 9, '10': 'key'},
    const {'1': 'value', '3': 2, '4': 1, '5': 9, '10': 'value'},
  ],
  '7': const {'7': true},
};

const ResetTodos$json = const {
  '1': 'ResetTodos',
};

const ResponseError$json = const {
  '1': 'ResponseError',
  '2': const [
    const {'1': 'ErrorCode', '3': 1, '4': 1, '5': 9, '10': 'ErrorCode'},
    const {'1': 'FieldName', '3': 2, '4': 1, '5': 9, '10': 'FieldName'},
    const {'1': 'Message', '3': 3, '4': 1, '5': 9, '10': 'Message'},
    const {'1': 'Meta', '3': 4, '4': 3, '5': 11, '6': '.ResponseError.MetaEntry', '10': 'Meta'},
  ],
  '3': const [ResponseError_MetaEntry$json],
};

const ResponseError_MetaEntry$json = const {
  '1': 'MetaEntry',
  '2': const [
    const {'1': 'key', '3': 1, '4': 1, '5': 9, '10': 'key'},
    const {'1': 'value', '3': 2, '4': 1, '5': 9, '10': 'value'},
  ],
  '7': const {'7': true},
};

const ResponseStatus$json = const {
  '1': 'ResponseStatus',
  '2': const [
    const {'1': 'ErrorCode', '3': 1, '4': 1, '5': 9, '10': 'ErrorCode'},
    const {'1': 'Message', '3': 2, '4': 1, '5': 9, '10': 'Message'},
    const {'1': 'StackTrace', '3': 3, '4': 1, '5': 9, '10': 'StackTrace'},
    const {'1': 'Errors', '3': 4, '4': 3, '5': 11, '6': '.ResponseError', '10': 'Errors'},
    const {'1': 'Meta', '3': 5, '4': 3, '5': 11, '6': '.ResponseStatus.MetaEntry', '10': 'Meta'},
  ],
  '3': const [ResponseStatus_MetaEntry$json],
};

const ResponseStatus_MetaEntry$json = const {
  '1': 'MetaEntry',
  '2': const [
    const {'1': 'key', '3': 1, '4': 1, '5': 9, '10': 'key'},
    const {'1': 'value', '3': 2, '4': 1, '5': 9, '10': 'value'},
  ],
  '7': const {'7': true},
};

const StreamFiles$json = const {
  '1': 'StreamFiles',
  '2': const [
    const {'1': 'Paths', '3': 1, '4': 3, '5': 9, '10': 'Paths'},
  ],
};

const StreamServerEvents$json = const {
  '1': 'StreamServerEvents',
  '2': const [
    const {'1': 'Channels', '3': 1, '4': 3, '5': 9, '10': 'Channels'},
  ],
};

const StreamServerEventsResponse$json = const {
  '1': 'StreamServerEventsResponse',
  '2': const [
    const {'1': 'EventId', '3': 1, '4': 1, '5': 3, '10': 'EventId'},
    const {'1': 'Channel', '3': 2, '4': 1, '5': 9, '10': 'Channel'},
    const {'1': 'Selector', '3': 4, '4': 1, '5': 9, '10': 'Selector'},
    const {'1': 'Json', '3': 5, '4': 1, '5': 9, '10': 'Json'},
    const {'1': 'Op', '3': 6, '4': 1, '5': 9, '10': 'Op'},
    const {'1': 'Target', '3': 7, '4': 1, '5': 9, '10': 'Target'},
    const {'1': 'CssSelector', '3': 8, '4': 1, '5': 9, '10': 'CssSelector'},
    const {'1': 'Meta', '3': 9, '4': 3, '5': 11, '6': '.StreamServerEventsResponse.MetaEntry', '10': 'Meta'},
    const {'1': 'UserId', '3': 10, '4': 1, '5': 9, '10': 'UserId'},
    const {'1': 'DisplayName', '3': 11, '4': 1, '5': 9, '10': 'DisplayName'},
    const {'1': 'ProfileUrl', '3': 12, '4': 1, '5': 9, '10': 'ProfileUrl'},
    const {'1': 'IsAuthenticated', '3': 13, '4': 1, '5': 8, '10': 'IsAuthenticated'},
    const {'1': 'Channels', '3': 14, '4': 3, '5': 9, '10': 'Channels'},
    const {'1': 'CreatedAt', '3': 15, '4': 1, '5': 3, '10': 'CreatedAt'},
    const {'1': 'Id', '3': 21, '4': 1, '5': 9, '10': 'Id'},
    const {'1': 'UnRegisterUrl', '3': 22, '4': 1, '5': 9, '10': 'UnRegisterUrl'},
    const {'1': 'UpdateSubscriberUrl', '3': 23, '4': 1, '5': 9, '10': 'UpdateSubscriberUrl'},
    const {'1': 'HeartbeatUrl', '3': 24, '4': 1, '5': 9, '10': 'HeartbeatUrl'},
    const {'1': 'HeartbeatIntervalMs', '3': 25, '4': 1, '5': 3, '10': 'HeartbeatIntervalMs'},
    const {'1': 'IdleTimeoutMs', '3': 26, '4': 1, '5': 3, '10': 'IdleTimeoutMs'},
    const {'1': 'ResponseStatus', '3': 30, '4': 1, '5': 11, '6': '.ResponseStatus', '10': 'ResponseStatus'},
  ],
  '3': const [StreamServerEventsResponse_MetaEntry$json],
};

const StreamServerEventsResponse_MetaEntry$json = const {
  '1': 'MetaEntry',
  '2': const [
    const {'1': 'key', '3': 1, '4': 1, '5': 9, '10': 'key'},
    const {'1': 'value', '3': 2, '4': 1, '5': 9, '10': 'value'},
  ],
  '7': const {'7': true},
};

const Todo$json = const {
  '1': 'Todo',
  '2': const [
    const {'1': 'Id', '3': 1, '4': 1, '5': 3, '10': 'Id'},
    const {'1': 'Title', '3': 2, '4': 1, '5': 9, '10': 'Title'},
    const {'1': 'Order', '3': 3, '4': 1, '5': 5, '10': 'Order'},
    const {'1': 'Completed', '3': 4, '4': 1, '5': 8, '10': 'Completed'},
  ],
};

const UnAssignRoles$json = const {
  '1': 'UnAssignRoles',
  '2': const [
    const {'1': 'UserName', '3': 1, '4': 1, '5': 9, '10': 'UserName'},
    const {'1': 'Permissions', '3': 2, '4': 3, '5': 9, '10': 'Permissions'},
    const {'1': 'Roles', '3': 3, '4': 3, '5': 9, '10': 'Roles'},
    const {'1': 'Meta', '3': 4, '4': 3, '5': 11, '6': '.UnAssignRoles.MetaEntry', '10': 'Meta'},
  ],
  '3': const [UnAssignRoles_MetaEntry$json],
};

const UnAssignRoles_MetaEntry$json = const {
  '1': 'MetaEntry',
  '2': const [
    const {'1': 'key', '3': 1, '4': 1, '5': 9, '10': 'key'},
    const {'1': 'value', '3': 2, '4': 1, '5': 9, '10': 'value'},
  ],
  '7': const {'7': true},
};

const UnAssignRolesResponse$json = const {
  '1': 'UnAssignRolesResponse',
  '2': const [
    const {'1': 'AllRoles', '3': 1, '4': 3, '5': 9, '10': 'AllRoles'},
    const {'1': 'AllPermissions', '3': 2, '4': 3, '5': 9, '10': 'AllPermissions'},
    const {'1': 'Meta', '3': 3, '4': 3, '5': 11, '6': '.UnAssignRolesResponse.MetaEntry', '10': 'Meta'},
    const {'1': 'ResponseStatus', '3': 4, '4': 1, '5': 11, '6': '.ResponseStatus', '10': 'ResponseStatus'},
  ],
  '3': const [UnAssignRolesResponse_MetaEntry$json],
};

const UnAssignRolesResponse_MetaEntry$json = const {
  '1': 'MetaEntry',
  '2': const [
    const {'1': 'key', '3': 1, '4': 1, '5': 9, '10': 'key'},
    const {'1': 'value', '3': 2, '4': 1, '5': 9, '10': 'value'},
  ],
  '7': const {'7': true},
};

const UpdateTodo$json = const {
  '1': 'UpdateTodo',
  '2': const [
    const {'1': 'Id', '3': 1, '4': 1, '5': 3, '10': 'Id'},
    const {'1': 'Title', '3': 2, '4': 1, '5': 9, '10': 'Title'},
    const {'1': 'Order', '3': 3, '4': 1, '5': 5, '10': 'Order'},
    const {'1': 'Completed', '3': 4, '4': 1, '5': 8, '10': 'Completed'},
  ],
};

