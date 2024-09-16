package com.leetcode.linkedlist;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void testSinglyLinkedList() {
        SinglyLinkedList list = new SinglyLinkedList();

        // Test: Append to an empty list
        list.append(1);
        assertEquals("1 -> null", listToString(list));

        // Test: Append multiple elements
        list.append(2);
        list.append(3);
        assertEquals("1 -> 2 -> 3 -> null", listToString(list));

        // Test: Prepend to non-empty list
        list.prepend(0);
        assertEquals("0 -> 1 -> 2 -> 3 -> null", listToString(list));

        // Test: Delete the head element
        list.delete(0);
        assertEquals("1 -> 2 -> 3 -> null", listToString(list));

        // Test: Delete a middle element
        list.delete(2);
        assertEquals("1 -> 3 -> null", listToString(list));

        // Test: Delete a non-existent element (should not change the list)
        list.delete(4);
        assertEquals("1 -> 3 -> null", listToString(list));

        // Test: Delete the head again
        list.delete(1);
        assertEquals("3 -> null", listToString(list));

        // Test: Delete remaining element
        list.delete(3);
        assertEquals("null", listToString(list));

        // Test: Delete from an empty list
        list.delete(1);
        assertEquals("null", listToString(list));

        // Test: Multiple operations together
        list.append(5);
        list.append(6);
        list.prepend(4);
        list.delete(5);
        assertEquals("4 -> 6 -> null", listToString(list));

        // Test: Prepend to an empty list
        SinglyLinkedList newList = new SinglyLinkedList();
        newList.prepend(1);
        assertEquals("1 -> null", listToString(newList));
    }

    // Helper method to convert the linked list to a string format for testing purposes
    private String listToString(SinglyLinkedList list) {
        SinglyLinkedList.Node current = list.head;
        StringBuilder result = new StringBuilder();
        while (current != null) {
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }
}
