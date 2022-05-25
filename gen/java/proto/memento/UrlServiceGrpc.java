package memento;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0)",
    comments = "Source: memento/url.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UrlServiceGrpc {

  private UrlServiceGrpc() {}

  public static final String SERVICE_NAME = "memento.UrlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<memento.Url.ListUrlsRequest,
      memento.Url.ListUrlsResponse> getListUrlsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUrls",
      requestType = memento.Url.ListUrlsRequest.class,
      responseType = memento.Url.ListUrlsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<memento.Url.ListUrlsRequest,
      memento.Url.ListUrlsResponse> getListUrlsMethod() {
    io.grpc.MethodDescriptor<memento.Url.ListUrlsRequest, memento.Url.ListUrlsResponse> getListUrlsMethod;
    if ((getListUrlsMethod = UrlServiceGrpc.getListUrlsMethod) == null) {
      synchronized (UrlServiceGrpc.class) {
        if ((getListUrlsMethod = UrlServiceGrpc.getListUrlsMethod) == null) {
          UrlServiceGrpc.getListUrlsMethod = getListUrlsMethod =
              io.grpc.MethodDescriptor.<memento.Url.ListUrlsRequest, memento.Url.ListUrlsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUrls"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  memento.Url.ListUrlsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  memento.Url.ListUrlsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UrlServiceMethodDescriptorSupplier("ListUrls"))
              .build();
        }
      }
    }
    return getListUrlsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<memento.Url.ListUrlsByKeywordRequest,
      memento.Url.ListUrlsByKeywordResponse> getListUrlsByKeywordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUrlsByKeyword",
      requestType = memento.Url.ListUrlsByKeywordRequest.class,
      responseType = memento.Url.ListUrlsByKeywordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<memento.Url.ListUrlsByKeywordRequest,
      memento.Url.ListUrlsByKeywordResponse> getListUrlsByKeywordMethod() {
    io.grpc.MethodDescriptor<memento.Url.ListUrlsByKeywordRequest, memento.Url.ListUrlsByKeywordResponse> getListUrlsByKeywordMethod;
    if ((getListUrlsByKeywordMethod = UrlServiceGrpc.getListUrlsByKeywordMethod) == null) {
      synchronized (UrlServiceGrpc.class) {
        if ((getListUrlsByKeywordMethod = UrlServiceGrpc.getListUrlsByKeywordMethod) == null) {
          UrlServiceGrpc.getListUrlsByKeywordMethod = getListUrlsByKeywordMethod =
              io.grpc.MethodDescriptor.<memento.Url.ListUrlsByKeywordRequest, memento.Url.ListUrlsByKeywordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUrlsByKeyword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  memento.Url.ListUrlsByKeywordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  memento.Url.ListUrlsByKeywordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UrlServiceMethodDescriptorSupplier("ListUrlsByKeyword"))
              .build();
        }
      }
    }
    return getListUrlsByKeywordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UrlServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UrlServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UrlServiceStub>() {
        @java.lang.Override
        public UrlServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UrlServiceStub(channel, callOptions);
        }
      };
    return UrlServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UrlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UrlServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UrlServiceBlockingStub>() {
        @java.lang.Override
        public UrlServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UrlServiceBlockingStub(channel, callOptions);
        }
      };
    return UrlServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UrlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UrlServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UrlServiceFutureStub>() {
        @java.lang.Override
        public UrlServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UrlServiceFutureStub(channel, callOptions);
        }
      };
    return UrlServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UrlServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listUrls(memento.Url.ListUrlsRequest request,
        io.grpc.stub.StreamObserver<memento.Url.ListUrlsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUrlsMethod(), responseObserver);
    }

    /**
     */
    public void listUrlsByKeyword(memento.Url.ListUrlsByKeywordRequest request,
        io.grpc.stub.StreamObserver<memento.Url.ListUrlsByKeywordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUrlsByKeywordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListUrlsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                memento.Url.ListUrlsRequest,
                memento.Url.ListUrlsResponse>(
                  this, METHODID_LIST_URLS)))
          .addMethod(
            getListUrlsByKeywordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                memento.Url.ListUrlsByKeywordRequest,
                memento.Url.ListUrlsByKeywordResponse>(
                  this, METHODID_LIST_URLS_BY_KEYWORD)))
          .build();
    }
  }

  /**
   */
  public static final class UrlServiceStub extends io.grpc.stub.AbstractAsyncStub<UrlServiceStub> {
    private UrlServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UrlServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UrlServiceStub(channel, callOptions);
    }

    /**
     */
    public void listUrls(memento.Url.ListUrlsRequest request,
        io.grpc.stub.StreamObserver<memento.Url.ListUrlsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUrlsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUrlsByKeyword(memento.Url.ListUrlsByKeywordRequest request,
        io.grpc.stub.StreamObserver<memento.Url.ListUrlsByKeywordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUrlsByKeywordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UrlServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UrlServiceBlockingStub> {
    private UrlServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UrlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UrlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public memento.Url.ListUrlsResponse listUrls(memento.Url.ListUrlsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUrlsMethod(), getCallOptions(), request);
    }

    /**
     */
    public memento.Url.ListUrlsByKeywordResponse listUrlsByKeyword(memento.Url.ListUrlsByKeywordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUrlsByKeywordMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UrlServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UrlServiceFutureStub> {
    private UrlServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UrlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UrlServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<memento.Url.ListUrlsResponse> listUrls(
        memento.Url.ListUrlsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUrlsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<memento.Url.ListUrlsByKeywordResponse> listUrlsByKeyword(
        memento.Url.ListUrlsByKeywordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUrlsByKeywordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_URLS = 0;
  private static final int METHODID_LIST_URLS_BY_KEYWORD = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UrlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UrlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_URLS:
          serviceImpl.listUrls((memento.Url.ListUrlsRequest) request,
              (io.grpc.stub.StreamObserver<memento.Url.ListUrlsResponse>) responseObserver);
          break;
        case METHODID_LIST_URLS_BY_KEYWORD:
          serviceImpl.listUrlsByKeyword((memento.Url.ListUrlsByKeywordRequest) request,
              (io.grpc.stub.StreamObserver<memento.Url.ListUrlsByKeywordResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UrlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UrlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return memento.Url.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UrlService");
    }
  }

  private static final class UrlServiceFileDescriptorSupplier
      extends UrlServiceBaseDescriptorSupplier {
    UrlServiceFileDescriptorSupplier() {}
  }

  private static final class UrlServiceMethodDescriptorSupplier
      extends UrlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UrlServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UrlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UrlServiceFileDescriptorSupplier())
              .addMethod(getListUrlsMethod())
              .addMethod(getListUrlsByKeywordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
