package exercise.demoNesoAcademy;

import java.util.Scanner;

public class arrayRectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rectangle[] rectangles = new Rectangle[3];
        double width,height;
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Do you want to enter the width and the height? (Y/N)");
            char choice = input.next().charAt(0);
            if (choice == 'Y') {
                System.out.println("Please enter the width");
                width = Double.parseDouble(input.next());
                System.out.println("Please enter the height:");
                height = Double.parseDouble(input.next());

                rectangles[i] = new Rectangle(width, height);
            } else
                rectangles[i] = new Rectangle();
        }

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Rectangle: width:" + rectangles[i].getWidth()
                                + " height: " + rectangles[i].getHeight() + " Area: " + rectangles[i].getArea());

        }
    }

}
