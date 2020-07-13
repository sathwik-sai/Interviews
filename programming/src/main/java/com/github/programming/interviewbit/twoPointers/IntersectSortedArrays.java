package com.github.programming.interviewbit.twoPointers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class IntersectSortedArrays {

    public static ArrayList<Integer> intersect(ArrayList<Integer> A, ArrayList<Integer> B) {

        ArrayList<Integer> output = new ArrayList<Integer>();
        int i=0,j=0,m=A.size(),n=B.size();
        while(i<m && j<n) {
            if (A.get(i) == B.get(j)) {
                output.add(A.get(i));
                i++; j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }

//        int size = output.size();
//        for (int x=0; x<size-1; x++) {
//            if (output.get(x) == output.get(x+1)) {
//                output.remove(x+1);
//                size--;
//            }
//        }

        return output;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = bufferedReader.readLine();
        String[] firstStr = firstLine.split(" ");
        int size = Integer.valueOf(firstStr[0]);
        ArrayList<Integer> A = new ArrayList<Integer>();
        for (int i = 1; i <= size; i++) {
            A.add(Integer.valueOf(firstStr[i]));
        }

        String secondLine = bufferedReader.readLine();
        String[] secondStr = secondLine.split(" ");
        int secondSize = Integer.valueOf(secondStr[0]);
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 1; i <= secondSize; i++) {
            B.add(Integer.valueOf(secondStr[i]));
        }

        System.out.println(intersect(A, B));
    }
}
