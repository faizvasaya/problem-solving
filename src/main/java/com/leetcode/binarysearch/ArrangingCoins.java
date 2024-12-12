package com.leetcode.binarysearch;

/**
 * 441. Arranging Coins https://leetcode.com/problems/arranging-coins
 *
 * Approach: We need to search for the largest K <= N, that satisfies the
 * criteria of K * (K + 1) / 2, to find the highest number of possible rows
 */
public class ArrangingCoins {

    public long findUsingBinarySearch(int n) {
        long start = 0;
        long end = n;
        int result = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sumOfSeries = mid * (mid + 1) / 2;

            if (sumOfSeries == n) {
                return (int) mid;
            } else if (sumOfSeries > n) {
                end = mid - 1;
            } else if (sumOfSeries < n) {
                result = (int) mid;
                start = mid + 1;
            }
        }

        return result;
    }
}
