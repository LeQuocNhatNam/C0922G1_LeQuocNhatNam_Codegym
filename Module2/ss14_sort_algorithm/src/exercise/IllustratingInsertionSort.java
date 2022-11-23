package exercise;

public class IllustratingInsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,5,1,4};

        insertionSort(arr);

    }
    public static void insertionSort(int[] array){
        int x, pos;

        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos-1]) {
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
            System.out.println("after the " + i + "th sort");
            for (int element: array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
