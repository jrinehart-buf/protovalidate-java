// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/messages.proto
// Protobuf Java Version: 4.28.0

package build.buf.validate.conformance.cases;

public final class MessagesProto {
  private MessagesProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 0,
      /* suffix= */ "",
      MessagesProto.class.getName());
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
    internal_static_buf_validate_conformance_cases_TestMsg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_TestMsg_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_MessageNone_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_MessageNone_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_MessageNone_NoneMsg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_MessageNone_NoneMsg_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_MessageDisabled_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_MessageDisabled_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_MessageCrossPackage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_MessageCrossPackage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_MessageSkip_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_MessageSkip_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_MessageRequired_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_MessageRequired_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_MessageRequiredButOptional_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_MessageRequiredButOptional_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_MessageRequiredOneof_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_MessageRequiredOneof_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_MessageWith3dInside_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_MessageWith3dInside_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-buf/validate/conformance/cases/message" +
      "s.proto\022\036buf.validate.conformance.cases\032" +
      "8buf/validate/conformance/cases/other_pa" +
      "ckage/embed.proto\032\033buf/validate/validate" +
      ".proto\"l\n\007TestMsg\022 \n\005const\030\001 \001(\tB\n\272H\007r\005\n" +
      "\003fooR\005const\022?\n\006nested\030\002 \001(\0132\'.buf.valida" +
      "te.conformance.cases.TestMsgR\006nested\"_\n\013" +
      "MessageNone\022E\n\003val\030\001 \001(\01323.buf.validate." +
      "conformance.cases.MessageNone.NoneMsgR\003v" +
      "al\032\t\n\007NoneMsg\"3\n\017MessageDisabled\022\031\n\003val\030" +
      "\001 \001(\004B\007\272H\0042\002 {R\003val:\005\272H\002\010\001\"D\n\007Message\0229\n" +
      "\003val\030\001 \001(\0132\'.buf.validate.conformance.ca" +
      "ses.TestMsgR\003val\"\\\n\023MessageCrossPackage\022" +
      "E\n\003val\030\001 \001(\01323.buf.validate.conformance." +
      "cases.other_package.EmbedR\003val\"P\n\013Messag" +
      "eSkip\022A\n\003val\030\001 \001(\0132\'.buf.validate.confor" +
      "mance.cases.TestMsgB\006\272H\003\330\001\003R\003val\"T\n\017Mess" +
      "ageRequired\022A\n\003val\030\001 \001(\0132\'.buf.validate." +
      "conformance.cases.TestMsgB\006\272H\003\310\001\001R\003val\"l" +
      "\n\032MessageRequiredButOptional\022F\n\003val\030\001 \001(" +
      "\0132\'.buf.validate.conformance.cases.TestM" +
      "sgB\006\272H\003\310\001\001H\000R\003val\210\001\001B\006\n\004_val\"i\n\024MessageR" +
      "equiredOneof\022C\n\003val\030\001 \001(\0132\'.buf.validate" +
      ".conformance.cases.TestMsgB\006\272H\003\310\001\001H\000R\003va" +
      "lB\014\n\003one\022\005\272H\002\010\001\"\025\n\023MessageWith3dInsideB\321" +
      "\001\n$build.buf.validate.conformance.casesB" +
      "\rMessagesProtoP\001\242\002\004BVCC\252\002\036Buf.Validate.C" +
      "onformance.Cases\312\002\036Buf\\Validate\\Conforma" +
      "nce\\Cases\342\002*Buf\\Validate\\Conformance\\Cas" +
      "es\\GPBMetadata\352\002!Buf::Validate::Conforma" +
      "nce::Casesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          build.buf.validate.conformance.cases.other_package.EmbedProto.getDescriptor(),
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_buf_validate_conformance_cases_TestMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_buf_validate_conformance_cases_TestMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_TestMsg_descriptor,
        new java.lang.String[] { "Const", "Nested", });
    internal_static_buf_validate_conformance_cases_MessageNone_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_buf_validate_conformance_cases_MessageNone_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_MessageNone_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_MessageNone_NoneMsg_descriptor =
      internal_static_buf_validate_conformance_cases_MessageNone_descriptor.getNestedTypes().get(0);
    internal_static_buf_validate_conformance_cases_MessageNone_NoneMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_MessageNone_NoneMsg_descriptor,
        new java.lang.String[] { });
    internal_static_buf_validate_conformance_cases_MessageDisabled_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_buf_validate_conformance_cases_MessageDisabled_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_MessageDisabled_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_Message_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_buf_validate_conformance_cases_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_Message_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_MessageCrossPackage_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_buf_validate_conformance_cases_MessageCrossPackage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_MessageCrossPackage_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_MessageSkip_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_buf_validate_conformance_cases_MessageSkip_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_MessageSkip_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_MessageRequired_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_buf_validate_conformance_cases_MessageRequired_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_MessageRequired_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_MessageRequiredButOptional_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_buf_validate_conformance_cases_MessageRequiredButOptional_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_MessageRequiredButOptional_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_MessageRequiredOneof_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_buf_validate_conformance_cases_MessageRequiredOneof_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_MessageRequiredOneof_descriptor,
        new java.lang.String[] { "Val", "One", });
    internal_static_buf_validate_conformance_cases_MessageWith3dInside_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_buf_validate_conformance_cases_MessageWith3dInside_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_MessageWith3dInside_descriptor,
        new java.lang.String[] { });
    descriptor.resolveAllFeaturesImmutable();
    build.buf.validate.conformance.cases.other_package.EmbedProto.getDescriptor();
    build.buf.validate.ValidateProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(build.buf.validate.ValidateProto.field);
    registry.add(build.buf.validate.ValidateProto.message);
    registry.add(build.buf.validate.ValidateProto.oneof);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
