package solutions.algorithms._435_Non_overlapping_Intervals;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        int counter = 0;
        int[] prev = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];
            if (current[0] < prev[1]) {
                if (prev[1] > current[1]) {
                    prev = current;
                }
                counter++;
            } else {
                prev = current;
            }
        }
        return counter;
    }
}