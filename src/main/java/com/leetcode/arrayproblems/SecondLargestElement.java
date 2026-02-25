package com.leetcode.arrayproblems;

import com.leetcode.sorting.QuickSort;

public class SecondLargestElement {

    /**
     * TC: O(N log N) + O(N) SC: O(1) Brute force
     */
    public int find(int[] arr) {
        QuickSort qs = new QuickSort();
        qs.qs(arr, 0, arr.length - 1);

        int largest = arr[arr.length - 1];
        int index = arr.length - 2;
        while (index >= 0) {

            if (arr[index] != largest) {
                return arr[index];
            }
            index--;
        }

        return -1;
    }

    /**
     * TC: O(N) + O(N) = O(2n) = Dropping Constants = O(N) SC: O(1) Better
     */
    public int findUsingN(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;

        for (int index = 1; index < arr.length; index++) {
            if (arr[index] > largest) {
                largest = arr[index];
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > secondLargest && arr[index] != largest) {
                secondLargest = arr[index];
            }
        }

        return secondLargest;
    }

    /**
     * TC: O(N)
     */
    public int findUsingNSinglePass(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;

        for (int index = 1; index < arr.length; index++) {
            if (arr[index] > largest) {
                secondLargest = largest;
                largest = arr[index];
            } else if (arr[index] > secondLargest && arr[index] < largest) {
                secondLargest = arr[index];
            }
        }

        return secondLargest;
    }
}
