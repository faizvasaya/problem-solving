package com.leetcode.maths;

public class ExtractAllDigits {

    public void extract(int n) {
        System.out.println(getClass().getName());
        if (n <= 0) {
            System.out.println(0);
        }

        while (n > 0) {
            System.out.println(n % 10);
            n = n / 10;
        }
    }
}
