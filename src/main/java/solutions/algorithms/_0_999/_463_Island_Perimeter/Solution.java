package solutions.algorithms._0_999._463_Island_Perimeter;

class Solution {

    /*
    I could iterate over the whole grid and if the current cell
    is land, count the number of its neighbours and subtract that from 4.
    Then add this value to the total result.
     */
    public int islandPerimeter(int[][] grid) {

        int total = 0;

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                if (grid[y][x] == 1) {
                    total += (4 - countNeighbours(y, x, grid));
                }
            }
        }
        return total;
    }

    int countNeighbours(int y, int x, int[][] grid) {
        int non = 0;
        if (y > 0) {
            if (grid[y - 1][x] == 1) {
                non++;
            }
        }
        if (y < grid.length - 1) {
            if (grid[y + 1][x] == 1) {
                non++;
            }
        }
        if (x > 0) {
            if (grid[y][x - 1] == 1) {
                non++;
            }
        }
        if (x < grid[0].length - 1) {
            if (grid[y][x + 1] == 1) {
                non++;
            }
        }
        return non;
    }
}