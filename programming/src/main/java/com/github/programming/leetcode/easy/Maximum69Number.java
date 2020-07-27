package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Given a positive integer num consisting only of digits 6 and 9.
    Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
 */

public class Maximum69Number {

    public static int maximum69Number (int num) {
        int count=0, lastSix=-1, result=num;
        while (num != 0) {
            int digit = num % 10;
            if (digit == 6)
                lastSix = count;
            num /= 10;
            count++;
        }
        result += 3*Math.pow(10, lastSix);
        return result;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int number = Integer.valueOf(str);

        System.out.println(maximum69Number(number));
    }
}