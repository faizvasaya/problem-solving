package com.leetcode.palindromenumber;

/*
 * Time Complexity : O(log10 (n))
 * Space Complexity : O(1)
 */
public class PalindromeNumberUsingHalfNumberReversalMethod implements PalindromeNumber {
    public boolean isPalindrome(int number) {
        // Negative numbers cannot be palindrome. Example -101
        // Numbers that end with 0 or are completly divisable by 10 and itself are non-zero are also not 
        // palindrome. For example, 100 or 10000
        if (number < 0 || (number % 10 == 0 && number != 0)) {
            return false;
        }

        int halfReversedNumber = 0;
        while(number > halfReversedNumber) {
            halfReversedNumber = halfReversedNumber * 10 + number % 10;
            number = number / 10;
        }

        return number == halfReversedNumber  || number == halfReversedNumber / 10;
    }
}