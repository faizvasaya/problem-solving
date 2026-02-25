package com.leetcode.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AllPermutations {

    /**
     * TC: O(N! * N) SC: O(N)
     */
    public void permutationsUsingRecursion(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int index = 0; index < nums.length; index++) {
            if (!freq[index]) {
                freq[index] = true;
                ds.add(nums[index]);
                permutationsUsingRecursion(nums, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[index] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        permutationsUsingRecursion(nums, ds, ans, freq);
        return ans;
    }

    public List<Integer> generateNextPermutation(List<Integer> nums) {
        int breakPoint = -1;
        int size = nums.size();
        for (int index = size - 2; index >= 0; index--) {
            if (nums.get(index) < nums.get(index + 1)) {
                breakPoint = index;
                break;
            }
        }

        if (breakPoint == -1) {
            Collections.reverse(nums);
            return nums;
        }

        for (int index = size - 1; index > breakPoint; index--) {
            if (nums.get(index) > nums.get(breakPoint)) {
                int temp = nums.get(index);
                nums.set(index, nums.get(breakPoint));
                nums.set(breakPoint, temp);
                break;
            }
        }

        List<Integer> sublist = nums.subList(breakPoint + 1, size);
        Collections.reverse(sublist);

        return nums;
    }
}
