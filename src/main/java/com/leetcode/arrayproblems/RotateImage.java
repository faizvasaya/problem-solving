package com.leetcode.arrayproblems;

public class RotateImage {

    /**
     * TC: O(N/2 * N/2) + O(N x N/2) 
     * SC: O(1)
     * Convert rows to cols
     * (Transpose) Reverse cols
     */
    public void rotateOptimalSolution(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int j = 0;
            int k = matrix[i].length - 1;
            while (j <= k) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                j++;
                k--;
            }
        }
    }

    /**
     * TC: O(M x N) SC: O(M x N)
     */
    public int[][] rotateUsingBruteForceWithoutReverse(int[][] matrix) {
        int[][] answer = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                answer[j][matrix[i].length - 1 - i] = matrix[i][j];
            }
        }

        return answer;
    }
}
