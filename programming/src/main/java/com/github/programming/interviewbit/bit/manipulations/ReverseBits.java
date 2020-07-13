package com.github.programming.interviewbit.bit.manipulations;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseBits {

    public static long reverseBits(long A) {

        long output = 0;

        for (int i=0; i<32; i++) {

            output = output << 1;
            if ((A & (1 << i)) != 0) {
                output = output | 1;
            }
        }
        return output;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long A = Long.valueOf(bufferedReader.readLine());

        System.out.println(reverseBits(A));
    }
}
