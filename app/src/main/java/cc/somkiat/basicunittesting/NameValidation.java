package cc.somkiat.basicunittesting;

import java.util.regex.Pattern;

class NameValidation {

    ValidationResult validateName(String name) {

        try {
            isEmpty(name);
            isNameLengthMoreThanTwo(name);
            isNameLengthLessThanTwenty(name);
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

    private void isNameLengthMoreThanTwo(String name) throws ValidationException {
        if (name.length() <= 2) {
            throw new ValidationException("Name is Short !");
        }
    }

    private void isNameLengthLessThanTwenty(String name) throws ValidationException {
        if (name.length() >= 20) {
            throw new ValidationException("Name is long !");
        }
    }

    private void isNamePatternCorrect(String name) throws ValidationException {
        String namePattern = "[A-Za-z]+ ?[A-Za-z]+";
        if (!Pattern.matches(namePattern, name)) {
            throw new ValidationException("Name is incorrect !");
        }

    }



}
