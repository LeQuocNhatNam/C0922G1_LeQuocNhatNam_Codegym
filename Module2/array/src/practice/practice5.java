package practice;

public class practice5 {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = getIndexOfMinValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

    public static int getIndexOfMinValue(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
