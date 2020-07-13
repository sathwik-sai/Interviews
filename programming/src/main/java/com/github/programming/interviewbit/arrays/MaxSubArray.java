package com.github.programming.interviewbit.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
    Find the contiguous subarray within an array, A of length N which has the largest sum.
    Sol:
        Simple idea of the Kadane’s algorithm is to look for all positive contiguous segments of the array
        (max_ending_here is used for this). And keep track of maximum sum contiguous segment among all positive
        segments (max_so_far is used for this). Each time we get a positive sum compare it with max_so_far and
        update max_so_far if it is greater than max_so_far

    Exception handling in case of negative number array, make sure you are returning highest among them
 */

public class MaxSubArray {

    public static int maxSubArray(ArrayList<Integer> A) {

        int max_ending_here = 0;
        int max_so_far = 0;
        int max = Integer.MIN_VALUE;

        for (int a: A) {
            if (a > max) max = a;
            max_ending_here += a;
            if (max_ending_here < 0) {
                max_ending_here = 0;
            } else if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
        }

        if(max < 0) return max;
        return max_so_far;
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

        System.out.println(maxSubArray(A));
    }
}
