package com.github.programming.interviewbit.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
    Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

    You may assume that the intervals were initially sorted according to their start times.

    Ex1: Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].

    Ex2: Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would result in [1,2],[3,10],[12,16].
         This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].

    Make sure the returned intervals are also sorted.
 */

public class MergeIntervals {

    public static void printList(ArrayList<Interval> A) {

        StringBuilder builder = new StringBuilder();
        for (Interval interval: A) {
            builder.append("[" + interval.start + "," + interval.end + "]");
        }
        System.out.println(builder.toString());
    }

    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        ArrayList<Interval> output = new ArrayList<Interval>();

        for (int i=0; i<intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (interval.end < newInterval.start) {
                output.add(interval);
            } else if (newInterval.end < interval.start) {
                output.add(newInterval);
                output.addAll(intervals.subList(i, intervals.size()));
                return output;
            } else {
                int min = Math.min(interval.start, newInterval.start);
                int max = Math.max(interval.end, newInterval.end);
                newInterval.start = min;
                newInterval.end = max;
            }
        }
        output.add(newInterval);
        return output;
    }


    public static void main(String args[]) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();

        String[] str = input.split(" ");
        int size = Integer.valueOf(str[0]);
        ArrayList<Interval> A = new ArrayList<Interval>();
        for (int i=1; i<=size; i=i+2) {
            int start = Integer.valueOf(str[i]);
            int end = Integer.valueOf(str[i+1]);

            A.add(new Interval(start, end));
        }
        String secondLine = bufferedReader.readLine();
        String[] str2 = secondLine.split(" ");
        Interval newInterval = new Interval(Integer.valueOf(str2[0]), Integer.valueOf(str2[1]));

        printList(insert(A, newInterval));
    }
}

class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }
