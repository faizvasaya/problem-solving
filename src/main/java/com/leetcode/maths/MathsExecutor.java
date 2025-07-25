package com.leetcode.maths;

public class MathsExecutor {

    public static void main(String[] args) {
        ExtractAllDigits extractAllDigits = new ExtractAllDigits();
        extractAllDigits.extract(59803111);

        CountNumberOfDigits countNumberOfDigits = new CountNumberOfDigits();
        System.out.println(countNumberOfDigits.count(-1));
        System.out.println(countNumberOfDigits.countUsingLog10(1425347000));

        ReverseANumber reverseANumber = new ReverseANumber();
        System.out.println(reverseANumber.reverse(7899));

        CheckPalindrome checkPalindrome = new CheckPalindrome();
        System.out.println(checkPalindrome.check(121));

        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        System.out.println(armstrongNumber.isArmstrong(371));

        FindAllDivisors allDivisors = new FindAllDivisors();
        allDivisors.findUsingSquareRoot(36);

        PrimeNumbers numbers = new PrimeNumbers();
        System.out.println(numbers.isPrime(36));

        GCD gcd = new GCD();
        gcd.find(145896, 412358);
    }
}
