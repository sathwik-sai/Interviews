package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
    A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.
    Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
    Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.

    Input: "(()())(())"
    Output: "()()()"
    Explanation:
    The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
    After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
 */

/*
    Can we solved using Stack too but consumes more space
 */

public class RemoveOuterParantheses {

    public static String removeOuterParentheses(String S) {

        int charge = 0;
        StringBuilder result = new StringBuilder();
        StringBuilder strBuilder = new StringBuilder();
        for (int i=0; i<S.length(); i++) {
            if (S.charAt(i) == '(') {
                charge++;
                strBuilder.append(S.charAt(i));
            } else {
                charge--;
                strBuilder.append(S.charAt(i));
            }
            if (charge == 0) {
                String temp = strBuilder.toString();
                strBuilder.setLength(0);
                result.append(temp.substring(1, temp.length()-1));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();

        System.out.println(removeOuterParentheses(line));
    }
}
