import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation 'a * x + b =c', please enter constants:");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a: ");
        double a = Double.parseDouble(input.nextLine());
        System.out.print("Please enter b: ");
        double b = Double.parseDouble(input.nextLine());
        System.out.print("Please enter c: ");
        double c = Double.parseDouble(input.nextLine());

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!", answer);
        } else {
            if (b == c){
                System.out.print("Solution is all x");
            } else {
                System.out.println("No Solution");
            }
        }
    }
}