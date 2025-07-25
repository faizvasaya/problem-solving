package com.leetcode.maths;

public class PrimeNumbers {

    public boolean isPrime(int n) {
        System.out.println(getClass().getName());

        int count = 0;
        int squareRootOfN = (int) Math.sqrt(n);
        for (int i = 1; i <= squareRootOfN; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
        }

        return count == 1;
    }
}
