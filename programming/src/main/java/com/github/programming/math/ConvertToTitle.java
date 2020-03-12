package com.github.programming.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Given a positive integer, return its corresponding column title as appear in an Excel sheet.
    For example:
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB
 */

public class ConvertToTitle {

    public static String convertToTitle(int A) {

        String output = "";

        while(A>0) {
            if(A % 26 == 0) {
                output = 'Z' + output;
                A = A-1;
            } else {

                char a = (char) ((A % 26) + 64);
                output = a + output;
            }
            A = A/26;
        }

        return output;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.valueOf(bufferedReader.readLine());

        System.out.println(convertToTitle(A));
    }
}
