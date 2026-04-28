package solutions.algorithms._2000_2999._2033_Minimum_Operations_to_Make_a_Uni_Value_Grid;

import java.util.Arrays;

class Solution {

    /*
    1 1 1 3 5 5 5 5
     */
    public int minOperations(int[][] grid, int x) {

        int[] flat = new int[grid.length * grid[0].length];
        if (flat.length == 1) {
            return 0;
        }
        int idx = 0;
        for (int[] ints : grid) {
            for (int c = 0; c < grid[0].length; c++) {
                flat[idx++] = ints[c];
            }
        }

        Arrays.sort(flat);
        int midVal = flat[flat.length / 2];
        int ctr = 0;
        for (int v : flat) {
            int diff = Math.abs(v - midVal);
            if (diff % x != 0) {
                return -1;
            }
            ctr += Math.abs(diff / x);
        }
        return ctr;
    }
}