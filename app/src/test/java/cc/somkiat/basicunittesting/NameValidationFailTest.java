package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class NameValidationFailTest {

    @Test
    public void nameIsNull() {
        NameValidation validation = new NameValidation();
        boolean result = validation.isEmpty("");
        assertFalse("Name is Empty !", result);
    }

}
