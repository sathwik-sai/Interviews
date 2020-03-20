package com.github.programming.twoPointers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
    Remove duplicates from Sorted Array
    Given a sorted array, remove the duplicates in place such that each element appears only once and return the new length.

    In order to do an inplace removal of elements, A.remove() takes O(n) complexity which can lead to TLE
    So have used a temp array which will be O(n) time and space complexity
 */

public class RemoveDuplicates {

    // Time: O(n) and space: O(n)
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> A) {

        ArrayList<Integer> temp = new ArrayList<Integer>();
        int i=0,j=1;
        temp.add(A.get(0));
        for (int x=0; x<A.size()-1;x++) {

            if (A.get(i).equals(A.get(j))) {
                j++;
            } else {
                temp.add(A.get(j));
                i=j;
                j++;
            }
        }
        A.clear();
        for (int num: temp) {
            A.add(num);
        }
        return A;
    }

      // O(n) and O(1)
//    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> a) {
//        int writeInd = 0;
//        for (int curInd = 1; curInd < a.size(); curInd++) {
//            if ((int) a.get(writeInd) != (int) a.get(curInd)) {
//                // if value at existing writeIndex doesn't match current index then its a
//                // unique value and can be added to unique ArrayList
//                a.set(++writeInd, a.get(curInd));
//            }
//        }
//        // size will be one more then total write index
//        return new ArrayList<Integer>(a.subList(0, writeInd + 1));
//    }

    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = bufferedReader.readLine();
        String[] firstStr = firstLine.split(" ");
        int size = Integer.valueOf(firstStr[0]);
        ArrayList<Integer> A = new ArrayList<Integer>();
        for (int i = 1; i <= size; i++) {
            A.add(Integer.valueOf(firstStr[i]));
        }

        System.out.println(removeDuplicates(A));
        System.out.println(A.size());
    }
}
