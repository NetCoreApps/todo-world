using System;
using System.Threading.Tasks;
using NUnit.Framework;
using ServiceStack;
using TodoWorld.ServiceModel;

namespace CSharpGeneric
{
    public class GrpcTests
    {
        private static GrpcServiceClient CreateClient() => new GrpcServiceClient("https://localhost:5001");
        [Test]
        public async Task Can_call_Hello()
        {
            var client = CreateClient();
            var response = await client.GetAsync(new Hello { Name = "ServiceStack gRPC" });
            
            Assert.That(response.Result, Is.EqualTo("Hello, ServiceStack gRPC!"));
        }

        [Test]
        public async Task TODO_Example()
        {
            var client = CreateClient();
            await client.PostAsync(new ResetTodos());

            //GET /todos
            var all = await client.GetAsync(new GetTodos());
            Assert.That(all.Results?.Count ?? 0, Is.EqualTo(0));

            //POST /todos
            var todo = (await client.PostAsync(new CreateTodo { Title = "ServiceStack" })).Result;
            Assert.That(todo.Id, Is.EqualTo(1));
            //GET /todos/1
            todo = (await client.GetAsync(new GetTodo { Id = todo.Id })).Result;
            Assert.That(todo.Title, Is.EqualTo("ServiceStack"));

            //GET /todos
            all = await client.GetAsync(new GetTodos());
            Assert.That(all.Results.Count, Is.EqualTo(1));

            //PUT /todos/1
            await client.PutAsync(new UpdateTodo { Id = todo.Id, Title = "gRPC" });
            todo = (await client.GetAsync(new GetTodo { Id = todo.Id })).Result;
            Assert.That(todo.Title, Is.EqualTo("gRPC"));

            //DELETE /todos/1
            await client.DeleteAsync(new DeleteTodo { Id = todo.Id });
            //GET /todos
            all = await client.GetAsync(new GetTodos());
            Assert.That(all.Results?.Count ?? 0, Is.EqualTo(0));
        }

        [Test]
        public async Task Can_access_validation_Errors()
        {
            try
            {
                var client = CreateClient();

                await client.PutAsync(new UpdateTodo {
                    Id = 0, 
                    Title = "",
                    Order = -1,
                });
            }
            catch (WebServiceException ex)
            {
                Assert.That(ex.StatusCode, Is.EqualTo(400));
                Assert.That(ex.ErrorCode, Is.EqualTo("GreaterThan"));
                Assert.That(ex.Message, Is.EqualTo("'Id' must be greater than '0'."));
                
                var status = ex.GetResponseStatus();
                Assert.That(status.ErrorCode, Is.EqualTo("GreaterThan"));
                Assert.That(status.Message, Is.EqualTo("'Id' must be greater than '0'."));
                Assert.That(status.Errors.Count, Is.EqualTo(3));
                
                var fieldError = status.Errors[0];
                Assert.That(fieldError.FieldName, Is.EqualTo(nameof(UpdateTodo.Id)));
                Assert.That(fieldError.ErrorCode, Is.EqualTo("GreaterThan"));
                Assert.That(fieldError.Message, Is.EqualTo("'Id' must be greater than '0'."));
                
                fieldError = status.Errors[1];
                Assert.That(fieldError.FieldName, Is.EqualTo(nameof(UpdateTodo.Title)));
                Assert.That(fieldError.ErrorCode, Is.EqualTo("NotEmpty"));
                Assert.That(fieldError.Message, Is.EqualTo("'Title' must not be empty."));
                
                fieldError = status.Errors[2];
                Assert.That(fieldError.FieldName, Is.EqualTo(nameof(UpdateTodo.Order)));
                Assert.That(fieldError.ErrorCode, Is.EqualTo("GreaterThanOrEqual"));
                Assert.That(fieldError.Message, Is.EqualTo("'Order' must be greater than or equal to '0'."));
            }
        }
    }
}