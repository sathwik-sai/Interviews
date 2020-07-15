package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Given an integer n and an integer start.

    Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.

    Return the bitwise XOR of all elements of nums.
 */

public class XOROperation {

    public static int xorOperation(int n, int start) {
        int result = 0;
        for (int i=0; i<n; i++) {
            result = result ^ (start+2*i);
        }
        return result;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bufferedReader.readLine());
        int start = Integer.valueOf(bufferedReader.readLine());

        System.out.println(xorOperation(n, start));
    }
}
