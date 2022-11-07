package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class concatenate_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the first array: ");
        int size1 = Integer.parseInt(input.nextLine());
        int[] arr1 = new int[size1];

        for (int i = 0; i < size1; i++) {
            System.out.print("please enter element" + (i + 1) + ": ");
            arr1[i] = Integer.parseInt(input.nextLine());
        }
        System.out.print("Enter the size for the second array: ");
        int size2 = Integer.parseInt(input.nextLine());
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("please enter element " + (i + 1) + ": ");
            arr2[i] = Integer.parseInt(input.nextLine());
        }
        int[] arrSum = new int[size1 + size2];
        for (int i = 0; i < arr1.length; i++) {
            arrSum[i] = arr1[i];
        }
        for (int i = arr1.length; i < arrSum.length; i++) {
            arrSum[i] = arr2[i - arr1.length];
        }
        System.out.println("Concatenated array is: " + Arrays.toString(arrSum));
    }
}
