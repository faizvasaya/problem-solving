package com.leetcode.search;

public class LowerBound {

    /**
     * TC: O(N)
     */
    public int findUsingBruteForce(int[] arr, int target) {

        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] >= target) {
                return idx;
            }
        }

        return arr.length;
    }

    /**
     * TC: O(Log N)
     */
    public int findUsingBinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
