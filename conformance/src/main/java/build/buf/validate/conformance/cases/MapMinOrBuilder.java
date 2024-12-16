// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/maps.proto
// Protobuf Java Version: 4.29.1

package build.buf.validate.conformance.cases;

public interface MapMinOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.MapMin)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;int32, float&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  int getValCount();
  /**
   * <code>map&lt;int32, float&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  boolean containsVal(
      int key);
  /**
   * Use {@link #getValMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Float>
  getVal();
  /**
   * <code>map&lt;int32, float&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Float>
  getValMap();
  /**
   * <code>map&lt;int32, float&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  float getValOrDefault(
      int key,
      float defaultValue);
  /**
   * <code>map&lt;int32, float&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  float getValOrThrow(
      int key);
}
