package cc.somkiat.basicunittesting;


import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class EmailValidationFailTest {

    @Test
    public void emailIsNull() {
        EmailValidation validation = new EmailValidation();
        ValidationResult result = validation.validateEmail("");
        assertFalse(result.getMessage(), result.isValidationValid());
    }

    @Test
    public void userNameIsNull() {
        EmailValidation validation = new EmailValidation();
        ValidationResult result = validation.validateEmail("@mail.com");
        assertFalse(result.getMessage(), result.isValidationValid());

    }

    @Test
    public void emailAtSignIsNull() {
        EmailValidation validation = new EmailValidation();
        ValidationResult result = validation.validateEmail("montita.mail.com");
        assertFalse(result.getMessage(), result.isValidationValid());
    }

    @Test
    public void domainNameIsNull() {
        EmailValidation validation = new EmailValidation();
        ValidationResult result = validation.validateEmail("montita");
        assertFalse(result.getMessage(), result.isValidationValid());
    }

    @Test
    public void emailIsInCorrectPattern() {
        EmailValidation validation = new EmailValidation();
        ValidationResult result = validation.validateEmail("m+o\n-t=i]t[a@m-a=i{l.co,m");
        assertFalse(result.getMessage(), result.isValidationValid());
    }


}
