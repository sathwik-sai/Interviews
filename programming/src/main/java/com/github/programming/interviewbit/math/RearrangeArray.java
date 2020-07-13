package com.github.programming.interviewbit.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
    Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.

    Example:
        Input : [1, 0]
        Return : [0, 1]

    Lets say N = size of the array. Then, following holds true :
        All elements in the array are in the range [0, N-1]
        N * N does not overflow for a signed integer
 */

public class RearrangeArray {

    public static ArrayList<Integer> rearrange(ArrayList<Integer> a) {

        //encode
        for (int i=0; i<a.size(); i++) {
            int newValue = a.get(a.get(i)) % a.size();
            int oldValue = a.get(i);
            int placeValue = newValue*a.size() + oldValue;
            a.remove(i);
            a.add(i, placeValue);
        }

        //decode
        for (int i=0; i<a.size(); i++) {
            int value = a.get(i)/a.size();
            a.remove(i);
            a.add(i, value);
        }

        return a;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        String[] str = input.split(" ");
        int size = Integer.valueOf(str[0]);
        ArrayList<Integer> A = new ArrayList<Integer>();
        for (int i=1; i<=size; i++) {
            A.add(Integer.valueOf(str[i]));
        }

        System.out.println(rearrange(A));
    }
}
