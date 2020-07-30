package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GenerateTheString {

    public static String generateTheString(int n) {
        StringBuilder strBuilder = new StringBuilder();
        if (n%2==0) {
            strBuilder.append('a');
            n--;
        }
        for (int i=0; i<n; i++) {
            strBuilder.append('b');
        }
        return strBuilder.toString();
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();

        int n = Integer.valueOf(line);
        System.out.print(generateTheString(n));
    }
}
