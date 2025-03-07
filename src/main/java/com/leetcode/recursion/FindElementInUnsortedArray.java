package com.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class FindElementInUnsortedArray {

    public boolean find(int[] array, int target) {
        int index = 0;
        while (index < array.length) {
            if (array[index] == target) {
                return true;
            }
            index++;
        }
        return false;
    }

    public boolean findUsingRecursion(int[] array, int target, int index) {
        if (index == array.length) {
            return false;
        }

        return array[index] == target || findUsingRecursion(array, target, ++index);
    }

    public int findPositionUsingRecursion(int[] array, int target, int index) {
        if (index == array.length) {
            return -1;
        }

        if (array[index] == target) {
            return index + 1;
        }

        return findPositionUsingRecursion(array, target, index + 1);
    }

    public List<Integer> findAllPositionUsingRecursion(int[] array, int target, int index, List<Integer> positions) {
        if (index == array.length) {
            return positions;
        }

        if (array[index] == target) {
            positions.add(index + 1);
        }

        return findAllPositionUsingRecursion(array, target, index + 1, positions);
    }

    public List<Integer> findAllPositionUsingRecursionWithOutArrayListInArgs(int[] array, int target, int index) {
        ArrayList<Integer> positions = new ArrayList<>();

        if (index == array.length) {
            return positions;
        }

        if (array[index] == target) {
            positions.add(index + 1);
        }

        positions.addAll(findAllPositionUsingRecursionWithOutArrayListInArgs(array, target, index + 1));

        return positions;
    }
}
