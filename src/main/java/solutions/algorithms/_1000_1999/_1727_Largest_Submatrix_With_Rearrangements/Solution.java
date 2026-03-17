package solutions.algorithms._1000_1999._1727_Largest_Submatrix_With_Rearrangements;

import java.util.Arrays;

class Solution {

    /*
    Iterate each column bottom up and at each cell write number of 1s below
    then going row by row:
    sort it in descending order, and iterating from left to right find max rectangle
    at each point I know that on the right side were only greater or equal values
     */
    public int largestSubmatrix(int[][] matrix) {

        for (int x = 0; x < matrix[0].length; x++) {
            for (int y = matrix.length - 1; y >= 0; y--) {
                int valueBelow = y == matrix.length - 1 ? 0 : matrix[y + 1][x];
                int val = matrix[y][x] == 0 ? 0 : matrix[y][x] + valueBelow;
                matrix[y][x] = val;
            }
        }
        int bestFound = Integer.MIN_VALUE;
        for (int y = 0; y < matrix.length; y++) {
            int[] row = matrix[y];
            Arrays.sort(row);
            int index = 0;
            for (int x = row.length - 1; x >= 0; x--) {
                index++;
                int currentArea = matrix[y][x] * index;
                bestFound = Math.max(currentArea, bestFound);
            }
        }
        return bestFound;
    }
}