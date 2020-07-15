package com.github.programming.leetcode.easy;

/*
    Given a non-negative integer num, return the number of steps to reduce it to zero.
    If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumerOfSteps {

    public static int numberOfSteps(int num) {

        if (num == 0) {
            return 0;
        } else if (num % 2 == 0) {
            return 1 + numberOfSteps(num/2);
        } else {
            return 1 + numberOfSteps(num-1);
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bufferedReader.readLine());
        System.out.println(numberOfSteps(n));
    }
}
