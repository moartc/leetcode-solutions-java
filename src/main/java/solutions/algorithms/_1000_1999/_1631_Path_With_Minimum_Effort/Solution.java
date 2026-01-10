package solutions.algorithms._1000_1999._1631_Path_With_Minimum_Effort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {

    /*
    I can try to find a path with BFS
    I don't need the full path, only the minimum effort to reach the current node. Then I return the value of the last one.

    update: Changing LinkedList to PriorityQueue and turning it into Dijkstra
     */
    public int minimumEffortPath(int[][] heights) {

        int[][] moves = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int[][] bestCost = new int[heights.length][heights[0].length];
        for (int[] ints : bestCost) {
            Arrays.fill(ints, Integer.MAX_VALUE);
        }
        // y, x, currentCost
        Queue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[2] - o2[2]);

        queue.add(new int[]{0, 0, 0});
        bestCost[0][0] = 0;
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int y = poll[0];
            int x = poll[1];
            int currentCost = poll[2];

            if (y == heights.length - 1 && x == heights[0].length - 1) {
                return currentCost;
            }

            if (currentCost > bestCost[y][x]) {
                // don't even try to check any moves
                continue;
            }
            // update cost
            // find all places where I can move
            for (int[] move : moves) {
                int newY = y + move[0];
                int newX = x + move[1];
                if (newY >= 0 && newY < heights.length && newX >= 0 && newX < heights[0].length) {
                    int costToGetToTheNewOne = Math.abs(heights[newY][newX] - heights[y][x]);
                    int finalCost = Math.max(currentCost, costToGetToTheNewOne);
                    if (finalCost < bestCost[newY][newX]) {
                        bestCost[newY][newX] = finalCost;
                        queue.add(new int[]{newY, newX, finalCost});
                    }
                }
            }
        }
        return bestCost[heights.length - 1][heights[0].length - 1];
    }
}