package solutions.algorithms._73_Set_Matrix_Zeroes;

class Solution {

    public void setZeroes(int[][] matrix) {

        boolean setZeroRow = false;
        boolean setZeroCol = false;
        for (int x = 0; x < matrix[0].length; x++) {
            if (matrix[0][x] == 0) {
                setZeroRow = true;
                break;
            }
        }
        for (int[] ints : matrix) {
            if (ints[0] == 0) {
                setZeroCol = true;
                break;
            }
        }

        for (int y = 1; y < matrix.length; y++) {
            for (int x = 1; x < matrix[y].length; x++) {
                if (matrix[y][x] == 0) {
                    matrix[0][x] = 0;
                    matrix[y][0] = 0;
                }
            }
        }

        for (int y = 1; y < matrix.length; y++) {
            for (int x = 1; x < matrix[y].length; x++) {
                if (matrix[0][x] == 0 || matrix[y][0] == 0) {
                    matrix[y][x] = 0;
                }
            }
        }

        // changes for row 0
        if (setZeroRow) {
            for (int x = 0; x < matrix[0].length; x++) {
                matrix[0][x] = 0;
            }
        }

        // changes for col 0
        if (setZeroCol) {
            for (int y = 0; y < matrix.length; y++) {
                matrix[y][0] = 0;
            }
        }
    }
}