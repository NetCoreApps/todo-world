/* Options:
Date: 2020-02-02 04:15:35
Version: 5.81
Tip: To override a DTO option, remove "//" prefix before updating
BaseUrl: https://todoworld.servicestack.net

Package: net.servicestack.androidapp
GlobalNamespace: dtos
//AddPropertyAccessors: True
//SettersReturnThis: True
//AddServiceStackTypes: True
//AddResponseStatus: False
//AddDescriptionAsComments: True
//AddImplicitVersion: 
//IncludeTypes: 
//ExcludeTypes: 
//TreatTypesAsStrings: 
//DefaultImports: java.math.*,java.util.*,net.servicestack.client.*
*/

package net.servicestack.androidapp;

import java.math.*;
import java.util.*;
import net.servicestack.client.*;

public class dtos
{

    @Route("/hello")
    // @Route("/hello/{Name}")
    @DataContract
    public static class Hello implements IReturn<HelloResponse>
    {
        @DataMember(Order=1)
        public String name = null;
        
        public String getName() { return name; }
        public Hello setName(String value) { this.name = value; return this; }
        private static Object responseType = HelloResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route("/hello-secure")
    // @Route("/hello-secure/{Name}")
    @DataContract
    public static class HelloSecure implements IReturn<HelloResponse>
    {
        @DataMember(Order=1)
        public String name = null;
        
        public String getName() { return name; }
        public HelloSecure setName(String value) { this.name = value; return this; }
        private static Object responseType = HelloResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/todos/{Id}", Verbs="GET")
    @DataContract
    public static class GetTodo implements IReturn<GetTodoResponse>
    {
        @DataMember(Order=1)
        public Long id = null;
        
        public Long getId() { return id; }
        public GetTodo setId(Long value) { this.id = value; return this; }
        private static Object responseType = GetTodoResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/todos", Verbs="GET")
    @DataContract
    public static class GetTodos implements IReturn<GetTodosResponse>
    {
        
        private static Object responseType = GetTodosResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/todos", Verbs="POST")
    @DataContract
    public static class CreateTodo implements IReturn<CreateTodoResponse>
    {
        @DataMember(Order=1)
        public String title = null;

        @DataMember(Order=2)
        public Integer order = null;
        
        public String getTitle() { return title; }
        public CreateTodo setTitle(String value) { this.title = value; return this; }
        public Integer getOrder() { return order; }
        public CreateTodo setOrder(Integer value) { this.order = value; return this; }
        private static Object responseType = CreateTodoResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/todos/{Id}", Verbs="PUT")
    @DataContract
    public static class UpdateTodo implements IReturnVoid
    {
        @DataMember(Order=1)
        public Long id = null;

        @DataMember(Order=2)
        public String title = null;

        @DataMember(Order=3)
        public Integer order = null;

        @DataMember(Order=4)
        public Boolean completed = null;
        
        public Long getId() { return id; }
        public UpdateTodo setId(Long value) { this.id = value; return this; }
        public String getTitle() { return title; }
        public UpdateTodo setTitle(String value) { this.title = value; return this; }
        public Integer getOrder() { return order; }
        public UpdateTodo setOrder(Integer value) { this.order = value; return this; }
        public Boolean isCompleted() { return completed; }
        public UpdateTodo setCompleted(Boolean value) { this.completed = value; return this; }
    }

    @Route(Path="/todos/{Id}", Verbs="DELETE")
    @DataContract
    public static class DeleteTodo implements IReturnVoid
    {
        @DataMember(Order=1)
        public Long id = null;
        
        public Long getId() { return id; }
        public DeleteTodo setId(Long value) { this.id = value; return this; }
    }

    @Route(Path="/todos", Verbs="DELETE")
    @DataContract
    public static class DeleteTodos implements IReturnVoid
    {
        @DataMember(Order=1)
        public ArrayList<Long> ids = null;
        
        public ArrayList<Long> getIds() { return ids; }
        public DeleteTodos setIds(ArrayList<Long> value) { this.ids = value; return this; }
    }

