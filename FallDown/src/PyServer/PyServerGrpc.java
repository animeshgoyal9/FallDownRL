package PyServer;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: PyServer.proto")
public final class PyServerGrpc {

  private PyServerGrpc() {}

  public static final String SERVICE_NAME = "PyServer.PyServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<PyServer.PyServerOuterClass.RewardRequest,
      PyServer.PyServerOuterClass.RewardResponse> getSendRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendRewards",
      requestType = PyServer.PyServerOuterClass.RewardRequest.class,
      responseType = PyServer.PyServerOuterClass.RewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PyServer.PyServerOuterClass.RewardRequest,
      PyServer.PyServerOuterClass.RewardResponse> getSendRewardsMethod() {
    io.grpc.MethodDescriptor<PyServer.PyServerOuterClass.RewardRequest, PyServer.PyServerOuterClass.RewardResponse> getSendRewardsMethod;
    if ((getSendRewardsMethod = PyServerGrpc.getSendRewardsMethod) == null) {
      synchronized (PyServerGrpc.class) {
        if ((getSendRewardsMethod = PyServerGrpc.getSendRewardsMethod) == null) {
          PyServerGrpc.getSendRewardsMethod = getSendRewardsMethod =
              io.grpc.MethodDescriptor.<PyServer.PyServerOuterClass.RewardRequest, PyServer.PyServerOuterClass.RewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PyServer.PyServerOuterClass.RewardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PyServer.PyServerOuterClass.RewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PyServerMethodDescriptorSupplier("sendRewards"))
              .build();
        }
      }
    }
    return getSendRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<PyServer.PyServerOuterClass.Location,
      PyServer.PyServerOuterClass.Action> getSentLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sentLocation",
      requestType = PyServer.PyServerOuterClass.Location.class,
      responseType = PyServer.PyServerOuterClass.Action.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PyServer.PyServerOuterClass.Location,
      PyServer.PyServerOuterClass.Action> getSentLocationMethod() {
    io.grpc.MethodDescriptor<PyServer.PyServerOuterClass.Location, PyServer.PyServerOuterClass.Action> getSentLocationMethod;
    if ((getSentLocationMethod = PyServerGrpc.getSentLocationMethod) == null) {
      synchronized (PyServerGrpc.class) {
        if ((getSentLocationMethod = PyServerGrpc.getSentLocationMethod) == null) {
          PyServerGrpc.getSentLocationMethod = getSentLocationMethod =
              io.grpc.MethodDescriptor.<PyServer.PyServerOuterClass.Location, PyServer.PyServerOuterClass.Action>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sentLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PyServer.PyServerOuterClass.Location.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PyServer.PyServerOuterClass.Action.getDefaultInstance()))
              .setSchemaDescriptor(new PyServerMethodDescriptorSupplier("sentLocation"))
              .build();
        }
      }
    }
    return getSentLocationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PyServerStub newStub(io.grpc.Channel channel) {
    return new PyServerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PyServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PyServerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PyServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PyServerFutureStub(channel);
  }

  /**
   */
  public static abstract class PyServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendRewards(PyServer.PyServerOuterClass.RewardRequest request,
        io.grpc.stub.StreamObserver<PyServer.PyServerOuterClass.RewardResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendRewardsMethod(), responseObserver);
    }

    /**
     */
    public void sentLocation(PyServer.PyServerOuterClass.Location request,
        io.grpc.stub.StreamObserver<PyServer.PyServerOuterClass.Action> responseObserver) {
      asyncUnimplementedUnaryCall(getSentLocationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendRewardsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                PyServer.PyServerOuterClass.RewardRequest,
                PyServer.PyServerOuterClass.RewardResponse>(
                  this, METHODID_SEND_REWARDS)))
          .addMethod(
            getSentLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                PyServer.PyServerOuterClass.Location,
                PyServer.PyServerOuterClass.Action>(
                  this, METHODID_SENT_LOCATION)))
          .build();
    }
  }

  /**
   */
  public static final class PyServerStub extends io.grpc.stub.AbstractStub<PyServerStub> {
    private PyServerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PyServerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PyServerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PyServerStub(channel, callOptions);
    }

    /**
     */
    public void sendRewards(PyServer.PyServerOuterClass.RewardRequest request,
        io.grpc.stub.StreamObserver<PyServer.PyServerOuterClass.RewardResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sentLocation(PyServer.PyServerOuterClass.Location request,
        io.grpc.stub.StreamObserver<PyServer.PyServerOuterClass.Action> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSentLocationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PyServerBlockingStub extends io.grpc.stub.AbstractStub<PyServerBlockingStub> {
    private PyServerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PyServerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PyServerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PyServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public PyServer.PyServerOuterClass.RewardResponse sendRewards(PyServer.PyServerOuterClass.RewardRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendRewardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public PyServer.PyServerOuterClass.Action sentLocation(PyServer.PyServerOuterClass.Location request) {
      return blockingUnaryCall(
          getChannel(), getSentLocationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PyServerFutureStub extends io.grpc.stub.AbstractStub<PyServerFutureStub> {
    private PyServerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PyServerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PyServerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PyServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<PyServer.PyServerOuterClass.RewardResponse> sendRewards(
        PyServer.PyServerOuterClass.RewardRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendRewardsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<PyServer.PyServerOuterClass.Action> sentLocation(
        PyServer.PyServerOuterClass.Location request) {
      return futureUnaryCall(
          getChannel().newCall(getSentLocationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_REWARDS = 0;
  private static final int METHODID_SENT_LOCATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PyServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PyServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_REWARDS:
          serviceImpl.sendRewards((PyServer.PyServerOuterClass.RewardRequest) request,
              (io.grpc.stub.StreamObserver<PyServer.PyServerOuterClass.RewardResponse>) responseObserver);
          break;
        case METHODID_SENT_LOCATION:
          serviceImpl.sentLocation((PyServer.PyServerOuterClass.Location) request,
              (io.grpc.stub.StreamObserver<PyServer.PyServerOuterClass.Action>) responseObserver);
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

  private static abstract class PyServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PyServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return PyServer.PyServerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PyServer");
    }
  }

  private static final class PyServerFileDescriptorSupplier
      extends PyServerBaseDescriptorSupplier {
    PyServerFileDescriptorSupplier() {}
  }

  private static final class PyServerMethodDescriptorSupplier
      extends PyServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PyServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (PyServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PyServerFileDescriptorSupplier())
              .addMethod(getSendRewardsMethod())
              .addMethod(getSentLocationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
