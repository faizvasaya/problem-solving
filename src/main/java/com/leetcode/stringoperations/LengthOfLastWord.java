package com.leetcode.stringoperations;

import java.util.Arrays;

public class LengthOfLastWord {
    public int find(String s){
        System.out.println(Arrays.toString(s.split(" ")));
        String[] string =  s.split(" ");
        return string[string.length - 1].length();
    }
}
