import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        int arr[] = {7, 5, 3, 9, 5, 1, 10, 9, 4, 9};
        System.out.println(Arrays.toString(removeDuplicateElement(arr)));

    }

    public static int[] removeDuplicateElement(int[] arr) {
        int size = arr.length;
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(arr[i]);
        }
        Iterator<Integer> iterator = set.iterator();
        int[] newArr = new int[set.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = iterator.next();
        }
        return newArr;
    }

//    public static int[] removeDuplicateElement2(int[] arr) {
//        int size = arr.length;
//        int count = 0;
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < size; i++) {
//            list.add(arr[i]);
//        }
//        for (int i = 0; i < size; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if (arr[i] == arr[j]) {
//                    list.remove(j);
//
//                }
//            }
//        }
//    }
}


