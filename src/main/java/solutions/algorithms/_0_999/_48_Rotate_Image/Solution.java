package solutions.algorithms._0_999._48_Rotate_Image;

class Solution {

    /*
    so, for an array of size n:
    [0][0] goes to [0][n-1]
    [0][1] goes to [1][n-1]
    [0][n-1] goes to [n-1][n-1]
    [1][0] goes to [0][n-2]
    [n-1][0] goes to [0][0]
    [0][1] goest to [1][n-1]
    [n-2][0] goest to [0][1]
    [n-2][1] goest ot [1][1]

    to generalise (there is always either y or x fixed (with addition from "repeat"):
    (there were some bugs, so here goes the final formula)
    v1 = matrix[rep][i];
    v2 = matrix[i][n - 1 - rep];
    v3 = matrix[n - 1 - rep][n - 1 - i];
    v4 = matrix[n - 1 - i][rep];

    matrix[rep][i] = v4;
    matrix[i][n - 1 - rep] = v1;
    matrix[n - 1 - rep][n - 1 - i] = v2;
    matrix[n - 1 - i][rep] = v3;

    for the first (index = 0) row I iterate from 0 ... n-1
    then from 1 ... n-2
    I have to repeat it to:
    - in case of odd 'n' -> (int) n/2
    - in cae of even 'n' -> (n/2)-1

     */
    public void rotate(int[][] matrix) {

        int midRow;
        int n = matrix.length;
        if (n % 2 == 0) {
            midRow = (n / 2) - 1;
        } else {
            midRow = n / 2;
        }

        for (int rep = 0; rep <= midRow; rep++) {
            for (int i = rep; i < n - rep - 1; i++) {
                int v1 = matrix[rep][i];
                int v2 = matrix[i][n - 1 - rep];
                int v3 = matrix[n - 1 - rep][n - 1 - i];
                int v4 = matrix[n - 1 - i][rep];

                matrix[rep][i] = v4;
                matrix[i][n - 1 - rep] = v1;
                matrix[n - 1 - rep][n - 1 - i] = v2;
                matrix[n - 1 - i][rep] = v3;
            }
        }
    }
}