package cc.somkiat.basicunittesting;


import java.util.regex.Pattern;

class EmailValidation {

    boolean isEmailEmpty(String email){
        return !email.isEmpty();
    }
    boolean isEmailCorrect(String email){
        String emailPattern = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";
        return Pattern.matches(emailPattern,email);

    }
}
