package com.leetcode.collectionsinjava;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapInJava {

    public void print() {
        WeakHashMap<String, Image> hm = new WeakHashMap<>();
        loadCache(hm);
        System.out.println(hm);
        System.gc();
        simulateApplicationRunning();
        System.out.println(hm);

    }

    public static void loadCache(Map<String, Image> hm) {
        String img1 = new String("image1");
        String img2 = new String("image2");

        hm.put(img1, new Image("image1.png"));
        hm.put(img2, new Image("image2.png"));
    }

    public static void simulateApplicationRunning() {
        try {
            System.out.println("Application running...");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
