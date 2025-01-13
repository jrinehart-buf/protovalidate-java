// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/enums.proto
// Protobuf Java Version: 4.29.3

package build.buf.validate.conformance.cases;

/**
 * Protobuf enum {@code buf.validate.conformance.cases.TestEnumAlias}
 */
public enum TestEnumAlias
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TEST_ENUM_ALIAS_UNSPECIFIED = 0;</code>
   */
  TEST_ENUM_ALIAS_UNSPECIFIED(0),
  /**
   * <code>TEST_ENUM_ALIAS_A = 1;</code>
   */
  TEST_ENUM_ALIAS_A(1),
  /**
   * <code>TEST_ENUM_ALIAS_B = 2;</code>
   */
  TEST_ENUM_ALIAS_B(2),
  /**
   * <code>TEST_ENUM_ALIAS_C = 3;</code>
   */
  TEST_ENUM_ALIAS_C(3),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      TestEnumAlias.class.getName());
  }
  /**
   * <code>TEST_ENUM_ALIAS_ALPHA = 1;</code>
   */
  public static final TestEnumAlias TEST_ENUM_ALIAS_ALPHA = TEST_ENUM_ALIAS_A;
  /**
   * <code>TEST_ENUM_ALIAS_BETA = 2;</code>
   */
  public static final TestEnumAlias TEST_ENUM_ALIAS_BETA = TEST_ENUM_ALIAS_B;
  /**
   * <code>TEST_ENUM_ALIAS_GAMMA = 3;</code>
   */
  public static final TestEnumAlias TEST_ENUM_ALIAS_GAMMA = TEST_ENUM_ALIAS_C;
  /**
   * <code>TEST_ENUM_ALIAS_UNSPECIFIED = 0;</code>
   */
  public static final int TEST_ENUM_ALIAS_UNSPECIFIED_VALUE = 0;
  /**
   * <code>TEST_ENUM_ALIAS_A = 1;</code>
   */
  public static final int TEST_ENUM_ALIAS_A_VALUE = 1;
  /**
   * <code>TEST_ENUM_ALIAS_B = 2;</code>
   */
  public static final int TEST_ENUM_ALIAS_B_VALUE = 2;
  /**
   * <code>TEST_ENUM_ALIAS_C = 3;</code>
   */
  public static final int TEST_ENUM_ALIAS_C_VALUE = 3;
  /**
   * <code>TEST_ENUM_ALIAS_ALPHA = 1;</code>
   */
  public static final int TEST_ENUM_ALIAS_ALPHA_VALUE = 1;
  /**
   * <code>TEST_ENUM_ALIAS_BETA = 2;</code>
   */
  public static final int TEST_ENUM_ALIAS_BETA_VALUE = 2;
  /**
   * <code>TEST_ENUM_ALIAS_GAMMA = 3;</code>
   */
  public static final int TEST_ENUM_ALIAS_GAMMA_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TestEnumAlias valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TestEnumAlias forNumber(int value) {
    switch (value) {
      case 0: return TEST_ENUM_ALIAS_UNSPECIFIED;
      case 1: return TEST_ENUM_ALIAS_A;
      case 2: return TEST_ENUM_ALIAS_B;
      case 3: return TEST_ENUM_ALIAS_C;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TestEnumAlias>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TestEnumAlias> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TestEnumAlias>() {
          public TestEnumAlias findValueByNumber(int number) {
            return TestEnumAlias.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.EnumsProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final TestEnumAlias[] VALUES = getStaticValuesArray();
  private static TestEnumAlias[] getStaticValuesArray() {
    return new TestEnumAlias[] {
    TEST_ENUM_ALIAS_UNSPECIFIED, TEST_ENUM_ALIAS_A, TEST_ENUM_ALIAS_B, TEST_ENUM_ALIAS_C, TEST_ENUM_ALIAS_ALPHA, TEST_ENUM_ALIAS_BETA, TEST_ENUM_ALIAS_GAMMA, 
    };
  }
  public static TestEnumAlias valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TestEnumAlias(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:buf.validate.conformance.cases.TestEnumAlias)
}

