package solutions.algorithms._1000_1999._1254_Number_of_Closed_Islands;

class Solution {
    int[][] MOVES = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    public int closedIsland(int[][] grid) {

        int ctr = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == 0) {
                    boolean shouldCount = visitAll(y, x, grid);
                    if (shouldCount) {
                        ctr++;
                    }
                }
            }
        }
        return ctr;
    }

    // return if the island is isolated
    // visit only unvisited (== 0)
    boolean visitAll(int y, int x, int[][] grid) {
        boolean isolated = true;
        if (y == 0 || y == grid.length - 1 || x == 0 || x == grid[0].length - 1) {
            isolated = false;
        }
        grid[y][x] = -1;
        for (int[] move : MOVES) {
            int newY = y + move[0];
            int newX = x + move[1];
            if (newY >= 0 && newY < grid.length && newX >= 0 && newX < grid[0].length) {
                if (grid[newY][newX] == 0) {
                    isolated = isolated & visitAll(newY, newX, grid);
                }
            }
        }
        return isolated;
    }
}