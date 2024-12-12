package com.leetcode.binarysearch;

/**
 * 35. Search Insert Position
 * https://leetcode.com/problems/search-insert-position Approach: Use binary
 * search and return the mid if exact * value is found else return start.
 */
public class SearchInsertPosition {

    public int findUsingBinarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }

        return start;
    }
}
