package com.leetcode.binarysearch;

public class FindTargetInAnInfiniteArray {

    // Time Complexity: O(Log N)
    public int findUsingBinarySearch(int[] sortedArray, int target) {
        // Step 1: Exponentially find the range where the target may be
        int start = 0;
        int end = 1;

        // Exponentially search for the range where the target could be
        while (true) {
            try {
                // If the target is within the current range, break the loop
                if (sortedArray[end] >= target) {
                    break;
                }
                // Double the range
                start = end + 1;
                end = end * 2; // Expanding range exponentially
            } catch (ArrayIndexOutOfBoundsException e) {
                // If the 'end' index goes out of bounds, adjust it to the last valid index
                end = sortedArray.length - 1;
                break;
            }
        }

        // Step 2: Perform binary search within the identified range
        return binarySearch(sortedArray, target, start, end);
    }

    // Binary Search for finding target within a range [start, end]
    private int binarySearch(int[] sortedArray, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (sortedArray[mid] == target) {
                return mid;
            } else if (sortedArray[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;  // Target not found
    }
}
