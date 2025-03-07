package com.leetcode.recursion;

public class BubbleSort {

    public void sortUsingRecursion(int[] array, int i, int j) {

        if (i == 1) {
            return;
        }

        if (j == i - 1) {
            sortUsingRecursion(array, i - 1, 0);
            return;
        }

        if (array[j] > array[j + 1]) {
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }

        sortUsingRecursion(array, i, j + 1);
    }
}
