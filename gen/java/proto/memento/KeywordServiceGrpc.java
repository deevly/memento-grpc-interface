package memento;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0)",
    comments = "Source: memento/keyword.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KeywordServiceGrpc {

  private KeywordServiceGrpc() {}

  public static final String SERVICE_NAME = "memento.KeywordService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<memento.Keyword.ListKeywordsRequest,
      memento.Keyword.ListKeywordsResponse> getListKeywordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListKeywords",
      requestType = memento.Keyword.ListKeywordsRequest.class,
      responseType = memento.Keyword.ListKeywordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<memento.Keyword.ListKeywordsRequest,
      memento.Keyword.ListKeywordsResponse> getListKeywordsMethod() {
    io.grpc.MethodDescriptor<memento.Keyword.ListKeywordsRequest, memento.Keyword.ListKeywordsResponse> getListKeywordsMethod;
    if ((getListKeywordsMethod = KeywordServiceGrpc.getListKeywordsMethod) == null) {
      synchronized (KeywordServiceGrpc.class) {
        if ((getListKeywordsMethod = KeywordServiceGrpc.getListKeywordsMethod) == null) {
          KeywordServiceGrpc.getListKeywordsMethod = getListKeywordsMethod =
              io.grpc.MethodDescriptor.<memento.Keyword.ListKeywordsRequest, memento.Keyword.ListKeywordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListKeywords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  memento.Keyword.ListKeywordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  memento.Keyword.ListKeywordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordServiceMethodDescriptorSupplier("ListKeywords"))
              .build();
        }
      }
    }
    return getListKeywordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<memento.Keyword.SearchKeywordsRequest,
      memento.Keyword.SearchKeywordsResponse> getSearchKeywordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchKeywords",
      requestType = memento.Keyword.SearchKeywordsRequest.class,
      responseType = memento.Keyword.SearchKeywordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<memento.Keyword.SearchKeywordsRequest,
      memento.Keyword.SearchKeywordsResponse> getSearchKeywordsMethod() {
    io.grpc.MethodDescriptor<memento.Keyword.SearchKeywordsRequest, memento.Keyword.SearchKeywordsResponse> getSearchKeywordsMethod;
    if ((getSearchKeywordsMethod = KeywordServiceGrpc.getSearchKeywordsMethod) == null) {
      synchronized (KeywordServiceGrpc.class) {
        if ((getSearchKeywordsMethod = KeywordServiceGrpc.getSearchKeywordsMethod) == null) {
          KeywordServiceGrpc.getSearchKeywordsMethod = getSearchKeywordsMethod =
              io.grpc.MethodDescriptor.<memento.Keyword.SearchKeywordsRequest, memento.Keyword.SearchKeywordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchKeywords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  memento.Keyword.SearchKeywordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  memento.Keyword.SearchKeywordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordServiceMethodDescriptorSupplier("SearchKeywords"))
              .build();
        }
      }
    }
    return getSearchKeywordsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeywordServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordServiceStub>() {
        @java.lang.Override
        public KeywordServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordServiceStub(channel, callOptions);
        }
      };
    return KeywordServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeywordServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordServiceBlockingStub>() {
        @java.lang.Override
        public KeywordServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordServiceBlockingStub(channel, callOptions);
        }
      };
    return KeywordServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeywordServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordServiceFutureStub>() {
        @java.lang.Override
        public KeywordServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordServiceFutureStub(channel, callOptions);
        }
      };
    return KeywordServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeywordServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listKeywords(memento.Keyword.ListKeywordsRequest request,
        io.grpc.stub.StreamObserver<memento.Keyword.ListKeywordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListKeywordsMethod(), responseObserver);
    }

    /**
     */
    public void searchKeywords(memento.Keyword.SearchKeywordsRequest request,
        io.grpc.stub.StreamObserver<memento.Keyword.SearchKeywordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchKeywordsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListKeywordsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                memento.Keyword.ListKeywordsRequest,
                memento.Keyword.ListKeywordsResponse>(
                  this, METHODID_LIST_KEYWORDS)))
          .addMethod(
            getSearchKeywordsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                memento.Keyword.SearchKeywordsRequest,
                memento.Keyword.SearchKeywordsResponse>(
                  this, METHODID_SEARCH_KEYWORDS)))
          .build();
    }
  }

  /**
   */
  public static final class KeywordServiceStub extends io.grpc.stub.AbstractAsyncStub<KeywordServiceStub> {
    private KeywordServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordServiceStub(channel, callOptions);
    }

    /**
     */
    public void listKeywords(memento.Keyword.ListKeywordsRequest request,
        io.grpc.stub.StreamObserver<memento.Keyword.ListKeywordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListKeywordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchKeywords(memento.Keyword.SearchKeywordsRequest request,
        io.grpc.stub.StreamObserver<memento.Keyword.SearchKeywordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchKeywordsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeywordServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeywordServiceBlockingStub> {
    private KeywordServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public memento.Keyword.ListKeywordsResponse listKeywords(memento.Keyword.ListKeywordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListKeywordsMethod(), getCallOptions(), request);
    }

    /**
     */
    public memento.Keyword.SearchKeywordsResponse searchKeywords(memento.Keyword.SearchKeywordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchKeywordsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeywordServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeywordServiceFutureStub> {
    private KeywordServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<memento.Keyword.ListKeywordsResponse> listKeywords(
        memento.Keyword.ListKeywordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListKeywordsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<memento.Keyword.SearchKeywordsResponse> searchKeywords(
        memento.Keyword.SearchKeywordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchKeywordsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_KEYWORDS = 0;
  private static final int METHODID_SEARCH_KEYWORDS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeywordServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeywordServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_KEYWORDS:
          serviceImpl.listKeywords((memento.Keyword.ListKeywordsRequest) request,
              (io.grpc.stub.StreamObserver<memento.Keyword.ListKeywordsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_KEYWORDS:
          serviceImpl.searchKeywords((memento.Keyword.SearchKeywordsRequest) request,
              (io.grpc.stub.StreamObserver<memento.Keyword.SearchKeywordsResponse>) responseObserver);
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

  private static abstract class KeywordServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeywordServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return memento.Keyword.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeywordService");
    }
  }

  private static final class KeywordServiceFileDescriptorSupplier
      extends KeywordServiceBaseDescriptorSupplier {
    KeywordServiceFileDescriptorSupplier() {}
  }

  private static final class KeywordServiceMethodDescriptorSupplier
      extends KeywordServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeywordServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeywordServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeywordServiceFileDescriptorSupplier())
              .addMethod(getListKeywordsMethod())
              .addMethod(getSearchKeywordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
