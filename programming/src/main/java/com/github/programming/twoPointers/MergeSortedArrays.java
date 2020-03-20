package com.github.programming.twoPointers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MergeSortedArrays {

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {

        int i=0, j=0, m=a.size(), n=b.size();
        while (i<m && j<n) {
            if (a.get(i) <= b.get(j)) {
                i++;
            } else {
                a.add(i, b.get(j));
                m++; i++; j++;
            }
        }

        for (int x=j;j<n;j++)
            a.add(b.get(j));

        return a;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = bufferedReader.readLine();
        String[] firstStr = firstLine.split(" ");
        int size = Integer.valueOf(firstStr[0]);
        ArrayList<Integer> A = new ArrayList<Integer>();
        for (int i=1; i<=size; i++) {
            A.add(Integer.valueOf(firstStr[i]));
        }

        String secondLine = bufferedReader.readLine();
        String[] secondStr = secondLine.split(" ");
        int secondSize = Integer.valueOf(secondStr[0]);
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i=1; i<=secondSize; i++) {
            B.add(Integer.valueOf(secondStr[i]));
        }

        System.out.println(merge(A, B));
    }
}
