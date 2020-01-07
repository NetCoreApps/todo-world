using System.Security.Cryptography.X509Certificates;
using System.Threading.Tasks;
using NUnit.Framework;
using ProtoBuf.Grpc.Client;
using ServiceStack;

namespace CSharpGeneric
{
    public class IntegrationTests
    {
        public static GrpcServiceClient SecureProdClient(int port) => 
            new GrpcServiceClient($"https://todoworld.servicestack.net:{port}",
                new X509Certificate2("../../../../certs/prod.crt"),
                GrpcUtils.AllowSelfSignedCertificatesFrom("todoworld.servicestack.net"));

        public static GrpcServiceClient InsecureProdClient(int port)
        {
            GrpcClientFactory.AllowUnencryptedHttp2 = true;
            return new GrpcServiceClient($"http://todoworld.servicestack.net:{port}");
        }

        [Test]
        public async Task nginx_ssl_netcore_text() => await Program.Run(SecureProdClient(50051));

        [Test]
        public async Task nginx_ssl_netcore_ssl() => await Program.Run(SecureProdClient(50052));

        [Test]
        public async Task netcore_ssl() => await Program.Run(SecureProdClient(5051));

        [Test]
        public async Task nginx_text_netcore_text() => await Program.Run(InsecureProdClient(50054));

        [Test]
        public async Task netcore_text() => await Program.Run(InsecureProdClient(5054));
    }
}