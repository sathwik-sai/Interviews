package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static com.github.programming.utils.ArrayUtils.printArray;

/*
    Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
    That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
    Return the answer in an array.

    O(n) -- but this is possible because of a constraint '0 <= nums[i] <= 100'
 */

public class SmallerNumbersThanCurrent {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] checkSum = new int[101];
        for (int i=0; i<nums.length; i++) {
            checkSum[nums[i]] += 1;
        }
        int out = 0;
        int[] oldCheckSum = checkSum.clone();
        for (int i=0; i<checkSum.length; i++) {
            out += checkSum[i];
            checkSum[i] = out;
        }

        for (int i=0; i<checkSum.length; i++) {

            checkSum[i] -= oldCheckSum[i];
        }

        int[] result = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            result[i] = checkSum[nums[i]];
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

        printArray(smallerNumbersThanCurrent(array));
    }
}
