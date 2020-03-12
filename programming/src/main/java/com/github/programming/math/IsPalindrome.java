package com.github.programming.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Determine whether an integer is a palindrome. Do this without extra space.

    A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
    Negative numbers are not palindromic.
 */

public class IsPalindrome {

    public static boolean isPalindrome(int A) {

        if(A<0)
            return false;
        int B = A;
        int reverse = 0;
        while (A>0) {
            reverse = reverse*10 + A%10;
            A = A/10;
        }
        if (reverse == B)
            return true;
        else
            return false;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.valueOf(bufferedReader.readLine());

        System.out.println(isPalindrome(A));
    }
}
