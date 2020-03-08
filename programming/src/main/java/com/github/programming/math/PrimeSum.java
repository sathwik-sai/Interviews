package com.github.programming.math;

import java.util.ArrayList;

import static com.github.programming.math.PrimeOrNot.isPrime;

/*
    Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.
    Solution always exist: https://en.wikipedia.org/wiki/Goldbach%27s_conjecture
 */

public class PrimeSum {

    public static ArrayList<Integer> primeSum(int A) {
        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int i=2; i<=A/2; i++) {
            if (isPrime(i) && isPrime(A-i)) {
                output.add(i);
                output.add(A-i);
                break;
            }
        }

        return output;
    }

    public static void main(String args[]) {

        System.out.println(primeSum(12));
    }
}
