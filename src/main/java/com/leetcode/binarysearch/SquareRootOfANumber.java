package com.leetcode.binarysearch;

// https://leetcode.com/problems/sqrtx/
/**
 * 1. Approach:
 *              Square root of a number is always between 0 to X. To optimize upper bound further, the square root of a number 
 *              is always between 0 to min(X, X+1 / 2) when X >= 4.
 *              With 0 as lower bound and min(X, X+1 / 2) as upper bound, use binary search find the integer such as mid^2
 *              such that mid^2 <= X.
 *              If mid^2 > X, then the possible square root is on the left side of the mid.
 *              If mid^2 < X, then the possible square root is on the right side of the mid.
 *              Finally return the possible square root
 */
public class SquareRootOfANumber {
    // Time Complexity: O(log X)
    public int findUsingBinarySearch(int x) {
        int possibleSquareRoot = 0;
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1;
        int end = x / 2; 

        while (start <= end) { 
            int mid = start + (end - start) / 2;
            
            if (mid <= x / mid) {
                possibleSquareRoot = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return possibleSquareRoot;
    }
}
