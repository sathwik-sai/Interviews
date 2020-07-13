package com.github.programming.interviewbit.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
    You are in an infinite 2D grid where you can move in any of the 8 directions :
    (x,y) to
        (x+1, y),
        (x - 1, y),
        (x, y+1),
        (x, y-1),
        (x-1, y-1),
        (x+1,y+1),
        (x-1,y+1),
        (x+1,y-1)

    You are given a sequence of points and the order in which you need to cover the points.
    Give the minimum number of steps in which you can achieve it. You start from the first point.

    Example:
        Input : [(0, 0), (1, 1), (1, 2)]
        Output : 2
 */
public class CoverPoints {

    public static int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {

        int output = 0;

        for (int i=0; i<A.size()-1; i++) {
            output += Math.max(Math.abs(A.get(i) - A.get(i+1)), Math.abs(B.get(i) - B.get(i+1)));
        }

        return output;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = reader.readLine();
        String line2 = reader.readLine();

        String[] input1 = line1.split(" ");
        int size1 = Integer.parseInt(input1[0]);

        ArrayList<Integer> A = new ArrayList<Integer>();
        for (int i=1; i<=size1; i++) {
            A.add(Integer.parseInt(input1[i]));
        }

        String[] input2 = line2.split(" ");
        int size2 = Integer.parseInt(input1[0]);

        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i=1; i<=size2; i++) {
            B.add(Integer.parseInt(input2[i]));
        }

        System.out.println(coverPoints(A, B));
    }
}
