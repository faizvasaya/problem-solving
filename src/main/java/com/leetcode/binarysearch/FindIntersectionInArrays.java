package com.leetcode.binarysearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 349. Intersection of Two Arrays
 * https://leetcode.com/problems/intersection-of-two-arrays/description/
 *
 * Approach: BinarySearch : Sort both the arrays. Post sorting lookout for the
 * elements of the first array in the second array. If found, add it to the
 * intersects array and increment its index. Once the first array is traversed
 * create a copy of the intersects array and return it till the index that it
 * has been populated.
 * 
 * Set: Store both the arrays in a set. Use the retainAll method of sets to find the
 * intersection of set1 and set2. Convert the set1 to array to return.
 * 
 * Using hashing: Maintain two boolean array of 1001 values. It is populated to false
 * by default. The 1st boolean array will maintain the presence of a value in arr1
 * and the 2nd boolean array will maintain the visit status of the value in arr2 in
 * arr1.
 */
public class FindIntersectionInArrays {

    // Time complexity = Time to sort both the arrays O(M log M) + O(N log ) + Time to loop through first array and perform binary search on second array for each element of the first array O(M log N) where N is the size of second array and M is the size of 1st array.
    // Space complexity: O(Min(m,n))
    public int[] findUsingSortingAndBinarySearch(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] intersects = new int[Math.min(arr1.length, arr2.length)];
        int intersectionIndex = 0;

        for (int firstArrayIndex = 0; firstArrayIndex < arr1.length; firstArrayIndex++) {
            if (firstArrayIndex > 0 && arr1[firstArrayIndex] == arr1[firstArrayIndex - 1]) {
                continue;
            }

            boolean intersectionFound = this.binarySearch(arr2, arr1[firstArrayIndex]);

            if (intersectionFound) {
                intersects[intersectionIndex] = arr1[firstArrayIndex];
                intersectionIndex++;
            }
        }

        return Arrays.copyOf(intersects, intersectionIndex);
    }

    // Time Complexity: O(Log N)
    private boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return true;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }

    // Time Complexity:  O(M+N) to convert both the arrays to set + O(min(m,n)) to
    // find the intersection of both the sets, O(N) to convert set to an array.

    // Space Complexity: O(M+N)
    public int[] findUsingSet(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int elem : arr1) {
            set1.add(elem);
        }

        Set<Integer> set2 = new HashSet<>();
        for(int elem: arr2) {
            set2.add(elem);
        }

        set1.retainAll(set2);

        int[] intersection = new int[set1.size()];
        int index = 0;
        for (int elem : set1) {
            intersection[index++] = elem;
        }

        return intersection;
    }

    // Time complexity: O(n + m)
    // Space complexity: O(1) since we are using constant space.
    public int[] findUsingHashing(int[] arr1, int[] arr2) {
        boolean[] presence = new boolean[1001];
        boolean[] visited = new boolean[1001];

        for(int num: arr1) {
            presence[num] = true;
        }

        int[] intersect = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;

        for(int num: arr2) {
            if(presence[num] && !visited[num]) {
                intersect[index++] = num;
                visited[num] = true;
            }
        }

        return Arrays.copyOf(intersect, index);
    }
}
