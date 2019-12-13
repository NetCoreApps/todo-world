
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

### Creating a new Development Certificate

From: https://devblogs.microsoft.com/aspnet/configuring-https-in-asp-net-core-across-different-platforms/

WSL:

    $ ./create-dev.https.pfx.sh

Windows:

    C:\> bash create-dev.https.pfx.sh


