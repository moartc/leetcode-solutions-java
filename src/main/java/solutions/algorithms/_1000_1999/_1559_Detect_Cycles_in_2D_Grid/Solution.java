package solutions.algorithms._1000_1999._1559_Detect_Cycles_in_2D_Grid;

class Solution {

    int[][] INDICES = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    public boolean containsCycle(char[][] grid) {

        boolean[][] allVisited = new boolean[grid.length][grid[0].length];
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (!allVisited[y][x]) {
                    allVisited[y][x] = true;
                    if (visit(y, x, -1, -1, allVisited, grid)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean visit(int y, int x, int prevY, int prevX, boolean[][] allVisited, char[][] grid) {

        for (int[] move : INDICES) {
            int newY = move[0] + y;
            int newX = move[1] + x;
            if (newY >= 0 && newY < grid.length && newX >= 0 && newX < grid[0].length) {
                if (allVisited[newY][newX] && grid[newY][newX] == grid[y][x] && newY != prevY && newX != prevX) {
                    return true;
                } else if (!allVisited[newY][newX] && grid[newY][newX] == grid[y][x]) {
                    allVisited[newY][newX] = true;
                    if (visit(newY, newX, y, x, allVisited, grid)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}