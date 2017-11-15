package cc.somkiat.basicunittesting;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EmailValidationSuccess {
    @Test
    public void emailNotNull() {
        EmailValidation validation = new EmailValidation();
        ValidationResult result = validation.validateEmail("montita@mail.com");
        assertTrue(result.getMessage(), result.isValidationValid());
    }
    @Test
    public void emailIsInCorrectPattern(){
        EmailValidation validation = new EmailValidation();
        ValidationResult result = validation.validateEmail("montita@mail.com");
        assertTrue(result.getMessage(),result.isValidationValid());
    }

}
