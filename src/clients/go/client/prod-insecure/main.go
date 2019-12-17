package main

import (
	context "context"
	"fmt"
	"log"

	"google.golang.org/grpc"

	"time"
	pb "todoworld/services"
)

const (
	address = "todoworld.servicestack.net:5054"
)

func main() {
	fmt.Println("TODO EXAMPLE")

	conn, err := grpc.Dial(address, grpc.WithInsecure())
	if err != nil {
		log.Fatalf("fail to dial: %v", err)
	}
	defer conn.Close()

	client := pb.NewGrpcServicesClient(conn)
	ctx, cancel := context.WithTimeout(context.Background(), time.Second)
	defer cancel()

	_, err = client.PostResetTodos(ctx, &pb.ResetTodos{})
	if err != nil {
		log.Fatalf("PostResetTodos: %v", err)
	}

	//POST /todos
	r1, err := client.PostCreateTodo(ctx, &pb.CreateTodo{Title: "ServiceStack"})
	if err != nil {
		log.Fatalf("PostCreateTodo: %v", err)
	}
	todo := r1.Result
	fmt.Println("new todo Id:", todo.Id, "Title:", todo.Title)

	//GET /todos
	all, err := client.CallGetTodos(ctx, &pb.GetTodos{})
	if err != nil {
		log.Fatalf("CallGetTodos: %v", err)
	}
	fmt.Println("todos:", len(all.GetResults()))

	//GET /todos/1
	r2, err := client.CallGetTodo(ctx, &pb.GetTodo{Id: todo.Id})
	if err != nil {
		log.Fatalf("CallGetTodo: %v", err)
	}
	todo = r2.Result
	fmt.Println("get todo Id:", todo.Id, "Title:", todo.Title)

	//PUT /todos/1
	_, err = client.PutUpdateTodo(ctx, &pb.UpdateTodo{Id: todo.Id, Title: "gRPC"})
	if err != nil {
		log.Fatalf("PutUpdateTodo: %v", err)
	}

	//GET /todos/1
	r2, err = client.CallGetTodo(ctx, &pb.GetTodo{Id: todo.Id})
	if err != nil {
		log.Fatalf("CallGetTodo: %v", err)
	}
	todo = r2.Result
	fmt.Println("get todo Id:", todo.Id, "Title:", todo.Title)

	//DELETE /todos/1
	_, err = client.CallDeleteTodo(ctx, &pb.DeleteTodo{Id: todo.Id})
	if err != nil {
		log.Fatalf("CallDeleteTodo: %v", err)
	}

	//GET /todos
	all, err = client.CallGetTodos(ctx, &pb.GetTodos{})
	if err != nil {
		log.Fatalf("CallGetTodos: %v", err)
	}
	fmt.Println("todos:", len(all.GetResults()))

}
