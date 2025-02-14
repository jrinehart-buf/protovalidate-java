// Copyright 2023-2024 Buf Technologies, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package build.buf.protovalidate;

import static org.assertj.core.api.Assertions.assertThat;

import build.buf.validate.FieldConstraints;
import build.buf.validate.FieldPath;
import build.buf.validate.Violation;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * This test verifies that custom (CEL-based) field and/or message constraints evaluate as expected.
 */
public class ValidatorCelExpressionTest {
  @Test
  public void testRepeatedStringFieldCelExpression() throws Exception {
    // Create a valid message ("one", "two")
    com.example.imports.validationtest.ExampleCelExpressionRepeatedUniqueStrings validMsg =
        com.example.imports.validationtest.ExampleCelExpressionRepeatedUniqueStrings.newBuilder()
            .addAllShouldBeUnique(Arrays.asList("one", "two"))
            .build();

    // Create an invalid message ("one", "one")
    com.example.imports.validationtest.ExampleCelExpressionRepeatedUniqueStrings invalidMsg =
        com.example.imports.validationtest.ExampleCelExpressionRepeatedUniqueStrings.newBuilder()
            .addAllShouldBeUnique(Arrays.asList("one", "one"))
            .build();

    // Build a model of the expected violation
    Violation expectedViolation =
        Violation.newBuilder()
            .setField(
                FieldPath.newBuilder()
                    .addElements(
                        FieldPathUtils.fieldPathElement(
                            invalidMsg.getDescriptorForType().findFieldByName("should_be_unique"))))
            .setRule(
                FieldPath.newBuilder()
                    .addElements(
                        FieldPathUtils.fieldPathElement(
                                FieldConstraints.getDescriptor()
                                    .findFieldByNumber(FieldConstraints.CEL_FIELD_NUMBER))
                            .toBuilder()
                            .setIndex(0)
                            .build()))
            .setConstraintId("unique.strings")
            .setMessage("all string values should be unique")
            .build();

    Validator validator = new Validator();

    // Valid message checks
    ValidationResult validResult = validator.validate(validMsg);
    assertThat(validResult.isSuccess()).isTrue();

    // Invalid message checks
    ValidationResult invalidResult = validator.validate(invalidMsg);
    assertThat(invalidResult.isSuccess()).isFalse();
    assertThat(invalidResult.toProto().getViolationsList()).containsExactly(expectedViolation);
  }

  @Test
  public void testRepeatedNestedFieldCelExpression() throws Exception {
    // Nested message wrapping the string "one"
    com.example.imports.validationtest.ExampleNestedStringMessage one =
        com.example.imports.validationtest.ExampleNestedStringMessage.newBuilder()
            .setStringValue("one")
            .build();

    // Nested message wrapping the string "two"
    com.example.imports.validationtest.ExampleNestedStringMessage two =
        com.example.imports.validationtest.ExampleNestedStringMessage.newBuilder()
            .setStringValue("two")
            .build();

    // Create a valid message ("one", "two")
    com.example.imports.validationtest.ExampleCelExpressionRepeatedNestedMessage validMsg =
        com.example.imports.validationtest.ExampleCelExpressionRepeatedNestedMessage.newBuilder()
            .addAllShouldBeUnique(Arrays.asList(one, two))
            .build();

    // Create an invalid message ("one", "one")
    com.example.imports.validationtest.ExampleCelExpressionRepeatedNestedMessage invalidMsg =
        com.example.imports.validationtest.ExampleCelExpressionRepeatedNestedMessage.newBuilder()
            .addAllShouldBeUnique(Arrays.asList(one, one))
            .build();

    // Build a model of the expected violation
    Violation expectedViolation =
        Violation.newBuilder()
            .setField(
                FieldPath.newBuilder()
                    .addElements(
                        FieldPathUtils.fieldPathElement(
                            invalidMsg.getDescriptorForType().findFieldByName("should_be_unique"))))
            .setRule(
                FieldPath.newBuilder()
                    .addElements(
                        FieldPathUtils.fieldPathElement(
                                FieldConstraints.getDescriptor()
                                    .findFieldByNumber(FieldConstraints.CEL_FIELD_NUMBER))
                            .toBuilder()
                            .setIndex(0)
                            .build()))
            .setConstraintId("unique.message.string_values")
            .setMessage("all nested message string_value values should be unique")
            .build();

    Validator validator = new Validator();

    // Valid message checks
    ValidationResult validResult = validator.validate(validMsg);
    assertThat(validResult.isSuccess()).isTrue();

    // Invalid message checks
    ValidationResult invalidResult = validator.validate(invalidMsg);
    assertThat(invalidResult.isSuccess()).isFalse();
    assertThat(invalidResult.toProto().getViolationsList()).containsExactly(expectedViolation);
  }
}
