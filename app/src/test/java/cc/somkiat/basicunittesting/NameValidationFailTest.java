package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class NameValidationFailTest {

    @Test
    public void nameIsNull() {
        NameValidation validation = new NameValidation();
        ValidationResult result = validation.validateName("");
        assertFalse(result.getMessage(), result.isValidationValid());
    }

    @Test
    public void nameLengthNotInRangeTwoToTwenty() {
        NameValidation validation = new NameValidation();
        ValidationResult result = validation.validateName("m");
        assertFalse(result.getMessage(), result.isValidationValid());
    }

    @Test
    public void nameIsInCorrectPattern() {
        NameValidation validation = new NameValidation();
        ValidationResult result = validation.validateName("Mon ti ta");
        assertFalse(result.getMessage(), result.isValidationValid());
    }

}
