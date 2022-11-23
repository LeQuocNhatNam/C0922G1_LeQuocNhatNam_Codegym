package exercise.reversing_array_integers_using_stack;

import java.util.Stack;

public class ReversingArrayIntegers {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        System.out.println("original stack: " + stack);
//        Stack<Integer> newStack = new Stack<>();
//        int size = stack.size();
//        for (int i = 0; i < size; i++) {
//            newStack.push(stack.pop());
//        }
//        System.out.println("after reversing: " + newStack);
//
        Stack<String> stack = new Stack<>();
        String str = "CodeGym introduces a new building";
        String[] arrStr = str.split(" ");
        for (int i = 0; i < arrStr.length; i++) {
            stack.push(arrStr[i]);
        }
        int size = stack.size();
        String result = "";
        for (int i = 0; i < size; i++) {
            result += stack.pop() + " ";
        }
        System.out.println("after reversing: " + result);
    }
}
