using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Server.Kestrel.Core;
using Microsoft.Extensions.Hosting;
using ServiceStack;

namespace TodoWorld
{
    public class Program
    {
        public static void Main(string[] args)
        {
            CreateHostBuilder(args).Build().Run();
        }

        // Additional configuration is required to successfully run gRPC on macOS.
        // For instructions on how to configure Kestrel and gRPC clients on macOS, visit https://go.microsoft.com/fwlink/?linkid=2099682
        public static IHostBuilder CreateHostBuilder(string[] args) =>
            Host.CreateDefaultBuilder(args)
                .ConfigureWebHostDefaults(webBuilder => {

/* Example of in-line configuration
                    webBuilder.ConfigureKestrel(options =>
                    {
                        // Setup a HTTP/2 endpoint without TLS.
                        options.ListenLocalhost(5000, o => o.Protocols = 
                            HttpProtocols.Http2);
                        
                        // Setup a HTTP/2 endpoint with TLS.
                        options.Listen(IPAddress.Loopback, 5001, listenOptions => {
                            listenOptions.Protocols = HttpProtocols.Http2;
                            listenOptions.UseHttps(); // use self-signed certificate
                            //listenOptions.UseHttps("dev.pfx","grpc"); // use local certificate
                        });
                    });
*/
                    webBuilder.UseModularStartup<Startup>();
                });
    }
}