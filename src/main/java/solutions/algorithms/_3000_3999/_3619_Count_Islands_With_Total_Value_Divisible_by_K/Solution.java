package solutions.algorithms._3000_3999._3619_Count_Islands_With_Total_Value_Divisible_by_K;

class Solution {

    int[][] MOVES = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    public int countIslands(int[][] grid, int k) {

        int answer = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] > 0) {
                    long tot = getTotalValue(y, x, grid);
                    if (tot % k == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    // call only for non zero cell
    long getTotalValue(int y, int x, int[][] grid) {

        long currVal = grid[y][x];
        grid[y][x] = -1;

        for (int[] move : MOVES) {
            int newY = y + move[0];
            int newX = x + move[1];
            if (newY >= 0 && newY < grid.length && newX >= 0 && newX < grid[0].length) {
                if (grid[newY][newX] > 0) {
                    currVal += getTotalValue(newY, newX, grid);
                }
            }
        }
        return currVal;
    }
}