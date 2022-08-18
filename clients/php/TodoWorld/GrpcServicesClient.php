<?php
// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Options:
// Date: 2019-12-11 03:06:20
// Version: 5.71
// Tip: To override a DTO option, remove "//" prefix before updating
// BaseUrl: https://localhost:5001
//
// //GlobalNamespace: 
// //AddDescriptionAsComments: True
//
namespace TodoWorld;

/**
 */
class GrpcServicesClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * @param \TodoWorld\AssignRoles $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PostAssignRoles(\TodoWorld\AssignRoles $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/PostAssignRoles',
        $argument,
        ['\TodoWorld\AssignRolesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\Authenticate $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function OptionsAuthenticate(\TodoWorld\Authenticate $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/OptionsAuthenticate',
        $argument,
        ['\TodoWorld\AuthenticateResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\Authenticate $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetAuthenticate(\TodoWorld\Authenticate $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/GetAuthenticate',
        $argument,
        ['\TodoWorld\AuthenticateResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\Authenticate $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PostAuthenticate(\TodoWorld\Authenticate $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/PostAuthenticate',
        $argument,
        ['\TodoWorld\AuthenticateResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\Authenticate $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DeleteAuthenticate(\TodoWorld\Authenticate $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/DeleteAuthenticate',
        $argument,
        ['\TodoWorld\AuthenticateResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\ConvertSessionToToken $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PostConvertSessionToToken(\TodoWorld\ConvertSessionToToken $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/PostConvertSessionToToken',
        $argument,
        ['\TodoWorld\ConvertSessionToTokenResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\CreateTodo $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PostCreateTodo(\TodoWorld\CreateTodo $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/PostCreateTodo',
        $argument,
        ['\TodoWorld\CreateTodoResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\DeleteTodo $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function CallDeleteTodo(\TodoWorld\DeleteTodo $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/CallDeleteTodo',
        $argument,
        ['\TodoWorld\EmptyResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\DeleteTodos $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function CallDeleteTodos(\TodoWorld\DeleteTodos $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/CallDeleteTodos',
        $argument,
        ['\TodoWorld\EmptyResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\GetAccessToken $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PostGetAccessToken(\TodoWorld\GetAccessToken $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/PostGetAccessToken',
        $argument,
        ['\TodoWorld\GetAccessTokenResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\GetTodo $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function CallGetTodo(\TodoWorld\GetTodo $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/CallGetTodo',
        $argument,
        ['\TodoWorld\GetTodoResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\GetTodos $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function CallGetTodos(\TodoWorld\GetTodos $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/CallGetTodos',
        $argument,
        ['\TodoWorld\GetTodosResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\Hello $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetHello(\TodoWorld\Hello $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/GetHello',
        $argument,
        ['\TodoWorld\HelloResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\Hello $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PostHello(\TodoWorld\Hello $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/PostHello',
        $argument,
        ['\TodoWorld\HelloResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\Hello $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PutHello(\TodoWorld\Hello $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/PutHello',
        $argument,
        ['\TodoWorld\HelloResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\Hello $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DeleteHello(\TodoWorld\Hello $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/DeleteHello',
        $argument,
        ['\TodoWorld\HelloResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\Hello $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PatchHello(\TodoWorld\Hello $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/PatchHello',
        $argument,
        ['\TodoWorld\HelloResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\HelloSecure $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetHelloSecure(\TodoWorld\HelloSecure $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/GetHelloSecure',
        $argument,
        ['\TodoWorld\HelloResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\HelloSecure $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PostHelloSecure(\TodoWorld\HelloSecure $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/PostHelloSecure',
        $argument,
        ['\TodoWorld\HelloResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\HelloSecure $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PutHelloSecure(\TodoWorld\HelloSecure $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/PutHelloSecure',
        $argument,
        ['\TodoWorld\HelloResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\HelloSecure $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DeleteHelloSecure(\TodoWorld\HelloSecure $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/DeleteHelloSecure',
        $argument,
        ['\TodoWorld\HelloResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\HelloSecure $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PatchHelloSecure(\TodoWorld\HelloSecure $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/PatchHelloSecure',
        $argument,
        ['\TodoWorld\HelloResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\Register $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PutRegister(\TodoWorld\Register $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/PutRegister',
        $argument,
        ['\TodoWorld\RegisterResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\Register $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PostRegister(\TodoWorld\Register $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/PostRegister',
        $argument,
        ['\TodoWorld\RegisterResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\ResetTodos $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PostResetTodos(\TodoWorld\ResetTodos $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/PostResetTodos',
        $argument,
        ['\TodoWorld\EmptyResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\StreamFiles $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ServerStreamFiles(\TodoWorld\StreamFiles $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/GrpcServices/ServerStreamFiles',
        $argument,
        ['\TodoWorld\FileContent', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\StreamServerEvents $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ServerStreamServerEvents(\TodoWorld\StreamServerEvents $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/GrpcServices/ServerStreamServerEvents',
        $argument,
        ['\TodoWorld\StreamServerEventsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\UnAssignRoles $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PostUnAssignRoles(\TodoWorld\UnAssignRoles $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/PostUnAssignRoles',
        $argument,
        ['\TodoWorld\UnAssignRolesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \TodoWorld\UpdateTodo $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PutUpdateTodo(\TodoWorld\UpdateTodo $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/GrpcServices/PutUpdateTodo',
        $argument,
        ['\TodoWorld\EmptyResponse', 'decode'],
        $metadata, $options);
    }

}
