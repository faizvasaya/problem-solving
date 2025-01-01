package com.leetcode.sorting;

/**
 * https://leetcode.com/problems/majority-element/
 *
 * Approach: Use insertion sort to sort the array first. And because majority
 * element appears n/2 times, it will be in the center of the sorted array.
 */
public class MajorityElement {

    public int findMajorityElement(int[] nums) {

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

        return nums[nums.length / 2];
    }
}
