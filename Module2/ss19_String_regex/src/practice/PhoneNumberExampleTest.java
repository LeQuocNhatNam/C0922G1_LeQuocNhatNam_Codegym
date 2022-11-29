package practice;

public class PhoneNumberExampleTest {
    public static final String[] validPhoneNumbers= {"09081111111","02222222222","0333333333"};
    public static final String[] inValidPhoneNumbers = {"34524423", "012354","ab123"};

    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
        for (String phoneNumber: validPhoneNumbers) {
            boolean isValid = phoneNumberExample.validate(phoneNumber);
            System.out.println("this " + phoneNumber + " is valid: " + isValid);
        }
        for (String phoneNumber: inValidPhoneNumbers){
            boolean isValid = phoneNumberExample.validate(phoneNumber);
            System.out.println("this " + phoneNumber + " is valid: " + isValid);
        }

    }
}
