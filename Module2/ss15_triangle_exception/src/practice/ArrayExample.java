package practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("list of elements: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " \n");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a random index: ");
        int index = Integer.parseInt(input.nextLine());
        try {
            System.out.println("value at index " + index + "=" + arr[index]);
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("Index out of bound - index out of bound");
        }
        catch (Exception e) {
            System.err.println("Index out of bound - exception");
        }
        System.out.println("End game");
    }
}
