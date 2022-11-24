import java.util.Scanner;

public class FibonacciAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter n: ");
        int number = Integer.parseInt(input.nextLine());
        System.out.println(getFibonacci(number));
    }

    public static int getFibonacci(int n) {
        if (n <= 0) {
            return -1;
        } else if (n <= 2) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
