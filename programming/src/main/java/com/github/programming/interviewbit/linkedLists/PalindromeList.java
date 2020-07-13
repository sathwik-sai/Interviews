package com.github.programming.interviewbit.linkedLists;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PalindromeList {

    public static int IsPalindrome(ListNode A) {

        ListNode copy = A;
        int length = ListNode.length(A);
        for (int i=0; i<length/2; i++) {
            copy = copy.next;
        }
        if (length%2 != 0) copy = copy.next;
        ListNode some = reverseList(copy);

        for (int i=0; i<length/2; i++) {
            if (A.val == some.val) {
                A = A.next;
                some = some.next;
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static ListNode reverseList(ListNode A) {
        if (A==null || A.next == null) return A;
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

        System.out.println(IsPalindrome(head));
    }
}
