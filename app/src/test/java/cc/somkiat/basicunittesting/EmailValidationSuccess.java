package cc.somkiat.basicunittesting;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EmailValidationSuccess {
    @Test
    public void emailNotNull() {
        EmailValidation validation = new EmailValidation();
        boolean result = validation.isEmailEmpty("montita@mail.com");
        assertTrue("Email is NotEmpty", result);
    }

}
