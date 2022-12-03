package views;

import java.util.Scanner;

public class FacilityView {
    private static Scanner input = new Scanner(System.in);

    public static void displayFacilityMenu() {
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display facility maintenance");
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
