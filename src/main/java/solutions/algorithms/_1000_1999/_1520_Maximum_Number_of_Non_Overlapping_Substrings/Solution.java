package solutions.algorithms._1000_1999._1520_Maximum_Number_of_Non_Overlapping_Substrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    public List<String> maxNumOfSubstrings(String s) {

        int[][] beginToEnd = new int[26][3];
        for (int i = 0; i < beginToEnd.length; i++) {
            beginToEnd[i][0] = -1;
            beginToEnd[i][2] = i;
        }

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char currC = charArray[i];
            int cIdx = currC - 'a';
            if (beginToEnd[cIdx][0] == -1) {
                beginToEnd[cIdx][0] = i;
            }
            beginToEnd[cIdx][1] = i;
        }

        List<int[]> realIntervals = new ArrayList<>();
        for (int i = 0; i < beginToEnd.length; i++) {
            int[] currInt = beginToEnd[i];
            if (currInt[0] != -1) {
                int newEnd = findEndForInterval(currInt[0], (char) (i + 'a'), beginToEnd, charArray);
                if (newEnd != -1) {
                    realIntervals.add(new int[]{currInt[0], newEnd});
                }
            }
        }

        Collections.sort(realIntervals, (o1, o2) -> o1[1] - o2[1]);
        List<int[]> finalIntervals = new ArrayList<>();
        int[] curr = realIntervals.get(0);
        finalIntervals.add(curr);
        for (int i = 1; i < realIntervals.size(); i++) {
            int[] interval = realIntervals.get(i);
            if (interval[0] > finalIntervals.get(finalIntervals.size() - 1)[1]) {
                finalIntervals.add(interval);
            }
        }

        List<String> res = new ArrayList<>();
        for (int i = 0; i < finalIntervals.size(); i++) {
            int[] itr = finalIntervals.get(i);
            res.add(s.substring(itr[0], itr[1] + 1));
        }

        Collections.sort(res, (o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            } else {
                return o1.compareTo(o2);
            }
        });

        return res;
    }

    int findEndForInterval(int origStart, char c, int[][] beginToEnd, char[] charArray) {
        int ci = c - 'a';
        int begin = beginToEnd[ci][0];
        int end = beginToEnd[ci][1];
        for (int i = begin; i <= end; i++) {
            char anotherChar = charArray[i];
            int anIdx = anotherChar - 'a';
            int begAnother = beginToEnd[anIdx][0];
            int endAnother = beginToEnd[anIdx][1];
            if (begAnother < origStart) {
                return -1;
            }
            if (endAnother > end) {
                return findEndForInterval(origStart, anotherChar, beginToEnd, charArray);
            }

        }
        return end;
    }
}