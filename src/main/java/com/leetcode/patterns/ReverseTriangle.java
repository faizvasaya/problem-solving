package com.leetcode.patterns;

public class ReverseTriangle {

    public void print(int n) {
        System.out.println(getClass().getName());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.err.print("* ");
            }
            System.err.println("");
        }
    }
}
