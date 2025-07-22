package com.leetcode.patterns;

public class SamSymmetry {

    public void print(int n) {
        System.out.println(getClass().getName());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < (2 * n) - (2 * i); j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void print2(int n) {
        int spaces = (2 * n) - 2;
        int lines = (2 * n) - 1;
        System.out.println(getClass().getName());

        for (int i = 0; i < lines; i++) {
            if (i < n) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }

                for (int j = 0; j < spaces; j++) {
                    System.out.print("  ");
                }

                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < (2 * n) - i - 1; j++) {
                    System.out.print("* ");
                }

                for (int j = 0; j < spaces; j++) {
                    System.out.print("  ");
                }

                for (int j = 0; j < (2 * n) - i - 1; j++) {
                    System.out.print("* ");
                }
            }

            if (i >= n - 1) {
                spaces += 2;
            } else {
                spaces -= 2;
            }

            System.out.println();
        }
    }
}
