package cc.somkiat.basicunittesting;


import java.util.regex.Pattern;

class EmailValidation {

    ValidationResult validateEmail(String email) {

        try {
            isEmailEmpty(email);
            isEmailPatternCorrect(email);
        } catch (ValidationException e) {
            return new ValidationResult(false, e.getMessage());
        }

        return new ValidationResult(true, "Validate Success");

    }


    private void isEmailEmpty(String email) throws ValidationException {
        if (email.isEmpty()) {
            throw new ValidationException("Email is Empty !");
        }

    }

    private void isEmailPatternCorrect(String email) throws ValidationException {
        String emailPattern = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";

        if (!Pattern.matches(emailPattern, email)) {
            throw new ValidationException("Email is incorrect !");
        }

    }


}
