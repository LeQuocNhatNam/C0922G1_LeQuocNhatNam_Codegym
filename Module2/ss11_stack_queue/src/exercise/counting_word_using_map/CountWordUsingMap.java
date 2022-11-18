package exercise.counting_word_using_map;

import java.util.Scanner;
import java.util.TreeMap;

public class CountWordUsingMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your text: ");
        String str = input.nextLine().toLowerCase();
        String[] strings = str.split(" ");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < strings.length; i++) {
            Integer count = treeMap.get(strings[i]);
            if (count == null) {
                treeMap.put(strings[i], 1);
            } else {
                treeMap.put(strings[i],++count);
            }
        }
        System.out.println(treeMap);
    }
}
