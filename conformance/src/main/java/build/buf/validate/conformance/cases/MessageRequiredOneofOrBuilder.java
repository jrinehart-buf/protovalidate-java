// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/messages.proto
// Protobuf Java Version: 4.28.3

package build.buf.validate.conformance.cases;

public interface MessageRequiredOneofOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.MessageRequiredOneof)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.buf.validate.conformance.cases.TestMsg val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return Whether the val field is set.
   */
  boolean hasVal();
  /**
   * <code>.buf.validate.conformance.cases.TestMsg val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return The val.
   */
  build.buf.validate.conformance.cases.TestMsg getVal();
  /**
   * <code>.buf.validate.conformance.cases.TestMsg val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  build.buf.validate.conformance.cases.TestMsgOrBuilder getValOrBuilder();

  build.buf.validate.conformance.cases.MessageRequiredOneof.OneCase getOneCase();
}
