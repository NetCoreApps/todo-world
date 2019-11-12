using Microsoft.Extensions.DependencyInjection;
using ServiceStack;
using ServiceStack.Auth;

namespace TodoWorld
{
    // Add any additional metadata properties you want to store in the Users Typed Session
    public class CustomUserSession : AuthUserSession 
    {
    }

    public class ConfigureAuth : IConfigureAppHost, IConfigureServices
    {
        public void Configure(IServiceCollection services)
        {
            //services.AddSingleton<ICacheClient>(new MemoryCacheClient()); //Store User Sessions in Memory Cache (default)
        }

        public void Configure(IAppHost appHost)
        {
            var AppSettings = appHost.AppSettings;
            appHost.Plugins.Add(new AuthFeature(() => new CustomUserSession(),
                new IAuthProvider[] {
                    new BasicAuthProvider(AppSettings),         /* Sign In with Username / Password Basic Auth */
                    new CredentialsAuthProvider(AppSettings),   /* Sign In with Username / Password credentials */
                    new JwtAuthProvider(AppSettings), 
                }));

            appHost.Plugins.Add(new RegistrationFeature()); //Enable /register Service
        }
    }
}