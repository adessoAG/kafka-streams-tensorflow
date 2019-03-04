// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: master.proto

package org.tensorflow.distruntime;

public interface PartialRunSetupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.PartialRunSetupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * REQUIRED: session_handle must be returned by a CreateSession call
   * to the same master service.
   * </pre>
   *
   * <code>string session_handle = 1;</code>
   */
  java.lang.String getSessionHandle();
  /**
   * <pre>
   * REQUIRED: session_handle must be returned by a CreateSession call
   * to the same master service.
   * </pre>
   *
   * <code>string session_handle = 1;</code>
   */
  com.google.protobuf.ByteString
      getSessionHandleBytes();

  /**
   * <pre>
   * Tensors to be fed in future steps.
   * </pre>
   *
   * <code>repeated string feed = 2;</code>
   */
  java.util.List<java.lang.String>
      getFeedList();
  /**
   * <pre>
   * Tensors to be fed in future steps.
   * </pre>
   *
   * <code>repeated string feed = 2;</code>
   */
  int getFeedCount();
  /**
   * <pre>
   * Tensors to be fed in future steps.
   * </pre>
   *
   * <code>repeated string feed = 2;</code>
   */
  java.lang.String getFeed(int index);
  /**
   * <pre>
   * Tensors to be fed in future steps.
   * </pre>
   *
   * <code>repeated string feed = 2;</code>
   */
  com.google.protobuf.ByteString
      getFeedBytes(int index);

  /**
   * <pre>
   * Fetches. A list of tensor names. The caller expects a tensor to be returned
   * for each fetch[i] (see RunStepResponse.tensor), for corresponding partial
   * RunStepRequests. The order of specified fetches does not change the
   * execution order.
   * </pre>
   *
   * <code>repeated string fetch = 3;</code>
   */
  java.util.List<java.lang.String>
      getFetchList();
  /**
   * <pre>
   * Fetches. A list of tensor names. The caller expects a tensor to be returned
   * for each fetch[i] (see RunStepResponse.tensor), for corresponding partial
   * RunStepRequests. The order of specified fetches does not change the
   * execution order.
   * </pre>
   *
   * <code>repeated string fetch = 3;</code>
   */
  int getFetchCount();
  /**
   * <pre>
   * Fetches. A list of tensor names. The caller expects a tensor to be returned
   * for each fetch[i] (see RunStepResponse.tensor), for corresponding partial
   * RunStepRequests. The order of specified fetches does not change the
   * execution order.
   * </pre>
   *
   * <code>repeated string fetch = 3;</code>
   */
  java.lang.String getFetch(int index);
  /**
   * <pre>
   * Fetches. A list of tensor names. The caller expects a tensor to be returned
   * for each fetch[i] (see RunStepResponse.tensor), for corresponding partial
   * RunStepRequests. The order of specified fetches does not change the
   * execution order.
   * </pre>
   *
   * <code>repeated string fetch = 3;</code>
   */
  com.google.protobuf.ByteString
      getFetchBytes(int index);

  /**
   * <pre>
   * Target Nodes. A list of node names. The named nodes will be run in future
   * steps, but their outputs will not be fetched.
   * </pre>
   *
   * <code>repeated string target = 4;</code>
   */
  java.util.List<java.lang.String>
      getTargetList();
  /**
   * <pre>
   * Target Nodes. A list of node names. The named nodes will be run in future
   * steps, but their outputs will not be fetched.
   * </pre>
   *
   * <code>repeated string target = 4;</code>
   */
  int getTargetCount();
  /**
   * <pre>
   * Target Nodes. A list of node names. The named nodes will be run in future
   * steps, but their outputs will not be fetched.
   * </pre>
   *
   * <code>repeated string target = 4;</code>
   */
  java.lang.String getTarget(int index);
  /**
   * <pre>
   * Target Nodes. A list of node names. The named nodes will be run in future
   * steps, but their outputs will not be fetched.
   * </pre>
   *
   * <code>repeated string target = 4;</code>
   */
  com.google.protobuf.ByteString
      getTargetBytes(int index);
}
