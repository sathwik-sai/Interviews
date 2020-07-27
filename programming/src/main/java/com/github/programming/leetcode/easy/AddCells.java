package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Given n and m which are the dimensions of a matrix initialized by zeros and given an array indices
    where indices[i] = [ri, ci]. For each pair of [ri, ci] you have to increment all cells in row ri and column ci by 1.

    Return the number of cells with odd values in the matrix after applying the increment to all indices.

    Input format:
    2
    3
    2 0 1 1 1
    for 2X3 matrix and indices array as [[0,1],[1,1]]
 */

public class AddCells {

    public static int oddCells(int n, int m, int[][] indices) {
        int[] rows = new int[n];
        int[] cols = new int[m];
        for (int i=0; i<indices.length; i++) {
            rows[indices[i][0]]++;
            cols[indices[i][1]]++;
        }
        int output = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if ((rows[i] + cols[j]) % 2 != 0) {
                    output++;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String row = bufferedReader.readLine();
        int rowSize = Integer.valueOf(row);

        String col = bufferedReader.readLine();
        int colSize = Integer.valueOf(col);

        String line = bufferedReader.readLine();
        String[] input = line.split(" ");
        int size = Integer.parseInt(input[0]);

        int[][] array = new int[size][2];
        for (int i=0; i<size; i++) {
            array[i][0] = Integer.parseInt(input[i*2+1]);
            array[i][1] = Integer.parseInt(input[i*2+2]);
        }

        System.out.println(oddCells(rowSize, colSize, array));
    }
}
