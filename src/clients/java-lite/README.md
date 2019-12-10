Generate Java gRPC  Client

    $ web proto-java-lite https://localhost:5001
    
The Linux **protoc-gen-grpc-java** plugin doesn't support the 'lite' generator option but the Windows build of the same
version does. Whilst we wait for an updated Linux Java plugin you can run https://github.com/ServiceStack/protoc-api
on a Windows server and change the web tool to use your version instead by setting the Environment variable: 

    APP_SOURCE_GRPC={PROTOC_API_BASE_URL}