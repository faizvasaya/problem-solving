package com.leetcode.recursion;

public class Factorial {

    public int calculate(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        return n * calculate(n - 1);
    }
}
