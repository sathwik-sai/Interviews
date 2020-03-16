package com.github.programming.binarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
    Suppose a sorted array A is rotated at some pivot unknown to you beforehand.
    Find the minimum element. The array will not contain duplicates.
 */

public class FindMin {

    public static int findMin(ArrayList<Integer> A) {

        int N = A.size();
        int low=0, high=N-1;
        while (low <= high) {
            int mid = (low+high)/2;
            int next = (mid+1) % N;
            int prev = (mid+N-1) % N;
            if (A.get(low) <= A.get(high)) {
                return A.get(low);
            } else if (A.get(mid) <= A.get(next) && A.get(mid) <= A.get(prev)) {
                return A.get(mid);
            } else if (A.get(mid) <= A.get(high)) {
                high = mid-1;
            } else if (A.get(mid) >= A.get(low)) {
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();

        String[] str = input.split(" ");
        int size = Integer.valueOf(str[0]);
        ArrayList<Integer> A = new ArrayList<Integer>();
        for (int i = 1; i <= size; i++) {
            A.add(Integer.valueOf(str[i]));
        }

        System.out.println(findMin(A));
    }
}
