package com.github.programming.interviewbit.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*

    Reverse digits of an integer. Return 0 if the result overflows and does not fit in a 32 bit signed integer
 */

public class ReverseInteger {

    public static int reverse2(int A) {

        long ret = 0;
        while(A>0) {
            ret = ret*10 + A%10;
            A /= 10;
        }
        // Alternate to this we can also Math.multiplyExact and Math.addExact of java 8
        if (ret > Integer.MAX_VALUE) return 0;
        return (int) ret;
    }
    public static int reverse(int A) {

        if (A<0)
            return reverse2(-1*A);
        else
            return reverse2(A);
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.valueOf(bufferedReader.readLine());

        System.out.println(reverse(A));
    }
}
