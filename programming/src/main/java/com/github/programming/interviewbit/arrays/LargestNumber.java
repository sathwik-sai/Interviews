package com.github.programming.interviewbit.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    Given a list of non negative integers, arrange them such that they form the largest number.
    Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

    Corner cases: What happens if all the numbers are 0
    Avoid TLE by using StringBuilder
 */

public class LargestNumber {

    public static String largestNumber(ArrayList<Integer> A) {

        StringBuilder answer = new StringBuilder();
        ArrayList<String> a = new ArrayList<String>();

        for (int i=0; i<A.size(); i++) {
            a.add(String.valueOf(A.get(i)));
        }


        Collections.sort(a, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.concat(o2).compareTo(o2.concat(o1));
            }
        });

        boolean flag = false;
        for (int i=a.size()-1; i>=0; i--) {
            if (a.get(i).charAt(0) != '0') flag = true;
            answer.append(a.get(i));
        }

        return flag == false ? "0" : answer.toString();
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
        
        System.out.println(largestNumber(A));
    }
}
