package solutions.algorithms._0_999._435_Non_overlapping_Intervals;

import java.util.Arrays;
import java.util.Comparator;

class Solution {

    /*
    Similar to the problem 57

    First, sort by start and end points.
    If two intervals start at the same position, remove the longer one.

    This is an additional test case: [[0,16],[1,3],[3,4],[4,6]]
    I cannot just take the first one and remove all subsequent overlapping intervals.
    It seems I should remove the one that ends later

     */
    public int eraseOverlapIntervals(int[][] intervals) {

        if (intervals.length == 1) {
            return 0;
        }

        // with this sorting, my solution beats 80%
        // with Arrays.sort(intervals, Comparator.comparingInt(o -> o[0])); - only beats 20%.
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int currentEnd = intervals[0][1];
        int counter = 0;
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (currentEnd > interval[0]) {
                // remove one - the one which ends later
                if (currentEnd > interval[1]) {
                    currentEnd = interval[1];
                }
                counter++;
            } else {
                currentEnd = interval[1];
            }
        }
        return counter;
    }

}