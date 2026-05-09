package com.leetcode.sorting;

import java.util.ArrayList;

public class MergeSortOnceAgain {

    public void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high) {
        int leftPointer = low;
        int rightPointer = mid + 1;
        ArrayList<Integer> al = new ArrayList<>();

        while (leftPointer <= mid && rightPointer <= high) {
            if (arr[leftPointer] <= arr[rightPointer]) {
                al.add(arr[leftPointer]);
                leftPointer++;
            } else {
                al.add(arr[rightPointer]);
                rightPointer++;
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

        for (int idx = low; idx <= high; idx++) {
            arr[idx] = al.get(idx);
        }
    }
}
