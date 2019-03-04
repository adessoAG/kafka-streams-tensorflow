// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: named_tensor.proto

package org.tensorflow.framework;

public interface NamedTensorProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.NamedTensorProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the tensor.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the tensor.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The client can populate a TensorProto using a tensorflow::Tensor`, or
   * directly using the protobuf field accessors.
   * The client specifies whether the returned tensor values should be
   * filled tensor fields (float_val, int_val, etc.) or encoded in a
   * compact form in tensor.tensor_content.
   * </pre>
   *
   * <code>.tensorflow.TensorProto tensor = 2;</code>
   */
  boolean hasTensor();
  /**
   * <pre>
   * The client can populate a TensorProto using a tensorflow::Tensor`, or
   * directly using the protobuf field accessors.
   * The client specifies whether the returned tensor values should be
   * filled tensor fields (float_val, int_val, etc.) or encoded in a
   * compact form in tensor.tensor_content.
   * </pre>
   *
   * <code>.tensorflow.TensorProto tensor = 2;</code>
   */
  org.tensorflow.framework.TensorProto getTensor();
  /**
   * <pre>
   * The client can populate a TensorProto using a tensorflow::Tensor`, or
   * directly using the protobuf field accessors.
   * The client specifies whether the returned tensor values should be
   * filled tensor fields (float_val, int_val, etc.) or encoded in a
   * compact form in tensor.tensor_content.
   * </pre>
   *
   * <code>.tensorflow.TensorProto tensor = 2;</code>
   */
  org.tensorflow.framework.TensorProtoOrBuilder getTensorOrBuilder();
}
