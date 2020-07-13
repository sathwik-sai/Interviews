package com.github.programming.interviewbit.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Given an integer n, return the number of trailing zeroes in n!.
    Note: Your solution should be in logarithmic time complexity.

    Sol: look for cases that are above multiples of 5 like 26, 126 etc
 */
public class TrailingZeros {

    public static int trailingZeros(int A) {

        int divisor = 5;
        int count = 0;
        while(A/divisor >0) {
            count += A/divisor;
            divisor = divisor*5;
        }
        return count;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.valueOf(bufferedReader.readLine());

        System.out.println(trailingZeros(A));
    }
}
