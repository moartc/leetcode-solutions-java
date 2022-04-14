package solutions.algorithms._542_01_Matrix;

class Solution {
    public int[][] updateMatrix(int[][] mat) {

        int[][] result = new int[mat.length][mat[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = -1;
            }
        }
        for (int m = 0; m < mat.length; m++) {
            for (int n = 0; n < mat[m].length; n++) {
                if (mat[m][n] == 0) {
                    result[m][n] = 0;
                } else { // mat[m][n] == 1
                    if (n > 0 && result[m][n - 1] != -1 && (result[m][n] == -1 || result[m][n] > result[m][n - 1])) {
                        result[m][n] = result[m][n - 1] + 1;
                    }
                }
            }
        }
        for (int m = 0; m < mat[0].length; m++) {
            for (int n = 0; n < mat.length; n++) {
                if (result[n][m] != 0 && n > 0 && result[n - 1][m] != -1 && (result[n][m] == -1 || result[n][m] > result[n - 1][m])) {
                    result[n][m] = result[n - 1][m] + 1;
                }
            }
        }
        for (int m = 0; m < mat[0].length; m++) {
            for (int n = mat.length - 1; n >= 0; n--) {
                if (result[n][m] != 0 && n < mat.length - 1 && result[n + 1][m] != -1 && (result[n][m] == -1 || result[n + 1][m] < result[n][m])) {
                    result[n][m] = result[n + 1][m] + 1;
                }
            }
        }
        for (int m = 0; m < mat.length; m++) {
            for (int n = mat[0].length - 1; n >= 0; n--) {
                if (result[m][n] != 0 && n < mat[0].length - 1 && result[m][n + 1] != -1 && (result[m][n] == -1 || result[m][n] > result[m][n + 1])) {
                    result[m][n] = result[m][n + 1] + 1;
                }
            }
        }
        return result;
    }
}

