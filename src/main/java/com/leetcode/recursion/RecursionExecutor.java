package com.leetcode.recursion;

import java.util.Arrays;

public class RecursionExecutor {

    public static void main(String[] args) {
        Print1 print1 = new Print1();
        print1.print();

        PrintNameNTimes nameNTimes = new PrintNameNTimes();
        nameNTimes.printWithoutGlobal(0, 5);

        Print1ToN print1ToN = new Print1ToN();
        System.out.println("1 to N");
        print1ToN.print(1, 5);

        System.out.println("N to 1");
        print1ToN.printReverse(5, 1);

        System.out.println("1 to N with BackTracking");
        print1ToN.printWithBackTracking(5, 1);

        System.out.println("N to 1 with BackTracking");
        print1ToN.printNTo1NWithBackTracking(1, 5);

        SumOfNNumber sumOfNNumber = new SumOfNNumber();
        System.out.println("Sum of N numbers");
        sumOfNNumber.sumTillN(100, 0);
        System.out.println(sumOfNNumber.sumTillNReturn(100));

        Factorial factorial = new Factorial();
        System.out.println("Factorial");
        System.out.println(factorial.calculate(10));

        ReverseAnArray reverseAnArray = new ReverseAnArray();
        reverseAnArray.reverse(new int[]{1, 2, 3, 4, 5});
        reverseAnArray.reverse(new int[]{1, 2, 3, 4});
        int[] reverseArray = new int[]{1, 2, 3};

        reverseAnArray.reverseUsingRecursion(reverseArray, 0, reverseArray.length - 1);

        System.out.println(Arrays.toString(reverseArray));

        reverseAnArray.revereUsingRecursionOneVariable(reverseArray, 0);

        System.out.println(Arrays.toString(reverseArray));

        PalindromeString palindromeString = new PalindromeString();
        System.out.println(palindromeString.isPalindrome("FAIZAL"));

        String str = "MADAM";

        System.out.println(palindromeString.isPalindromeViaRecursion(str, 0));

        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.find(10));
        System.out.println(fibonacci.findWithoutArrayList(10));
        System.out.println(fibonacci.findWithRecursion(10));
        System.out.println(fibonacci.findWithRecursionWithMemoization(30));
    }
}
