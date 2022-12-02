package controllers;

import java.util.Scanner;

public class FuramaController {
    private Scanner input = new Scanner(System.in);

    public FuramaController() {
    }

    public void displayMainMenu(){
        do {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    System.out.println("1. Display list employees");
                    System.out.println("2. Add new employees");
                    System.out.println("3. Delete employees");
                    System.out.println("4. Edit employees");
                    System.out.println("5. Return main menu");
                    break;
                case 2:
                    System.out.println("1. Display list customers");
                    System.out.println("2. Add new customers");
                    System.out.println("3. Edit customers");
                    System.out.println("4. Return main menu");
                    break;
                case 3:
                    System.out.println("1. Display list facility");
                    System.out.println("2. Add new facility");
                    System.out.println("3. Display facility maintenance");
                    System.out.println("4. Return main menu");
                    break;
                case 4:
                    System.out.println("1. Add new booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Return main menu");
                    break;
                case 5:
                    System.out.println("1. Display list customers using service");
                    System.out.println("2. Display list customers getting voucher");
                    System.out.println("3. Return main menu");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid! choose again!");

            }
        }while (true);

    }

}
