// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/predefined_rules_proto3.proto
// Protobuf Java Version: 4.29.1

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3}
 */
public final class PredefinedRepeatedWrappedBytesRuleProto3 extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3)
    PredefinedRepeatedWrappedBytesRuleProto3OrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      PredefinedRepeatedWrappedBytesRuleProto3.class.getName());
  }
  // Use PredefinedRepeatedWrappedBytesRuleProto3.newBuilder() to construct.
  private PredefinedRepeatedWrappedBytesRuleProto3(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PredefinedRepeatedWrappedBytesRuleProto3() {
    val_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.PredefinedRulesProto3Proto.internal_static_buf_validate_conformance_cases_PredefinedRepeatedWrappedBytesRuleProto3_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.PredefinedRulesProto3Proto.internal_static_buf_validate_conformance_cases_PredefinedRepeatedWrappedBytesRuleProto3_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3.class, build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3.Builder.class);
  }

  public static final int VAL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.BytesValue> val_;
  /**
   * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.BytesValue> getValList() {
    return val_;
  }
  /**
   * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.BytesValueOrBuilder> 
      getValOrBuilderList() {
    return val_;
  }
  /**
   * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public int getValCount() {
    return val_.size();
  }
  /**
   * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public com.google.protobuf.BytesValue getVal(int index) {
    return val_.get(index);
  }
  /**
   * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public com.google.protobuf.BytesValueOrBuilder getValOrBuilder(
      int index) {
    return val_.get(index);
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
      output.writeMessage(1, val_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < val_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, val_.get(i));
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
    if (!(obj instanceof build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 other = (build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3) obj;

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

  public static build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3)
      build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.PredefinedRulesProto3Proto.internal_static_buf_validate_conformance_cases_PredefinedRepeatedWrappedBytesRuleProto3_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.PredefinedRulesProto3Proto.internal_static_buf_validate_conformance_cases_PredefinedRepeatedWrappedBytesRuleProto3_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3.class, build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3.newBuilder()
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
      if (valBuilder_ == null) {
        val_ = java.util.Collections.emptyList();
      } else {
        val_ = null;
        valBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.PredefinedRulesProto3Proto.internal_static_buf_validate_conformance_cases_PredefinedRepeatedWrappedBytesRuleProto3_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 build() {
      build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 buildPartial() {
      build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 result = new build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 result) {
      if (valBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          val_ = java.util.Collections.unmodifiableList(val_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.val_ = val_;
      } else {
        result.val_ = valBuilder_.build();
      }
    }

    private void buildPartial0(build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3) {
        return mergeFrom((build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 other) {
      if (other == build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3.getDefaultInstance()) return this;
      if (valBuilder_ == null) {
        if (!other.val_.isEmpty()) {
          if (val_.isEmpty()) {
            val_ = other.val_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValIsMutable();
            val_.addAll(other.val_);
          }
          onChanged();
        }
      } else {
        if (!other.val_.isEmpty()) {
          if (valBuilder_.isEmpty()) {
            valBuilder_.dispose();
            valBuilder_ = null;
            val_ = other.val_;
            bitField0_ = (bitField0_ & ~0x00000001);
            valBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getValFieldBuilder() : null;
          } else {
            valBuilder_.addAllMessages(other.val_);
          }
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
              com.google.protobuf.BytesValue m =
                  input.readMessage(
                      com.google.protobuf.BytesValue.parser(),
                      extensionRegistry);
              if (valBuilder_ == null) {
                ensureValIsMutable();
                val_.add(m);
              } else {
                valBuilder_.addMessage(m);
              }
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

    private java.util.List<com.google.protobuf.BytesValue> val_ =
      java.util.Collections.emptyList();
    private void ensureValIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        val_ = new java.util.ArrayList<com.google.protobuf.BytesValue>(val_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.protobuf.BytesValue, com.google.protobuf.BytesValue.Builder, com.google.protobuf.BytesValueOrBuilder> valBuilder_;

    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public java.util.List<com.google.protobuf.BytesValue> getValList() {
      if (valBuilder_ == null) {
        return java.util.Collections.unmodifiableList(val_);
      } else {
        return valBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public int getValCount() {
      if (valBuilder_ == null) {
        return val_.size();
      } else {
        return valBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public com.google.protobuf.BytesValue getVal(int index) {
      if (valBuilder_ == null) {
        return val_.get(index);
      } else {
        return valBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder setVal(
        int index, com.google.protobuf.BytesValue value) {
      if (valBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValIsMutable();
        val_.set(index, value);
        onChanged();
      } else {
        valBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder setVal(
        int index, com.google.protobuf.BytesValue.Builder builderForValue) {
      if (valBuilder_ == null) {
        ensureValIsMutable();
        val_.set(index, builderForValue.build());
        onChanged();
      } else {
        valBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder addVal(com.google.protobuf.BytesValue value) {
      if (valBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValIsMutable();
        val_.add(value);
        onChanged();
      } else {
        valBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder addVal(
        int index, com.google.protobuf.BytesValue value) {
      if (valBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValIsMutable();
        val_.add(index, value);
        onChanged();
      } else {
        valBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder addVal(
        com.google.protobuf.BytesValue.Builder builderForValue) {
      if (valBuilder_ == null) {
        ensureValIsMutable();
        val_.add(builderForValue.build());
        onChanged();
      } else {
        valBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder addVal(
        int index, com.google.protobuf.BytesValue.Builder builderForValue) {
      if (valBuilder_ == null) {
        ensureValIsMutable();
        val_.add(index, builderForValue.build());
        onChanged();
      } else {
        valBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder addAllVal(
        java.lang.Iterable<? extends com.google.protobuf.BytesValue> values) {
      if (valBuilder_ == null) {
        ensureValIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, val_);
        onChanged();
      } else {
        valBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder clearVal() {
      if (valBuilder_ == null) {
        val_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        valBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder removeVal(int index) {
      if (valBuilder_ == null) {
        ensureValIsMutable();
        val_.remove(index);
        onChanged();
      } else {
        valBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public com.google.protobuf.BytesValue.Builder getValBuilder(
        int index) {
      return getValFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public com.google.protobuf.BytesValueOrBuilder getValOrBuilder(
        int index) {
      if (valBuilder_ == null) {
        return val_.get(index);  } else {
        return valBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public java.util.List<? extends com.google.protobuf.BytesValueOrBuilder> 
         getValOrBuilderList() {
      if (valBuilder_ != null) {
        return valBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(val_);
      }
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public com.google.protobuf.BytesValue.Builder addValBuilder() {
      return getValFieldBuilder().addBuilder(
          com.google.protobuf.BytesValue.getDefaultInstance());
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public com.google.protobuf.BytesValue.Builder addValBuilder(
        int index) {
      return getValFieldBuilder().addBuilder(
          index, com.google.protobuf.BytesValue.getDefaultInstance());
    }
    /**
     * <code>repeated .google.protobuf.BytesValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public java.util.List<com.google.protobuf.BytesValue.Builder> 
         getValBuilderList() {
      return getValFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.protobuf.BytesValue, com.google.protobuf.BytesValue.Builder, com.google.protobuf.BytesValueOrBuilder> 
        getValFieldBuilder() {
      if (valBuilder_ == null) {
        valBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.protobuf.BytesValue, com.google.protobuf.BytesValue.Builder, com.google.protobuf.BytesValueOrBuilder>(
                val_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        val_ = null;
      }
      return valBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3)
  private static final build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3();
  }

  public static build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PredefinedRepeatedWrappedBytesRuleProto3>
      PARSER = new com.google.protobuf.AbstractParser<PredefinedRepeatedWrappedBytesRuleProto3>() {
    @java.lang.Override
    public PredefinedRepeatedWrappedBytesRuleProto3 parsePartialFrom(
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

  public static com.google.protobuf.Parser<PredefinedRepeatedWrappedBytesRuleProto3> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PredefinedRepeatedWrappedBytesRuleProto3> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.PredefinedRepeatedWrappedBytesRuleProto3 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

