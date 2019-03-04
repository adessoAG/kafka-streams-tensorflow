// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graph_transfer_info.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.GraphTransferGraphOutputNodeInfo}
 */
public  final class GraphTransferGraphOutputNodeInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.GraphTransferGraphOutputNodeInfo)
    GraphTransferGraphOutputNodeInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GraphTransferGraphOutputNodeInfo.newBuilder() to construct.
  private GraphTransferGraphOutputNodeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GraphTransferGraphOutputNodeInfo() {
    name_ = "";
    shape_ = emptyLongList();
    dtype_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GraphTransferGraphOutputNodeInfo(
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

            name_ = s;
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              shape_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            shape_.addLong(input.readInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              shape_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              shape_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            dtype_ = rawValue;
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
        shape_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.GraphTransferInfoProto.internal_static_tensorflow_GraphTransferGraphOutputNodeInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.GraphTransferInfoProto.internal_static_tensorflow_GraphTransferGraphOutputNodeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.GraphTransferGraphOutputNodeInfo.class, org.tensorflow.framework.GraphTransferGraphOutputNodeInfo.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHAPE_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList shape_;
  /**
   * <code>repeated int64 shape = 2;</code>
   */
  public java.util.List<java.lang.Long>
      getShapeList() {
    return shape_;
  }
  /**
   * <code>repeated int64 shape = 2;</code>
   */
  public int getShapeCount() {
    return shape_.size();
  }
  /**
   * <code>repeated int64 shape = 2;</code>
   */
  public long getShape(int index) {
    return shape_.getLong(index);
  }
  private int shapeMemoizedSerializedSize = -1;

  public static final int DTYPE_FIELD_NUMBER = 3;
  private int dtype_;
  /**
   * <code>.tensorflow.DataType dtype = 3;</code>
   */
  public int getDtypeValue() {
    return dtype_;
  }
  /**
   * <code>.tensorflow.DataType dtype = 3;</code>
   */
  public org.tensorflow.framework.DataType getDtype() {
    @SuppressWarnings("deprecation")
    org.tensorflow.framework.DataType result = org.tensorflow.framework.DataType.valueOf(dtype_);
    return result == null ? org.tensorflow.framework.DataType.UNRECOGNIZED : result;
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
    getSerializedSize();
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (getShapeList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(shapeMemoizedSerializedSize);
    }
    for (int i = 0; i < shape_.size(); i++) {
      output.writeInt64NoTag(shape_.getLong(i));
    }
    if (dtype_ != org.tensorflow.framework.DataType.DT_INVALID.getNumber()) {
      output.writeEnum(3, dtype_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < shape_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(shape_.getLong(i));
      }
      size += dataSize;
      if (!getShapeList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      shapeMemoizedSerializedSize = dataSize;
    }
    if (dtype_ != org.tensorflow.framework.DataType.DT_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, dtype_);
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
    if (!(obj instanceof org.tensorflow.framework.GraphTransferGraphOutputNodeInfo)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.GraphTransferGraphOutputNodeInfo other = (org.tensorflow.framework.GraphTransferGraphOutputNodeInfo) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getShapeList()
        .equals(other.getShapeList())) return false;
    if (dtype_ != other.dtype_) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getShapeCount() > 0) {
      hash = (37 * hash) + SHAPE_FIELD_NUMBER;
      hash = (53 * hash) + getShapeList().hashCode();
    }
    hash = (37 * hash) + DTYPE_FIELD_NUMBER;
    hash = (53 * hash) + dtype_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.GraphTransferGraphOutputNodeInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.GraphTransferGraphOutputNodeInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphTransferGraphOutputNodeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.GraphTransferGraphOutputNodeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphTransferGraphOutputNodeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.GraphTransferGraphOutputNodeInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphTransferGraphOutputNodeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.GraphTransferGraphOutputNodeInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphTransferGraphOutputNodeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.GraphTransferGraphOutputNodeInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphTransferGraphOutputNodeInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.GraphTransferGraphOutputNodeInfo parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.GraphTransferGraphOutputNodeInfo prototype) {
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
   * Protobuf type {@code tensorflow.GraphTransferGraphOutputNodeInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.GraphTransferGraphOutputNodeInfo)
      org.tensorflow.framework.GraphTransferGraphOutputNodeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.GraphTransferInfoProto.internal_static_tensorflow_GraphTransferGraphOutputNodeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.GraphTransferInfoProto.internal_static_tensorflow_GraphTransferGraphOutputNodeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.GraphTransferGraphOutputNodeInfo.class, org.tensorflow.framework.GraphTransferGraphOutputNodeInfo.Builder.class);
    }

    // Construct using org.tensorflow.framework.GraphTransferGraphOutputNodeInfo.newBuilder()
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
      name_ = "";

      shape_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      dtype_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.GraphTransferInfoProto.internal_static_tensorflow_GraphTransferGraphOutputNodeInfo_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.GraphTransferGraphOutputNodeInfo getDefaultInstanceForType() {
      return org.tensorflow.framework.GraphTransferGraphOutputNodeInfo.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.GraphTransferGraphOutputNodeInfo build() {
      org.tensorflow.framework.GraphTransferGraphOutputNodeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.GraphTransferGraphOutputNodeInfo buildPartial() {
      org.tensorflow.framework.GraphTransferGraphOutputNodeInfo result = new org.tensorflow.framework.GraphTransferGraphOutputNodeInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      if (((bitField0_ & 0x00000002) != 0)) {
        shape_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.shape_ = shape_;
      result.dtype_ = dtype_;
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
      if (other instanceof org.tensorflow.framework.GraphTransferGraphOutputNodeInfo) {
        return mergeFrom((org.tensorflow.framework.GraphTransferGraphOutputNodeInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.GraphTransferGraphOutputNodeInfo other) {
      if (other == org.tensorflow.framework.GraphTransferGraphOutputNodeInfo.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.shape_.isEmpty()) {
        if (shape_.isEmpty()) {
          shape_ = other.shape_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureShapeIsMutable();
          shape_.addAll(other.shape_);
        }
        onChanged();
      }
      if (other.dtype_ != 0) {
        setDtypeValue(other.getDtypeValue());
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
      org.tensorflow.framework.GraphTransferGraphOutputNodeInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.GraphTransferGraphOutputNodeInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList shape_ = emptyLongList();
    private void ensureShapeIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        shape_ = mutableCopy(shape_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int64 shape = 2;</code>
     */
    public java.util.List<java.lang.Long>
        getShapeList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(shape_) : shape_;
    }
    /**
     * <code>repeated int64 shape = 2;</code>
     */
    public int getShapeCount() {
      return shape_.size();
    }
    /**
     * <code>repeated int64 shape = 2;</code>
     */
    public long getShape(int index) {
      return shape_.getLong(index);
    }
    /**
     * <code>repeated int64 shape = 2;</code>
     */
    public Builder setShape(
        int index, long value) {
      ensureShapeIsMutable();
      shape_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 shape = 2;</code>
     */
    public Builder addShape(long value) {
      ensureShapeIsMutable();
      shape_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 shape = 2;</code>
     */
    public Builder addAllShape(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureShapeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, shape_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 shape = 2;</code>
     */
    public Builder clearShape() {
      shape_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private int dtype_ = 0;
    /**
     * <code>.tensorflow.DataType dtype = 3;</code>
     */
    public int getDtypeValue() {
      return dtype_;
    }
    /**
     * <code>.tensorflow.DataType dtype = 3;</code>
     */
    public Builder setDtypeValue(int value) {
      dtype_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.DataType dtype = 3;</code>
     */
    public org.tensorflow.framework.DataType getDtype() {
      @SuppressWarnings("deprecation")
      org.tensorflow.framework.DataType result = org.tensorflow.framework.DataType.valueOf(dtype_);
      return result == null ? org.tensorflow.framework.DataType.UNRECOGNIZED : result;
    }
    /**
     * <code>.tensorflow.DataType dtype = 3;</code>
     */
    public Builder setDtype(org.tensorflow.framework.DataType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dtype_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.DataType dtype = 3;</code>
     */
    public Builder clearDtype() {
      
      dtype_ = 0;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.GraphTransferGraphOutputNodeInfo)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.GraphTransferGraphOutputNodeInfo)
  private static final org.tensorflow.framework.GraphTransferGraphOutputNodeInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.GraphTransferGraphOutputNodeInfo();
  }

  public static org.tensorflow.framework.GraphTransferGraphOutputNodeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GraphTransferGraphOutputNodeInfo>
      PARSER = new com.google.protobuf.AbstractParser<GraphTransferGraphOutputNodeInfo>() {
    @java.lang.Override
    public GraphTransferGraphOutputNodeInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GraphTransferGraphOutputNodeInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GraphTransferGraphOutputNodeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GraphTransferGraphOutputNodeInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.GraphTransferGraphOutputNodeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

