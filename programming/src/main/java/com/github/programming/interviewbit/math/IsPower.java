package com.github.programming.interviewbit.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Given a positive integer which fits in a 32 bit signed integer,
    find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.
 */

public class IsPower {

    public static boolean isPower(int A) {

        if (A==1) return true;
        for (int i=2;i<=Math.sqrt(A);i++) {
            int pow = 2;
            while (Math.pow(i, pow) <= A * 1.0) {
                if (Math.pow(i, pow) == A * 1.0)
                    return true;
                pow++;
            }
        }
        return false;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.valueOf(bufferedReader.readLine());

        System.out.println(isPower(A));
    }
}
