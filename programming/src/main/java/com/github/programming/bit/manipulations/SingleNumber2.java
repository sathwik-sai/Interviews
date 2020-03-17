package com.github.programming.bit.manipulations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SingleNumber2 {

    public static int singleNumber2(ArrayList<Integer> A) {

        int result = 0;
        for (int i=0; i<32; i++) {

            int sum=0;
            for(int j=0; j<A.size(); j++) {
                if ((A.get(j) & (1 << i)) != 0) sum++;
            }
            if (sum % 3 != 0) result |= (1 << i);
        }
        return result;
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

        System.out.println(singleNumber2(A));
    }
}
