package com.leetcode.arrayproblems;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    /**
     * TC: O(N x N)
     */
    public List<List<Integer>> generateUsingBruteForce(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();

        for (int index = 0; index < numRows; index++) {
            List<Integer> temp = new ArrayList<>();
            pascalsTriangle.add(temp);
            for (int jIndex = 0; jIndex <= index; jIndex++) {
                if (jIndex == 0 || jIndex == index) {
                    temp.add(1);
                } else {
                    List<Integer> previousArrayList = pascalsTriangle.get(index - 1);
                    int previousArrayList1stElement = previousArrayList.get(jIndex - 1);
                    int previousArrayList2ndElement = previousArrayList.get(jIndex);
                    temp.add(previousArrayList1stElement + previousArrayList2ndElement);
                }
            }
        }

        return pascalsTriangle;
    }

    /**
     * TC: O(N x N)
     */
    public int returnTheValueAtRAndC(int row, int col) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();

        for (int index = 0; index < row; index++) {
            List<Integer> temp = new ArrayList<>();
            pascalsTriangle.add(temp);
            for (int jIndex = 0; jIndex <= index; jIndex++) {
                if (jIndex == 0 || jIndex == index) {
                    temp.add(1);
                } else {
                    List<Integer> previousArrayList = pascalsTriangle.get(index - 1);
                    int previousArrayList1stElement = previousArrayList.get(jIndex - 1);
                    int previousArrayList2ndElement = previousArrayList.get(jIndex);
                    temp.add(previousArrayList1stElement + previousArrayList2ndElement);
                }
            }
        }

        return pascalsTriangle.get(row - 1).get(col - 1);
    }

    /**
     * TC: O(N)
     */
    public long findNCR(int n, int r) {
        long result = 1;

        for (int index = 0; index < r; index++) {
            result = result * (n - index);
            result = result / (index + 1);
        }

        return result;
    }

    /**
     * TC: O(N X N)
     */
    public long[] printPascalTriangleRowUsingNCR(int rowNumber) {
        long[] pascalTriangleRow = new long[rowNumber];

        for (int col = 1; col <= rowNumber; col++) {
            pascalTriangleRow[col - 1] = this.findNCR(rowNumber - 1, col - 1);
        }
        return pascalTriangleRow;
    }
}
