package solutions.algorithms._0_999._73_Set_Matrix_Zeroes;

class Solution {

    /*
    (Revisiting - I think I still remember the general idea for the solution to this problem).

    I can track rows where there should be zeros in any row and do the same for columns - let's say row 0 and column 0.
    In the first iteration, if I find a zero at [y][x], I set 0 at [y][0] and [0][x]
    Then I just iterate through the first column and the first row, and if there's a 0 there, I set the whole corresponding row or column
    to zeros.
    With that I don't need to allocate any additional memory.

    update: [0][0] must be handled at the end, because otherwise, in the case it's equal to zero I would overwrite everything with zeros
    I will track separately row 0 and column 0 (so I actually need to allocate something...).
     */

    public void setZeroes(int[][] matrix) {
        boolean isZeroAt00 = matrix[0][0] == 0;
        boolean resetCol0 = false;
        boolean resetRow0 = false;

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                if (matrix[y][x] == 0) {
                    if (y == 0) {
                        resetRow0 = true;
                    } else if (x == 0) {
                        resetCol0 = true;
                    }
                    matrix[0][x] = 0;
                    matrix[y][0] = 0;
                }
            }
        }

        // setting columns
        for (int x = 1; x < matrix[0].length; x++) {
            if (matrix[0][x] == 0) {
                // set if for all rows
                for (int y = 1; y < matrix.length; y++) {
                    matrix[y][x] = 0;
                }
            }
        }

        // setting rows
        for (int y = 1; y < matrix.length; y++) {
            if (matrix[y][0] == 0) {
                // set if for all rows
                for (int x = 1; x < matrix[0].length; x++) {
                    matrix[y][x] = 0;
                }
            }
        }

        if (resetRow0 || isZeroAt00) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }

        if (resetCol0 || isZeroAt00) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}