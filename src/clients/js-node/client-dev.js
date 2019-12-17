const { 
    ResetTodos,
    CreateTodo,
    GetTodo,
    GetTodos,
    UpdateTodo,
    DeleteTodo,
} = require('./services_pb.js');

const { GrpcServicesClient } = require('./services_grpc_pb.js');

const grpc = require('grpc');

const { promisify } = require('util');
const fs = require('fs');

async function main() {

    const client = new GrpcServicesClient('localhost:5001', 
        grpc.credentials.createSsl(fs.readFileSync('../certs/dev.crt')));
    
    // Convert gRPC's callback APIs to await friendly promises
    const { 
        postResetTodos,
        postCreateTodo,
        callGetTodos,
        callGetTodo,
        putUpdateTodo,
        callDeleteTodo,
    } = promisifyAll(client);

    console.log('TODO EXAMPLE');
    await postResetTodos(new ResetTodos());

    //POST /todos
    request = new CreateTodo();
    request.setTitle('ServiceStack');
    var todo = (await postCreateTodo(request)).getResult();
    console.log(`new todo Id: ${todo.getId()}, Title: ${todo.getTitle()}`);

    //GET /todos
    var all = await callGetTodos(new GetTodos());
    console.log(`todos: ${all.getResultsList().length}`);

    //GET /todos/1
    request = new GetTodo();
    request.setId(todo.getId());
    todo = (await callGetTodo(request)).getResult();
    console.log(`get todo Id: ${todo.getId()}, Title: ${todo.getTitle()}`);

    //PUT /todos/1
    request = new UpdateTodo();
    request.setId(todo.getId());
    request.setTitle('gRPC');
    await putUpdateTodo(request);

    //GET /todos/1
    request = new GetTodo();
    request.setId(todo.getId());
    todo = (await callGetTodo(request)).getResult();
    console.log(`get todo Id: ${todo.getId()}, Title: ${todo.getTitle()}`);

    //DELETE /todos/1
    request = new DeleteTodo();
    request.setId(todo.getId());
    await callDeleteTodo(request);

    //GET /todos
    all = await callGetTodos(new GetTodos());
    console.log(`todos: ${all.getResultsList().length}`);
}

// Necessary until gRPC provides a native async friendly solution https://github.com/grpc/grpc-node/issues/54
function promisifyAll(client) {
    const to = {};
    for (var k in client) {
        if (typeof client[k] != 'function') continue;
        to[k] = promisify(client[k].bind(client));
    }
    return to;
}

main();
