/* Options:
Date: 2020-02-02 00:49:56
Version: 5.81
Tip: To override a DTO option, remove "//" prefix before updating
BaseUrl: https://todoworld.servicestack.net

Package: net.servicestack.androidapp
//AddServiceStackTypes: True
//AddResponseStatus: False
//AddImplicitVersion: 
//AddDescriptionAsComments: True
//IncludeTypes: 
//ExcludeTypes: 
//InitializeCollections: True
//TreatTypesAsStrings: 
//DefaultImports: java.math.*,java.util.*,net.servicestack.client.*
*/

package net.servicestack.androidapp

import java.math.*
import java.util.*
import net.servicestack.client.*


@Route("/hello")
// @Route("/hello/{Name}")
@DataContract
open class Hello : IReturn<HelloResponse>
{
    @DataMember(Order=1)
    var name:String? = null
    companion object { private val responseType = HelloResponse::class.java }
    override fun getResponseType(): Any? = Hello.responseType
}

@Route("/hello-secure")
// @Route("/hello-secure/{Name}")
@DataContract
open class HelloSecure : IReturn<HelloResponse>
{
    @DataMember(Order=1)
    var name:String? = null
    companion object { private val responseType = HelloResponse::class.java }
    override fun getResponseType(): Any? = HelloSecure.responseType
}

@Route(Path="/todos/{Id}", Verbs="GET")
@DataContract
open class GetTodo : IReturn<GetTodoResponse>
{
    @DataMember(Order=1)
    var id:Long? = null
    companion object { private val responseType = GetTodoResponse::class.java }
    override fun getResponseType(): Any? = GetTodo.responseType
}

@Route(Path="/todos", Verbs="GET")
@DataContract
open class GetTodos : IReturn<GetTodosResponse>
{
    companion object { private val responseType = GetTodosResponse::class.java }
    override fun getResponseType(): Any? = GetTodos.responseType
}

@Route(Path="/todos", Verbs="POST")
@DataContract
open class CreateTodo : IReturn<CreateTodoResponse>
{
    @DataMember(Order=1)
    var title:String? = null

    @DataMember(Order=2)
    var order:Int? = null
    companion object { private val responseType = CreateTodoResponse::class.java }
    override fun getResponseType(): Any? = CreateTodo.responseType
}

@Route(Path="/todos/{Id}", Verbs="PUT")
@DataContract
open class UpdateTodo : IReturnVoid
{
    @DataMember(Order=1)
    var id:Long? = null

    @DataMember(Order=2)
    var title:String? = null

    @DataMember(Order=3)
    var order:Int? = null

    @DataMember(Order=4)
    var completed:Boolean? = null
}

@Route(Path="/todos/{Id}", Verbs="DELETE")
@DataContract
open class DeleteTodo : IReturnVoid
{
    @DataMember(Order=1)
    var id:Long? = null
}

@Route(Path="/todos", Verbs="DELETE")
@DataContract
open class DeleteTodos : IReturnVoid
{
    @DataMember(Order=1)
    var ids:ArrayList<Long> = ArrayList<Long>()
}

@Route(Path="/todos/reset", Verbs="POST")
@DataContract
open class ResetTodos : IReturnVoid
{
}

@Route("/auth")
// @Route("/auth/{provider}")
@DataContract
open class Authenticate : IReturn<AuthenticateResponse>, IPost
{
    @DataMember(Order=1)
    var provider:String? = null

    @DataMember(Order=2)
    var state:String? = null

    @DataMember(Order=3)
    var oauth_token:String? = null

    @DataMember(Order=4)
    var oauth_verifier:String? = null

    @DataMember(Order=5)
    var userName:String? = null

    @DataMember(Order=6)
    var password:String? = null

    @DataMember(Order=7)
    var rememberMe:Boolean? = null

    @DataMember(Order=9)
    var errorView:String? = null

    @DataMember(Order=10)
    var nonce:String? = null

    @DataMember(Order=11)
    var uri:String? = null

    @DataMember(Order=12)
    var response:String? = null

