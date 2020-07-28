package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
    Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.

    Input: arr = [1,2,2,1,1,3]
    Output: true
    Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 */

public class UniqueOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i=0; i<arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int val = map.get(arr[i]);
                map.put(arr[i],++val);
            } else {
                map.put(arr[i],1);
            }
        }
        Set values = new HashSet<Integer>(map.values());
        if (map.size() == values.size())
            return true;
        return false;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();

        String[] input = line.split(" ");
        int size = Integer.parseInt(input[0]);

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(input[i + 1]);
        }

        System.out.println(uniqueOccurrences(array));
    }
}
