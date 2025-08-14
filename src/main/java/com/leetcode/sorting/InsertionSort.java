package com.leetcode.sorting;

public class InsertionSort {

    /**
     * Time Complexity - O(N^2)
     * Best Case - O(N)
     */
    public int[] sort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        for (int idx = 0; idx < arr.length; idx++) {
            int jdx = idx;
            while (jdx > 0 && arr[jdx - 1] > arr[jdx]) {
                int temp = arr[jdx];
                arr[jdx] = arr[jdx - 1];
                arr[jdx - 1] = temp;
                jdx--;
            }
        }

        return arr;
    }
}