    @DataMember(Order=13)
    var qop:String? = null

    @DataMember(Order=14)
    var nc:String? = null

    @DataMember(Order=15)
    var cnonce:String? = null

    @DataMember(Order=16)
    var useTokenCookie:Boolean? = null

    @DataMember(Order=17)
    var accessToken:String? = null

    @DataMember(Order=18)
    var accessTokenSecret:String? = null

    @DataMember(Order=19)
    var scope:String? = null

    @DataMember(Order=20)
    var meta:HashMap<String,String> = HashMap<String,String>()
    companion object { private val responseType = AuthenticateResponse::class.java }
    override fun getResponseType(): Any? = Authenticate.responseType
}

@Route("/assignroles")
@DataContract
open class AssignRoles : IReturn<AssignRolesResponse>, IPost
{
    @DataMember(Order=1)
    var userName:String? = null

    @DataMember(Order=2)
    var permissions:ArrayList<String> = ArrayList<String>()

    @DataMember(Order=3)
    var roles:ArrayList<String> = ArrayList<String>()

    @DataMember(Order=4)
    var meta:HashMap<String,String> = HashMap<String,String>()
    companion object { private val responseType = AssignRolesResponse::class.java }
    override fun getResponseType(): Any? = AssignRoles.responseType
}

@Route("/unassignroles")
@DataContract
open class UnAssignRoles : IReturn<UnAssignRolesResponse>, IPost
{
    @DataMember(Order=1)
    var userName:String? = null

    @DataMember(Order=2)
    var permissions:ArrayList<String> = ArrayList<String>()

    @DataMember(Order=3)
    var roles:ArrayList<String> = ArrayList<String>()

    @DataMember(Order=4)
    var meta:HashMap<String,String> = HashMap<String,String>()
    companion object { private val responseType = UnAssignRolesResponse::class.java }
    override fun getResponseType(): Any? = UnAssignRoles.responseType
}

@Route("/session-to-token")
@DataContract
open class ConvertSessionToToken : IReturn<ConvertSessionToTokenResponse>, IPost
{
    @DataMember(Order=1)
    var preserveSession:Boolean? = null

    @DataMember(Order=2)
    var meta:HashMap<String,String> = HashMap<String,String>()
    companion object { private val responseType = ConvertSessionToTokenResponse::class.java }
    override fun getResponseType(): Any? = ConvertSessionToToken.responseType
}

@Route("/access-token")
@DataContract
open class GetAccessToken : IReturn<GetAccessTokenResponse>, IPost
{
    @DataMember(Order=1)
    var refreshToken:String? = null

    @DataMember(Order=2)
    var useTokenCookie:Boolean? = null

    @DataMember(Order=3)
    var meta:HashMap<String,String> = HashMap<String,String>()
    companion object { private val responseType = GetAccessTokenResponse::class.java }
    override fun getResponseType(): Any? = GetAccessToken.responseType
}

@Route("/register")
@DataContract
open class Register : IReturn<RegisterResponse>, IPost
{
    @DataMember(Order=1)
    var userName:String? = null

    @DataMember(Order=2)
    var firstName:String? = null

    @DataMember(Order=3)
    var lastName:String? = null

    @DataMember(Order=4)
    var displayName:String? = null

    @DataMember(Order=5)
    var email:String? = null

    @DataMember(Order=6)
    var password:String? = null

    @DataMember(Order=7)
    var confirmPassword:String? = null

    @DataMember(Order=8)
    var autoLogin:Boolean? = null

    @DataMember(Order=10)
    var errorView:String? = null

    @DataMember(Order=11)
    var meta:HashMap<String,String> = HashMap<String,String>()
    companion object { private val responseType = RegisterResponse::class.java }
    override fun getResponseType(): Any? = Register.responseType
}

@DataContract
open class HelloResponse
{
    @DataMember(Order=1)
    var result:String? = null

    @DataMember(Order=2)
    var responseStatus:ResponseStatus? = null
}

