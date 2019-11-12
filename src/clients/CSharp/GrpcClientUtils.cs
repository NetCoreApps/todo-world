using TodoWorld;

namespace CSharp
{
    using System;
    using System.Threading.Tasks;
    using Grpc.Core;

    public class WebServiceException : Exception
    {
        public Status Status { get; } 
        public Metadata Headers { get; }
            
        public WebServiceException(Status status, Metadata headers, RpcException innerEx) : base(status.Detail ?? innerEx.Message, innerEx)
        {
            Status = status;
            Headers = headers;
        }

        public StatusCode StatusCode => this.Status.StatusCode;
        public ResponseStatus GetResponseStatus() => Headers.GetResponseStatus();
        public string ErrorCode => GetResponseStatus()?.ErrorCode ?? Status.Detail;
        public int HttpStatus => Headers.GetHttpStatus();
    }
    
    public static class GrpcClientUtils
    {
        public static class Keywords
        {
            public const string HeaderSessionId = "X-ss-id";
            public const string HttpStatus = "httpstatus";
            public const string ResponseStatus = "responsestatus-bin";
        }

        public static async Task<T> Exec<T>(this GrpcServices.GrpcServicesClient client, Func<GrpcServices.GrpcServicesClient, AsyncUnaryCall<T>> fn)
        {
            var call = fn(client);
            try
            {
                return await call;
            }
            catch (RpcException e)
            {
                throw new WebServiceException(call.GetStatus(), await call.ResponseHeadersAsync, e);
            }
        }
        
        public static string GetHeader(this Metadata headers, string name)
        {
            foreach (var entry in headers)
            {
                if (string.Equals(entry.Key, name, StringComparison.OrdinalIgnoreCase))
                    return entry.Value;
            }
            return null;
        }

        public static byte[] GetHeaderBytes(this Metadata headers, string name)
        {
            foreach (var entry in headers)
            {
                if (string.Equals(entry.Key, name, StringComparison.OrdinalIgnoreCase))
                    return entry.ValueBytes;
            }
            return null;
        }

        public static ResponseStatus GetResponseStatus(this Metadata headers)
        {
            var statusBytes = headers.GetHeaderBytes(Keywords.ResponseStatus);
            return statusBytes != null ? ResponseStatus.Parser.ParseFrom(statusBytes) : null;
        }

        public static int GetHttpStatus(this Metadata headers)
        {
            var httpStatus = GetHeader(headers, "httpstatus");
            return httpStatus != null ? int.Parse(httpStatus)  : default;
        }

        public static Metadata WithBasicAuth(this Metadata headers, string userName, string password)
        {
            headers.Add("Authorization", "Basic " + Convert.ToBase64String(System.Text.Encoding.UTF8.GetBytes(userName + ":" + password)));
            return headers;
        }

        public static Metadata WithToken(this Metadata headers, string token)
        {
            headers.Add("Authorization", "Bearer " + token);
            return headers;
        }
    }
}