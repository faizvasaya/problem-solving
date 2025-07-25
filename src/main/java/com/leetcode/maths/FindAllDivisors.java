package com.leetcode.maths;

import java.util.ArrayList;
import java.util.List;

public class FindAllDivisors {

    /**
     * Time Complexity: O(n)
     */
    public void find(int n) {

        System.out.println(getClass().getName());

        if (n == 0) {
            System.out.println(0);
        }

        if (n < 0) {
            n = -n;
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * Time Complexity: O(Root N)
     *
     * @param n
     */
    public void findUsingSquareRoot(int n) {

        System.out.println(getClass().getName());

        List<Integer> divisors = new ArrayList<Integer>();

        if (n == 0) {
            System.out.println(0);
        }

        if (n < 0) {
            n = -n;
        }

        int squareRoot = (int) Math.sqrt(n);

        for (int i = 1; i <= squareRoot; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }

        divisors.sort(
                (a, b) -> {
                    return a - b;
                }
        );

        System.out.println(divisors);
    }
}
