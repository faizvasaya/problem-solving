package com.leetcode.recursion;

public class Factorial {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int calculate(int n) {
        if (n == 1) {
            return n;
        }

        return n * calculate(n - 1);
    }
}
