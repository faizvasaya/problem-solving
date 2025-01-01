package com.leetcode.sorting;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 * 
 * Approach:
 * Merge the array and then use insertion sort to sort the array since the part of the array is already sorted.
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n < 1) {
            return;
        }

        if (m < 1) {
            System.arraycopy(nums2, 0, nums1, 0, nums1.length);
            return;
        }

        int nums2Index = 0;

        for (int index = nums1.length - n; index < nums1.length; index++) {
            nums1[index] = nums2[nums2Index];
            nums2Index++;
        }

        for (int outerIndex = 0; outerIndex < nums1.length - 1; outerIndex++) {
            for (int innerIndex = outerIndex + 1; innerIndex > 0; innerIndex--) {
                if (nums1[innerIndex - 1] > nums1[innerIndex]) {
                    int temp = nums1[innerIndex];
                    nums1[innerIndex] = nums1[innerIndex - 1];
                    nums1[innerIndex - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
