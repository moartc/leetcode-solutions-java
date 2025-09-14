package solutions.algorithms._0_999._994_Rotting_Oranges;

import java.util.HashSet;
import java.util.Set;

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
     */

    public int orangesRotting(int[][] grid) {

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == 0) {
                    // new empty
                    grid[y][x] = -3;
                } else if (grid[y][x] == 2) {
                    // new rotten
                    grid[y][x] = -2;
                } else if (grid[y][x] == 1) {
                    // new fresh
                    grid[y][x] = -1;
                }
            }
        }

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == -2) {
                    // it's rotten
                    visitAndMark(y, x, grid, 0);
                }
            }
        }

        int maxFound = 0;
        for (int[] ints : grid) {
            for (int x = 0; x < grid[0].length; x++) {
                if (ints[x] == -1) {
                    // there is still a fresh one
                    return -1;
                }
                maxFound = Integer.max(maxFound, ints[x]);
            }
        }
        return maxFound;
    }

    void visitAndMark(int y, int x, int[][] grid, int numberOfSteps) {

        if (grid[y][x] >= 0 && grid[y][x] <= numberOfSteps) {
            // it's been visited with a shorter path
            return;
        }
        grid[y][x] = numberOfSteps;
        if (y - 1 >= 0 && grid[y - 1][x] >= -1) {
            visitAndMark(y - 1, x, grid, numberOfSteps + 1);
        }
        if (y + 1 < grid.length && grid[y + 1][x] >= -1) {
            visitAndMark(y + 1, x, grid, numberOfSteps + 1);
        }
        if (x - 1 >= 0 && grid[y][x - 1] >= -1) {
            visitAndMark(y, x - 1, grid, numberOfSteps + 1);
        }
        if (x + 1 < grid[0].length && grid[y][x + 1] >= -1) {
            visitAndMark(y, x + 1, grid, numberOfSteps + 1);
        }
    }


    // That's the first approach
    public int orangesRotting_v1(int[][] grid) {

        Set<int[]> setOfRotten = new HashSet<>();

        int totalFresh = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == 2) {
                    setOfRotten.add(new int[]{y, x});
                } else if (grid[y][x] == 1) {
                    totalFresh++;
                }
            }
        }
        int currentMin = 0;
        int rotCounter = 0;
        // process
        Set<int[]> newRottens = new HashSet<>();
        while (true) {
            for (int[] anInt : setOfRotten) {
                int y = anInt[0];
                int x = anInt[1];

                if (y - 1 >= 0 && grid[y - 1][x] == 1) {
                    grid[y - 1][x] = 2;
                    newRottens.add(new int[]{y - 1, x});
                }
                if (y + 1 < grid.length && grid[y + 1][x] == 1) {
                    grid[y + 1][x] = 2;
                    newRottens.add(new int[]{y + 1, x});
                }
                if (x - 1 >= 0 && grid[y][x - 1] == 1) {
                    grid[y][x - 1] = 2;
                    newRottens.add(new int[]{y, x - 1});
                }
                if (x + 1 < grid[0].length && grid[y][x + 1] == 1) {
                    grid[y][x + 1] = 2;
                    newRottens.add(new int[]{y, x + 1});
                }
            }
            if (newRottens.isEmpty()) {
                if (rotCounter == totalFresh) {
                    return currentMin;
                } else {
                    return -1;
                }
            } else {
                setOfRotten = new HashSet<>(newRottens);
                rotCounter += newRottens.size();
                newRottens.clear();
            }
            currentMin++;
        }
    }
}