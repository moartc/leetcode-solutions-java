package solutions.algorithms._0_999._52_N_Queens_II;

class Solution {

    /*
    Going row by row, I can put a queen at any field
     - as long as there is no queen in this column yet
     - and no queen on any diagonal
     3 boolean arrays to track it. The diagonal ones have size 2n-1
     */
    public int totalNQueens(int n) {

        boolean[] col = new boolean[n];
        /*
        top left / bottom right
        3 4 5 6
        2 3 4 5
        1 2 3 4
        0 1 2 3
        formula: (n-1)-row+i
         */
        boolean[] diag1 = new boolean[(2 * n) - 1];
        /*
        top right / bottom left
        0 1 2 3
        1 2 3 4
        2 3 4 5
        3 4 5 6
        formula: row+i
         */
        boolean[] diag2 = new boolean[(2 * n) - 1];
        int res = placeAndCount(0, n, col, diag1, diag2);
        return res;
    }

    int placeAndCount(int currentRow, int n, boolean[] col, boolean[] diag1, boolean[] diag2) {

        if (currentRow == n) {
            // it's behind the last row
            return 1;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            int diag1Idx = n - 1 - currentRow + i;
            int diag2Idx = currentRow + i;
            if (col[i] || diag1[diag1Idx] || diag2[diag2Idx]) {
                // cannot put it here
            } else {
                col[i] = true;
                diag1[diag1Idx] = true;
                diag2[diag2Idx] = true;
                res += placeAndCount(currentRow + 1, n, col, diag1, diag2);
                col[i] = false;
                diag1[diag1Idx] = false;
                diag2[diag2Idx] = false;
            }
        }
        return res;
    }
}