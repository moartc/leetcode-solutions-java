package solutions.algorithms._0_999._695_Max_Area_of_Island;

class Solution {

    /*
    It's a similar problem to "200. Number of Islands"
    beats 100%
     */
    public int maxAreaOfIsland(int[][] grid) {

        int max = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == 1) {
                    int counter = countArea(y, x, grid);
                    if (counter > max) {
                        max = counter;
                    }
                }
            }
        }
        return max;
    }

    int countArea(int y, int x, int[][] grid) {
        int counter = 1;
        // mark as visited
        grid[y][x] = -1;
        if (y - 1 >= 0 && grid[y - 1][x] == 1) {
            counter += countArea(y - 1, x, grid);
        }
        if (y + 1 < grid.length && grid[y + 1][x] == 1) {
            counter += countArea(y + 1, x, grid);
        }

        if (x - 1 >= 0 && grid[y][x - 1] == 1) {
            counter += countArea(y, x - 1, grid);
        }

        if (x + 1 < grid[0].length && grid[y][x + 1] == 1) {
            counter += countArea(y, x + 1, grid);
        }
        return counter;
    }
}