// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: named_tensor.proto

package org.tensorflow.framework;

public final class NamedTensorProtos {
  private NamedTensorProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_NamedTensorProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_NamedTensorProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022named_tensor.proto\022\ntensorflow\032\014tensor" +
      ".proto\"I\n\020NamedTensorProto\022\014\n\004name\030\001 \001(\t" +
      "\022\'\n\006tensor\030\002 \001(\0132\027.tensorflow.TensorProt" +
      "oBp\n\030org.tensorflow.frameworkB\021NamedTens" +
      "orProtosP\001Z<github.com/tensorflow/tensor" +
      "flow/tensorflow/go/core/protobuf\370\001\001b\006pro" +
      "to3"
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
          org.tensorflow.framework.TensorProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_NamedTensorProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_NamedTensorProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_NamedTensorProto_descriptor,
        new java.lang.String[] { "Name", "Tensor", });
    org.tensorflow.framework.TensorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}