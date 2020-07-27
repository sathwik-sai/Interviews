package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Given a string s and an integer array indices of the same length.
    The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
    Return the shuffled string.
 */

public class ShuffleString {

    public static String restoreString(String s, int[] indices) {
        StringBuilder str = new StringBuilder(s);
        for (int i=0; i<indices.length; i++) {
            str.setCharAt(indices[i], s.charAt(i));
        }
        return str.toString();
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        String line = bufferedReader.readLine();

        String[] input = line.split(" ");
        int size = Integer.parseInt(input[0]);

        int[] array = new int[size];
        for (int i=0; i<size; i++) {
            array[i] = Integer.parseInt(input[i+1]);
        }

        System.out.println(restoreString(str, array));
    }
}
