package com.leetcode.patterns;

public class NumberCrown {

    public void print(int n) {
        System.out.println(getClass().getName());
        int spaces = 2 * (n - 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + 1 + " ");
            }
            spaces -= 2;
            System.out.println();
        }
    }
}
