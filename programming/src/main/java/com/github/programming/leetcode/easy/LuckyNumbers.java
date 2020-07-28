package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static com.github.programming.utils.ArrayUtils.printList;

/*
    Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
    A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

    Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
    Output: [15]
    Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column
 */

public class LuckyNumbers {

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> rows = new ArrayList<Integer>();
        List<Integer> cols = new ArrayList<Integer>();
        for (int i=0; i<row; i++) {
            int min = Integer.MAX_VALUE;
            for (int j=0; j<col; j++) {
                if (matrix[i][j] < min)
                    min = matrix[i][j];
            }
            rows.add(min);
        }
        for (int i=0; i<col; i++) {
            int max = Integer.MIN_VALUE;
            for (int j=0; j<row; j++) {
                if (matrix[j][i] > max)
                    max = matrix[j][i];
            }
            cols.add(max);
        }
        for (int i: rows) {
            if (cols.contains(i))
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String dimensions = bufferedReader.readLine();
        String[] dimensionsArray = dimensions.split(" ");
        int rowSize = Integer.valueOf(dimensionsArray[0]);
        int colSize = Integer.valueOf(dimensionsArray[1]);
        int[][] array = new int[rowSize][colSize];

        for (int i=0; i<rowSize; i++) {
            String row = bufferedReader.readLine();
            String[] rowArray = row.split(" ");
            for (int j=0; j<colSize; j++) {
                array[i][j] = Integer.parseInt(rowArray[j]);
            }
        }

        printList(luckyNumbers(array));
    }
}
