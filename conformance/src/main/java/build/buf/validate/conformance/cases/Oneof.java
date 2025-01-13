// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/oneofs.proto
// Protobuf Java Version: 4.29.3

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.Oneof}
 */
public final class Oneof extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.Oneof)
    OneofOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      Oneof.class.getName());
  }
  // Use Oneof.newBuilder() to construct.
  private Oneof(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Oneof() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.OneofsProto.internal_static_buf_validate_conformance_cases_Oneof_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.OneofsProto.internal_static_buf_validate_conformance_cases_Oneof_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.Oneof.class, build.buf.validate.conformance.cases.Oneof.Builder.class);
  }

  private int oCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object o_;
  public enum OCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    X(1),
    Y(2),
    Z(3),
    O_NOT_SET(0);
    private final int value;
    private OCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OCase valueOf(int value) {
      return forNumber(value);
    }

    public static OCase forNumber(int value) {
      switch (value) {
        case 1: return X;
        case 2: return Y;
        case 3: return Z;
        case 0: return O_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OCase
  getOCase() {
    return OCase.forNumber(
        oCase_);
  }

  public static final int X_FIELD_NUMBER = 1;
  /**
   * <code>string x = 1 [json_name = "x", (.buf.validate.field) = { ... }</code>
   * @return Whether the x field is set.
   */
  public boolean hasX() {
    return oCase_ == 1;
  }
  /**
   * <code>string x = 1 [json_name = "x", (.buf.validate.field) = { ... }</code>
   * @return The x.
   */
  public java.lang.String getX() {
    java.lang.Object ref = "";
    if (oCase_ == 1) {
      ref = o_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (oCase_ == 1) {
        o_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string x = 1 [json_name = "x", (.buf.validate.field) = { ... }</code>
   * @return The bytes for x.
   */
  public com.google.protobuf.ByteString
      getXBytes() {
    java.lang.Object ref = "";
    if (oCase_ == 1) {
      ref = o_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (oCase_ == 1) {
        o_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int Y_FIELD_NUMBER = 2;
  /**
   * <code>int32 y = 2 [json_name = "y", (.buf.validate.field) = { ... }</code>
   * @return Whether the y field is set.
   */
  @java.lang.Override
  public boolean hasY() {
    return oCase_ == 2;
  }
  /**
   * <code>int32 y = 2 [json_name = "y", (.buf.validate.field) = { ... }</code>
   * @return The y.
   */
  @java.lang.Override
  public int getY() {
    if (oCase_ == 2) {
      return (java.lang.Integer) o_;
    }
    return 0;
  }

  public static final int Z_FIELD_NUMBER = 3;
  /**
   * <code>.buf.validate.conformance.cases.TestOneofMsg z = 3 [json_name = "z"];</code>
   * @return Whether the z field is set.
   */
  @java.lang.Override
  public boolean hasZ() {
    return oCase_ == 3;
  }
  /**
   * <code>.buf.validate.conformance.cases.TestOneofMsg z = 3 [json_name = "z"];</code>
   * @return The z.
   */
  @java.lang.Override
  public build.buf.validate.conformance.cases.TestOneofMsg getZ() {
    if (oCase_ == 3) {
       return (build.buf.validate.conformance.cases.TestOneofMsg) o_;
    }
    return build.buf.validate.conformance.cases.TestOneofMsg.getDefaultInstance();
  }
  /**
   * <code>.buf.validate.conformance.cases.TestOneofMsg z = 3 [json_name = "z"];</code>
   */
  @java.lang.Override
  public build.buf.validate.conformance.cases.TestOneofMsgOrBuilder getZOrBuilder() {
    if (oCase_ == 3) {
       return (build.buf.validate.conformance.cases.TestOneofMsg) o_;
    }
    return build.buf.validate.conformance.cases.TestOneofMsg.getDefaultInstance();
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
    if (oCase_ == 1) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, o_);
    }
    if (oCase_ == 2) {
      output.writeInt32(
          2, (int)((java.lang.Integer) o_));
    }
    if (oCase_ == 3) {
      output.writeMessage(3, (build.buf.validate.conformance.cases.TestOneofMsg) o_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oCase_ == 1) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, o_);
    }
    if (oCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            2, (int)((java.lang.Integer) o_));
    }
    if (oCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (build.buf.validate.conformance.cases.TestOneofMsg) o_);
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
    if (!(obj instanceof build.buf.validate.conformance.cases.Oneof)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.Oneof other = (build.buf.validate.conformance.cases.Oneof) obj;

    if (!getOCase().equals(other.getOCase())) return false;
    switch (oCase_) {
      case 1:
        if (!getX()
            .equals(other.getX())) return false;
        break;
      case 2:
        if (getY()
            != other.getY()) return false;
        break;
      case 3:
        if (!getZ()
            .equals(other.getZ())) return false;
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
    switch (oCase_) {
      case 1:
        hash = (37 * hash) + X_FIELD_NUMBER;
        hash = (53 * hash) + getX().hashCode();
        break;
      case 2:
        hash = (37 * hash) + Y_FIELD_NUMBER;
        hash = (53 * hash) + getY();
        break;
      case 3:
        hash = (37 * hash) + Z_FIELD_NUMBER;
        hash = (53 * hash) + getZ().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.Oneof parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.Oneof parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.Oneof parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.Oneof parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.Oneof parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.Oneof parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.Oneof parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.Oneof parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.Oneof parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.Oneof parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.Oneof parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.Oneof parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.Oneof prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.Oneof}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.Oneof)
      build.buf.validate.conformance.cases.OneofOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.OneofsProto.internal_static_buf_validate_conformance_cases_Oneof_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.OneofsProto.internal_static_buf_validate_conformance_cases_Oneof_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.Oneof.class, build.buf.validate.conformance.cases.Oneof.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.Oneof.newBuilder()
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
      if (zBuilder_ != null) {
        zBuilder_.clear();
      }
      oCase_ = 0;
      o_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.OneofsProto.internal_static_buf_validate_conformance_cases_Oneof_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.Oneof getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.Oneof.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.Oneof build() {
      build.buf.validate.conformance.cases.Oneof result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.Oneof buildPartial() {
      build.buf.validate.conformance.cases.Oneof result = new build.buf.validate.conformance.cases.Oneof(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.Oneof result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(build.buf.validate.conformance.cases.Oneof result) {
      result.oCase_ = oCase_;
      result.o_ = this.o_;
      if (oCase_ == 3 &&
          zBuilder_ != null) {
        result.o_ = zBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.Oneof) {
        return mergeFrom((build.buf.validate.conformance.cases.Oneof)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.Oneof other) {
      if (other == build.buf.validate.conformance.cases.Oneof.getDefaultInstance()) return this;
      switch (other.getOCase()) {
        case X: {
          oCase_ = 1;
          o_ = other.o_;
          onChanged();
          break;
        }
        case Y: {
          setY(other.getY());
          break;
        }
        case Z: {
          mergeZ(other.getZ());
          break;
        }
        case O_NOT_SET: {
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
              oCase_ = 1;
              o_ = s;
              break;
            } // case 10
            case 16: {
              o_ = input.readInt32();
              oCase_ = 2;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getZFieldBuilder().getBuilder(),
                  extensionRegistry);
              oCase_ = 3;
              break;
            } // case 26
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
    private int oCase_ = 0;
    private java.lang.Object o_;
    public OCase
        getOCase() {
      return OCase.forNumber(
          oCase_);
    }

    public Builder clearO() {
      oCase_ = 0;
      o_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>string x = 1 [json_name = "x", (.buf.validate.field) = { ... }</code>
     * @return Whether the x field is set.
     */
    @java.lang.Override
    public boolean hasX() {
      return oCase_ == 1;
    }
    /**
     * <code>string x = 1 [json_name = "x", (.buf.validate.field) = { ... }</code>
     * @return The x.
     */
    @java.lang.Override
    public java.lang.String getX() {
      java.lang.Object ref = "";
      if (oCase_ == 1) {
        ref = o_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (oCase_ == 1) {
          o_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string x = 1 [json_name = "x", (.buf.validate.field) = { ... }</code>
     * @return The bytes for x.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getXBytes() {
      java.lang.Object ref = "";
      if (oCase_ == 1) {
        ref = o_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (oCase_ == 1) {
          o_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string x = 1 [json_name = "x", (.buf.validate.field) = { ... }</code>
     * @param value The x to set.
     * @return This builder for chaining.
     */
    public Builder setX(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      oCase_ = 1;
      o_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string x = 1 [json_name = "x", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearX() {
      if (oCase_ == 1) {
        oCase_ = 0;
        o_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string x = 1 [json_name = "x", (.buf.validate.field) = { ... }</code>
     * @param value The bytes for x to set.
     * @return This builder for chaining.
     */
    public Builder setXBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      oCase_ = 1;
      o_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>int32 y = 2 [json_name = "y", (.buf.validate.field) = { ... }</code>
     * @return Whether the y field is set.
     */
    public boolean hasY() {
      return oCase_ == 2;
    }
    /**
     * <code>int32 y = 2 [json_name = "y", (.buf.validate.field) = { ... }</code>
     * @return The y.
     */
    public int getY() {
      if (oCase_ == 2) {
        return (java.lang.Integer) o_;
      }
      return 0;
    }
    /**
     * <code>int32 y = 2 [json_name = "y", (.buf.validate.field) = { ... }</code>
     * @param value The y to set.
     * @return This builder for chaining.
     */
    public Builder setY(int value) {

      oCase_ = 2;
      o_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 y = 2 [json_name = "y", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearY() {
      if (oCase_ == 2) {
        oCase_ = 0;
        o_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilder<
        build.buf.validate.conformance.cases.TestOneofMsg, build.buf.validate.conformance.cases.TestOneofMsg.Builder, build.buf.validate.conformance.cases.TestOneofMsgOrBuilder> zBuilder_;
    /**
     * <code>.buf.validate.conformance.cases.TestOneofMsg z = 3 [json_name = "z"];</code>
     * @return Whether the z field is set.
     */
    @java.lang.Override
    public boolean hasZ() {
      return oCase_ == 3;
    }
    /**
     * <code>.buf.validate.conformance.cases.TestOneofMsg z = 3 [json_name = "z"];</code>
     * @return The z.
     */
    @java.lang.Override
    public build.buf.validate.conformance.cases.TestOneofMsg getZ() {
      if (zBuilder_ == null) {
        if (oCase_ == 3) {
          return (build.buf.validate.conformance.cases.TestOneofMsg) o_;
        }
        return build.buf.validate.conformance.cases.TestOneofMsg.getDefaultInstance();
      } else {
        if (oCase_ == 3) {
          return zBuilder_.getMessage();
        }
        return build.buf.validate.conformance.cases.TestOneofMsg.getDefaultInstance();
      }
    }
    /**
     * <code>.buf.validate.conformance.cases.TestOneofMsg z = 3 [json_name = "z"];</code>
     */
    public Builder setZ(build.buf.validate.conformance.cases.TestOneofMsg value) {
      if (zBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        o_ = value;
        onChanged();
      } else {
        zBuilder_.setMessage(value);
      }
      oCase_ = 3;
      return this;
    }
    /**
     * <code>.buf.validate.conformance.cases.TestOneofMsg z = 3 [json_name = "z"];</code>
     */
    public Builder setZ(
        build.buf.validate.conformance.cases.TestOneofMsg.Builder builderForValue) {
      if (zBuilder_ == null) {
        o_ = builderForValue.build();
        onChanged();
      } else {
        zBuilder_.setMessage(builderForValue.build());
      }
      oCase_ = 3;
      return this;
    }
    /**
     * <code>.buf.validate.conformance.cases.TestOneofMsg z = 3 [json_name = "z"];</code>
     */
    public Builder mergeZ(build.buf.validate.conformance.cases.TestOneofMsg value) {
      if (zBuilder_ == null) {
        if (oCase_ == 3 &&
            o_ != build.buf.validate.conformance.cases.TestOneofMsg.getDefaultInstance()) {
          o_ = build.buf.validate.conformance.cases.TestOneofMsg.newBuilder((build.buf.validate.conformance.cases.TestOneofMsg) o_)
              .mergeFrom(value).buildPartial();
        } else {
          o_ = value;
        }
        onChanged();
      } else {
        if (oCase_ == 3) {
          zBuilder_.mergeFrom(value);
        } else {
          zBuilder_.setMessage(value);
        }
      }
      oCase_ = 3;
      return this;
    }
    /**
     * <code>.buf.validate.conformance.cases.TestOneofMsg z = 3 [json_name = "z"];</code>
     */
    public Builder clearZ() {
      if (zBuilder_ == null) {
        if (oCase_ == 3) {
          oCase_ = 0;
          o_ = null;
          onChanged();
        }
      } else {
        if (oCase_ == 3) {
          oCase_ = 0;
          o_ = null;
        }
        zBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.buf.validate.conformance.cases.TestOneofMsg z = 3 [json_name = "z"];</code>
     */
    public build.buf.validate.conformance.cases.TestOneofMsg.Builder getZBuilder() {
      return getZFieldBuilder().getBuilder();
    }
    /**
     * <code>.buf.validate.conformance.cases.TestOneofMsg z = 3 [json_name = "z"];</code>
     */
    @java.lang.Override
    public build.buf.validate.conformance.cases.TestOneofMsgOrBuilder getZOrBuilder() {
      if ((oCase_ == 3) && (zBuilder_ != null)) {
        return zBuilder_.getMessageOrBuilder();
      } else {
        if (oCase_ == 3) {
          return (build.buf.validate.conformance.cases.TestOneofMsg) o_;
        }
        return build.buf.validate.conformance.cases.TestOneofMsg.getDefaultInstance();
      }
    }
    /**
     * <code>.buf.validate.conformance.cases.TestOneofMsg z = 3 [json_name = "z"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        build.buf.validate.conformance.cases.TestOneofMsg, build.buf.validate.conformance.cases.TestOneofMsg.Builder, build.buf.validate.conformance.cases.TestOneofMsgOrBuilder> 
        getZFieldBuilder() {
      if (zBuilder_ == null) {
        if (!(oCase_ == 3)) {
          o_ = build.buf.validate.conformance.cases.TestOneofMsg.getDefaultInstance();
        }
        zBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            build.buf.validate.conformance.cases.TestOneofMsg, build.buf.validate.conformance.cases.TestOneofMsg.Builder, build.buf.validate.conformance.cases.TestOneofMsgOrBuilder>(
                (build.buf.validate.conformance.cases.TestOneofMsg) o_,
                getParentForChildren(),
                isClean());
        o_ = null;
      }
      oCase_ = 3;
      onChanged();
      return zBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.Oneof)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.Oneof)
  private static final build.buf.validate.conformance.cases.Oneof DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.Oneof();
  }

  public static build.buf.validate.conformance.cases.Oneof getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Oneof>
      PARSER = new com.google.protobuf.AbstractParser<Oneof>() {
    @java.lang.Override
    public Oneof parsePartialFrom(
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

  public static com.google.protobuf.Parser<Oneof> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Oneof> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.Oneof getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

