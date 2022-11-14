package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class GetSumOfDiagonalMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int size = Integer.parseInt(input.nextLine());
        int[][] squareMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter row " + (i + 1));
            for (int j = 0; j < size; j++) {
                System.out.print("enter element " + (j + 1) + ": ");
                squareMatrix[i][j] = Integer.parseInt(input.nextLine());
            }
        }
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                squareMatrix[i][j] = Math.round((float) Math.random() * 100);
//            }
//        }
        System.out.println(Arrays.deepToString(squareMatrix));
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += squareMatrix[i][i];
        }
        System.out.println("sum of major diagonal elements: " + sum);
    }
}
