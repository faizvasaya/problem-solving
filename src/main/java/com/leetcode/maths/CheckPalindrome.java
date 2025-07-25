package com.leetcode.maths;

public class CheckPalindrome {

    public boolean check(int n) {
        System.out.println(getClass().getName());

        if (n == 0) {
            return true;
        }

        if (n < 0) {
            n = -n;
        }

        int reversedNumber = 0;
        int originalNumber = n;

        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
        }

        return originalNumber == reversedNumber;
    }
}
