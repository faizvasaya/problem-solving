package com.leetcode.maths;

public class ArmstrongNumber {

    public boolean isArmstrong(int n) {
        System.out.println(getClass().getName());

        if (n == 0) {
            return true;
        }

        if (n < 0) {
            n = -n;
        }

        int originalNumber = n;
        int cubeAddition = 0;
        while (n > 0) {
            int digit = n % 10;
            cubeAddition = (int) (cubeAddition + Math.pow(digit, 3));
            n = n / 10;
        }

        System.out.println(cubeAddition);

        return cubeAddition == originalNumber;
    }
}
