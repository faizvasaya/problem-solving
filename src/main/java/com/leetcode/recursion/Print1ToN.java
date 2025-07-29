package com.leetcode.recursion;

public class Print1ToN {

    public void print(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        print(++i, n);
    }

    public void printReverse(int i, int n) {
        if (i < n) {
            return;
        }
        System.out.println(i);
        printReverse(--i, n);
    }

    public void printWithBackTracking(int i, int n) {
        if (i < n) {
            return;
        }
        printWithBackTracking(i - 1, n);
        System.out.println(i);
    }

    public void printNTo1NWithBackTracking(int i, int n) {
        if (i > n) {
            return;
        }
        printNTo1NWithBackTracking(i + 1, n);
        System.out.println(i);
    }
}
