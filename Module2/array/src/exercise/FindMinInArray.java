package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = Integer.parseInt(input.nextLine());
        while (size <= 0) {
            System.out.print("Invalid! Please enter the size again: ");
            size = Integer.parseInt(input.nextLine());
        }
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter element " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("min: " + min);



    }
}
