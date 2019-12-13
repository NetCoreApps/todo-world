Generate TypeScript (gRPC Web Text) gRPC Web Client

    $ web proto-ts https://localhost:5001

#### Run Envoy

gRPC Web requires a proxy to communicate to gRPC HTTP/2 endpoints. 
The [default proxy for gRPC Web is Envoy](https://grpc.io/docs/tutorials/basic/web/#configure-the-envoy-proxy), build with:

    $ docker build -t todoworld/envoy -f ./envoy.Dockerfile 

Run on Linux:

    $ docker run -d -p 8080:8080 -p 5001:5001 --network=host helloworld/envoy

Run on Windows / macOS:

    $ docker run -d -p 8080:8080 -p 5001:5001 helloworld/envoy

