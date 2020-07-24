package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

import static com.github.programming.utils.ArrayUtils.printArray;

/*
    Given two lists Aand B, and B is an anagram of A. B is an anagram of A means B is made by randomizing the order of the elements in A.
    We want to find an index mapping P, from A to B. A mapping P[i] = j means the ith element in A appears in B at index j.
    These lists A and B may contain duplicates. If there are multiple answers, output any of them.

    For example, given
        A = [12, 28, 46, 32, 50]
        B = [50, 12, 32, 46, 28]
        We should return [1, 4, 3, 2, 0]
        as P[0] = 1 because the 0th element of A appears at B[1], and P[1] = 4 because the 1st element of A appears at B[4], and so on.
 */

public class AnagramMappings {

    public static int[] anagramMappings(int[] A, int[] B) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[A.length];
        for (int i=0; i<B.length; i++) {
            map.put(B[i], i);
        }
        for (int i=0; i<A.length; i++) {
            result[i] = map.get(A[i]);
        }
        return result;
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

        String line2 = bufferedReader.readLine();

        String input2[] = line2.split(" ");
        int size2 = Integer.valueOf(input2[0]);
        int B[] = new int[size2];

        for (int i=0; i<size2; i++) {
            B[i] = Integer.valueOf(input2[i+1]);
        }

        printArray(anagramMappings(A, B));
    }
}
