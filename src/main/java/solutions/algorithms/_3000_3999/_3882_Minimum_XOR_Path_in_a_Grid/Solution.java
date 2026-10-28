package solutions.algorithms._3000_3999._3882_Minimum_XOR_Path_in_a_Grid;

class Solution {

    boolean[][][] visited;
    int bestFound;

    public int minCost(int[][] grid) {

        bestFound = Integer.MAX_VALUE;
        visited = new boolean[grid.length][grid[0].length][1024];

        move(0, 0, grid[0][0], grid);
        return bestFound;
    }

    void move(int y, int x, int currVal, int[][] grid) {

        int newVal;
        if (y == 0 && x == 0) {
            newVal = grid[y][x];
        } else {
            newVal = currVal ^ grid[y][x];
        }

        if (y == grid.length - 1 && x == grid[0].length - 1) {
            bestFound = Math.min(bestFound, newVal);
        }
        if (visited[y][x][newVal]) {
            return;
        }
        visited[y][x][newVal] = true;

        if (y + 1 < grid.length) {
            move(y + 1, x, newVal, grid);
        }
        if (x + 1 < grid[0].length) {
            move(y, x + 1, newVal, grid);
        }
    }

}