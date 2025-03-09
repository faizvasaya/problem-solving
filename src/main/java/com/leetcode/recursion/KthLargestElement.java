package com.leetcode.recursion;

public class KthLargestElement {

    /**
     * Time Complexity: 
     *  Best case - O(N)
     *  Worst case - O(N^2)
     * Space Complexity: O(N)
     */
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, k, 0, nums.length - 1);
    }

    private int quickSelect(int[] nums, int k, int low, int high) {

        int start = low;
        int end = high;

        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while (start <= end) {
            while (nums[start] > pivot) {
                start++;
            }

            while (nums[end] < pivot) {
                end--;
            }

            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;

                start++;
                end--;
            }
        }

        if (k - 1 <= end) {
            return quickSelect(nums, k, low, end);
        } else if (k - 1 >= start) {
            return quickSelect(nums, k, start, high);
        } else {
            return nums[k - 1];
        }
    }
}
