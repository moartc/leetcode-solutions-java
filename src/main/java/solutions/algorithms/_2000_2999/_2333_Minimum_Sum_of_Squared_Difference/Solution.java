package solutions.algorithms._2000_2999._2333_Minimum_Sum_of_Squared_Difference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    /*

     */
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        List<Long> allDiffs = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int f = nums1[i];
            int s = nums2[i];
            long absSum = Math.abs(f - s);
            allDiffs.add(absSum);
        }
        Collections.sort(allDiffs);
        int toUse = k1 + k2;
        long currLevel = allDiffs.get(allDiffs.size() - 1);
        long remainingWith1 = 0;
        int currGroup;

        for (int i = allDiffs.size() - 1; i >= 0; i--) {
            if (toUse == 0) {
                break;
            }

            currGroup = allDiffs.size() - i;
            long currVal = allDiffs.get(i);
            if (i - 1 >= 0) {
                long nextVal = allDiffs.get(i - 1);
                long diffToNext = currVal - nextVal;
                if (diffToNext > 0) {
                    long toRemove = Math.min(diffToNext * currGroup, toUse);
                    long perGroup = toRemove / currGroup;
                    remainingWith1 = toRemove % currGroup;
                    toUse -= toRemove;
                    currLevel = currVal - perGroup;
                }
            }
            if (remainingWith1 > 0) {
                break;
            }
        }

        long additionalPerGroup = 0;
        long additionalRemaining1 = 0;
        if (toUse > 0) {
            additionalPerGroup = toUse / allDiffs.size();
            additionalRemaining1 = toUse % allDiffs.size();
        }

        // sum all
        long answer = 0;
        for (int i = allDiffs.size() - 1; i >= 0; i--) {
            long v = allDiffs.get(i);
            long valToUse = Math.min(v, currLevel);
            if (remainingWith1 >= allDiffs.size() - i) {
                valToUse--;
            }
            valToUse = Math.max(0, valToUse - additionalPerGroup);
            if (additionalRemaining1 >= allDiffs.size() - i) {
                valToUse = Math.max(0, valToUse - 1);
            }
            answer += (valToUse * valToUse);
        }
        return answer;
    }
}