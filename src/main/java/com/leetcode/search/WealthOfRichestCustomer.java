package com.leetcode.search;

public class WealthOfRichestCustomer {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        for (int[] account : accounts) {
            int customerWealth = 0;
            for (int bank : account) {
                customerWealth = customerWealth + bank;
            }
            if(customerWealth > maximumWealth) {
                maximumWealth = customerWealth;
            }
        }

        return maximumWealth;
    }
}
