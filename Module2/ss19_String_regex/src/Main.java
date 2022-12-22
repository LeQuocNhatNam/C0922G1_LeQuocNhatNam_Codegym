import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,2,8,43},{9,4,53,7},{11,6,4,0},{1,2,6,51}};
        System.out.println(Arrays.toString(getPrimeArraySorted(arr)));
    }

    public static int[] getPrimeArraySorted(int[][] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (isPrime(arr[i][j])) {
                    list.add(arr[i][j]);
                }
            }
        }
        Collections.sort(list);
        int[] newArr = new int[list.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = list.get(i);
        }
        return newArr;
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}