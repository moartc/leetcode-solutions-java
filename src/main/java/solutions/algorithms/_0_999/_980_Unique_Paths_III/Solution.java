package solutions.algorithms._0_999._980_Unique_Paths_III;

class Solution {
    private static final int[][] MOVES = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    private int counter = 0;

    public int uniquePathsIII(int[][] grid) {
        int startY = -1;
        int startX = -1;
        int allToVisit = grid.length * grid[0].length;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                int gridVal = grid[y][x];
                if (gridVal == 1) {
                    startY = y;
                    startX = x;
                } else if (gridVal == -1) {
                    allToVisit--;
                }
            }
        }
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        visited[startY][startX] = true;
        dfs(startY, startX, grid, visited, 0, allToVisit);
        return counter; // final answer
    }

    void dfs(int y, int x, int[][] grid, boolean[][] visited, int visitedCtr, int allToVisit) {
        visited[y][x] = true;
        visitedCtr++;
        if (grid[y][x] == 2) {
            if (visitedCtr == allToVisit) {
                counter++;
            }
            visited[y][x] = false;
            return;
        }
        for (int[] move : MOVES) {
            int newY = y + move[0];
            int newX = x + move[1];
            if (newY >= 0 && newY < grid.length && newX >= 0 && newX < grid[0].length) {
                if (grid[newY][newX] != -1 && !visited[newY][newX]) {
                    dfs(newY, newX, grid, visited, visitedCtr, allToVisit);
                }
            }
        }
        visited[y][x] = false;
    }

}