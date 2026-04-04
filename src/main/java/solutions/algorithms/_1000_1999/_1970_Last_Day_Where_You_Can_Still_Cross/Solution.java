package solutions.algorithms._1000_1999._1970_Last_Day_Where_You_Can_Still_Cross;

class Solution {
    private static final int[][] MOVES = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    public int latestDayToCross(int row, int col, int[][] cells) {

        int[][] grid = new int[row][col];
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                grid[y][x] = cells.length + 1;
            }

        }
        for (int d = 0; d < cells.length; d++) {
            int[] cell = cells[d];
            int yc = cell[0] - 1;
            int xc = cell[1] - 1;
            grid[yc][xc] = d + 1;
        }

        int l = 1;
        int r = cells.length;
        int foundDay = 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (canReachTheEnd(mid, grid)) {
                l = mid + 1;
                foundDay = mid;
            } else {
                r = mid - 1;
            }
        }
        return foundDay;
    }

    boolean canReachTheEnd(int day, int[][] grid) {
        for (int x = 0; x < grid[0].length; x++) {
            if (grid[0][x] > day) {
                if (singlePath(0, x, day, grid, new boolean[grid.length][grid[0].length])) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean singlePath(int y, int x, int day, int[][] grid, boolean[][] visited) {
        if (y == grid.length - 1) {
            return true;
        }
        visited[y][x] = true;
        for (int[] move : MOVES) {
            int newY = y + move[0];
            int newX = x + move[1];
            if (newY >= 0 && newY < grid.length && newX >= 0 && newX < grid[0].length) {
                if (!visited[newY][newX] && grid[newY][newX] > day) {
                    if (singlePath(newY, newX, day, grid, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
