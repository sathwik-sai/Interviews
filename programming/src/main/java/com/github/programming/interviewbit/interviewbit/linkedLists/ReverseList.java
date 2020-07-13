package com.github.programming.interviewbit.linkedLists;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Reverse a linked list. Do it in-place and in one-pass.

    For example:

    Given 1->2->3->4->5->NULL, return 5->4->3->2->1->NULL.
 */

public class ReverseList {

    public static ListNode reverseList(ListNode A) {

        if (A==null || A.next==null) return A;
        ListNode current=A, prev=null, next=A.next;
        while (next != null) {
            ListNode temp = next.next;
            current.next = prev;
            prev = current;
            current = next;
            next = temp;
        }
        current.next = prev;
        A = current;
        return A;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        String[] str = input.split(" ");
        int size = Integer.valueOf(str[0]);

        ListNode head = null, tail = null;
        for (int i = 1; i <= size; i++) {
            if (i == 1) {
                head = new ListNode(Integer.valueOf(str[i]));
                tail = head;
            } else {
                ListNode current = new ListNode(Integer.valueOf(str[i]));
                tail.next = current;
                tail = current;
            }
        }

        ListNode.printLL(reverseList(head));
    }
}
