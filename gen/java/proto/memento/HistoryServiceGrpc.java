package memento;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0)",
    comments = "Source: memento/history.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HistoryServiceGrpc {

  private HistoryServiceGrpc() {}

  public static final String SERVICE_NAME = "memento.HistoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<memento.History.ListHitoriesRequest,
      memento.History.ListHistoriesResponse> getListHistoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHistories",
      requestType = memento.History.ListHitoriesRequest.class,
      responseType = memento.History.ListHistoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<memento.History.ListHitoriesRequest,
      memento.History.ListHistoriesResponse> getListHistoriesMethod() {
    io.grpc.MethodDescriptor<memento.History.ListHitoriesRequest, memento.History.ListHistoriesResponse> getListHistoriesMethod;
    if ((getListHistoriesMethod = HistoryServiceGrpc.getListHistoriesMethod) == null) {
      synchronized (HistoryServiceGrpc.class) {
        if ((getListHistoriesMethod = HistoryServiceGrpc.getListHistoriesMethod) == null) {
          HistoryServiceGrpc.getListHistoriesMethod = getListHistoriesMethod =
              io.grpc.MethodDescriptor.<memento.History.ListHitoriesRequest, memento.History.ListHistoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHistories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  memento.History.ListHitoriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  memento.History.ListHistoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HistoryServiceMethodDescriptorSupplier("ListHistories"))
              .build();
        }
      }
    }
    return getListHistoriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<memento.History.ListKeywordsRequest,
      memento.History.ListKeywordsResponse> getListKeywordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListKeywords",
      requestType = memento.History.ListKeywordsRequest.class,
      responseType = memento.History.ListKeywordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<memento.History.ListKeywordsRequest,
      memento.History.ListKeywordsResponse> getListKeywordsMethod() {
    io.grpc.MethodDescriptor<memento.History.ListKeywordsRequest, memento.History.ListKeywordsResponse> getListKeywordsMethod;
    if ((getListKeywordsMethod = HistoryServiceGrpc.getListKeywordsMethod) == null) {
      synchronized (HistoryServiceGrpc.class) {
        if ((getListKeywordsMethod = HistoryServiceGrpc.getListKeywordsMethod) == null) {
          HistoryServiceGrpc.getListKeywordsMethod = getListKeywordsMethod =
              io.grpc.MethodDescriptor.<memento.History.ListKeywordsRequest, memento.History.ListKeywordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListKeywords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  memento.History.ListKeywordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  memento.History.ListKeywordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HistoryServiceMethodDescriptorSupplier("ListKeywords"))
              .build();
        }
      }
    }
    return getListKeywordsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HistoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HistoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HistoryServiceStub>() {
        @java.lang.Override
        public HistoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HistoryServiceStub(channel, callOptions);
        }
      };
    return HistoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HistoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HistoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HistoryServiceBlockingStub>() {
        @java.lang.Override
        public HistoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HistoryServiceBlockingStub(channel, callOptions);
        }
      };
    return HistoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HistoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HistoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HistoryServiceFutureStub>() {
        @java.lang.Override
        public HistoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HistoryServiceFutureStub(channel, callOptions);
        }
      };
    return HistoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HistoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listHistories(memento.History.ListHitoriesRequest request,
        io.grpc.stub.StreamObserver<memento.History.ListHistoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHistoriesMethod(), responseObserver);
    }

    /**
     */
    public void listKeywords(memento.History.ListKeywordsRequest request,
        io.grpc.stub.StreamObserver<memento.History.ListKeywordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListKeywordsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListHistoriesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                memento.History.ListHitoriesRequest,
                memento.History.ListHistoriesResponse>(
                  this, METHODID_LIST_HISTORIES)))
          .addMethod(
            getListKeywordsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                memento.History.ListKeywordsRequest,
                memento.History.ListKeywordsResponse>(
                  this, METHODID_LIST_KEYWORDS)))
          .build();
    }
  }

  /**
   */
  public static final class HistoryServiceStub extends io.grpc.stub.AbstractAsyncStub<HistoryServiceStub> {
    private HistoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HistoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HistoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void listHistories(memento.History.ListHitoriesRequest request,
        io.grpc.stub.StreamObserver<memento.History.ListHistoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHistoriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listKeywords(memento.History.ListKeywordsRequest request,
        io.grpc.stub.StreamObserver<memento.History.ListKeywordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListKeywordsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HistoryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HistoryServiceBlockingStub> {
    private HistoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HistoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HistoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public memento.History.ListHistoriesResponse listHistories(memento.History.ListHitoriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHistoriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public memento.History.ListKeywordsResponse listKeywords(memento.History.ListKeywordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListKeywordsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HistoryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HistoryServiceFutureStub> {
    private HistoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HistoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HistoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<memento.History.ListHistoriesResponse> listHistories(
        memento.History.ListHitoriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHistoriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<memento.History.ListKeywordsResponse> listKeywords(
        memento.History.ListKeywordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListKeywordsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_HISTORIES = 0;
  private static final int METHODID_LIST_KEYWORDS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HistoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HistoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_HISTORIES:
          serviceImpl.listHistories((memento.History.ListHitoriesRequest) request,
              (io.grpc.stub.StreamObserver<memento.History.ListHistoriesResponse>) responseObserver);
          break;
        case METHODID_LIST_KEYWORDS:
          serviceImpl.listKeywords((memento.History.ListKeywordsRequest) request,
              (io.grpc.stub.StreamObserver<memento.History.ListKeywordsResponse>) responseObserver);
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

  private static abstract class HistoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HistoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return memento.History.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HistoryService");
    }
  }

  private static final class HistoryServiceFileDescriptorSupplier
      extends HistoryServiceBaseDescriptorSupplier {
    HistoryServiceFileDescriptorSupplier() {}
  }

  private static final class HistoryServiceMethodDescriptorSupplier
      extends HistoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HistoryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HistoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HistoryServiceFileDescriptorSupplier())
              .addMethod(getListHistoriesMethod())
              .addMethod(getListKeywordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
