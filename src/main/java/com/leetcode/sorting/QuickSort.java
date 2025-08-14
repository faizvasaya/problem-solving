package com.leetcode.sorting;

public class QuickSort {

    public void qs(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = placePivotAndReturnItsPosition(arr, low, high);

            qs(arr, low, partitionIndex - 1);
            qs(arr, partitionIndex + 1, high);
        }
    }

    private int placePivotAndReturnItsPosition(int[] arr, int low, int high) {
        int left = low;
        int right = high;
        int pivot = arr[low];

        while (left < right) {

            while (left < high && arr[left] <= pivot) {
                left++;
            }
            while (right > low && arr[right] > pivot) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[right];
        arr[right] = temp;

        return right;
    }
}
