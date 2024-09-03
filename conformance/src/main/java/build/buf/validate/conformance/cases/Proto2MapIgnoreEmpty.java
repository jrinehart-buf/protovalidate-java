// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/ignore_proto2.proto
// Protobuf Java Version: 4.28.0

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.Proto2MapIgnoreEmpty}
 */
public final class Proto2MapIgnoreEmpty extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.Proto2MapIgnoreEmpty)
    Proto2MapIgnoreEmptyOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 0,
      /* suffix= */ "",
      Proto2MapIgnoreEmpty.class.getName());
  }
  // Use Proto2MapIgnoreEmpty.newBuilder() to construct.
  private Proto2MapIgnoreEmpty(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Proto2MapIgnoreEmpty() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.IgnoreProto2Proto.internal_static_buf_validate_conformance_cases_Proto2MapIgnoreEmpty_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetVal();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.IgnoreProto2Proto.internal_static_buf_validate_conformance_cases_Proto2MapIgnoreEmpty_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty.class, build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty.Builder.class);
  }

  public static final int VAL_FIELD_NUMBER = 1;
  private static final class ValDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, java.lang.Integer> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                build.buf.validate.conformance.cases.IgnoreProto2Proto.internal_static_buf_validate_conformance_cases_Proto2MapIgnoreEmpty_ValEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.INT32,
                0);
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Integer, java.lang.Integer> val_;
  private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
  internalGetVal() {
    if (val_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ValDefaultEntryHolder.defaultEntry);
    }
    return val_;
  }
  public int getValCount() {
    return internalGetVal().getMap().size();
  }
  /**
   * <code>map&lt;int32, int32&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public boolean containsVal(
      int key) {

    return internalGetVal().getMap().containsKey(key);
  }
  /**
   * Use {@link #getValMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, java.lang.Integer> getVal() {
    return getValMap();
  }
  /**
   * <code>map&lt;int32, int32&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Integer, java.lang.Integer> getValMap() {
    return internalGetVal().getMap();
  }
  /**
   * <code>map&lt;int32, int32&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public int getValOrDefault(
      int key,
      int defaultValue) {

    java.util.Map<java.lang.Integer, java.lang.Integer> map =
        internalGetVal().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;int32, int32&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public int getValOrThrow(
      int key) {

    java.util.Map<java.lang.Integer, java.lang.Integer> map =
        internalGetVal().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessage
      .serializeIntegerMapTo(
        output,
        internalGetVal(),
        ValDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
         : internalGetVal().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
      val__ = ValDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, val__);
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
    if (!(obj instanceof build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty other = (build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty) obj;

    if (!internalGetVal().equals(
        other.internalGetVal())) return false;
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
    if (!internalGetVal().getMap().isEmpty()) {
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + internalGetVal().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.Proto2MapIgnoreEmpty}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.Proto2MapIgnoreEmpty)
      build.buf.validate.conformance.cases.Proto2MapIgnoreEmptyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.IgnoreProto2Proto.internal_static_buf_validate_conformance_cases_Proto2MapIgnoreEmpty_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetVal();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableVal();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.IgnoreProto2Proto.internal_static_buf_validate_conformance_cases_Proto2MapIgnoreEmpty_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty.class, build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty.newBuilder()
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
      internalGetMutableVal().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.IgnoreProto2Proto.internal_static_buf_validate_conformance_cases_Proto2MapIgnoreEmpty_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty build() {
      build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty buildPartial() {
      build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty result = new build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.val_ = internalGetVal();
        result.val_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty) {
        return mergeFrom((build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty other) {
      if (other == build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty.getDefaultInstance()) return this;
      internalGetMutableVal().mergeFrom(
          other.internalGetVal());
      bitField0_ |= 0x00000001;
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
            case 10: {
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              val__ = input.readMessage(
                  ValDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableVal().getMutableMap().put(
                  val__.getKey(), val__.getValue());
              bitField0_ |= 0x00000001;
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

    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> val_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
        internalGetVal() {
      if (val_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ValDefaultEntryHolder.defaultEntry);
      }
      return val_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
        internalGetMutableVal() {
      if (val_ == null) {
        val_ = com.google.protobuf.MapField.newMapField(
            ValDefaultEntryHolder.defaultEntry);
      }
      if (!val_.isMutable()) {
        val_ = val_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return val_;
    }
    public int getValCount() {
      return internalGetVal().getMap().size();
    }
    /**
     * <code>map&lt;int32, int32&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    @java.lang.Override
    public boolean containsVal(
        int key) {

      return internalGetVal().getMap().containsKey(key);
    }
    /**
     * Use {@link #getValMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getVal() {
      return getValMap();
    }
    /**
     * <code>map&lt;int32, int32&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Integer> getValMap() {
      return internalGetVal().getMap();
    }
    /**
     * <code>map&lt;int32, int32&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    @java.lang.Override
    public int getValOrDefault(
        int key,
        int defaultValue) {

      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetVal().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int32, int32&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    @java.lang.Override
    public int getValOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetVal().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearVal() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableVal().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;int32, int32&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder removeVal(
        int key) {

      internalGetMutableVal().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer>
        getMutableVal() {
      bitField0_ |= 0x00000001;
      return internalGetMutableVal().getMutableMap();
    }
    /**
     * <code>map&lt;int32, int32&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder putVal(
        int key,
        int value) {


      internalGetMutableVal().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;int32, int32&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder putAllVal(
        java.util.Map<java.lang.Integer, java.lang.Integer> values) {
      internalGetMutableVal().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.Proto2MapIgnoreEmpty)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.Proto2MapIgnoreEmpty)
  private static final build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty();
  }

  public static build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Proto2MapIgnoreEmpty>
      PARSER = new com.google.protobuf.AbstractParser<Proto2MapIgnoreEmpty>() {
    @java.lang.Override
    public Proto2MapIgnoreEmpty parsePartialFrom(
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

  public static com.google.protobuf.Parser<Proto2MapIgnoreEmpty> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Proto2MapIgnoreEmpty> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.Proto2MapIgnoreEmpty getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

