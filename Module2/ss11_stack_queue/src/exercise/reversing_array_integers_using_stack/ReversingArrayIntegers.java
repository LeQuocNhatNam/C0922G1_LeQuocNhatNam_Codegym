package exercise.reversing_array_integers_using_stack;

import java.util.Stack;

public class ReversingArrayIntegers {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("original stack: " + stack);
        for (int i = 0; i < stack.size(); i++) {
            stack.push(stack.pop());
        }
        System.out.println("after reversing: " + stack);
    }
}
