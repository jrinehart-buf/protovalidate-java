// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/custom_constraints/custom_constraints.proto
// Protobuf Java Version: 4.29.1

package build.buf.validate.conformance.cases.custom_constraints;

public interface NoExpressionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.custom_constraints.NoExpressions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 a = 1 [json_name = "a"];</code>
   * @return The a.
   */
  int getA();

  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.Enum b = 2 [json_name = "b"];</code>
   * @return The enum numeric value on the wire for b.
   */
  int getBValue();
  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.Enum b = 2 [json_name = "b"];</code>
   * @return The b.
   */
  build.buf.validate.conformance.cases.custom_constraints.Enum getB();

  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.NoExpressions.Nested c = 3 [json_name = "c"];</code>
   * @return Whether the c field is set.
   */
  boolean hasC();
  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.NoExpressions.Nested c = 3 [json_name = "c"];</code>
   * @return The c.
   */
  build.buf.validate.conformance.cases.custom_constraints.NoExpressions.Nested getC();
  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.NoExpressions.Nested c = 3 [json_name = "c"];</code>
   */
  build.buf.validate.conformance.cases.custom_constraints.NoExpressions.NestedOrBuilder getCOrBuilder();
}
