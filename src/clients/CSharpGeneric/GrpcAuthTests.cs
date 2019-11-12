using System;
using System.Net;
using System.Threading.Tasks;
using NUnit.Framework;
using ServiceStack;
using TodoWorld.ServiceModel;

namespace CSharpGeneric
{
    public class GrpcAuthTests
    {
        const string UserName = "admin@email.com";
        const string Password = "p@55wOrd";

        private static GrpcServiceClient CreateClient() => new GrpcServiceClient("https://localhost:5001");
        private static GrpcServiceClient CreateClientCredentials()
        {
            var client = CreateClient();
            client.SetCredentials(UserName,Password);
            return client;
        }

        private static Task<AuthenticateResponse> GetAuthenticateResponse()
        {
            var authClient = CreateClientCredentials();
            return authClient.PostAsync(new Authenticate {
                provider = "credentials",
                UserName = UserName,
                Password = Password,
            });
        }

        [Test]
        public async Task Does_not_allow_Unauthenticated_Requests()
        {
            var client = CreateClient();

            try
            {
                var response = await client.GetAsync(new HelloSecure { Name = "ServiceStack gRPC" });
                Assert.Fail("Should throw");
            }
            catch (WebServiceException e)
            {
                Assert.That(e.StatusCode, Is.EqualTo((int)HttpStatusCode.Unauthorized)); //401
                Assert.That(e.ErrorCode, Is.EqualTo(nameof(HttpStatusCode.Unauthorized)));
                Assert.That(e.GetResponseStatus().ErrorCode, Is.EqualTo(nameof(HttpStatusCode.Unauthorized)));
            }
        }

        [Test]
        public async Task Can_call_HelloSecure_Credentials()
        {
            var client = CreateClientCredentials();

            var response = await client.GetAsync(new HelloSecure { Name = "ServiceStack gRPC" });
            Assert.That(response.Result, Is.EqualTo("Hello, ServiceStack gRPC!"));
        }

        [Test]
        public void Can_call_HelloSecure_Credentials_sync()
        {
            var client = CreateClientCredentials();

            var response = client.Get(new HelloSecure { Name = "ServiceStack gRPC" });
            Assert.That(response.Result, Is.EqualTo("Hello, ServiceStack gRPC!"));
        }
 
        [Test]
        public async Task Can_call_HelloSecure_JWT_BearerToken()
        {
            var authResponse = await GetAuthenticateResponse();

            var client = CreateClient();
            client.BearerToken = authResponse.BearerToken;

            var response = await client.GetAsync(new HelloSecure { Name = "ServiceStack gRPC" });
            Assert.That(response.Result, Is.EqualTo("Hello, ServiceStack gRPC!"));
        }
 
        [Test]
        public async Task Can_call_HelloSecure_JWT_RefreshToken()
        {
            var authResponse = await GetAuthenticateResponse();

            var client = CreateClient();
            client.RefreshToken = authResponse.RefreshToken;

            var response = await client.GetAsync(new HelloSecure { Name = "ServiceStack gRPC" });
            Assert.That(response.Result, Is.EqualTo("Hello, ServiceStack gRPC!"));
        }
    }
}