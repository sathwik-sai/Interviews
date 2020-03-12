package com.github.programming.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
    Given a non-negative number represented as an array of digits, add 1 to the number
    ( increment the number represented by the digits ). The digits are stored such that the
    most significant digit is at the head of the list.

    Example:
    If the vector has [1, 2, 3] the returned vector should be [1, 2, 4] as 123 + 1 = 124.

    Corner cases:
    000123 = 124
    999 = 1000
 */
public class PlusOne {

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        int carry = 1;

        for (int i=A.size()-1; i>=0; i--) {

            B.add(0, (A.get(i)+carry) % 10);
            carry = (A.get(i)+carry) / 10;
        }

        if (carry == 1)
            B.add(0, 1);

        for (int i=0; i<B.size(); i++) {

            if (B.get(i) == 0) {
                B.remove(i);
                i--;
            } else {
                break;
            }
        }
        return B;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        String[] inputArray = input.split(" ");
        int size = Integer.parseInt(inputArray[0]);

        ArrayList<Integer> A = new ArrayList<Integer>();
        for (int i=1; i<=size; i++) {
            A.add(Integer.parseInt(inputArray[i]));
        }

        System.out.println(plusOne(A));
    }

}
