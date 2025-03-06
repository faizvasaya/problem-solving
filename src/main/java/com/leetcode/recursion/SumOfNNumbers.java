package com.leetcode.recursion;

public class SumOfNNumbers {

    public int sum(int n) {

        if (n == 1 || n == 0) {
            return n;
        }

        return n + sum(n - 1);
    }
}
