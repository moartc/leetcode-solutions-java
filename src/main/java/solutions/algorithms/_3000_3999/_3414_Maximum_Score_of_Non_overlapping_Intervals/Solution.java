package solutions.algorithms._3000_3999._3414_Maximum_Score_of_Non_overlapping_Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] maximumWeight(List<List<Integer>> intervals) {

        //additionally original index
        int[][] intervalsArr = new int[intervals.size()][4];

        for (int i = 0; i < intervals.size(); i++) {
            List<Integer> interval = intervals.get(i);
            intervalsArr[i] = new int[]{interval.get(0), interval.get(1), interval.get(2), i};
        }


        Arrays.sort(intervalsArr, (o1, o2) -> {
            return o1[1] - o2[1];
        });

        // inspiration for hint 3
        Pair[][] dp = new Pair[5][intervalsArr.length];
        // for 1 it's just a weight at the index
        dp[1][0] = new Pair(intervalsArr[0][2]);
        dp[1][0].indices.add(intervalsArr[0][3]);
        for (int i = 1; i < intervalsArr.length; i++) {
            int[] interval = intervalsArr[i];
            if (interval[2] >= dp[1][i - 1].result) {
                dp[1][i] = new Pair(interval[2]);
                dp[1][i].indices.add(interval[3]);
            } else {
                dp[1][i] = dp[1][i - 1];
            }
        }

        for (int i = 0; i < intervalsArr.length; i++) {
            // choose
            int[] currInterval = intervalsArr[i];
            for (int r = 2; r <= 4; r++) {
                Pair pairToUse = new Pair(0);
                boolean found = false;
                // bin search
                int left = 0;
                int right = i - 1;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    int[] prevInterval = intervalsArr[mid];
                    if (prevInterval[1] < currInterval[0]) {
                        Pair pair = dp[r - 1][mid];
                        if (pairToUse.compareTo(pair) < 0) {
                            found = true;
                            pairToUse = pair;
                        }
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                if (found) {
                    ArrayList<Integer> copyList = new ArrayList<>(pairToUse.indices);
                    copyList.add(currInterval[3]);
                    Collections.sort(copyList);
                    dp[r][i] = new Pair(pairToUse.result + currInterval[2]);
                    dp[r][i].indices = copyList;
                } else {
                    dp[r][i] = new Pair(currInterval[2]);
                    dp[r][i].indices.add(currInterval[3]);
                }
                // skip
                if (i != 0) {
                    if (dp[r][i].compareTo(dp[r][i - 1]) > 0) {
                        dp[r][i] = dp[r][i];
                    } else {
                        dp[r][i] = dp[r][i - 1];
                    }
                } else {
                    dp[r][i] = new Pair(currInterval[2]);
                    dp[r][i].indices.add(currInterval[3]);
                }
            }
        }

        List<Integer> answerList = dp[4][intervalsArr.length - 1].indices;
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    class Pair implements Comparable<Pair> {
        long result;
        List<Integer> indices = new ArrayList<>();

        public Pair(long result) {
            this.result = result;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.result != o.result) {
                return Long.compare(this.result, o.result);
            }
            for (int i = 0; i < indices.size(); i++) {
                int curr = indices.get(i);
                if (o.indices.size() - 1 < i) {
                    return 1;
                } else {
                    int that = o.indices.get(i);
                    if (curr != that) {
                        return Long.compare(that, curr);
                    }
                }
            }
            return o.indices.size() - this.indices.size();
        }
    }
}