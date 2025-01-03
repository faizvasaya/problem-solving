package com.leetcode.binarysearch;

// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class NumberOfRotationsOnASortedArray {

    public int findRotationCount(int[] nums) {
        return  findIndexOfSmallestElementInRotatedArray(nums);

    }

    public int findIndexOfSmallestElementInRotatedArray(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
