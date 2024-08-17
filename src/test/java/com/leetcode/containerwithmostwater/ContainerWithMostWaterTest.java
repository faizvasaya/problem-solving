package com.leetcode.containerwithmostwater;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContainerWithMostWaterTest {

    @Test
    public void testMaxArea() {
        ContainerWithMostWater solution = new ContainerWithMostWaterBruteForce();

        // Test case 1: Standard test case with varying heights
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, solution.findMaximumArea(height1));

        // Test case 2: Two lines with the same height
        int[] height2 = {1, 1};
        assertEquals(1, solution.findMaximumArea(height2));

        // Test case 3: Increasing heights
        int[] height3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(25, solution.findMaximumArea(height3));

        // Test case 4: Decreasing heights
        int[] height4 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertEquals(25, solution.findMaximumArea(height4));

        // Test case 5: All heights are the same
        int[] height5 = {5, 5, 5, 5, 5, 5, 5, 5};
        assertEquals(35, solution.findMaximumArea(height5));

        // Test case 6: Large numbers, edge case
        int[] height6 = {10000, 10000, 10000, 10000};
        assertEquals(30000, solution.findMaximumArea(height6));

        // Test case 7: Large number of lines (n = 100000)
        int[] height7 = new int[100000];
        for (int i = 0; i < 100000; i++) {
            height7[i] = i + 1;
        }
        assertEquals(2147483646, solution.findMaximumArea(height7));  // Expected area based on the pattern

        // Test case 8: Minimum number of lines (n = 2)
        int[] height8 = {1, 2};
        assertEquals(1, solution.findMaximumArea(height8));

        // Test case 9: One height is zero
        int[] height9 = {0, 10, 5, 0, 3};
        assertEquals(9, solution.findMaximumArea(height9));

        // Test case 10: Random heights
        int[] height10 = {1, 3, 2, 5, 25, 24, 5};
        assertEquals(24, solution.findMaximumArea(height10));
    }

    @Test
    public void testMaxAreaWithTwoPointer() {
        ContainerWithMostWater solution = new ContainerWithMostWaterTwoPointer();

        // Test case 1: Standard test case with varying heights
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, solution.findMaximumArea(height1));

        // Test case 2: Two lines with the same height
        int[] height2 = {1, 1};
        assertEquals(1, solution.findMaximumArea(height2));

        // Test case 3: Increasing heights
        int[] height3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(25, solution.findMaximumArea(height3));

        // Test case 4: Decreasing heights
        int[] height4 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertEquals(25, solution.findMaximumArea(height4));

        // Test case 5: All heights are the same
        int[] height5 = {5, 5, 5, 5, 5, 5, 5, 5};
        assertEquals(35, solution.findMaximumArea(height5));

        // Test case 6: Large numbers, edge case
        int[] height6 = {10000, 10000, 10000, 10000};
        assertEquals(30000, solution.findMaximumArea(height6));

        // Test case 7: Large number of lines (n = 100000)
        int[] height7 = new int[100000];
        for (int i = 0; i < 100000; i++) {
            height7[i] = i + 1;
        }
        assertEquals(2147461824, solution.findMaximumArea(height7));  // Expected area based on the pattern

        // Test case 8: Minimum number of lines (n = 2)
        int[] height8 = {1, 2};
        assertEquals(1, solution.findMaximumArea(height8));

        // Test case 9: One height is zero
        int[] height9 = {0, 10, 5, 0, 3};
        assertEquals(9, solution.findMaximumArea(height9));

        // Test case 10: Random heights
        int[] height10 = {1, 3, 2, 5, 25, 24, 5};
        assertEquals(24, solution.findMaximumArea(height10));
    }
}
