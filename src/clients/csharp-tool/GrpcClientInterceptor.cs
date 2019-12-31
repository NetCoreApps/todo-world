using System;
using System.Threading.Tasks;
using Grpc.Core;
using Grpc.Core.Interceptors;

namespace CSharp
{
    public class GrpcClientInterceptor : Interceptor
    {
        public override AsyncUnaryCall<TResponse> AsyncUnaryCall<TRequest, TResponse>(TRequest request, ClientInterceptorContext<TRequest, TResponse> context, AsyncUnaryCallContinuation<TRequest, TResponse> continuation)
        {
            var rspCnt = continuation(request, context);
            var rspAsync = rspCnt.ResponseAsync.ContinueWith(rspTask =>
                {
                    try
                    {
                        var response = rspTask.Result;
                        return response;
                    }
                    catch (AggregateException ex)
                    {
                        throw ex.InnerException;
                    }
                });
                var call = new AsyncUnaryCall<TResponse>(rspAsync, rspCnt.ResponseHeadersAsync, rspCnt.GetStatus, rspCnt.GetTrailers, rspCnt.Dispose);
                return call;
        }

//        public override TResponse BlockingUnaryCall<TRequest, TResponse>(TRequest request, ClientInterceptorContext<TRequest, TResponse> context, BlockingUnaryCallContinuation<TRequest, TResponse> continuation)
//        {
//            return new InterceptedClientHandler<TRequest, TResponse>(_tracer, context)
//                .BlockingUnaryCall(request, continuation);
//        }
    }
}