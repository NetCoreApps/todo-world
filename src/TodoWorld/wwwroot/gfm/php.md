
## PHP Google protoc generated GrpcServiceClient Example

### Prerequisites

This requires `php` >= 5.5, `pecl`, `composer`

Install the `grpc` extension:

    $ [sudo] pecl install grpc
   
### Setup for Windows

#### gRPC PECL Download for Windows

https://windows.php.net/downloads/pecl/releases/grpc/

The PHP extension filename is in the following format:

    php_grpc-{GRPC_VERSION}-{PHP_VERSION}-{THREAD_SAFETY}-{VC++_RUNTIME}-{CPU_ARCH}.zip

Select appropriate version for your OS and copy to `{PHP_HOME}\ext`, then modify your **php.ini** file to include `extension=grpc`.

### Getting Started

Install [x dotnet tool](https://docs.servicestack.net/web-tool):
    
    $ dotnet tool install --global x 

Add required dependencies to **composer.json**:

```json
{
  "name": "servicestack/grpc-todoworld",
  "description": "Simple TodoWorld demo of using gRPC from PHP",
  "require": {
    "grpc/grpc": "^v1.3.0",
    "google/protobuf": "^v3.3.0"
  },
  "autoload": {
    "psr-4": {
      "": "route_guide/"
    }
  }
}
```

Install dependencies:

    $ composer install
    
Add protoc generated TodoWorld DTOs and gRPC GrpcServiceClient:

    $ x proto-php https://todoworld.servicestack.net

### PHP protoc gRPC insecure Example

Use protoc generated DTOs and `GrpcServiceClient` to call TodoWorld gRPC Service in `main.php`:

```php
<?php

require dirname(__FILE__).'/vendor/autoload.php';
@include_once dirname(__FILE__).'/GPBMetadata/Services.php';
@include_once dirname(__FILE__).'/TodoWorld/GrpcServicesClient.php';
@include_once dirname(__FILE__).'/TodoWorld/Hello.php';
@include_once dirname(__FILE__).'/TodoWorld/HelloResponse.php';

$client = new TodoWorld\GrpcServicesClient('todoworld.servicestack.net:5054', [
    'credentials' => Grpc\ChannelCredentials::createInsecure(),
]);

$request = new TodoWorld\Hello();
$request->setName("gRPC PHP");
list($reply, $status) = $client->GetHello($request)->wait();
if ($status->code !== Grpc\STATUS_OK) {
    echo "Call did not complete successfully. Status object:\n";
    var_dump($status);
    exit(1);
}
echo $reply->getResult();
```

Override `main.php` with the above PHP Example: 

    $ x mix todoworld-php

Run example:

    $ php main.php

### PHP protoc gRPC SSL Example

Download TodoWorld SSL Certificate used for its gRPC HTTP/2 Services:

    $ x get https://todoworld.servicestack.net/grpc.crt 

Use certificate when initializing `GrpcServicesClient`:

```php
<?php

require dirname(__FILE__).'/vendor/autoload.php';
@include_once dirname(__FILE__).'/GPBMetadata/Services.php';
@include_once dirname(__FILE__).'/TodoWorld/GrpcServicesClient.php';
@include_once dirname(__FILE__).'/TodoWorld/Hello.php';
@include_once dirname(__FILE__).'/TodoWorld/HelloResponse.php';

$client = new TodoWorld\GrpcServicesClient('todoworld.servicestack.net:50051', [
    'credentials' => Grpc\ChannelCredentials::createSsl(file_get_contents('grpc.crt')),
]);

$request = new TodoWorld\Hello();
$request->setName("gRPC PHP");
list($reply, $status) = $client->GetHello($request)->wait();
if ($status->code !== Grpc\STATUS_OK) {
    echo "Call did not complete successfully. Status object:\n";
    var_dump($status);
    exit(1);
}
echo $reply->getResult();
```

Override `main.php` with the above PHP Example: 

    $ x mix todoworld-php-ssl

Run example:

    $ php main.php

### PHP Local Development gRPC SSL CRUD Example

```php
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

$client = new TodoWorld\GrpcServicesClient('localhost:5001', [
    'credentials' => Grpc\ChannelCredentials::createSsl(file_get_contents(dirname(__FILE__).'dev.crt')),
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
```

Refer to [/src/clients/php](https://github.com/NetCoreApps/todo-world/tree/master/src/clients/php)
for a complete example project.
