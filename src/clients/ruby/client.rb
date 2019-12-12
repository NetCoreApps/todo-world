#!/usr/bin/env ruby

this_dir = File.expand_path(File.dirname(__FILE__))
lib_dir = File.join(this_dir, 'lib')
$LOAD_PATH.unshift(lib_dir) unless $LOAD_PATH.include?(lib_dir)

require 'grpc'
require 'services_pb'
require 'services_services_pb'

def main
    # For non-TLS use:
    # client = GrpcServices::Stub.new('localhost:5001', :this_channel_is_insecure)

    credentials = GRPC::Core::ChannelCredentials.new(File.read('../cert/localhost.cer'))
    client = GrpcServices::Stub.new('localhost:5001', credentials)
    client.post_reset_todos(ResetTodos.new())

    # message = client.get_hello(Hello.new(Name:'World')).Result
    # p message

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


