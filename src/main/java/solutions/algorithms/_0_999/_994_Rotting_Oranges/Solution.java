package solutions.algorithms._0_999._994_Rotting_Oranges;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    /*
    orangesRotting_v1 - initial solution with a terrible performance: beats - 4.93%


    The new one below:
    I can start from all initially rotten oranges, track the number of steps, and whenever I visit a fresh orange
    I check if the current path is shorter, if so, I update it and continue; otherwise, I can stop.
    I also need to modify the initial grid, let's say as follows:
    -3 - empty
    -2 - rotten
    -1 - fresh
    this solution beats 100%

    update: problem revisited - a standard BFS approach
     */
    int[][] indices = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    public int orangesRotting(int[][] grid) {


        int allFresh = 0;
        Queue<int[]> processingList = new LinkedList<>();

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                int v = grid[y][x];
                if (v == 1) {
                    allFresh++;
                } else if (v == 2) {
                    processingList.add(new int[]{y, x});
                }
            }
        }

        if (allFresh == 0) {
            return 0;
        }

        int roundCtr = -1;
        while (!processingList.isEmpty()) {
            roundCtr++;

            int numberOfOrangesInThisRound = processingList.size();
            for (int i = 0; i < numberOfOrangesInThisRound; i++) {
                int[] currentOrange = processingList.poll();

                for (int[] index : indices) {
                    int yChange = index[0];
                    int xChange = index[1];
                    int newY = currentOrange[0] + yChange;
                    int newX = currentOrange[1] + xChange;
                    if (newY >= 0 && newY < grid.length && newX >= 0 && newX < grid[0].length) {
                        if (grid[newY][newX] == 1) {
                            grid[newY][newX] = 2;
                            allFresh--;
                            processingList.add(new int[]{newY, newX});
                        }
                    }
                }
            }
        }
        if (allFresh == 0) {
            return roundCtr;
        } else {
            return -1;
        }

    }

}