// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: master.proto

package org.tensorflow.distruntime;

public final class DistributedRuntimeProtos {
  private DistributedRuntimeProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CreateSessionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CreateSessionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CreateSessionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CreateSessionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ExtendSessionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ExtendSessionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ExtendSessionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ExtendSessionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunStepRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunStepRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunStepResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunStepResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_PartialRunSetupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_PartialRunSetupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_PartialRunSetupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_PartialRunSetupResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CloseSessionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CloseSessionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CloseSessionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CloseSessionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ResetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ResetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ResetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ResetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ListDevicesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ListDevicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ListDevicesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ListDevicesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_MakeCallableRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_MakeCallableRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_MakeCallableResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_MakeCallableResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunCallableRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunCallableRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunCallableResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunCallableResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ReleaseCallableRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ReleaseCallableRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ReleaseCallableResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ReleaseCallableResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014master.proto\022\ntensorflow\032\027device_attri" +
      "butes.proto\032\013graph.proto\032\014tensor.proto\032\021" +
      "error_codes.proto\032\014config.proto\032\022named_t" +
      "ensor.proto\"x\n\024CreateSessionRequest\022\'\n\tg" +
      "raph_def\030\001 \001(\0132\024.tensorflow.GraphDef\022\'\n\006" +
      "config\030\002 \001(\0132\027.tensorflow.ConfigProto\022\016\n" +
      "\006target\030\003 \001(\t\"F\n\025CreateSessionResponse\022\026" +
      "\n\016session_handle\030\001 \001(\t\022\025\n\rgraph_version\030" +
      "\002 \001(\003\"v\n\024ExtendSessionRequest\022\026\n\016session" +
      "_handle\030\001 \001(\t\022\'\n\tgraph_def\030\002 \001(\0132\024.tenso" +
      "rflow.GraphDef\022\035\n\025current_graph_version\030" +
      "\003 \001(\003\"2\n\025ExtendSessionResponse\022\031\n\021new_gr" +
      "aph_version\030\004 \001(\003\"\337\001\n\016RunStepRequest\022\026\n\016" +
      "session_handle\030\001 \001(\t\022*\n\004feed\030\002 \003(\0132\034.ten" +
      "sorflow.NamedTensorProto\022\r\n\005fetch\030\003 \003(\t\022" +
      "\016\n\006target\030\004 \003(\t\022\'\n\007options\030\005 \001(\0132\026.tenso" +
      "rflow.RunOptions\022\032\n\022partial_run_handle\030\006" +
      " \001(\t\022%\n\035store_errors_in_response_body\030\007 " +
      "\001(\010\"\265\001\n\017RunStepResponse\022,\n\006tensor\030\001 \003(\0132" +
      "\034.tensorflow.NamedTensorProto\022)\n\010metadat" +
      "a\030\002 \001(\0132\027.tensorflow.RunMetadata\022+\n\013stat" +
      "us_code\030\003 \001(\0162\026.tensorflow.error.Code\022\034\n" +
      "\024status_error_message\030\004 \001(\t\"]\n\026PartialRu" +
      "nSetupRequest\022\026\n\016session_handle\030\001 \001(\t\022\014\n" +
      "\004feed\030\002 \003(\t\022\r\n\005fetch\030\003 \003(\t\022\016\n\006target\030\004 \003" +
      "(\t\"5\n\027PartialRunSetupResponse\022\032\n\022partial" +
      "_run_handle\030\001 \001(\t\"-\n\023CloseSessionRequest" +
      "\022\026\n\016session_handle\030\001 \001(\t\"\026\n\024CloseSession" +
      "Response\"9\n\014ResetRequest\022\021\n\tcontainer\030\001 " +
      "\003(\t\022\026\n\016device_filters\030\002 \003(\t\"\017\n\rResetResp" +
      "onse\",\n\022ListDevicesRequest\022\026\n\016session_ha" +
      "ndle\030\001 \001(\t\"~\n\023ListDevicesResponse\0222\n\014loc" +
      "al_device\030\001 \003(\0132\034.tensorflow.DeviceAttri" +
      "butes\0223\n\rremote_device\030\002 \003(\0132\034.tensorflo" +
      "w.DeviceAttributes\"[\n\023MakeCallableReques" +
      "t\022\026\n\016session_handle\030\001 \001(\t\022,\n\007options\030\002 \001" +
      "(\0132\033.tensorflow.CallableOptions\"&\n\024MakeC" +
      "allableResponse\022\016\n\006handle\030\001 \001(\003\"c\n\022RunCa" +
      "llableRequest\022\026\n\016session_handle\030\001 \001(\t\022\016\n" +
      "\006handle\030\002 \001(\003\022%\n\004feed\030\003 \003(\0132\027.tensorflow" +
      ".TensorProto\"h\n\023RunCallableResponse\022&\n\005f" +
      "etch\030\001 \003(\0132\027.tensorflow.TensorProto\022)\n\010m" +
      "etadata\030\002 \001(\0132\027.tensorflow.RunMetadata\"@" +
      "\n\026ReleaseCallableRequest\022\026\n\016session_hand" +
      "le\030\001 \001(\t\022\016\n\006handle\030\002 \001(\003\"\031\n\027ReleaseCalla" +
      "bleResponseBy\n\032org.tensorflow.distruntim" +
      "eB\030DistributedRuntimeProtosP\001Z<github.co" +
      "m/tensorflow/tensorflow/tensorflow/go/co" +
      "re/protobuf\370\001\001b\006proto3"
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
          org.tensorflow.framework.DeviceAttributesProtos.getDescriptor(),
          org.tensorflow.framework.GraphProtos.getDescriptor(),
          org.tensorflow.framework.TensorProtos.getDescriptor(),
          org.tensorflow.framework.ErrorCodesProtos.getDescriptor(),
          org.tensorflow.framework.ConfigProtos.getDescriptor(),
          org.tensorflow.framework.NamedTensorProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_CreateSessionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_CreateSessionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CreateSessionRequest_descriptor,
        new java.lang.String[] { "GraphDef", "Config", "Target", });
    internal_static_tensorflow_CreateSessionResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_CreateSessionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CreateSessionResponse_descriptor,
        new java.lang.String[] { "SessionHandle", "GraphVersion", });
    internal_static_tensorflow_ExtendSessionRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_ExtendSessionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ExtendSessionRequest_descriptor,
        new java.lang.String[] { "SessionHandle", "GraphDef", "CurrentGraphVersion", });
    internal_static_tensorflow_ExtendSessionResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_ExtendSessionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ExtendSessionResponse_descriptor,
        new java.lang.String[] { "NewGraphVersion", });
    internal_static_tensorflow_RunStepRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_RunStepRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunStepRequest_descriptor,
        new java.lang.String[] { "SessionHandle", "Feed", "Fetch", "Target", "Options", "PartialRunHandle", "StoreErrorsInResponseBody", });
    internal_static_tensorflow_RunStepResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_RunStepResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunStepResponse_descriptor,
        new java.lang.String[] { "Tensor", "Metadata", "StatusCode", "StatusErrorMessage", });
    internal_static_tensorflow_PartialRunSetupRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tensorflow_PartialRunSetupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_PartialRunSetupRequest_descriptor,
        new java.lang.String[] { "SessionHandle", "Feed", "Fetch", "Target", });
    internal_static_tensorflow_PartialRunSetupResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_tensorflow_PartialRunSetupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_PartialRunSetupResponse_descriptor,
        new java.lang.String[] { "PartialRunHandle", });
    internal_static_tensorflow_CloseSessionRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_tensorflow_CloseSessionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CloseSessionRequest_descriptor,
        new java.lang.String[] { "SessionHandle", });
    internal_static_tensorflow_CloseSessionResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_tensorflow_CloseSessionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CloseSessionResponse_descriptor,
        new java.lang.String[] { });
    internal_static_tensorflow_ResetRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_tensorflow_ResetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ResetRequest_descriptor,
        new java.lang.String[] { "Container", "DeviceFilters", });
    internal_static_tensorflow_ResetResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_tensorflow_ResetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ResetResponse_descriptor,
        new java.lang.String[] { });
    internal_static_tensorflow_ListDevicesRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_tensorflow_ListDevicesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ListDevicesRequest_descriptor,
        new java.lang.String[] { "SessionHandle", });
    internal_static_tensorflow_ListDevicesResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_tensorflow_ListDevicesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ListDevicesResponse_descriptor,
        new java.lang.String[] { "LocalDevice", "RemoteDevice", });
    internal_static_tensorflow_MakeCallableRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_tensorflow_MakeCallableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_MakeCallableRequest_descriptor,
        new java.lang.String[] { "SessionHandle", "Options", });
    internal_static_tensorflow_MakeCallableResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_tensorflow_MakeCallableResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_MakeCallableResponse_descriptor,
        new java.lang.String[] { "Handle", });
    internal_static_tensorflow_RunCallableRequest_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_tensorflow_RunCallableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunCallableRequest_descriptor,
        new java.lang.String[] { "SessionHandle", "Handle", "Feed", });
    internal_static_tensorflow_RunCallableResponse_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_tensorflow_RunCallableResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunCallableResponse_descriptor,
        new java.lang.String[] { "Fetch", "Metadata", });
    internal_static_tensorflow_ReleaseCallableRequest_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_tensorflow_ReleaseCallableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ReleaseCallableRequest_descriptor,
        new java.lang.String[] { "SessionHandle", "Handle", });
    internal_static_tensorflow_ReleaseCallableResponse_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_tensorflow_ReleaseCallableResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ReleaseCallableResponse_descriptor,
        new java.lang.String[] { });
    org.tensorflow.framework.DeviceAttributesProtos.getDescriptor();
    org.tensorflow.framework.GraphProtos.getDescriptor();
    org.tensorflow.framework.TensorProtos.getDescriptor();
    org.tensorflow.framework.ErrorCodesProtos.getDescriptor();
    org.tensorflow.framework.ConfigProtos.getDescriptor();
    org.tensorflow.framework.NamedTensorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
