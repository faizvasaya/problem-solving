package com.leetcode.recursion;

public class Fibonacci {

    public int fibo(int n) {

        if (n < 2) {
            return n;
        }

        return this.fibo(n - 1) + this.fibo(n - 2);
    }
}
