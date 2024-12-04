package com.leetcode.binarysearch;

public class SearchingInA2DMatrix {

    // Time complexity: O(NxM)
    public int[] searchUsingBruteForce(int[][] twoDArray, int target) {
        for (int outerIndex = 0; outerIndex < twoDArray.length; outerIndex++) {
            for (int innerIndex = 0; innerIndex < twoDArray[outerIndex].length; innerIndex++) {
                if (twoDArray[outerIndex][innerIndex] == target) {
                    return new int[]{outerIndex, innerIndex};
                }
            }
        }

        return new int[]{-1, -1};
    }

    // Time complexity: O(N)
    public int[] searchUsingReducingSearchSpace(int[][] twoDSortedArray, int target) {

        if (twoDSortedArray == null || twoDSortedArray.length == 0 || twoDSortedArray[0].length == 0) {
            return new int[]{-1, -1};
        }

        int outerIndex = 0;
        int innerIndex = twoDSortedArray[outerIndex].length - 1;

        while (outerIndex < twoDSortedArray.length && innerIndex > -1) {
            if (twoDSortedArray[outerIndex][innerIndex] == target) {
                return new int[]{outerIndex, innerIndex};
            } else if (twoDSortedArray[outerIndex][innerIndex] > target) {
                innerIndex--;
            } else if (twoDSortedArray[outerIndex][innerIndex] < target) {
                outerIndex++;
            }
        }

        return new int[]{-1, -1};
    }
}
