package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Balanced strings are those who have equal quantity of 'L' and 'R' characters. Given a
    balanced string s split it in the maximum amount of balanced strings. Return the maximum
    amount of splitted balanced strings.

    Input: s = "RLLLLRRRLR"
    Output: 3
    Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
 */

public class BalancedStringSplit {

    public static int balancedStringSplit(String s) {

        int result = 0, polarity = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'R') {
                polarity++;
            } else {
                polarity--;
            }
            if (polarity == 0)
                result++;
        }

        return result;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        System.out.println(balancedStringSplit(str));
    }

}
