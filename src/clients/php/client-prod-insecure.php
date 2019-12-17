<?php

require dirname(__FILE__).'/vendor/autoload.php';

@include_once dirname(__FILE__).'/GPBMetadata/Services.php';
@include_once dirname(__FILE__).'/TodoWorld/GrpcServicesClient.php';
@include_once dirname(__FILE__).'/TodoWorld/EmptyResponse.php';

@include_once dirname(__FILE__).'/TodoWorld/Hello.php';
@include_once dirname(__FILE__).'/TodoWorld/HelloResponse.php';

@include_once dirname(__FILE__).'/TodoWorld/Todo.php';
@include_once dirname(__FILE__).'/TodoWorld/ResetTodos.php';
@include_once dirname(__FILE__).'/TodoWorld/CreateTodo.php';
@include_once dirname(__FILE__).'/TodoWorld/CreateTodoResponse.php';
@include_once dirname(__FILE__).'/TodoWorld/GetTodo.php';
@include_once dirname(__FILE__).'/TodoWorld/GetTodoResponse.php';
@include_once dirname(__FILE__).'/TodoWorld/GetTodos.php';
@include_once dirname(__FILE__).'/TodoWorld/GetTodosResponse.php';
@include_once dirname(__FILE__).'/TodoWorld/UpdateTodo.php';
@include_once dirname(__FILE__).'/TodoWorld/UpdateTodoResponse.php';
@include_once dirname(__FILE__).'/TodoWorld/DeleteTodo.php';
@include_once dirname(__FILE__).'/TodoWorld/DeleteTodoResponse.php';

$client = new TodoWorld\GrpcServicesClient('todoworld.servicestack.net:5054', [
    'credentials' => Grpc\ChannelCredentials::createInsecure(),
]);

global $client;
function client() { return $GLOBALS['client']; }

function assertStatus($status)
{
    if ($status->code !== Grpc\STATUS_OK) {
        echo "Call did not complete successfully. Status object:\n";
        var_dump($status);
        exit(1);
    }
}

function hello($name) 
{
    $request = new TodoWorld\Hello();
    $request->setName($name);
    list($reply, $status) = client()->GetHello($request)->wait();
    assertStatus($status);
    return $reply->getResult();
}
// echo hello("World") . "\n";

list($reply, $status) = $client->PostResetTodos(new TodoWorld\ResetTodos())->wait();
assertStatus($status);

//POST /todos
$request = new TodoWorld\CreateTodo();
$request->setTitle("ServiceStack");
list($reply, $status) = $client->PostCreateTodo($request)->wait();
assertStatus($status);
$todo = $reply->getResult();
echo "new todo Id: " . $todo->getId() . ", Title: " . $todo->getTitle() . "\n";

//GET /todos
list($reply, $status) = $client->CallGetTodos(new TodoWorld\GetTodos())->wait();
assertStatus($status);
echo "todos: " . count($reply->getResults())  . "\n";

//GET /todos/1
$request = new TodoWorld\GetTodo();
$request->setId($todo->getId());
list($reply, $status) = $client->CallGetTodo($request)->wait();
assertStatus($status);
$todo = $reply->getResult();
echo "get todo Id: " . $todo->getId() . ", Title: " . $todo->getTitle() . "\n";

//PUT /todos/1
$request = new TodoWorld\UpdateTodo();
$request->setId($todo->getId());
$request->setTitle("gRPC");
list($reply, $status) = $client->PutUpdateTodo($request)->wait();
assertStatus($status);

//GET /todos/1
$request = new TodoWorld\GetTodo();
$request->setId($todo->getId());
list($reply, $status) = $client->CallGetTodo($request)->wait();
assertStatus($status);
$todo = $reply->getResult();
echo "get todo Id: " . $todo->getId() . ", Title: " . $todo->getTitle() . "\n";

//DELETE /todos/1
$request = new TodoWorld\DeleteTodo();
$request->setId($todo->getId());
list($reply, $status) = $client->CallDeleteTodo($request)->wait();
assertStatus($status);

//GET /todos
list($reply, $status) = $client->CallGetTodos(new TodoWorld\GetTodos())->wait();
assertStatus($status);
echo "todos: " . count($reply->getResults())  . "\n";
