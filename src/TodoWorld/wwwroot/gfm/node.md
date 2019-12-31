
## Node.js Google protoc generated GrpcServicesStub Client Example

Install [x dotnet tool](https://docs.servicestack.net/web-tool):
    
    $ dotnet tool install --global x 
    
Create npm **package.json**:

    $ npm init
    
Add dependencies:

```json
{
  "name": "todoworld-grpc",
  "version": "0.1.0",
  "description": "gRPC node.js Todo World Example",
  "devDependencies": {
    "@grpc/proto-loader": "^0.1.0",
    "google-protobuf": "^3.6.1",
    "grpc": "^1.11.0",
    "webpack": "^4.16.5",
    "webpack-cli": "^3.1.0"
  }
}
```

Install dependencies:

    $ npm install

Add protoc generated TodoWorld DTOs and gRPC Service Client:

    $ x proto-js-node https://todoworld.servicestack.net

### Node.js protoc gRPC insecure Example

Use protoc generated DTOs and `GrpcServicesClient` to call TodoWorld gRPC Service in `index.js`:

```js
const { Hello } = require('./services_pb.js');
const { GrpcServicesClient } = require('./services_grpc_pb.js');
const grpc = require('grpc');
const { promisify } = require('util');

async function main() {

    const client = new GrpcServicesClient('todoworld.servicestack.net:5054', 
        grpc.credentials.createInsecure());

    // Convert gRPC's callback APIs to await friendly promises
    const { getHello } = promisifyAll(client);
    
    let request = new Hello();
    request.setName("gRPC Node.js");
    let response = await getHello(request);
    console.log(response.getResult());
}

function promisifyAll(client) {
    const to = {};
    for (var k in client) {
        if (typeof client[k] != 'function') continue;
        to[k] = promisify(client[k].bind(client));
    }
    return to;
}

main();
```

Create `index.js` with the above Node.js Example: 

    $ x mix todoworld-node

Run example:

    $ node --no-deprecation index.js

### Node.js protoc gRPC SSL Example

Download TodoWorld SSL Certificate used for its gRPC HTTP/2 Services:

    $ x get https://todoworld.servicestack.net/grpc.crt 

Use certificate when initializing `GrpcServicesClient`:

```js
const { Hello } = require('./services_pb.js');
const { GrpcServicesClient } = require('./services_grpc_pb.js');
const grpc = require('grpc');
const { promisify } = require('util');
const fs = require('fs');

async function main() {

    const client = new GrpcServicesClient('todoworld.servicestack.net:50051', 
        grpc.credentials.createSsl(fs.readFileSync('grpc.crt')));

    // Convert gRPC's callback APIs to await friendly promises
    const { getHello } = promisifyAll(client);
    
    let request = new Hello();
    request.setName("gRPC Node.js");
    let response = await getHello(request);
    console.log(response.getResult());
}

function promisifyAll(client) {
    const to = {};
    for (var k in client) {
        if (typeof client[k] != 'function') continue;
        to[k] = promisify(client[k].bind(client));
    }
    return to;
}

main();
```

Override `index.js` with the above Node.js Example: 

    $ x mix todoworld-node-ssl

Run example:

    $ node --no-deprecation index.js
