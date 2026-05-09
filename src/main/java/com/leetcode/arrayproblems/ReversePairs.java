package com.leetcode.arrayproblems;

import java.util.ArrayList;

public class ReversePairs {

    /**
     * TC: O(N x N)
     *
     * @param arr
     * @return
     */
    public int countUsingBruteForce(int[] arr) {
        int inversions = 0;
        for (int index = 0; index < arr.length; index++) {
            for (int jIndex = index + 1; jIndex < arr.length; jIndex++) {
                long multiplication = 2 * (long) arr[jIndex];
                if (arr[index] > multiplication) {
                    inversions++;
                }
            }
        }
        return inversions;
    }

    /**
     * TC: O(log N) * O(N) = O(2N log N)
     * SC: O(N)
     *
     * @param arr
     * @return
     */
    public int countUsingMergeSort(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high) {
            return count;
        }
        int mid = (low + high) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);
        return count;
    }

    private int countPairs(int[] arr, int low, int mid, int high) {
        int count = 0;
        int rightPointer = mid + 1;
        for (int idx = low; idx <= mid; idx++) {
            while (rightPointer <= high && arr[idx] > (long) arr[rightPointer] * 2) {
                rightPointer++;
            }
            count += rightPointer - (mid + 1);
        }
        return count;
    }

    private void merge(int[] arr, int low, int mid, int high) {
        int leftPointer = low;
        int rightPointer = mid + 1;
        ArrayList<Integer> al = new ArrayList<>();

        while (leftPointer <= mid && rightPointer <= high) {
            if (arr[leftPointer] >= arr[rightPointer]) {
                al.add(arr[rightPointer]);
                rightPointer++;
            } else {
                al.add(arr[leftPointer]);
                leftPointer++;
            }
        }

        while (leftPointer <= mid) {
            al.add(arr[leftPointer]);
            leftPointer++;
        }

        while (rightPointer <= high) {
            al.add(arr[rightPointer]);
            rightPointer++;
        }

        for (int index = low; index <= high; index++) {
            arr[index] = al.get(index - low);
        }
    }
}
