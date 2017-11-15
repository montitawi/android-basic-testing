package cc.somkiat.basicunittesting;


import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class EmailValidationFailTest {

    @Test
    public void emailIsNull() {
        EmailValidation validation = new EmailValidation();
        boolean result = validation.isEmailEmpty("");
        assertFalse("Email is Empty !", result);
    }

    @Test
    public void userNameIsNull() {
        EmailValidation validation = new EmailValidation();
        boolean result = validation.isEmailCorrect("@mail.com");
        assertFalse("Email is Username Empty !", result);

    }


}
