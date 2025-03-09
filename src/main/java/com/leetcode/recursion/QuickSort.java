package com.leetcode.recursion;

public class QuickSort {

    public void sort(int[] array, int low, int high) {

        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;

        System.out.println("Low:" + low + " High:" + high);
        
        int mid = start + (end - start) / 2;
        int pivot = array[mid];

        while (start <= end) {
            while (array[start] < pivot) {
                start++;
            }
            while (array[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;

                start++;
                end--;
            }
        }

        sort(array, low, end);
        sort(array, start, high);
    }
}
