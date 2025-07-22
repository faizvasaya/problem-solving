package com.leetcode.patterns;

public class ReverseLetterTriangle {

    public void print(int n) {
        System.out.println(getClass().getName());

        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A' + (n - i - 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
