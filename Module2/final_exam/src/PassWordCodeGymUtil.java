import java.util.Scanner;

public class PassWordCodeGymUtil {

    private static final String PASSWORD_REGEX = ".*[A-Z]+.*";
    private static final String PASSWORD_REGEX1 = ".*@+.*";
    private static final String PASSWORD_REGEX2 = ".*[a-z]+.*";
    private static final String PASSWORD_REGEX3 = ".*\\d+.*";



    public static boolean isValidPassWord(String str) {
        return str.matches(PASSWORD_REGEX) && str.matches(PASSWORD_REGEX1) &&
                str.matches(PASSWORD_REGEX2) && str.matches(PASSWORD_REGEX3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password:");
        String password = input.nextLine();
        if (isValidPassWord(password)) {
            System.out.println("Valid password!");
        } else {
            System.out.println("Invalid password!");
        }
    }
}

