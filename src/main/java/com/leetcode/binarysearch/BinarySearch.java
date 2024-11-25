package com.leetcode.binarysearch;

public class BinarySearch {

    // Time complexity: O(log N)
    public int searchInAscendingOrderedArray(int[] sortedArray, int target) {
        if (sortedArray.length == 0) {
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
                return mid;
            }
        }

        return -1;
    }

    // Time complexity: O(log N)
    public int searchInDescendingOrderedArray(int[] sortedArray, int target) {
        if (sortedArray.length == 0) {
            return -1;
        }

        int start = 0;
        int end = sortedArray.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > sortedArray[mid]) {
                end = mid - 1;
            } else if (target < sortedArray[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    // Time complexity: O(log N)
    public int searchIArrayOrderAgnostic(int[] sortedArray, int target) {
        if (sortedArray.length == 0) {
            return -1;
        }

        // 0 for Ascending and 1 for Descending
        int orderType;

        int start = 0;
        int end = sortedArray.length - 1;

        if (sortedArray[start] > sortedArray[end]) {
            orderType = 1;
        } else {
            orderType = 0;

        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (target == sortedArray[mid]) {
                return mid;
            }

            if (orderType == 1) {
                if (target > sortedArray[mid]) {
                    end = mid - 1;
                } else if (target < sortedArray[mid]) {
                    start = mid + 1;
                }
            } else if (orderType == 0) {
                if (target > sortedArray[mid]) {
                    start = mid + 1;
                } else if (target < sortedArray[mid]) {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
