package com.leetcode.search;

public class ConcatenateAnArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for(int index = 0; index < nums.length; index++) {
            ans[index] = nums[index];
            ans[index + nums.length] = nums[index];
        }

        return ans;
    }
}
