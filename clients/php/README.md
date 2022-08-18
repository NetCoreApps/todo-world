Generate PHP gRPC Client

    $ web proto-php https://localhost:5001

### gRPC PHP Quick Start Example

https://github.com/grpc/grpc/tree/master/examples/php

### Windows

#### gRPC PECL Download for Windows

https://windows.php.net/downloads/pecl/releases/grpc/

The PHP extension filename is in the following format:

    php_grpc-{GRPC_VERSION}-{PHP_VERSION}-{THREAD_SAFETY}-{VC++_RUNTIME}-{CPU_ARCH}.zip

Select appropriate version for your OS and copy to `{PHP_HOME}\ext`, then modify your **php.ini** file to include `extension=grpc`.