package solutions.algorithms._62_Unique_Paths;

class Solution {

    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                if (y == 0 || x == 0) {
                    arr[y][x] = 1;
                } else {
                    arr[y][x] = arr[y - 1][x] + arr[y][x-1];
                }
            }
        }
        return arr[m - 1][n - 1];
    }
}