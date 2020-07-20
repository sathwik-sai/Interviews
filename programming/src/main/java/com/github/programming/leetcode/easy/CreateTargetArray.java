package com.github.programming.leetcode.easy;

import java.util.Arrays;

public class CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {

        int[] target = new int[nums.length];
        Arrays.fill(target, -1);

        for (int i=0; i<index.length; i++) {
            int idx = index[i];
            int val = nums[i];
            if (target[index[i]] == -1) {
                target[index[i]] = nums[i];
            } else {

                for (int j=idx; j<index.length; j++) {

                    if (target[idx] != -1) {
                        int temp = target[idx];
                        target[idx] = nums[i];
                    } else {
                        target[idx] = nums[i];
                    }
                }
            }
        }

        return target;
    }

}
