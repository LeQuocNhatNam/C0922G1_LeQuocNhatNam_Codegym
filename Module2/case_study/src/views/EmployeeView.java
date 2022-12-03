package views;

import controllers.EmployeeController;
import models.person.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    employeeList = employeeController.getListEmployees();
                    for (Employee employee : employeeList) {
                        System.out.println(employee);
                    }
                    break;
                case 2:
                    Employee employee = getEmployeeFromUser();
                    employeeController.addEmployees(employee);
                    System.out.println("successful!");
                    break;
                case 3:
                    System.out.println("please enter employee ID:");
                    int employeeDeletedID = Integer.parseInt(input.nextLine());
                    employeeController.deleteEmployee(employeeDeletedID);
                    System.out.println("successful!");
                    break;
                case 4:
                    System.out.println("Please enter employee's id:");
                    int employeeEditedID = Integer.parseInt(input.nextLine());
                    boolean employeeExisted = employeeController.employeeExisted(employeeEditedID);
                    if (employeeExisted){
                        employeeController.deleteEmployee(employeeEditedID);
                        Employee newEmployee = getEmployeeFromUser();
                        employeeController.addEmployees(newEmployee);
                    }

                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice!, please choose again");
            }
        }while (true);

    }

    private static Employee getEmployeeFromUser() {
        System.out.println("Please enter employee's information:");
        System.out.println("Enter id");
        int employeeID = Integer.parseInt(input.nextLine());
        System.out.println("Enter name:");
        String name = input.nextLine();
        System.out.println("Enter date of birth");
        String dateOfBirth = input.nextLine();
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
        double salary = Double.parseDouble(input.nextLine());
        Employee employee = new Employee(name, dateOfBirth, gender, identification, phoneNumber,
                email, employeeID, level, position, salary);
        return employee;
    }
}
