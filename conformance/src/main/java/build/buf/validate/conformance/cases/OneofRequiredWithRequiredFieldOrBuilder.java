// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/oneofs.proto
// Protobuf Java Version: 4.28.0

package build.buf.validate.conformance.cases;

public interface OneofRequiredWithRequiredFieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.OneofRequiredWithRequiredField)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string a = 1 [json_name = "a", (.buf.validate.field) = { ... }</code>
   * @return Whether the a field is set.
   */
  boolean hasA();
  /**
   * <code>string a = 1 [json_name = "a", (.buf.validate.field) = { ... }</code>
   * @return The a.
   */
  java.lang.String getA();
  /**
   * <code>string a = 1 [json_name = "a", (.buf.validate.field) = { ... }</code>
   * @return The bytes for a.
   */
  com.google.protobuf.ByteString
      getABytes();

  /**
   * <code>string b = 2 [json_name = "b"];</code>
   * @return Whether the b field is set.
   */
  boolean hasB();
  /**
   * <code>string b = 2 [json_name = "b"];</code>
   * @return The b.
   */
  java.lang.String getB();
  /**
   * <code>string b = 2 [json_name = "b"];</code>
   * @return The bytes for b.
   */
  com.google.protobuf.ByteString
      getBBytes();

  build.buf.validate.conformance.cases.OneofRequiredWithRequiredField.OCase getOCase();
}
