// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/strings.proto
// Protobuf Java Version: 4.28.3

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.StringInOneof}
 */
public final class StringInOneof extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.StringInOneof)
    StringInOneofOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      StringInOneof.class.getName());
  }
  // Use StringInOneof.newBuilder() to construct.
  private StringInOneof(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private StringInOneof() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.StringsProto.internal_static_buf_validate_conformance_cases_StringInOneof_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.StringsProto.internal_static_buf_validate_conformance_cases_StringInOneof_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.StringInOneof.class, build.buf.validate.conformance.cases.StringInOneof.Builder.class);
  }

  private int fooCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object foo_;
  public enum FooCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    BAR(1),
    FOO_NOT_SET(0);
    private final int value;
    private FooCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FooCase valueOf(int value) {
      return forNumber(value);
    }

    public static FooCase forNumber(int value) {
      switch (value) {
        case 1: return BAR;
        case 0: return FOO_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public FooCase
  getFooCase() {
    return FooCase.forNumber(
        fooCase_);
  }

  public static final int BAR_FIELD_NUMBER = 1;
  /**
   * <code>string bar = 1 [json_name = "bar", (.buf.validate.field) = { ... }</code>
   * @return Whether the bar field is set.
   */
  public boolean hasBar() {
    return fooCase_ == 1;
  }
  /**
   * <code>string bar = 1 [json_name = "bar", (.buf.validate.field) = { ... }</code>
   * @return The bar.
   */
  public java.lang.String getBar() {
    java.lang.Object ref = "";
    if (fooCase_ == 1) {
      ref = foo_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (fooCase_ == 1) {
        foo_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string bar = 1 [json_name = "bar", (.buf.validate.field) = { ... }</code>
   * @return The bytes for bar.
   */
  public com.google.protobuf.ByteString
      getBarBytes() {
    java.lang.Object ref = "";
    if (fooCase_ == 1) {
      ref = foo_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (fooCase_ == 1) {
        foo_ = b;
      }
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
    if (fooCase_ == 1) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, foo_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fooCase_ == 1) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, foo_);
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
    if (!(obj instanceof build.buf.validate.conformance.cases.StringInOneof)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.StringInOneof other = (build.buf.validate.conformance.cases.StringInOneof) obj;

    if (!getFooCase().equals(other.getFooCase())) return false;
    switch (fooCase_) {
      case 1:
        if (!getBar()
            .equals(other.getBar())) return false;
        break;
      case 0:
      default:
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
    switch (fooCase_) {
      case 1:
        hash = (37 * hash) + BAR_FIELD_NUMBER;
        hash = (53 * hash) + getBar().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.StringInOneof parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.StringInOneof parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.StringInOneof parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.StringInOneof parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.StringInOneof parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.StringInOneof parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.StringInOneof parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.StringInOneof parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.StringInOneof parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.StringInOneof parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.StringInOneof parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.StringInOneof parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.StringInOneof prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.StringInOneof}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.StringInOneof)
      build.buf.validate.conformance.cases.StringInOneofOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.StringsProto.internal_static_buf_validate_conformance_cases_StringInOneof_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.StringsProto.internal_static_buf_validate_conformance_cases_StringInOneof_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.StringInOneof.class, build.buf.validate.conformance.cases.StringInOneof.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.StringInOneof.newBuilder()
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
      fooCase_ = 0;
      foo_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.StringsProto.internal_static_buf_validate_conformance_cases_StringInOneof_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.StringInOneof getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.StringInOneof.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.StringInOneof build() {
      build.buf.validate.conformance.cases.StringInOneof result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.StringInOneof buildPartial() {
      build.buf.validate.conformance.cases.StringInOneof result = new build.buf.validate.conformance.cases.StringInOneof(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.StringInOneof result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(build.buf.validate.conformance.cases.StringInOneof result) {
      result.fooCase_ = fooCase_;
      result.foo_ = this.foo_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.StringInOneof) {
        return mergeFrom((build.buf.validate.conformance.cases.StringInOneof)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.StringInOneof other) {
      if (other == build.buf.validate.conformance.cases.StringInOneof.getDefaultInstance()) return this;
      switch (other.getFooCase()) {
        case BAR: {
          fooCase_ = 1;
          foo_ = other.foo_;
          onChanged();
          break;
        }
        case FOO_NOT_SET: {
          break;
        }
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              fooCase_ = 1;
              foo_ = s;
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
    private int fooCase_ = 0;
    private java.lang.Object foo_;
    public FooCase
        getFooCase() {
      return FooCase.forNumber(
          fooCase_);
    }

    public Builder clearFoo() {
      fooCase_ = 0;
      foo_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>string bar = 1 [json_name = "bar", (.buf.validate.field) = { ... }</code>
     * @return Whether the bar field is set.
     */
    @java.lang.Override
    public boolean hasBar() {
      return fooCase_ == 1;
    }
    /**
     * <code>string bar = 1 [json_name = "bar", (.buf.validate.field) = { ... }</code>
     * @return The bar.
     */
    @java.lang.Override
    public java.lang.String getBar() {
      java.lang.Object ref = "";
      if (fooCase_ == 1) {
        ref = foo_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (fooCase_ == 1) {
          foo_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bar = 1 [json_name = "bar", (.buf.validate.field) = { ... }</code>
     * @return The bytes for bar.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBarBytes() {
      java.lang.Object ref = "";
      if (fooCase_ == 1) {
        ref = foo_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (fooCase_ == 1) {
          foo_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bar = 1 [json_name = "bar", (.buf.validate.field) = { ... }</code>
     * @param value The bar to set.
     * @return This builder for chaining.
     */
    public Builder setBar(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fooCase_ = 1;
      foo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string bar = 1 [json_name = "bar", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearBar() {
      if (fooCase_ == 1) {
        fooCase_ = 0;
        foo_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string bar = 1 [json_name = "bar", (.buf.validate.field) = { ... }</code>
     * @param value The bytes for bar to set.
     * @return This builder for chaining.
     */
    public Builder setBarBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fooCase_ = 1;
      foo_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.StringInOneof)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.StringInOneof)
  private static final build.buf.validate.conformance.cases.StringInOneof DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.StringInOneof();
  }

  public static build.buf.validate.conformance.cases.StringInOneof getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StringInOneof>
      PARSER = new com.google.protobuf.AbstractParser<StringInOneof>() {
    @java.lang.Override
    public StringInOneof parsePartialFrom(
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

  public static com.google.protobuf.Parser<StringInOneof> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StringInOneof> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.StringInOneof getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

