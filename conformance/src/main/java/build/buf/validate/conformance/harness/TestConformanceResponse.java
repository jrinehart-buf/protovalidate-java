// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/harness/harness.proto
// Protobuf Java Version: 4.28.0

package build.buf.validate.conformance.harness;

/**
 * <pre>
 * TestConformanceResponse is the response for Conformance Tests.
 * The results map is a map of case name to the TestResult.
 * </pre>
 *
 * Protobuf type {@code buf.validate.conformance.harness.TestConformanceResponse}
 */
public final class TestConformanceResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.harness.TestConformanceResponse)
    TestConformanceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 0,
      /* suffix= */ "",
      TestConformanceResponse.class.getName());
  }
  // Use TestConformanceResponse.newBuilder() to construct.
  private TestConformanceResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private TestConformanceResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.harness.HarnessProto.internal_static_buf_validate_conformance_harness_TestConformanceResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetResults();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.harness.HarnessProto.internal_static_buf_validate_conformance_harness_TestConformanceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.harness.TestConformanceResponse.class, build.buf.validate.conformance.harness.TestConformanceResponse.Builder.class);
  }

  public static final int RESULTS_FIELD_NUMBER = 1;
  private static final class ResultsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, build.buf.validate.conformance.harness.TestResult> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, build.buf.validate.conformance.harness.TestResult>newDefaultInstance(
                build.buf.validate.conformance.harness.HarnessProto.internal_static_buf_validate_conformance_harness_TestConformanceResponse_ResultsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                build.buf.validate.conformance.harness.TestResult.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, build.buf.validate.conformance.harness.TestResult> results_;
  private com.google.protobuf.MapField<java.lang.String, build.buf.validate.conformance.harness.TestResult>
  internalGetResults() {
    if (results_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ResultsDefaultEntryHolder.defaultEntry);
    }
    return results_;
  }
  public int getResultsCount() {
    return internalGetResults().getMap().size();
  }
  /**
   * <code>map&lt;string, .buf.validate.conformance.harness.TestResult&gt; results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public boolean containsResults(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetResults().getMap().containsKey(key);
  }
  /**
   * Use {@link #getResultsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, build.buf.validate.conformance.harness.TestResult> getResults() {
    return getResultsMap();
  }
  /**
   * <code>map&lt;string, .buf.validate.conformance.harness.TestResult&gt; results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, build.buf.validate.conformance.harness.TestResult> getResultsMap() {
    return internalGetResults().getMap();
  }
  /**
   * <code>map&lt;string, .buf.validate.conformance.harness.TestResult&gt; results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public /* nullable */
