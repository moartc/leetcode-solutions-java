package solutions.algorithms._0_999._778_Swim_in_Rising_Water;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {

    /*
    Initial solution: SFA with caching + ordering paths to visit.
    It beats 5% - below as v1

    newer approach: Dijkstra
     */

    int[][] neighboursDir = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int swimInWater(int[][] grid) {

        int[][] dist = new int[grid.length][grid[0].length];

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                dist[y][x] = Integer.MAX_VALUE;
            }
        }
        dist[0][0] = grid[0][0];

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));

        pq.add(new int[]{0, 0, grid[0][0]});

        while (!pq.isEmpty()) {
            int[] cell = pq.poll();

            if (cell[0] == grid.length - 1 && cell[1] == grid[0].length - 1) {
                return cell[2];
            }

            for (int[] dir : neighboursDir) {
                int ny = cell[0] + dir[0];
                int nx = cell[1] + dir[1];
                if (ny >= 0 && ny < grid.length && nx >= 0 && nx < grid[0].length) {
                    int newNeighbourDist = Math.max(cell[2], grid[ny][nx]);
                    if (dist[ny][nx] > newNeighbourDist) {
                        dist[ny][nx] = newNeighbourDist;
                        pq.add(new int[]{ny, nx, newNeighbourDist});
                    }
                }
            }
        }
        // shouldn't happen
        return -1;
    }


    // first implementation (bests 40%) - commented out
    /*
    int minFound = Integer.MAX_VALUE;
    int[][] bestFound;
    PriorityQueue<int[]> toVisit = new PriorityQueue<>(Comparator.comparingInt(value -> value[2]));
    public int swimInWater_v1(int[][] grid) {

        boolean[][] visited = new boolean[grid.length][grid.length];

        bestFound = new int[grid.length][grid.length];

        for (int[] ints : bestFound) {
            Arrays.fill(ints, Integer.MAX_VALUE);
        }
        visit(0, 0, 0, visited, grid);
        return minFound;
    }

    void visit(int y, int x, int max, boolean[][] visited, int[][] grid) {

        int currValue = grid[y][x];

        if (currValue > max) {
            max = currValue;
        }

        if (max >= minFound) {
            return;
        }

        if (bestFound[y][x] <= max) {
            return;
        } else {
            bestFound[y][x] = max;
        }

        if (y == grid.length - 1 && x == grid[0].length - 1) {
            minFound = Math.min(max, minFound);
            return;
        }
        if (y - 1 >= 0 && !visited[y - 1][x]) {
            toVisit.add(new int[]{y - 1, x, grid[y - 1][x]});
        }
        if (y + 1 < grid.length && !visited[y + 1][x]) {
            toVisit.add(new int[]{y + 1, x, grid[y + 1][x]});
        }
        if (x - 1 >= 0 && !visited[y][x - 1]) {
            toVisit.add(new int[]{y, x - 1, grid[y][x - 1]});
        }
        if (x + 1 < grid[0].length && !visited[y][x + 1]) {
            toVisit.add(new int[]{y, x + 1, grid[y][x + 1]});
        }

        while (!toVisit.isEmpty()) {
            int[] yxAndCost = toVisit.poll();
            visited[yxAndCost[0]][yxAndCost[1]] = true;
            visit(yxAndCost[0], yxAndCost[1], max, visited, grid);
            visited[yxAndCost[0]][yxAndCost[1]] = false;
        }
    }
     */

}