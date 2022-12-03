package views;

import java.util.Scanner;

public class PromotionView {
    private static Scanner input = new Scanner(System.in);

    public static void displayPromotionMenu() {
        System.out.println("1. Display list customers using service");
        System.out.println("2. Display list customers getting voucher");
        System.out.println("3. Return main menu");
        int choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:

        }
    }
}
