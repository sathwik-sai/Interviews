package com.github.programming.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class ArrayUtils {

    public static int[] readIntArray() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();

        String[] input = line.split(" ");
        int size = Integer.parseInt(input[0]);

        int[] array = new int[size];
        for (int i=0; i<size; i++) {
            array[i] = Integer.valueOf(input[i+1]);
        }

        return array;
    }

    public static String[] readStringArray() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();

        String[] input = line.split(" ");
        int size = Integer.parseInt(input[0]);

        String[] array = new String[size];
        for (int i=0; i<size; i++) {
            array[i] = input[i+1];
        }

        return array;
    }

    public static int[][] readIntArray2D() throws Exception {

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

        return array;
    }

    public static String[][] readStringArray2D() throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String dimensions = bufferedReader.readLine();
        String[] dimensionsArray = dimensions.split(" ");
        int rowSize = Integer.valueOf(dimensionsArray[0]);
        int colSize = Integer.valueOf(dimensionsArray[1]);
        String[][] array = new String[rowSize][colSize];

        for (int i=0; i<rowSize; i++) {
            String row = bufferedReader.readLine();
            String[] rowArray = row.split(" ");
            for (int j=0; j<colSize; j++) {
                array[i][j] = rowArray[j];
            }
        }

        return array;
    }

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

    public static void printList(List<Integer> list) {

        for (int i : list) {

            System.out.print(i + " ");
        }
    }
}
