package com.github.programming.interviewbit.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class FizzBuzz {

    public static ArrayList<String> fizzBuzz(int A) {

        ArrayList<String> output = new ArrayList<String>();
        for(int i=1; i<=A; i++) {
            if (i % 15 == 0) {
                output.add("FizzBuzz");
            } else if (i % 3 == 0) {
                output.add("Fizz");
            } else if (i % 5 == 0){
                output.add("Buzz");
            } else {
                output.add(String.valueOf(i));
            }
        }
        return output;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.valueOf(bufferedReader.readLine());

        System.out.println(fizzBuzz(input));
    }
}
