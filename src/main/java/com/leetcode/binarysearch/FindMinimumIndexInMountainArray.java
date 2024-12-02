package com.leetcode.binarysearch;

// https://leetcode.com/problems/find-in-mountain-array/
public class FindMinimumIndexInMountainArray {

    public int findUsingBinarySearch(int[] mountainArray, int target) {
        int peakElementIndex = findPeakElement(mountainArray);
        int searchLeft = binarySearch(mountainArray, target, 0, peakElementIndex);

        if (searchLeft == -1) {
            int searchRight = binarySearch(mountainArray, target, peakElementIndex + 1, mountainArray.length - 1);
            return searchRight;
        }

        return searchLeft;
    }

    public int findPeakElement(int[] mountainArray) {
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

    public int binarySearch(int[] array, int target, int start, int end) {
        boolean isAscending = false;

        if (array[start] < array[end]) {
            isAscending = true;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == array[mid]) {
                return mid;
            }
            if (isAscending) {
                if (target > array[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;

    }
}
