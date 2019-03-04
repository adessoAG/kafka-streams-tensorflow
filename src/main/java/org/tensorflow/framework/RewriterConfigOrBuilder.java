// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rewriter_config.proto

package org.tensorflow.framework;

public interface RewriterConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.RewriterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optimize tensor layouts (default is ON)
   * e.g. This will try to use NCHW layout on GPU which is faster.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle layout_optimizer = 1;</code>
   */
  int getLayoutOptimizerValue();
  /**
   * <pre>
   * Optimize tensor layouts (default is ON)
   * e.g. This will try to use NCHW layout on GPU which is faster.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle layout_optimizer = 1;</code>
   */
  org.tensorflow.framework.RewriterConfig.Toggle getLayoutOptimizer();

  /**
   * <pre>
   * Fold constants (default is ON)
   * Statically infer the value of tensors when possible, and materialize the
   * result using constants.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle constant_folding = 3;</code>
   */
  int getConstantFoldingValue();
  /**
   * <pre>
   * Fold constants (default is ON)
   * Statically infer the value of tensors when possible, and materialize the
   * result using constants.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle constant_folding = 3;</code>
   */
  org.tensorflow.framework.RewriterConfig.Toggle getConstantFolding();

  /**
   * <pre>
   * Shape optimizations (default is ON)
   * Simplify computations made on shapes.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle shape_optimization = 13;</code>
   */
  int getShapeOptimizationValue();
  /**
   * <pre>
   * Shape optimizations (default is ON)
   * Simplify computations made on shapes.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle shape_optimization = 13;</code>
   */
  org.tensorflow.framework.RewriterConfig.Toggle getShapeOptimization();

  /**
   * <pre>
   * Remapping (default is ON)
   * Remap subgraphs onto more efficient implementations.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle remapping = 14;</code>
   */
  int getRemappingValue();
  /**
   * <pre>
   * Remapping (default is ON)
   * Remap subgraphs onto more efficient implementations.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle remapping = 14;</code>
   */
  org.tensorflow.framework.RewriterConfig.Toggle getRemapping();

  /**
   * <pre>
   * Arithmetic optimizations (default is ON)
   * e.g. Simplify arithmetic ops; merge ops with same value (like constants).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle arithmetic_optimization = 7;</code>
   */
  int getArithmeticOptimizationValue();
  /**
   * <pre>
   * Arithmetic optimizations (default is ON)
   * e.g. Simplify arithmetic ops; merge ops with same value (like constants).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle arithmetic_optimization = 7;</code>
   */
  org.tensorflow.framework.RewriterConfig.Toggle getArithmeticOptimization();

  /**
   * <pre>
   * Control dependency optimizations (default is ON).
   * Remove redundant control dependencies, which may enable other optimization.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle dependency_optimization = 8;</code>
   */
  int getDependencyOptimizationValue();
  /**
   * <pre>
   * Control dependency optimizations (default is ON).
   * Remove redundant control dependencies, which may enable other optimization.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle dependency_optimization = 8;</code>
   */
  org.tensorflow.framework.RewriterConfig.Toggle getDependencyOptimization();

  /**
   * <pre>
   * Loop optimizations (default is ON).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle loop_optimization = 9;</code>
   */
  int getLoopOptimizationValue();
  /**
   * <pre>
   * Loop optimizations (default is ON).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle loop_optimization = 9;</code>
   */
  org.tensorflow.framework.RewriterConfig.Toggle getLoopOptimization();

  /**
   * <pre>
   * Function optimizations (default is ON).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle function_optimization = 10;</code>
   */
  int getFunctionOptimizationValue();
  /**
   * <pre>
   * Function optimizations (default is ON).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle function_optimization = 10;</code>
   */
  org.tensorflow.framework.RewriterConfig.Toggle getFunctionOptimization();

  /**
   * <pre>
   * Strips debug-related nodes from the graph (off by default).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle debug_stripper = 11;</code>
   */
  int getDebugStripperValue();
  /**
   * <pre>
   * Strips debug-related nodes from the graph (off by default).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle debug_stripper = 11;</code>
   */
  org.tensorflow.framework.RewriterConfig.Toggle getDebugStripper();

  /**
   * <pre>
   * If true, don't remove unnecessary ops from the graph
   * </pre>
   *
   * <code>bool disable_model_pruning = 2;</code>
   */
  boolean getDisableModelPruning();

  /**
   * <pre>
   * Try to allocate some independent Op outputs contiguously in order to
   * merge or eliminate downstream Ops (off by default).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle scoped_allocator_optimization = 15;</code>
   */
  int getScopedAllocatorOptimizationValue();
  /**
   * <pre>
   * Try to allocate some independent Op outputs contiguously in order to
   * merge or eliminate downstream Ops (off by default).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle scoped_allocator_optimization = 15;</code>
   */
  org.tensorflow.framework.RewriterConfig.Toggle getScopedAllocatorOptimization();

  /**
   * <pre>
   * Force small ops onto the CPU (default is OFF).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle pin_to_host_optimization = 18;</code>
   */
  int getPinToHostOptimizationValue();
  /**
   * <pre>
   * Force small ops onto the CPU (default is OFF).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle pin_to_host_optimization = 18;</code>
   */
  org.tensorflow.framework.RewriterConfig.Toggle getPinToHostOptimization();

  /**
   * <pre>
   * Disable the entire meta optimizer (off by default).
   * </pre>
   *
   * <code>bool disable_meta_optimizer = 19;</code>
   */
  boolean getDisableMetaOptimizer();

  /**
   * <pre>
   * Controls how many times we run the optimizers in meta optimizer (default
   * is once).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.NumIterationsType meta_optimizer_iterations = 12;</code>
   */
  int getMetaOptimizerIterationsValue();
  /**
   * <pre>
   * Controls how many times we run the optimizers in meta optimizer (default
   * is once).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.NumIterationsType meta_optimizer_iterations = 12;</code>
   */
  org.tensorflow.framework.RewriterConfig.NumIterationsType getMetaOptimizerIterations();

  /**
   * <pre>
   * The minimum number of nodes in a graph to optimizer. For smaller graphs,
   * optimization is skipped.
   * 0 means the system picks an appropriate number.
   * &lt; 0 means do not skip optimization.
   * </pre>
   *
   * <code>int32 min_graph_nodes = 17;</code>
   */
  int getMinGraphNodes();

  /**
   * <pre>
   * Configures memory optimization passes through the meta-optimizer. Has no
   * effect on manually requested memory optimization passes in the optimizers
   * field.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.MemOptType memory_optimization = 4;</code>
   */
  int getMemoryOptimizationValue();
  /**
   * <pre>
   * Configures memory optimization passes through the meta-optimizer. Has no
   * effect on manually requested memory optimization passes in the optimizers
   * field.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.MemOptType memory_optimization = 4;</code>
   */
  org.tensorflow.framework.RewriterConfig.MemOptType getMemoryOptimization();

  /**
   * <pre>
   * A node name scope for node names which are valid outputs of recompuations.
   * Inputs to nodes that match this scope may be recomputed (subject either to
   * manual annotation of those input nodes or to manual annotation and
   * heuristics depending on memory_optimization), but the nodes themselves will
   * not be recomputed. This matches any sub-scopes as well, meaning the scope
   * can appear not just as a top-level scope. For example, if the value is
   * "gradients/", the default, it will match node name "gradients/foo",
   * "foo/gradients/bar", but not "foo_gradients/"
   * </pre>
   *
   * <code>string memory_optimizer_target_node_name_scope = 6;</code>
   */
  java.lang.String getMemoryOptimizerTargetNodeNameScope();
  /**
   * <pre>
   * A node name scope for node names which are valid outputs of recompuations.
   * Inputs to nodes that match this scope may be recomputed (subject either to
   * manual annotation of those input nodes or to manual annotation and
   * heuristics depending on memory_optimization), but the nodes themselves will
   * not be recomputed. This matches any sub-scopes as well, meaning the scope
   * can appear not just as a top-level scope. For example, if the value is
   * "gradients/", the default, it will match node name "gradients/foo",
   * "foo/gradients/bar", but not "foo_gradients/"
   * </pre>
   *
   * <code>string memory_optimizer_target_node_name_scope = 6;</code>
   */
  com.google.protobuf.ByteString
      getMemoryOptimizerTargetNodeNameScopeBytes();

  /**
   * <pre>
   * Maximum number of milliseconds to spend optimizing a single graph before
   * timing out. If equal to 0 the system picks a default (currently 5 minutes).
   * If less than 0 the optimizer will never time out.
   * </pre>
   *
   * <code>int64 meta_optimizer_timeout_ms = 20;</code>
   */
  long getMetaOptimizerTimeoutMs();

  /**
   * <pre>
   * Configures AutoParallel optimization passes either through the
   * meta-optimizer or when manually specified through the optimizers field.
   * </pre>
   *
   * <code>.tensorflow.AutoParallelOptions auto_parallel = 5;</code>
   */
  boolean hasAutoParallel();
  /**
   * <pre>
   * Configures AutoParallel optimization passes either through the
   * meta-optimizer or when manually specified through the optimizers field.
   * </pre>
   *
   * <code>.tensorflow.AutoParallelOptions auto_parallel = 5;</code>
   */
  org.tensorflow.framework.AutoParallelOptions getAutoParallel();
  /**
   * <pre>
   * Configures AutoParallel optimization passes either through the
   * meta-optimizer or when manually specified through the optimizers field.
   * </pre>
   *
   * <code>.tensorflow.AutoParallelOptions auto_parallel = 5;</code>
   */
  org.tensorflow.framework.AutoParallelOptionsOrBuilder getAutoParallelOrBuilder();

  /**
   * <pre>
   * If true, any optimization pass failing will cause the MetaOptimizer to
   * stop with an error. By default - or when set to false, failing passes are
   * skipped silently.
   * </pre>
   *
   * <code>bool fail_on_optimizer_errors = 21;</code>
   */
  boolean getFailOnOptimizerErrors();

  /**
   * <code>.tensorflow.ScopedAllocatorOptions scoped_allocator_opts = 16;</code>
   */
  boolean hasScopedAllocatorOpts();
  /**
   * <code>.tensorflow.ScopedAllocatorOptions scoped_allocator_opts = 16;</code>
   */
  org.tensorflow.framework.ScopedAllocatorOptions getScopedAllocatorOpts();
  /**
   * <code>.tensorflow.ScopedAllocatorOptions scoped_allocator_opts = 16;</code>
   */
  org.tensorflow.framework.ScopedAllocatorOptionsOrBuilder getScopedAllocatorOptsOrBuilder();

  /**
   * <pre>
   * If non-empty, will use this as an alternative way to specify a list of
   * optimizations to turn on and the order of the optimizations (replacing the
   * meta-optimizer).
   * Of the RewriterConfig options, only the AutoParallel configuration options
   * (the auto_parallel field) apply to manually requested optimization passes
   * ("autoparallel"). Memory optimization passes ("memory") invoked here are
   * not configurable (in contrast to memory optimization passes through the
   * meta-optimizer) and act only on manual op annotations.
   * Custom optimizers (see custom_optimizers) that are not part of this
   * schedule will be run after - in the order that they were specified.
   * </pre>
   *
   * <code>repeated string optimizers = 100;</code>
   */
  java.util.List<java.lang.String>
      getOptimizersList();
  /**
   * <pre>
   * If non-empty, will use this as an alternative way to specify a list of
   * optimizations to turn on and the order of the optimizations (replacing the
   * meta-optimizer).
   * Of the RewriterConfig options, only the AutoParallel configuration options
   * (the auto_parallel field) apply to manually requested optimization passes
   * ("autoparallel"). Memory optimization passes ("memory") invoked here are
   * not configurable (in contrast to memory optimization passes through the
   * meta-optimizer) and act only on manual op annotations.
   * Custom optimizers (see custom_optimizers) that are not part of this
   * schedule will be run after - in the order that they were specified.
   * </pre>
   *
   * <code>repeated string optimizers = 100;</code>
   */
  int getOptimizersCount();
  /**
   * <pre>
   * If non-empty, will use this as an alternative way to specify a list of
   * optimizations to turn on and the order of the optimizations (replacing the
   * meta-optimizer).
   * Of the RewriterConfig options, only the AutoParallel configuration options
   * (the auto_parallel field) apply to manually requested optimization passes
   * ("autoparallel"). Memory optimization passes ("memory") invoked here are
   * not configurable (in contrast to memory optimization passes through the
   * meta-optimizer) and act only on manual op annotations.
   * Custom optimizers (see custom_optimizers) that are not part of this
   * schedule will be run after - in the order that they were specified.
   * </pre>
   *
   * <code>repeated string optimizers = 100;</code>
   */
  java.lang.String getOptimizers(int index);
  /**
   * <pre>
   * If non-empty, will use this as an alternative way to specify a list of
   * optimizations to turn on and the order of the optimizations (replacing the
   * meta-optimizer).
   * Of the RewriterConfig options, only the AutoParallel configuration options
   * (the auto_parallel field) apply to manually requested optimization passes
   * ("autoparallel"). Memory optimization passes ("memory") invoked here are
   * not configurable (in contrast to memory optimization passes through the
   * meta-optimizer) and act only on manual op annotations.
   * Custom optimizers (see custom_optimizers) that are not part of this
   * schedule will be run after - in the order that they were specified.
   * </pre>
   *
   * <code>repeated string optimizers = 100;</code>
   */
  com.google.protobuf.ByteString
      getOptimizersBytes(int index);

  /**
   * <pre>
   * list of CustomGraphOptimizers to apply.
   * </pre>
   *
   * <code>repeated .tensorflow.RewriterConfig.CustomGraphOptimizer custom_optimizers = 200;</code>
   */
  java.util.List<org.tensorflow.framework.RewriterConfig.CustomGraphOptimizer> 
      getCustomOptimizersList();
  /**
   * <pre>
   * list of CustomGraphOptimizers to apply.
   * </pre>
   *
   * <code>repeated .tensorflow.RewriterConfig.CustomGraphOptimizer custom_optimizers = 200;</code>
   */
  org.tensorflow.framework.RewriterConfig.CustomGraphOptimizer getCustomOptimizers(int index);
  /**
   * <pre>
   * list of CustomGraphOptimizers to apply.
   * </pre>
   *
   * <code>repeated .tensorflow.RewriterConfig.CustomGraphOptimizer custom_optimizers = 200;</code>
   */
  int getCustomOptimizersCount();
  /**
   * <pre>
   * list of CustomGraphOptimizers to apply.
   * </pre>
   *
   * <code>repeated .tensorflow.RewriterConfig.CustomGraphOptimizer custom_optimizers = 200;</code>
   */
  java.util.List<? extends org.tensorflow.framework.RewriterConfig.CustomGraphOptimizerOrBuilder> 
      getCustomOptimizersOrBuilderList();
  /**
   * <pre>
   * list of CustomGraphOptimizers to apply.
   * </pre>
   *
   * <code>repeated .tensorflow.RewriterConfig.CustomGraphOptimizer custom_optimizers = 200;</code>
   */
  org.tensorflow.framework.RewriterConfig.CustomGraphOptimizerOrBuilder getCustomOptimizersOrBuilder(
      int index);
}
