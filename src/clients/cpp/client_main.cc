#include <iostream>
#include <string>
#include <grpcpp/grpcpp.h>

#include "services.pb.h"
#include "services.grpc.pb.h"

using grpc::Channel;
using grpc::ClientContext;
using grpc::Status;

class TodoWorldClient {
    public:
        TodoWorldClient(std::shared_ptr<Channel> channel) : stub_(GrpcServices::NewStub(channel)) {}

    GetTodosResponse getTodos() {
        CallGetTodos request;

        GetTodosResponse response;

        ClientContext context;

        Status status = stub_->CallGetTodos(&context, request, &response);

        if(status.ok()){
            return response;
        } else {
            std::cout << status.error_code() << ": " << status.error_message() << std::endl;
            return -1;
        }
    }

    private:
        std::unique_ptr<TodoWorld::Stub> stub_;
};

int main(int argc, char** argv) {

  // Instantiate the client. It requires a channel, out of which the
  // actual RPCs are created. This channel models a connection to an
  // endpoint (in this case, localhost at port 50051). We indicate
  // that the channel isn't authenticated (use of
  // InsecureCredentials()).

  TodoWorldClient client(
    grpc::CreateChannel(
      "localhost:5001", 
      grpc::InsecureChannelCredentials()
    )
  );

  GetTodosResponse response = client.getTodos();
  
  return 0;
}
