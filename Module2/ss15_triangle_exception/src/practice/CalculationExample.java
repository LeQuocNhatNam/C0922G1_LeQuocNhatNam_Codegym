package practice;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter y:");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
    }

    public void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Sum=" + a);
            System.out.println("deduction a-b=" + b);
            System.out.println("Multiplication=" + c);
            System.out.println("Division=" + d);
        } catch (Exception e) {
            System.err.println("Excepted: " + e.getMessage());
        }
    }
}
