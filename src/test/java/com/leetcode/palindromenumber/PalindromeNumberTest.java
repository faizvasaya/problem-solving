package com.leetcode.palindromenumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void testIsPalindromeUsingStringReversal() {
        PalindromeNumber palindromeNumber = new PalindromeNumberUsingStringReversal();
        
        // Test cases
        assertTrue(palindromeNumber.isPalindrome(121));
        assertFalse(palindromeNumber.isPalindrome(-121));
        assertFalse(palindromeNumber.isPalindrome(10));
        assertTrue(palindromeNumber.isPalindrome(7));
        assertTrue(palindromeNumber.isPalindrome(0));
        assertTrue(palindromeNumber.isPalindrome(1234321));
        assertFalse(palindromeNumber.isPalindrome(1234567));
        assertFalse(palindromeNumber.isPalindrome(2147483647));
        assertTrue(palindromeNumber.isPalindrome(2147447412));
    }

    @Test
    public void testIsPalindromeUsingManualStringReversal() {
        PalindromeNumber palindromeNumber = new PalindromeNumberUsingManualStringReversal();
        
        // Test cases
        assertTrue(palindromeNumber.isPalindrome(121));
        assertFalse(palindromeNumber.isPalindrome(-121));
        assertFalse(palindromeNumber.isPalindrome(10));
        assertTrue(palindromeNumber.isPalindrome(7));
        assertTrue(palindromeNumber.isPalindrome(0));
        assertTrue(palindromeNumber.isPalindrome(1234321));
        assertFalse(palindromeNumber.isPalindrome(1234567));
        assertFalse(palindromeNumber.isPalindrome(2147483647));
        assertTrue(palindromeNumber.isPalindrome(2147447412));
    }

    @Test
    public void testIsPalindromeUsingHalfNumberReversal() {
        PalindromeNumber palindromeNumber = new PalindromeNumberUsingHalfNumberReversalMethod();
        
        // Test cases
        assertTrue(palindromeNumber.isPalindrome(121));
        assertFalse(palindromeNumber.isPalindrome(-121));
        assertFalse(palindromeNumber.isPalindrome(10));
        assertTrue(palindromeNumber.isPalindrome(7));
        assertTrue(palindromeNumber.isPalindrome(0));
        assertTrue(palindromeNumber.isPalindrome(1234321));
        assertFalse(palindromeNumber.isPalindrome(1234567));
        assertFalse(palindromeNumber.isPalindrome(2147483647));
        assertTrue(palindromeNumber.isPalindrome(2147447412));
    }
}
