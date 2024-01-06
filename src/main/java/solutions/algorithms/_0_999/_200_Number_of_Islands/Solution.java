package solutions.algorithms._0_999._200_Number_of_Islands;

class Solution {
    public int numIslands(char[][] grid) {

        int counter = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == '1') {
                    counter++;
                    markAllConnectedAsVisited(grid, y, x);
                }
            }
        }
        return counter;
    }

    void markAllConnectedAsVisited(char[][] grid, int y, int x) {
        grid[y][x] = '0';
        if (y > 0 && grid[y - 1][x] == '1') {
            markAllConnectedAsVisited(grid, y - 1, x);
        }
        if (y < grid.length - 1 && grid[y + 1][x] == '1') {
            markAllConnectedAsVisited(grid, y + 1, x);
        }
        if (x > 0 && grid[y][x - 1] == '1') {
            markAllConnectedAsVisited(grid, y, x - 1);
        }
        if (x < grid[0].length - 1 && grid[y][x + 1] == '1') {
            markAllConnectedAsVisited(grid, y, x + 1);
        }
    }
}