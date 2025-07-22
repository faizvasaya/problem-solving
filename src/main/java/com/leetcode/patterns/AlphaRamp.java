package com.leetcode.patterns;

public class AlphaRamp {

    public void print(int n) {
        System.out.println(getClass().getName());

        char character = 'A';
        for (int idx = 0; idx < n; idx++) {
            for (int jdx = 0; jdx <= idx; jdx++) {
                System.out.print(character + " ");
            }
            character += 1;
            System.out.println();
        }
    }
}
