package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Given a string S, return the number of substrings that have only one distinct letter.

    Input: S = "aaaba"
    Output: 8
    Explanation: The substrings with one distinct letter are "aaa", "aa", "a", "b".
    "aaa" occurs 1 time.
    "aa" occurs 2 times.
    "a" occurs 4 times.
    "b" occurs 1 time.
    So the answer is 1 + 2 + 4 + 1 = 8.
 */

public class CountLetters {

    public static int countLetters(String S) {
        int result=0, count=1;
        char prev = S.charAt(0);
        for (int i=1; i<S.length(); i++) {
            if (S.charAt(i) == prev) {
                count++;
            } else {
                result += (count*(count+1))/2;
                count = 1;
            }
            prev = S.charAt(i);
        }
        result += (count*(count+1))/2;
        return result;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();

        System.out.println(countLetters(line));
    }
}
