package exercise.validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {

    private static final String CLASS_NAME_REGEX = "[C,A,P]\\d{4}[G-M]{1}";

    public ValidateClassName() {
    }

    public boolean validateClassName(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
