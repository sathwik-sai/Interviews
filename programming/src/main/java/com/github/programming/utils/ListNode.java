package com.github.programming.utils;

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode constructListNode(int[] array) {
        if (array.length == 0) {
            return null;
        }

        ListNode node = new ListNode(array[0]);
        ListNode head = node, copy = head;
        for (int i=1; i<array.length; i++) {

            node = new ListNode(array[i]);
            copy.next = node;
            copy = copy.next;
        }
        return head;
    }
}
