package com.leetcode.patterns;

public class Symmetry {

    public void print(int n) {
        System.out.println(getClass().getName());

        // Make N to 2 * N - 1
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 0; i--) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
