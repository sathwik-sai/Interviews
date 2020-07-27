package com.github.programming.utils;

public class ArrayUtils {

    public static void printArray(int[] array) {

        for (int i=0; i<array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }

    public static void printArray2D(int[][] array) {

        for (int i=0; i<array.length; i++) {

            for (int j=0; j<array[0].length; j++) {

                System.out.print(array[i][j] + " ");
            }
        }
    }
}
