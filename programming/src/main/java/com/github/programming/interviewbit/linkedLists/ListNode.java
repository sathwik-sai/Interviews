package com.github.programming.interviewbit.linkedLists;

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

    public static int length(ListNode A) {

        int length = 0;
        while (A != null) {
            A = A.next;
            length++;
        }
        return length;
    }
}
