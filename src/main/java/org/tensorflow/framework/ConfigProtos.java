// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: config.proto

package org.tensorflow.framework;

public final class ConfigProtos {
  private ConfigProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GPUOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GPUOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GPUOptions_Experimental_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GPUOptions_Experimental_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GPUOptions_Experimental_VirtualDevices_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GPUOptions_Experimental_VirtualDevices_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_OptimizerOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_OptimizerOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GraphOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ThreadPoolOptionProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ThreadPoolOptionProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RPCOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RPCOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ConfigProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ConfigProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ConfigProto_DeviceCountEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ConfigProto_DeviceCountEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ConfigProto_Experimental_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ConfigProto_Experimental_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunOptions_Experimental_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunOptions_Experimental_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_TensorConnection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_TensorConnection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CallableOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CallableOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CallableOptions_FeedDevicesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CallableOptions_FeedDevicesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CallableOptions_FetchDevicesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CallableOptions_FetchDevicesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014config.proto\022\ntensorflow\032\020cost_graph.p" +
      "roto\032\013graph.proto\032\020step_stats.proto\032\013deb" +
      "ug.proto\032\rcluster.proto\032\025rewriter_config" +
      ".proto\"\255\004\n\nGPUOptions\022\'\n\037per_process_gpu" +
      "_memory_fraction\030\001 \001(\001\022\024\n\014allow_growth\030\004" +
      " \001(\010\022\026\n\016allocator_type\030\002 \001(\t\022\037\n\027deferred" +
      "_deletion_bytes\030\003 \001(\003\022\033\n\023visible_device_" +
      "list\030\005 \001(\t\022\"\n\032polling_active_delay_usecs" +
      "\030\006 \001(\005\022$\n\034polling_inactive_delay_msecs\030\007" +
      " \001(\005\022\034\n\024force_gpu_compatible\030\010 \001(\010\0229\n\014ex" +
      "perimental\030\t \001(\0132#.tensorflow.GPUOptions" +
      ".Experimental\032\346\001\n\014Experimental\022K\n\017virtua" +
      "l_devices\030\001 \003(\01322.tensorflow.GPUOptions." +
      "Experimental.VirtualDevices\022\032\n\022use_unifi" +
      "ed_memory\030\002 \001(\010\022#\n\033num_dev_to_dev_copy_s" +
      "treams\030\003 \001(\005\022\035\n\025collective_ring_order\030\004 " +
      "\001(\t\032)\n\016VirtualDevices\022\027\n\017memory_limit_mb" +
      "\030\001 \003(\002\"\205\003\n\020OptimizerOptions\022+\n#do_common" +
      "_subexpression_elimination\030\001 \001(\010\022\033\n\023do_c" +
      "onstant_folding\030\002 \001(\010\022$\n\034max_folded_cons" +
      "tant_in_bytes\030\006 \001(\003\022\034\n\024do_function_inlin" +
      "ing\030\004 \001(\010\0225\n\topt_level\030\003 \001(\0162\".tensorflo" +
      "w.OptimizerOptions.Level\022E\n\020global_jit_l" +
      "evel\030\005 \001(\0162+.tensorflow.OptimizerOptions" +
      ".GlobalJitLevel\" \n\005Level\022\006\n\002L1\020\000\022\017\n\002L0\020\377" +
      "\377\377\377\377\377\377\377\377\001\"C\n\016GlobalJitLevel\022\013\n\007DEFAULT\020\000" +
      "\022\020\n\003OFF\020\377\377\377\377\377\377\377\377\377\001\022\010\n\004ON_1\020\001\022\010\n\004ON_2\020\002\"\356" +
      "\002\n\014GraphOptions\022\036\n\026enable_recv_schedulin" +
      "g\030\002 \001(\010\0227\n\021optimizer_options\030\003 \001(\0132\034.ten" +
      "sorflow.OptimizerOptions\022\030\n\020build_cost_m" +
      "odel\030\004 \001(\003\022\036\n\026build_cost_model_after\030\t \001" +
      "(\003\022\024\n\014infer_shapes\030\005 \001(\010\022\032\n\022place_pruned" +
      "_graph\030\006 \001(\010\022 \n\030enable_bfloat16_sendrecv" +
      "\030\007 \001(\010\022\025\n\rtimeline_step\030\010 \001(\005\0223\n\017rewrite" +
      "_options\030\n \001(\0132\032.tensorflow.RewriterConf" +
      "igJ\004\010\001\020\002R%skip_common_subexpression_elim" +
      "ination\"A\n\025ThreadPoolOptionProto\022\023\n\013num_" +
      "threads\030\001 \001(\005\022\023\n\013global_name\030\002 \001(\t\"l\n\nRP" +
      "COptions\022$\n\034use_rpc_for_inprocess_master" +
      "\030\001 \001(\010\022\035\n\025compression_algorithm\030\002 \001(\t\022\031\n" +
      "\021compression_level\030\003 \001(\005\"\337\006\n\013ConfigProto" +
      "\022>\n\014device_count\030\001 \003(\0132(.tensorflow.Conf" +
      "igProto.DeviceCountEntry\022$\n\034intra_op_par" +
      "allelism_threads\030\002 \001(\005\022$\n\034inter_op_paral" +
      "lelism_threads\030\005 \001(\005\022\037\n\027use_per_session_" +
      "threads\030\t \001(\010\022G\n\034session_inter_op_thread" +
      "_pool\030\014 \003(\0132!.tensorflow.ThreadPoolOptio" +
      "nProto\022\030\n\020placement_period\030\003 \001(\005\022\026\n\016devi" +
      "ce_filters\030\004 \003(\t\022+\n\013gpu_options\030\006 \001(\0132\026." +
      "tensorflow.GPUOptions\022\034\n\024allow_soft_plac" +
      "ement\030\007 \001(\010\022\034\n\024log_device_placement\030\010 \001(" +
      "\010\022/\n\rgraph_options\030\n \001(\0132\030.tensorflow.Gr" +
      "aphOptions\022\037\n\027operation_timeout_in_ms\030\013 " +
      "\001(\003\022+\n\013rpc_options\030\r \001(\0132\026.tensorflow.RP" +
      "COptions\022+\n\013cluster_def\030\016 \001(\0132\026.tensorfl" +
      "ow.ClusterDef\022\035\n\025isolate_session_state\030\017" +
      " \001(\010\022:\n\014experimental\030\020 \001(\0132$.tensorflow." +
      "ConfigProto.Experimental\0322\n\020DeviceCountE" +
      "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\005:\0028\001\032\203\001\n" +
      "\014Experimental\022\037\n\027collective_group_leader" +
      "\030\001 \001(\t\022\025\n\rexecutor_type\030\003 \001(\t\022\032\n\022recv_bu" +
      "f_max_chunk\030\004 \001(\005\022\031\n\021use_numa_affinity\030\005" +
      " \001(\010J\004\010\002\020\003\"\330\003\n\nRunOptions\0226\n\013trace_level" +
      "\030\001 \001(\0162!.tensorflow.RunOptions.TraceLeve" +
      "l\022\025\n\rtimeout_in_ms\030\002 \001(\003\022\034\n\024inter_op_thr" +
      "ead_pool\030\003 \001(\005\022\037\n\027output_partition_graph" +
      "s\030\005 \001(\010\022/\n\rdebug_options\030\006 \001(\0132\030.tensorf" +
      "low.DebugOptions\022*\n\"report_tensor_alloca" +
      "tions_upon_oom\030\007 \001(\010\0229\n\014experimental\030\010 \001" +
      "(\0132#.tensorflow.RunOptions.Experimental\032" +
      "J\n\014Experimental\022\034\n\024collective_graph_key\030" +
      "\001 \001(\003\022\034\n\024use_run_handler_pool\030\002 \001(\010\"R\n\nT" +
      "raceLevel\022\014\n\010NO_TRACE\020\000\022\022\n\016SOFTWARE_TRAC" +
      "E\020\001\022\022\n\016HARDWARE_TRACE\020\002\022\016\n\nFULL_TRACE\020\003J" +
      "\004\010\004\020\005\"\226\001\n\013RunMetadata\022)\n\nstep_stats\030\001 \001(" +
      "\0132\025.tensorflow.StepStats\022,\n\ncost_graph\030\002" +
      " \001(\0132\030.tensorflow.CostGraphDef\022.\n\020partit" +
      "ion_graphs\030\003 \003(\0132\024.tensorflow.GraphDef\":" +
      "\n\020TensorConnection\022\023\n\013from_tensor\030\001 \001(\t\022" +
      "\021\n\tto_tensor\030\002 \001(\t\"\260\003\n\017CallableOptions\022\014" +
      "\n\004feed\030\001 \003(\t\022\r\n\005fetch\030\002 \003(\t\022\016\n\006target\030\003 " +
      "\003(\t\022+\n\013run_options\030\004 \001(\0132\026.tensorflow.Ru" +
      "nOptions\0227\n\021tensor_connection\030\005 \003(\0132\034.te" +
      "nsorflow.TensorConnection\022B\n\014feed_device" +
      "s\030\006 \003(\0132,.tensorflow.CallableOptions.Fee" +
      "dDevicesEntry\022D\n\rfetch_devices\030\007 \003(\0132-.t" +
      "ensorflow.CallableOptions.FetchDevicesEn" +
      "try\022\027\n\017fetch_skip_sync\030\010 \001(\010\0322\n\020FeedDevi" +
      "cesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001" +
      "\0323\n\021FetchDevicesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va" +
      "lue\030\002 \001(\t:\0028\001B-\n\030org.tensorflow.framewor" +
      "kB\014ConfigProtosP\001\370\001\001b\006proto3"
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
          org.tensorflow.framework.CostGraphProtos.getDescriptor(),
          org.tensorflow.framework.GraphProtos.getDescriptor(),
          org.tensorflow.framework.StepStatsProtos.getDescriptor(),
          org.tensorflow.framework.DebugProtos.getDescriptor(),
          org.tensorflow.distruntime.ClusterProtos.getDescriptor(),
          org.tensorflow.framework.RewriterConfigProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_GPUOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_GPUOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GPUOptions_descriptor,
        new java.lang.String[] { "PerProcessGpuMemoryFraction", "AllowGrowth", "AllocatorType", "DeferredDeletionBytes", "VisibleDeviceList", "PollingActiveDelayUsecs", "PollingInactiveDelayMsecs", "ForceGpuCompatible", "Experimental", });
    internal_static_tensorflow_GPUOptions_Experimental_descriptor =
      internal_static_tensorflow_GPUOptions_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_GPUOptions_Experimental_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GPUOptions_Experimental_descriptor,
        new java.lang.String[] { "VirtualDevices", "UseUnifiedMemory", "NumDevToDevCopyStreams", "CollectiveRingOrder", });
    internal_static_tensorflow_GPUOptions_Experimental_VirtualDevices_descriptor =
      internal_static_tensorflow_GPUOptions_Experimental_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_GPUOptions_Experimental_VirtualDevices_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GPUOptions_Experimental_VirtualDevices_descriptor,
        new java.lang.String[] { "MemoryLimitMb", });
    internal_static_tensorflow_OptimizerOptions_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_OptimizerOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_OptimizerOptions_descriptor,
        new java.lang.String[] { "DoCommonSubexpressionElimination", "DoConstantFolding", "MaxFoldedConstantInBytes", "DoFunctionInlining", "OptLevel", "GlobalJitLevel", });
    internal_static_tensorflow_GraphOptions_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_GraphOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GraphOptions_descriptor,
        new java.lang.String[] { "EnableRecvScheduling", "OptimizerOptions", "BuildCostModel", "BuildCostModelAfter", "InferShapes", "PlacePrunedGraph", "EnableBfloat16Sendrecv", "TimelineStep", "RewriteOptions", });
    internal_static_tensorflow_ThreadPoolOptionProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_ThreadPoolOptionProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ThreadPoolOptionProto_descriptor,
        new java.lang.String[] { "NumThreads", "GlobalName", });
    internal_static_tensorflow_RPCOptions_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_RPCOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RPCOptions_descriptor,
        new java.lang.String[] { "UseRpcForInprocessMaster", "CompressionAlgorithm", "CompressionLevel", });
    internal_static_tensorflow_ConfigProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_ConfigProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ConfigProto_descriptor,
        new java.lang.String[] { "DeviceCount", "IntraOpParallelismThreads", "InterOpParallelismThreads", "UsePerSessionThreads", "SessionInterOpThreadPool", "PlacementPeriod", "DeviceFilters", "GpuOptions", "AllowSoftPlacement", "LogDevicePlacement", "GraphOptions", "OperationTimeoutInMs", "RpcOptions", "ClusterDef", "IsolateSessionState", "Experimental", });
    internal_static_tensorflow_ConfigProto_DeviceCountEntry_descriptor =
      internal_static_tensorflow_ConfigProto_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_ConfigProto_DeviceCountEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ConfigProto_DeviceCountEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_ConfigProto_Experimental_descriptor =
      internal_static_tensorflow_ConfigProto_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_ConfigProto_Experimental_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ConfigProto_Experimental_descriptor,
        new java.lang.String[] { "CollectiveGroupLeader", "ExecutorType", "RecvBufMaxChunk", "UseNumaAffinity", });
    internal_static_tensorflow_RunOptions_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tensorflow_RunOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunOptions_descriptor,
        new java.lang.String[] { "TraceLevel", "TimeoutInMs", "InterOpThreadPool", "OutputPartitionGraphs", "DebugOptions", "ReportTensorAllocationsUponOom", "Experimental", });
    internal_static_tensorflow_RunOptions_Experimental_descriptor =
      internal_static_tensorflow_RunOptions_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_RunOptions_Experimental_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunOptions_Experimental_descriptor,
        new java.lang.String[] { "CollectiveGraphKey", "UseRunHandlerPool", });
    internal_static_tensorflow_RunMetadata_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_tensorflow_RunMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunMetadata_descriptor,
        new java.lang.String[] { "StepStats", "CostGraph", "PartitionGraphs", });
    internal_static_tensorflow_TensorConnection_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_tensorflow_TensorConnection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_TensorConnection_descriptor,
        new java.lang.String[] { "FromTensor", "ToTensor", });
    internal_static_tensorflow_CallableOptions_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_tensorflow_CallableOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CallableOptions_descriptor,
        new java.lang.String[] { "Feed", "Fetch", "Target", "RunOptions", "TensorConnection", "FeedDevices", "FetchDevices", "FetchSkipSync", });
    internal_static_tensorflow_CallableOptions_FeedDevicesEntry_descriptor =
      internal_static_tensorflow_CallableOptions_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_CallableOptions_FeedDevicesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CallableOptions_FeedDevicesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_CallableOptions_FetchDevicesEntry_descriptor =
      internal_static_tensorflow_CallableOptions_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_CallableOptions_FetchDevicesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CallableOptions_FetchDevicesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    org.tensorflow.framework.CostGraphProtos.getDescriptor();
    org.tensorflow.framework.GraphProtos.getDescriptor();
    org.tensorflow.framework.StepStatsProtos.getDescriptor();
    org.tensorflow.framework.DebugProtos.getDescriptor();
    org.tensorflow.distruntime.ClusterProtos.getDescriptor();
    org.tensorflow.framework.RewriterConfigProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
