
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

