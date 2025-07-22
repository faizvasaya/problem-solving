package com.leetcode.patterns;

public class BinaryNumberTriangle {

    public void print(int n) {
        System.out.println(getClass().getName());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println();
        }
    }

    public void printUsingFlipLogic(int n) {
        System.out.println(getClass().getName());
        int startDigit = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                startDigit = 1;
            } else {
                startDigit = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(startDigit + " ");
                startDigit = 1 - startDigit;
            }
            System.out.println();
        }
    }
}
