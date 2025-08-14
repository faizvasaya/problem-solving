package com.leetcode.sorting;

import java.util.Arrays;

public class SelectionSort {

    /**
     * Time Complexity: O(N^2)
     */
    public int[] sort(int[] arr) {

        if (arr.length <= 1) {
            return arr;
        }

        for (int idx = 0; idx < arr.length - 1; idx++) {
            int smallestIndex = idx;
            for (int jdx = idx + 1; jdx < arr.length; jdx++) {

                if (arr[jdx] < arr[smallestIndex]) {
                    smallestIndex = jdx;
                }
            }

            int temp = arr[idx];
            arr[idx] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }

        return arr;
    }
}
