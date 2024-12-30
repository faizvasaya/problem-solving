package com.leetcode.sorting;

public class InsertionSort {

    public void sortAscending(int[] nums) {
        for (int outerIndex = 0; outerIndex < nums.length - 1; outerIndex++) {
            for (int innerIndex = outerIndex + 1; innerIndex > 0; innerIndex--) {
                if (nums[innerIndex - 1] > nums[innerIndex]) {
                    int temp = nums[innerIndex];
                    nums[innerIndex] = nums[innerIndex - 1];
                    nums[innerIndex - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
