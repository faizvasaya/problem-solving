package com.leetcode.patterns;

public class ReverseNumberTriangle {

    public void print(int n) {
        System.out.println(getClass().getName());

        for (int idx = 0; idx < n; idx++) {
            for (int jdx = 0; jdx < n - idx; jdx++) {
                System.out.print(jdx + 1 + " ");
            }
            System.out.println();
        }
    }
}
