package com.leetcode.binarysearch;

public class CellingOfANumber {

    // Time complexity : O(log N)
    public int findCellingInAscendingOrderedArray(int[] sortedArray, int target) {

        if (sortedArray.length == 0) {
            return Integer.MAX_VALUE;
        }

        if (target > sortedArray[sortedArray.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = sortedArray.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > sortedArray[mid]) {
                start = mid + 1;
            } else if (target < sortedArray[mid]) {
                end = mid - 1;
            } else {
                return sortedArray[mid];
            }
        }

        return sortedArray[start];
    }

    // Time complexity : O(log N)
    public int findFloorInAscendingOrderedArray(int[] sortedArray, int target) {

        if (sortedArray.length == 0) {
            return Integer.MAX_VALUE;
        }

        if (target < sortedArray[0]) {
            return -1;
        }

        int start = 0;
        int end = sortedArray.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > sortedArray[mid]) {
                start = mid + 1;
            } else if (target < sortedArray[mid]) {
                end = mid - 1;
            } else {
                return sortedArray[mid];
            }
        }
        
        return sortedArray[end];
    }
}
