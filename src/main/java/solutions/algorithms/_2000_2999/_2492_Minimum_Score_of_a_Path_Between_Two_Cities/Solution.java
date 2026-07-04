package solutions.algorithms._2000_2999._2492_Minimum_Score_of_a_Path_Between_Two_Cities;

import java.util.HashSet;
import java.util.Set;

class Solution {

    /*
     I cannot just try to visit every node only once, because here paths are important.
     I could find all connected nodes with node '1' and then find the cheapest path.
     */

    public int minScore(int n, int[][] roads) {


        int[] parents = new int[n + 1];
        int[] ranks = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            parents[i] = i;
            ranks[i] = 0;
        }

        for (int[] road : roads) {
            int a = road[0];
            int b = road[1];
            union(a, b, parents, ranks);
        }
        // now, find the parent for '1' and all nodes with the same parent
        int parent1 = find(1, parents);
        Set<Integer> connectedNodes = new HashSet<>();
        connectedNodes.add(1);
        for (int i = 2; i <= n; i++) {
            if (find(i, parents) == parent1) {
                connectedNodes.add(i);
            }
        }

        int minCost = Integer.MAX_VALUE;
        for (int[] road : roads) {
            int a = road[0];
            int b = road[1];
            if (connectedNodes.contains(a) && connectedNodes.contains(b)) {
                int cost = road[2];
                minCost = Math.min(minCost, cost);
            }
        }

        return minCost;

    }

    void union(int a, int b, int[] parents, int[] ranks) {
        int pA = find(a, parents);
        int pB = find(b, parents);

        if (pA == pB) {
            return;
        }
        int rA = ranks[pA];
        int rB = ranks[pB];

        if (rA < rB) {
            parents[pA] = pB;
        } else if (rB < rA) {
            parents[pB] = pA;
        } else {
            parents[pB] = pA;
            ranks[pA]++;
        }
    }

    int find(int i, int[] parents) {
        if (parents[i] != i) {
            parents[i] = find(parents[i], parents);
        }
        return parents[i];
    }
}