package com.leetcode.search;

public class NumberOfOccurrence {

    public int countUsingBinarySearch(int[] arr, int target) {
        int[] results = new int[2];
        results[0] = findUsingBinarySearch(arr, target, true);
        results[1] = findUsingBinarySearch(arr, target, false);

        if (results[0] != -1) {
            return results[1] - results[0] + 1;
        }

        return 0;
    }

    private int findUsingBinarySearch(int[] nums, int target, boolean findFirstOccurrence) {
        int result = -1;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                result = mid;
                if (findFirstOccurrence) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return result;
    }
}
