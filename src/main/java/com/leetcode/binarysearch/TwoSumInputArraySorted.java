package com.leetcode.binarysearch;

/**
 * 167. Two Sum II - Input Array Is Sorted
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 * 
 * Approach: 
 *          Assign start and end pointer to the first and the last element of the    *          array.
 *          Move the start pointer forward if the total of the start and the end
 *          pointer elements is less than the target.
 *          Move the end pointer backward if the total of the element at start and
 *          end pointer is greater than the total.
 *          Return the start + 1 and end + 1 is the total of element at
 *          start pointer and end pointer an is equal to the target.
 *          This two pointer solution is applicable because the array is sorted.
 */
public class TwoSumInputArraySorted {

    // Time complexity: O(N)
    public int[] findUsingBinarySearch(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int total = numbers[start] + numbers[end];
            if (total > target) {
                end = end - 1;
            } else if (total < target) {
                start = start + 1;
            } else {
                return new int[]{start + 1, end + 1};
            }
        }

        return new int[]{-1, -1};
    }
}
