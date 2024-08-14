package com.leetcode.twosumproblem;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void testBruteForceTwoSum() {
        TwoSumCalculator bruteForce = new TwoSumBruteForce();

        // Test case 1: Normal case
        assertArrayEquals(new int[]{0, 1}, bruteForce.calculateTwoSum(new int[]{2, 7, 11, 15}, 9));

        // Test case 2: Large numbers
        assertArrayEquals(new int[]{0, 1}, bruteForce.calculateTwoSum(new int[]{1000000000, 1000000000}, 2000000000));

        // Test case 3: Negative numbers
        assertArrayEquals(new int[]{0, 1}, bruteForce.calculateTwoSum(new int[]{-1000000000, -1000000000}, -2000000000));

        // Test case 4: Mixed positive and negative numbers
        assertArrayEquals(new int[]{0, 1}, bruteForce.calculateTwoSum(new int[]{-1, 1, 2, -2}, 0));

        // Test case 5: Single solution at end
        assertArrayEquals(new int[]{8, 9}, bruteForce.calculateTwoSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 19));

        // Test case 6: Duplicate elements
        assertArrayEquals(new int[]{1, 2}, bruteForce.calculateTwoSum(new int[]{1, 5, 5, 3, 7}, 10));

        // Test case 7: Minimum length
        assertArrayEquals(new int[]{0, 1}, bruteForce.calculateTwoSum(new int[]{1, 1}, 2));

        // Test case 8: All same elements
        assertArrayEquals(new int[]{0, 1}, bruteForce.calculateTwoSum(new int[]{5, 5, 5, 5}, 10));

        // Test case 9: Large array size
        int[] largeArray = new int[10000];
        for (int i = 0; i < 10000; i++) {
            largeArray[i] = i + 1;
        }
        assertArrayEquals(new int[]{9998, 9999}, bruteForce.calculateTwoSum(largeArray, 19999));

        // Test case 10: Edge case values
        assertArrayEquals(new int[]{0, 1}, bruteForce.calculateTwoSum(new int[]{-1000000000, 1000000000}, 0));

        // Test case 11: Elements spanning the full range
        assertArrayEquals(new int[]{0, 3}, bruteForce.calculateTwoSum(new int[]{-1000000000, 500000000, -500000000, 1000000000}, 0));
    }

    @Test
    public void testTwoPassHashMapTwoSum() {
        TwoSumCalculator twoPassHashMap = new TwoSumTwoPassHash();

        // Test case 1: Normal case
        assertArrayEquals(new int[]{0, 1}, twoPassHashMap.calculateTwoSum(new int[]{2, 7, 11, 15}, 9));

        // Test case 2: Large numbers
        assertArrayEquals(new int[]{1, 0}, twoPassHashMap.calculateTwoSum(new int[]{1000000000, 1000000000}, 2000000000));

        // Test case 3: Negative numbers
        assertArrayEquals(new int[]{1, 0}, twoPassHashMap.calculateTwoSum(new int[]{-1000000000, -1000000000}, -2000000000));

        // Test case 4: Mixed positive and negative numbers
        assertArrayEquals(new int[]{0, 1}, twoPassHashMap.calculateTwoSum(new int[]{-1, 1, 2, -2}, 0));

        // Test case 5: Single solution at end
        assertArrayEquals(new int[]{8, 9}, twoPassHashMap.calculateTwoSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 19));

        // Test case 6: Duplicate elements
        assertArrayEquals(new int[]{2, 1}, twoPassHashMap.calculateTwoSum(new int[]{1, 5, 5, 3, 7}, 10));

        // Test case 7: Minimum length
        assertArrayEquals(new int[]{1, 0}, twoPassHashMap.calculateTwoSum(new int[]{1, 1}, 2));

        // Test case 8: All same elements
        assertArrayEquals(new int[]{1, 0}, twoPassHashMap.calculateTwoSum(new int[]{5, 5, 5, 5}, 10));

        // Test case 9: Large array size
        int[] largeArray = new int[10000];
        for (int i = 0; i < 10000; i++) {
            largeArray[i] = i + 1;
        }
        assertArrayEquals(new int[]{9998, 9999}, twoPassHashMap.calculateTwoSum(largeArray, 19999));

        // Test case 10: Edge case values
        assertArrayEquals(new int[]{0, 1}, twoPassHashMap.calculateTwoSum(new int[]{-1000000000, 1000000000}, 0));

        // Test case 11: Elements spanning the full range
        assertArrayEquals(new int[]{0, 3}, twoPassHashMap.calculateTwoSum(new int[]{-1000000000, 500000000, -500000000, 1000000000}, 0));
    }

    @Test
    public void testOnePassHashMapTwoSum() {
        TwoSumCalculator onePassHashMap = new TwoSumOnePassHash();

        // Test case 1: Normal case
        assertArrayEquals(new int[]{0, 1}, onePassHashMap.calculateTwoSum(new int[]{2, 7, 11, 15}, 9));

        // Test case 2: Large numbers
        assertArrayEquals(new int[]{0, 1}, onePassHashMap.calculateTwoSum(new int[]{1000000000, 1000000000}, 2000000000));

        // Test case 3: Negative numbers
        assertArrayEquals(new int[]{0, 1}, onePassHashMap.calculateTwoSum(new int[]{-1000000000, -1000000000}, -2000000000));

        // Test case 4: Mixed positive and negative numbers
        assertArrayEquals(new int[]{0, 1}, onePassHashMap.calculateTwoSum(new int[]{-1, 1, 2, -2}, 0));

        // Test case 5: Single solution at end
        assertArrayEquals(new int[]{8, 9}, onePassHashMap.calculateTwoSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 19));

        // Test case 6: Duplicate elements
        assertArrayEquals(new int[]{1, 2}, onePassHashMap.calculateTwoSum(new int[]{1, 5, 5, 3, 7}, 10));

        // Test case 7: Minimum length
        assertArrayEquals(new int[]{0, 1}, onePassHashMap.calculateTwoSum(new int[]{1, 1}, 2));

        // Test case 8: All same elements
        assertArrayEquals(new int[]{0, 1}, onePassHashMap.calculateTwoSum(new int[]{5, 5, 5, 5}, 10));

        // Test case 9: Large array size
        int[] largeArray = new int[10000];
        for (int i = 0; i < 10000; i++) {
            largeArray[i] = i + 1;
        }
        assertArrayEquals(new int[]{9998, 9999}, onePassHashMap.calculateTwoSum(largeArray, 19999));

        // Test case 10: Edge case values
        assertArrayEquals(new int[]{0, 1}, onePassHashMap.calculateTwoSum(new int[]{-1000000000, 1000000000}, 0));

        // Test case 11: Elements spanning the full range
        assertArrayEquals(new int[]{1, 2}, onePassHashMap.calculateTwoSum(new int[]{-1000000000, 500000000, -500000000, 1000000000}, 0));
    }
}
