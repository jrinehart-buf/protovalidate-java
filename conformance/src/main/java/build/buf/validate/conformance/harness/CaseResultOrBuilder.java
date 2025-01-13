// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/harness/results.proto
// Protobuf Java Version: 4.29.3

package build.buf.validate.conformance.harness;

public interface CaseResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.harness.CaseResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The case name.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The case name.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Success state of the test case. True if the test case succeeded.
   * </pre>
   *
   * <code>bool success = 2 [json_name = "success"];</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <pre>
   * The expected result.
   * </pre>
   *
   * <code>.buf.validate.conformance.harness.TestResult wanted = 3 [json_name = "wanted"];</code>
   * @return Whether the wanted field is set.
   */
  boolean hasWanted();
  /**
   * <pre>
   * The expected result.
   * </pre>
   *
   * <code>.buf.validate.conformance.harness.TestResult wanted = 3 [json_name = "wanted"];</code>
   * @return The wanted.
   */
  build.buf.validate.conformance.harness.TestResult getWanted();
  /**
   * <pre>
   * The expected result.
   * </pre>
   *
   * <code>.buf.validate.conformance.harness.TestResult wanted = 3 [json_name = "wanted"];</code>
   */
  build.buf.validate.conformance.harness.TestResultOrBuilder getWantedOrBuilder();

  /**
   * <pre>
   * The actual result.
   * </pre>
   *
   * <code>.buf.validate.conformance.harness.TestResult got = 4 [json_name = "got"];</code>
   * @return Whether the got field is set.
   */
  boolean hasGot();
  /**
   * <pre>
   * The actual result.
   * </pre>
   *
   * <code>.buf.validate.conformance.harness.TestResult got = 4 [json_name = "got"];</code>
   * @return The got.
   */
  build.buf.validate.conformance.harness.TestResult getGot();
  /**
   * <pre>
   * The actual result.
   * </pre>
   *
   * <code>.buf.validate.conformance.harness.TestResult got = 4 [json_name = "got"];</code>
   */
  build.buf.validate.conformance.harness.TestResultOrBuilder getGotOrBuilder();

  /**
   * <pre>
   * The input used to invoke the test case.
   * </pre>
   *
   * <code>.google.protobuf.Any input = 5 [json_name = "input"];</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <pre>
   * The input used to invoke the test case.
   * </pre>
   *
   * <code>.google.protobuf.Any input = 5 [json_name = "input"];</code>
   * @return The input.
   */
  com.google.protobuf.Any getInput();
  /**
   * <pre>
   * The input used to invoke the test case.
   * </pre>
   *
   * <code>.google.protobuf.Any input = 5 [json_name = "input"];</code>
   */
  com.google.protobuf.AnyOrBuilder getInputOrBuilder();

  /**
   * <pre>
   * Denotes if the test is expected to fail. True, if the test case was expected to fail.
   * </pre>
   *
   * <code>bool expected_failure = 6 [json_name = "expectedFailure"];</code>
   * @return The expectedFailure.
   */
  boolean getExpectedFailure();
}
