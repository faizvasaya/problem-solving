package com.leetcode.recursion;

public class KWeakestRows {

    // Time complexity: O(n log n) + O(m log m) = O(m log m + n log n)
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] mapping = new int[mat.length][2];
        int[] result = new int[k];

        for (int i = 0; i < mat.length; i++) {
            mapping[i][0] = this.countSoldiers(mat[i]);
            mapping[i][1] = i;
        }

        this.mergeSort(mapping, 0, mapping.length - 1);

        for (int i = 0; i < k; i++) {
            result[i] = mapping[i][1];
        }

        return result;
    }

    private void mergeSort(int[][] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);

        merge(array, start, mid, end);
    }

    private void merge(int[][] array, int start, int mid, int end) {
        int[][] tempArray = new int[end - start + 1][2];
        int tempIndex = 0;
        int leftPointer = start;
        int rightPointer = mid + 1;

        while (leftPointer <= mid && rightPointer <= end) {
            if (array[leftPointer][0] < array[rightPointer][0] || (array[leftPointer][0] == array[rightPointer][0] && array[leftPointer][1] < array[rightPointer][1])) {
                tempArray[tempIndex] = array[leftPointer];
                leftPointer++;
                tempIndex++;
            } else {
                tempArray[tempIndex] = array[rightPointer];
                rightPointer++;
                tempIndex++;
            }
        }

        while (leftPointer <= mid) {
            tempArray[tempIndex] = array[leftPointer];
            tempIndex++;
            leftPointer++;
        }

        while (rightPointer <= end) {
            tempArray[tempIndex] = array[rightPointer];
            tempIndex++;
            rightPointer++;
        }

        for (int idx = 0; idx < tempArray.length; idx++) {
            array[start + idx] = tempArray[idx];
        }
    }

    private int countSoldiers(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}
