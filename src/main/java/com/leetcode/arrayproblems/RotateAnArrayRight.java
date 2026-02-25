package com.leetcode.arrayproblems;

public class RotateAnArrayRight {

    /**
     * TC: O(N * N) - This causes Time Limit Exceeded error. Brute Force.
     */
    public void rotate(int[] arr, int k) {
        k = k % arr.length;

        for (int rotationTry = 0; rotationTry < k; rotationTry++) {
            int elementToRotate = arr[arr.length - 1];

            for (int index = arr.length - 1; index > 0; index--) {
                arr[index] = arr[index - 1];
            }

            arr[0] = elementToRotate;
        }
    }

    /**
     * TC: O(N) SC: O(N) 1. Modulo K because there can be max N-1 rotations
     * before the array resets to what was original 2. Move elements to rotate
     * to a temp array 3. Shift the remaining elements by k spaces towards right
     * 4. Move back the elements from temp array to original array
     */
    public void rotateSinglePass(int[] arr, int k) {

        k = k % arr.length;

        int[] tempArray = new int[k];

        int tempIndex = 0;
        for (int index = arr.length - k; index < arr.length; index++) {
            tempArray[tempIndex] = arr[index];
            tempIndex++;
        }

        for (int index = arr.length - k - 1; index >= 0; index--) {
            arr[index + k] = arr[index];
        }

        for (int index = 0; index < tempArray.length; index++) {
            arr[index] = tempArray[index];
        }
    }

    public void rotateWithoutSpace(int[] arr, int k) {
        k = k % arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
    }

    private void reverse(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
