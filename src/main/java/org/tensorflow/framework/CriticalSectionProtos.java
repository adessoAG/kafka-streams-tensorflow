// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: critical_section.proto

package org.tensorflow.framework;

public final class CriticalSectionProtos {
  private CriticalSectionProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CriticalSectionDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CriticalSectionDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CriticalSectionExecutionDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CriticalSectionExecutionDef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026critical_section.proto\022\ntensorflow\"3\n\022" +
      "CriticalSectionDef\022\035\n\025critical_section_n" +
      "ame\030\001 \001(\t\"j\n\033CriticalSectionExecutionDef" +
      "\022(\n execute_in_critical_section_name\030\001 \001" +
      "(\t\022!\n\031exclusive_resource_access\030\002 \001(\010Bt\n" +
      "\030org.tensorflow.frameworkB\025CriticalSecti" +
      "onProtosP\001Z<github.com/tensorflow/tensor" +
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
        }, assigner);
    internal_static_tensorflow_CriticalSectionDef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_CriticalSectionDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CriticalSectionDef_descriptor,
        new java.lang.String[] { "CriticalSectionName", });
    internal_static_tensorflow_CriticalSectionExecutionDef_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_CriticalSectionExecutionDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CriticalSectionExecutionDef_descriptor,
        new java.lang.String[] { "ExecuteInCriticalSectionName", "ExclusiveResourceAccess", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
