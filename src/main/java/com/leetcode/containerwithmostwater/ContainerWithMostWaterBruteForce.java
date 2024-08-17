package com.leetcode.containerwithmostwater;

/**
 * Time Complexity: O(n^2) since we have two loops 
 * Space Complexity: O(1) since we are not using any additional space
 */
public class ContainerWithMostWaterBruteForce implements ContainerWithMostWater {

    @Override
    public int findMaximumArea(int[] height) {
        int maximumArea = 0;
    
        for (int outerIndex = 0; outerIndex < height.length - 1; outerIndex++) {
            for (int innerIndex = outerIndex + 1; innerIndex < height.length; innerIndex++) {
                // Calculate the area using long to avoid overflow
                int minHeight = Math.min(height[outerIndex], height[innerIndex]);
                long width = innerIndex - outerIndex;
                long area = (long) minHeight * width;
    
                maximumArea = Math.max(maximumArea, (int) area);
            }
        }
        return maximumArea;
    }
}
