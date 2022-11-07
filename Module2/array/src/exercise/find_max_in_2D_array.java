package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class find_max_in_2D_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the row and column for matrix: ");
        int row = Integer.parseInt(input.nextLine());
        int column = Integer.parseInt(input.nextLine());
        double[][] matrix = new double[row][column];
        for (int i = 0; i < row; i++) {
            System.out.println("Please enter the elements for the row " + (i + 1));
            for (int j = 0; j < column; j++) {
                System.out.print("element " + (j + 1) + ": ");
                matrix[i][j] = Double.parseDouble(input.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(matrix));


        double max = matrix[0][0];
        int indexX = 0;
        int indexY = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    indexX = i;
                    indexY = j;
                }
            }
        }
        System.out.println("max: " + max);
        System.out.println("position: (" + indexX + "," + indexY + ")");
    }
}
