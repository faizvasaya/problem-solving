package com.leetcode.patterns;

public class DistanceFromCenterNumbers {

    public void print(int n) {
        int lines = (2 * n) - 1;

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines; j++) {
                int number = n - Math.min(Math.min(i, j), Math.min(lines - j - 1, lines - i - 1));
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
