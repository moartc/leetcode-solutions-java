package solutions.algorithms._0_999._64_Minimum_Path_Sum;

class Solution {

    /*
    I can iterate through all rows from left to right.
    At each position I set the minimum path to that cell by choosing the smaller of the values from the
    left and from the top, and adding the value at the current position.
    Special handling for the first row and the leftmost column - since one of the neighbours is missing
    The final answer is the value in the bottom right cell at the end.
     */
    public int minPathSum(int[][] grid) {

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (y == 0 && x == 0) {
                    // keep the current one
                } else if (y == 0) {
                    grid[y][x] = grid[y][x - 1] + grid[y][x];
                } else if (x == 0) {
                    grid[y][x] = grid[y - 1][x] + grid[y][x];
                } else {
                    int top = grid[y - 1][x];
                    int left = grid[y][x - 1];
                    int bestPath = Math.min(top, left) + grid[y][x];
                    grid[y][x] = bestPath;
                }
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}