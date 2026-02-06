package solutions.algorithms._0_999._37_Sudoku_Solver;

class Solution {

    /*
    I can actually iterate through all rows and fill the gaps
    I can keep a set of numbers for each row, column and square (all prefilled)
    I would go with DFS, then add some caching and if possible switch it to back tracking

    update1: beats 5.02%, I am changing maps to 2d array of booleans.
    With this + some small improvements it beats 95.39%

     */

    private static final char[] ALL_CHARS = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public void solveSudoku(char[][] board) {


        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] squares = new boolean[9][9];

        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board.length; x++) {
                char el = board[y][x];
                if (el != '.') {
                    rows[y][el - '1'] = true;
                    cols[x][el - '1'] = true;
                    squares[getSquare(y, x)][el - '1'] = true;
                }
            }
        }

        fill(0, 0, rows, cols, squares, board);
    }

    boolean fill(int startY, int startX, boolean[][] rows, boolean[][] cols, boolean[][] squares, char[][] board) {

        if (startY == 9) {
            // here I found a solution
            return true;
        }
        int nextY = -1;
        int nextX = -1;
        if (startX == 8) {
            nextX = 0;
            nextY = startY + 1;
        } else {
            nextY = startY;
            nextX = startX + 1;
        }
        char el = board[startY][startX];

        if (el != '.') {
            // continue to the next
            return fill(nextY, nextX, rows, cols, squares, board);
        } else {
            // match a char
            int squareIdx = getSquare(startY, startX);
            for (char c : ALL_CHARS) {
                if (!rows[startY][c - '1'] && !cols[startX][c - '1'] && !squares[squareIdx][c - '1']) {
                    rows[startY][c - '1'] = true;
                    cols[startX][c - '1'] = true;
                    squares[squareIdx][c - '1'] = true;
                    board[startY][startX] = c;
                    if (fill(nextY, nextX, rows, cols, squares, board)) {
                        return true;
                    } else { // I added but could solve, revert my change
                        rows[startY][c - '1'] = false;
                        cols[startX][c - '1'] = false;
                        squares[squareIdx][c - '1'] = false;
                        board[startY][startX] = '.';
                    }
                }
            }
            return false;
        }
    }

    private int getSquare(int y, int x) {
        int yPos = y / 3;
        int xPos = x / 3;
        return (yPos * 3) + xPos;
    }

}