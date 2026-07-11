package solutions.algorithms._2000_2999._2685_Count_the_Number_of_Complete_Components;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {


    // overengineered. I could use bfs instead of union find
    public int countCompleteComponents(int n, int[][] edges) {

        int[] ranks = new int[n];
        int[] parents = new int[n];

        for (int i = 0; i < n; i++) {
            ranks[i] = 0;
            parents[i] = i;
        }

        Map<Integer, Set<Integer>> adjList = new HashMap<>();

        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            union(a, b, parents, ranks);

            Set<Integer> set1 = adjList.getOrDefault(a, new HashSet<>());
            set1.add(b);
            adjList.put(a, set1);
            Set<Integer> set2 = adjList.getOrDefault(b, new HashSet<>());
            set2.add(a);
            adjList.put(b, set2);
        }
        Map<Integer, Set<Integer>> parentToNodes = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int parent = findParent(i, parents);
            Set<Integer> set = parentToNodes.getOrDefault(parent, new HashSet<>());
            set.add(i);
            parentToNodes.put(parent, set);
        }

        int ctr = 0;
        // every node from set of size n, should have n-1 connections
        ex:
        for (Set<Integer> value : parentToNodes.values()) {
            int setSize = value.size();
            for (Integer i : value) {
                if (adjList.get(i) == null) {
                    if (setSize == 1) {
                        continue;
                    } else {
                        continue ex;
                    }
                }
                if (setSize - 1 != adjList.get(i).size()) {
                    continue ex;
                }
            }
            ctr++;
        }

        return ctr;
    }

    int findParent(int i, int[] parents) {
        if (parents[i] != i) {
            return findParent(parents[i], parents);
        }
        return parents[i];
    }

    void union(int a, int b, int[] parents, int[] ranks) {
        int p1 = findParent(a, parents);
        int p2 = findParent(b, parents);
        if (p1 == p2) {
            return;
        }
        int r1 = ranks[p1];
        int r2 = ranks[p2];
        if (r1 < r2) {
            parents[p1] = p2;
        } else if (r2 < r1) {
            parents[p2] = p1;
        } else { // r1 == r2
            parents[p2] = p1;
            ranks[p1]++;
        }
    }
}