// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/harness/results.proto
// Protobuf Java Version: 4.29.3

package build.buf.validate.conformance.harness;

public final class ResultsProto {
  private ResultsProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      ResultsProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_harness_ResultOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_harness_ResultOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_harness_ResultSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_harness_ResultSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_harness_SuiteResults_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_harness_SuiteResults_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_harness_CaseResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_harness_CaseResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.buf/validate/conformance/harness/resul" +
      "ts.proto\022 buf.validate.conformance.harne" +
      "ss\032.buf/validate/conformance/harness/har" +
      "ness.proto\032\031google/protobuf/any.proto\032 g" +
      "oogle/protobuf/descriptor.proto\"\317\001\n\rResu" +
      "ltOptions\022!\n\014suite_filter\030\001 \001(\tR\013suiteFi" +
      "lter\022\037\n\013case_filter\030\002 \001(\tR\ncaseFilter\022\030\n" +
      "\007verbose\030\003 \001(\010R\007verbose\022\026\n\006strict\030\004 \001(\010R" +
      "\006strict\022%\n\016strict_message\030\005 \001(\010R\rstrictM" +
      "essage\022!\n\014strict_error\030\006 \001(\010R\013strictErro" +
      "r\"\205\002\n\tResultSet\022\034\n\tsuccesses\030\001 \001(\005R\tsucc" +
      "esses\022\032\n\010failures\030\002 \001(\005R\010failures\022F\n\006sui" +
      "tes\030\003 \003(\0132..buf.validate.conformance.har" +
      "ness.SuiteResultsR\006suites\022I\n\007options\030\004 \001" +
      "(\0132/.buf.validate.conformance.harness.Re" +
      "sultOptionsR\007options\022+\n\021expected_failure" +
      "s\030\005 \001(\005R\020expectedFailures\"\207\002\n\014SuiteResul" +
      "ts\022\022\n\004name\030\001 \001(\tR\004name\022\034\n\tsuccesses\030\002 \001(" +
      "\005R\tsuccesses\022\032\n\010failures\030\003 \001(\005R\010failures" +
      "\022B\n\005cases\030\004 \003(\0132,.buf.validate.conforman" +
      "ce.harness.CaseResultR\005cases\0228\n\005fdset\030\005 " +
      "\001(\0132\".google.protobuf.FileDescriptorSetR" +
      "\005fdset\022+\n\021expected_failures\030\006 \001(\005R\020expec" +
      "tedFailures\"\227\002\n\nCaseResult\022\022\n\004name\030\001 \001(\t" +
      "R\004name\022\030\n\007success\030\002 \001(\010R\007success\022D\n\006want" +
      "ed\030\003 \001(\0132,.buf.validate.conformance.harn" +
      "ess.TestResultR\006wanted\022>\n\003got\030\004 \001(\0132,.bu" +
      "f.validate.conformance.harness.TestResul" +
      "tR\003got\022*\n\005input\030\005 \001(\0132\024.google.protobuf." +
      "AnyR\005input\022)\n\020expected_failure\030\006 \001(\010R\017ex" +
      "pectedFailureB\332\001\n&build.buf.validate.con" +
      "formance.harnessB\014ResultsProtoP\001\242\002\004BVCH\252" +
      "\002 Buf.Validate.Conformance.Harness\312\002 Buf" +
      "\\Validate\\Conformance\\Harness\342\002,Buf\\Vali" +
      "date\\Conformance\\Harness\\GPBMetadata\352\002#B" +
      "uf::Validate::Conformance::Harnessb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          build.buf.validate.conformance.harness.HarnessProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_buf_validate_conformance_harness_ResultOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_buf_validate_conformance_harness_ResultOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_harness_ResultOptions_descriptor,
        new java.lang.String[] { "SuiteFilter", "CaseFilter", "Verbose", "Strict", "StrictMessage", "StrictError", });
    internal_static_buf_validate_conformance_harness_ResultSet_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_buf_validate_conformance_harness_ResultSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_harness_ResultSet_descriptor,
        new java.lang.String[] { "Successes", "Failures", "Suites", "Options", "ExpectedFailures", });
    internal_static_buf_validate_conformance_harness_SuiteResults_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_buf_validate_conformance_harness_SuiteResults_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_harness_SuiteResults_descriptor,
        new java.lang.String[] { "Name", "Successes", "Failures", "Cases", "Fdset", "ExpectedFailures", });
    internal_static_buf_validate_conformance_harness_CaseResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_buf_validate_conformance_harness_CaseResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_harness_CaseResult_descriptor,
        new java.lang.String[] { "Name", "Success", "Wanted", "Got", "Input", "ExpectedFailure", });
    descriptor.resolveAllFeaturesImmutable();
    build.buf.validate.conformance.harness.HarnessProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
