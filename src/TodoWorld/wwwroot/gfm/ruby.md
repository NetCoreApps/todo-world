
## Ruby Google protoc generated GrpcServicesStub Client Example

Install [x dotnet tool](https://docs.servicestack.net/dotnet-tool):
    
    $ dotnet tool install --global x 

Install required gems:

    $ gem install grpc bundler 

Create **todoworld.gemspec**:

```ruby
# -*- ruby -*-
# encoding: utf-8

Gem::Specification.new do |s|
  s.name          = 'todoworld'
  s.version       = '1.0.0'
  s.summary       = 'gRPC Ruby TodoWorld Example'
  s.description   = 'Simple TodoWorld demo of using gRPC from Ruby'

  s.files         = `git ls-files -- *`.split("\n")
  s.executables   = `git ls-files -- client.rb`.split("\n").map do |f|
    File.basename(f)
  end
  s.require_paths = ['lib']
  s.platform      = Gem::Platform::RUBY

  s.add_dependency 'grpc', '~> 1.0'
  s.add_dependency 'multi_json', '~> 1.13.1'
  s.add_development_dependency 'bundler', '~> 2.0'
end
```

Generate `Gemfile` and install dependencies:

    $ bundle init
    $ bundle install

Add protoc generated TodoWorld DTOs and gRPC Service Client:

    $ md lib
    $ x proto-ruby https://todoworld.servicestack.net -out lib

### Ruby protoc gRPC insecure Example

Use protoc generated DTOs and `GrpcServicesStub` to call TodoWorld gRPC Service in `main.rb`:

```ruby
#!/usr/bin/env ruby

this_dir = File.expand_path(File.dirname(__FILE__))
lib_dir = File.join(this_dir, 'lib')
$LOAD_PATH.unshift(lib_dir) unless $LOAD_PATH.include?(lib_dir)

require 'grpc'
require 'services_pb'
require 'services_services_pb'

def main
    client = GrpcServices::Stub.new('todoworld.servicestack.net:5054', 
        :this_channel_is_insecure)

    response = client.get_hello(Hello.new(Name:'gRPC Ruby'))
    puts response.Result
end

main
```

Create `main.rb` with the above Ruby Example: 

    $ x mix todoworld-ruby

Run example:

    $ main.rb

### Ruby protoc gRPC SSL Example

Download TodoWorld SSL Certificate used for its gRPC HTTP/2 Services:

    $ x get https://todoworld.servicestack.net/grpc.crt

Use certificate when initializing `GrpcServicesStub`:

```ruby
#!/usr/bin/env ruby

this_dir = File.expand_path(File.dirname(__FILE__))
lib_dir = File.join(this_dir, 'lib')
$LOAD_PATH.unshift(lib_dir) unless $LOAD_PATH.include?(lib_dir)

require 'grpc'
require 'services_pb'
require 'services_services_pb'

def main
    credentials = GRPC::Core::ChannelCredentials.new(File.read('grpc.crt'))
    client = GrpcServices::Stub.new('todoworld.servicestack.net:50051', credentials)

    response = client.get_hello(Hello.new(Name:'gRPC Ruby'))
    puts response.Result
end

main
```

Override `main.rb` with the above Ruby Example: 

    $ x mix todoworld-ruby-ssl

Run example:

    $ ruby main.rb

### Ruby Local Development gRPC SSL CRUD Example

```ruby
#!/usr/bin/env ruby

this_dir = File.expand_path(File.dirname(__FILE__))
lib_dir = File.join(this_dir, 'lib')
$LOAD_PATH.unshift(lib_dir) unless $LOAD_PATH.include?(lib_dir)

require 'grpc'
require 'services_pb'
require 'services_services_pb'

def main
    credentials = GRPC::Core::ChannelCredentials.new(File.read('dev.crt'))
    client = GrpcServices::Stub.new('localhost:5001', credentials)
    client.post_reset_todos(ResetTodos.new())

    puts "TODO EXAMPLE"

    # POST /todos
    todo = client.post_create_todo(CreateTodo.new(Title:"ServiceStack")).Result
    puts "new todo Id: #{todo.Id}, Title: #{todo.Title}"
    
    # GET /todos
    all = client.call_get_todos(GetTodos.new())
    puts "todos: #{all.Results.length}"
    
    # GET /todos/1
    todo = (client.call_get_todo(GetTodo.new(Id:todo.Id))).Result
    puts "get todo Id: #{todo.Id}, Title: #{todo.Title}"
    
    # PUT /todos/1
    client.put_update_todo(UpdateTodo.new(Id:todo.Id, Title:'gRPC'))
    
    # GET /todos/1
    todo = (client.call_get_todo(GetTodo.new(Id:todo.Id))).Result
    puts "get todo Id: #{todo.Id}, Title: #{todo.Title}"
    
    # DELETE /todos/1
    client.call_delete_todo(DeleteTodo.new(Id:todo.Id))
    
    # GET /todos
    all = client.call_get_todos(GetTodos.new())
    puts "todos: #{all.Results.length}"
    
end

main
```

Refer to [/src/clients/ruby](https://github.com/NetCoreApps/todo-world/tree/master/src/clients/ruby)
for a complete example project.
