package com.leetcode.recursion;

public class ReverseANumber {

    static int sum = 0;

    public static void reverse(int n) {

        if (n == 0) {
            return;
        }

        int reminder = n % 10;
        sum = sum * 10 + reminder;
        reverse(n / 10);
    }

    public int reverseInPlace(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }

        int rem = n % 10;
        return (rem * (int) Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}
