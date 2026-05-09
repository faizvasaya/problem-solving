package com.leetcode.search;

public class FirstAndLastPosition {

    /**
     * TC: O(N)
     */
    public int[] searchRangeUsingBruteForce(int[] nums, int target) {
        int first = -1;
        int last = -1;
        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] == target && first == -1) {
                first = idx;
            }
            if (nums[idx] == target && first != -1) {
                last = idx;
            }

            if (first != -1 && last != -1 && nums[idx] > target) {
                break;
            }
        }
        return new int[]{first, last};
    }

    /**
     * TC: O(Log N)
     */
    public int[] searchRangeUsingBinarySearch(int[] nums, int target) {
        int[] results = new int[2];
        results[0] = findUsingBinarySearch(nums, target, true);
        results[1] = findUsingBinarySearch(nums, target, false);

        return results;
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
