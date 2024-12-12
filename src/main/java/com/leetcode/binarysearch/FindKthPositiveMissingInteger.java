package com.leetcode.binarysearch;

/**
 * 1539. Kth Missing Positive Number
 * https://leetcode.com/problems/kth-missing-positive-number/
 *
 * Approach: Brute Force: Increment a counter for every missing number. Once the
 * counter reaches the limit return the current number.
 *
 * Binary Search: To get the total number of missing elements up to a number,
 * use the formula arr[i] - (i+1). If the total number of missing elements up to
 * mid * are less than the required number of missing elements then search on
 * the right side else, search on the left.
 */
public class FindKthPositiveMissingInteger {

    // Time complexity: O(n)
    public int findUsingBruteForce(int[] arr, int k) {
        int index = 0;
        int current = 1;
        int missingCount = 0;

        while (true) {
            if (index < arr.length && arr[index] == current) {
                index++;
            } else {
                missingCount++;
                if (missingCount == k) {
                    return current;
                }
            }
            current++;
        }
    }

    public int findUsingBinarySearch(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int missingCount = arr[mid] - (mid + 1);

            if (missingCount < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end + k + 1;
    }
}
