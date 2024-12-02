package com.leetcode.binarysearch;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class FindPeakOfAMountainArray {

    // Time Complexity: O(N)
    public int findUsingBruteForce(int[] mountainArray) {
        int index = 0;
        while (mountainArray[index] < mountainArray[index + 1]) {
            index++;
        }
        return index;
    }

    // Time Complexity: O(Log N)
    public int findUsingBinarySearch(int[] mountainArray) {
        int start = 0;
        int end = mountainArray.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArray[mid] > mountainArray[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
