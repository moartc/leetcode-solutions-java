package solutions.algorithms._0_999._743_Network_Delay_Time;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Solution {

    /*
    It looks like I could use Dijkstra
     */
    public int networkDelayTime(int[][] times, int n, int k) {

        List<int[]>[] adjList = new ArrayList[n + 1];
        for (int[] time : times) {
            int source = time[0];
            int destination = time[1];
            int cost = time[2];
            if (adjList[source] == null) {
                adjList[source] = new ArrayList<>();
            }
            adjList[source].add(new int[]{destination, cost});
        }

        int[] dist = new int[n + 1];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[k] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));

        pq.add(new int[]{k, 0});

        while (!pq.isEmpty()) {
            int[] poll = pq.poll();
            int currNode = poll[0];
            if (poll[1] <= dist[currNode]) {
                List<int[]> neighbours = adjList[currNode];
                if (neighbours != null) {
                    for (int[] pair : neighbours) {
                        int v = pair[0];
                        int c = pair[1];
                        int costToV = dist[v];
                        if (dist[currNode] + c < costToV) {
                            dist[v] = dist[currNode] + c;
                            pq.add(new int[]{v, dist[v]});
                        }
                    }
                }
            }
        }

        int max = Integer.MIN_VALUE;
        // I have to skip i = 0, and return max val
        for (int i = 1; i < dist.length; i++) {
            max = Integer.max(max, dist[i]);

        }
        return max == Integer.MAX_VALUE ? -1 : max;
    }

}