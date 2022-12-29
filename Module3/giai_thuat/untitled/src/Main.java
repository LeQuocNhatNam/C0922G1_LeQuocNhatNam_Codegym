import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        drawHourglass(10);
    }


    public static void drawHourglass(int n) {

        int number = n / 2;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < number; j++) {
                System.out.print("*");
            }
            for (int j = i; j < number; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}