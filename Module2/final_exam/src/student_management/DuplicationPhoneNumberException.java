package student_management;

public class DuplicationPhoneNumberException extends Throwable {
    public DuplicationPhoneNumberException(String duplicated_phone_number) {
        super(duplicated_phone_number);
    }
}
