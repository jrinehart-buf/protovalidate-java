// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/custom_constraints/custom_constraints.proto
// Protobuf Java Version: 4.29.3

package build.buf.validate.conformance.cases.custom_constraints;

public interface FieldExpressionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.custom_constraints.FieldExpressions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 a = 1 [json_name = "a", (.buf.validate.field) = { ... }</code>
   * @return The a.
   */
  int getA();

  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.Enum b = 2 [json_name = "b", (.buf.validate.field) = { ... }</code>
   * @return The enum numeric value on the wire for b.
   */
  int getBValue();
  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.Enum b = 2 [json_name = "b", (.buf.validate.field) = { ... }</code>
   * @return The b.
   */
  build.buf.validate.conformance.cases.custom_constraints.Enum getB();

  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.FieldExpressions.Nested c = 3 [json_name = "c", (.buf.validate.field) = { ... }</code>
   * @return Whether the c field is set.
   */
  boolean hasC();
  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.FieldExpressions.Nested c = 3 [json_name = "c", (.buf.validate.field) = { ... }</code>
   * @return The c.
   */
  build.buf.validate.conformance.cases.custom_constraints.FieldExpressions.Nested getC();
  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.FieldExpressions.Nested c = 3 [json_name = "c", (.buf.validate.field) = { ... }</code>
   */
  build.buf.validate.conformance.cases.custom_constraints.FieldExpressions.NestedOrBuilder getCOrBuilder();

  /**
   * <code>int32 d = 4 [json_name = "d", (.buf.validate.field) = { ... }</code>
   * @return The d.
   */
  int getD();
}
