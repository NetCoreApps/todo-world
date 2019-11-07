FROM mcr.microsoft.com/dotnet/core/sdk:3.0 AS build
WORKDIR /app

# copy csproj and restore as distinct layers
COPY src/*.sln .
COPY src/Chat/*.csproj ./Chat/
RUN dotnet restore

# copy everything else and build app
COPY src/Chat/. ./Chat/
WORKDIR /app/Chat
RUN dotnet publish -c Release -o out

FROM mcr.microsoft.com/dotnet/core/aspnet:3.0 AS runtime
WORKDIR /app
COPY --from=build /app/Chat/out ./
ENV ASPNETCORE_URLS http://*:5000
ENTRYPOINT ["dotnet", "Chat.dll"]