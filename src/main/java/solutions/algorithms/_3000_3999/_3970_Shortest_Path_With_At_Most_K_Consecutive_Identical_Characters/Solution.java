package solutions.algorithms._3000_3999._3970_Shortest_Path_With_At_Most_K_Consecutive_Identical_Characters;

import java.util.*;

class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {

        Map<Integer, List<int[]>> adjList = new HashMap<>();
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int cost = edge[2];
            List<int[]> toAndCostList = adjList.getOrDefault(from, new ArrayList<>());
            int[] neighbour = new int[2];
            neighbour[0] = to;
            neighbour[1] = cost;
            toAndCostList.add(neighbour);
            adjList.put(from, toAndCostList);
        }


        // node, total cost, last char in ascii, number of chars
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
            return o1[1] - o2[1];
        });
        pq.add(new int[]{0, 0, (int) labels.charAt(0), 1});

        int[][] bestFound = new int[n][k + 1];
        for (int[] ints : bestFound) {
            Arrays.fill(ints, Integer.MAX_VALUE);
        }

        while (!pq.isEmpty()) {

            int[] curr = pq.poll();
            int currNode = curr[0];
            int currCost = curr[1];
            int currChar = curr[2];
            int currCharCtr = curr[3];
            if (currNode == n - 1) {
                return currCost;
            }

            if (bestFound[currNode][currCharCtr] < currCost) {
                continue;
            }

            List<int[]> neighbours = adjList.get(currNode);
            if (neighbours != null) {
                for (int[] neighbour : neighbours) {
                    int node = neighbour[0];
                    int cost = neighbour[1];
                    int charAscii = labels.charAt(node);
                    if (charAscii != currChar) { // visit with new char
                        if (currCost + cost < bestFound[node][1]) {
                            bestFound[node][1] = currCost + cost;
                            int[] newState = new int[]{node, currCost + cost, charAscii, 1};
                            pq.add(newState);
                        }
                    } else if (currCharCtr + 1 <= k) { // visit with increased ctr
                        if (currCost + cost < bestFound[node][currCharCtr + 1]) {
                            bestFound[node][currCharCtr + 1] = currCost + cost;
                            int[] newState = new int[]{node, currCost + cost, charAscii, currCharCtr + 1};
                            pq.add(newState);
                        }
                    } else {
                        // cannot visit - nothing to do
                    }
                }
            }
        }
        return -1;
    }
}