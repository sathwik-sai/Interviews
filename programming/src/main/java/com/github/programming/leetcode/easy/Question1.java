package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1 {

    private static final int MINUS = -1;

    public static int getMaxProduct(int[] nums) {

        if (nums.length <= 1) return Integer.MIN_VALUE;

        int highestPositive = Integer.MIN_VALUE;
        int secondHighestPositive = Integer.MIN_VALUE;

        int highestNegative = Integer.MIN_VALUE;
        int secondHighestNegative = Integer.MIN_VALUE;

        for (int num: nums) {
            int value = num-1;
            if (value < 0) {
                int positive = Math.abs(value);
                if (positive >= secondHighestNegative) {
                    if (positive >= highestNegative) {
                        secondHighestNegative = highestNegative;
                        highestNegative = positive;
                    } else {
                        secondHighestNegative = positive;
                    }
                }
            } else {
                if (value >= secondHighestPositive) {
                    if (value >= highestPositive) {
                        secondHighestPositive = highestPositive;
                        highestPositive = value;
                    } else {
                        secondHighestPositive = value;
                    }
                }
            }
        }

        if (secondHighestPositive == Integer.MIN_VALUE && secondHighestNegative == Integer.MIN_VALUE) {

            return MINUS*highestPositive*highestNegative;
        }

        if (secondHighestNegative != Integer.MIN_VALUE) {

            int positiveProduct = highestPositive*secondHighestPositive;
            int negativeProduct = highestNegative*secondHighestNegative;

            return positiveProduct > negativeProduct ? positiveProduct : negativeProduct;
        }

        return highestPositive*secondHighestPositive;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();

        String input[] = line.split(" ");
        int size = Integer.valueOf(input[0]);
        int A[] = new int[size];

        for (int i=0; i<size; i++) {
            A[i] = Integer.valueOf(input[i+1]);
        }

        System.out.println(getMaxProduct(A));
    }
}


// 8b7eef5c-5ad4-4fc8-b8e5-f8368597102b : 20
//


// maintain a stack for nodes
// push root to the stack
// while stack is not empty
//      pop the top element and fetch its components and insert


































