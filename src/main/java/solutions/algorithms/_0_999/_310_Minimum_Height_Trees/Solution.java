package solutions.algorithms._0_999._310_Minimum_Height_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    /*
    Starting from each node I can run bfs to find all paths to all other nodes and then take
    the longest one. Then I select the node(s) with the shortest longest path.

    It's TLE - it's O(n*(n+e))

    ok, so it looks like I can keep my adjacency list and start deleting leaves from it.
    After each deletion I update the neighbours (decrease their 'level' and if needed add them o the queue)
    I stop when I have 1 or 2 remaining leaves.

    Update: instead of removing from the adjacency list, I track the degree.
    it didn't really help, but I found a solution how to reuse the queue to get the final result.
     */

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        if (n == 1) {
            return List.of(0);
        }
        List<Integer>[] adjacencyList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        int[] degree = new int[n];
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            adjacencyList[from].add(to);
            adjacencyList[to].add(from);
            degree[from]++;
            degree[to]++;
        }


        Queue<Integer> leaves = new LinkedList<>();

        // add initial leaves
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == 1) {
                leaves.add(i);
            }
        }

        int remainingLeaves = n;

        while (remainingLeaves > 2) {
            List<Integer> leavesToAdd = new ArrayList<>();
            while (!leaves.isEmpty()) {
                Integer nodeId = leaves.poll();
                remainingLeaves--;

                for (Integer neighId : adjacencyList[nodeId]) {
                    degree[neighId]--;
                    if (degree[neighId] == 1) {
                        leavesToAdd.add(neighId);
                    }
                }
                degree[nodeId] = 0;
            }
            leaves.addAll(leavesToAdd);
        }
        List<Integer> toReturn = new ArrayList<>();
        while (!leaves.isEmpty()) {
            toReturn.add(leaves.poll());
        }
        return toReturn;
    }
}