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

    @Test
    public void nameLengthInRangeTwoToTwenty() {
        NameValidation validation = new NameValidation();
        boolean result = validation.isNameLengthBetweenTwoToTwenty("Montita");
        assertTrue("Name is OK !", result);
    }

    @Test
    public void nameIsCorrectPattern() {
        NameValidation validation = new NameValidation();
        boolean result = validation.isNameCollect("Montita Wichianchai");
        assertTrue("Name is correct Pattern !", result);
    }


}
