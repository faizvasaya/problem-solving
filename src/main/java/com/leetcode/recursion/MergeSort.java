package com.leetcode.recursion;

import java.util.Arrays;

public class MergeSort {

    // Dividing steps: O(Log N)
    // Merging back: O(N)
    // Overall time: O(N log N)
    public int[] sortUsingRecursion(int[] array) {
        if (array.length == 1) {
            return array;
        }

        int mid = array.length / 2;

        int[] left = sortUsingRecursion(Arrays.copyOfRange(array, 0, mid));

        System.out.println("Left" + Arrays.toString(left));

        int[] right = sortUsingRecursion(Arrays.copyOfRange(array, mid, array.length));

        System.out.println("Right" + Arrays.toString(right));

        int[] merged = merge(left, right);
        System.out.println("Merged: " + Arrays.toString(merged));

        return merged;
    }

    private int[] merge(int[] leftSortedArray, int[] rightSortedArray) {
        int leftPointer = 0;
        int rightPointer = 0;
        int[] mergedSortedArray = new int[leftSortedArray.length + rightSortedArray.length];
        int mergedArrayPointer = 0;

        while (leftPointer < leftSortedArray.length && rightPointer < rightSortedArray.length) {

            if (leftSortedArray[leftPointer] < rightSortedArray[rightPointer]) {
                mergedSortedArray[mergedArrayPointer] = leftSortedArray[leftPointer];
                leftPointer++;
            } else {
                mergedSortedArray[mergedArrayPointer] = rightSortedArray[rightPointer];
                rightPointer++;
            }
            mergedArrayPointer++;
        }

        // It may be possible that one of the arrays is not complete
        while (leftPointer < leftSortedArray.length) {
            mergedSortedArray[mergedArrayPointer] = leftSortedArray[leftPointer];
            leftPointer++;
            mergedArrayPointer++;
        }

        while (rightPointer < rightSortedArray.length) {
            mergedSortedArray[mergedArrayPointer] = rightSortedArray[rightPointer];
            rightPointer++;
            mergedArrayPointer++;
        }

        return mergedSortedArray;
    }
}
