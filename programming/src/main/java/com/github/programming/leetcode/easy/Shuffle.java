package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static com.github.programming.utils.ArrayUtils.printArray;

/*
    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

    Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */

public class Shuffle {

    public static int[] shuffle(int[] nums, int n) {

        int[] result = new int[2*n];

        for (int i=0; i<n; i++) {
            result[2*i] = nums[i];
            result[2*i+1] = nums[n+i];
        }
        return result;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();

        String[] input = line.split(" ");
        int size = Integer.parseInt(input[0]);

        int[] array = new int[size];
        for (int i=0; i<size; i++) {
            array[i] = Integer.parseInt(input[i+1]);
        }

        printArray(shuffle(array, size/2));
    }
}
