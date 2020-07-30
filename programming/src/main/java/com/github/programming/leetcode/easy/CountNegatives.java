package com.github.programming.leetcode.easy;

import com.github.programming.utils.ArrayUtils;

public class CountNegatives {

    public static int countNegatives(int[][] grid) {
        int row=grid.length, col=grid[0].length, result=0;
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (grid[i][j] < 0) {
                    result += (col-j)*(row-i);
                    col = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {

        int[][] array = ArrayUtils.readIntArray2D();
        System.out.println(countNegatives(array));
    }
}
