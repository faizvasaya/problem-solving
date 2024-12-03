package com.leetcode.binarysearch;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {

    public int findUsingBinarySearch(int[] nums, int target) {
        // Find the smallest element
        int pivotIndex = findPivot(nums);

        // Check if the target is on the left side of the pivot
        if (pivotIndex > 0 && nums[0] <= target && nums[pivotIndex - 1] >= target) {
            return binarySearch(nums, target, 0, pivotIndex - 1);
        }

        // Check if the target is on the right side of the pivot (including pivot)
        return binarySearch(nums, target, pivotIndex, nums.length - 1);
    }

    public int findPivot(int[] nums) {
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

    public int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
