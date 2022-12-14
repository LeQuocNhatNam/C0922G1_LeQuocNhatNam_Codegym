public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = {9, 3, 5, 2, 8, 4, 15};
        System.out.println("result is: " + averageOddEven(arr) );
    }

    public static int averageOddEven(int[] arr) {
        float sumEven = 0;
        float sumOdd = 0;
        int numberOfEven = 0;
        int numberOfOdd = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
                numberOfEven++;
            } else {
                sumOdd += arr[i];
                numberOfOdd++;
            }
        }
        return Math.round(sumEven/numberOfEven) - Math.round(sumOdd/numberOfOdd);
    }
}