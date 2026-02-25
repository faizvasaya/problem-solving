package com.leetcode.arrayproblems;

import java.util.Arrays;

public class MergeTwoSortedArray {

    /**
     * TC: O(m+n) + O(m + n) SC: O(n + m)
     */
    public void mergeUsingBruteForce(int[] nums1, int[] nums2, int m, int n) {
        int[] numsMerged = new int[m + n];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        while (p1 < m && p2 < n) {
            if (nums1[p1] <= nums2[p2]) {
                numsMerged[p3] = nums1[p1];
                p1++;
            } else {
                numsMerged[p3] = nums2[p2];
                p2++;
            }
            p3++;
        }

        while (p1 < m) {
            numsMerged[p3] = nums1[p1];
            p3++;
            p1++;
        }

        while (p2 < n) {
            numsMerged[p3] = nums2[p2];
            p3++;
            p2++;
        }

        for (int index = 0; index < numsMerged.length; index++) {
            if (index < nums1.length) {
                nums1[index] = numsMerged[index];
            } else {
                nums2[index - nums1.length] = numsMerged[index];
            }
        }

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }

    /**
     * TC: O(min(m,n)) + O(n log n) + O(n log n)
     */
    public void mergeWithoutUsingExtraSpace(int[] nums1, int[] nums2, int m, int n) {
        int p1 = m - 1;
        int p2 = 0;

        while (p1 >= 0 && p2 < n) {
            if (nums1[p1] > nums2[p2]) {
                int temp = nums1[p1];
                nums1[p1] = nums2[p2];
                nums2[p2] = temp;
                p1--;
                p2++;
            } else {
                break;
            }
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }

    private void swap(int[] nums1, int[] nums2, int leftIndex, int rightIndex) {
        int temp = nums1[leftIndex];
        nums1[leftIndex] = nums2[rightIndex];
        nums2[rightIndex] = temp;
    }

    private void swapIfGreater(int[] nums1, int[] nums2, int leftIndex, int rightIndex) {
        if (nums1[leftIndex] > nums2[rightIndex]) {
            swap(nums1, nums2, leftIndex, rightIndex);
        }
    }

    /**
     * TC: log N * O(m + n) SC: O(1)
     */
    public void mergeWithoutExtraSpaceShellSort(int[] nums1, int[] nums2, int m, int n) {
        int totalLength = m + n;
        int gap = (totalLength + 1) / 2;

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < totalLength) {
                if (right < m && left < m) {
                    swapIfGreater(nums1, nums1, left, right);
                } else if (left >= m) {
                    swapIfGreater(nums2, nums2, left - m, right - m);
                } else {
                    swapIfGreater(nums1, nums2, left, right - m);
                }

                left++;
                right++;
            }

            if (gap == 1) {
                break;
            }
            gap = (gap + 1) / 2;
        }

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }

    /**
     * TC: O(m + n)
     */
    public void mergeInPlace(int[] nums1, int[] nums2, int m, int n) {
        int mPointer = m - 1;
        int nPointer = n - 1;
        int rightPointer = m + n - 1;

        while (nPointer >= 0) {
            if (mPointer >= 0 && nums1[mPointer] > nums2[nPointer]) {
                nums1[rightPointer] = nums1[mPointer];
                mPointer--;
            }else {
                nums1[rightPointer] = nums2[nPointer];
                nPointer--;
            }
            rightPointer--;
        }

        System.out.println(Arrays.toString(nums1));
    }
}
