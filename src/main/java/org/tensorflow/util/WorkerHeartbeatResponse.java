// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event.proto

package org.tensorflow.util;

/**
 * Protobuf type {@code tensorflow.WorkerHeartbeatResponse}
 */
public  final class WorkerHeartbeatResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.WorkerHeartbeatResponse)
    WorkerHeartbeatResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WorkerHeartbeatResponse.newBuilder() to construct.
  private WorkerHeartbeatResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkerHeartbeatResponse() {
    healthStatus_ = 0;
    workerLog_ = java.util.Collections.emptyList();
    hostname_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WorkerHeartbeatResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            healthStatus_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              workerLog_ = new java.util.ArrayList<org.tensorflow.util.Event>();
              mutable_bitField0_ |= 0x00000002;
            }
            workerLog_.add(
                input.readMessage(org.tensorflow.util.Event.parser(), extensionRegistry));
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            hostname_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        workerLog_ = java.util.Collections.unmodifiableList(workerLog_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.util.EventProtos.internal_static_tensorflow_WorkerHeartbeatResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.util.EventProtos.internal_static_tensorflow_WorkerHeartbeatResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.util.WorkerHeartbeatResponse.class, org.tensorflow.util.WorkerHeartbeatResponse.Builder.class);
  }

  private int bitField0_;
  public static final int HEALTH_STATUS_FIELD_NUMBER = 1;
  private int healthStatus_;
  /**
   * <code>.tensorflow.WorkerHealth health_status = 1;</code>
   */
  public int getHealthStatusValue() {
    return healthStatus_;
  }
  /**
   * <code>.tensorflow.WorkerHealth health_status = 1;</code>
   */
  public org.tensorflow.util.WorkerHealth getHealthStatus() {
    @SuppressWarnings("deprecation")
    org.tensorflow.util.WorkerHealth result = org.tensorflow.util.WorkerHealth.valueOf(healthStatus_);
    return result == null ? org.tensorflow.util.WorkerHealth.UNRECOGNIZED : result;
  }

  public static final int WORKER_LOG_FIELD_NUMBER = 2;
  private java.util.List<org.tensorflow.util.Event> workerLog_;
  /**
   * <code>repeated .tensorflow.Event worker_log = 2;</code>
   */
  public java.util.List<org.tensorflow.util.Event> getWorkerLogList() {
    return workerLog_;
  }
  /**
   * <code>repeated .tensorflow.Event worker_log = 2;</code>
   */
  public java.util.List<? extends org.tensorflow.util.EventOrBuilder> 
      getWorkerLogOrBuilderList() {
    return workerLog_;
  }
  /**
   * <code>repeated .tensorflow.Event worker_log = 2;</code>
   */
  public int getWorkerLogCount() {
    return workerLog_.size();
  }
  /**
   * <code>repeated .tensorflow.Event worker_log = 2;</code>
   */
  public org.tensorflow.util.Event getWorkerLog(int index) {
    return workerLog_.get(index);
  }
  /**
   * <code>repeated .tensorflow.Event worker_log = 2;</code>
   */
  public org.tensorflow.util.EventOrBuilder getWorkerLogOrBuilder(
      int index) {
    return workerLog_.get(index);
  }

  public static final int HOSTNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object hostname_;
  /**
   * <code>string hostname = 3;</code>
   */
  public java.lang.String getHostname() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostname_ = s;
      return s;
    }
  }
  /**
   * <code>string hostname = 3;</code>
   */
  public com.google.protobuf.ByteString
      getHostnameBytes() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (healthStatus_ != org.tensorflow.util.WorkerHealth.OK.getNumber()) {
      output.writeEnum(1, healthStatus_);
    }
    for (int i = 0; i < workerLog_.size(); i++) {
      output.writeMessage(2, workerLog_.get(i));
    }
    if (!getHostnameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hostname_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (healthStatus_ != org.tensorflow.util.WorkerHealth.OK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, healthStatus_);
    }
    for (int i = 0; i < workerLog_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, workerLog_.get(i));
    }
    if (!getHostnameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, hostname_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.util.WorkerHeartbeatResponse)) {
      return super.equals(obj);
    }
    org.tensorflow.util.WorkerHeartbeatResponse other = (org.tensorflow.util.WorkerHeartbeatResponse) obj;

    if (healthStatus_ != other.healthStatus_) return false;
    if (!getWorkerLogList()
        .equals(other.getWorkerLogList())) return false;
    if (!getHostname()
        .equals(other.getHostname())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + HEALTH_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + healthStatus_;
    if (getWorkerLogCount() > 0) {
      hash = (37 * hash) + WORKER_LOG_FIELD_NUMBER;
      hash = (53 * hash) + getWorkerLogList().hashCode();
    }
    hash = (37 * hash) + HOSTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getHostname().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.util.WorkerHeartbeatResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.WorkerHeartbeatResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.WorkerHeartbeatResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.WorkerHeartbeatResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.WorkerHeartbeatResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.WorkerHeartbeatResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.WorkerHeartbeatResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.WorkerHeartbeatResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.util.WorkerHeartbeatResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.WorkerHeartbeatResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.util.WorkerHeartbeatResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.WorkerHeartbeatResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.util.WorkerHeartbeatResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tensorflow.WorkerHeartbeatResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.WorkerHeartbeatResponse)
      org.tensorflow.util.WorkerHeartbeatResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.util.EventProtos.internal_static_tensorflow_WorkerHeartbeatResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.util.EventProtos.internal_static_tensorflow_WorkerHeartbeatResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.util.WorkerHeartbeatResponse.class, org.tensorflow.util.WorkerHeartbeatResponse.Builder.class);
    }

    // Construct using org.tensorflow.util.WorkerHeartbeatResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getWorkerLogFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      healthStatus_ = 0;

      if (workerLogBuilder_ == null) {
        workerLog_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        workerLogBuilder_.clear();
      }
      hostname_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.util.EventProtos.internal_static_tensorflow_WorkerHeartbeatResponse_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.util.WorkerHeartbeatResponse getDefaultInstanceForType() {
      return org.tensorflow.util.WorkerHeartbeatResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.util.WorkerHeartbeatResponse build() {
      org.tensorflow.util.WorkerHeartbeatResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.util.WorkerHeartbeatResponse buildPartial() {
      org.tensorflow.util.WorkerHeartbeatResponse result = new org.tensorflow.util.WorkerHeartbeatResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.healthStatus_ = healthStatus_;
      if (workerLogBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          workerLog_ = java.util.Collections.unmodifiableList(workerLog_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.workerLog_ = workerLog_;
      } else {
        result.workerLog_ = workerLogBuilder_.build();
      }
      result.hostname_ = hostname_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.util.WorkerHeartbeatResponse) {
        return mergeFrom((org.tensorflow.util.WorkerHeartbeatResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.util.WorkerHeartbeatResponse other) {
      if (other == org.tensorflow.util.WorkerHeartbeatResponse.getDefaultInstance()) return this;
      if (other.healthStatus_ != 0) {
        setHealthStatusValue(other.getHealthStatusValue());
      }
      if (workerLogBuilder_ == null) {
        if (!other.workerLog_.isEmpty()) {
          if (workerLog_.isEmpty()) {
            workerLog_ = other.workerLog_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureWorkerLogIsMutable();
            workerLog_.addAll(other.workerLog_);
          }
          onChanged();
        }
      } else {
        if (!other.workerLog_.isEmpty()) {
          if (workerLogBuilder_.isEmpty()) {
            workerLogBuilder_.dispose();
            workerLogBuilder_ = null;
            workerLog_ = other.workerLog_;
            bitField0_ = (bitField0_ & ~0x00000002);
            workerLogBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWorkerLogFieldBuilder() : null;
          } else {
            workerLogBuilder_.addAllMessages(other.workerLog_);
          }
        }
      }
      if (!other.getHostname().isEmpty()) {
        hostname_ = other.hostname_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.util.WorkerHeartbeatResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.util.WorkerHeartbeatResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int healthStatus_ = 0;
    /**
     * <code>.tensorflow.WorkerHealth health_status = 1;</code>
     */
    public int getHealthStatusValue() {
      return healthStatus_;
    }
    /**
     * <code>.tensorflow.WorkerHealth health_status = 1;</code>
     */
    public Builder setHealthStatusValue(int value) {
      healthStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.WorkerHealth health_status = 1;</code>
     */
    public org.tensorflow.util.WorkerHealth getHealthStatus() {
      @SuppressWarnings("deprecation")
      org.tensorflow.util.WorkerHealth result = org.tensorflow.util.WorkerHealth.valueOf(healthStatus_);
      return result == null ? org.tensorflow.util.WorkerHealth.UNRECOGNIZED : result;
    }
    /**
     * <code>.tensorflow.WorkerHealth health_status = 1;</code>
     */
    public Builder setHealthStatus(org.tensorflow.util.WorkerHealth value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      healthStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.WorkerHealth health_status = 1;</code>
     */
    public Builder clearHealthStatus() {
      
      healthStatus_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<org.tensorflow.util.Event> workerLog_ =
      java.util.Collections.emptyList();
    private void ensureWorkerLogIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        workerLog_ = new java.util.ArrayList<org.tensorflow.util.Event>(workerLog_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.util.Event, org.tensorflow.util.Event.Builder, org.tensorflow.util.EventOrBuilder> workerLogBuilder_;

    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public java.util.List<org.tensorflow.util.Event> getWorkerLogList() {
      if (workerLogBuilder_ == null) {
        return java.util.Collections.unmodifiableList(workerLog_);
      } else {
        return workerLogBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public int getWorkerLogCount() {
      if (workerLogBuilder_ == null) {
        return workerLog_.size();
      } else {
        return workerLogBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public org.tensorflow.util.Event getWorkerLog(int index) {
      if (workerLogBuilder_ == null) {
        return workerLog_.get(index);
      } else {
        return workerLogBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public Builder setWorkerLog(
        int index, org.tensorflow.util.Event value) {
      if (workerLogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkerLogIsMutable();
        workerLog_.set(index, value);
        onChanged();
      } else {
        workerLogBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public Builder setWorkerLog(
        int index, org.tensorflow.util.Event.Builder builderForValue) {
      if (workerLogBuilder_ == null) {
        ensureWorkerLogIsMutable();
        workerLog_.set(index, builderForValue.build());
        onChanged();
      } else {
        workerLogBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public Builder addWorkerLog(org.tensorflow.util.Event value) {
      if (workerLogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkerLogIsMutable();
        workerLog_.add(value);
        onChanged();
      } else {
        workerLogBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public Builder addWorkerLog(
        int index, org.tensorflow.util.Event value) {
      if (workerLogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkerLogIsMutable();
        workerLog_.add(index, value);
        onChanged();
      } else {
        workerLogBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public Builder addWorkerLog(
        org.tensorflow.util.Event.Builder builderForValue) {
      if (workerLogBuilder_ == null) {
        ensureWorkerLogIsMutable();
        workerLog_.add(builderForValue.build());
        onChanged();
      } else {
        workerLogBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public Builder addWorkerLog(
        int index, org.tensorflow.util.Event.Builder builderForValue) {
      if (workerLogBuilder_ == null) {
        ensureWorkerLogIsMutable();
        workerLog_.add(index, builderForValue.build());
        onChanged();
      } else {
        workerLogBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public Builder addAllWorkerLog(
        java.lang.Iterable<? extends org.tensorflow.util.Event> values) {
      if (workerLogBuilder_ == null) {
        ensureWorkerLogIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, workerLog_);
        onChanged();
      } else {
        workerLogBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public Builder clearWorkerLog() {
      if (workerLogBuilder_ == null) {
        workerLog_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        workerLogBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public Builder removeWorkerLog(int index) {
      if (workerLogBuilder_ == null) {
        ensureWorkerLogIsMutable();
        workerLog_.remove(index);
        onChanged();
      } else {
        workerLogBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public org.tensorflow.util.Event.Builder getWorkerLogBuilder(
        int index) {
      return getWorkerLogFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public org.tensorflow.util.EventOrBuilder getWorkerLogOrBuilder(
        int index) {
      if (workerLogBuilder_ == null) {
        return workerLog_.get(index);  } else {
        return workerLogBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public java.util.List<? extends org.tensorflow.util.EventOrBuilder> 
         getWorkerLogOrBuilderList() {
      if (workerLogBuilder_ != null) {
        return workerLogBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(workerLog_);
      }
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public org.tensorflow.util.Event.Builder addWorkerLogBuilder() {
      return getWorkerLogFieldBuilder().addBuilder(
          org.tensorflow.util.Event.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public org.tensorflow.util.Event.Builder addWorkerLogBuilder(
        int index) {
      return getWorkerLogFieldBuilder().addBuilder(
          index, org.tensorflow.util.Event.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.Event worker_log = 2;</code>
     */
    public java.util.List<org.tensorflow.util.Event.Builder> 
         getWorkerLogBuilderList() {
      return getWorkerLogFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.util.Event, org.tensorflow.util.Event.Builder, org.tensorflow.util.EventOrBuilder> 
        getWorkerLogFieldBuilder() {
      if (workerLogBuilder_ == null) {
        workerLogBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.util.Event, org.tensorflow.util.Event.Builder, org.tensorflow.util.EventOrBuilder>(
                workerLog_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        workerLog_ = null;
      }
      return workerLogBuilder_;
    }

    private java.lang.Object hostname_ = "";
    /**
     * <code>string hostname = 3;</code>
     */
    public java.lang.String getHostname() {
      java.lang.Object ref = hostname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hostname = 3;</code>
     */
    public com.google.protobuf.ByteString
        getHostnameBytes() {
      java.lang.Object ref = hostname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hostname = 3;</code>
     */
    public Builder setHostname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hostname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hostname = 3;</code>
     */
    public Builder clearHostname() {
      
      hostname_ = getDefaultInstance().getHostname();
      onChanged();
      return this;
    }
    /**
     * <code>string hostname = 3;</code>
     */
    public Builder setHostnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hostname_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.WorkerHeartbeatResponse)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.WorkerHeartbeatResponse)
  private static final org.tensorflow.util.WorkerHeartbeatResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.util.WorkerHeartbeatResponse();
  }

  public static org.tensorflow.util.WorkerHeartbeatResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkerHeartbeatResponse>
      PARSER = new com.google.protobuf.AbstractParser<WorkerHeartbeatResponse>() {
    @java.lang.Override
    public WorkerHeartbeatResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WorkerHeartbeatResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WorkerHeartbeatResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkerHeartbeatResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.util.WorkerHeartbeatResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

