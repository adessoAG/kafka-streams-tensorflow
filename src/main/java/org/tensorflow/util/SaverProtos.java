// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: saver.proto

package org.tensorflow.util;

public final class SaverProtos {
  private SaverProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SaverDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SaverDef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013saver.proto\022\ntensorflow\"\236\002\n\010SaverDef\022\034" +
      "\n\024filename_tensor_name\030\001 \001(\t\022\030\n\020save_ten" +
      "sor_name\030\002 \001(\t\022\027\n\017restore_op_name\030\003 \001(\t\022" +
      "\023\n\013max_to_keep\030\004 \001(\005\022\017\n\007sharded\030\005 \001(\010\022%\n" +
      "\035keep_checkpoint_every_n_hours\030\006 \001(\002\022=\n\007" +
      "version\030\007 \001(\0162,.tensorflow.SaverDef.Chec" +
      "kpointFormatVersion\"5\n\027CheckpointFormatV" +
      "ersion\022\n\n\006LEGACY\020\000\022\006\n\002V1\020\001\022\006\n\002V2\020\002Be\n\023or" +
      "g.tensorflow.utilB\013SaverProtosP\001Z<github" +
      ".com/tensorflow/tensorflow/tensorflow/go" +
      "/core/protobuf\370\001\001b\006proto3"
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
        }, assigner);
    internal_static_tensorflow_SaverDef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_SaverDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SaverDef_descriptor,
        new java.lang.String[] { "FilenameTensorName", "SaveTensorName", "RestoreOpName", "MaxToKeep", "Sharded", "KeepCheckpointEveryNHours", "Version", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
