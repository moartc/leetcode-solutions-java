package solutions.algorithms._0_999._36_Valid_Sudoku;

import java.util.HashSet;
import java.util.Set;

class Solution {

    int SIZE = 9;

    Set<Character> set = new HashSet<>(SIZE, 1);

    public boolean isValidSudoku(char[][] board) {

        // rows
        for (int y = 0; y < SIZE; y++) {
            set.clear();
            for (int x = 0; x < SIZE; x++) {
                if (board[y][x] != '.') {
                    boolean add = set.add(board[y][x]);
                    if (!add) {
                        return false;
                    }
                }
            }
        }

        // cols
        for (int x = 0; x < SIZE; x++) {
            set.clear();
            for (int y = 0; y < SIZE; y++) {
                if (board[y][x] != '.') {
                    boolean add = set.add(board[y][x]);
                    if (!add) {
                        return false;
                    }
                }
            }
        }

        // check small square
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (!checkSmallSquare(3 * y, 3 * x, set, board)) {
                    return false;
                }
            }
        }

        return true;
    }

    boolean checkSmallSquare(int startY, int startX, Set<Character> set, char[][] board) {
        set.clear();
        for (int y = startY; y < startY + 3; y++) {
            for (int x = startX; x < startX + 3; x++) {
                if (board[y][x] != '.') {
                    boolean add = set.add(board[y][x]);
                    if (!add) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}