package com.leetcode.arrayproblems;

import java.util.HashMap;

public class LargestSubArrayWithSum0 {

    /**
     * TC: O(N log N)
     * SC: O(N)
     * @return
     */
    public int find(int arr[]) {

        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        int sum = 0;
        int maximumLength = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];

            if (sum == 0) {
                maximumLength = index + 1;
            } else {
                if (mpp.get(sum) != null) {
                    maximumLength = Math.max(maximumLength, index - mpp.get(sum));
                } else {
                    mpp.put(sum, index);
                }
            }
        }

        return maximumLength;
    }
}
