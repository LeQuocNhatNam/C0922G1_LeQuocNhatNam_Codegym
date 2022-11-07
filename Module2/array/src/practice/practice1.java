package practice;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = Integer.parseInt(input.nextLine());
            if (size>20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter element " + (i+1) + ": ");
            arr[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println("after reverse: ");
        System.out.println(Arrays.toString(arr));
    }
}
