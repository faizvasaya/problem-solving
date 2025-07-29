package com.leetcode.recursion;

import java.util.Arrays;

public class ReverseAnArray {

    public void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }

    public void reverseUsingRecursion(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseUsingRecursion(arr, left + 1, right - 1);
    }

    public void revereUsingRecursionOneVariable(int[] arr, int left) {
        int right = arr.length - left - 1;
        if (left >= right) {
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        revereUsingRecursionOneVariable(arr, left + 1);
    }
}
