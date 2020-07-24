package com.github.programming.leetcode.easy;

import com.github.programming.utils.ListNode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Given head which is a reference node to a singly-linked list. The value of each node in the
    linked list is either 0 or 1. The linked list holds the binary representation of a number.
    Return the decimal value of the number in the linked list.
 */

import static com.github.programming.utils.ListNode.constructListNode;

public class GetDecimalValue {

    public static int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            result = 2*result + head.val;
            head = head.next;
        }
        return result;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();

        String[] input = line.split(" ");
        int size = Integer.parseInt(input[0]);

        int[] array = new int[size];
        for (int i=0; i<size; i++) {
            array[i] = Integer.parseInt(input[i+1]);
        }

        System.out.println(getDecimalValue(constructListNode(array)));
    }
}
