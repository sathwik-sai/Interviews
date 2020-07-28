package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
    Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order,
    return a sorted array of only the integers that appeared in all three arrays.

    Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
    Output: [1,5]
    Explanation: Only 1 and 5 appeared in the three arrays.
 */

public class ArraysIntersection {

    public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> res = findIntersection(arr1, arr2);
        int[] arr4 = new int[res.size()];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = res.get(i);
        }
        return findIntersection(arr3, arr4);
    }

    public static List<Integer> findIntersection(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        List<Integer> res = new ArrayList<>();
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                res.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return res;
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

        String line2 = bufferedReader.readLine();

        String[] input2 = line2.split(" ");
        int size2 = Integer.parseInt(input[0]);

        int[] array2 = new int[size2];
        for (int i=0; i<size2; i++) {
            array2[i] = Integer.parseInt(input2[i+1]);
        }

        String line3 = bufferedReader.readLine();

        String[] input3 = line3.split(" ");
        int size3 = Integer.parseInt(input3[0]);

        int[] array3 = new int[size3];
        for (int i=0; i<size; i++) {
            array3[i] = Integer.parseInt(input3[i+1]);
        }

        List<Integer> list = arraysIntersection(array, array2, array3);
        for (int i: list) {

            System.out.print(i + " ");
        }
    }
}
