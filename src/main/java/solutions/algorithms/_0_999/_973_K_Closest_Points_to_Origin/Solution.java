package solutions.algorithms._0_999._973_K_Closest_Points_to_Origin;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {

    /*
    Something similar to 703. Kth Largest Element in a Stream
    I can track only k the smallest points in priority queue.
     */

    PriorityQueue<DistToPoint> queue = new PriorityQueue<>(Comparator.comparingDouble(
            value -> value.dist
    ));

    public int[][] kClosest(int[][] points, int k) {
        for (int[] point : points) {
            double dist = Math.sqrt((point[0] * point[0]) + (point[1] * point[1]));
            queue.add(new DistToPoint(dist, point));
        }

        int[][] answer = new int[k][2];

        for (int i = 0; i < k; i++) {
            answer[i] = queue.poll().point;
        }

        return answer;
    }

    private static class DistToPoint {
        double dist;
        int[] point;

        public DistToPoint(double dist, int[] point) {
            this.dist = dist;
            this.point = point;
        }
    }
}