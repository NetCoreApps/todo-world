import 'dart:convert';
import 'dart:io';
import 'package:grpc/grpc.dart';
import 'package:todoworld/services.pb.dart';
import 'package:todoworld/services.pbgrpc.dart';

GrpcServicesClient createClient() {
  return GrpcServicesClient(ClientChannel('localhost', port:5001,
    options:ChannelOptions(credentials: ChannelCredentials.secure(
      onBadCertificate: (cert,host) => host == 'localhost:5001' //trust local self-cert
    ))));
}

void todoExample(GrpcServicesClient client) async {

  print('\n\nTODO EXAMPLE');

  await client.postResetTodos(ResetTodos());

  //GET /todos
  var all = await client.callGetTodos(GetTodos());
  print('todos: ${all.results.length}');

  //POST /todos
  var todo = (await client.postCreateTodo(CreateTodo()..title = 'ServiceStack')).result;
  print('new todo Id: ${todo.id}, Title: ${todo.title}');

  //GET /todos/1
  todo = (await client.callGetTodo(GetTodo()..id = todo.id)).result;
  print('get todo Id: ${todo.id}, Title: ${todo.title}');

  //PUT /todos/1
  await client.putUpdateTodo(UpdateTodo()..id = todo.id..title = 'gRPC');

  //GET /todos/1
  todo = (await client.callGetTodo(GetTodo()..id = todo.id)).result;
  print('get todo Id: ${todo.id}, Title: ${todo.title}');

  //DELETE /todos/1
  await client.callDeleteTodo(DeleteTodo()..id = todo.id);

  //GET /todos
  all = await client.callGetTodos(GetTodos());
  print('todos: ${all.results.length}');  
}

void serverEventsExample(GrpcServicesClient client) async {

  print('\n\nSTREAM EVENTS');

  var stream = client.serverStreamServerEvents(StreamServerEvents()..channels.add('todos'));
  await for (var r in stream) {
    var obj = jsonDecode(r.json);
    if (r.selector.startsWith('todos')) {
      if (obj is Map) {
        print('EVENT ${r.selector} [${r.channel}]: #${obj['id']} ${obj['title']}');
      } else {
        print('EVENT ${r.selector} [${r.channel}]: ${obj}');
      }
    } else {
      print('EVENT ${r.selector} ${r.channels}: #${obj['userId']} ${obj['displayName']}');
    }
  }
}

void streamFilesExample(GrpcServicesClient client) async {

  print('\n\nSTREAM FILES');

  var stream = client.serverStreamFiles(StreamFiles()..paths.addAll([
    '/js/ss-utils.js',
    '/js/hot-loader.js',
    '/js/hot-fileloader.js',
  ]));

  await for (var file in stream) {
    var text = utf8.decode(file.body);
    print('FILE ${file.name} (${file.length}): ${text.substring(0, text.length < 50 ? text.length : 50)} ...');
  }
}

void main(List<String> args) async {

  var client = createClient();

  serverEventsExample(client);
  await todoExample(client);
  await streamFilesExample(client);

  exit(0);
}
