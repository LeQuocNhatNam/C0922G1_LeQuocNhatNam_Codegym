import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double rate = 23000;
        Scanner input = new Scanner(System.in);
        System.out.println("enter USD amount:");
        double usd = Double.parseDouble(input.next());
        double vnd = usd * rate;
        System.out.println("VND = " + vnd );
    }
}