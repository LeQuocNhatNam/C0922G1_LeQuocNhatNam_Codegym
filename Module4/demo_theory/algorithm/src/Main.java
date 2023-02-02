public class Main {
    public static void main(String[] args) {
        circleNum(9,13);
    }

    public static int circleNum(int l, int r) {
        int count = 0;
        for (int i = l; i < r; i++) {
            if (isCircle(i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isCircle(int n) {
        String string = n + "";
        for (int i = 0; i < string.length()/2; i++) {
            if (string.charAt(i)!=string.charAt(string.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}