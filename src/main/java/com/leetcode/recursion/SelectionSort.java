package com.leetcode.recursion;

public class SelectionSort {

    public void selectSortUsingRecursion(int[] array, int i, int j, int maxIndex) {

        if (i == array.length) {
            return;
        }

        if (j == array.length) {
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;

            selectSortUsingRecursion(array, i + 1, i + 1, i + 1);
            return;
        }

        if (array[j] < array[maxIndex]) {
            maxIndex = j;
        }

        selectSortUsingRecursion(array, i, j + 1, maxIndex);
    }
}
