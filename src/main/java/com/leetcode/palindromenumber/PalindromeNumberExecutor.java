package com.leetcode.palindromenumber;

public class PalindromeNumberExecutor {

    public static void main(String args[]) {
        PalindromeNumber palindromeNumber = new PalindromeNumberUsingHalfNumberReversalMethod();

        System.out.println("Is 121 palindrome: " + palindromeNumber.isPalindrome(121));
        
        System.out.println("Is -121 palindrome: " + palindromeNumber.isPalindrome(-121));

        System.out.println("Is 10 palindrome: " + palindromeNumber.isPalindrome(10));

        System.out.println("Is 1234321 palindrome: " + palindromeNumber.isPalindrome(1234321));
    }
}
