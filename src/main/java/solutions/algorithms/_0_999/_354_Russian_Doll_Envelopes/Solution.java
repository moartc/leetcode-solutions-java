package solutions.algorithms._0_999._354_Russian_Doll_Envelopes;

import java.util.Arrays;

/*
like lis (300) with bin search, but on the 2nd index only
 */
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o2[1] - o1[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        int[] lis = new int[envelopes.length];
        Arrays.fill(lis, Integer.MAX_VALUE);
        int size = 0;
        for (int[] envelope : envelopes) {
            int v = envelope[1];
            int i = 0;
            int j = size;
            while (i != j) {
                int mid = (i + j) / 2;
                if (lis[mid] < v) {
                    i = mid + 1;
                } else {
                    j = mid;
                }
            }
            lis[i] = v;
            if (i == size) {
                size++;
            }
        }
        return size;
    }
}