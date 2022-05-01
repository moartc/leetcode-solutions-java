package solutions.algorithms._566_Reshape_the_Matrix;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int originalNumOfEl = mat.length * mat[0].length;
        if (r * c != originalNumOfEl) {
            return mat;
        }

        int[][] toReturn = new int[r][c];

        int newRow = 0;
        int newCol = 0;
        for (int[] ints : mat) {
            for (int ic = 0; ic < mat[0].length; ic++) {
                toReturn[newRow][newCol] = ints[ic];
                newCol++;
                if (newCol == c) {
                    newRow++;
                    newCol = 0;
                }
            }
        }
        return toReturn;
    }
}