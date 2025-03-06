package com.leetcode.recursion;

public class MultiplicationOfDigits {

    public int calculate(int n) {
        if (n % 10 == n) {
            return n;
        }

        return n % 10 * calculate(n / 10);
    }
}
