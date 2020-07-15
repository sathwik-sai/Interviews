package com.github.programming.leetcode.easy;

/*
    Given a valid (IPv4) IP address, return a defanged version of that IP address.

    A defanged IP address replaces every period "." with "[.]".
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DefangIPAddress {

    public static String defangIPAddr(String address) {

        return address.replace(".", "[.]");
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String ip = String.valueOf(bufferedReader.readLine());
        System.out.println(defangIPAddr(ip));
    }
}
