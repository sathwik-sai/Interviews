package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 */

public class ToLowerCase {

    public static String toLowerCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0; i<str.length(); i++) {
            int idx = (int)str.charAt(i);
            if (idx>=65 && idx<=90) {
                char c = (char) (idx+32);
                stringBuilder.append(c);
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();

        System.out.println(toLowerCase(line));
    }
}
