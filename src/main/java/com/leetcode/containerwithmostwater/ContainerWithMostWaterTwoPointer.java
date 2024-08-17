package com.leetcode.containerwithmostwater;

/**
 * Time Complexity : O(n) as we are iterating through the array in constant time
 * Space Complexity : O(1) as we are not using any extra space for this solution
 */
public class ContainerWithMostWaterTwoPointer implements ContainerWithMostWater {
    
    @Override
    public int findMaximumArea (int[] height) {
        int maximumArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int distance = right - left;
            int area = Math.min(height[left], height[right]) * distance;
            
            maximumArea = Math.max(maximumArea, area);

            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }

        return maximumArea;
    }
}
