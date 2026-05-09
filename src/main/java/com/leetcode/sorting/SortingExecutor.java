package com.leetcode.sorting;

import java.util.Arrays;

public class SortingExecutor {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.sort(new int[]{10, 9, 10011, 10001, 7, 8})));

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(new int[]{2, 3, 4, 5, 6})));

        InsertionSort insertionSort = new InsertionSort();
        System.out.println(Arrays.toString(insertionSort.sort(new int[]{10, 9, 10011, 10001, 7, 8})));

        MergeSort ms = new MergeSort();
        int[] arr = {3, 2, 4, 1, 3};
        ms.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        QuickSort qs = new QuickSort();
        int[] arrqs = {4, 6, 2, 5, 7, 9, 1, 3};
        qs.qs(arrqs, 0, arrqs.length - 1);
        System.out.println(Arrays.toString(arrqs));

        MergeSortOnceAgain ms2 = new MergeSortOnceAgain();
        int[] arr1 = {3, 2, 4, 1, 3};
        ms.sort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));
    }
}
