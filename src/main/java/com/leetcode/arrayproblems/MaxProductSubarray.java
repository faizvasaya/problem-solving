package com.leetcode.arrayproblems;

public class MaxProductSubarray {
    /**
     * TC: O(N x N)
     */
    public int maxProductUsingBruteForce(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;

        for(int idx = 0; idx < nums.length; idx++) {
            maxProduct = Math.max(maxProduct, nums[idx]);
            int currentProduct = nums[idx];

            for(int jdx = idx + 1; jdx < nums.length; jdx++) {
                currentProduct *= nums[jdx];
                maxProduct = Math.max(maxProduct, currentProduct);
            }
        }

        return maxProduct;
    }

    public int maxProductUsingSingleIteration(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int prefixProduct = 1;
        int suffixProduct = 1;
        for(int idx = 0; idx < nums.length; idx++) {
            if(prefixProduct == 0) prefixProduct = 1;
            if(suffixProduct == 0) suffixProduct = 1;

            prefixProduct *= nums[idx];
            suffixProduct *= nums[nums.length - idx - 1];

            maxProduct = Math.max(maxProduct, Math.max(prefixProduct, suffixProduct));
        }

        return maxProduct;
    }
}
