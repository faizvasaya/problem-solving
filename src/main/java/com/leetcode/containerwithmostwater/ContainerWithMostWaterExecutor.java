package com.leetcode.containerwithmostwater;

public class ContainerWithMostWaterExecutor {
    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWaterBruteForce();

        int[] height = new int[]{1,8,6,2,5,4,8,3,7};

        System.out.println("Two points are: " + containerWithMostWater.findMaximumArea(height));
    }
}
