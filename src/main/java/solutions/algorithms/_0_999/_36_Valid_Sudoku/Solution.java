package solutions.algorithms._0_999._36_Valid_Sudoku;

import java.util.HashSet;
import java.util.Set;

class Solution {

    private static final int SIZE = 9;

    public boolean isValidSudoku(char[][] board) {
        // check rows
        Set<Character> set = new HashSet<>(SIZE);

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] != '.' && !set.add(board[row][col])) {
                    return false;
                }
            }
            set.clear();
        }
        // check columns
        for (int col = 0; col < SIZE; col++) {
            for (int row = 0; row < SIZE; row++) {
                if (board[row][col] != '.' && !set.add(board[row][col])) {
                    return false;
                }
            }
            set.clear();
        }
        // check sub-boxes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!checkSubBox(i, j, board, set)) {
                    return false;
                }
                set.clear();
            }
        }
        // all board valid
        return true;
    }

    boolean checkSubBox(int i, int j, char[][] board, Set<Character> set) {
        for (int row = i * 3; row < (i + 1) * 3; row++) {
            for (int col = j * 3; col < (j + 1) * 3; col++) {
                if (board[row][col] != '.' && !set.add(board[row][col])) {
                    return false;
                }
            }
        }
        return true;
    }
}