package com.leetcode.arrayproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    /**
     * TC: O(N x N x N) SC: 2 x O(no. of triplets)
     */
    public List<List<Integer>> threeSumUsingBruteForce(int[] nums) {

        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        for (int index = 0; index < nums.length; index++) {
            for (int jIndex = index + 1; jIndex < nums.length; jIndex++) {
                for (int kIndex = jIndex + 1; kIndex < nums.length; kIndex++) {
                    if (nums[index] + nums[jIndex] + nums[kIndex] == 0) {
                        List<Integer> newTriplet = new ArrayList<>();
                        newTriplet.add(nums[index]);
                        newTriplet.add(nums[jIndex]);
                        newTriplet.add(nums[kIndex]);
                        Collections.sort(newTriplet);

                        uniqueTriplets.add(newTriplet);
                    }
                }
            }
        }

        List<List<Integer>> triplets = new ArrayList<>();

        for (List<Integer> list : uniqueTriplets) {
            triplets.add(list);
        }

        return triplets;
    }

    /**
     * TC: O(N x N x Log N)
     * SC: O(no. of triplets)
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSumHashing(int[] nums) {

        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        for (int index = 0; index < nums.length; index++) {
            Set<Integer> hashedNums = new HashSet<>();
            for (int jIndex = index + 1; jIndex < nums.length; jIndex++) {
                int elementToLookUp = -(nums[index] + nums[jIndex]);
                if (hashedNums.contains(elementToLookUp)) {
                    List<Integer> newTriplet = new ArrayList<>();
                    newTriplet.add(nums[index]);
                    newTriplet.add(nums[jIndex]);
                    newTriplet.add(elementToLookUp);
                    Collections.sort(newTriplet);
                    uniqueTriplets.add(newTriplet);
                }
                hashedNums.add(nums[jIndex]);
            }
        }

        List<List<Integer>> triplets = new ArrayList<>();

        for (List<Integer> list : uniqueTriplets) {
            triplets.add(list);
        }

        return triplets;
    }
}
