// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: worker.proto

package org.tensorflow.distruntime;

public interface LoggingResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.LoggingResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
   */
  java.util.List<org.tensorflow.distruntime.LabeledStepStats> 
      getStepList();
  /**
   * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
   */
  org.tensorflow.distruntime.LabeledStepStats getStep(int index);
  /**
   * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
   */
  int getStepCount();
  /**
   * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
   */
  java.util.List<? extends org.tensorflow.distruntime.LabeledStepStatsOrBuilder> 
      getStepOrBuilderList();
  /**
   * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
   */
  org.tensorflow.distruntime.LabeledStepStatsOrBuilder getStepOrBuilder(
      int index);
}
