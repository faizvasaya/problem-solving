package com.leetcode.recursion;

import java.util.Arrays;

public class SumTriangleFromArray {

    public void print(int[] arr) {
        // Base condition
        if (arr.length == 0) {
            return;
        }

        // Logic 
        int[] temp = new int[arr.length - 1];

        helper(temp, arr, 0);

        // Recursive call
        print(temp);

        // Output
        System.out.println(Arrays.toString(arr));
    }

    private int[] helper(int[] temp, int[] arr, int index) {
        if (index == arr.length - 1) {
            return temp;
        }

        temp[index] = arr[index] + arr[index + 1];

        return helper(temp, arr, index + 1);
    }
}
