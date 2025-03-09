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

    public void sortUsingRecursionInPlace(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        sortUsingRecursionInPlace(array, start, mid);

        sortUsingRecursionInPlace(array, mid + 1, end);

        mergeInPlace(array, start, mid, end);
    }

    private void mergeInPlace(int[] array, int start, int mid, int end) {
        int leftPointer = start;
        int rightPointer = mid + 1;

        while (leftPointer <= mid && rightPointer <= end) {
            if (array[leftPointer] <= array[rightPointer]) {
                leftPointer++;
            } else {
                int temp = array[rightPointer];
                int index = rightPointer;

                while (index > leftPointer) {
                    array[index] = array[index - 1];
                    index--;
                }
                
                array[leftPointer] = temp;

                leftPointer++;
                mid++;
                rightPointer++;
            }
        }
    }
}
