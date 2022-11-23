package exercise;

public class InsertionSort {
    public static int[] arr = {2, 1, 4, 3, 5, 7};

    public static void insertionSort(int[] array) {
        int x, pos;

        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos-1]) {
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(arr);
        for (int element: arr) {
            System.out.println(element);
        }
    }
}
