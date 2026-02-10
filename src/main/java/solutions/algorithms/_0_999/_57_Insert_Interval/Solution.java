package solutions.algorithms._0_999._57_Insert_Interval;

import java.util.ArrayList;
import java.util.List;

class Solution {

    /*
    Since they said I can return a new array, I can try to create one if that's more convenient

    For each interval in intervals:
    compare newInterval left with the current interval
    if there is any overlap -> either interval left or right within newInterval ranges
                               or new interval left or right between interval ranges
    newLeft is the smaller left boundary, and new right is the larger right boundary
    store it as the new interval and compare it with the next one

    there is no overlap: add the interval with the smaller left and right to the final list
    if the new interval still exists compare it with the next interval
    update: after a few tweaks and handling corner cases it passed, the idea was good
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {

        if (intervals.length == 0) {
            return new int[][]{newInterval};
        }

        List<int[]> answer = new ArrayList<>();
        for (int[] interval : intervals) {
            if (newInterval == null) {
                // just add the current one because new interval has been already handled
                answer.add(interval);
                continue;
            }
            int currLeft = interval[0];
            int currRight = interval[1];
            int newLeft = newInterval[0];
            int newRight = newInterval[1];
            if ((currLeft >= newLeft && currLeft <= newRight) || (currRight >= newLeft && currRight <= newRight)
                    || (newLeft >= currLeft && newLeft <= currRight) || (newRight >= currLeft && newRight <= currRight)) {
                newInterval = new int[]{Math.min(currLeft, newLeft), Math.max(currRight, newRight)};
            } else {
                if (newLeft < currLeft) {
                    answer.add(newInterval);
                    answer.add(interval);
                } else {
                    answer.add(interval);
                }
            }
        }
        if (newInterval != null) {
            answer.add(newInterval);
        }
        int[][] answerArray = new int[answer.size()][2];
        for (int i = 0; i < answer.size(); i++) {
            answerArray[i] = answer.get(i);
        }
        return answerArray;
    }
}