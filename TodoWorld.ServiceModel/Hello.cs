using System.Runtime.Serialization;
using ServiceStack;

namespace TodoWorld.ServiceModel
{
    /**
     * gRPC uses protobuf-net which requires [DataContract] / [DataMember(Order=N)] attributes on all DTOs
     * https://github.com/protobuf-net/protobuf-net/wiki/Attributes
     *
     * Request DTOs should implement IReturn<T> or IReturnVoid
     * 
     * ServiceStack's Structured Error Responses requires a ResponseStatus property in Response DTOs
     * and throws WebServiceException in GrpcServiceClient
     */
    
    [Route("/hello")]
    [Route("/hello/{Name}")]
    [DataContract]
    public class Hello : IReturn<HelloResponse>
    {
        [DataMember(Order = 1)]
        public string Name { get; set; }
    }

    [DataContract]
    public class HelloResponse
    {
        [DataMember(Order = 1)]
        public string Result { get; set; }
        
        [DataMember(Order = 2)]
        public ResponseStatus ResponseStatus { get; set; }
    }
    
    [Route("/hello-secure")]
    [Route("/hello-secure/{Name}")]
    [DataContract]
    public class HelloSecure : IReturn<HelloResponse>
    {
        [DataMember(Order = 1)]
        public string Name { get; set; }
    }
}
