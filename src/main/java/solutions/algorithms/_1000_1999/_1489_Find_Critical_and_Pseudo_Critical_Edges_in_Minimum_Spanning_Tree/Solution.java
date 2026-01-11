package solutions.algorithms._1000_1999._1489_Find_Critical_and_Pseudo_Critical_Edges_in_Minimum_Spanning_Tree;

import java.util.*;

class Solution {

    /*
    1. find MST -> get the sum
    2. 2 iterations through all edges
    - to check if an edge is critical I can skip it - if the total sum changes - it is
    - to check if an edge is pseudo-critical I can add it - if the total sum stays the same - it is.

    For this: Kruskal
     */
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {


        // union find
        int[] parent = new int[n];
        int[] rank = new int[n];

        int idx = 0;
        int[][] edgesWithIdx = new int[edges.length][4];
        for (int[] edge : edges) {
            edgesWithIdx[idx][0] = edge[0];
            edgesWithIdx[idx][1] = edge[1];
            edgesWithIdx[idx][2] = edge[2];
            edgesWithIdx[idx][3] = idx;
            idx++;
        }

        Arrays.sort(edgesWithIdx, Comparator.comparingInt(o -> o[2]));


        resetUnion(parent, rank, n);

        Set<int[]> spanningTree = new HashSet<>();
        int totalSum = 0;
        for (int[] edge : edgesWithIdx) {
            int f = edge[0];
            int s = edge[1];
            if (find(f, parent) != find(s, parent)) {
                spanningTree.add(edge);
                totalSum += edge[2];
                union(f, s, parent, rank);
            }
        }

        // check if it's critical
        List<Integer> criticalEdges = new ArrayList<>();
        for (int i = 0; i < edgesWithIdx.length; i++) {
            resetUnion(parent, rank, n);
            Set<int[]> spanningTreeCritical = new HashSet<>();
            int orig = edgesWithIdx[i][3];
            int sumCriticalCheck = 0;
            for (int[] edge : edgesWithIdx) {
                int f = edge[0];
                int s = edge[1];
                if (find(f, parent) != find(s, parent)) {
                    if (edge[3] == orig) {
                        // skip it
                    } else {
                        spanningTreeCritical.add(edge);
                        sumCriticalCheck += edge[2];
                        union(f, s, parent, rank);
                    }
                }
            }
            if (totalSum != sumCriticalCheck) {
                criticalEdges.add(orig);
            }

        }


        // check if it's pseudo-critical
        List<Integer> pseudoCriticalEdges = new ArrayList<>();
        for (int i = 0; i < edgesWithIdx.length; i++) {
            int totalSumPseudoCritical = 0;
            resetUnion(parent, rank, n);
            // force add
            for (int[] withIdx : edgesWithIdx) {
                if (i == withIdx[3]) {
                    totalSumPseudoCritical += edgesWithIdx[i][2];
                    union(edgesWithIdx[i][0], edgesWithIdx[i][1], parent, rank);
                }
            }
            int orig = edgesWithIdx[i][3];

            for (int[] edge : edgesWithIdx) {
                int f = edge[0];
                int s = edge[1];
                if (find(f, parent) != find(s, parent)) {
                    if (edge[3] != orig) { // already added
                        totalSumPseudoCritical += edge[2];
                        union(f, s, parent, rank);
                    }
                }
            }
            if (totalSum == totalSumPseudoCritical && !criticalEdges.contains(orig)) {
                pseudoCriticalEdges.add(orig);
            }
        }
        return List.of(criticalEdges, pseudoCriticalEdges);
    }

    int find(int v, int[] parent) {
        while (parent[v] != v) {
            v = parent[v];
        }
        return v;
    }

    void union(int a, int b, int[] parent, int[] rank) {
        int ap = find(a, parent);
        int bp = find(b, parent);

        int ar = rank[ap];
        int br = rank[bp];

        if (ar < br) {
            parent[bp] = ap;
        } else if (br < ar) {
            parent[ap] = bp;
        } else {
            parent[ap] = bp;
            rank[bp]++;
        }
    }

    void resetUnion(int[] parent, int[] rank, int n) {
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }
}