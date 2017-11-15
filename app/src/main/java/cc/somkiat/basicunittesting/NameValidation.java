package cc.somkiat.basicunittesting;

import java.util.regex.Pattern;

class NameValidation {

    String[] nameErrors = new String[]{"Empty", "Null"};

    public int validate(String name) {
        return 1;
    }

    boolean isEmpty(String name) {
        return !name.isEmpty();
    }

    boolean isNameLengthBetweenTwoToTwenty(String name){
        return (name.length() > 1 && name.length() <= 20);
    }

    boolean isNameCollect(String name){
        String namePattern = "[A-Za-z]+ ?[A-Za-z]+";
        return Pattern.matches(namePattern,name);

    }


}
