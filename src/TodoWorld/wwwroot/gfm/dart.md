
## Dart Google protoc generated GrpcServiceClient Example

Install [x dotnet tool](https://docs.servicestack.net/web-tool):
    
    $ dotnet tool install --global x 
    
Install [stagehand](https://pub.dev/packages/stagehand):

    $ pub global activate stagehand

Create a new Dart Console App:

    $ stagehand console-full

Add required dependencies to **pubspec.yaml**:

```yaml
dependencies:
  fixnum: ^0.10.11
  async: ^2.2.0
  protobuf: ^1.0.1
  grpc: ^2.1.3
```

Install dependencies:

    $ pub get
    
Add protoc generated TodoWorld DTOs and gRPC GrpcServiceClient to `lib/` folder:

    $ x proto-dart https://todoworld.servicestack.net -out lib

### Dart protoc gRPC insecure Example

Use protoc generated DTOs and `GrpcServiceClient` to call TodoWorld gRPC Service in `bin/main.dart`:

```dart
import 'dart:io';
import 'package:grpc/grpc.dart';
import 'package:TodoWorld/services.pb.dart';
import 'package:TodoWorld/services.pbgrpc.dart';

void main(List<String> args) async {

  var client = GrpcServicesClient(ClientChannel('todoworld.servicestack.net', port:5054,
    options:ChannelOptions(credentials: ChannelCredentials.insecure())));

  var response = await client.getHello(Hello()..name = 'gRPC Dart');
  print(response.result);

  exit(0);
}
```

Override `bin/main.dart` with the above Dart Example: 

    $ x mix todoworld-dart -out bin

Run example:

    $ dart run

### Dart protoc gRPC SSL Example

Download TodoWorld SSL Certificate used for its gRPC HTTP/2 Services:

    $ x get https://todoworld.servicestack.net/grpc.crt 

Use certificate when initializing `GrpcServicesClient`:

```dart
import 'dart:io';
import 'package:grpc/grpc.dart';
import 'package:TodoWorld/services.pb.dart';
import 'package:TodoWorld/services.pbgrpc.dart';

void main(List<String> args) async {

  var client = GrpcServicesClient(ClientChannel('todoworld.servicestack.net', port:50051,
    options:ChannelOptions(credentials: ChannelCredentials.secure(
        certificates: File('grpc.crt').readAsBytesSync(),
        authority: 'todoworld.servicestack.net'))));

  var response = await client.getHello(Hello()..name = 'gRPC Dart');
  print(response.result);

  exit(0);
}
```

Override `bin/main.dart` with the above Dart Example: 

    $ x mix todoworld-dart-ssl -out bin

Run example:

    $ dart run
