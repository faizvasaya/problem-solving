package com.leetcode.patterns;

public class AlphaHill {

    public void print(int n) {
        System.out.println(getClass().getName());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            char character = 'A';
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(character + " ");
                if (j > i - 1) {
                    character -= 1;
                } else {
                    character += 1;
                }
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
