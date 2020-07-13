package com.github.programming.interviewbit.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GCD {

    public static int gcd(int A, int B) {

        int main = 0;
        int remainder = 0;
        if (A > B) {
            main = A;
            remainder = B;
        } else {
            main = B;
            remainder = A;
        }
        while(remainder > 0) {
            int x = main % remainder;
            main = remainder;
            remainder = x;
        }
        return main;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        String[] input = str.split(" ");
        int A = Integer.valueOf(input[0]);
        int B = Integer.valueOf(input[1]);

        System.out.println(gcd(A, B));
    }
}
