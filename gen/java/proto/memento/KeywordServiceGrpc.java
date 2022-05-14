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
  private static volatile io.grpc.MethodDescriptor<memento.Keyword.ListKeywordHistoriesRequest,
      memento.Keyword.ListKeywordHistoriesResponse> getListKeywordHistoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListKeywordHistories",
      requestType = memento.Keyword.ListKeywordHistoriesRequest.class,
      responseType = memento.Keyword.ListKeywordHistoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<memento.Keyword.ListKeywordHistoriesRequest,
      memento.Keyword.ListKeywordHistoriesResponse> getListKeywordHistoriesMethod() {
    io.grpc.MethodDescriptor<memento.Keyword.ListKeywordHistoriesRequest, memento.Keyword.ListKeywordHistoriesResponse> getListKeywordHistoriesMethod;
    if ((getListKeywordHistoriesMethod = KeywordServiceGrpc.getListKeywordHistoriesMethod) == null) {
      synchronized (KeywordServiceGrpc.class) {
        if ((getListKeywordHistoriesMethod = KeywordServiceGrpc.getListKeywordHistoriesMethod) == null) {
          KeywordServiceGrpc.getListKeywordHistoriesMethod = getListKeywordHistoriesMethod =
              io.grpc.MethodDescriptor.<memento.Keyword.ListKeywordHistoriesRequest, memento.Keyword.ListKeywordHistoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListKeywordHistories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  memento.Keyword.ListKeywordHistoriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  memento.Keyword.ListKeywordHistoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordServiceMethodDescriptorSupplier("ListKeywordHistories"))
              .build();
        }
      }
    }
    return getListKeywordHistoriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<memento.Keyword.UpdateSolutionURLRequest,
      com.google.protobuf.Empty> getUpdateSolutionURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSolutionURL",
      requestType = memento.Keyword.UpdateSolutionURLRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<memento.Keyword.UpdateSolutionURLRequest,
      com.google.protobuf.Empty> getUpdateSolutionURLMethod() {
    io.grpc.MethodDescriptor<memento.Keyword.UpdateSolutionURLRequest, com.google.protobuf.Empty> getUpdateSolutionURLMethod;
    if ((getUpdateSolutionURLMethod = KeywordServiceGrpc.getUpdateSolutionURLMethod) == null) {
      synchronized (KeywordServiceGrpc.class) {
        if ((getUpdateSolutionURLMethod = KeywordServiceGrpc.getUpdateSolutionURLMethod) == null) {
          KeywordServiceGrpc.getUpdateSolutionURLMethod = getUpdateSolutionURLMethod =
              io.grpc.MethodDescriptor.<memento.Keyword.UpdateSolutionURLRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSolutionURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  memento.Keyword.UpdateSolutionURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordServiceMethodDescriptorSupplier("UpdateSolutionURL"))
              .build();
        }
      }
    }
    return getUpdateSolutionURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<memento.Keyword.UpdateResolvedURLRequest,
      com.google.protobuf.Empty> getUpdateResolvedURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateResolvedURL",
      requestType = memento.Keyword.UpdateResolvedURLRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<memento.Keyword.UpdateResolvedURLRequest,
      com.google.protobuf.Empty> getUpdateResolvedURLMethod() {
    io.grpc.MethodDescriptor<memento.Keyword.UpdateResolvedURLRequest, com.google.protobuf.Empty> getUpdateResolvedURLMethod;
    if ((getUpdateResolvedURLMethod = KeywordServiceGrpc.getUpdateResolvedURLMethod) == null) {
      synchronized (KeywordServiceGrpc.class) {
        if ((getUpdateResolvedURLMethod = KeywordServiceGrpc.getUpdateResolvedURLMethod) == null) {
          KeywordServiceGrpc.getUpdateResolvedURLMethod = getUpdateResolvedURLMethod =
              io.grpc.MethodDescriptor.<memento.Keyword.UpdateResolvedURLRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateResolvedURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  memento.Keyword.UpdateResolvedURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordServiceMethodDescriptorSupplier("UpdateResolvedURL"))
              .build();
        }
      }
    }
    return getUpdateResolvedURLMethod;
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
    public void listKeywordHistories(memento.Keyword.ListKeywordHistoriesRequest request,
        io.grpc.stub.StreamObserver<memento.Keyword.ListKeywordHistoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListKeywordHistoriesMethod(), responseObserver);
    }

    /**
     */
    public void updateSolutionURL(memento.Keyword.UpdateSolutionURLRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSolutionURLMethod(), responseObserver);
    }

    /**
     */
    public void updateResolvedURL(memento.Keyword.UpdateResolvedURLRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateResolvedURLMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListKeywordHistoriesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                memento.Keyword.ListKeywordHistoriesRequest,
                memento.Keyword.ListKeywordHistoriesResponse>(
                  this, METHODID_LIST_KEYWORD_HISTORIES)))
          .addMethod(
            getUpdateSolutionURLMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                memento.Keyword.UpdateSolutionURLRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_SOLUTION_URL)))
          .addMethod(
            getUpdateResolvedURLMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                memento.Keyword.UpdateResolvedURLRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_RESOLVED_URL)))
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
    public void listKeywordHistories(memento.Keyword.ListKeywordHistoriesRequest request,
        io.grpc.stub.StreamObserver<memento.Keyword.ListKeywordHistoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListKeywordHistoriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSolutionURL(memento.Keyword.UpdateSolutionURLRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSolutionURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateResolvedURL(memento.Keyword.UpdateResolvedURLRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateResolvedURLMethod(), getCallOptions()), request, responseObserver);
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
    public memento.Keyword.ListKeywordHistoriesResponse listKeywordHistories(memento.Keyword.ListKeywordHistoriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListKeywordHistoriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateSolutionURL(memento.Keyword.UpdateSolutionURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSolutionURLMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateResolvedURL(memento.Keyword.UpdateResolvedURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateResolvedURLMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<memento.Keyword.ListKeywordHistoriesResponse> listKeywordHistories(
        memento.Keyword.ListKeywordHistoriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListKeywordHistoriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateSolutionURL(
        memento.Keyword.UpdateSolutionURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSolutionURLMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateResolvedURL(
        memento.Keyword.UpdateResolvedURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateResolvedURLMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_KEYWORD_HISTORIES = 0;
  private static final int METHODID_UPDATE_SOLUTION_URL = 1;
  private static final int METHODID_UPDATE_RESOLVED_URL = 2;

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
        case METHODID_LIST_KEYWORD_HISTORIES:
          serviceImpl.listKeywordHistories((memento.Keyword.ListKeywordHistoriesRequest) request,
              (io.grpc.stub.StreamObserver<memento.Keyword.ListKeywordHistoriesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SOLUTION_URL:
          serviceImpl.updateSolutionURL((memento.Keyword.UpdateSolutionURLRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_RESOLVED_URL:
          serviceImpl.updateResolvedURL((memento.Keyword.UpdateResolvedURLRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
              .addMethod(getListKeywordHistoriesMethod())
              .addMethod(getUpdateSolutionURLMethod())
              .addMethod(getUpdateResolvedURLMethod())
              .build();
        }
      }
    }
    return result;
  }
}
