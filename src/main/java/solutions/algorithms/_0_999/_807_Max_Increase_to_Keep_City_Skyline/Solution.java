package solutions.algorithms._0_999._807_Max_Increase_to_Keep_City_Skyline;

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] maxCols = new int[grid.length];
        int[] maxRows = new int[grid[0].length];

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                maxCols[x] = Math.max(grid[y][x], maxCols[x]);
                maxRows[y] = Math.max(grid[y][x], maxRows[y]);
            }
        }
        int totalIncrease = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                int currentCell = grid[y][x];
                int limit = Math.min(maxCols[x], maxRows[y]);
                totalIncrease += (limit - currentCell);
            }
        }
        return totalIncrease;
    }

}