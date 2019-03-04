// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: variable.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.SaveSliceInfoDef}
 */
public  final class SaveSliceInfoDef extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.SaveSliceInfoDef)
    SaveSliceInfoDefOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SaveSliceInfoDef.newBuilder() to construct.
  private SaveSliceInfoDef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SaveSliceInfoDef() {
    fullName_ = "";
    fullShape_ = emptyLongList();
    varOffset_ = emptyLongList();
    varShape_ = emptyLongList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SaveSliceInfoDef(
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

            fullName_ = s;
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              fullShape_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            fullShape_.addLong(input.readInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              fullShape_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              fullShape_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              varOffset_ = newLongList();
              mutable_bitField0_ |= 0x00000004;
            }
            varOffset_.addLong(input.readInt64());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000004) != 0) && input.getBytesUntilLimit() > 0) {
              varOffset_ = newLongList();
              mutable_bitField0_ |= 0x00000004;
            }
            while (input.getBytesUntilLimit() > 0) {
              varOffset_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000008) != 0)) {
              varShape_ = newLongList();
              mutable_bitField0_ |= 0x00000008;
            }
            varShape_.addLong(input.readInt64());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000008) != 0) && input.getBytesUntilLimit() > 0) {
              varShape_ = newLongList();
              mutable_bitField0_ |= 0x00000008;
            }
            while (input.getBytesUntilLimit() > 0) {
              varShape_.addLong(input.readInt64());
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        fullShape_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        varOffset_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000008) != 0)) {
        varShape_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.VariableProtos.internal_static_tensorflow_SaveSliceInfoDef_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.VariableProtos.internal_static_tensorflow_SaveSliceInfoDef_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.SaveSliceInfoDef.class, org.tensorflow.framework.SaveSliceInfoDef.Builder.class);
  }

  private int bitField0_;
  public static final int FULL_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object fullName_;
  /**
   * <pre>
   * Name of the full variable of which this is a slice.
   * </pre>
   *
   * <code>string full_name = 1;</code>
   */
  public java.lang.String getFullName() {
    java.lang.Object ref = fullName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fullName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the full variable of which this is a slice.
   * </pre>
   *
   * <code>string full_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFullNameBytes() {
    java.lang.Object ref = fullName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fullName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FULL_SHAPE_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList fullShape_;
  /**
   * <pre>
   * Shape of the full variable.
   * </pre>
   *
   * <code>repeated int64 full_shape = 2;</code>
   */
  public java.util.List<java.lang.Long>
      getFullShapeList() {
    return fullShape_;
  }
  /**
   * <pre>
   * Shape of the full variable.
   * </pre>
   *
   * <code>repeated int64 full_shape = 2;</code>
   */
  public int getFullShapeCount() {
    return fullShape_.size();
  }
  /**
   * <pre>
   * Shape of the full variable.
   * </pre>
   *
   * <code>repeated int64 full_shape = 2;</code>
   */
  public long getFullShape(int index) {
    return fullShape_.getLong(index);
  }
  private int fullShapeMemoizedSerializedSize = -1;

  public static final int VAR_OFFSET_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.LongList varOffset_;
  /**
   * <pre>
   * Offset of this variable into the full variable.
   * </pre>
   *
   * <code>repeated int64 var_offset = 3;</code>
   */
  public java.util.List<java.lang.Long>
      getVarOffsetList() {
    return varOffset_;
  }
  /**
   * <pre>
   * Offset of this variable into the full variable.
   * </pre>
   *
   * <code>repeated int64 var_offset = 3;</code>
   */
  public int getVarOffsetCount() {
    return varOffset_.size();
  }
  /**
   * <pre>
   * Offset of this variable into the full variable.
   * </pre>
   *
   * <code>repeated int64 var_offset = 3;</code>
   */
  public long getVarOffset(int index) {
    return varOffset_.getLong(index);
  }
  private int varOffsetMemoizedSerializedSize = -1;

  public static final int VAR_SHAPE_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.LongList varShape_;
  /**
   * <pre>
   * Shape of this variable.
   * </pre>
   *
   * <code>repeated int64 var_shape = 4;</code>
   */
  public java.util.List<java.lang.Long>
      getVarShapeList() {
    return varShape_;
  }
  /**
   * <pre>
   * Shape of this variable.
   * </pre>
   *
   * <code>repeated int64 var_shape = 4;</code>
   */
  public int getVarShapeCount() {
    return varShape_.size();
  }
  /**
   * <pre>
   * Shape of this variable.
   * </pre>
   *
   * <code>repeated int64 var_shape = 4;</code>
   */
  public long getVarShape(int index) {
    return varShape_.getLong(index);
  }
  private int varShapeMemoizedSerializedSize = -1;

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
    if (!getFullNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fullName_);
    }
    if (getFullShapeList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(fullShapeMemoizedSerializedSize);
    }
    for (int i = 0; i < fullShape_.size(); i++) {
      output.writeInt64NoTag(fullShape_.getLong(i));
    }
    if (getVarOffsetList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(varOffsetMemoizedSerializedSize);
    }
    for (int i = 0; i < varOffset_.size(); i++) {
      output.writeInt64NoTag(varOffset_.getLong(i));
    }
    if (getVarShapeList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(varShapeMemoizedSerializedSize);
    }
    for (int i = 0; i < varShape_.size(); i++) {
      output.writeInt64NoTag(varShape_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFullNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fullName_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < fullShape_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(fullShape_.getLong(i));
      }
      size += dataSize;
      if (!getFullShapeList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      fullShapeMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < varOffset_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(varOffset_.getLong(i));
      }
      size += dataSize;
      if (!getVarOffsetList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      varOffsetMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < varShape_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(varShape_.getLong(i));
      }
      size += dataSize;
      if (!getVarShapeList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      varShapeMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof org.tensorflow.framework.SaveSliceInfoDef)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.SaveSliceInfoDef other = (org.tensorflow.framework.SaveSliceInfoDef) obj;

    if (!getFullName()
        .equals(other.getFullName())) return false;
    if (!getFullShapeList()
        .equals(other.getFullShapeList())) return false;
    if (!getVarOffsetList()
        .equals(other.getVarOffsetList())) return false;
    if (!getVarShapeList()
        .equals(other.getVarShapeList())) return false;
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
    hash = (37 * hash) + FULL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFullName().hashCode();
    if (getFullShapeCount() > 0) {
      hash = (37 * hash) + FULL_SHAPE_FIELD_NUMBER;
      hash = (53 * hash) + getFullShapeList().hashCode();
    }
    if (getVarOffsetCount() > 0) {
      hash = (37 * hash) + VAR_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getVarOffsetList().hashCode();
    }
    if (getVarShapeCount() > 0) {
      hash = (37 * hash) + VAR_SHAPE_FIELD_NUMBER;
      hash = (53 * hash) + getVarShapeList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.SaveSliceInfoDef parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.SaveSliceInfoDef parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.SaveSliceInfoDef parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.SaveSliceInfoDef parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.SaveSliceInfoDef parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.SaveSliceInfoDef parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.SaveSliceInfoDef parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.SaveSliceInfoDef parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.SaveSliceInfoDef parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.SaveSliceInfoDef parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.SaveSliceInfoDef parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.SaveSliceInfoDef parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.SaveSliceInfoDef prototype) {
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
   * Protobuf type {@code tensorflow.SaveSliceInfoDef}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.SaveSliceInfoDef)
      org.tensorflow.framework.SaveSliceInfoDefOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.VariableProtos.internal_static_tensorflow_SaveSliceInfoDef_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.VariableProtos.internal_static_tensorflow_SaveSliceInfoDef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.SaveSliceInfoDef.class, org.tensorflow.framework.SaveSliceInfoDef.Builder.class);
    }

    // Construct using org.tensorflow.framework.SaveSliceInfoDef.newBuilder()
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
      fullName_ = "";

      fullShape_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      varOffset_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000004);
      varShape_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.VariableProtos.internal_static_tensorflow_SaveSliceInfoDef_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.SaveSliceInfoDef getDefaultInstanceForType() {
      return org.tensorflow.framework.SaveSliceInfoDef.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.SaveSliceInfoDef build() {
      org.tensorflow.framework.SaveSliceInfoDef result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.SaveSliceInfoDef buildPartial() {
      org.tensorflow.framework.SaveSliceInfoDef result = new org.tensorflow.framework.SaveSliceInfoDef(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.fullName_ = fullName_;
      if (((bitField0_ & 0x00000002) != 0)) {
        fullShape_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.fullShape_ = fullShape_;
      if (((bitField0_ & 0x00000004) != 0)) {
        varOffset_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.varOffset_ = varOffset_;
      if (((bitField0_ & 0x00000008) != 0)) {
        varShape_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.varShape_ = varShape_;
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
      if (other instanceof org.tensorflow.framework.SaveSliceInfoDef) {
        return mergeFrom((org.tensorflow.framework.SaveSliceInfoDef)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.SaveSliceInfoDef other) {
      if (other == org.tensorflow.framework.SaveSliceInfoDef.getDefaultInstance()) return this;
      if (!other.getFullName().isEmpty()) {
        fullName_ = other.fullName_;
        onChanged();
      }
      if (!other.fullShape_.isEmpty()) {
        if (fullShape_.isEmpty()) {
          fullShape_ = other.fullShape_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureFullShapeIsMutable();
          fullShape_.addAll(other.fullShape_);
        }
        onChanged();
      }
      if (!other.varOffset_.isEmpty()) {
        if (varOffset_.isEmpty()) {
          varOffset_ = other.varOffset_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureVarOffsetIsMutable();
          varOffset_.addAll(other.varOffset_);
        }
        onChanged();
      }
      if (!other.varShape_.isEmpty()) {
        if (varShape_.isEmpty()) {
          varShape_ = other.varShape_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureVarShapeIsMutable();
          varShape_.addAll(other.varShape_);
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
      org.tensorflow.framework.SaveSliceInfoDef parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.SaveSliceInfoDef) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object fullName_ = "";
    /**
     * <pre>
     * Name of the full variable of which this is a slice.
     * </pre>
     *
     * <code>string full_name = 1;</code>
     */
    public java.lang.String getFullName() {
      java.lang.Object ref = fullName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fullName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the full variable of which this is a slice.
     * </pre>
     *
     * <code>string full_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFullNameBytes() {
      java.lang.Object ref = fullName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fullName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the full variable of which this is a slice.
     * </pre>
     *
     * <code>string full_name = 1;</code>
     */
    public Builder setFullName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fullName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the full variable of which this is a slice.
     * </pre>
     *
     * <code>string full_name = 1;</code>
     */
    public Builder clearFullName() {
      
      fullName_ = getDefaultInstance().getFullName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the full variable of which this is a slice.
     * </pre>
     *
     * <code>string full_name = 1;</code>
     */
    public Builder setFullNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fullName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList fullShape_ = emptyLongList();
    private void ensureFullShapeIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        fullShape_ = mutableCopy(fullShape_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * Shape of the full variable.
     * </pre>
     *
     * <code>repeated int64 full_shape = 2;</code>
     */
    public java.util.List<java.lang.Long>
        getFullShapeList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(fullShape_) : fullShape_;
    }
    /**
     * <pre>
     * Shape of the full variable.
     * </pre>
     *
     * <code>repeated int64 full_shape = 2;</code>
     */
    public int getFullShapeCount() {
      return fullShape_.size();
    }
    /**
     * <pre>
     * Shape of the full variable.
     * </pre>
     *
     * <code>repeated int64 full_shape = 2;</code>
     */
    public long getFullShape(int index) {
      return fullShape_.getLong(index);
    }
    /**
     * <pre>
     * Shape of the full variable.
     * </pre>
     *
     * <code>repeated int64 full_shape = 2;</code>
     */
    public Builder setFullShape(
        int index, long value) {
      ensureFullShapeIsMutable();
      fullShape_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Shape of the full variable.
     * </pre>
     *
     * <code>repeated int64 full_shape = 2;</code>
     */
    public Builder addFullShape(long value) {
      ensureFullShapeIsMutable();
      fullShape_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Shape of the full variable.
     * </pre>
     *
     * <code>repeated int64 full_shape = 2;</code>
     */
    public Builder addAllFullShape(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureFullShapeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fullShape_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Shape of the full variable.
     * </pre>
     *
     * <code>repeated int64 full_shape = 2;</code>
     */
    public Builder clearFullShape() {
      fullShape_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList varOffset_ = emptyLongList();
    private void ensureVarOffsetIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        varOffset_ = mutableCopy(varOffset_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * Offset of this variable into the full variable.
     * </pre>
     *
     * <code>repeated int64 var_offset = 3;</code>
     */
    public java.util.List<java.lang.Long>
        getVarOffsetList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(varOffset_) : varOffset_;
    }
    /**
     * <pre>
     * Offset of this variable into the full variable.
     * </pre>
     *
     * <code>repeated int64 var_offset = 3;</code>
     */
    public int getVarOffsetCount() {
      return varOffset_.size();
    }
    /**
     * <pre>
     * Offset of this variable into the full variable.
     * </pre>
     *
     * <code>repeated int64 var_offset = 3;</code>
     */
    public long getVarOffset(int index) {
      return varOffset_.getLong(index);
    }
    /**
     * <pre>
     * Offset of this variable into the full variable.
     * </pre>
     *
     * <code>repeated int64 var_offset = 3;</code>
     */
    public Builder setVarOffset(
        int index, long value) {
      ensureVarOffsetIsMutable();
      varOffset_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Offset of this variable into the full variable.
     * </pre>
     *
     * <code>repeated int64 var_offset = 3;</code>
     */
    public Builder addVarOffset(long value) {
      ensureVarOffsetIsMutable();
      varOffset_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Offset of this variable into the full variable.
     * </pre>
     *
     * <code>repeated int64 var_offset = 3;</code>
     */
    public Builder addAllVarOffset(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureVarOffsetIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, varOffset_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Offset of this variable into the full variable.
     * </pre>
     *
     * <code>repeated int64 var_offset = 3;</code>
     */
    public Builder clearVarOffset() {
      varOffset_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList varShape_ = emptyLongList();
    private void ensureVarShapeIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        varShape_ = mutableCopy(varShape_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <pre>
     * Shape of this variable.
     * </pre>
     *
     * <code>repeated int64 var_shape = 4;</code>
     */
    public java.util.List<java.lang.Long>
        getVarShapeList() {
      return ((bitField0_ & 0x00000008) != 0) ?
               java.util.Collections.unmodifiableList(varShape_) : varShape_;
    }
    /**
     * <pre>
     * Shape of this variable.
     * </pre>
     *
     * <code>repeated int64 var_shape = 4;</code>
     */
    public int getVarShapeCount() {
      return varShape_.size();
    }
    /**
     * <pre>
     * Shape of this variable.
     * </pre>
     *
     * <code>repeated int64 var_shape = 4;</code>
     */
    public long getVarShape(int index) {
      return varShape_.getLong(index);
    }
    /**
     * <pre>
     * Shape of this variable.
     * </pre>
     *
     * <code>repeated int64 var_shape = 4;</code>
     */
    public Builder setVarShape(
        int index, long value) {
      ensureVarShapeIsMutable();
      varShape_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Shape of this variable.
     * </pre>
     *
     * <code>repeated int64 var_shape = 4;</code>
     */
    public Builder addVarShape(long value) {
      ensureVarShapeIsMutable();
      varShape_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Shape of this variable.
     * </pre>
     *
     * <code>repeated int64 var_shape = 4;</code>
     */
    public Builder addAllVarShape(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureVarShapeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, varShape_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Shape of this variable.
     * </pre>
     *
     * <code>repeated int64 var_shape = 4;</code>
     */
    public Builder clearVarShape() {
      varShape_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000008);
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


    // @@protoc_insertion_point(builder_scope:tensorflow.SaveSliceInfoDef)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.SaveSliceInfoDef)
  private static final org.tensorflow.framework.SaveSliceInfoDef DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.SaveSliceInfoDef();
  }

  public static org.tensorflow.framework.SaveSliceInfoDef getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaveSliceInfoDef>
      PARSER = new com.google.protobuf.AbstractParser<SaveSliceInfoDef>() {
    @java.lang.Override
    public SaveSliceInfoDef parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SaveSliceInfoDef(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SaveSliceInfoDef> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaveSliceInfoDef> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.SaveSliceInfoDef getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

