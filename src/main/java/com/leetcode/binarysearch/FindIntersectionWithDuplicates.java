package com.leetcode.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 350. Intersection of Two Arrays II
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
 *
 * Approach: For unsorted arrays with duplicates: Since the number of elements
 * in both the arrays are limited to 1000, it is ok to use a HashMap that stores
 * the number and the number of occurrences of that number. And then, whenever a
 * matching number is found in the second array decrement the number of
 * occurrence from the map.
 */
public class FindIntersectionWithDuplicates {

    // Time complexity O(M+N)
    // Space complexity O(M)
    public int[] findUsingHashMap(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1Occurence = new HashMap<>();
        List<Integer> intersects = new ArrayList<>();

        for (int nums : nums1) {
            nums1Occurence.put(nums, nums1Occurence.getOrDefault(nums, 0) + 1);
        }

        for (int index = 0; index < nums2.length; index++) {
            if (nums1Occurence.getOrDefault(nums2[index], 0) > 0) {
                intersects.add(nums2[index]);
                nums1Occurence.put(nums2[index], nums1Occurence.get(nums2[index]) - 1);
            }
        }

        int[] result = new int[intersects.size()];
        for (int index = 0; index < result.length; index++) {
            result[index] = intersects.get(index);
        }

        return result;
    }

    // Time complexity: O(M + N)
    // Time complexity: O(M)
    public int[] findUsingTwoPointerInSortedArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        List<Integer> intersect = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                intersect.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums2[j] > nums1[i]) {
                i++;
            }
        }

        int[] result = new int[intersect.size()];

        for (int index = 0; index < result.length; index++) {
            result[index] = intersect.get(index);
        }

        return result;
    }

    // Time complexity O(M+N)
    // Space complexity O(M), where m is the total elements in nums1
    public int[] findUsingHashMapStreaming(int[] nums1, Iterable<Integer> nums2Stream) {
        Map<Integer, Integer> nums1Occurence = new HashMap<>();
        List<Integer> intersects = new ArrayList<>();

        for (int nums : nums1) {
            nums1Occurence.put(nums, nums1Occurence.getOrDefault(nums, 0) + 1);
        }

        for (int num : nums2Stream) {
            if (nums1Occurence.containsKey(num) && nums1Occurence.get(num) > 0) {
                intersects.add(num);
                nums1Occurence.put(num, nums1Occurence.get(num) - 1);
            }
        }

        int[] result = new int[intersects.size()];
        for (int index = 0; index < result.length; index++) {
            result[index] = intersects.get(index);
        }

        return result;
    }
}
