package com.leetcode.binarysearch;

/**
 * https://leetcode.com/problems/find-the-duplicate-number/description/
 *
 * Approach: Use binary search: Since the range is already defined as [1,n], we
 * use binary search to search for the duplicate number in the range. For each
 * mid, find the number of elements which are less than or equal to mid. If
 * there are more elements than mid the duplicate is in start to mid. If not,
 * then the duplicate is in mid to end. Move start and end pointers accordingly.
 *
 * Using Cycle Detection: The key intuition behind this method is that if
 * there's a cycle in the linked list, the fast and slow pointers will
 * eventually meet. We treat the array as a linked list, where the index
 * represents the node and the value at that index represents the next node.
 * Using the fast-slow pointers technique, we traverse the linked list. The slow
 * pointer moves one step at a time while the fast pointer moves two steps at a
 * time. If there's a cycle in the linked list (indicating a duplicate number),
 * the fast and slow pointers will eventually meet. After identifying the
 * meeting point, we reset the slow pointer to the start and move both pointers
 * at the same pace until they meet again. The meeting point will be the
 * duplicate number.
 */
public class FindDuplicateElements {

    // Time complexity: O(n log n)
    // Space complexity : O(1)
    public int findUsingBinarySearch(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            int countOfNumbersLessThanOrEqualToMid = 0;

            for (int num : nums) {
                if (num <= mid) {
                    countOfNumbersLessThanOrEqualToMid++;
                }
            }

            if (countOfNumbersLessThanOrEqualToMid > mid) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    // Time Complexity: O(n)
    // Space complexity : O(1)
    public int findUsingCycleDetection(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    // Time complexity : O(n)
    // Space complexity : O(n)
    public int findUsingBooleanArray(int[] nums) {
        boolean[] b = new boolean[nums.length];
        for (int num : nums) {
            if (b[num]) {
                return num;
            }
            b[num] = true;
        }
        return -1;
    }
}
