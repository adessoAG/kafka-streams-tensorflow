// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: master.proto

package org.tensorflow.distruntime;

/**
 * Protobuf type {@code tensorflow.PartialRunSetupResponse}
 */
public  final class PartialRunSetupResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.PartialRunSetupResponse)
    PartialRunSetupResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PartialRunSetupResponse.newBuilder() to construct.
  private PartialRunSetupResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PartialRunSetupResponse() {
    partialRunHandle_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PartialRunSetupResponse(
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

            partialRunHandle_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_PartialRunSetupResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_PartialRunSetupResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.PartialRunSetupResponse.class, org.tensorflow.distruntime.PartialRunSetupResponse.Builder.class);
  }

  public static final int PARTIAL_RUN_HANDLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object partialRunHandle_;
  /**
   * <pre>
   * The unique handle corresponding to the ongoing partial run call setup by
   * the invocation to PartialRunSetup. This handle may be passed to
   * RunStepRequest to send and receive tensors for this partial run.
   * </pre>
   *
   * <code>string partial_run_handle = 1;</code>
   */
  public java.lang.String getPartialRunHandle() {
    java.lang.Object ref = partialRunHandle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      partialRunHandle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique handle corresponding to the ongoing partial run call setup by
   * the invocation to PartialRunSetup. This handle may be passed to
   * RunStepRequest to send and receive tensors for this partial run.
   * </pre>
   *
   * <code>string partial_run_handle = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPartialRunHandleBytes() {
    java.lang.Object ref = partialRunHandle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      partialRunHandle_ = b;
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
    if (!getPartialRunHandleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, partialRunHandle_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPartialRunHandleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, partialRunHandle_);
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
    if (!(obj instanceof org.tensorflow.distruntime.PartialRunSetupResponse)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.PartialRunSetupResponse other = (org.tensorflow.distruntime.PartialRunSetupResponse) obj;

    if (!getPartialRunHandle()
        .equals(other.getPartialRunHandle())) return false;
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
    hash = (37 * hash) + PARTIAL_RUN_HANDLE_FIELD_NUMBER;
    hash = (53 * hash) + getPartialRunHandle().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.PartialRunSetupResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.PartialRunSetupResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.PartialRunSetupResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.PartialRunSetupResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.PartialRunSetupResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.PartialRunSetupResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.PartialRunSetupResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.PartialRunSetupResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.PartialRunSetupResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.PartialRunSetupResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.PartialRunSetupResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.PartialRunSetupResponse parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.PartialRunSetupResponse prototype) {
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
   * Protobuf type {@code tensorflow.PartialRunSetupResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.PartialRunSetupResponse)
      org.tensorflow.distruntime.PartialRunSetupResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_PartialRunSetupResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_PartialRunSetupResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.PartialRunSetupResponse.class, org.tensorflow.distruntime.PartialRunSetupResponse.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.PartialRunSetupResponse.newBuilder()
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
      partialRunHandle_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_PartialRunSetupResponse_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.PartialRunSetupResponse getDefaultInstanceForType() {
      return org.tensorflow.distruntime.PartialRunSetupResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.PartialRunSetupResponse build() {
      org.tensorflow.distruntime.PartialRunSetupResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.PartialRunSetupResponse buildPartial() {
      org.tensorflow.distruntime.PartialRunSetupResponse result = new org.tensorflow.distruntime.PartialRunSetupResponse(this);
      result.partialRunHandle_ = partialRunHandle_;
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
      if (other instanceof org.tensorflow.distruntime.PartialRunSetupResponse) {
        return mergeFrom((org.tensorflow.distruntime.PartialRunSetupResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.PartialRunSetupResponse other) {
      if (other == org.tensorflow.distruntime.PartialRunSetupResponse.getDefaultInstance()) return this;
      if (!other.getPartialRunHandle().isEmpty()) {
        partialRunHandle_ = other.partialRunHandle_;
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
      org.tensorflow.distruntime.PartialRunSetupResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.PartialRunSetupResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object partialRunHandle_ = "";
    /**
     * <pre>
     * The unique handle corresponding to the ongoing partial run call setup by
     * the invocation to PartialRunSetup. This handle may be passed to
     * RunStepRequest to send and receive tensors for this partial run.
     * </pre>
     *
     * <code>string partial_run_handle = 1;</code>
     */
    public java.lang.String getPartialRunHandle() {
      java.lang.Object ref = partialRunHandle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        partialRunHandle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique handle corresponding to the ongoing partial run call setup by
     * the invocation to PartialRunSetup. This handle may be passed to
     * RunStepRequest to send and receive tensors for this partial run.
     * </pre>
     *
     * <code>string partial_run_handle = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPartialRunHandleBytes() {
      java.lang.Object ref = partialRunHandle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        partialRunHandle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique handle corresponding to the ongoing partial run call setup by
     * the invocation to PartialRunSetup. This handle may be passed to
     * RunStepRequest to send and receive tensors for this partial run.
     * </pre>
     *
     * <code>string partial_run_handle = 1;</code>
     */
    public Builder setPartialRunHandle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      partialRunHandle_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique handle corresponding to the ongoing partial run call setup by
     * the invocation to PartialRunSetup. This handle may be passed to
     * RunStepRequest to send and receive tensors for this partial run.
     * </pre>
     *
     * <code>string partial_run_handle = 1;</code>
     */
    public Builder clearPartialRunHandle() {
      
      partialRunHandle_ = getDefaultInstance().getPartialRunHandle();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique handle corresponding to the ongoing partial run call setup by
     * the invocation to PartialRunSetup. This handle may be passed to
     * RunStepRequest to send and receive tensors for this partial run.
     * </pre>
     *
     * <code>string partial_run_handle = 1;</code>
     */
    public Builder setPartialRunHandleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      partialRunHandle_ = value;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.PartialRunSetupResponse)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.PartialRunSetupResponse)
  private static final org.tensorflow.distruntime.PartialRunSetupResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.PartialRunSetupResponse();
  }

  public static org.tensorflow.distruntime.PartialRunSetupResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartialRunSetupResponse>
      PARSER = new com.google.protobuf.AbstractParser<PartialRunSetupResponse>() {
    @java.lang.Override
    public PartialRunSetupResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PartialRunSetupResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PartialRunSetupResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartialRunSetupResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.PartialRunSetupResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

