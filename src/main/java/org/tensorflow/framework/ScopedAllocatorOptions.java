// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rewriter_config.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.ScopedAllocatorOptions}
 */
public  final class ScopedAllocatorOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.ScopedAllocatorOptions)
    ScopedAllocatorOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScopedAllocatorOptions.newBuilder() to construct.
  private ScopedAllocatorOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScopedAllocatorOptions() {
    enableOp_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ScopedAllocatorOptions(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              enableOp_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            enableOp_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        enableOp_ = enableOp_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.RewriterConfigProtos.internal_static_tensorflow_ScopedAllocatorOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.RewriterConfigProtos.internal_static_tensorflow_ScopedAllocatorOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.ScopedAllocatorOptions.class, org.tensorflow.framework.ScopedAllocatorOptions.Builder.class);
  }

  public static final int ENABLE_OP_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList enableOp_;
  /**
   * <pre>
   * If present, only perform optimization for these ops.
   * </pre>
   *
   * <code>repeated string enable_op = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getEnableOpList() {
    return enableOp_;
  }
  /**
   * <pre>
   * If present, only perform optimization for these ops.
   * </pre>
   *
   * <code>repeated string enable_op = 1;</code>
   */
  public int getEnableOpCount() {
    return enableOp_.size();
  }
  /**
   * <pre>
   * If present, only perform optimization for these ops.
   * </pre>
   *
   * <code>repeated string enable_op = 1;</code>
   */
  public java.lang.String getEnableOp(int index) {
    return enableOp_.get(index);
  }
  /**
   * <pre>
   * If present, only perform optimization for these ops.
   * </pre>
   *
   * <code>repeated string enable_op = 1;</code>
   */
  public com.google.protobuf.ByteString
      getEnableOpBytes(int index) {
    return enableOp_.getByteString(index);
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
    for (int i = 0; i < enableOp_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, enableOp_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < enableOp_.size(); i++) {
        dataSize += computeStringSizeNoTag(enableOp_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEnableOpList().size();
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
    if (!(obj instanceof org.tensorflow.framework.ScopedAllocatorOptions)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.ScopedAllocatorOptions other = (org.tensorflow.framework.ScopedAllocatorOptions) obj;

    if (!getEnableOpList()
        .equals(other.getEnableOpList())) return false;
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
    if (getEnableOpCount() > 0) {
      hash = (37 * hash) + ENABLE_OP_FIELD_NUMBER;
      hash = (53 * hash) + getEnableOpList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.ScopedAllocatorOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.ScopedAllocatorOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.ScopedAllocatorOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.ScopedAllocatorOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.ScopedAllocatorOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.ScopedAllocatorOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.ScopedAllocatorOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.ScopedAllocatorOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.ScopedAllocatorOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.ScopedAllocatorOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.ScopedAllocatorOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.ScopedAllocatorOptions parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.ScopedAllocatorOptions prototype) {
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
   * Protobuf type {@code tensorflow.ScopedAllocatorOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.ScopedAllocatorOptions)
      org.tensorflow.framework.ScopedAllocatorOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.RewriterConfigProtos.internal_static_tensorflow_ScopedAllocatorOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.RewriterConfigProtos.internal_static_tensorflow_ScopedAllocatorOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.ScopedAllocatorOptions.class, org.tensorflow.framework.ScopedAllocatorOptions.Builder.class);
    }

    // Construct using org.tensorflow.framework.ScopedAllocatorOptions.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      enableOp_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.RewriterConfigProtos.internal_static_tensorflow_ScopedAllocatorOptions_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.ScopedAllocatorOptions getDefaultInstanceForType() {
      return org.tensorflow.framework.ScopedAllocatorOptions.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.ScopedAllocatorOptions build() {
      org.tensorflow.framework.ScopedAllocatorOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.ScopedAllocatorOptions buildPartial() {
      org.tensorflow.framework.ScopedAllocatorOptions result = new org.tensorflow.framework.ScopedAllocatorOptions(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        enableOp_ = enableOp_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.enableOp_ = enableOp_;
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
      if (other instanceof org.tensorflow.framework.ScopedAllocatorOptions) {
        return mergeFrom((org.tensorflow.framework.ScopedAllocatorOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.ScopedAllocatorOptions other) {
      if (other == org.tensorflow.framework.ScopedAllocatorOptions.getDefaultInstance()) return this;
      if (!other.enableOp_.isEmpty()) {
        if (enableOp_.isEmpty()) {
          enableOp_ = other.enableOp_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureEnableOpIsMutable();
          enableOp_.addAll(other.enableOp_);
        }
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
      org.tensorflow.framework.ScopedAllocatorOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.ScopedAllocatorOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList enableOp_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureEnableOpIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        enableOp_ = new com.google.protobuf.LazyStringArrayList(enableOp_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * If present, only perform optimization for these ops.
     * </pre>
     *
     * <code>repeated string enable_op = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getEnableOpList() {
      return enableOp_.getUnmodifiableView();
    }
    /**
     * <pre>
     * If present, only perform optimization for these ops.
     * </pre>
     *
     * <code>repeated string enable_op = 1;</code>
     */
    public int getEnableOpCount() {
      return enableOp_.size();
    }
    /**
     * <pre>
     * If present, only perform optimization for these ops.
     * </pre>
     *
     * <code>repeated string enable_op = 1;</code>
     */
    public java.lang.String getEnableOp(int index) {
      return enableOp_.get(index);
    }
    /**
     * <pre>
     * If present, only perform optimization for these ops.
     * </pre>
     *
     * <code>repeated string enable_op = 1;</code>
     */
    public com.google.protobuf.ByteString
        getEnableOpBytes(int index) {
      return enableOp_.getByteString(index);
    }
    /**
     * <pre>
     * If present, only perform optimization for these ops.
     * </pre>
     *
     * <code>repeated string enable_op = 1;</code>
     */
    public Builder setEnableOp(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEnableOpIsMutable();
      enableOp_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If present, only perform optimization for these ops.
     * </pre>
     *
     * <code>repeated string enable_op = 1;</code>
     */
    public Builder addEnableOp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEnableOpIsMutable();
      enableOp_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If present, only perform optimization for these ops.
     * </pre>
     *
     * <code>repeated string enable_op = 1;</code>
     */
    public Builder addAllEnableOp(
        java.lang.Iterable<java.lang.String> values) {
      ensureEnableOpIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, enableOp_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If present, only perform optimization for these ops.
     * </pre>
     *
     * <code>repeated string enable_op = 1;</code>
     */
    public Builder clearEnableOp() {
      enableOp_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If present, only perform optimization for these ops.
     * </pre>
     *
     * <code>repeated string enable_op = 1;</code>
     */
    public Builder addEnableOpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureEnableOpIsMutable();
      enableOp_.add(value);
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


    // @@protoc_insertion_point(builder_scope:tensorflow.ScopedAllocatorOptions)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.ScopedAllocatorOptions)
  private static final org.tensorflow.framework.ScopedAllocatorOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.ScopedAllocatorOptions();
  }

  public static org.tensorflow.framework.ScopedAllocatorOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScopedAllocatorOptions>
      PARSER = new com.google.protobuf.AbstractParser<ScopedAllocatorOptions>() {
    @java.lang.Override
    public ScopedAllocatorOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ScopedAllocatorOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ScopedAllocatorOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScopedAllocatorOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.ScopedAllocatorOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

