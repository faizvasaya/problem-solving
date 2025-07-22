package com.leetcode.patterns;

public class AlphaTriangle {

    public void print(int n) {
        System.out.println(getClass().getName());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + n - 1 - j) + " ");
            }
            System.out.println();
        }
    }
}
