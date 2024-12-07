package com.leetcode.binarysearch;

// https://leetcode.com/problems/guess-number-higher-or-lower/description/
/**
 * Approach:
 *          This problem is solved using binary search.
 *          If guess returns -1, then we search on left side of the search space.
 *          If guess returns 1, then we search on the right side of the search space.
 *          If guess returns 0, then we return mid
 */
public class GuessTheNumber {

    private int guess(int num, int pick) {
        if (num == pick) {
            return 0;
        } else if (num > pick) {
            return -1;
        } else {
            return 1;
        }
    }

    // Time Complexity: O(N)
    public int findUsingBruteForce(int n, int pick) {
        int currentNumber = 1;
        while (currentNumber <= n) {
            if (this.guess(currentNumber, pick) == 0) {
                return currentNumber;
            }
            currentNumber++;
        }

        return -1;
    }

    // Time Complexity: O(log n)
    public int findUsingBinarySearch(int n, int pick) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (this.guess(mid, pick) == -1) {
                end = mid - 1;
            } else if (this.guess(mid, pick) == 1) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
