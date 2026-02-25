package com.leetcode.arrayproblems;

import com.leetcode.sorting.QuickSort;

public class FindLargestElementInArray {

    /*
     * TC: O(N log N)
     * SC: O(1)
     * Its a brute force solution
     */
    public int findLargestElement(int[] arr) {
        QuickSort qs = new QuickSort();
        qs.qs(arr, 0, arr.length - 1);

        return arr[arr.length - 1];
    }

    /**
     * TC - O(N)
     * SC: O(1)
     */
    public int findLargestInN(int[] arr) {
        int largest = arr[0];
        int index = 1;
        while (index < arr.length) {
            if (arr[index] > largest) {
                largest = arr[index];
            }
            index++;
        }
        return largest;
    }
}
