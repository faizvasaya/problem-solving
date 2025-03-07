package com.leetcode.recursion;

public class BinarySearchInRotatedArray {

    // Time complexity: O(Log N)
    // Space complexity: O(Log N)
    public int findPosition(int[] array, int start, int end, int target) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (array[mid] == target) {
            return mid + 1;
        }

        if (array[start] <= array[mid]) {
            if (target >= array[start] && target <= array[mid]) {
                return findPosition(array, start, mid - 1, target);
            } else {
                return findPosition(array, mid + 1, end, target);
            }
        }

        if (target >= array[mid] && target <= array[end]) {
            return findPosition(array, mid + 1, end, target);
        }

        return findPosition(array, start, mid - 1, target);
    }
}
