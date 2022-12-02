package exercise.validate_phone_number;

public class ValidatePhoneNumberTest {
    public static void main(String[] args) {
        boolean isValid;
//        isValid = ValidatePhoneNumber.validatePhoneNumber("84-0978489648");
//        System.out.println(isValid);
//        isValid = ValidatePhoneNumber.validatePhoneNumber("08-0978489648");
//        System.out.println(isValid);
//        isValid = ValidatePhoneNumber.validatePhoneNumber("08-0000000000");
//        System.out.println(isValid);
//        isValid = ValidatePhoneNumber.validatePhoneNumber("a8-0978489648");
//        System.out.println(isValid);
//        isValid = ValidatePhoneNumber.validatePhoneNumber("84-1978489648");
//        System.out.println(isValid);
//        isValid = ValidatePhoneNumber.validatePhoneNumber("84-097848964");
//        System.out.println(isValid);
        isValid = ValidatePhoneNumber.validatePhoneNumber("(84)-(0978489648)");
        System.out.println(isValid);
    }
}
