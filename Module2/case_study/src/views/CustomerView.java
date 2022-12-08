package views;

import controllers.CustomerController;
import models.person.Customer;
import org.omg.CORBA.PRIVATE_MEMBER;
import services.impl.FacilityValidation;
import utils.AgeException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private final static Scanner input = new Scanner(System.in);
    private final static CustomerController customerController = new CustomerController();

    public static void displayCustomerMenu() {
        do {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customers");
            System.out.println("3. Edit customers");
            System.out.println("4. Return main menu");

            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println(e.getMessage());
                    System.out.println("Please enter a number again");
                }
            }
            switch (choice) {
                case 1:
                    List<Customer> customerList = customerController.getCustomerList();
                    if (customerList.size() == 0) {
                        System.out.println("Empty list");
                        break;
                    }
                    for (Customer customer : customerList) {
                        System.out.println(customer.toString());
                    }
                    break;
                case 2:
                    Customer customer = getCustomerFromUser();
                    customerController.addCustomer(customer);
                    break;
                case 3:
                    System.out.println("Please enter the customer's id:");
                    int customerEditedID = Integer.parseInt(input.nextLine());
                    if (customerController.customerExisted(customerEditedID)) {
                        System.out.println("what do you want to edit:");
                        System.out.println("1. Name");
                        System.out.println("2. Date of birth");
                        System.out.println("3. Gender");
                        System.out.println("4. Identification");
                        System.out.println("5. Phone Number");
                        System.out.println("6. Email");
                        System.out.println("7. customerType");
                        int editedChoice;
                        while (true) {
                            try {
                                editedChoice = Integer.parseInt(input.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.err.println(e.getMessage());
                                System.out.println("Please enter a number again:");
                            }
                        }
                        System.out.println("Please enter the new value:");
                        String newElementValue = input.nextLine();
                        customerController.editCustomer(customerEditedID, editedChoice, newElementValue);
                        break;
                    } else {
                        System.out.println("Customer's id not existed");
                        break;
                    }

                case 4:
                    return;
                default:
                    System.out.println("Invalid");
                    break;
            }
        } while (true);
    }


    private static Customer getCustomerFromUser() {
        System.out.println("Please enter customer's information");
        System.out.println("Enter name");
        String name = input.nextLine();
        int age;
        System.out.println("Enter date of birth");
        String dateOfBirth = input.nextLine();
        while (true) {
            while (!FacilityValidation.validateDateOfBirth(dateOfBirth)) {
                System.out.println("Enter again with format dd/mm/YYYY");
                dateOfBirth = input.nextLine();
            }
            LocalDate dob = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            age = calculateAge(dob);
            try {
                if (age < 18 || age > 100) {
                    throw new AgeException("unqualified age!");
                } else {
                    break;
                }
            } catch (AgeException ageException) {
                System.err.println(ageException.getMessage() + ", please enter again");
            }
        }

        System.out.println("Enter gender");
        String gender = input.nextLine();
        System.out.println("Enter identification");
        String identification = input.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = input.nextLine();
        System.out.println("Enter email");
        String email = input.nextLine();
        System.out.println("Enter customer ID");
        int customerID;
        while (true) {
            try {
                customerID = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println("Please enter a number again");
            }
        }
        System.out.println("Enter customer type: Diamond, Platinium, Gold, Silver, Member");
        String customerType = input.nextLine();
        return new Customer(name, dateOfBirth, gender, identification, phoneNumber, email,
                customerID, customerType);

    }

    public static int calculateAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();

        if (dob != null) {
            return Period.between(dob, curDate).getYears();
        } else {
            return 0;
        }
    }

}
