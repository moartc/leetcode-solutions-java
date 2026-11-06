package solutions.algorithms._2000_2999._2747_Count_Zero_Request_Servers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        Map<Integer, Integer> serverLogCtr = new HashMap<>();

        int[][] queriesIdx = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            queriesIdx[i][0] = i;
            queriesIdx[i][1] = queries[i];
        }
        Arrays.sort(logs, (o1, o2) -> o1[1] - o2[1]);
        Arrays.sort(queriesIdx, (o1, o2) -> o1[1] - o2[1]);

        int l = 0;
        int r = 0;
        int active = 0;
        int[] answer = new int[queries.length];
        for (int[] queryIdx : queriesIdx) {
            int rBound = queryIdx[1];
            int lBound = rBound - x;

            while (r < logs.length && logs[r][1] <= rBound) {
                int serverToAdd = logs[r][0];
                Integer curr = serverLogCtr.getOrDefault(serverToAdd, 0);
                if (curr == 0) {
                    active++;
                }
                serverLogCtr.put(serverToAdd, curr + 1);
                r++;
            }

            while (l < logs.length && logs[l][1] < lBound) {
                int serverToDelete = logs[l][0];
                Integer curr = serverLogCtr.get(serverToDelete);
                serverLogCtr.put(serverToDelete, curr - 1);
                if (curr == 1) {
                    active--;
                }
                l++;
            }
            answer[queryIdx[0]] = n - active;

        }
        return answer;
    }
}