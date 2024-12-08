package com.leetcode.binarysearch;

/**
 * 367. Valid Perfect Square
 * https://leetcode.com/problems/valid-perfect-square
 * 
 * Approach:
 *          We can use binary search since the integers are sorted.
 *          It will help us keep reducing the search space into half
 *          as we reach near the range.
 */
public class FindPerfectSquare {

    // Time complexity : O(n/2)
    public boolean isPerfectSquareUsingBruteForce(int num) {
        if (num == 0 || num == 1) {
            return true;
        }

        int currentNumber = 2;

        while (currentNumber <= num / 2) {
            if (currentNumber * currentNumber  == num) {
                return true;
            }
            currentNumber++;
        }

        return false;
    }

    // Time complexity : O(log N)
    public boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1) {
            return true;
        }

        int start = 0;
        int end = num / 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long midSquare = (long) mid * mid;

            if (midSquare == num) {
                return true;
            } else if (num > midSquare) {
                start = mid + 1;
            } else if (num < midSquare) {
                end = mid - 1;
            }
        }

        return false;
    }
}
