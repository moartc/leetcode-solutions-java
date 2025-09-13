package solutions.algorithms._0_999._62_Unique_Paths;

import java.util.Arrays;

class Solution {

    /*
    And here is the second solution.
    Number of path to (y,x) is equal to sum of paths to (y-1) and (y, x-1)
     */
    public int uniquePaths(int m, int n) {

        int[][] arr = new int[m][n];
        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                if (y == 0 || x == 0) {
                    arr[y][x] = 1;
                } else {
                    arr[y][x] = arr[y - 1][x] + arr[y][x - 1];
                }
            }
        }
        return arr[m - 1][n - 1];
    }

    /*
    I can do normal dfs
    with caching
    */
    int[][] cache;

    public int uniquePaths_v1(int m, int n) {
        cache = new int[m][n];
        for (int y = 0; y < cache.length; y++) {
            Arrays.fill(cache[y], -1);
        }
        dfs(0, 0, m, n);
        return cache[0][0];
    }

    int dfs(int y, int x, int m, int n) {

        if (cache[y][x] != -1) {
            return cache[y][x];
        }
        if (y == m - 1 && x == n - 1) {
            cache[y][x] = 1;
            return 1;
        }
        int paths = 0;
        if (y < m - 1) {
            paths += dfs(y + 1, x, m, n);
        }
        if (x < n - 1) {
            paths += dfs(y, x + 1, m, n);
        }
        cache[y][x] = paths;
        return paths;
    }
}