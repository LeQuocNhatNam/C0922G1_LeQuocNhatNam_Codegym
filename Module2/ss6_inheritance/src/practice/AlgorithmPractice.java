package practice;

import java.util.Arrays;

public class AlgorithmPractice {
    public static void main(String[] args) {
        int [] arr = {8,7,2,5,3,1};
        int x = 9;

        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] + arr[j] == x) {
                    int[] sumArr = new int[2];
                    sumArr[0] = arr[i];
                    sumArr[1] = arr[j];
                    System.out.println(Arrays.toString(sumArr));
                    break;
                }
            }
        }
    }
}
