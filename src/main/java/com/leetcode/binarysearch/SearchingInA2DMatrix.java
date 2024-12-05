package com.leetcode.binarysearch;
// https://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/

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
    public int[] searchUsingReducingSearchSpaceInRowColumnSortedMatrix(int[][] twoDSortedArray, int target) {

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

    // https://leetcode.com/problems/search-a-2d-matrix
    // Time complexity: O(O(log(M) + O(nog(N))
    public boolean searchUsingReducingSearchSpaceInRowSortedMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = this.identifyRow(matrix, target);

        if (row == -1) {
            return false;
        }

        return this.binarySearch(matrix[row], target);
    }

    // https://leetcode.com/problems/search-a-2d-matrix
    // Time Complexity: 
    public boolean searchInRowSortedMatrixUsingMathematicalMapping(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Mapping to a 1D array
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) {
                return true;
            } else if (midValue > target) {
                end = mid - 1;
            } else if (midValue < target) {
                start = mid + 1;
            }
        }

        return false;
    }

    private boolean binarySearch(int[] array, int target) {

        int start = 0;
        int end = array.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return true;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else if (array[mid] < target) {
                start = mid + 1;
            }
        }

        return false;
    }

    private int identifyRow(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;

        // Identify the possible row where the target could be.
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target >= matrix[mid][0] && target <= matrix[mid][matrix[mid].length - 1]) {
                // row found
                return mid;
            } else if (matrix[mid][0] > target) {
                end = mid - 1;
            } else if (matrix[mid][0] < target) {
                start = mid + 1;
            }
        }

        return -1;
    }
}
