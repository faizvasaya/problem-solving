package com.leetcode.collectionsinjava;

public class Image {

    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{Image: " + this.name + "}";
    }
}
