package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    There is a special keyboard with all keys in a single row.

    Given a string keyboard of length 26 indicating the layout of the keyboard (indexed from 0 to 25), initially your finger is at index 0. To type a character, you have to move your finger to the index of the desired character. The time taken to move your finger from index i to index j is |i - j|.

    You want to type a string word. Write a function to calculate how much time it takes to type it with one finger.
 */

public class CalculateTime {

    public static int calculateTime(String keyboard, String word) {

        int prev_index = 0, sum = 0;
        for (int i=0; i<word.length(); i++) {
            int current = keyboard.indexOf(word.charAt(i));
            sum += Math.abs(current-prev_index);
            prev_index = current;
        }

        return sum;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String keyboard = bufferedReader.readLine();
        String word = bufferedReader.readLine();

        System.out.println(calculateTime(keyboard, word));
    }
}
