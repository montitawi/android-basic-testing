package cc.somkiat.basicunittesting;



class ValidationResult {
    private boolean isValidationValid;
    private String message;

    ValidationResult(boolean isValidationValid, String message) {
        this.isValidationValid = isValidationValid;
        this.message = message;
    }

    boolean isValidationValid() {
        return isValidationValid;
    }

    String getMessage() {
        return message;
    }

}
