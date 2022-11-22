package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SettingSearchingAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the size of an array: ");
        int size = Integer.parseInt(input.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("please enter element " + (i + 1));
            arr[i] = Integer.parseInt(input.nextLine());
        }
        Arrays.sort(arr);
        int index = binarySearch(arr,0,size,3);
        if (index==-1) {
            System.out.println("not found");
        } else {
            System.out.println("is found at " + index);
        }
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (arr[middle] == value) {
                return middle;
            } else if (value > arr[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

}
