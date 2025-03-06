package com.leetcode.recursion;

public class FindFirstUpperCaseLetter {

    public char find(String s) {
        char[] c = s.toCharArray();

        int index = 0;

        while (index < c.length) {
            if (c[index] >= 65 && c[index] <= 90) {
                return c[index];
            }
            index++;
        }

        return 0;
    }

    public char findUsingRecursion(char[] c, int index) {

        if (index == c.length) {
            return 0;
        }

        if (c[index] >= 65 && c[index] <= 90) {
            return c[index];
        }

        return findUsingRecursion(c, index + 1);
    }
}
