package com.leetcode.stringoperations;

public class ShuffleString {

    // Time complexity: O(n)
    // Space complexity: O(n)
    public String restoreString(String str, int[] indices) {
        StringBuilder string = new StringBuilder();
        char[] c = new char[indices.length];

        for (int index = 0; index < indices.length; index++) {
            c[indices[index]] = str.charAt(index);
        }
        string.append(c);
        return string.toString();
    }

    public String restoreStringUsingCyclicSort(String str, int[] indices) {
        char[] c = str.toCharArray();
        int index = 0;
        while (index < indices.length) {
            int correctIndexOfItem = indices[index];
            if (index == correctIndexOfItem) {
                index++;
                continue;
            }

            char character = c[index];
            c[index] = c[correctIndexOfItem];
            c[correctIndexOfItem] = character;

            int number = indices[index];
            indices[index] = indices[correctIndexOfItem];
            indices[correctIndexOfItem] = number;
        }

        return new String(c);
    }
}
