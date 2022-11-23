package practice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortBySteps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the list size: ");
        int size = Integer.parseInt(input.nextLine());
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values");
        for (int i = 0; i < size; i++) {
            list[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Your input list");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");
        }
        bubbleSortByStep(list);

    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("list after " + k + "th sort: ");
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + "\t");
            }
            System.out.println();
        }
    }
}
