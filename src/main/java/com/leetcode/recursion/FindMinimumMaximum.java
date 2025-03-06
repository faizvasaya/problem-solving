package com.leetcode.recursion;

public class FindMinimumMaximum {

    public int findMinimum(int[] arr, int index, int min) {
        // Base condition
        if (index == arr.length) {
            return min;
        }

        // Logic
        if (arr[index] < min) {
            min = arr[index];
        }

        // Recursive call
        return findMinimum(arr, index + 1, min);
    }

    public int findMax(int[] arr, int index, int max) {
        // Base condition
        if (index == arr.length) {
            return max;
        }

        // Logic
        if (arr[index] > max) {
            max = arr[index];
        }

        // Recursive call
        return findMax(arr, index + 1, max);
    }

    public int findMinUsingDivideAndConquer(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        }

        int mid = start + (end - start) / 2;
        int minLeft = findMinUsingDivideAndConquer(arr, start, mid);

        int minRight = findMinUsingDivideAndConquer(arr, mid + 1, end);

        return Math.min(minLeft, minRight);
    }

    public int findMaxUsingDivideAndConquer(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        }

        int mid = start + (end - start) / 2;
        int minLeft = findMaxUsingDivideAndConquer(arr, start, mid);

        int minRight = findMaxUsingDivideAndConquer(arr, mid + 1, end);

        return Math.max(minLeft, minRight);
    }
}
