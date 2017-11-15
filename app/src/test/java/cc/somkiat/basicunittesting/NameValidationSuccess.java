package cc.somkiat.basicunittesting;


import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class NameValidationSuccess {

    @Test
    public void nameNotNull() {
        NameValidation validation = new NameValidation();
        boolean result = validation.isEmpty("Montita");
        assertTrue("Name is NotEmpty !", result);
    }


}
