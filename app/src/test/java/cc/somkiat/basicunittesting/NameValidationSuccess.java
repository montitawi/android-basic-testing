package cc.somkiat.basicunittesting;


import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class NameValidationSuccess {

    @Test
    public void nameNotNull() {
        NameValidation validation = new NameValidation();
        ValidationResult result = validation.validateName("Montita");
        assertTrue(result.getMessage(), result.isValidationValid());
    }

    @Test
    public void nameLengthInRangeTwoToTwenty() {
        NameValidation validation = new NameValidation();
        ValidationResult result = validation.validateName("Montita");
        assertTrue(result.getMessage(), result.isValidationValid());
    }

    @Test
    public void nameIsCorrectPattern() {
        NameValidation validation = new NameValidation();
        ValidationResult result = validation.validateName("Montita Wichianchai");
        assertTrue(result.getMessage(), result.isValidationValid());
    }


}