    @Route(Path="/todos/reset", Verbs="POST")
    @DataContract
    public static class ResetTodos implements IReturnVoid
    {
        
    }

    @Route("/auth")
    // @Route("/auth/{provider}")
    @DataContract
    public static class Authenticate implements IReturn<AuthenticateResponse>, IPost
    {
        @DataMember(Order=1)
        public String provider = null;

        @DataMember(Order=2)
        public String state = null;

        @DataMember(Order=3)
        public String oauth_token = null;

        @DataMember(Order=4)
        public String oauth_verifier = null;

        @DataMember(Order=5)
        public String userName = null;

        @DataMember(Order=6)
        public String password = null;

        @DataMember(Order=7)
        public Boolean rememberMe = null;

        @DataMember(Order=9)
        public String errorView = null;

        @DataMember(Order=10)
        public String nonce = null;

        @DataMember(Order=11)
        public String uri = null;

        @DataMember(Order=12)
        public String response = null;

        @DataMember(Order=13)
        public String qop = null;

        @DataMember(Order=14)
        public String nc = null;

        @DataMember(Order=15)
        public String cnonce = null;

        @DataMember(Order=16)
        public Boolean useTokenCookie = null;

        @DataMember(Order=17)
        public String accessToken = null;

        @DataMember(Order=18)
        public String accessTokenSecret = null;

        @DataMember(Order=19)
        public String scope = null;

        @DataMember(Order=20)
        public HashMap<String,String> meta = null;
        
        public String getProvider() { return provider; }
        public Authenticate setProvider(String value) { this.provider = value; return this; }
        public String getState() { return state; }
        public Authenticate setState(String value) { this.state = value; return this; }
        public String getOauthToken() { return oauth_token; }
        public Authenticate setOauthToken(String value) { this.oauth_token = value; return this; }
        public String getOauthVerifier() { return oauth_verifier; }
        public Authenticate setOauthVerifier(String value) { this.oauth_verifier = value; return this; }
        public String getUserName() { return userName; }
        public Authenticate setUserName(String value) { this.userName = value; return this; }
        public String getPassword() { return password; }
        public Authenticate setPassword(String value) { this.password = value; return this; }
        public Boolean isRememberMe() { return rememberMe; }
        public Authenticate setRememberMe(Boolean value) { this.rememberMe = value; return this; }
        public String getErrorView() { return errorView; }
        public Authenticate setErrorView(String value) { this.errorView = value; return this; }
        public String getNonce() { return nonce; }
        public Authenticate setNonce(String value) { this.nonce = value; return this; }
        public String getUri() { return uri; }
        public Authenticate setUri(String value) { this.uri = value; return this; }
        public String getResponse() { return response; }
        public Authenticate setResponse(String value) { this.response = value; return this; }
        public String getQop() { return qop; }
        public Authenticate setQop(String value) { this.qop = value; return this; }
        public String getNc() { return nc; }
        public Authenticate setNc(String value) { this.nc = value; return this; }
        public String getCnonce() { return cnonce; }
        public Authenticate setCnonce(String value) { this.cnonce = value; return this; }
        public Boolean isUseTokenCookie() { return useTokenCookie; }
        public Authenticate setUseTokenCookie(Boolean value) { this.useTokenCookie = value; return this; }
        public String getAccessToken() { return accessToken; }
        public Authenticate setAccessToken(String value) { this.accessToken = value; return this; }
        public String getAccessTokenSecret() { return accessTokenSecret; }
        public Authenticate setAccessTokenSecret(String value) { this.accessTokenSecret = value; return this; }
        public String getScope() { return scope; }
        public Authenticate setScope(String value) { this.scope = value; return this; }
        public HashMap<String,String> getMeta() { return meta; }
        public Authenticate setMeta(HashMap<String,String> value) { this.meta = value; return this; }
        private static Object responseType = AuthenticateResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route("/assignroles")
    @DataContract
    public static class AssignRoles implements IReturn<AssignRolesResponse>, IPost
    {
        @DataMember(Order=1)
        public String userName = null;

        @DataMember(Order=2)
        public ArrayList<String> permissions = null;

