package com.leetcode.binarysearch;

/**
 * https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
 * Approach:
 * Use Binary Search: Assume that the minimum weight and maximum weight that the ship can carry would be minimum of weight and sum of weights. Run binary search for the range of minimum and maximum weights to find the weight that is the most optimum.
 */
public class CapacityToShipPackages {

    public int findUsingBinarySearch(int[] weights, int days) {
        int start = 0;
        int end = 0;

        for (int weight : weights) {
            end = end + weight;
            start = Integer.max(start, weight);
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (canShip(weights, days, mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int calculatedDays = 1;
        int totalWeightPerDay = 0;
        for (int weight : weights) {

            totalWeightPerDay = totalWeightPerDay + weight;

            if (totalWeightPerDay > capacity) {
                totalWeightPerDay = weight;
                calculatedDays++;
            }

            if (calculatedDays > days) {
                return false;
            }
        }

        return true;
    }
}
