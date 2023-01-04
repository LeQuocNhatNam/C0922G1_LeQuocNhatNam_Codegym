package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] parent = {1, 4, 5, 2, 3};
        int[] child = {1, 2, 3};
    }

    public int solution(int[] parent, int[] child) {
        int count = 0;
        int[] child1 = new int[child.length];
        for (int i = 0; i < child.length; i++) {
            for (int j = 0; j < parent.length; j++) {
                if (parent[j] == child[i]) {
                    count++;
                }
            }
            child1[i] = count;
        }
        return findMin(child1);

    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}

