package exercise.validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String PHONE_NUMBER_REGEX = "\\d{2}(-0){1}\\d{9}";
    public ValidatePhoneNumber() {

    }

    public static boolean validatePhoneNumber(String regex){
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
