package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
    Students are asked to stand in non-decreasing order of heights for an annual photo.
    Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.
    Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats.

    Input: heights = [1,1,4,2,1,3]
    Output: 3
    Explanation:
    Current array : [1,1,4,2,1,3]
    Target array  : [1,1,1,2,3,4]
    On index 2 (0-based) we have 4 vs 1 so we have to move this student.
    On index 4 (0-based) we have 1 vs 3 so we have to move this student.
    On index 5 (0-based) we have 3 vs 4 so we have to move this student.
*/

public class HeightChecker {

    public static int heightChecker(int[] heights) {
        int[] copy = heights.clone();
        Arrays.sort(copy);
        int result=0;
        for (int i=0; i<heights.length; i++) {
            if (copy[i] != heights[i])
                result++;
        }
        return result;
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

        System.out.println(heightChecker(array));
    }
}
