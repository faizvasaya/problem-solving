package com.leetcode.patterns;

public class CompleteTriangle {

    public void print(int n) {
        System.out.println(getClass().getName());

        for (int i = 0; i < 2 * n - 1; i++) {
            if (i < n) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            if (i >= n) {
                for (int j = 0; j < 2 * n - i - 1; j++) {
                    System.out.print("* ");
                }
            }
            System.err.println("");
        }
    }
}
