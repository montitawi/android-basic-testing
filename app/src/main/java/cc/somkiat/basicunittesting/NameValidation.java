package cc.somkiat.basicunittesting;

import java.util.regex.Pattern;

class NameValidation {

    ValidationResult validateName(String name) {

        try {
            isEmpty(name);
            isNameLengthBetweenTwoToTwenty(name);
            isNamePatternCorrect(name);
        } catch (ValidationException e) {
            return new ValidationResult(false, e.getMessage());
        }

        return new ValidationResult(true, "Validate Success");


    }

    private void isEmpty(String name) throws ValidationException {
        if (name.isEmpty()) {
            throw new ValidationException("Name is Empty !");
        }
    }

    private void isNameLengthBetweenTwoToTwenty(String name) throws ValidationException {
        if (name.length() <= 2 || name.length() >= 20) {
            throw new ValidationException("Name is Short or Long");
        }
    }

    private void isNamePatternCorrect(String name) throws ValidationException {
        String namePattern = "[A-Za-z]+ ?[A-Za-z]+";
        if (!Pattern.matches(namePattern, name)) {
            throw new ValidationException("Name is incorrect !");
        }

    }



}
