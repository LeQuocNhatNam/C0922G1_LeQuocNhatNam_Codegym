import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer to check: ");
        int n = Integer.parseInt(input.nextLine());
        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        }
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else
            System.out.println(n + " is not a prime number.");
    }
}
