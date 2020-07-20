package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindNumbers {

    public static int findNumbers(int[] nums) {

        int result=0;
        for (int i=0; i<nums.length; i++) {

            result += isEven(nums[i]);
        }
        return result;
    }

    public static int isEven(int num) {

        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        if (count % 2 == 0)
            return 1;
        else
            return 0;
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

        System.out.println(findNumbers(array));
    }
}
