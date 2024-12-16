// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/validate.proto
// Protobuf Java Version: 4.29.1

package build.buf.validate;

/**
 * <pre>
 * `FieldPath` provides a path to a nested protobuf field.
 *
 * This message provides enough information to render a dotted field path even without protobuf descriptors.
 * It also provides enough information to resolve a nested field through unknown wire data.
 * </pre>
 *
 * Protobuf type {@code buf.validate.FieldPath}
 */
public final class FieldPath extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.FieldPath)
    FieldPathOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      FieldPath.class.getName());
  }
  // Use FieldPath.newBuilder() to construct.
  private FieldPath(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FieldPath() {
    elements_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.ValidateProto.internal_static_buf_validate_FieldPath_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.ValidateProto.internal_static_buf_validate_FieldPath_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.FieldPath.class, build.buf.validate.FieldPath.Builder.class);
  }

  public static final int ELEMENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<build.buf.validate.FieldPathElement> elements_;
  /**
   * <pre>
   * `elements` contains each element of the path, starting from the root and recursing downward.
   * </pre>
   *
   * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
   */
  @java.lang.Override
  public java.util.List<build.buf.validate.FieldPathElement> getElementsList() {
    return elements_;
  }
  /**
   * <pre>
   * `elements` contains each element of the path, starting from the root and recursing downward.
   * </pre>
   *
   * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends build.buf.validate.FieldPathElementOrBuilder> 
      getElementsOrBuilderList() {
    return elements_;
  }
  /**
   * <pre>
   * `elements` contains each element of the path, starting from the root and recursing downward.
   * </pre>
   *
   * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
   */
  @java.lang.Override
  public int getElementsCount() {
    return elements_.size();
  }
  /**
   * <pre>
   * `elements` contains each element of the path, starting from the root and recursing downward.
   * </pre>
   *
   * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
   */
  @java.lang.Override
  public build.buf.validate.FieldPathElement getElements(int index) {
    return elements_.get(index);
  }
  /**
   * <pre>
   * `elements` contains each element of the path, starting from the root and recursing downward.
   * </pre>
   *
   * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
   */
  @java.lang.Override
  public build.buf.validate.FieldPathElementOrBuilder getElementsOrBuilder(
      int index) {
    return elements_.get(index);
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
    for (int i = 0; i < elements_.size(); i++) {
      output.writeMessage(1, elements_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < elements_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, elements_.get(i));
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
    if (!(obj instanceof build.buf.validate.FieldPath)) {
      return super.equals(obj);
    }
    build.buf.validate.FieldPath other = (build.buf.validate.FieldPath) obj;

    if (!getElementsList()
        .equals(other.getElementsList())) return false;
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
    if (getElementsCount() > 0) {
      hash = (37 * hash) + ELEMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getElementsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.FieldPath parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.FieldPath parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.FieldPath parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.FieldPath parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.FieldPath parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.FieldPath parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.FieldPath parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.FieldPath parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.FieldPath parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.FieldPath parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.FieldPath parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.FieldPath parseFrom(
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
  public static Builder newBuilder(build.buf.validate.FieldPath prototype) {
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
   * <pre>
   * `FieldPath` provides a path to a nested protobuf field.
   *
   * This message provides enough information to render a dotted field path even without protobuf descriptors.
   * It also provides enough information to resolve a nested field through unknown wire data.
   * </pre>
   *
   * Protobuf type {@code buf.validate.FieldPath}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.FieldPath)
      build.buf.validate.FieldPathOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.ValidateProto.internal_static_buf_validate_FieldPath_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.ValidateProto.internal_static_buf_validate_FieldPath_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.FieldPath.class, build.buf.validate.FieldPath.Builder.class);
    }

    // Construct using build.buf.validate.FieldPath.newBuilder()
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
      if (elementsBuilder_ == null) {
        elements_ = java.util.Collections.emptyList();
      } else {
        elements_ = null;
        elementsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.ValidateProto.internal_static_buf_validate_FieldPath_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.FieldPath getDefaultInstanceForType() {
      return build.buf.validate.FieldPath.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.FieldPath build() {
      build.buf.validate.FieldPath result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.FieldPath buildPartial() {
      build.buf.validate.FieldPath result = new build.buf.validate.FieldPath(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(build.buf.validate.FieldPath result) {
      if (elementsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          elements_ = java.util.Collections.unmodifiableList(elements_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.elements_ = elements_;
      } else {
        result.elements_ = elementsBuilder_.build();
      }
    }

    private void buildPartial0(build.buf.validate.FieldPath result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.FieldPath) {
        return mergeFrom((build.buf.validate.FieldPath)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.FieldPath other) {
      if (other == build.buf.validate.FieldPath.getDefaultInstance()) return this;
      if (elementsBuilder_ == null) {
        if (!other.elements_.isEmpty()) {
          if (elements_.isEmpty()) {
            elements_ = other.elements_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureElementsIsMutable();
            elements_.addAll(other.elements_);
          }
          onChanged();
        }
      } else {
        if (!other.elements_.isEmpty()) {
          if (elementsBuilder_.isEmpty()) {
            elementsBuilder_.dispose();
            elementsBuilder_ = null;
            elements_ = other.elements_;
            bitField0_ = (bitField0_ & ~0x00000001);
            elementsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getElementsFieldBuilder() : null;
          } else {
            elementsBuilder_.addAllMessages(other.elements_);
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
              build.buf.validate.FieldPathElement m =
                  input.readMessage(
                      build.buf.validate.FieldPathElement.parser(),
                      extensionRegistry);
              if (elementsBuilder_ == null) {
                ensureElementsIsMutable();
                elements_.add(m);
              } else {
                elementsBuilder_.addMessage(m);
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

    private java.util.List<build.buf.validate.FieldPathElement> elements_ =
      java.util.Collections.emptyList();
    private void ensureElementsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        elements_ = new java.util.ArrayList<build.buf.validate.FieldPathElement>(elements_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        build.buf.validate.FieldPathElement, build.buf.validate.FieldPathElement.Builder, build.buf.validate.FieldPathElementOrBuilder> elementsBuilder_;

    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public java.util.List<build.buf.validate.FieldPathElement> getElementsList() {
      if (elementsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(elements_);
      } else {
        return elementsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public int getElementsCount() {
      if (elementsBuilder_ == null) {
        return elements_.size();
      } else {
        return elementsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public build.buf.validate.FieldPathElement getElements(int index) {
      if (elementsBuilder_ == null) {
        return elements_.get(index);
      } else {
        return elementsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public Builder setElements(
        int index, build.buf.validate.FieldPathElement value) {
      if (elementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementsIsMutable();
        elements_.set(index, value);
        onChanged();
      } else {
        elementsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public Builder setElements(
        int index, build.buf.validate.FieldPathElement.Builder builderForValue) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        elements_.set(index, builderForValue.build());
        onChanged();
      } else {
        elementsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public Builder addElements(build.buf.validate.FieldPathElement value) {
      if (elementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementsIsMutable();
        elements_.add(value);
        onChanged();
      } else {
        elementsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public Builder addElements(
        int index, build.buf.validate.FieldPathElement value) {
      if (elementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementsIsMutable();
        elements_.add(index, value);
        onChanged();
      } else {
        elementsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public Builder addElements(
        build.buf.validate.FieldPathElement.Builder builderForValue) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        elements_.add(builderForValue.build());
        onChanged();
      } else {
        elementsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public Builder addElements(
        int index, build.buf.validate.FieldPathElement.Builder builderForValue) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        elements_.add(index, builderForValue.build());
        onChanged();
      } else {
        elementsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public Builder addAllElements(
        java.lang.Iterable<? extends build.buf.validate.FieldPathElement> values) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, elements_);
        onChanged();
      } else {
        elementsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public Builder clearElements() {
      if (elementsBuilder_ == null) {
        elements_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        elementsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public Builder removeElements(int index) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        elements_.remove(index);
        onChanged();
      } else {
        elementsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public build.buf.validate.FieldPathElement.Builder getElementsBuilder(
        int index) {
      return getElementsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public build.buf.validate.FieldPathElementOrBuilder getElementsOrBuilder(
        int index) {
      if (elementsBuilder_ == null) {
        return elements_.get(index);  } else {
        return elementsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public java.util.List<? extends build.buf.validate.FieldPathElementOrBuilder> 
         getElementsOrBuilderList() {
      if (elementsBuilder_ != null) {
        return elementsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(elements_);
      }
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public build.buf.validate.FieldPathElement.Builder addElementsBuilder() {
      return getElementsFieldBuilder().addBuilder(
          build.buf.validate.FieldPathElement.getDefaultInstance());
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public build.buf.validate.FieldPathElement.Builder addElementsBuilder(
        int index) {
      return getElementsFieldBuilder().addBuilder(
          index, build.buf.validate.FieldPathElement.getDefaultInstance());
    }
    /**
     * <pre>
     * `elements` contains each element of the path, starting from the root and recursing downward.
     * </pre>
     *
     * <code>repeated .buf.validate.FieldPathElement elements = 1 [json_name = "elements"];</code>
     */
    public java.util.List<build.buf.validate.FieldPathElement.Builder> 
         getElementsBuilderList() {
      return getElementsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        build.buf.validate.FieldPathElement, build.buf.validate.FieldPathElement.Builder, build.buf.validate.FieldPathElementOrBuilder> 
        getElementsFieldBuilder() {
      if (elementsBuilder_ == null) {
        elementsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            build.buf.validate.FieldPathElement, build.buf.validate.FieldPathElement.Builder, build.buf.validate.FieldPathElementOrBuilder>(
                elements_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        elements_ = null;
      }
      return elementsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.FieldPath)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.FieldPath)
  private static final build.buf.validate.FieldPath DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.FieldPath();
  }

  public static build.buf.validate.FieldPath getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FieldPath>
      PARSER = new com.google.protobuf.AbstractParser<FieldPath>() {
    @java.lang.Override
    public FieldPath parsePartialFrom(
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

  public static com.google.protobuf.Parser<FieldPath> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FieldPath> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.FieldPath getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

