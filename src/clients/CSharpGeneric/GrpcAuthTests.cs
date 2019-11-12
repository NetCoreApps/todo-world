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
        private static GrpcServiceClient CreateClient() => new GrpcServiceClient("https://localhost:5001");
        private static GrpcServiceClient CreateClientCredentials()
        {
            var client = CreateClient();
            client.SetCredentials("admin@email.com","p@55wOrd");
            return client;
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
        public async Task Can_call_HelloSecure_credentials()
        {
            var client = CreateClientCredentials();

            var response = await client.GetAsync(new HelloSecure { Name = "ServiceStack gRPC" });
            Assert.That(response.Result, Is.EqualTo("Hello, ServiceStack gRPC!"));
        }
    }
}