// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: master.proto

package org.tensorflow.distruntime;

public interface RunCallableResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.RunCallableResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Values of the tensors returned by the callable, in the order defined in the
   * CallableOptions.fetch field passed to MakeCallable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
   */
  java.util.List<org.tensorflow.framework.TensorProto> 
      getFetchList();
  /**
   * <pre>
   * Values of the tensors returned by the callable, in the order defined in the
   * CallableOptions.fetch field passed to MakeCallable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
   */
  org.tensorflow.framework.TensorProto getFetch(int index);
  /**
   * <pre>
   * Values of the tensors returned by the callable, in the order defined in the
   * CallableOptions.fetch field passed to MakeCallable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
   */
  int getFetchCount();
  /**
   * <pre>
   * Values of the tensors returned by the callable, in the order defined in the
   * CallableOptions.fetch field passed to MakeCallable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
   */
  java.util.List<? extends org.tensorflow.framework.TensorProtoOrBuilder> 
      getFetchOrBuilderList();
  /**
   * <pre>
   * Values of the tensors returned by the callable, in the order defined in the
   * CallableOptions.fetch field passed to MakeCallable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
   */
  org.tensorflow.framework.TensorProtoOrBuilder getFetchOrBuilder(
      int index);

  /**
   * <pre>
   * Returned metadata if requested in the options.
   * </pre>
   *
   * <code>.tensorflow.RunMetadata metadata = 2;</code>
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Returned metadata if requested in the options.
   * </pre>
   *
   * <code>.tensorflow.RunMetadata metadata = 2;</code>
   */
  org.tensorflow.framework.RunMetadata getMetadata();
  /**
   * <pre>
   * Returned metadata if requested in the options.
   * </pre>
   *
   * <code>.tensorflow.RunMetadata metadata = 2;</code>
   */
  org.tensorflow.framework.RunMetadataOrBuilder getMetadataOrBuilder();
}
