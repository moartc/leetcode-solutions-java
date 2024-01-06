package solutions.algorithms._0_999._56_Merge_Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        ArrayList<int[]> result = new ArrayList<>(intervals.length);
        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            int[] last = result.get(result.size() - 1);
            if (interval[0] <= last[1]) {
                last[1] = Math.max(last[1], interval[1]);
            } else {
                result.add(interval);
            }
        }
        int[][] resArr = new int[result.size()][];
        int i = 0;
        for (int[] ints : result) {
            resArr[i++] = ints;
        }
        return resArr;
    }
}