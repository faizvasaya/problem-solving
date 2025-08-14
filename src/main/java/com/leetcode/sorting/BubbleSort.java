package com.leetcode.sorting;

public class BubbleSort {

    /**
     * TC - O(N^2)
     * Best case - O(N) when the array is sorted
     */
    public int[] sort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        for (int idx = 0; idx < arr.length; idx++) {
            int isSwapped = 0;
            for (int jdx = 0; jdx < arr.length - idx - 1; jdx++) {
                if (arr[jdx] > arr[jdx + 1]) {

                    int temp = arr[jdx];
                    arr[jdx] = arr[jdx + 1];
                    arr[jdx + 1] = temp;

                    isSwapped = 1;
                }
            }
            if (isSwapped == 0) {
                break;
            }
        }

        return arr;
    }
}