        @DataMember(Order=3)
        public ArrayList<String> roles = null;

        @DataMember(Order=4)
        public HashMap<String,String> meta = null;
        
        public String getUserName() { return userName; }
        public AssignRoles setUserName(String value) { this.userName = value; return this; }
        public ArrayList<String> getPermissions() { return permissions; }
        public AssignRoles setPermissions(ArrayList<String> value) { this.permissions = value; return this; }
        public ArrayList<String> getRoles() { return roles; }
        public AssignRoles setRoles(ArrayList<String> value) { this.roles = value; return this; }
        public HashMap<String,String> getMeta() { return meta; }
        public AssignRoles setMeta(HashMap<String,String> value) { this.meta = value; return this; }
        private static Object responseType = AssignRolesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route("/unassignroles")
    @DataContract
    public static class UnAssignRoles implements IReturn<UnAssignRolesResponse>, IPost
    {
        @DataMember(Order=1)
        public String userName = null;

        @DataMember(Order=2)
        public ArrayList<String> permissions = null;

        @DataMember(Order=3)
        public ArrayList<String> roles = null;

        @DataMember(Order=4)
        public HashMap<String,String> meta = null;
        
        public String getUserName() { return userName; }
        public UnAssignRoles setUserName(String value) { this.userName = value; return this; }
        public ArrayList<String> getPermissions() { return permissions; }
        public UnAssignRoles setPermissions(ArrayList<String> value) { this.permissions = value; return this; }
        public ArrayList<String> getRoles() { return roles; }
        public UnAssignRoles setRoles(ArrayList<String> value) { this.roles = value; return this; }
        public HashMap<String,String> getMeta() { return meta; }
        public UnAssignRoles setMeta(HashMap<String,String> value) { this.meta = value; return this; }
        private static Object responseType = UnAssignRolesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route("/session-to-token")
    @DataContract
    public static class ConvertSessionToToken implements IReturn<ConvertSessionToTokenResponse>, IPost
    {
        @DataMember(Order=1)
        public Boolean preserveSession = null;

        @DataMember(Order=2)
        public HashMap<String,String> meta = null;
        
        public Boolean isPreserveSession() { return preserveSession; }
        public ConvertSessionToToken setPreserveSession(Boolean value) { this.preserveSession = value; return this; }
        public HashMap<String,String> getMeta() { return meta; }
        public ConvertSessionToToken setMeta(HashMap<String,String> value) { this.meta = value; return this; }
        private static Object responseType = ConvertSessionToTokenResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route("/access-token")
    @DataContract
    public static class GetAccessToken implements IReturn<GetAccessTokenResponse>, IPost
    {
        @DataMember(Order=1)
        public String refreshToken = null;

        @DataMember(Order=2)
        public Boolean useTokenCookie = null;

        @DataMember(Order=3)
        public HashMap<String,String> meta = null;
        
        public String getRefreshToken() { return refreshToken; }
        public GetAccessToken setRefreshToken(String value) { this.refreshToken = value; return this; }
        public Boolean isUseTokenCookie() { return useTokenCookie; }
        public GetAccessToken setUseTokenCookie(Boolean value) { this.useTokenCookie = value; return this; }
        public HashMap<String,String> getMeta() { return meta; }
        public GetAccessToken setMeta(HashMap<String,String> value) { this.meta = value; return this; }
        private static Object responseType = GetAccessTokenResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route("/register")
    @DataContract
    public static class Register implements IReturn<RegisterResponse>, IPost
    {
        @DataMember(Order=1)
        public String userName = null;

        @DataMember(Order=2)
        public String firstName = null;

        @DataMember(Order=3)
        public String lastName = null;

        @DataMember(Order=4)
        public String displayName = null;

        @DataMember(Order=5)
        public String email = null;

        @DataMember(Order=6)
        public String password = null;

        @DataMember(Order=7)
        public String confirmPassword = null;

        @DataMember(Order=8)
        public Boolean autoLogin = null;

        @DataMember(Order=10)
        public String errorView = null;

        @DataMember(Order=11)
        public HashMap<String,String> meta = null;
        
