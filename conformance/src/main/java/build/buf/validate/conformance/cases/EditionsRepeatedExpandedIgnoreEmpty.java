// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/ignore_proto_editions.proto
// Protobuf Java Version: 4.29.1

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty}
 */
public final class EditionsRepeatedExpandedIgnoreEmpty extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty)
    EditionsRepeatedExpandedIgnoreEmptyOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      EditionsRepeatedExpandedIgnoreEmpty.class.getName());
  }
  // Use EditionsRepeatedExpandedIgnoreEmpty.newBuilder() to construct.
  private EditionsRepeatedExpandedIgnoreEmpty(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private EditionsRepeatedExpandedIgnoreEmpty() {
    val_ = emptyIntList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.IgnoreProtoEditionsProto.internal_static_buf_validate_conformance_cases_EditionsRepeatedExpandedIgnoreEmpty_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.IgnoreProtoEditionsProto.internal_static_buf_validate_conformance_cases_EditionsRepeatedExpandedIgnoreEmpty_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty.class, build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty.Builder.class);
  }

  public static final int VAL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList val_ =
      emptyIntList();
  /**
   * <code>repeated int32 val = 1 [json_name = "val", features = { ... }</code>
   * @return A list containing the val.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getValList() {
    return val_;
  }
  /**
   * <code>repeated int32 val = 1 [json_name = "val", features = { ... }</code>
   * @return The count of val.
   */
  public int getValCount() {
    return val_.size();
  }
  /**
   * <code>repeated int32 val = 1 [json_name = "val", features = { ... }</code>
   * @param index The index of the element to return.
   * @return The val at the given index.
   */
  public int getVal(int index) {
    return val_.getInt(index);
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
    for (int i = 0; i < val_.size(); i++) {
      output.writeInt32(1, val_.getInt(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < val_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(val_.getInt(i));
      }
      size += dataSize;
      size += 1 * getValList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty other = (build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty) obj;

    if (!getValList()
        .equals(other.getValList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getValCount() > 0) {
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + getValList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty)
      build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmptyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.IgnoreProtoEditionsProto.internal_static_buf_validate_conformance_cases_EditionsRepeatedExpandedIgnoreEmpty_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.IgnoreProtoEditionsProto.internal_static_buf_validate_conformance_cases_EditionsRepeatedExpandedIgnoreEmpty_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty.class, build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      val_ = emptyIntList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.IgnoreProtoEditionsProto.internal_static_buf_validate_conformance_cases_EditionsRepeatedExpandedIgnoreEmpty_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty build() {
      build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty buildPartial() {
      build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty result = new build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        val_.makeImmutable();
        result.val_ = val_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty) {
        return mergeFrom((build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty other) {
      if (other == build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty.getDefaultInstance()) return this;
      if (!other.val_.isEmpty()) {
        if (val_.isEmpty()) {
          val_ = other.val_;
          val_.makeImmutable();
          bitField0_ |= 0x00000001;
        } else {
          ensureValIsMutable();
          val_.addAll(other.val_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int v = input.readInt32();
              ensureValIsMutable();
              val_.addInt(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureValIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                val_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList val_ = emptyIntList();
    private void ensureValIsMutable() {
      if (!val_.isModifiable()) {
        val_ = makeMutableCopy(val_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated int32 val = 1 [json_name = "val", features = { ... }</code>
     * @return A list containing the val.
     */
    public java.util.List<java.lang.Integer>
        getValList() {
      val_.makeImmutable();
      return val_;
    }
    /**
     * <code>repeated int32 val = 1 [json_name = "val", features = { ... }</code>
     * @return The count of val.
     */
    public int getValCount() {
      return val_.size();
    }
    /**
     * <code>repeated int32 val = 1 [json_name = "val", features = { ... }</code>
     * @param index The index of the element to return.
     * @return The val at the given index.
     */
    public int getVal(int index) {
      return val_.getInt(index);
    }
    /**
     * <code>repeated int32 val = 1 [json_name = "val", features = { ... }</code>
     * @param index The index to set the value at.
     * @param value The val to set.
     * @return This builder for chaining.
     */
    public Builder setVal(
        int index, int value) {

      ensureValIsMutable();
      val_.setInt(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 val = 1 [json_name = "val", features = { ... }</code>
     * @param value The val to add.
     * @return This builder for chaining.
     */
    public Builder addVal(int value) {

      ensureValIsMutable();
      val_.addInt(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 val = 1 [json_name = "val", features = { ... }</code>
     * @param values The val to add.
     * @return This builder for chaining.
     */
    public Builder addAllVal(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureValIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, val_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 val = 1 [json_name = "val", features = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearVal() {
      val_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty)
  private static final build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty();
  }

  public static build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EditionsRepeatedExpandedIgnoreEmpty>
      PARSER = new com.google.protobuf.AbstractParser<EditionsRepeatedExpandedIgnoreEmpty>() {
    @java.lang.Override
    public EditionsRepeatedExpandedIgnoreEmpty parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<EditionsRepeatedExpandedIgnoreEmpty> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EditionsRepeatedExpandedIgnoreEmpty> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.EditionsRepeatedExpandedIgnoreEmpty getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

