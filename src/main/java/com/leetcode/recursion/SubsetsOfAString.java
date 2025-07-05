package com.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfAString {

    public List<String> findIteratively(String str) {
        List<String> result = new ArrayList<>();
        result.add("");

        for (char character : str.toCharArray()) {
            int size = result.size();
            for (int idx = 0; idx < size; idx++) {
                result.add(result.get(idx) + character);
            }
        }

        result.remove(0);

        return result;
    }

    public void findRecursively(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        findRecursively(processed + ch, unprocessed.substring(1));
        findRecursively(processed, unprocessed.substring(1));
    }
}
