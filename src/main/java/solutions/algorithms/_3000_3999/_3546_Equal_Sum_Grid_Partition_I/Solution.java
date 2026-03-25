package solutions.algorithms._3000_3999._3546_Equal_Sum_Grid_Partition_I;

class Solution {


    public boolean canPartitionGrid(int[][] grid) {
        long[] prefixRowSum = new long[grid.length];
        long[] prefixColSum = new long[grid[0].length];

        long rowPrefix = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                rowPrefix += grid[y][x];
            }
            prefixRowSum[y] = rowPrefix;
        }

        long colPrefix = 0;
        for (int x = 0; x < grid[0].length; x++) {
            for (int y = 0; y < grid.length; y++) {
                colPrefix += grid[y][x];
            }
            prefixColSum[x] = colPrefix;
        }

        long totalRowSum = prefixRowSum[prefixRowSum.length - 1];
        for (int i = 0; i < prefixRowSum.length - 1; i++) {
            long currentValue = prefixRowSum[i];
            if (totalRowSum - currentValue == currentValue) {
                return true;
            }
        }

        long totalColSum = prefixColSum[prefixColSum.length - 1];
        for (int i = 0; i < prefixColSum.length - 1; i++) {
            long currentValue = prefixColSum[i];
            if (totalColSum - currentValue == currentValue) {
                return true;
            }
        }
        return false;
    }
}