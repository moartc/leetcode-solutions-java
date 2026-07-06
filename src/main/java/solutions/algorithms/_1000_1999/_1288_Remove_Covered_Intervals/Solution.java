package solutions.algorithms._1000_1999._1288_Remove_Covered_Intervals;

import java.util.Arrays;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        Arrays.sort(intervals, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o2[1] - o1[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        if (intervals.length == 1) {
            return 1;
        }

        int fi = 0;
        int si = 1;

        int coveredIntervals = 0;
        while (si < intervals.length) {

            int[] f = intervals[fi];
            int[] s = intervals[si];
            // f[0] is always <= s[0]
            if (f[1] >= s[1]) {
                coveredIntervals++;
                si++;
            } else {
                fi = si;
                si++;
            }
        }
        return intervals.length - coveredIntervals;
    }
}