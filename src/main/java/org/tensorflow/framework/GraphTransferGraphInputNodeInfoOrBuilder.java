// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graph_transfer_info.proto

package org.tensorflow.framework;

public interface GraphTransferGraphInputNodeInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.GraphTransferGraphInputNodeInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated int64 shape = 2;</code>
   */
  java.util.List<java.lang.Long> getShapeList();
  /**
   * <code>repeated int64 shape = 2;</code>
   */
  int getShapeCount();
  /**
   * <code>repeated int64 shape = 2;</code>
   */
  long getShape(int index);

  /**
   * <code>.tensorflow.DataType dtype = 3;</code>
   */
  int getDtypeValue();
  /**
   * <code>.tensorflow.DataType dtype = 3;</code>
   */
  org.tensorflow.framework.DataType getDtype();
}
