using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;
using Funq;
using ServiceStack;
using ServiceStack.Validation;
using TodoWorld.ServiceInterface;

namespace TodoWorld
{
    public class Startup : ModularStartup
    {
        // This method gets called by the runtime. Use this method to add services to the container.
        // For more information on how to configure your application, visit https://go.microsoft.com/fwlink/?LinkID=398940
        public new void ConfigureServices(IServiceCollection services)
        {
            services.AddServiceStackGrpc();
        }

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, IWebHostEnvironment env)
        {
            if (env.IsDevelopment())
            {
                app.UseDeveloperExceptionPage();
            }

            app.UseRouting();

            app.UseServiceStack(new AppHost
            {
                AppSettings = new NetCoreAppSettings(Configuration)
            });
        }
    }

    public class AppHost : AppHostBase
    {
        public AppHost() : base("TODO World", typeof(TodoServices).Assembly) { }

        // Configure your AppHost with the necessary configuration and dependencies your App needs
        public override void Configure(Container container)
        {
            SetConfig(new HostConfig
            {
                DebugMode = AppSettings.Get(nameof(HostConfig.DebugMode), false)
            });

            Plugins.Add(new SharpPagesFeature {
                ScriptMethods = {
                    new GitHubMarkdownScripts()
                }
            });
            Plugins.Add(new ValidationFeature());
            Plugins.Add(new ServerEventsFeature());
            Plugins.Add(new GrpcFeature(App));
            Plugins.Add(new CorsFeature(allowOriginWhitelist:new[] {
                "http://localhost:3000",
                "http://localhost:8000",
                "http://localhost:5000",
                "http://localhost:8080",
                "https://localhost:5001",
                "http://localhost:59812",
            }, allowCredentials:true));
        }
    }
}
