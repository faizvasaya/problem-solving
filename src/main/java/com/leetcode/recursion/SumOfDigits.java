package com.leetcode.recursion;

public class SumOfDigits {

    public int sum(int n) {
        if (n == 0) {
            return n;
        }

        return n % 10 + sum(n / 10);
    }
}
