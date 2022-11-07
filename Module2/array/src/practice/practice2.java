package practice;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the student's name: ");
        String nameStudent = input.nextLine();
        boolean exist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(nameStudent)) {
                System.out.println("Position of the student in the list " + nameStudent + " is: " + i);
                exist = true;
                break;
            }
        }
        if (!exist) {
            System.out.println("not found " + nameStudent + " in the list");
        }
    }
}


