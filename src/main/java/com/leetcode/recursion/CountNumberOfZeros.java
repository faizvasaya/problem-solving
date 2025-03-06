package com.leetcode.recursion;

public class CountNumberOfZeros {

    public int count(int n) {
        int count = 0;

        if (n == 0) {
            return 1;
        }

        if (n < 10) {
            return 0;
        }

        while (n / 10 != 0) {
            if (n % 10 == 0) {
                count++;
            }

            n = n / 10;
        }

        return count;
    }

    public int countRecursive(int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 10) {
            return 0;
        }

        return (n % 10 == 0 ? 1 : 0) + countRecursive(n / 10);
    }
}
