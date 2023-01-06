package com.codegym;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter a");
        int a = Integer.parseInt(input.nextLine());

        System.out.println("please enter b");
        int b = Integer.parseInt(input.nextLine());
        System.out.println("enter your choice" +
                "1. add" +
                "2. subtract" +
                "3. multiply" +
                "4. divide");
        String choice = input.nextLine();
        switch (choice) {
            case "1":
                System.out.println(sum(a,b));
                break;
            case "2":
                System.out.println(sub(a,b));
                break;
            case "3":
                System.out.println(mul(a,b));
                break;
            case "4":
                try {
                    System.out.println(div(a,b));
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("invalid!");
                break;
        }

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;

    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) throws NoSuchAlgorithmException {
        if (b == 0) {
            throw new NoSuchAlgorithmException();
        }
        return a / b;
    }
}
