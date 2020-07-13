package com.github.programming.interviewbit.bit.manipulations;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumSetBits {

    public static int numSetBits(int A) {

        int count=0;
        while (A > 0) {
            count += A % 2;
            A = A >> 1;
        }
        return count;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.valueOf(bufferedReader.readLine());

        System.out.println(numSetBits(A));
    }
}
