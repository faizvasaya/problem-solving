package com.leetcode.binarysearch;

// https://leetcode.com/problems/find-peak-element/description/
public class FindPeakElement {

    // Time complexity: O(Log N)
    public int findUsingBinarySearch(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[mid + 1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
