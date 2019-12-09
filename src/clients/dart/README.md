Prerequisites:

    - Install [Dart](https://dart.dev/get-dart) or [Flutter](https://flutter.dev/docs/get-started/install)

Install [stagehand](https://pub.dev/packages/stagehand):

    $ pub global activate stagehand

Create Dart Console Project:

    $ stagehand console-full

Generate Dart gRPC Service Client:

    $ cd lib
    $ web proto-dart https://localhost:5001
