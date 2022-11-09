package exercise.quadraticEquation;

import exercise.quadraticEquation.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a:");
        double a = Double.parseDouble(input.nextLine());
        while (a == 0) {
            System.out.println("invalid! Please enter a again:");
            a = Double.parseDouble(input.nextLine());
        }
        System.out.print("Please enter b:");
        double b = Double.parseDouble(input.nextLine());
        System.out.print("Please enter c:");
        double c = Double.parseDouble(input.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        System.out.println("delta = " + quadraticEquation.getDiscriminant());
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("2 roots: " + quadraticEquation.getRoot1() + ", " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("just 1 root: " + quadraticEquation.getRoot1());
        } else
            System.out.println("the equation has no root.");
    }

}
