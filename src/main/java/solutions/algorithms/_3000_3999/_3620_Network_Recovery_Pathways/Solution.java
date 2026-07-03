package solutions.algorithms._3000_3999._3620_Network_Recovery_Pathways;

import java.util.*;

class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {

        if (!online[0] || !online[online.length - 1]) {
            return -1;
        }

        Map<Integer, List<int[]>> adjMap = new HashMap<>();
        Set<Integer> allCosts = new HashSet<>();
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int cost = edge[2];
            if (online[from] && online[to]) {
                List<int[]> list = adjMap.getOrDefault(from, new ArrayList<>());
                list.add(new int[]{to, cost});
                allCosts.add(cost);
                adjMap.put(from, list);
            }
        }
        List<Integer> sortedCosts = new ArrayList<>(allCosts);
        Collections.sort(sortedCosts);

        int min = 0;
        int max = sortedCosts.size() - 1;

        int bestFound = -1;
        while (min <= max) {
            int med = (min + max) / 2;
            int cost = sortedCosts.get(med);
            if (isReachable(adjMap, cost, k, online.length - 1)) {
                min = med + 1;
                bestFound = cost;
            } else {
                max = med - 1;
            }
        }
        return bestFound;
    }

    private boolean isReachable(Map<Integer, List<int[]>> map, int minEdgeCost, long k, int targetNode) {

        Queue<long[]> q = new PriorityQueue<>((o1, o2) -> {
            long res = o1[1] - o2[1];
            if (res < 0) {
                return -1;
            } else if (res == 0) {
                return 0;
            } else {
                return 1;
            }
        });
        long[] visited = new long[targetNode + 1];
        Arrays.fill(visited, Long.MAX_VALUE);
        visited[0] = 0;
        q.add(new long[]{0, 0});

        while (!q.isEmpty()) {
            long[] current = q.poll();
            int currentNode = (int) current[0];

            // found
            if (currentNode == targetNode) {
                return true;
            }
            long currentCost = current[1];

            if (currentCost > visited[currentNode]) {
                continue;
            }

            List<int[]> outcomingEdges = map.get(currentNode);
            if (outcomingEdges != null) {
                for (int[] edge : outcomingEdges) {
                    int to = edge[0];
                    long edgeCost = edge[1];
                    if (edgeCost < minEdgeCost) {
                        continue;
                    }
                    long totalCost = currentCost + edgeCost;
                    if (totalCost <= k && visited[to] > totalCost) {
                        visited[to] = totalCost;
                        q.add(new long[]{to, totalCost});
                    }
                }
            }
        }
        return false;
    }

}