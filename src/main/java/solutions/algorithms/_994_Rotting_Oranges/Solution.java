package solutions.algorithms._994_Rotting_Oranges;

class Solution {
    public int orangesRotting(int[][] grid) {

        int counter = 0;
        while (true) {
            if (alLRotten(grid)) {
                return counter;
            }
            boolean wasUpdated = false;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 2) {
                        wasUpdated |= updateOranges(grid, i, j);
                    }
                }
            }
            if (!wasUpdated) {
                return -1;
            } else {
                applyChanges(grid);
            }
            counter++;
        }
    }

    private void applyChanges(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 3) {
                    grid[i][j] = 2;
                }
            }
        }
    }

    boolean alLRotten(int[][] grid) {
        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                if (ints[j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean updateOranges(int[][] grid, int x, int y) {
        boolean updated = false;
        if (x > 0 && grid[x - 1][y] == 1) {
            grid[x - 1][y] = 3;
            updated = true;
        }
        if (x < grid.length - 1 && grid[x + 1][y] == 1) {
            grid[x + 1][y] = 3;
            updated = true;
        }
        if (y > 0 && grid[x][y - 1] == 1) {
            grid[x][y - 1] = 3;
            updated = true;
        }
        if (y < grid[0].length - 1 && grid[x][y + 1] == 1) {
            grid[x][y + 1] = 3;
            updated = true;
        }
        return updated;
    }
}