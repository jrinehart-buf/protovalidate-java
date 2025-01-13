// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/predefined_rules_proto2.proto
// Protobuf Java Version: 4.29.3

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.PredefinedEnumRuleProto2}
 */
public final class PredefinedEnumRuleProto2 extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.PredefinedEnumRuleProto2)
    PredefinedEnumRuleProto2OrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      PredefinedEnumRuleProto2.class.getName());
  }
  // Use PredefinedEnumRuleProto2.newBuilder() to construct.
  private PredefinedEnumRuleProto2(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PredefinedEnumRuleProto2() {
    val_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.PredefinedRulesProto2Proto.internal_static_buf_validate_conformance_cases_PredefinedEnumRuleProto2_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.PredefinedRulesProto2Proto.internal_static_buf_validate_conformance_cases_PredefinedEnumRuleProto2_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.class, build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.Builder.class);
  }

  /**
   * Protobuf enum {@code buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2}
   */
  public enum EnumProto2
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ENUM_PROTO2_ZERO_UNSPECIFIED = 0;</code>
     */
    ENUM_PROTO2_ZERO_UNSPECIFIED(0),
    /**
     * <code>ENUM_PROTO2_ONE = 1;</code>
     */
    ENUM_PROTO2_ONE(1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 3,
        /* suffix= */ "",
        EnumProto2.class.getName());
    }
    /**
     * <code>ENUM_PROTO2_ZERO_UNSPECIFIED = 0;</code>
     */
    public static final int ENUM_PROTO2_ZERO_UNSPECIFIED_VALUE = 0;
    /**
     * <code>ENUM_PROTO2_ONE = 1;</code>
     */
    public static final int ENUM_PROTO2_ONE_VALUE = 1;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EnumProto2 valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EnumProto2 forNumber(int value) {
      switch (value) {
        case 0: return ENUM_PROTO2_ZERO_UNSPECIFIED;
        case 1: return ENUM_PROTO2_ONE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EnumProto2>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EnumProto2> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EnumProto2>() {
            public EnumProto2 findValueByNumber(int number) {
              return EnumProto2.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.getDescriptor().getEnumTypes().get(0);
    }

    private static final EnumProto2[] VALUES = values();

    public static EnumProto2 valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EnumProto2(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2)
  }

  private int bitField0_;
  public static final int VAL_FIELD_NUMBER = 1;
  private int val_ = 0;
  /**
   * <code>optional .buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2 val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return Whether the val field is set.
   */
  @java.lang.Override public boolean hasVal() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2 val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return The val.
   */
  @java.lang.Override public build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2 getVal() {
    build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2 result = build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2.forNumber(val_);
    return result == null ? build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2.ENUM_PROTO2_ZERO_UNSPECIFIED : result;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeEnum(1, val_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, val_);
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
    if (!(obj instanceof build.buf.validate.conformance.cases.PredefinedEnumRuleProto2)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 other = (build.buf.validate.conformance.cases.PredefinedEnumRuleProto2) obj;

    if (hasVal() != other.hasVal()) return false;
    if (hasVal()) {
      if (val_ != other.val_) return false;
    }
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
    if (hasVal()) {
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + val_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.PredefinedEnumRuleProto2}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.PredefinedEnumRuleProto2)
      build.buf.validate.conformance.cases.PredefinedEnumRuleProto2OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.PredefinedRulesProto2Proto.internal_static_buf_validate_conformance_cases_PredefinedEnumRuleProto2_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.PredefinedRulesProto2Proto.internal_static_buf_validate_conformance_cases_PredefinedEnumRuleProto2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.class, build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.newBuilder()
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
      val_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.PredefinedRulesProto2Proto.internal_static_buf_validate_conformance_cases_PredefinedEnumRuleProto2_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 build() {
      build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 buildPartial() {
      build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 result = new build.buf.validate.conformance.cases.PredefinedEnumRuleProto2(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.val_ = val_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.PredefinedEnumRuleProto2) {
        return mergeFrom((build.buf.validate.conformance.cases.PredefinedEnumRuleProto2)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 other) {
      if (other == build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.getDefaultInstance()) return this;
      if (other.hasVal()) {
        setVal(other.getVal());
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
              int tmpRaw = input.readEnum();
              build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2 tmpValue =
                  build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                val_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
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

    private int val_ = 0;
    /**
     * <code>optional .buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2 val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return Whether the val field is set.
     */
    @java.lang.Override public boolean hasVal() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2 val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return The val.
     */
    @java.lang.Override
    public build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2 getVal() {
      build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2 result = build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2.forNumber(val_);
      return result == null ? build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2.ENUM_PROTO2_ZERO_UNSPECIFIED : result;
    }
    /**
     * <code>optional .buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2 val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param value The val to set.
     * @return This builder for chaining.
     */
    public Builder setVal(build.buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2 value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      val_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .buf.validate.conformance.cases.PredefinedEnumRuleProto2.EnumProto2 val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearVal() {
      bitField0_ = (bitField0_ & ~0x00000001);
      val_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.PredefinedEnumRuleProto2)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.PredefinedEnumRuleProto2)
  private static final build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.PredefinedEnumRuleProto2();
  }

  public static build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PredefinedEnumRuleProto2>
      PARSER = new com.google.protobuf.AbstractParser<PredefinedEnumRuleProto2>() {
    @java.lang.Override
    public PredefinedEnumRuleProto2 parsePartialFrom(
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

  public static com.google.protobuf.Parser<PredefinedEnumRuleProto2> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PredefinedEnumRuleProto2> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.PredefinedEnumRuleProto2 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

