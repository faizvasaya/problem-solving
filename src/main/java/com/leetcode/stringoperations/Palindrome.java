package com.leetcode.stringoperations;

public class Palindrome {

    public boolean isPalindrome(String str) {
        StringBuilder string = new StringBuilder(str);
        return str.equals(string.reverse().toString());
    }

    public boolean isPalindromeUsingTwoPointer(String str) {
        str = str.toLowerCase().trim();

        if (str == null || str.isEmpty()) {
            return true;
        }
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
