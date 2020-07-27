package com.github.programming.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import static com.github.programming.utils.ArrayUtils.printArray2D;

/*
    Given a list of scores of different students, return the average score of each student's top five scores in the order of each student's id.
    Each entry items[i] has items[i][0] the student's id, and items[i][1] the student's score.  The average score is calculated using integer division.

    Input: [[1,91],[1,92],[2,93],[2,97],[1,60],[2,77],[1,65],[1,87],[1,100],[2,100],[2,76]]
    Output: [[1,87],[2,88]]
    Explanation:
    The average of the student with id = 1 is 87.
    The average of the student with id = 2 is 88.6. But with integer division their average converts to 88.
 */

public class HighFive {

    public static int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<Integer, PriorityQueue<Integer>>();

        for (int i=0; i<items.length; i++) {
            PriorityQueue<Integer> pQ = new PriorityQueue<Integer>((x, y) -> y-x);
            if (map.containsKey(items[i][0]))
                pQ = map.get(items[i][0]);
            pQ.add(items[i][1]);
            map.put(items[i][0], pQ);
        }
        int[][] result = new int[map.size()][2];
        int row=0;
        for (int id: map.keySet()) {
            result[row][0] = id;
            int sum = 0;
            PriorityQueue<Integer> pQ = map.get(id);
            for (int i=0; i<5; i++){
                sum += pQ.poll();
            }
            result[row][1] = sum/5;
            row++;
        }
        return result;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line = bufferedReader.readLine();
        String[] input = line.split(" ");
        int size = Integer.parseInt(input[0]);

        int[][] array = new int[size][2];
        for (int i=0; i<size; i++) {
            array[i][0] = Integer.parseInt(input[i*2+1]);
            array[i][1] = Integer.parseInt(input[i*2+2]);
        }

        printArray2D(highFive(array));
    }
}
