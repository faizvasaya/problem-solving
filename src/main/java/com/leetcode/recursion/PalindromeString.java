package com.leetcode.recursion;

public class PalindromeString {

    public boolean isPalindrome(String str) {

        if (str.isEmpty()) {
            return false;
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    /**
     * Time Complexity: O(N/2)
     * Space Complexity: O(N/2)
     */
    public boolean isPalindromeViaRecursion(String str, int left) {
        int right = str.length() - 1 - left;
        if (left > right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return isPalindromeViaRecursion(str, left + 1);
    }
}
