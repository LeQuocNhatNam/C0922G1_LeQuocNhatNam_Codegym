package views;

import controllers.FuramaController;

import java.util.Scanner;

public class CustomerView {
    private static Scanner input = new Scanner(System.in);

    public static void displayCustomerMenu() {
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customers");
        System.out.println("3. Edit customers");
        System.out.println("4. Return main menu");
        int choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
        }
    }
}
