package views;

import controllers.EmployeeController;
import models.person.Employee;
import services.impl.FacilityValidation;
import utils.AgeException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static views.CustomerView.calculateAge;

public class EmployeeView {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    private static EmployeeController employeeController = new EmployeeController();

    public static void displayEmployeeMenu() {
        do {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Delete employees");
            System.out.println("4. Edit employees");
            System.out.println("5. Return main menu");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(input.nextLine());
                    break;
                }catch (NumberFormatException e){
                    System.err.println(e.getMessage());
                    System.out.println("Enter a number again");
                }

            }
            switch (choice) {
                case 1:
                    employeeList = employeeController.getListEmployees();
                    if (employeeList.isEmpty()) {
                        System.out.println("nothing in the list");
                        break;
                    }
                    for (Employee employee : employeeList) {
                        System.out.println(employee);
                    }
                    break;
                case 2:
                    Employee employee = getEmployeeFromUser();
                    employeeController.addEmployees(employee);
                    break;
                case 3:
                    System.out.println("please enter employee ID:");
                    int employeeDeletedID = Integer.parseInt(input.nextLine());
                    employeeController.deleteEmployee(employeeDeletedID);
                    break;
                case 4:
                    System.out.println("Please enter employee's id:");
                    int employeeEditedID = Integer.parseInt(input.nextLine());
                    boolean employeeExisted = employeeController.employeeExisted(employeeEditedID);
                    if (employeeExisted) {
                        System.out.println("What do you want to edit: ");
                        int editedChoice = displayEditChoice();
                        editEmployeeElements(editedChoice, employeeEditedID);
                    } else System.out.println("id not existed");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice!, please choose again");
            }
        } while (true);

    }

    private static void editEmployeeElements(int editedChoice, int employeeEditedId) {
        switch (editedChoice) {
            case 1:
                System.out.println("Enter new name");
                String newName = input.nextLine();
                employeeController.setEmployeeName(employeeEditedId, newName);
                System.out.println("Successful!");
                break;
            case 2:
                System.out.println("Enter new date of birth");
                String newDateOfBirth = input.nextLine();
                employeeController.setDateOfBirth(employeeEditedId, newDateOfBirth);
                System.out.println("Successful!");
                break;
            case 3:
                System.out.println("Enter new gender");
                String newGender = input.nextLine();
                employeeController.setEmployeeGender(employeeEditedId, newGender);
                System.out.println("Successful!");
                break;
            case 4:
                System.out.println("Enter new identification");
                String newIdentification = input.nextLine();
                employeeController.setEmployeeIdentification(employeeEditedId, newIdentification);
                System.out.println("Successful!");
                break;
            case 5:
                System.out.println("Enter new phone number:");
                String newPhoneNumber = input.nextLine();
                employeeController.setEmployeePhoneNumber(employeeEditedId, newPhoneNumber);
                System.out.println("Successful!");
                break;
            case 6:
                System.out.println("Enter new email");
                String newEmail = input.nextLine();
                employeeController.setEmployeeEmail(employeeEditedId, newEmail);
                System.out.println("successful");
                break;
            case 7:
                System.out.println("enter new level:");
                String newLevel = input.nextLine();
                employeeController.setEmployeeLevel(employeeEditedId, newLevel);
                System.out.println("Successful!");
                break;
            case 8:
                System.out.println("Enter new position:");
                String newPosition = input.nextLine();
                employeeController.setEmployeePosition(employeeEditedId, newPosition);
                System.out.println("Successful!");
                break;
            case 9:
                System.out.println("Enter new Salary");
                double newSalary = Double.parseDouble(input.nextLine());
                employeeController.setEmployeeSalary(employeeEditedId, newSalary);
                System.out.println("Successful!");
                break;
            default:
                System.out.println("Invalid choice!");

        }
    }

    private static int displayEditChoice() {
        System.out.println("1. name");
        System.out.println("2. Date of birth");
        System.out.println("3. Gender");
        System.out.println("4. Identification");
        System.out.println("5. Phone number");
        System.out.println("6. Email");
        System.out.println("7. Level");
        System.out.println("8. Position");
        System.out.println("9. Salary");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println("Please enter again a number");
            }
        }
        return choice;
    }


    private static Employee getEmployeeFromUser() {
        System.out.println("Please enter employee's information:");
        int employeeID;
        while (true) {
            try {
                System.out.println("Enter id");
                employeeID = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Enter a number");
            }
        }
        System.out.println("Enter name:");
        String name = input.nextLine();
        System.out.println("Enter date of birth");
        String dateOfBirth = input.nextLine();
        int age;
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
        System.out.println("Enter gender:");
        String gender = input.nextLine();
        System.out.println("Enter identification");
        String identification = input.nextLine();
        System.out.println("Enter phone number:");
        String phoneNumber = input.nextLine();
        System.out.println("Enter Email:");
        String email = input.nextLine();
        System.out.println("Enter level: Technical school/college/university/post-university");
        String level = input.nextLine();
        System.out.println("Enter position: Receptionist/Server/Expert/Supervisor/Manager/Director");
        String position = input.nextLine();
        System.out.println("Enter salary");
        double salary;
        while (true) {
            try {
                salary = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println("Please enter again a number: ");
            }
        }
        Employee employee = new Employee(name, dateOfBirth, gender, identification, phoneNumber,
                email, employeeID, level, position, salary);
        return employee;
    }
}
