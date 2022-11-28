package exercise.controller;

import exercise.model.Service;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Add a product\n" +
                    "2. Display products\n" +
                    "3. Search product by id\n" +
                    "4. Exit menu\n" +
                    "please select your choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("please enter the product's information");
                    System.out.print("Enter id:");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.print("Enter name:");
                    String name = input.nextLine();
                    System.out.print("Enter brand:");
                    String brand = input.nextLine();
                    System.out.print("Enter price");
                    int price = Integer.parseInt(input.nextLine());
                    System.out.print("Enter a description: ");
                    String description = input.nextLine();
                    Service.addProduct(id, name, brand, price, description);
                    break;
                case 2:
                    Service.displayProduct();
                    break;
                case 3:
                    System.out.print("Please enter id: ");
                    int idProduct = Integer.parseInt(input.nextLine());
                    Service.searchProduct(idProduct);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (true);
    }
}
