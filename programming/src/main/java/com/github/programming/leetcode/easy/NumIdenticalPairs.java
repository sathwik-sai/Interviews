package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
    Given an array of integers nums. A pair (i,j) is called good if nums[i] == nums[j] and i < j. Return the number of good pairs.

    Approach: Sort, traverse and use n,c,2 formula

    Another approach could be maintain map (int, count). everytime you see the int repeat add the previous count to final result,
        which will again be the same as n,c,2
 */

public class NumIdenticalPairs {

    public static int numIdenticalPairs(int[] nums) {

        int result=0, currentSum=1;
        Arrays.sort(nums);

        for (int i=1; i<nums.length; i++) {

            if (nums[i] == nums[i-1]) {
                currentSum += 1;
            } else {
                result += currentSum*(currentSum-1)/2;
                currentSum = 1;
            }
        }
        result += currentSum*(currentSum-1)/2;
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

        System.out.println(numIdenticalPairs(array));
    }
}
