package com.leetcode.sorting;

public class SelectionSort {

    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    public void sortAscending(int[] nums) {
        for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) {
            int maxIndex = 0;
            for (int innerIndex = 1; innerIndex < nums.length - outerIndex; innerIndex++) {
                if (nums[innerIndex] > nums[maxIndex]) {
                    maxIndex = innerIndex;
                }
            }

            int temp = nums[nums.length - 1 - outerIndex];
            nums[nums.length - 1 - outerIndex] = nums[maxIndex];
            nums[maxIndex] = temp;
        }
    }
}
