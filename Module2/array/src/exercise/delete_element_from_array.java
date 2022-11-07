package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class delete_element_from_array {
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,6,0,0,0,0};
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = Integer.parseInt(input.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                for (int j = i; j < arr.length -1 ; j++) {
                    arr[j] = arr[j+1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
