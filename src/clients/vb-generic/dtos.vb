' Options:
'Date: 2019-11-12 03:46:08
'Version: 5.71
'Tip: To override a DTO option, remove "''" prefix before updating
'BaseUrl: https://localhost:5001
'
'''GlobalNamespace: 
'''MakePartial: True
'''MakeVirtual: True
'''MakeDataContractsExtensible: False
'''AddReturnMarker: True
'''AddDescriptionAsComments: True
'''AddDataContractAttributes: False
'''AddIndexesToDataMembers: False
'''AddGeneratedCodeAttributes: False
'''AddResponseStatus: False
'''AddImplicitVersion: 
'''InitializeCollections: True
'''ExportValueTypes: False
'''IncludeTypes: 
'''ExcludeTypes: 
'''AddNamespaces: 
'''AddDefaultXmlNamespace: http://schemas.servicestack.net/types

Imports System
Imports System.Collections
Imports System.Collections.Generic
Imports System.Runtime.Serialization
Imports ServiceStack
Imports ServiceStack.DataAnnotations
Imports TodoWorld.ServiceModel.Types
Imports TodoWorld.ServiceModel

Namespace Global

    Namespace TodoWorld.ServiceModel

        <Route("/todos", "POST")>
        <DataContract>
        Public Partial Class CreateTodo
            Implements IReturn(Of CreateTodoResponse)
            <DataMember(Order:=1)>
            Public Overridable Property Title As String

            <DataMember(Order:=2)>
            Public Overridable Property Order As Integer
        End Class

        <DataContract>
        Public Partial Class CreateTodoResponse
            <DataMember(Order:=1)>
            Public Overridable Property Result As Todo

            <DataMember(Order:=2)>
            Public Overridable Property ResponseStatus As ResponseStatus
        End Class

        <Route("/todos/{Id}", "DELETE")>
        <DataContract>
        Public Partial Class DeleteTodo
            Implements IReturnVoid
            <DataMember(Order:=1)>
            Public Overridable Property Id As Long
        End Class

        <Route("/todos", "DELETE")>
        <DataContract>
        Public Partial Class DeleteTodos
            Implements IReturnVoid
            Public Sub New()
                Ids = New List(Of Long)
            End Sub

            <DataMember(Order:=1)>
            Public Overridable Property Ids As List(Of Long)
        End Class

        <Route("/todos/{Id}", "GET")>
        <DataContract>
        Public Partial Class GetTodo
            Implements IReturn(Of GetTodoResponse)
            <DataMember(Order:=1)>
            Public Overridable Property Id As Long
        End Class

        <DataContract>
        Public Partial Class GetTodoResponse
            <DataMember(Order:=1)>
            Public Overridable Property Result As Todo

            <DataMember(Order:=2)>
            Public Overridable Property ResponseStatus As ResponseStatus
        End Class

        <Route("/todos", "GET")>
        <DataContract>
        Public Partial Class GetTodos
            Implements IReturn(Of GetTodosResponse)
        End Class

        <DataContract>
        Public Partial Class GetTodosResponse
            Public Sub New()
                Results = New List(Of Todo)
            End Sub

            <DataMember(Order:=1)>
            Public Overridable Property Results As List(Of Todo)

            <DataMember(Order:=2)>
            Public Overridable Property ResponseStatus As ResponseStatus
        End Class

        <Route("/hello")>
        <Route("/hello/{Name}")>
        <DataContract>
        Public Partial Class Hello
            Implements IReturn(Of HelloResponse)
            <DataMember(Order:=1)>
            Public Overridable Property Name As String
        End Class

        <DataContract>
        Public Partial Class HelloResponse
            <DataMember(Order:=1)>
            Public Overridable Property Result As String

            <DataMember(Order:=2)>
            Public Overridable Property ResponseStatus As ResponseStatus
        End Class

        <Route("/hello-secure")>
        <Route("/hello-secure/{Name}")>
        <DataContract>
        Public Partial Class HelloSecure
            Implements IReturn(Of HelloResponse)
            <DataMember(Order:=1)>
            Public Overridable Property Name As String
        End Class

        <Route("/todos/reset", "POST")>
        <DataContract>
        Public Partial Class ResetTodos
            Implements IReturnVoid
        End Class

        <Route("/todos/{Id}", "PUT")>
        <DataContract>
        Public Partial Class UpdateTodo
            Implements IReturnVoid
            <DataMember(Order:=1)>
            Public Overridable Property Id As Long

            <DataMember(Order:=2)>
            Public Overridable Property Title As String

            <DataMember(Order:=3)>
            Public Overridable Property Order As Integer

            <DataMember(Order:=4)>
            Public Overridable Property Completed As Boolean
        End Class
    End Namespace

    Namespace TodoWorld.ServiceModel.Types

        <DataContract>
        Public Partial Class Todo
            <DataMember(Order:=1)>
            Public Overridable Property Id As Long

            <DataMember(Order:=2)>
            Public Overridable Property Title As String

            <DataMember(Order:=3)>
            Public Overridable Property Order As Integer

            <DataMember(Order:=4)>
            Public Overridable Property Completed As Boolean
        End Class
    End Namespace
End Namespace

