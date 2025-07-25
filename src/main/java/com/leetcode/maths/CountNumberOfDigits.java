package com.leetcode.maths;

public class CountNumberOfDigits {

    /**
     * Time Complexity: O(log10(n))
     */
    public int count(int n) {
        System.out.println(getClass().getName());

        if (n < 0) {
            n = -n;
        }

        int digitCount = 0;

        if (n == 0) {
            digitCount = 1;
        }

        while (n > 0) {
            digitCount++;
            n = n / 10;
        }

        return digitCount;
    }

    public int countUsingLog10(int n) {
        System.out.println(getClass().getName());

        if (n < 0) {
            n = -n;
        }

        return (int) Math.log10(n) + 1;
    }
}
