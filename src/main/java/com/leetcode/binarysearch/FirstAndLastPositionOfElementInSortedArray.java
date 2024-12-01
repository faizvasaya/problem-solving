package com.leetcode.binarysearch;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
public class FirstAndLastPositionOfElementInSortedArray {

    // Time complexity: O(N)
    public int[] findUsingBruteForce(int[] sortedArray, int target) {
        if (sortedArray.length == 0) {
            return new int[]{-1, -1};
        }

        int[] returnIndexes = new int[2];

        for (int index = 0; index < sortedArray.length; index++) {
            if (sortedArray[index] == target) {
                returnIndexes[0] = index;
                break;
            }
        }

        for (int index = sortedArray.length - 1; index >= 0; index--) {
            if (sortedArray[index] == target) {
                returnIndexes[1] = index;
                break;
            }
        }

        if (returnIndexes[0] > -1 && returnIndexes[1] > -1 && returnIndexes[0] != returnIndexes[1]) {
            return returnIndexes;
        }

        return new int[]{-1, -1};
    }

    // Time complexity: O(Log N)
    public int[] findUsingBinarySearch(int[] sortedArray, int target) {
        int[] returnIndexes = new int[]{-1, -1};

        if (sortedArray.length < 2) {
            return returnIndexes;
        }

        int start = 0;
        int end = sortedArray.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == sortedArray[mid]) {
                returnIndexes[0] = mid;
                end = mid - 1;
            } else if (target > sortedArray[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        start = 0;
        end = sortedArray.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == sortedArray[mid]) {
                returnIndexes[1] = mid;
                start = mid + 1;
            } else if (target > sortedArray[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (returnIndexes[0] > -1 && returnIndexes[1] > -1 && returnIndexes[0] != returnIndexes[1]) {
            return returnIndexes;
        }

        return new int[]{-1, -1};
    }
}
