package com.leetcode.arrayproblems;

import java.util.ArrayList;

public class CountInversions {

    public int countUsingBruteForce(int[] arr) {
        int inversions = 0;
        for (int index = 0; index < arr.length; index++) {
            for (int jIndex = index + 1; jIndex < arr.length; jIndex++) {
                if (arr[index] > arr[jIndex]) {
                    inversions++;
                }
            }
        }
        return inversions;
    }

    /**
     * TC: O(N log N)
     * SC: O(N)
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
        count += merge(arr, low, mid, high);
        return count;
    }

    private int merge(int[] arr, int low, int mid, int high) {
        int count = 0;
        int leftPointer = low;
        int rightPointer = mid + 1;
        ArrayList<Integer> al = new ArrayList<>();
        while (leftPointer <= mid && rightPointer <= high) {
            if (arr[leftPointer] >= arr[rightPointer]) {
                System.out.println("Count incremented");
                count += (mid - leftPointer + 1);
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

        return count;
    }
}
