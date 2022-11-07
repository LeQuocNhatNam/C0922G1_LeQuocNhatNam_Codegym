package practice;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        int size;

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = Integer.parseInt(input.nextLine());
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Please enter element " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("array list is: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i]>max) {
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println();
        System.out.println("The largest property value in the list is " + max + " at position " + index);
    }
}
