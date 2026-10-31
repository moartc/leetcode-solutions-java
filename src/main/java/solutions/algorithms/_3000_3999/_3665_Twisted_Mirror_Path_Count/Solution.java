package solutions.algorithms._3000_3999._3665_Twisted_Mirror_Path_Count;

import java.util.Arrays;

class Solution {

    int MOD = 1000000000 + 7;
    int[][][] numbOfPaths;

    public int uniquePaths(int[][] grid) {

        // last dim 0 - come from left, 1 - from up (for mirror only)
        // otherwise value at 0
        numbOfPaths = new int[grid.length][grid[0].length][2];
        for (int[][] path : numbOfPaths) {
            for (int[] ints : path) {
                Arrays.fill(ints, -1);
            }
        }
        return getPaths(0, 0, -1, grid) % MOD;

    }

    int getPaths(int y, int x, int visitedFrom, int[][] grid) {

        if (y == grid.length - 1 && x == grid[0].length - 1) {
            return 1;
        }

        if (grid[y][x] == 1) {
            // mirror
            int answer = 0;
            if (visitedFrom == 0) {
                if (numbOfPaths[y][x][visitedFrom] != -1) {
                    return numbOfPaths[y][x][visitedFrom];
                }
                // should go down
                if (y + 1 < grid.length) {
                    answer = getPaths(y + 1, x, 1, grid);
                    numbOfPaths[y][x][0] = answer % MOD;
                    return numbOfPaths[y][x][0];
                }
            } else if (visitedFrom == 1) {
                // should go right
                if (x + 1 < grid[0].length) {
                    answer = getPaths(y, x + 1, 0, grid);
                    numbOfPaths[y][x][1] = answer % MOD;
                    return numbOfPaths[y][x][1];
                }
            }
            return answer;
        } else { // normal cell
            if (numbOfPaths[y][x][0] != -1) {
                return numbOfPaths[y][x][0];
            }
            int answer = 0;
            if (y + 1 < grid.length) {
                answer += getPaths(y + 1, x, 1, grid);
            }
            if (x + 1 < grid[0].length) {
                answer += getPaths(y, x + 1, 0, grid);
            }
            numbOfPaths[y][x][0] = answer % MOD;
            return numbOfPaths[y][x][0];
        }
    }

}