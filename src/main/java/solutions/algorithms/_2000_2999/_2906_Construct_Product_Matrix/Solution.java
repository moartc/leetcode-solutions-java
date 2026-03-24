package solutions.algorithms._2000_2999._2906_Construct_Product_Matrix;

class Solution {
    public int[][] constructProductMatrix(int[][] grid) {

        long[][] prefixGrid = new long[grid.length][grid[0].length];
        long[][] suffixGrid = new long[grid.length][grid[0].length];

        long prefix = 1;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                prefixGrid[y][x] = prefix;
                prefix = prefix % 12345 * grid[y][x] % 12345;
            }
        }
        long suffix = 1;
        for (int y = grid.length - 1; y >= 0; y--) {
            for (int x = grid[0].length - 1; x >= 0; x--) {
                suffixGrid[y][x] = suffix;
                suffix = suffix % 12345 * grid[y][x] % 12345;
            }
        }
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                grid[y][x] = (int) ((prefixGrid[y][x] * suffixGrid[y][x]) % 12345);
            }
        }
        return grid;
    }
}