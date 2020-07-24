package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    The k-digit number N is an Armstrong number if and only if the k-th power of each digit sums to N.
    Given a positive integer N, return true if and only if it is an Armstrong number.

    Input: 153
    Output: true
    Explanation:
    153 is a 3-digit number, and 153 = 1^3 + 5^3 + 3^3.
 */

public class IsArmStrong {

    public static boolean isArmstrong(int N) {
        int length = 0, copy=N;
        while (N!=0) {
            length++;
            N = N/10;
        }
        double reminder=copy;
        while (copy!=0) {
            int digit = copy%10;
            reminder = reminder - Math.pow(digit, length);
            copy /= 10;
        }
        if (Math.abs(reminder) < 1)
            return true;
        return false;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();

        String[] input = line.split(" ");
        int N = Integer.parseInt(input[0]);

        System.out.println(isArmstrong(N));
    }
}
