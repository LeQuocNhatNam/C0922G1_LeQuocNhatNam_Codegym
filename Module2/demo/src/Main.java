import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if (i < 1) {
            System.out.println(i);
        } else
            System.out.println(i-1);
    }

}
