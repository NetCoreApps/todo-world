Generate Swift gRPC Client

    $ cd Sources
    $ web proto-swift https://localhost:5001

### gRPC Swift Quick Start Example

 - https://grpc.io/docs/tutorials/basic/swift/
 - https://github.com/grpc/grpc/tree/master/examples/swift

### Install Swift (WSL)

Download for Ubuntu 18.04:

    $ curl -O https://swift.org/builds/swift-5.1.2-release/ubuntu1804/swift-5.1.2-RELEASE/swift-5.1.2-RELEASE-ubuntu18.04.tar.gz

Download for Ubuntu 18.04:

    $ curl -O https://swift.org/builds/swift-5.1.2-release/ubuntu1604/swift-5.1.2-RELEASE/swift-5.1.2-RELEASE-ubuntu16.04.tar.gz

Install

    $ sudo apt-get install clang libicu-dev
    $ tar -zxvf swift-{VERSION}.tar.gz
    $ echo 

If you are downloading Swift packages for the first time, import the PGP keys into your keyring:

    $ wget -q -O - https://swift.org/keys/all-keys.asc | gpg --import -

Add swift to your PATH:

    $ echo "export PATH=\$PATH:/mnt/c/tools/wsl/swift/usr/bin" >> ~/.bashrc
    $ . ~/.bashrc

Verify installation:

    $ swift --version

### Getting Started

    $ swift package init --type executable

    $ cd Sources/TodoWorld
    $ web proto-swift https://localhost:5001
