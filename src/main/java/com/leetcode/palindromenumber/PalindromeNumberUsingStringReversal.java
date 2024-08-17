package com.leetcode.palindromenumber;

/**
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 */
public class PalindromeNumberUsingStringReversal implements PalindromeNumber {

    @Override
    public boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        String originalNumberToString = String.valueOf(number);

        String reversedNumber = new StringBuilder(originalNumberToString).reverse().toString();

        return originalNumberToString.equals(reversedNumber);

    }
}