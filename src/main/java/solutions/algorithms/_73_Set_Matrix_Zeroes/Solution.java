package solutions.algorithms._73_Set_Matrix_Zeroes;

class Solution {

    // O(n+m) solution
    public void setZeroes(int[][] matrix) {

        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                if(matrix[y][x] == 0) {
                    rows[y] = true;
                    cols[x] = true;
                }
            }
        }

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                if(cols[x] || rows[y]) {
                    matrix[y][x] = 0;
                }
            }
        }
    }
}