package com.leetcode.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public int find(int n) {
        ArrayList<Integer> fibonacci = new ArrayList<>();

        fibonacci.add(0);
        fibonacci.add(1);

        for (int i = 2; i <= n; i++) {
            fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
        }

        return fibonacci.get(n);
    }

    public int findWithoutArrayList(int n) {
        int initialFibonacci = 0;
        int secondFibonacci = 1;

        for (int i = 2; i <= n; i++) {
            int sum = initialFibonacci + secondFibonacci;
            initialFibonacci = secondFibonacci;
            secondFibonacci = sum;
        }

        return secondFibonacci;
    }

    /**
     * Time Complexity: O(2^n) Space Complexity: O(2^n)
     */
    public int findWithRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        int first = findWithRecursion(n - 1);
        int second = findWithRecursion(n - 2);

        return first + second;
    }

    private Map<Integer, Integer> fibonacciValues = new HashMap<Integer, Integer>();

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int findWithRecursionWithMemoization(int n) {
        if (n <= 1) {
            return n;
        }

        if (fibonacciValues.containsKey(n)) {
            return fibonacciValues.get(n);
        }

        int first = findWithRecursion(n - 1);
        int second = findWithRecursion(n - 2);

        fibonacciValues.put(n, first + second);

        return first + second;
    }
}
