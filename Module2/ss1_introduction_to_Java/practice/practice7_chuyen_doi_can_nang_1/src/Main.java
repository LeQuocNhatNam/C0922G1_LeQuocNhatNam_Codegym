import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kilogram): ");
        weight = Double.parseDouble(input.nextLine());
        System.out.print("Your height (in meter): ");
        height = Double.parseDouble(input.nextLine());

        bmi = weight / Math.pow(height, 2);

        if (bmi < 18) {
            System.out.print("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}