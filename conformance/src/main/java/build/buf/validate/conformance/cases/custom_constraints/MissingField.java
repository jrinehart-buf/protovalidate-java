// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/custom_constraints/custom_constraints.proto
// Protobuf Java Version: 4.29.3

package build.buf.validate.conformance.cases.custom_constraints;

/**
 * Protobuf type {@code buf.validate.conformance.cases.custom_constraints.MissingField}
 */
public final class MissingField extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.custom_constraints.MissingField)
    MissingFieldOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      MissingField.class.getName());
  }
  // Use MissingField.newBuilder() to construct.
  private MissingField(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private MissingField() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.custom_constraints.CustomConstraintsProto.internal_static_buf_validate_conformance_cases_custom_constraints_MissingField_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.custom_constraints.CustomConstraintsProto.internal_static_buf_validate_conformance_cases_custom_constraints_MissingField_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.custom_constraints.MissingField.class, build.buf.validate.conformance.cases.custom_constraints.MissingField.Builder.class);
  }

  public static final int A_FIELD_NUMBER = 1;
  private int a_ = 0;
  /**
   * <code>int32 a = 1 [json_name = "a"];</code>
   * @return The a.
   */
  @java.lang.Override
  public int getA() {
    return a_;
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
    if (a_ != 0) {
      output.writeInt32(1, a_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (a_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, a_);
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
    if (!(obj instanceof build.buf.validate.conformance.cases.custom_constraints.MissingField)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.custom_constraints.MissingField other = (build.buf.validate.conformance.cases.custom_constraints.MissingField) obj;

    if (getA()
        != other.getA()) return false;
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
    hash = (37 * hash) + A_FIELD_NUMBER;
    hash = (53 * hash) + getA();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.custom_constraints.MissingField parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.custom_constraints.MissingField parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.custom_constraints.MissingField parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.custom_constraints.MissingField parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.custom_constraints.MissingField parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.custom_constraints.MissingField parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.custom_constraints.MissingField parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.custom_constraints.MissingField parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.custom_constraints.MissingField parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.custom_constraints.MissingField parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.custom_constraints.MissingField parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.custom_constraints.MissingField parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.custom_constraints.MissingField prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.custom_constraints.MissingField}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.custom_constraints.MissingField)
      build.buf.validate.conformance.cases.custom_constraints.MissingFieldOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.custom_constraints.CustomConstraintsProto.internal_static_buf_validate_conformance_cases_custom_constraints_MissingField_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.custom_constraints.CustomConstraintsProto.internal_static_buf_validate_conformance_cases_custom_constraints_MissingField_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.custom_constraints.MissingField.class, build.buf.validate.conformance.cases.custom_constraints.MissingField.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.custom_constraints.MissingField.newBuilder()
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
      a_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.custom_constraints.CustomConstraintsProto.internal_static_buf_validate_conformance_cases_custom_constraints_MissingField_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.custom_constraints.MissingField getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.custom_constraints.MissingField.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.custom_constraints.MissingField build() {
      build.buf.validate.conformance.cases.custom_constraints.MissingField result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.custom_constraints.MissingField buildPartial() {
      build.buf.validate.conformance.cases.custom_constraints.MissingField result = new build.buf.validate.conformance.cases.custom_constraints.MissingField(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.custom_constraints.MissingField result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.a_ = a_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.custom_constraints.MissingField) {
        return mergeFrom((build.buf.validate.conformance.cases.custom_constraints.MissingField)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.custom_constraints.MissingField other) {
      if (other == build.buf.validate.conformance.cases.custom_constraints.MissingField.getDefaultInstance()) return this;
      if (other.getA() != 0) {
        setA(other.getA());
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
              a_ = input.readInt32();
              bitField0_ |= 0x00000001;
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

    private int a_ ;
    /**
     * <code>int32 a = 1 [json_name = "a"];</code>
     * @return The a.
     */
    @java.lang.Override
    public int getA() {
      return a_;
    }
    /**
     * <code>int32 a = 1 [json_name = "a"];</code>
     * @param value The a to set.
     * @return This builder for chaining.
     */
    public Builder setA(int value) {

      a_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 a = 1 [json_name = "a"];</code>
     * @return This builder for chaining.
     */
    public Builder clearA() {
      bitField0_ = (bitField0_ & ~0x00000001);
      a_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.custom_constraints.MissingField)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.custom_constraints.MissingField)
  private static final build.buf.validate.conformance.cases.custom_constraints.MissingField DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.custom_constraints.MissingField();
  }

  public static build.buf.validate.conformance.cases.custom_constraints.MissingField getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MissingField>
      PARSER = new com.google.protobuf.AbstractParser<MissingField>() {
    @java.lang.Override
    public MissingField parsePartialFrom(
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

  public static com.google.protobuf.Parser<MissingField> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MissingField> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.custom_constraints.MissingField getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

