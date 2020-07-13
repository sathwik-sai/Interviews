package com.github.programming.leetcode.easy;

import static com.github.programming.utils.ArrayUtils.printArray;

public class RunningSum {

    public static int[] runningSum(int[] nums) {
        for (int i=1; i<nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4};
        printArray(runningSum(input));
    }
}
