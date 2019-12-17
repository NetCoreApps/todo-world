
Export your localhost self-signed .NET Core development certificate with:

    $ dotnet dev-certs https --export-path .

If that fails see if you can diagnose and resolve the issue from the verbose output:

    $ dotnet dev-certs https --export-path . --verbose

If you can't keep copy of the certificates thumbprint, they export it via Windows Certificate Manager:

    $ certmgr

1. Go to `Personal > Certificates`
2. Select certificate **Issued To** `localhost`
    - If you have multiple certificates it's likely the one that expires the latest (double-check with thumbprint above to make sure)
3. Click on `Action > All Tasks > Export`
4. In the Export Wizard select **No, do not export the private key**
5. Select 2nd option **Base-64 encoded X.509 (.CER)**
6. Save to `localhost.cer` in this folder

### Generating a new Development Certificate

From: https://devblogs.microsoft.com/aspnet/configuring-https-in-asp-net-core-across-different-platforms/

Linux or WSL Bash:

    $ ./gen-dev.https.sh

Windows:

    C:\> bash gen-dev.https.sh

Options:

    $ gen-dev.https.sh <PASSWORD>

Import the pfx certificate:

    $ powershell Import-PfxCertificate -FilePath dev.https.pfx Cert:\LocalMachine\My -Password (ConvertTo-SecureString grpc -asplaintext -force) -Exportable

Trust the certificate by importing the pfx certificate into your trusted root:

    $ powershell Import-Certificate -FilePath dev.https.crt -CertStoreLocation Cert:\CurrentUser\Root

### Generating a new Production Certificate

Either replace `DOMAIN=...` and `PASSWORD=...` with your domain and password or specify them as arguments, e.g:

Linux or WSL Bash:

    $ ./gen-prod.https.sh <DOMAIN> <PASSWORD>

Windows:

    C:\> bash gen-prod.https.sh <DOMAIN> <PASSWORD>

### Nginx

nginx.conf
https://www.nginx.com/blog/nginx-1-13-10-grpc/

### Lets Encrypt

> In general, I recommend that people don’t use Let’s Encrypt certificates for gRPC or other internal RPC services. In my opinion, it’s both easier and safer to generate a single-purpose internal CA using something like minica and generate both server and client certificates with it. That way you don’t have to open up your RPC servers to the outside internet, plus you limit the scope of trust to just what’s needed for your internal RPCs, plus you can have a much longer certificate lifetime, plus you can get revocation that works.

 - https://itnext.io/practical-guide-to-securing-grpc-connections-with-go-and-tls-part-2-994ef93b8ea9#4a43

    # COPY /etc/letsencrypt/live/$DOMAIN/fullchain.pem TO letsencrypt.pem
    # View cert contents: $ openssl x509 -in letsencrypt.pem -text -noout

