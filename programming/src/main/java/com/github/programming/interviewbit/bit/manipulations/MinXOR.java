package com.github.programming.interviewbit.bit.manipulations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MinXOR {

    public static int minXOR(ArrayList<Integer> A) {

        int min = Integer.MAX_VALUE;
        Collections.sort(A);
        for (int i=0; i<A.size()-1; i++) {

            int value = A.get(i) ^ A.get(i+1);
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();

        String[] str = input.split(" ");
        int size = Integer.valueOf(str[0]);
        ArrayList<Integer> A = new ArrayList<Integer>();
        for (int i=1; i<=size; i++) {
            A.add(Integer.valueOf(str[i]));
        }

        System.out.println(minXOR(A));
    }
}
