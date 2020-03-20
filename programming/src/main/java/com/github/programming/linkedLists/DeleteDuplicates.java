package com.github.programming.linkedLists;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Given a sorted linked list, delete all duplicates such that each element appear only once.

    For example,
    Given 1->1->2, return 1->2.
    Given 1->1->2->3->3, return 1->2->3.
 */

public class DeleteDuplicates {

    public static ListNode deleteDuplicates(ListNode A) {

        if (A == null) return A;
        ListNode current = A;
        ListNode next = current.next;
        while (next != null) {
            if (current.val == next.val) {
                ListNode temp = next.next;
                current.next = temp;
                next = temp;
            } else {
                ListNode temp = next.next;
                current = next;
                next = temp;
            }
        }
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

        ListNode.printLL(deleteDuplicates(head));
    }
}
