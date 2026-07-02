package solutions.algorithms._2000_2999._2812_Find_the_Safest_Path_in_a_Grid;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    /*
    first calculate the minimum manhattan distance for each cell
    then find the best path
     */

    int bestFound;

    public int maximumSafenessFactor(List<List<Integer>> grid) {

        int[][] md = new int[grid.size()][grid.size()];
        for (int[] ints : md) {
            Arrays.fill(ints, Integer.MAX_VALUE);
        }

        Queue<int[]> allStartingPoints = new LinkedList<>();
        for (int y = 0; y < grid.size(); y++) {
            for (int x = 0; x < grid.get(y).size(); x++) {
                if (grid.get(y).get(x) == 1) {
                    allStartingPoints.add(new int[]{y, x});
                }
            }
        }
        calcMD(md, allStartingPoints);


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] ints : md) {
            for (int x = 0; x < md.length; x++) {
                int v = ints[x];
                min = Math.min(min, v);
                max = Math.max(max, v);
            }
        }


        // there is at least one thief in the grid
        bestFound = -1;

        while (min <= max) {
            int mid = (max + min) / 2;

            boolean[][] visited = new boolean[md.length][md.length];
            visited[0][0] = true;
            boolean canVisit = md[0][0] >= mid && md[md.length - 1][md.length - 1] >= mid && canVisit(mid, md, visited);
            if (canVisit) {
                bestFound = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return bestFound;
    }

    boolean canVisit(int min, int[][] md, boolean[][] visited) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int y = cell[0];
            int x = cell[1];

            if (y == md.length - 1 && x == md.length - 1) {
                return true;
            }
            if (y > 0 && !visited[y - 1][x] && md[y - 1][x] >= min) {
                visited[y - 1][x] = true;
                q.add(new int[]{y - 1, x});
            }
            if (y < md.length - 1 && !visited[y + 1][x] && md[y + 1][x] >= min) {
                visited[y + 1][x] = true;
                q.add(new int[]{y + 1, x});
            }
            if (x > 0 && !visited[y][x - 1] && md[y][x - 1] >= min) {
                visited[y][x - 1] = true;
                q.add(new int[]{y, x - 1});
            }
            if (x < md.length - 1 && !visited[y][x + 1] && md[y][x + 1] >= min) {
                visited[y][x + 1] = true;
                q.add(new int[]{y, x + 1});
            }
        }

        return false;

    }

    void calcMD(int[][] md, Queue<int[]> q) {
        int dist = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                int[] cell = q.poll();
                int y = cell[0];
                int x = cell[1];
                if (md[y][x] <= dist) {
                    size--;
                    continue;
                }
                md[y][x] = dist;
                if (y > 0 && md[y - 1][x] > dist) {
                    q.add(new int[]{y - 1, x});
                }
                if (y < md.length - 1 && md[y + 1][x] > dist) {
                    q.add(new int[]{y + 1, x});
                }
                if (x > 0 && md[y][x - 1] > dist) {
                    q.add(new int[]{y, x - 1});
                }
                if (x < md.length - 1 && md[y][x + 1] > dist) {
                    q.add(new int[]{y, x + 1});
                }
                size--;
            }
            dist++;

        }
    }
}