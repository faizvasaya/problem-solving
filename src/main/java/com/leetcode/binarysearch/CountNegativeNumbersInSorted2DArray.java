package com.leetcode.binarysearch;

/**
 * 1351. Count Negative Numbers in a Sorted Matrix
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
 *
 * Approach: Brute Force: Parse through each element in the m x n array and
 * increment the count if the element is less than 0.
 *
 */
public class CountNegativeNumbersInSorted2DArray {
    // Time Complexity: O(MxN)
    public int findUsingBruteForce(int[][] arr) {
        int countOfNegativeNumber = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < 0) {
                    countOfNegativeNumber++;
                }
            }
        }
        return countOfNegativeNumber;
    }
    // Time Complexity: O(M+N)
    public int findUsingTwoPointer(int[][] arr) {
        int row = 0;
        int col = arr[row].length - 1;
        int countOfNegativeNumbers = 0;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] >= 0) {
                row++;
            } else {
                countOfNegativeNumbers = countOfNegativeNumbers + (arr.length - row);
                col--;
            }
        }

        return countOfNegativeNumbers;
    }
}
