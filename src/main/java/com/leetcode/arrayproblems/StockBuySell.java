package com.leetcode.arrayproblems;

public class StockBuySell {

    /**
     * TC: O(N x N) SC: O(1)
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int index = prices.length - 1; index > 0; index--) {
            for (int jIndex = index - 1; jIndex >= 0; jIndex--) {
                maxProfit = Math.max(maxProfit, prices[index] - prices[jIndex]);
            }
        }

        return maxProfit;
    }

    /**
     * TC: O(N) SC: O(1)
     */
    public int maxProfitUsingSinglePass(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int index = 0; index < prices.length; index++) {
            minPrice = Math.min(minPrice, prices[index]);
            int currentProfit = prices[index] - minPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
        }
        return maxProfit;
    }
}
