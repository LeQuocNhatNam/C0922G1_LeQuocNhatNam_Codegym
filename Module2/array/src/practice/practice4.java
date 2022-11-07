package practice;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter fahrenheit: ");
                    fahrenheit = Double.parseDouble(input.nextLine());
                    System.out.println("Celsius is: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    celsius = Double.parseDouble(input.nextLine());
                    System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 3:
                    System.exit(0);
            }
        } while (true);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
