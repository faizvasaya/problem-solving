package com.leetcode.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeros {

    /**
     * TC: O(M x N * (M + N)) ~ O(N ^ 3) SC: O(M * N)
     */
    public int[][] performUsingBruteForce(int[][] matrix) {
        int[][] numsCopy = new int[matrix.length][];

        for (int i = 0; i < matrix.length; i++) {
            numsCopy[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    markRowAsZero(numsCopy, i);
                    markColumnAsZero(numsCopy, j);
                }
            }
        }
        return numsCopy;
    }

    private void markRowAsZero(int[][] nums, int rowNumber) {
        for (int l = 0; l < nums[rowNumber].length; l++) {
            nums[rowNumber][l] = 0;
        }
    }

    private void markColumnAsZero(int[][] nums, int columnNumber) {
        for (int l = 0; l < nums.length; l++) {
            nums[l][columnNumber] = 0;
        }
    }

    /**
     * TC: O(M x N) SC: O(M + N)
     */
    public void performUsingBruteForceInPlace(int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    if (!rows.contains(i)) {
                        rows.add(i);
                    }
                    if (!columns.contains(j)) {
                        columns.add(j);
                    }
                }
            }
        }

        for (int i = 0; i < rows.size(); i++) {
            for (int j = 0; j < matrix[rows.get(i)].length; j++) {
                matrix[rows.get(i)][j] = 0;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < columns.size(); j++) {
                matrix[i][columns.get(j)] = 0;
            }
        }
    }

    /**
     * TC: O(M x N * (M + N) + (M x N)) ~ O(N ^ 3) SC: O(1)
     *
     * @param matrix
     */
    public void performUsingBruteForceInPlaceMinusOneLogic(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    markRowAsMinusOne(matrix, i);
                    markColumnAsMinusOne(matrix, j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private void markRowAsMinusOne(int[][] nums, int rowNumber) {
        for (int l = 0; l < nums[rowNumber].length; l++) {
            if (nums[rowNumber][l] != 0) {
                nums[rowNumber][l] = -1;
            }
        }
    }

    private void markColumnAsMinusOne(int[][] nums, int columnNumber) {
        for (int l = 0; l < nums.length; l++) {
            if (nums[l][columnNumber] != 0) {
                nums[l][columnNumber] = -1;
            }
        }
    }

    /**
     * TC: O(M x N)
     * SC: O(M + N)
     */
    public void performUsingNSquareUsingMarkingLogic(int[][] matrix) {
        int[] rows = new int[matrix.length];
        int[] columns = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = 1;
                    columns[j] = 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (rows[i] == 1 || columns[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
