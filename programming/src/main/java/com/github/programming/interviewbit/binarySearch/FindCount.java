package com.github.programming.interviewbit.binarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
    Given a sorted array of integers, find the number of occurrences of a given target value.
    Your algorithm’s runtime complexity must be in the order of O(log n).
    If the target is not found in the array, return 0
 */

public class FindCount {

    public static int binarySearch(ArrayList<Integer> A, int B, boolean searchFirst) {

        int start=0, end=A.size()-1, result = -1;

        while (start <= end) {

            int mid = (start+end)/2;
            if (A.get(mid) == B) {

                result = mid;
                if(searchFirst) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else if (A.get(mid) < B) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return result;
    }

    public static int findCount(ArrayList<Integer> A, int B) {

        int first = binarySearch(A, B, true);
        if (first == -1) {
            return 0;
        } else {
            int second = binarySearch(A, B, false);
            return second-first+1;
        }
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

        String bToString = bufferedReader.readLine();
        int B = Integer.valueOf(bToString);

        System.out.println(findCount(A, B));
    }
}
