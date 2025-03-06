package com.leetcode.recursion;

public class NumberOfStepsToReduceANumberToZero {

    public int countSteps(int num) {
        int count = 0;
        while (num > 0) {
            count++;

            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
        }

        return count;
    }

    // Time complexity O(Log N)
    public int countStepsRecursive(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 2 == 0) {
            return 1 + countStepsRecursive(num / 2);
        } else {
            return 1 + countStepsRecursive(num - 1);
        }
    }
}
