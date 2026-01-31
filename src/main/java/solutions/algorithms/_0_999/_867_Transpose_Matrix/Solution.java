package solutions.algorithms._0_999._867_Transpose_Matrix;

class Solution {

    /*
    just a simple transpose
     */
    public int[][] transpose(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                int v = matrix[y][x];
                newMatrix[x][y] = v;
            }
        }
        return newMatrix;
    }
}