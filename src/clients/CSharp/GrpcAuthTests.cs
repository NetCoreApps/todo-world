using System.Net;
using System.Threading.Tasks;
using Grpc.Core;
using Grpc.Net.Client;
using NUnit.Framework;
using TodoWorld;

namespace CSharp
{
    public class GrpcAuthTests
    {
        const string UserName = "admin@email.com";
        const string Password = "p@55wOrd";

        private static GrpcServices.GrpcServicesClient CreateClient() => 
            new GrpcServices.GrpcServicesClient(GrpcChannel.ForAddress("https://localhost:5001"));

        private static async Task<AuthenticateResponse> GetAuthenticateResponse()
        {
            var authClient = CreateClient();
            return await authClient.PostAuthenticateAsync(new Authenticate {
                Provider = "credentials",
                UserName = UserName,
                Password = Password,
            });
        }

        [Test]
        public async Task Does_not_allow_Unauthenticated_Requests_depfree()
        {
            var client = CreateClient();

            try
            {
                var response = await client.GetHelloSecureAsync(new HelloSecure { Name = "ServiceStack gRPC" });
                Assert.Fail("Should throw");
            }
            catch (RpcException e)
            {
                Assert.That(e.StatusCode, Is.EqualTo(StatusCode.Unauthenticated));
                Assert.That(e.Status.Detail, Is.EqualTo(nameof(HttpStatusCode.Unauthorized)));
            }
        }

        [Test]
        public async Task Does_not_allow_Unauthenticated_Requests()
        {
            var client = CreateClient();

            try
            {
                var response = await client.Exec(c => 
                    c.GetHelloSecureAsync(new HelloSecure { Name = "ServiceStack gRPC" } ));
                Assert.Fail("Should throw");
            }
            catch (WebServiceException e)
            {
                Assert.That(e.StatusCode, Is.EqualTo(StatusCode.Unauthenticated));
                Assert.That(e.ErrorCode, Is.EqualTo(nameof(HttpStatusCode.Unauthorized)));
                Assert.That(e.GetResponseStatus().ErrorCode, Is.EqualTo(nameof(HttpStatusCode.Unauthorized)));
            }
        }

        [Test]
        public async Task Can_call_HelloSecure_Credentials()
        {
            var client = CreateClient();

            var response = await client.Exec(c => 
                c.GetHelloSecureAsync(new HelloSecure { Name = "ServiceStack gRPC" }, 
                    new Metadata().WithBasicAuth("admin@email.com","p@55wOrd") ));

            Assert.That(response.Result, Is.EqualTo("Hello, ServiceStack gRPC!"));
        }
 
        [Test]
        public async Task Can_call_HelloSecure_JWT_BearerToken()
        {
            var authResponse = await GetAuthenticateResponse();

            var client = CreateClient();

            var response = await client.Exec(c => 
                c.GetHelloSecureAsync(new HelloSecure { Name = "ServiceStack gRPC" }, 
                    new Metadata().WithToken(authResponse.BearerToken) ));

            Assert.That(response.Result, Is.EqualTo("Hello, ServiceStack gRPC!"));
        }
        
    }
}