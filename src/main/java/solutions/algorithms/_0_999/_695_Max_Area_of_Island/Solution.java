package solutions.algorithms._0_999._695_Max_Area_of_Island;

class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int max = 0;
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[0].length; y++) {
                if(grid[x][y] == 1) {
                    int area = countArea(grid, x, y);
                    if(area > max) {
                        max = area;
                    }
                }
            }
        }
        return max;
    }

    int countArea(int[][] grid, int sc, int sr) {
        int ctr = 0;
        if (grid[sc][sr] == 1) {
            ctr++;
            grid[sc][sr] = -1;
            if (sc > 0) {
                ctr += countArea(grid, sc - 1, sr);
            }
            if (sr > 0) {
                ctr += countArea(grid, sc, sr - 1);
            }
            if (sc < grid.length - 1) {
                ctr += countArea(grid, sc + 1, sr);
            }
            if (sr < grid[0].length - 1) {
                ctr += countArea(grid, sc, sr + 1);
            }
            return ctr;
        } else {
            return 0;
        }
    }
}