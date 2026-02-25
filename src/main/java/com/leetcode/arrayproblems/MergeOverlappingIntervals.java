package com.leetcode.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {

    /*
        TC: O(N log N) + O(2n)
        SC: O(N)
     */
    public int[][] findUsingBruteForce(int[][] arr) {
        // O(N log N)
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        // O(2N)
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }

            if (result.isEmpty() || start > result.get(result.size() - 1)[1]) {
                result.add(new int[]{start, end});
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    /**
     * TC: O(N log N) + O(N) SC: O(N)
     */
    public int[][] findUsingSingleIteration(int[][] arr) {

        if (arr == null || arr.length == 0) {
            return new int[0][];
        }

        List<int[]> mergedIntervals = new ArrayList<>();

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        for (int index = 0; index < arr.length; index++) {
            int start = arr[index][0];
            int end = arr[index][1];
            if (mergedIntervals.isEmpty() || start > mergedIntervals.get(mergedIntervals.size() - 1)[1]) {
                mergedIntervals.add(new int[]{start, end});
            } else {
                int[] last = mergedIntervals.get(mergedIntervals.size() - 1);
                int max = Math.max(end, last[1]);
                last[1] = max;
            }

        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
