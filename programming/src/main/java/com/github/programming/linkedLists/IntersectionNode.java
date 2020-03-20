package com.github.programming.linkedLists;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Write a program to find the node at which the intersection of two singly linked lists begins.

    A:          a1 → a2
                         ↘
                             c1 → c2 → c3
                         ↗
    B:     b1 → b2 → b3
    The above 2 linked lists begin to intersect at c1
 */

public class IntersectionNode {

    public static ListNode getIntersectionNode(ListNode a, ListNode b) {

        int A = length(a);
        int B = length(b);
        if (A==0 && B==0) return null;
        if (A > B) {

            for (int i=0; i<A-B; i++) {
                a = a.next;
            }
        } else if (A < B) {
            for (int i=0; i<B-A; i++) {
                b = b.next;
            }
        }
        while (a != null) {

            if (a == b)
                return a;
            a = a.next;
            b = b.next;
        }
        return null;
    }

    public static int length(ListNode A) {

        int length = 0;
        while (A != null) {
            A = A.next;
            length++;
        }
        return length;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        String[] str = input.split(" ");
        int size = Integer.valueOf(str[0]);

        ListNode head1 = null, tail1 = null;
        for (int i=1; i<=size; i++) {
            if (i==1) {
                head1 = new ListNode(Integer.valueOf(str[i]));
                tail1 = head1;
            }
            else {
                ListNode current = new ListNode(Integer.valueOf(str[i]));
                tail1.next = current;
                tail1 = current;
            }
        }

        String input2 = bufferedReader.readLine();
        String[] str2 = input2.split(" ");
        int size2 = Integer.valueOf(str2[0]);

        ListNode head2 = null, tail2 = null;
        for (int i=1; i<=size2; i++) {
            if (i==1) {
                head2 = new ListNode(Integer.valueOf(str2[i]));
                tail2 = head2;
            }
            else {
                ListNode current = new ListNode(Integer.valueOf(str2[i]));
                tail2.next = current;
                tail2 = current;
            }
        }

        String input3 = bufferedReader.readLine();
        String[] str3 = input3.split(" ");
        int size3 = Integer.valueOf(str3[0]);
        ListNode head3 = null, tail3 = null;
        for (int i=1; i<=size3; i++) {
            if (i==1) {
                head3 = new ListNode(Integer.valueOf(str3[i]));
                tail3 = head3;
            }
            else {
                ListNode current = new ListNode(Integer.valueOf(str3[i]));
                tail3.next = current;
                tail3 = current;
            }
        }
        tail1.next = head3;
        tail2.next = head3;

        ListNode.printLL(getIntersectionNode(head1, head2));
    }
}
