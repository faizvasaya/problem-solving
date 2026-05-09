package com.leetcode.search;

public class BinarySearch {

    /**
     * TC: O(log N)
     * SC: O(N)
     */
    public int searchUsingIteration(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    /**
     * TC: O(log N)
     * SC: O(log N)
     */
    public int searchUsingNLogN(int[] nums, int target) {
        return performBinarySearch(nums, 0, nums.length - 1, target);
    }

    private int performBinarySearch(int[] nums, int low, int high, int target) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return performBinarySearch(nums, low, mid - 1, target);
        } else {
            return performBinarySearch(nums, mid + 1, high, target);
        }
    }
}
