package solutions.algorithms._0_999._539_Minimum_Time_Difference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
iterate once and convert the input in minutes -> 60*hh + mm
Sort it once -> n long n
then, iterate it once again calculating abs value of the difference for each pair: [0,1], [1,2], ..., [n-2,n-1]
at the end - additionally compare [n-1, 0(+24h in minutes)]
 */
class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> timePointsInMinutes = new ArrayList<>();
        for (String s : timePoints) {
            int h1 = s.charAt(0) - '0';
            int h2 = s.charAt(1) - '0';
            int m1 = s.charAt(3) - '0';
            int m2 = s.charAt(4) - '0';
            int hrs = h1 * 10 + h2;
            int mins = m1 * 10 + m2;
            timePointsInMinutes.add(60 * hrs + mins);
        }
        int minDiff = Integer.MAX_VALUE;
        Collections.sort(timePointsInMinutes);
        for (int i = 0; i < timePointsInMinutes.size() - 1; i++) {
            int f = timePointsInMinutes.get(i);
            int s = timePointsInMinutes.get(i + 1);
            int diff = Math.abs(s - f);
            minDiff = Math.min(minDiff, diff);
        }
        int theFirst24hLater = timePointsInMinutes.get(0) + 60 * 24;
        int lastTime = timePointsInMinutes.get(timePointsInMinutes.size() - 1);
        minDiff = Math.min(minDiff, Math.abs(lastTime - theFirst24hLater));
        return minDiff;
    }

}