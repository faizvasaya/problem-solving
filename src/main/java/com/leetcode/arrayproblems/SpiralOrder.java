package com.leetcode.arrayproblems;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    /**
     * TC: O(M x N)
     * SC: O(M x N)
     */
    public List<Integer> findUsingBruteForce(int[][] matrix) {
        List<Integer> spiralOrder = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int index = left; index <= right; index++) {
                spiralOrder.add(matrix[top][index]);
            }
            top++;
            for (int index = top; index <= bottom; index++) {
                spiralOrder.add(matrix[index][right]);
            }
            right--;

            if (top <= bottom) {
                for (int index = right; index >= left; index--) {
                    spiralOrder.add(matrix[bottom][index]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int index = bottom; index >= top; index--) {
                    spiralOrder.add(matrix[index][left]);
                }
                left++;
            }
        }

        return spiralOrder;
    }
}
