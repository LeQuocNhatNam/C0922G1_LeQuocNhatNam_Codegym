import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        money = Double.parseDouble(input.next());
        System.out.print("Enter number of months: ");
        month = Integer.parseInt(input.next());
        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = Double.parseDouble(input.next());
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12;
            money += totalInterest;
        }

        System.out.println("total of interest: " + totalInterest);
        System.out.println("money received: " + money);
    }
}