        public String getUserName() { return userName; }
        public Register setUserName(String value) { this.userName = value; return this; }
        public String getFirstName() { return firstName; }
        public Register setFirstName(String value) { this.firstName = value; return this; }
        public String getLastName() { return lastName; }
        public Register setLastName(String value) { this.lastName = value; return this; }
        public String getDisplayName() { return displayName; }
        public Register setDisplayName(String value) { this.displayName = value; return this; }
        public String getEmail() { return email; }
        public Register setEmail(String value) { this.email = value; return this; }
        public String getPassword() { return password; }
        public Register setPassword(String value) { this.password = value; return this; }
        public String getConfirmPassword() { return confirmPassword; }
        public Register setConfirmPassword(String value) { this.confirmPassword = value; return this; }
        public Boolean isAutoLogin() { return autoLogin; }
        public Register setAutoLogin(Boolean value) { this.autoLogin = value; return this; }
        public String getErrorView() { return errorView; }
        public Register setErrorView(String value) { this.errorView = value; return this; }
        public HashMap<String,String> getMeta() { return meta; }
        public Register setMeta(HashMap<String,String> value) { this.meta = value; return this; }
        private static Object responseType = RegisterResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @DataContract
    public static class HelloResponse
    {
        @DataMember(Order=1)
        public String result = null;

        @DataMember(Order=2)
        public ResponseStatus responseStatus = null;
        
        public String getResult() { return result; }
        public HelloResponse setResult(String value) { this.result = value; return this; }
        public ResponseStatus getResponseStatus() { return responseStatus; }
        public HelloResponse setResponseStatus(ResponseStatus value) { this.responseStatus = value; return this; }
    }

    @DataContract
    public static class GetTodoResponse
    {
        @DataMember(Order=1)
        public Todo result = null;

        @DataMember(Order=2)
        public ResponseStatus responseStatus = null;
        
        public Todo getResult() { return result; }
        public GetTodoResponse setResult(Todo value) { this.result = value; return this; }
        public ResponseStatus getResponseStatus() { return responseStatus; }
        public GetTodoResponse setResponseStatus(ResponseStatus value) { this.responseStatus = value; return this; }
    }

    @DataContract
    public static class GetTodosResponse
    {
        @DataMember(Order=1)
        public ArrayList<Todo> results = null;

        @DataMember(Order=2)
        public ResponseStatus responseStatus = null;
        
        public ArrayList<Todo> getResults() { return results; }
        public GetTodosResponse setResults(ArrayList<Todo> value) { this.results = value; return this; }
        public ResponseStatus getResponseStatus() { return responseStatus; }
        public GetTodosResponse setResponseStatus(ResponseStatus value) { this.responseStatus = value; return this; }
    }

    @DataContract
    public static class CreateTodoResponse
    {
        @DataMember(Order=1)
        public Todo result = null;

        @DataMember(Order=2)
        public ResponseStatus responseStatus = null;
        
        public Todo getResult() { return result; }
        public CreateTodoResponse setResult(Todo value) { this.result = value; return this; }
        public ResponseStatus getResponseStatus() { return responseStatus; }
        public CreateTodoResponse setResponseStatus(ResponseStatus value) { this.responseStatus = value; return this; }
    }

    @DataContract
    public static class AuthenticateResponse implements IHasSessionId, IHasBearerToken
    {
        @DataMember(Order=1)
        public String userId = null;

        @DataMember(Order=2)
        public String sessionId = null;

        @DataMember(Order=3)
        public String userName = null;

        @DataMember(Order=4)
        public String displayName = null;

        @DataMember(Order=5)
        public String referrerUrl = null;

        @DataMember(Order=6)
        public String bearerToken = null;

        @DataMember(Order=7)
        public String refreshToken = null;

        @DataMember(Order=8)
        public String profileUrl = null;

        @DataMember(Order=9)
        public ArrayList<String> roles = null;

        @DataMember(Order=10)
        public ArrayList<String> permissions = null;

        @DataMember(Order=11)
        public ResponseStatus responseStatus = null;

        @DataMember(Order=12)
        public HashMap<String,String> meta = null;
        
