package com.github.programming.interviewbit.bit.manipulations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SingleNumber {

    public static int singleNumber(ArrayList<Integer> A) {

        int output = A.get(0);
        for (int i=1; i< A.size(); i++) {

            output = output ^ A.get(i);
        }

        return output;
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

        System.out.println(singleNumber(A));
    }
}
