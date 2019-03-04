// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: saved_tensor_slice.proto

package org.tensorflow.util;

public interface SavedSliceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.SavedSlice)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the tensor that this slice belongs to. This must be identical to
   * the name used to encode the key for this record.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the tensor that this slice belongs to. This must be identical to
   * the name used to encode the key for this record.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Extent of the slice.  Must have one entry for each of the dimension of the
   * tensor that this slice belongs to.
   * </pre>
   *
   * <code>.tensorflow.TensorSliceProto slice = 2;</code>
   */
  boolean hasSlice();
  /**
   * <pre>
   * Extent of the slice.  Must have one entry for each of the dimension of the
   * tensor that this slice belongs to.
   * </pre>
   *
   * <code>.tensorflow.TensorSliceProto slice = 2;</code>
   */
  org.tensorflow.framework.TensorSliceProto getSlice();
  /**
   * <pre>
   * Extent of the slice.  Must have one entry for each of the dimension of the
   * tensor that this slice belongs to.
   * </pre>
   *
   * <code>.tensorflow.TensorSliceProto slice = 2;</code>
   */
  org.tensorflow.framework.TensorSliceProtoOrBuilder getSliceOrBuilder();

  /**
   * <pre>
   * The raw data of the slice is stored as a TensorProto. Only raw data are
   * stored (we don't fill in fields such as dtype or tensor_shape).
   * </pre>
   *
   * <code>.tensorflow.TensorProto data = 3;</code>
   */
  boolean hasData();
  /**
   * <pre>
   * The raw data of the slice is stored as a TensorProto. Only raw data are
   * stored (we don't fill in fields such as dtype or tensor_shape).
   * </pre>
   *
   * <code>.tensorflow.TensorProto data = 3;</code>
   */
  org.tensorflow.framework.TensorProto getData();
  /**
   * <pre>
   * The raw data of the slice is stored as a TensorProto. Only raw data are
   * stored (we don't fill in fields such as dtype or tensor_shape).
   * </pre>
   *
   * <code>.tensorflow.TensorProto data = 3;</code>
   */
  org.tensorflow.framework.TensorProtoOrBuilder getDataOrBuilder();
}