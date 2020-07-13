package com.github.programming.interviewbit.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Given a column title as appears in an Excel sheet, return its corresponding column number.
    Example:
    A -> 1

    B -> 2

    C -> 3

    ...

    Z -> 26

    AA -> 27

    AB -> 28
 */

public class TitleToNumber {

    public static int titleToNumber(String A) {

        int number = 0;
        for(int i=0; i<A.length(); i++) {

            number = number*26 + (int) A.charAt(i) - 64;
        }
        return number;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String A = bufferedReader.readLine();

        System.out.println(titleToNumber(A));
    }
}