@DataContract
open class GetTodoResponse
{
    @DataMember(Order=1)
    var result:Todo? = null

    @DataMember(Order=2)
    var responseStatus:ResponseStatus? = null
}

@DataContract
open class GetTodosResponse
{
    @DataMember(Order=1)
    var results:ArrayList<Todo> = ArrayList<Todo>()

    @DataMember(Order=2)
    var responseStatus:ResponseStatus? = null
}

@DataContract
open class CreateTodoResponse
{
    @DataMember(Order=1)
    var result:Todo? = null

    @DataMember(Order=2)
    var responseStatus:ResponseStatus? = null
}

@DataContract
open class AuthenticateResponse : IHasSessionId, IHasBearerToken
{
    @DataMember(Order=1)
    var userId:String? = null

    @DataMember(Order=2)
    var sessionId:String? = null

    @DataMember(Order=3)
    var userName:String? = null

    @DataMember(Order=4)
    var displayName:String? = null

    @DataMember(Order=5)
    var referrerUrl:String? = null

    @DataMember(Order=6)
    var bearerToken:String? = null

    @DataMember(Order=7)
    var refreshToken:String? = null

    @DataMember(Order=8)
    var profileUrl:String? = null

    @DataMember(Order=9)
    var roles:ArrayList<String> = ArrayList<String>()

    @DataMember(Order=10)
    var permissions:ArrayList<String> = ArrayList<String>()

    @DataMember(Order=11)
    var responseStatus:ResponseStatus? = null

    @DataMember(Order=12)
    var meta:HashMap<String,String> = HashMap<String,String>()
}

@DataContract
open class AssignRolesResponse
{
    @DataMember(Order=1)
    var allRoles:ArrayList<String> = ArrayList<String>()

    @DataMember(Order=2)
    var allPermissions:ArrayList<String> = ArrayList<String>()

    @DataMember(Order=3)
    var meta:HashMap<String,String> = HashMap<String,String>()

    @DataMember(Order=4)
    var responseStatus:ResponseStatus? = null
}

@DataContract
open class UnAssignRolesResponse
{
    @DataMember(Order=1)
    var allRoles:ArrayList<String> = ArrayList<String>()

    @DataMember(Order=2)
    var allPermissions:ArrayList<String> = ArrayList<String>()

    @DataMember(Order=3)
    var meta:HashMap<String,String> = HashMap<String,String>()

    @DataMember(Order=4)
    var responseStatus:ResponseStatus? = null
}

@DataContract
open class ConvertSessionToTokenResponse
{
    @DataMember(Order=1)
    var meta:HashMap<String,String> = HashMap<String,String>()

    @DataMember(Order=2)
    var accessToken:String? = null

    @DataMember(Order=3)
    var refreshToken:String? = null

    @DataMember(Order=4)
    var responseStatus:ResponseStatus? = null
}

@DataContract
open class GetAccessTokenResponse
{
    @DataMember(Order=1)
    var accessToken:String? = null

    @DataMember(Order=2)
    var meta:HashMap<String,String> = HashMap<String,String>()

    @DataMember(Order=3)
    var responseStatus:ResponseStatus? = null
}

@DataContract
open class RegisterResponse
{
    @DataMember(Order=1)
    var userId:String? = null

    @DataMember(Order=2)
    var sessionId:String? = null

    @DataMember(Order=3)
    var userName:String? = null

    @DataMember(Order=4)
    var referrerUrl:String? = null

    @DataMember(Order=5)
    var bearerToken:String? = null

    @DataMember(Order=6)
    var refreshToken:String? = null

    @DataMember(Order=7)
    var responseStatus:ResponseStatus? = null

    @DataMember(Order=8)
    var meta:HashMap<String,String> = HashMap<String,String>()
}

@DataContract
open class Todo
{
    @DataMember(Order=1)
    var id:Long? = null

    @DataMember(Order=2)
    var title:String? = null

    @DataMember(Order=3)
    var order:Int? = null

    @DataMember(Order=4)
    var completed:Boolean? = null
}