        public String getUserId() { return userId; }
        public AuthenticateResponse setUserId(String value) { this.userId = value; return this; }
        public String getSessionId() { return sessionId; }
        public AuthenticateResponse setSessionId(String value) { this.sessionId = value; return this; }
        public String getUserName() { return userName; }
        public AuthenticateResponse setUserName(String value) { this.userName = value; return this; }
        public String getDisplayName() { return displayName; }
        public AuthenticateResponse setDisplayName(String value) { this.displayName = value; return this; }
        public String getReferrerUrl() { return referrerUrl; }
        public AuthenticateResponse setReferrerUrl(String value) { this.referrerUrl = value; return this; }
        public String getBearerToken() { return bearerToken; }
        public AuthenticateResponse setBearerToken(String value) { this.bearerToken = value; return this; }
        public String getRefreshToken() { return refreshToken; }
        public AuthenticateResponse setRefreshToken(String value) { this.refreshToken = value; return this; }
        public String getProfileUrl() { return profileUrl; }
        public AuthenticateResponse setProfileUrl(String value) { this.profileUrl = value; return this; }
        public ArrayList<String> getRoles() { return roles; }
        public AuthenticateResponse setRoles(ArrayList<String> value) { this.roles = value; return this; }
        public ArrayList<String> getPermissions() { return permissions; }
        public AuthenticateResponse setPermissions(ArrayList<String> value) { this.permissions = value; return this; }
        public ResponseStatus getResponseStatus() { return responseStatus; }
        public AuthenticateResponse setResponseStatus(ResponseStatus value) { this.responseStatus = value; return this; }
        public HashMap<String,String> getMeta() { return meta; }
        public AuthenticateResponse setMeta(HashMap<String,String> value) { this.meta = value; return this; }
    }

    @DataContract
    public static class AssignRolesResponse
    {
        @DataMember(Order=1)
        public ArrayList<String> allRoles = null;

        @DataMember(Order=2)
        public ArrayList<String> allPermissions = null;

        @DataMember(Order=3)
        public HashMap<String,String> meta = null;

        @DataMember(Order=4)
        public ResponseStatus responseStatus = null;
        
        public ArrayList<String> getAllRoles() { return allRoles; }
        public AssignRolesResponse setAllRoles(ArrayList<String> value) { this.allRoles = value; return this; }
        public ArrayList<String> getAllPermissions() { return allPermissions; }
        public AssignRolesResponse setAllPermissions(ArrayList<String> value) { this.allPermissions = value; return this; }
        public HashMap<String,String> getMeta() { return meta; }
        public AssignRolesResponse setMeta(HashMap<String,String> value) { this.meta = value; return this; }
        public ResponseStatus getResponseStatus() { return responseStatus; }
        public AssignRolesResponse setResponseStatus(ResponseStatus value) { this.responseStatus = value; return this; }
    }

    @DataContract
    public static class UnAssignRolesResponse
    {
        @DataMember(Order=1)
        public ArrayList<String> allRoles = null;

        @DataMember(Order=2)
        public ArrayList<String> allPermissions = null;

        @DataMember(Order=3)
        public HashMap<String,String> meta = null;

        @DataMember(Order=4)
        public ResponseStatus responseStatus = null;
        
        public ArrayList<String> getAllRoles() { return allRoles; }
        public UnAssignRolesResponse setAllRoles(ArrayList<String> value) { this.allRoles = value; return this; }
        public ArrayList<String> getAllPermissions() { return allPermissions; }
        public UnAssignRolesResponse setAllPermissions(ArrayList<String> value) { this.allPermissions = value; return this; }
        public HashMap<String,String> getMeta() { return meta; }
        public UnAssignRolesResponse setMeta(HashMap<String,String> value) { this.meta = value; return this; }
        public ResponseStatus getResponseStatus() { return responseStatus; }
        public UnAssignRolesResponse setResponseStatus(ResponseStatus value) { this.responseStatus = value; return this; }
    }

    @DataContract
    public static class ConvertSessionToTokenResponse
    {
        @DataMember(Order=1)
        public HashMap<String,String> meta = null;

