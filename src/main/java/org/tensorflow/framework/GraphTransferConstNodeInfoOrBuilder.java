// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graph_transfer_info.proto

package org.tensorflow.framework;

public interface GraphTransferConstNodeInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.GraphTransferConstNodeInfo)
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
   * <code>int32 node_id = 2;</code>
   */
  int getNodeId();

  /**
   * <code>repeated int64 shape = 3;</code>
   */
  java.util.List<java.lang.Long> getShapeList();
  /**
   * <code>repeated int64 shape = 3;</code>
   */
  int getShapeCount();
  /**
   * <code>repeated int64 shape = 3;</code>
   */
  long getShape(int index);

  /**
   * <code>bytes data = 4;</code>
   */
  com.google.protobuf.ByteString getData();

  /**
   * <code>.tensorflow.DataType dtype = 5;</code>
   */
  int getDtypeValue();
  /**
   * <code>.tensorflow.DataType dtype = 5;</code>
   */
  org.tensorflow.framework.DataType getDtype();
}
