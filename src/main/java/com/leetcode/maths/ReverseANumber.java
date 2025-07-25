package com.leetcode.maths;

public class ReverseANumber {

    public int reverse(int n) {

        System.out.println(getClass().getName());

        if (n == 0) {
            return 0;
        }

        if (n < 0) {
            n = -n;
        }

        int reversedNumber = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
        }

        return reversedNumber;
    }
}
