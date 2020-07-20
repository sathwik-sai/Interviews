package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static com.github.programming.utils.ArrayUtils.printArray;

/*
    We are given a list nums of integers representing a list compressed with run-length encoding.
    Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.
    Return the decompressed list.

    Example:
    Input: nums = [1,2,3,4]
    Output: [2,4,4,4]
    Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
    The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
    At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
 */

public class DecompressRLElist {

    public static int[] decompressRLElist(int[] nums) {

        int p=0, total=0;
        for (int i=0; i<nums.length; i+=2) {
            total += nums[i];
        }
        int[] result = new int[total];
        for (int i=0; i<nums.length/2; i++) {
            for (int j=0; j<nums[2*i];j++) {
                result[p] = nums[2*i+1];
                p++;
            }
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

        printArray(decompressRLElist(array));
    }
}
