As it's [impossible to implement the HTTP/2 gRPC spec in the browser](https://grpc.io/blog/state-of-grpc-web/),
in order to be able to consume gRPC services from a browser a [gRPC Web Proxy](https://grpc.io/blog/state-of-grpc-web/#the-tech) is needed.

The current recommendation from the gRPC Web team is to use the 
[Configure the Envoy Proxy](https://grpc.io/docs/tutorials/basic/web/#configure-the-envoy-proxy) to forward
the gRPC browser request to the native gRPC endpoint, however as it adds more moving parts and 
additional complexity, if you're not already using envoyproxy we instead recommended using 
ServiceStack HTTP JSON Services, made possible since ServiceStack's gRPC 
Service implementations are also made available over REST-ful HTTP APIs - i.e. the lingua franca of the web.

If [ASP.NET Core adds native gRPC Web support](https://github.com/grpc/grpc-dotnet/issues/99) then using gRPC
clients may provide a more appealing option although it wont have a clean, versatile and rich API as 
[TypeScript Add ServiceStack Reference](https://docs.servicestack.net/typescript-add-servicestack-reference).

### x dotnet tool gRPC Web support

If wanting to evaluate using a gRPC Web Proxy you can use generate different TypeScript and JavaScript clients
using the commands below:

    $ x proto-ts <url>             # TypeScript + gRPC Web Text
    $ x proto-ts-binary <url>      # TypeScript + gRPC Web Binary
    $ x proto-js-closure <url>     # Google Closure + gRPC Web Text
    $ x proto-js-commonjs <url>    # Common JS + gRPC Web Text

Or if preferred you can use the online UI or HTTP API for generating Protocol Buffers and gRPC client proxies at 
[grpc.servicestack.net](https://grpc.servicestack.net).