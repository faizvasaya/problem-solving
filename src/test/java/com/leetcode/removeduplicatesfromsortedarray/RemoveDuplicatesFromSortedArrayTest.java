package com.leetcode.removeduplicatesfromsortedarray;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class RemoveDuplicatesFromSortedArrayTest {
    
    @Test
    public void testRemoveDuplicatesSimpleCase() {
        // Test case 1: Simple case with a few duplicates
        int[] nums = {1, 1, 2};
        int expectedLength = 2;
        int[] expectedNums = {1, 2};

        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArrayUsingTwoPointer();
        int k = solution.removeDuplicates(nums);

        assertEquals(expectedLength, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    public void testRemoveDuplicatesNoDuplicates() {
        // Test case 2: No duplicates
        int[] nums = {1, 2, 3, 4, 5};
        int expectedLength = 5;
        int[] expectedNums = {1, 2, 3, 4, 5};

        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArrayUsingTwoPointer();
        int k = solution.removeDuplicates(nums);

        assertEquals(expectedLength, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    public void testRemoveDuplicatesAllDuplicates() {
        // Test case 3: All elements are the same
        int[] nums = {2, 2, 2, 2, 2};
        int expectedLength = 1;
        int[] expectedNums = {2};

        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArrayUsingTwoPointer();
        int k = solution.removeDuplicates(nums);

        assertEquals(expectedLength, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    public void testRemoveDuplicatesLargeInput() {
        // Test case 4: Large input size with sequential duplicates
        int[] nums = new int[30000];
        for (int i = 0; i < 30000; i++) {
            nums[i] = i / 10;
        }
        int expectedLength = 3000;

        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArrayUsingTwoPointer();
        int k = solution.removeDuplicates(nums);

        assertEquals(expectedLength, k);
        for (int i = 0; i < k; i++) {
            assertEquals(i, nums[i]);
        }
    }

    @Test
    public void testRemoveDuplicatesNegativeNumbers() {
        // Test case 5: Array with negative numbers
        int[] nums = {-3, -3, -2, -1, -1, 0, 1, 1, 2};
        int expectedLength = 6;
        int[] expectedNums = {-3, -2, -1, 0, 1, 2};

        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArrayUsingTwoPointer();
        int k = solution.removeDuplicates(nums);

        assertEquals(expectedLength, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    public void testRemoveDuplicatesSingleElement() {
        // Test case 6: Array with a single element
        int[] nums = {42};
        int expectedLength = 1;
        int[] expectedNums = {42};

        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArrayUsingTwoPointer();
        int k = solution.removeDuplicates(nums);

        assertEquals(expectedLength, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    public void testRemoveDuplicatesMinMaxValues() {
        // Test case 8: Array with minimum and maximum allowed values
        int[] nums = {-100, -100, -99, 0, 0, 99, 100, 100};
        int expectedLength = 5;
        int[] expectedNums = {-100, -99, 0, 99, 100};

        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArrayUsingTwoPointer();
        int k = solution.removeDuplicates(nums);

        assertEquals(expectedLength, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

}
