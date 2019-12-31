
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
