package solutions.algorithms._0_999._329_Longest_Increasing_Path_in_a_Matrix;

class Solution {

    /*
    I can iterate through the 2D array and start searching at every cell (y, x)
    I can then cache the best path from the current cell in a separate 2D array.
    If I revisit a cell, I can get the best value from the cache.
    I also track the longest 'global' path found.
     */

    int[][] dir = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int[][] bestPaths;
    int globBestFound = Integer.MIN_VALUE;

    public int longestIncreasingPath(int[][] matrix) {

        bestPaths = new int[matrix.length][matrix[0].length];

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                int bestPathFromCell = findPath(y, x, matrix);
                if (bestPathFromCell > globBestFound) {
                    globBestFound = bestPathFromCell;
                }
            }
        }
        return globBestFound;
    }

    int findPath(int y, int x, int[][] matrix) {
        if (bestPaths[y][x] != 0) {
            return bestPaths[y][x];
        }
        int bestFound = 1;
        for (int[] d : dir) {
            int ny = y + d[0];
            int nx = x + d[1];
            if (ny >= 0 && ny < matrix.length && nx >= 0 && nx < matrix[0].length && matrix[ny][nx] > matrix[y][x]) {
                bestFound = Integer.max(bestFound, 1 + findPath(ny, nx, matrix));
            }
        }
        bestPaths[y][x] = bestFound;
        return bestFound;
    }
}