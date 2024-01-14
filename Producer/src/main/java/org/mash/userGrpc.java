package org.mash;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: user.proto")
public final class userGrpc {

  private userGrpc() {}

  public static final String SERVICE_NAME = "user";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.mash.User.RegistrationRequest,
      org.mash.User.RegistrationResponse> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = org.mash.User.RegistrationRequest.class,
      responseType = org.mash.User.RegistrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mash.User.RegistrationRequest,
      org.mash.User.RegistrationResponse> getRegisterMethod() {
    io.grpc.MethodDescriptor<org.mash.User.RegistrationRequest, org.mash.User.RegistrationResponse> getRegisterMethod;
    if ((getRegisterMethod = userGrpc.getRegisterMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getRegisterMethod = userGrpc.getRegisterMethod) == null) {
          userGrpc.getRegisterMethod = getRegisterMethod = 
              io.grpc.MethodDescriptor.<org.mash.User.RegistrationRequest, org.mash.User.RegistrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mash.User.RegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mash.User.RegistrationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("Register"))
                  .build();
          }
        }
     }
     return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mash.User.LoginRequest,
      org.mash.User.Response> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = org.mash.User.LoginRequest.class,
      responseType = org.mash.User.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mash.User.LoginRequest,
      org.mash.User.Response> getLoginMethod() {
    io.grpc.MethodDescriptor<org.mash.User.LoginRequest, org.mash.User.Response> getLoginMethod;
    if ((getLoginMethod = userGrpc.getLoginMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getLoginMethod = userGrpc.getLoginMethod) == null) {
          userGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<org.mash.User.LoginRequest, org.mash.User.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mash.User.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mash.User.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("Login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mash.User.LogoutRequest,
      org.mash.User.Response> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Logout",
      requestType = org.mash.User.LogoutRequest.class,
      responseType = org.mash.User.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mash.User.LogoutRequest,
      org.mash.User.Response> getLogoutMethod() {
    io.grpc.MethodDescriptor<org.mash.User.LogoutRequest, org.mash.User.Response> getLogoutMethod;
    if ((getLogoutMethod = userGrpc.getLogoutMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getLogoutMethod = userGrpc.getLogoutMethod) == null) {
          userGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<org.mash.User.LogoutRequest, org.mash.User.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "Logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mash.User.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mash.User.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("Logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mash.User.ProfileRequest,
      org.mash.User.ProfileResponse> getCreateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProfile",
      requestType = org.mash.User.ProfileRequest.class,
      responseType = org.mash.User.ProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mash.User.ProfileRequest,
      org.mash.User.ProfileResponse> getCreateProfileMethod() {
    io.grpc.MethodDescriptor<org.mash.User.ProfileRequest, org.mash.User.ProfileResponse> getCreateProfileMethod;
    if ((getCreateProfileMethod = userGrpc.getCreateProfileMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getCreateProfileMethod = userGrpc.getCreateProfileMethod) == null) {
          userGrpc.getCreateProfileMethod = getCreateProfileMethod = 
              io.grpc.MethodDescriptor.<org.mash.User.ProfileRequest, org.mash.User.ProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "CreateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mash.User.ProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mash.User.ProfileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("CreateProfile"))
                  .build();
          }
        }
     }
     return getCreateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mash.User.UpdateProfileRequest,
      org.mash.User.ProfileResponse> getUpdateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProfile",
      requestType = org.mash.User.UpdateProfileRequest.class,
      responseType = org.mash.User.ProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mash.User.UpdateProfileRequest,
      org.mash.User.ProfileResponse> getUpdateProfileMethod() {
    io.grpc.MethodDescriptor<org.mash.User.UpdateProfileRequest, org.mash.User.ProfileResponse> getUpdateProfileMethod;
    if ((getUpdateProfileMethod = userGrpc.getUpdateProfileMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getUpdateProfileMethod = userGrpc.getUpdateProfileMethod) == null) {
          userGrpc.getUpdateProfileMethod = getUpdateProfileMethod = 
              io.grpc.MethodDescriptor.<org.mash.User.UpdateProfileRequest, org.mash.User.ProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "UpdateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mash.User.UpdateProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mash.User.ProfileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("UpdateProfile"))
                  .build();
          }
        }
     }
     return getUpdateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mash.User.ShowUserProfileRequest,
      org.mash.User.ShowUserProfileResponse> getShowUserProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShowUserProfile",
      requestType = org.mash.User.ShowUserProfileRequest.class,
      responseType = org.mash.User.ShowUserProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mash.User.ShowUserProfileRequest,
      org.mash.User.ShowUserProfileResponse> getShowUserProfileMethod() {
    io.grpc.MethodDescriptor<org.mash.User.ShowUserProfileRequest, org.mash.User.ShowUserProfileResponse> getShowUserProfileMethod;
    if ((getShowUserProfileMethod = userGrpc.getShowUserProfileMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getShowUserProfileMethod = userGrpc.getShowUserProfileMethod) == null) {
          userGrpc.getShowUserProfileMethod = getShowUserProfileMethod = 
              io.grpc.MethodDescriptor.<org.mash.User.ShowUserProfileRequest, org.mash.User.ShowUserProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "ShowUserProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mash.User.ShowUserProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mash.User.ShowUserProfileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("ShowUserProfile"))
                  .build();
          }
        }
     }
     return getShowUserProfileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userStub newStub(io.grpc.Channel channel) {
    return new userStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userFutureStub(channel);
  }

  /**
   */
  public static abstract class userImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(org.mash.User.RegistrationRequest request,
        io.grpc.stub.StreamObserver<org.mash.User.RegistrationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void login(org.mash.User.LoginRequest request,
        io.grpc.stub.StreamObserver<org.mash.User.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(org.mash.User.LogoutRequest request,
        io.grpc.stub.StreamObserver<org.mash.User.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     */
    public void createProfile(org.mash.User.ProfileRequest request,
        io.grpc.stub.StreamObserver<org.mash.User.ProfileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateProfileMethod(), responseObserver);
    }

    /**
     */
    public void updateProfile(org.mash.User.UpdateProfileRequest request,
        io.grpc.stub.StreamObserver<org.mash.User.ProfileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProfileMethod(), responseObserver);
    }

    /**
     */
    public void showUserProfile(org.mash.User.ShowUserProfileRequest request,
        io.grpc.stub.StreamObserver<org.mash.User.ShowUserProfileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowUserProfileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.mash.User.RegistrationRequest,
                org.mash.User.RegistrationResponse>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.mash.User.LoginRequest,
                org.mash.User.Response>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.mash.User.LogoutRequest,
                org.mash.User.Response>(
                  this, METHODID_LOGOUT)))
          .addMethod(
            getCreateProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.mash.User.ProfileRequest,
                org.mash.User.ProfileResponse>(
                  this, METHODID_CREATE_PROFILE)))
          .addMethod(
            getUpdateProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.mash.User.UpdateProfileRequest,
                org.mash.User.ProfileResponse>(
                  this, METHODID_UPDATE_PROFILE)))
          .addMethod(
            getShowUserProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.mash.User.ShowUserProfileRequest,
                org.mash.User.ShowUserProfileResponse>(
                  this, METHODID_SHOW_USER_PROFILE)))
          .build();
    }
  }

  /**
   */
  public static final class userStub extends io.grpc.stub.AbstractStub<userStub> {
    private userStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userStub(channel, callOptions);
    }

    /**
     */
    public void register(org.mash.User.RegistrationRequest request,
        io.grpc.stub.StreamObserver<org.mash.User.RegistrationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(org.mash.User.LoginRequest request,
        io.grpc.stub.StreamObserver<org.mash.User.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(org.mash.User.LogoutRequest request,
        io.grpc.stub.StreamObserver<org.mash.User.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createProfile(org.mash.User.ProfileRequest request,
        io.grpc.stub.StreamObserver<org.mash.User.ProfileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProfile(org.mash.User.UpdateProfileRequest request,
        io.grpc.stub.StreamObserver<org.mash.User.ProfileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void showUserProfile(org.mash.User.ShowUserProfileRequest request,
        io.grpc.stub.StreamObserver<org.mash.User.ShowUserProfileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowUserProfileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userBlockingStub extends io.grpc.stub.AbstractStub<userBlockingStub> {
    private userBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.mash.User.RegistrationResponse register(org.mash.User.RegistrationRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.mash.User.Response login(org.mash.User.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.mash.User.Response logout(org.mash.User.LogoutRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.mash.User.ProfileResponse createProfile(org.mash.User.ProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.mash.User.ProfileResponse updateProfile(org.mash.User.UpdateProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.mash.User.ShowUserProfileResponse showUserProfile(org.mash.User.ShowUserProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowUserProfileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userFutureStub extends io.grpc.stub.AbstractStub<userFutureStub> {
    private userFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mash.User.RegistrationResponse> register(
        org.mash.User.RegistrationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mash.User.Response> login(
        org.mash.User.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mash.User.Response> logout(
        org.mash.User.LogoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mash.User.ProfileResponse> createProfile(
        org.mash.User.ProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mash.User.ProfileResponse> updateProfile(
        org.mash.User.UpdateProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mash.User.ShowUserProfileResponse> showUserProfile(
        org.mash.User.ShowUserProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowUserProfileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_LOGOUT = 2;
  private static final int METHODID_CREATE_PROFILE = 3;
  private static final int METHODID_UPDATE_PROFILE = 4;
  private static final int METHODID_SHOW_USER_PROFILE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((org.mash.User.RegistrationRequest) request,
              (io.grpc.stub.StreamObserver<org.mash.User.RegistrationResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((org.mash.User.LoginRequest) request,
              (io.grpc.stub.StreamObserver<org.mash.User.Response>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((org.mash.User.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<org.mash.User.Response>) responseObserver);
          break;
        case METHODID_CREATE_PROFILE:
          serviceImpl.createProfile((org.mash.User.ProfileRequest) request,
              (io.grpc.stub.StreamObserver<org.mash.User.ProfileResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROFILE:
          serviceImpl.updateProfile((org.mash.User.UpdateProfileRequest) request,
              (io.grpc.stub.StreamObserver<org.mash.User.ProfileResponse>) responseObserver);
          break;
        case METHODID_SHOW_USER_PROFILE:
          serviceImpl.showUserProfile((org.mash.User.ShowUserProfileRequest) request,
              (io.grpc.stub.StreamObserver<org.mash.User.ShowUserProfileResponse>) responseObserver);
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

  private static abstract class userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.mash.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("user");
    }
  }

  private static final class userFileDescriptorSupplier
      extends userBaseDescriptorSupplier {
    userFileDescriptorSupplier() {}
  }

  private static final class userMethodDescriptorSupplier
      extends userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userMethodDescriptorSupplier(String methodName) {
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
      synchronized (userGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getCreateProfileMethod())
              .addMethod(getUpdateProfileMethod())
              .addMethod(getShowUserProfileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
