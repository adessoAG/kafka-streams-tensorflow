// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: master_service.proto

package org.tensorflow.distruntime;

public final class MasterServiceProtos {
  private MasterServiceProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024master_service.proto\022\017tensorflow.grpc\032" +
      "\014master.proto2\273\006\n\rMasterService\022T\n\rCreat" +
      "eSession\022 .tensorflow.CreateSessionReque" +
      "st\032!.tensorflow.CreateSessionResponse\022T\n" +
      "\rExtendSession\022 .tensorflow.ExtendSessio" +
      "nRequest\032!.tensorflow.ExtendSessionRespo" +
      "nse\022Z\n\017PartialRunSetup\022\".tensorflow.Part" +
      "ialRunSetupRequest\032#.tensorflow.PartialR" +
      "unSetupResponse\022B\n\007RunStep\022\032.tensorflow." +
      "RunStepRequest\032\033.tensorflow.RunStepRespo" +
      "nse\022Q\n\014CloseSession\022\037.tensorflow.CloseSe" +
      "ssionRequest\032 .tensorflow.CloseSessionRe" +
      "sponse\022N\n\013ListDevices\022\036.tensorflow.ListD" +
      "evicesRequest\032\037.tensorflow.ListDevicesRe" +
      "sponse\022<\n\005Reset\022\030.tensorflow.ResetReques" +
      "t\032\031.tensorflow.ResetResponse\022Q\n\014MakeCall" +
      "able\022\037.tensorflow.MakeCallableRequest\032 ." +
      "tensorflow.MakeCallableResponse\022N\n\013RunCa" +
      "llable\022\036.tensorflow.RunCallableRequest\032\037" +
      ".tensorflow.RunCallableResponse\022Z\n\017Relea" +
      "seCallable\022\".tensorflow.ReleaseCallableR" +
      "equest\032#.tensorflow.ReleaseCallableRespo" +
      "nseBq\n\032org.tensorflow.distruntimeB\023Maste" +
      "rServiceProtosP\001Z<github.com/tensorflow/" +
      "tensorflow/tensorflow/go/core/protobufb\006" +
      "proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.distruntime.DistributedRuntimeProtos.getDescriptor(),
        }, assigner);
    org.tensorflow.distruntime.DistributedRuntimeProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
