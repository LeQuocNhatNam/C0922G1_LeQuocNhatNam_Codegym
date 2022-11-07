package exercise;

public class count_character_in_string {
    public static void main(String[] args) {
        String str = "abccaba";
        char cha = 'c';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (cha == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("'" + cha + "'" + " appears " + count + " times");
    }
}
