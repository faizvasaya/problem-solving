package com.leetcode.sorting;

import java.util.ArrayList;

public class MergeSort {

    /**
     * TC: O(N log N)
     * SC: O(N)
     */
    public void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> al = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                al.add(arr[left]);
                left++;
            } else {
                al.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            al.add(arr[left]);
            left++;
        }

        while (right <= high) {
            al.add(arr[right]);
            right++;
        }

        for (int idx = low; idx <= high; idx++) {
            arr[idx] = al.get(idx - low);
        }
    }
}
