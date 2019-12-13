FROM mcr.microsoft.com/dotnet/core/sdk:3.1 AS build
WORKDIR /app

# copy csproj and restore as distinct layers
COPY src/*.sln .
COPY src/TodoWorld/*.csproj ./TodoWorld/
COPY src/TodoWorld.ServiceInterface/*.csproj ./TodoWorld.ServiceInterface/
COPY src/TodoWorld.ServiceModel/*.csproj ./TodoWorld.ServiceModel/
RUN dotnet restore

# copy everything else and build app
COPY src/TodoWorld/. ./TodoWorld/
COPY src/TodoWorld.ServiceInterface/. ./TodoWorld.ServiceInterface/
COPY src/TodoWorld.ServiceModel/. ./TodoWorld.ServiceModel/
WORKDIR /app/TodoWorld
RUN dotnet publish -c Release -o out

FROM mcr.microsoft.com/dotnet/core/aspnet:3.1 AS runtime
WORKDIR /app
COPY --from=build /app/TodoWorld/out ./
ENV ASPNETCORE_URLS http://*:5000
ENTRYPOINT ["dotnet", "TodoWorld.dll"]
