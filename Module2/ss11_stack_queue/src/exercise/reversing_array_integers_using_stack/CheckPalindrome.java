package exercise.reversing_array_integers_using_stack;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        String[] arrString = str.split("");

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        int size = arrString.length;
        for (int i = 0; i < size; i++) {
            stack.push(arrString[i].toLowerCase());
        }
        for (int i = 0; i < size; i++) {
            queue.add(arrString[i].toLowerCase());
        }
        boolean isPalindrome = false;
        for (int i = 0; i < size; i++) {
            if (stack.pop().equals(queue.remove())){
                isPalindrome = true;
            }
        }
        if (isPalindrome){
            System.out.println("Yes, it is.");
        } else System.out.println("No, it isn't.");
    }
}
