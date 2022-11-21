package exercise;

import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimalNumber = 17;
        Stack<Integer> stack = new Stack<>();

        while (decimalNumber != 0) {
            stack.push(decimalNumber % 2);
            decimalNumber /= 2;
        }
        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            System.out.print(stack.pop() + " ");
        }
    }

}
