package com.github.programming.google;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails {

    public static int numUniqueEmails(String[] emails) {
        int count=0;
        Set<String> unique = new HashSet<>();
        for (String email: emails) {
            String trimmedEmail = trim(email);
            if (!unique.contains(trimmedEmail)) {
                unique.add(trimmedEmail);
                count++;
            }
        }
        return count;
    }

    public static String trim(String email) {
        String[] str = email.split("@");
        String output = "";
        for(int i=0; i<str[0].length(); i++) {
            if (str[0].charAt(i)=='+')
                break;
            else if (str[0].charAt(i)!='.')
                output += str[0].charAt(i);
        }
        return output+"@"+str[1];
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int size = Integer.parseInt(line);
        String[] emails = new String[size];
        for (int i=0; i<size; i++) {
            String email = reader.readLine();
            emails[i] = email;
        }
        System.out.println(numUniqueEmails(emails));
    }
}
