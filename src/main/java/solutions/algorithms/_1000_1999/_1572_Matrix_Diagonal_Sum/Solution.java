package solutions.algorithms._1000_1999._1572_Matrix_Diagonal_Sum;

class Solution {
    public int diagonalSum(int[][] mat) {

        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[mat.length - 1 - i][i];
        }
        if (mat.length % 2 != 0) {
            int toRemove = mat.length / 2;
            sum -= mat[toRemove][toRemove];
        }
        return sum;
    }
}