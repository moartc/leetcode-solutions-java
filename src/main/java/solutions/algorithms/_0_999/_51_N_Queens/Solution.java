package solutions.algorithms._0_999._51_N_Queens;

import java.util.*;

class Solution {
    /*
    Queens cannot stand next to each other
    Also, they cannot stand on the same vertical and horizontal line

    Algorithm:
    1. Create a validation method that takes a list of positions [y,x] and checks if the current board
    (partial or full) is valid

    2. It seems that there must be one Queen in every row and column
    Place the first queen,
    validate -> if it's correct, then the next one (in the next row) until all are in place and the board is valid
    If board is invalid, remove the last queen and place it somewhere else
    repeat

    additional improvement:
    iterating through an 2-dimensional array and checking if the board is valid is slow
    instead I will keep tracking columns and diagonal separately
    I don't need to track rows because every step I place a new Queen on the next one
    I have n cols, and 2n-1 diagonals (times 2)
    diagonals (to the left) position: (2n-1 + y - x)
    3 2 1 0
    4 3 2 1
    5 4 3 2
    6 5 4 3
    diagonals (to the right) position: (x+y)
    0 1 2 3
    1 2 3 4
    2 3 4 5
    3 4 5 6

     */
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> answer = new ArrayList<>();

        // just to mark if there is a queen or not - index of this array represents rows and the value index of column
        int[] placedQueens = new int[n];
        boolean[] cols = new boolean[n];
        boolean[] diagonals1 = new boolean[(2 * n) - 1];
        boolean[] diagonals2 = new boolean[(2 * n) - 1];

        for (int x = 0; x < n; x++) {
            int diag1Idx = n - 1 - x;
            placedQueens[0] = x;
            diagonals1[diag1Idx] = true;
            diagonals2[x] = true;
            cols[x] = true;

            solve(0, placedQueens, answer, cols, diagonals1, diagonals2, n);

            // I don't have to clear placedQueens array
            diagonals1[diag1Idx] = false;
            diagonals2[x] = false;
            cols[x] = false;

        }
        return answer;
    }

    void solve(int currentY, int[] placedQueens, List<List<String>> result, boolean[] cols, boolean[] diagonals1,
               boolean[] diagonals2, int n) {

        if (currentY == n - 1) {
            // valid and nothing to place - create the new result and add it to the result list
            List<String> singleSolution = createResult(placedQueens);
            result.add(singleSolution);
            return;
        }

        int nextY = currentY + 1;

        for (int nextX = 0; nextX < n; nextX++) {
            //check here if I can place it, instead at the beginning of this method

            if (canPlaceQueen(nextY, nextX, cols, diagonals1, diagonals2)) {
                int diag1Idx = n - 1 + nextY - nextX;
                int diag2Idx = nextY + nextX;
                placedQueens[nextY] = nextX;
                diagonals1[diag1Idx] = true;
                diagonals2[diag2Idx] = true;
                cols[nextX] = true;

                solve(nextY, placedQueens, result, cols, diagonals1, diagonals2, n);

                // again, I don't have to clear placedQueens array
                diagonals1[diag1Idx] = false;
                diagonals2[diag2Idx] = false;
                cols[nextX] = false;
            }
        }
    }

    private List<String> createResult(int[] placedQueens) {
        List<String> result = new ArrayList<>();
        int n = placedQueens.length;

        StringBuilder sb = new StringBuilder();
        for (int idxForRowY : placedQueens) {
            for (int x = 0; x < n; x++) {
                if (idxForRowY == x) {
                    sb.append('Q');
                } else {
                    sb.append('.');
                }
            }
            result.add(sb.toString());
            sb.setLength(0);
        }
        return result;
    }

    private boolean canPlaceQueen(int y, int x, boolean[] cols, boolean[] diagonals1, boolean[] diagonals2) {

        int n = cols.length;
        if (cols[x]) {
            return false;
        }
        int diag1Idx = n - 1 - x + y;
        int diag2Idx = x + y;
        return !diagonals1[diag1Idx] && !diagonals2[diag2Idx];
    }
}
