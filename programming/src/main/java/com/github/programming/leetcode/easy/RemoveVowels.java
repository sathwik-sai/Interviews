package com.github.programming.leetcode.easy;

/*
    Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
 */

public class RemoveVowels {

    public static String removeVowels(String s) {

        StringBuilder str = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                    || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                //
            } else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {

        String s = "leetcodeisacommunityforcoders";
        System.out.println(removeVowels(s));
    }
}
