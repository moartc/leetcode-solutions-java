package solutions.algorithms._3000_3999._3559_Number_of_Ways_to_Assign_Edge_Weights_II;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


/*
    Some weird binary lifting problem
    It didn't even pass with a HashMap and a Set, I had to replace them with a List of arrays and a boolean array
 */
class Solution {

    public static final int MOD = 1000000000 + 7;
    int n = -1;

    public int[] assignEdgeWeights(int[][] edges, int[][] queries) {

        // it was failing for just edges.length
        n = edges.length + 1;
        List<Integer>[] nodeToNode = new List[n + 1];
        for (int i = 0; i < nodeToNode.length; i++) {
            nodeToNode[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int node0 = edge[0];
            int node1 = edge[1];

            nodeToNode[node0].add(node1);
            nodeToNode[node1].add(node0);
        }

        int[][] ancestors = new int[n + 1][18];
        int[] depths = new int[n + 1];

        setAncestorsAndDepths(nodeToNode, ancestors, depths);

        // set pow ancestors
        for (int j = 1; j < 18; j++) {
            for (int i = 0; i < ancestors.length; i++) {
                ancestors[i][j] = ancestors[ancestors[i][j - 1]][j - 1];
            }
        }

        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int n1 = query[0];
            int n2 = query[1];
            int lca = findLca(n1, n2, ancestors, depths);
            int p1 = depths[n1] - depths[lca];
            int p2 = depths[n2] - depths[lca];
            int sumPath = p1 + p2;
            if (sumPath == 0) {
                answer[i] = 0;
            } else {
                answer[i] = (int) modPow(2, sumPath - 1);
            }

        }
        return answer;
    }

    int findLca(int n1, int n2, int[][] ancestors, int[] depths) {

        int d1 = depths[n1];
        int d2 = depths[n2];
        if (d1 == d2) {
            for (int j = 17; j >= 0; j--) {
                if (n1 == n2) {
                    return n1;
                }
                if (ancestors[n1][j] != ancestors[n2][j]) {
                    n1 = ancestors[n1][j];
                    n2 = ancestors[n2][j];
                }
            }
            return ancestors[n1][0];
        } else if (d1 < d2) {
            int diff = d2 - d1;
            for (int j = 17; j >= 0; j--) {
                if (((diff >> j) & 1) == 1) {
                    n2 = ancestors[n2][j];
                }
            }
        } else { // d1 > d2
            int diff = d1 - d2;
            for (int j = 17; j >= 0; j--) {
                if (((diff >> j) & 1) == 1) {
                    n1 = ancestors[n1][j];
                }
            }
        }
        return findLca(n1, n2, ancestors, depths);
    }

    void setAncestorsAndDepths(List<Integer>[] nodeToNode, int[][] ancestors, int[] depths) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        visited[1] = true;
        ancestors[1][0] = 0;
        depths[1] = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int child : nodeToNode[node]) {
                if (!visited[child]) {
                    visited[child] = true;
                    ancestors[child][0] = node;
                    depths[child] = depths[node] + 1;
                    queue.offer(child);
                }
            }
        }
    }


    long modPow(long n, int pow) {
        long res = 1l;
        while (pow > 0) {
            if ((pow & 1) == 1) {
                res = (res * n) % MOD;
            }
            n = (n * n) % MOD;
            pow >>= 1;
        }
        return res;
    }


}
