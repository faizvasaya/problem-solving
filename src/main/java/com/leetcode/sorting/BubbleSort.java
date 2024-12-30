package com.leetcode.sorting;

import java.util.Arrays;

public class BubbleSort {

    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    public void sortAscending(int[] nums) {
        for (int outerIndex = 0; outerIndex < nums.length - 1; outerIndex++) {
            boolean isSwaped = false;
            for (int innerIndex = 1; innerIndex < nums.length - outerIndex; innerIndex++) {
                if (nums[innerIndex - 1] > nums[innerIndex]) {
                    int temp = nums[innerIndex - 1];
                    nums[innerIndex - 1] = nums[innerIndex];
                    nums[innerIndex] = temp;

                    isSwaped = true;
                }
            }

            if (!isSwaped) {
                break;
            }
        }
    }
}
