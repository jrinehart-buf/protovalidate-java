// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/yet_another_package/embed2.proto
// Protobuf Java Version: 4.29.3

package build.buf.validate.conformance.cases.yet_another_package;

public final class Embed2Proto {
  private Embed2Proto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      Embed2Proto.class.getName());
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
    internal_static_buf_validate_conformance_cases_yet_another_package_Embed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_yet_another_package_Embed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?buf/validate/conformance/cases/yet_ano" +
      "ther_package/embed2.proto\0222buf.validate." +
      "conformance.cases.yet_another_package\032\033b" +
      "uf/validate/validate.proto\"b\n\005Embed\022\031\n\003v" +
      "al\030\001 \001(\003B\007\272H\004\"\002 \000R\003val\">\n\nEnumerated\022\032\n\026" +
      "ENUMERATED_UNSPECIFIED\020\000\022\024\n\020ENUMERATED_V" +
      "ALUE\020\001B\255\002\n8build.buf.validate.conformanc" +
      "e.cases.yet_another_packageB\013Embed2Proto" +
      "P\001\242\002\005BVCCY\252\0020Buf.Validate.Conformance.Ca" +
      "ses.YetAnotherPackage\312\0020Buf\\Validate\\Con" +
      "formance\\Cases\\YetAnotherPackage\342\002<Buf\\V" +
      "alidate\\Conformance\\Cases\\YetAnotherPack" +
      "age\\GPBMetadata\352\0024Buf::Validate::Conform" +
      "ance::Cases::YetAnotherPackageb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_buf_validate_conformance_cases_yet_another_package_Embed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_buf_validate_conformance_cases_yet_another_package_Embed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_yet_another_package_Embed_descriptor,
        new java.lang.String[] { "Val", });
    descriptor.resolveAllFeaturesImmutable();
    build.buf.validate.ValidateProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(build.buf.validate.ValidateProto.field);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
