package com.github.programming.linkedLists;

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        next = null;
    }

    public static void printLL(ListNode A) {

        while (A != null) {
            System.out.print(A.val + " -> ");
            A = A.next;
        }
        System.out.println("NULL");
    }
}