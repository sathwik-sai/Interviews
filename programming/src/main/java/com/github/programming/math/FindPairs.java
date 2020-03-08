package com.github.programming.math;

import java.util.ArrayList;

public class FindPairs {

    public static ArrayList<ArrayList<Integer>> findPairs(int A) {

        ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();

        for (int a = 0; a*a < A; a++) {
            for (int b = a; b*b < A; b++) {
                if (a*a + b*b == A) {

                    ArrayList<Integer> pair = new ArrayList<Integer>();
                    pair.add(a);
                    pair.add(b);
                    output.add(pair);
                }
            }
        }

        return output;
    }

    public static void main(String args[]) {

        System.out.println(findPairs(20));
    }
}
