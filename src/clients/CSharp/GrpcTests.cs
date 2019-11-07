using System;
using System.Linq;
using System.Threading.Tasks;
using Grpc.Core;
using NUnit.Framework;
using Grpc.Net.Client;
using TodoWorld;

namespace CSharp
{
    public class GrpcTests
    {
        private static GrpcServices.GrpcServicesClient CreateClient()
        {
            var channel = GrpcChannel.ForAddress("https://localhost:5001");
            return new GrpcServices.GrpcServicesClient(channel);
        }

        [Test]
        public async Task Can_call_Hello()
        {
            // The port number(5001) must match the port of the gRPC server.
            var client = CreateClient();
            var response = await client.GetHelloAsync(new Hello { Name = "ServiceStack gRPC" });
            
            Assert.That(response.Result, Is.EqualTo("Hello, ServiceStack gRPC!"));
        }

        [Test]
        public async Task TODO_Example()
        {
            var client = CreateClient();
            await client.PostResetTodosAsync(new ResetTodos());

            //GET /todos
            var all = await client.CallGetTodosAsync(new GetTodos());
            Assert.That(all.Results?.Count ?? 0, Is.EqualTo(0));

            //POST /todos
            var todo = (await client.PostCreateTodoAsync(new CreateTodo { Title = "ServiceStack" })).Result;
            Assert.That(todo.Id, Is.EqualTo(1));
            //GET /todos/1
            todo = (await client.CallGetTodoAsync(new GetTodo { Id = todo.Id })).Result;
            Assert.That(todo.Title, Is.EqualTo("ServiceStack"));

            //GET /todos
            all = await client.CallGetTodosAsync(new GetTodos());
            Assert.That(all.Results.Count, Is.EqualTo(1));

            //PUT /todos/1
            await client.PutUpdateTodoAsync(new UpdateTodo { Id = todo.Id, Title = "gRPC" });
            todo = (await client.CallGetTodoAsync(new GetTodo { Id = todo.Id })).Result;
            Assert.That(todo.Title, Is.EqualTo("gRPC"));

            //DELETE /todos/1
            await client.CallDeleteTodoAsync(new DeleteTodo { Id = todo.Id });
            //GET /todos
            all = await client.CallGetTodosAsync(new GetTodos());
            Assert.That(all.Results?.Count ?? 0, Is.EqualTo(0));
        }

        private static void AssertUpdateTodoValidationErrors(ResponseStatus status)
        {
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

        [Test]
        public async Task Can_access_validation_Errors_depfree()
        {
            AsyncUnaryCall<EmptyResponse> call = null;
            try
            {
                var client = CreateClient();

                call = client.PutUpdateTodoAsync(new UpdateTodo {
                    Id = 0, 
                    Title = "",
                    Order = -1,
                });
                await call;
            }
            catch (RpcException ex)
            {
                Assert.That(ex.Status.Detail, Is.EqualTo("GreaterThan"));
                Assert.That(ex.StatusCode, Is.EqualTo(StatusCode.Internal));

                var headers = await call.ResponseHeadersAsync;
                var httpStatus = int.Parse(headers.First(x => x.Key == "httpstatus").Value);
                Assert.That(httpStatus, Is.EqualTo(400));

                var statusBytes = headers.First(x => x.Key == "responsestatus-bin").ValueBytes;
                var status = ResponseStatus.Parser.ParseFrom(statusBytes);
                AssertUpdateTodoValidationErrors(status);
            }
        }

        [Test]
        public async Task Can_access_validation_Errors()
        {
            AsyncUnaryCall<EmptyResponse> call = null;
            try
            {
                var client = CreateClient();

                var response = client.Exec(c => c.PutUpdateTodoAsync(new UpdateTodo {
                    Id = 0, 
                    Title = "",
                    Order = -1,
                }));
            }
            catch (WebServiceException ex)
            {
                Assert.That(ex.Status.Detail, Is.EqualTo("GreaterThan"));
                Assert.That(ex.StatusCode, Is.EqualTo(StatusCode.Internal));
                AssertUpdateTodoValidationErrors(ex.GetResponseStatus());
            }
        }
    }
}