import sun.nio.cs.CharsetMapping;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("()"));
        ;
    }

//    public static boolean solution(String s) {
//        char[] c = {'(','{','['};
//        char[] m = {')','}',']'};
//        for (int i = 0; i < s.length(); i+=2) {
//            for (int j = 0; j < 3 ; j++) {
//                if (s.charAt(i)=='(' && s.charAt(i+1) != ')'){
//                        return false;
//                }
//            }
//        }
//        return true;
////    }
//}


    public static boolean solution(String s) {
        char[] c = {'(', '{', '['};
        char[] m = {')', '}', ']'};
        for (int i = 0; i < s.length(); i += 2) {
            for (int j = 0; j < c.length; j++) {
                if (s.charAt(i) == c[j]) {
                    if (s.charAt(i + 1) != m[j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}