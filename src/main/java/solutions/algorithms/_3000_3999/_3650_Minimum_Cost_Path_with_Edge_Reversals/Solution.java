package solutions.algorithms._3000_3999._3650_Minimum_Cost_Path_with_Edge_Reversals;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int minCost(int n, int[][] edges) {

        // value -> node to, cost
        PriorityQueue[] nodeToNode = new PriorityQueue[n];


        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int cost = edge[2];

            PriorityQueue<int[]> pq1;
            if (nodeToNode[from] != null) {
                pq1 = nodeToNode[from];
            } else {
                pq1 = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
            }
            pq1.add(new int[]{to, cost});
            nodeToNode[from] = pq1;
            PriorityQueue<int[]> pq2;
            if (nodeToNode[to] != null) {
                pq2 = nodeToNode[to];
            } else {
                pq2 = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
            }
            pq2.add(new int[]{from, cost * 2, -1});
            nodeToNode[to] = pq2;
        }
        if (nodeToNode[0] == null) {
            // no starting point
            return -1;
        }

        // start, cost
        int[] start = new int[]{0, 0};
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        queue.add(start);
        int[] visitedCost = new int[n];
        Arrays.fill(visitedCost, Integer.MAX_VALUE);

        visitedCost[0] = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int to = current[0];
            int cost = current[1];
            if (to == n - 1) {
                return cost;
            }

            PriorityQueue<int[]> toVisit1 = nodeToNode[to];
            if (toVisit1 != null) {
                while (!toVisit1.isEmpty()) {
                    int[] poll = toVisit1.poll();
                    if (visitedCost[poll[0]] > cost + poll[1]) {
                        visitedCost[poll[0]] = cost + poll[1];
                        queue.add(new int[]{poll[0], cost + poll[1]});
                    }
                }
            }
        }
        return -1;
    }
}










































