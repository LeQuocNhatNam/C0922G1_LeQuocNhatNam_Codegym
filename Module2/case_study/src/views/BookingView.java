package views;

import java.util.Scanner;

public class BookingView {
    private static Scanner input = new Scanner(System.in);

    public static void displayBookingMenu() {
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
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
