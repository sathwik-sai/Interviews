package com.github.programming.leetcode.easy;

import com.github.programming.utils.BSTUtils;
import com.github.programming.utils.TreeNode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static com.github.programming.utils.BSTUtils.printBST;

public class SearchBST {

    public static TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) {
                return root;
            } else if (root.val < val){
                root = root.right;
            } else
                root = root.left;
        }
        return root;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();

        String[] input = line.split(" ");
        int size = Integer.parseInt(input[0]);

        int[] array = new int[size];
        for (int i=0; i<size; i++) {
            array[i] = Integer.valueOf(input[i+1]);
        }

        String val = bufferedReader.readLine();
        int value = Integer.valueOf(val);

        TreeNode root = BSTUtils.constructBST(array);
        printBST(searchBST(root, value));
    }
}
