import java.util.*;

public class Main {
    public static void main(String[] args) {
        solve();

    }

    //    public static boolean perfectArray(String s) {
//        String[] strings = s.split(" ");
//        int size = strings.length;
//        for (int i = 0; i < size ; i++) {
//            for (int j = size-1; j<=i ; j--) {
//                if (!strings[i].equals(strings[j])){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
    public static List<Integer> solve(List<List<Integer>> a) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(i).size(); j++) {
                if (isPrime(a.get(i).get(j))) {
                    if (!list.contains(a.get(i).get(j))) {
                        list.add(a.get(i).get(j));
                    }
                }
            }
        }
        Collections.sort(list);
        if (list.isEmpty()){
            list.add(-1);
            return list;
        }
        return list;

    }

    private static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
