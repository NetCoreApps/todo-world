using ServiceStack;
using TodoWorld.ServiceModel;

namespace TodoWorld.ServiceInterface
{
    public class MyServices : Service
    {
        public object Any(Hello request) => new HelloResponse { Result = $"Hello, {request.Name}!" };
    }

    [Authenticate]
    public class MySecureServices : Service
    {
        public object Any(HelloSecure request) => new HelloResponse { Result = $"Hello, {request.Name}!" };
    }
}