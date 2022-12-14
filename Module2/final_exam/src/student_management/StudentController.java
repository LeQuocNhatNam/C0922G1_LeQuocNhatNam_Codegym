package student_management;

import java.util.Scanner;

public class StudentController {
    private static final Scanner input = new Scanner(System.in);
    private static final StudentService studentService = new StudentService();

    public static void displayMenu() {
        do {
            System.out.println("---------Student----------------");
            System.out.println("1. Add new student");
            System.out.println("2. Display student");
            System.out.println("3. Search student by name:");
            System.out.println("4. Exit");
            System.out.println("Please enter your choice");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Please enter student's information:");
                    System.out.println("enter id:");
                    String studentID = input.nextLine();
                    System.out.println("enter name:");
                    String studentName = input.nextLine();
                    System.out.println("enter phone number:");
                    String phoneNumber = input.nextLine();
                    System.out.println("enter date of birth:");
                    String dateOfBirth = input.nextLine();
                    System.out.println("enter class: ");
                    String className = input.nextLine();
                    Student student = new Student(studentID,studentName,phoneNumber,dateOfBirth,className);
                    studentService.addNewStudent(student);
                    break;
                case 2:
                    studentService.displayListStudents();
                    break;
                case 3:
                    System.out.println("please enter student's name");
                    String name = input.nextLine();
                    studentService.searchStudent(name);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid, please enter again");
            }
        } while (true);
    }
}