        @DataMember(Order=2)
        public String accessToken = null;

        @DataMember(Order=3)
        public String refreshToken = null;

        @DataMember(Order=4)
        public ResponseStatus responseStatus = null;
        
        public HashMap<String,String> getMeta() { return meta; }
        public ConvertSessionToTokenResponse setMeta(HashMap<String,String> value) { this.meta = value; return this; }
        public String getAccessToken() { return accessToken; }
        public ConvertSessionToTokenResponse setAccessToken(String value) { this.accessToken = value; return this; }
        public String getRefreshToken() { return refreshToken; }
        public ConvertSessionToTokenResponse setRefreshToken(String value) { this.refreshToken = value; return this; }
        public ResponseStatus getResponseStatus() { return responseStatus; }
        public ConvertSessionToTokenResponse setResponseStatus(ResponseStatus value) { this.responseStatus = value; return this; }
    }

    @DataContract
    public static class GetAccessTokenResponse
    {
        @DataMember(Order=1)
        public String accessToken = null;

        @DataMember(Order=2)
        public HashMap<String,String> meta = null;

        @DataMember(Order=3)
        public ResponseStatus responseStatus = null;
        
        public String getAccessToken() { return accessToken; }
        public GetAccessTokenResponse setAccessToken(String value) { this.accessToken = value; return this; }
        public HashMap<String,String> getMeta() { return meta; }
        public GetAccessTokenResponse setMeta(HashMap<String,String> value) { this.meta = value; return this; }
        public ResponseStatus getResponseStatus() { return responseStatus; }
        public GetAccessTokenResponse setResponseStatus(ResponseStatus value) { this.responseStatus = value; return this; }
    }

    @DataContract
    public static class RegisterResponse
    {
        @DataMember(Order=1)
        public String userId = null;

        @DataMember(Order=2)
        public String sessionId = null;

        @DataMember(Order=3)
        public String userName = null;

        @DataMember(Order=4)
        public String referrerUrl = null;

        @DataMember(Order=5)
        public String bearerToken = null;

        @DataMember(Order=6)
        public String refreshToken = null;

        @DataMember(Order=7)
        public ResponseStatus responseStatus = null;

        @DataMember(Order=8)
        public HashMap<String,String> meta = null;
        
        public String getUserId() { return userId; }
        public RegisterResponse setUserId(String value) { this.userId = value; return this; }
        public String getSessionId() { return sessionId; }
        public RegisterResponse setSessionId(String value) { this.sessionId = value; return this; }
        public String getUserName() { return userName; }
        public RegisterResponse setUserName(String value) { this.userName = value; return this; }
        public String getReferrerUrl() { return referrerUrl; }
        public RegisterResponse setReferrerUrl(String value) { this.referrerUrl = value; return this; }
        public String getBearerToken() { return bearerToken; }
        public RegisterResponse setBearerToken(String value) { this.bearerToken = value; return this; }
        public String getRefreshToken() { return refreshToken; }
        public RegisterResponse setRefreshToken(String value) { this.refreshToken = value; return this; }
        public ResponseStatus getResponseStatus() { return responseStatus; }
        public RegisterResponse setResponseStatus(ResponseStatus value) { this.responseStatus = value; return this; }
        public HashMap<String,String> getMeta() { return meta; }
        public RegisterResponse setMeta(HashMap<String,String> value) { this.meta = value; return this; }
    }

    @DataContract
    public static class Todo
    {
        @DataMember(Order=1)
        public Long id = null;

        @DataMember(Order=2)
        public String title = null;

        @DataMember(Order=3)
        public Integer order = null;

        @DataMember(Order=4)
        public Boolean completed = null;
        
        public Long getId() { return id; }
        public Todo setId(Long value) { this.id = value; return this; }
        public String getTitle() { return title; }
        public Todo setTitle(String value) { this.title = value; return this; }
        public Integer getOrder() { return order; }
        public Todo setOrder(Integer value) { this.order = value; return this; }
        public Boolean isCompleted() { return completed; }
        public Todo setCompleted(Boolean value) { this.completed = value; return this; }
    }

}
