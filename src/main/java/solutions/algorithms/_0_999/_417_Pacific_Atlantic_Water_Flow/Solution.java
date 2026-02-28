package solutions.algorithms._0_999._417_Pacific_Atlantic_Water_Flow;

import java.util.ArrayList;
import java.util.List;

class Solution {

    int[][] indices = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int m = heights.length;
        int n = heights[0].length;

        boolean[][] canAccessPacific = new boolean[m][n];
        boolean[][] canAccessAtlantic = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            canAccessPacific[i][0] = true;
            canAccessAtlantic[i][n - 1] = true;
        }
        for (int i = 0; i < n; i++) {
            canAccessPacific[0][i] = true;
            canAccessAtlantic[m - 1][i] = true;
        }

        for (int i = 0; i < m; i++) {
            markVisit(new int[]{i, 0}, heights, canAccessPacific);
            markVisit(new int[]{i, n - 1}, heights, canAccessAtlantic);
        }
        for (int i = 0; i < n; i++) {
            markVisit(new int[]{0, i}, heights, canAccessPacific);
            markVisit(new int[]{m - 1, i}, heights, canAccessAtlantic);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (canAccessPacific[i][j] && canAccessAtlantic[i][j]) {
                    result.add(List.of(i, j));
                }
            }
        }
        return result;
    }

    void markVisit(int[] start, int[][] heights, boolean[][] canAccessOcean) {

        int yS = start[0];
        int xS = start[1];
        for (int[] index : indices) {
            int diffY = index[0];
            int diffX = index[1];
            int newY = yS + diffY;
            int newX = xS + diffX;
            if (newY >= 0 && newY < heights.length && newX >= 0 && newX < heights[0].length) {
                if (heights[newY][newX] >= heights[yS][xS] && !canAccessOcean[newY][newX]) {
                    canAccessOcean[newY][newX] = true;
                    markVisit(new int[]{newY, newX}, heights, canAccessOcean);
                }
            }
        }
    }
}