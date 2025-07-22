package com.leetcode.patterns;

public class NumberTriangle {

    public void print(int n) {
        System.out.println(getClass().getName());
        int currentNumber = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                currentNumber += 1;
                System.out.print(currentNumber + " ");
            }
            System.out.println();
        }
    }
}