build.buf.validate.conformance.harness.TestResult getResultsOrDefault(
      java.lang.String key,
      /* nullable */
build.buf.validate.conformance.harness.TestResult defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, build.buf.validate.conformance.harness.TestResult> map =
        internalGetResults().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .buf.validate.conformance.harness.TestResult&gt; results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public build.buf.validate.conformance.harness.TestResult getResultsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, build.buf.validate.conformance.harness.TestResult> map =
        internalGetResults().getMap();
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
      .serializeStringMapTo(
        output,
        internalGetResults(),
        ResultsDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, build.buf.validate.conformance.harness.TestResult> entry
         : internalGetResults().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, build.buf.validate.conformance.harness.TestResult>
      results__ = ResultsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, results__);
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
    if (!(obj instanceof build.buf.validate.conformance.harness.TestConformanceResponse)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.harness.TestConformanceResponse other = (build.buf.validate.conformance.harness.TestConformanceResponse) obj;

    if (!internalGetResults().equals(
        other.internalGetResults())) return false;
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
    if (!internalGetResults().getMap().isEmpty()) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetResults().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.harness.TestConformanceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.harness.TestConformanceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.harness.TestConformanceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.harness.TestConformanceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.harness.TestConformanceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.harness.TestConformanceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.harness.TestConformanceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.harness.TestConformanceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.harness.TestConformanceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.harness.TestConformanceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.harness.TestConformanceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.harness.TestConformanceResponse parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.harness.TestConformanceResponse prototype) {
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
   * TestConformanceResponse is the response for Conformance Tests.
   * The results map is a map of case name to the TestResult.
   * </pre>
   *
   * Protobuf type {@code buf.validate.conformance.harness.TestConformanceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.harness.TestConformanceResponse)
      build.buf.validate.conformance.harness.TestConformanceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.harness.HarnessProto.internal_static_buf_validate_conformance_harness_TestConformanceResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetResults();
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
          return internalGetMutableResults();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.harness.HarnessProto.internal_static_buf_validate_conformance_harness_TestConformanceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.harness.TestConformanceResponse.class, build.buf.validate.conformance.harness.TestConformanceResponse.Builder.class);
    }

    // Construct using build.buf.validate.conformance.harness.TestConformanceResponse.newBuilder()
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
      internalGetMutableResults().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.harness.HarnessProto.internal_static_buf_validate_conformance_harness_TestConformanceResponse_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.harness.TestConformanceResponse getDefaultInstanceForType() {
      return build.buf.validate.conformance.harness.TestConformanceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.harness.TestConformanceResponse build() {
      build.buf.validate.conformance.harness.TestConformanceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.harness.TestConformanceResponse buildPartial() {
      build.buf.validate.conformance.harness.TestConformanceResponse result = new build.buf.validate.conformance.harness.TestConformanceResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.harness.TestConformanceResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.results_ = internalGetResults().build(ResultsDefaultEntryHolder.defaultEntry);
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.harness.TestConformanceResponse) {
        return mergeFrom((build.buf.validate.conformance.harness.TestConformanceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.harness.TestConformanceResponse other) {
      if (other == build.buf.validate.conformance.harness.TestConformanceResponse.getDefaultInstance()) return this;
      internalGetMutableResults().mergeFrom(
          other.internalGetResults());
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
              com.google.protobuf.MapEntry<java.lang.String, build.buf.validate.conformance.harness.TestResult>
              results__ = input.readMessage(
                  ResultsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableResults().ensureBuilderMap().put(
                  results__.getKey(), results__.getValue());
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

    private static final class ResultsConverter implements com.google.protobuf.MapFieldBuilder.Converter<java.lang.String, build.buf.validate.conformance.harness.TestResultOrBuilder, build.buf.validate.conformance.harness.TestResult> {
      @java.lang.Override
      public build.buf.validate.conformance.harness.TestResult build(build.buf.validate.conformance.harness.TestResultOrBuilder val) {
        if (val instanceof build.buf.validate.conformance.harness.TestResult) { return (build.buf.validate.conformance.harness.TestResult) val; }
        return ((build.buf.validate.conformance.harness.TestResult.Builder) val).build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<java.lang.String, build.buf.validate.conformance.harness.TestResult> defaultEntry() {
        return ResultsDefaultEntryHolder.defaultEntry;
      }
    };
    private static final ResultsConverter resultsConverter = new ResultsConverter();

    private com.google.protobuf.MapFieldBuilder<
        java.lang.String, build.buf.validate.conformance.harness.TestResultOrBuilder, build.buf.validate.conformance.harness.TestResult, build.buf.validate.conformance.harness.TestResult.Builder> results_;
    private com.google.protobuf.MapFieldBuilder<java.lang.String, build.buf.validate.conformance.harness.TestResultOrBuilder, build.buf.validate.conformance.harness.TestResult, build.buf.validate.conformance.harness.TestResult.Builder>
        internalGetResults() {
      if (results_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(resultsConverter);
      }
      return results_;
    }
    private com.google.protobuf.MapFieldBuilder<java.lang.String, build.buf.validate.conformance.harness.TestResultOrBuilder, build.buf.validate.conformance.harness.TestResult, build.buf.validate.conformance.harness.TestResult.Builder>
        internalGetMutableResults() {
      if (results_ == null) {
        results_ = new com.google.protobuf.MapFieldBuilder<>(resultsConverter);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return results_;
    }
    public int getResultsCount() {
      return internalGetResults().ensureBuilderMap().size();
    }
    /**
     * <code>map&lt;string, .buf.validate.conformance.harness.TestResult&gt; results = 1 [json_name = "results"];</code>
     */
    @java.lang.Override
    public boolean containsResults(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetResults().ensureBuilderMap().containsKey(key);
    }
    /**
     * Use {@link #getResultsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, build.buf.validate.conformance.harness.TestResult> getResults() {
      return getResultsMap();
    }
    /**
     * <code>map&lt;string, .buf.validate.conformance.harness.TestResult&gt; results = 1 [json_name = "results"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, build.buf.validate.conformance.harness.TestResult> getResultsMap() {
      return internalGetResults().getImmutableMap();
    }
    /**
     * <code>map&lt;string, .buf.validate.conformance.harness.TestResult&gt; results = 1 [json_name = "results"];</code>
     */
    @java.lang.Override
    public /* nullable */
build.buf.validate.conformance.harness.TestResult getResultsOrDefault(
        java.lang.String key,
        /* nullable */
build.buf.validate.conformance.harness.TestResult defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, build.buf.validate.conformance.harness.TestResultOrBuilder> map = internalGetMutableResults().ensureBuilderMap();
      return map.containsKey(key) ? resultsConverter.build(map.get(key)) : defaultValue;
    }
    /**
     * <code>map&lt;string, .buf.validate.conformance.harness.TestResult&gt; results = 1 [json_name = "results"];</code>
     */
    @java.lang.Override
    public build.buf.validate.conformance.harness.TestResult getResultsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, build.buf.validate.conformance.harness.TestResultOrBuilder> map = internalGetMutableResults().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return resultsConverter.build(map.get(key));
    }
    public Builder clearResults() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableResults().clear();
      return this;
    }
    /**
     * <code>map&lt;string, .buf.validate.conformance.harness.TestResult&gt; results = 1 [json_name = "results"];</code>
     */
    public Builder removeResults(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableResults().ensureBuilderMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, build.buf.validate.conformance.harness.TestResult>
        getMutableResults() {
      bitField0_ |= 0x00000001;
      return internalGetMutableResults().ensureMessageMap();
    }
    /**
     * <code>map&lt;string, .buf.validate.conformance.harness.TestResult&gt; results = 1 [json_name = "results"];</code>
     */
    public Builder putResults(
        java.lang.String key,
        build.buf.validate.conformance.harness.TestResult value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableResults().ensureBuilderMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;string, .buf.validate.conformance.harness.TestResult&gt; results = 1 [json_name = "results"];</code>
     */
    public Builder putAllResults(
        java.util.Map<java.lang.String, build.buf.validate.conformance.harness.TestResult> values) {
      for (java.util.Map.Entry<java.lang.String, build.buf.validate.conformance.harness.TestResult> e : values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutableResults().ensureBuilderMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;string, .buf.validate.conformance.harness.TestResult&gt; results = 1 [json_name = "results"];</code>
     */
    public build.buf.validate.conformance.harness.TestResult.Builder putResultsBuilderIfAbsent(
        java.lang.String key) {
      java.util.Map<java.lang.String, build.buf.validate.conformance.harness.TestResultOrBuilder> builderMap = internalGetMutableResults().ensureBuilderMap();
      build.buf.validate.conformance.harness.TestResultOrBuilder entry = builderMap.get(key);
      if (entry == null) {
        entry = build.buf.validate.conformance.harness.TestResult.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry instanceof build.buf.validate.conformance.harness.TestResult) {
        entry = ((build.buf.validate.conformance.harness.TestResult) entry).toBuilder();
        builderMap.put(key, entry);
      }
      return (build.buf.validate.conformance.harness.TestResult.Builder) entry;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.harness.TestConformanceResponse)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.harness.TestConformanceResponse)
  private static final build.buf.validate.conformance.harness.TestConformanceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.harness.TestConformanceResponse();
  }

  public static build.buf.validate.conformance.harness.TestConformanceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestConformanceResponse>
      PARSER = new com.google.protobuf.AbstractParser<TestConformanceResponse>() {
    @java.lang.Override
    public TestConformanceResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<TestConformanceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestConformanceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.harness.TestConformanceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

