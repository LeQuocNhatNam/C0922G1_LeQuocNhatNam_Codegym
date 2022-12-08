package views;

import controllers.*;

import java.util.Scanner;

public class FuramaView {
    private static Scanner input = new Scanner(System.in);

    public FuramaView() {
    }

    public static void displayMainMenu() {
        do {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e){
                    System.err.println(e.getMessage());
                    System.out.println("Enter a number");
                }
            }
            switch (choice) {
                case 1:
                    EmployeeView.displayEmployeeMenu();
                    break;
                case 2:
                    CustomerView.displayCustomerMenu();
                    break;
                case 3:
                    FacilityView.displayFacilityMenu();
                    break;
                case 4:
                    BookingView.displayBookingMenu();
                    break;
                case 5:
                    PromotionView.displayPromotionMenu();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid! choose again!");
            }
        } while (true);
    }
}
