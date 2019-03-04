// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: versions.proto

package org.tensorflow.framework;

/**
 * <pre>
 * Version information for a piece of serialized data
 * There are different types of versions for each type of data
 * (GraphDef, etc.), but they all have the same common shape
 * described here.
 * Each consumer has "consumer" and "min_producer" versions (specified
 * elsewhere).  A consumer is allowed to consume this data if
 *   producer &gt;= min_producer
 *   consumer &gt;= min_consumer
 *   consumer not in bad_consumers
 * </pre>
 *
 * Protobuf type {@code tensorflow.VersionDef}
 */
public  final class VersionDef extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.VersionDef)
    VersionDefOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VersionDef.newBuilder() to construct.
  private VersionDef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VersionDef() {
    badConsumers_ = emptyIntList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VersionDef(
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

            producer_ = input.readInt32();
            break;
          }
          case 16: {

            minConsumer_ = input.readInt32();
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              badConsumers_ = newIntList();
              mutable_bitField0_ |= 0x00000004;
            }
            badConsumers_.addInt(input.readInt32());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000004) != 0) && input.getBytesUntilLimit() > 0) {
              badConsumers_ = newIntList();
              mutable_bitField0_ |= 0x00000004;
            }
            while (input.getBytesUntilLimit() > 0) {
              badConsumers_.addInt(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        badConsumers_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.VersionsProtos.internal_static_tensorflow_VersionDef_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.VersionsProtos.internal_static_tensorflow_VersionDef_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.VersionDef.class, org.tensorflow.framework.VersionDef.Builder.class);
  }

  private int bitField0_;
  public static final int PRODUCER_FIELD_NUMBER = 1;
  private int producer_;
  /**
   * <pre>
   * The version of the code that produced this data.
   * </pre>
   *
   * <code>int32 producer = 1;</code>
   */
  public int getProducer() {
    return producer_;
  }

  public static final int MIN_CONSUMER_FIELD_NUMBER = 2;
  private int minConsumer_;
  /**
   * <pre>
   * Any consumer below this version is not allowed to consume this data.
   * </pre>
   *
   * <code>int32 min_consumer = 2;</code>
   */
  public int getMinConsumer() {
    return minConsumer_;
  }

  public static final int BAD_CONSUMERS_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.IntList badConsumers_;
  /**
   * <pre>
   * Specific consumer versions which are disallowed (e.g. due to bugs).
   * </pre>
   *
   * <code>repeated int32 bad_consumers = 3;</code>
   */
  public java.util.List<java.lang.Integer>
      getBadConsumersList() {
    return badConsumers_;
  }
  /**
   * <pre>
   * Specific consumer versions which are disallowed (e.g. due to bugs).
   * </pre>
   *
   * <code>repeated int32 bad_consumers = 3;</code>
   */
  public int getBadConsumersCount() {
    return badConsumers_.size();
  }
  /**
   * <pre>
   * Specific consumer versions which are disallowed (e.g. due to bugs).
   * </pre>
   *
   * <code>repeated int32 bad_consumers = 3;</code>
   */
  public int getBadConsumers(int index) {
    return badConsumers_.getInt(index);
  }
  private int badConsumersMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (producer_ != 0) {
      output.writeInt32(1, producer_);
    }
    if (minConsumer_ != 0) {
      output.writeInt32(2, minConsumer_);
    }
    if (getBadConsumersList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(badConsumersMemoizedSerializedSize);
    }
    for (int i = 0; i < badConsumers_.size(); i++) {
      output.writeInt32NoTag(badConsumers_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (producer_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, producer_);
    }
    if (minConsumer_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, minConsumer_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < badConsumers_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(badConsumers_.getInt(i));
      }
      size += dataSize;
      if (!getBadConsumersList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      badConsumersMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof org.tensorflow.framework.VersionDef)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.VersionDef other = (org.tensorflow.framework.VersionDef) obj;

    if (getProducer()
        != other.getProducer()) return false;
    if (getMinConsumer()
        != other.getMinConsumer()) return false;
    if (!getBadConsumersList()
        .equals(other.getBadConsumersList())) return false;
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
    hash = (37 * hash) + PRODUCER_FIELD_NUMBER;
    hash = (53 * hash) + getProducer();
    hash = (37 * hash) + MIN_CONSUMER_FIELD_NUMBER;
    hash = (53 * hash) + getMinConsumer();
    if (getBadConsumersCount() > 0) {
      hash = (37 * hash) + BAD_CONSUMERS_FIELD_NUMBER;
      hash = (53 * hash) + getBadConsumersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.VersionDef parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.VersionDef parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.VersionDef parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.VersionDef parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.VersionDef parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.VersionDef parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.VersionDef parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.VersionDef parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.VersionDef parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.VersionDef parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.VersionDef parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.VersionDef parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.VersionDef prototype) {
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
   * <pre>
   * Version information for a piece of serialized data
   * There are different types of versions for each type of data
   * (GraphDef, etc.), but they all have the same common shape
   * described here.
   * Each consumer has "consumer" and "min_producer" versions (specified
   * elsewhere).  A consumer is allowed to consume this data if
   *   producer &gt;= min_producer
   *   consumer &gt;= min_consumer
   *   consumer not in bad_consumers
   * </pre>
   *
   * Protobuf type {@code tensorflow.VersionDef}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.VersionDef)
      org.tensorflow.framework.VersionDefOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.VersionsProtos.internal_static_tensorflow_VersionDef_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.VersionsProtos.internal_static_tensorflow_VersionDef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.VersionDef.class, org.tensorflow.framework.VersionDef.Builder.class);
    }

    // Construct using org.tensorflow.framework.VersionDef.newBuilder()
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
      producer_ = 0;

      minConsumer_ = 0;

      badConsumers_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.VersionsProtos.internal_static_tensorflow_VersionDef_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.VersionDef getDefaultInstanceForType() {
      return org.tensorflow.framework.VersionDef.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.VersionDef build() {
      org.tensorflow.framework.VersionDef result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.VersionDef buildPartial() {
      org.tensorflow.framework.VersionDef result = new org.tensorflow.framework.VersionDef(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.producer_ = producer_;
      result.minConsumer_ = minConsumer_;
      if (((bitField0_ & 0x00000004) != 0)) {
        badConsumers_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.badConsumers_ = badConsumers_;
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
      if (other instanceof org.tensorflow.framework.VersionDef) {
        return mergeFrom((org.tensorflow.framework.VersionDef)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.VersionDef other) {
      if (other == org.tensorflow.framework.VersionDef.getDefaultInstance()) return this;
      if (other.getProducer() != 0) {
        setProducer(other.getProducer());
      }
      if (other.getMinConsumer() != 0) {
        setMinConsumer(other.getMinConsumer());
      }
      if (!other.badConsumers_.isEmpty()) {
        if (badConsumers_.isEmpty()) {
          badConsumers_ = other.badConsumers_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureBadConsumersIsMutable();
          badConsumers_.addAll(other.badConsumers_);
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
      org.tensorflow.framework.VersionDef parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.VersionDef) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int producer_ ;
    /**
     * <pre>
     * The version of the code that produced this data.
     * </pre>
     *
     * <code>int32 producer = 1;</code>
     */
    public int getProducer() {
      return producer_;
    }
    /**
     * <pre>
     * The version of the code that produced this data.
     * </pre>
     *
     * <code>int32 producer = 1;</code>
     */
    public Builder setProducer(int value) {
      
      producer_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The version of the code that produced this data.
     * </pre>
     *
     * <code>int32 producer = 1;</code>
     */
    public Builder clearProducer() {
      
      producer_ = 0;
      onChanged();
      return this;
    }

    private int minConsumer_ ;
    /**
     * <pre>
     * Any consumer below this version is not allowed to consume this data.
     * </pre>
     *
     * <code>int32 min_consumer = 2;</code>
     */
    public int getMinConsumer() {
      return minConsumer_;
    }
    /**
     * <pre>
     * Any consumer below this version is not allowed to consume this data.
     * </pre>
     *
     * <code>int32 min_consumer = 2;</code>
     */
    public Builder setMinConsumer(int value) {
      
      minConsumer_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Any consumer below this version is not allowed to consume this data.
     * </pre>
     *
     * <code>int32 min_consumer = 2;</code>
     */
    public Builder clearMinConsumer() {
      
      minConsumer_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList badConsumers_ = emptyIntList();
    private void ensureBadConsumersIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        badConsumers_ = mutableCopy(badConsumers_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * Specific consumer versions which are disallowed (e.g. due to bugs).
     * </pre>
     *
     * <code>repeated int32 bad_consumers = 3;</code>
     */
    public java.util.List<java.lang.Integer>
        getBadConsumersList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(badConsumers_) : badConsumers_;
    }
    /**
     * <pre>
     * Specific consumer versions which are disallowed (e.g. due to bugs).
     * </pre>
     *
     * <code>repeated int32 bad_consumers = 3;</code>
     */
    public int getBadConsumersCount() {
      return badConsumers_.size();
    }
    /**
     * <pre>
     * Specific consumer versions which are disallowed (e.g. due to bugs).
     * </pre>
     *
     * <code>repeated int32 bad_consumers = 3;</code>
     */
    public int getBadConsumers(int index) {
      return badConsumers_.getInt(index);
    }
    /**
     * <pre>
     * Specific consumer versions which are disallowed (e.g. due to bugs).
     * </pre>
     *
     * <code>repeated int32 bad_consumers = 3;</code>
     */
    public Builder setBadConsumers(
        int index, int value) {
      ensureBadConsumersIsMutable();
      badConsumers_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specific consumer versions which are disallowed (e.g. due to bugs).
     * </pre>
     *
     * <code>repeated int32 bad_consumers = 3;</code>
     */
    public Builder addBadConsumers(int value) {
      ensureBadConsumersIsMutable();
      badConsumers_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specific consumer versions which are disallowed (e.g. due to bugs).
     * </pre>
     *
     * <code>repeated int32 bad_consumers = 3;</code>
     */
    public Builder addAllBadConsumers(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureBadConsumersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, badConsumers_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specific consumer versions which are disallowed (e.g. due to bugs).
     * </pre>
     *
     * <code>repeated int32 bad_consumers = 3;</code>
     */
    public Builder clearBadConsumers() {
      badConsumers_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000004);
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


    // @@protoc_insertion_point(builder_scope:tensorflow.VersionDef)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.VersionDef)
  private static final org.tensorflow.framework.VersionDef DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.VersionDef();
  }

  public static org.tensorflow.framework.VersionDef getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VersionDef>
      PARSER = new com.google.protobuf.AbstractParser<VersionDef>() {
    @java.lang.Override
    public VersionDef parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VersionDef(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VersionDef> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VersionDef> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.VersionDef getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

