package com.leetcode.collectionsinjava;

import java.util.Stack;

public class StackInJava {

    public void print() {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        System.out.println(stack.search(1));
    }
}
