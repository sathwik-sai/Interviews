package com.github.programming.interviewbit.math;

public class PrimeOrNot {

    public static boolean isPrime(int A) {

        if (A == 1) return false;

        int sqrt = (int) Math.sqrt(A);

        for (int i=2; i <= sqrt; i++) {

            if (A % i == 0) return false;
        }

        return true;
    }

    public static void main(String args[]) {

        System.out.println(isPrime(16));
    }
}
