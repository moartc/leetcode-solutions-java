package solutions.algorithms._1000_1999._1584_Min_Cost_to_Connect_All_Points;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {

    /*
    It seems to be a minimum spanning tree

    I could build a full adjecency list, and probably I need a Prim's algorithm
    */
    public int minCostConnectPoints(int[][] points) {

        int[][] adjListArray = new int[points.length][points.length];
        for (int i = 0; i < points.length; i++) {
            int xi = points[i][0];
            int yi = points[i][1];
            for (int j = i + 1; j < points.length; j++) {
                int xj = points[j][0];
                int yj = points[j][1];
                int dist = Math.abs(xi - xj) + Math.abs(yi - yj);
                adjListArray[i][j] = dist;
                adjListArray[j][i] = dist;
            }
        }
        // just start with the first one
        PriorityQueue<int[]> edges = new PriorityQueue<>(Comparator.comparingInt(value -> value[1]));
        for (int i = 0; i < adjListArray.length; i++) {
            edges.add(new int[]{i, adjListArray[0][i]});
        }

        boolean visited[] = new boolean[points.length];
        visited[0] = true;
        int res = 0;
        int counter = 1;
        // while not all points are added to the mst set
        while (counter < points.length) {
            int[] min = edges.poll();
            int minEdge = min[0];
            if (visited[minEdge]) {
                continue;
            }
            visited[minEdge] = true;
            res += min[1];
            counter++;
            for (int i = 0; i < points.length; i++) {
                if (!visited[i]) {
                    edges.add(new int[]{i, adjListArray[minEdge][i]});
                }
            }
        }
        return res;
    }
}