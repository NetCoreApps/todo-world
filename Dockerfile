FROM mcr.microsoft.com/dotnet/sdk:6.0-focal AS build
WORKDIR /app

COPY ./ .
RUN dotnet restore

WORKDIR /app/TodoWorld
RUN dotnet publish -c release -o /out --no-restore
WORKDIR /app/clients/certs
RUN /app/clients/certs/gen-prod.https.sh todo-world.web-apps.io
RUN cp /app/clients/certs/prod.pfx /out/prod.pfx

FROM mcr.microsoft.com/dotnet/aspnet:6.0-focal AS runtime
WORKDIR /app
COPY --from=build /out .
ENTRYPOINT ["dotnet", "TodoWorld.dll"]
