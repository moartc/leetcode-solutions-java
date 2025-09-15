package solutions.algorithms._0_999._130_Surrounded_Regions;

class Solution {

    /*
    I could start from the Os on the border and visit all connected cells, marking them as connected to the edge
    (e.g. with a different character - 'A')

    Then, I would iterate through the whole board and replace all Os with X - non visited O regions, and all As with Os

     */
    public void solve(char[][] board) {

        boolean[][] visitedWhenMarking = new boolean[board.length][board[0].length];

        // mark vertically
        for (int y = 0; y < board.length; y++) {
            if (board[y][0] == 'O') {
                visitAndMark(y, 0, board, visitedWhenMarking);
            }
            if (board[y][board[0].length - 1] == 'O') {
                visitAndMark(y, board[0].length - 1, board, visitedWhenMarking);
            }
        }
        // mark horizontally
        for (int x = 0; x < board[0].length; x++) {
            if (board[0][x] == 'O') {
                visitAndMark(0, x, board, visitedWhenMarking);
            }
            if (board[board.length - 1][x] == 'O') {
                visitAndMark(board.length - 1, x, board, visitedWhenMarking);
            }
        }

        // now iterate and change all Os to Xs and As to Os
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[0].length; x++) {
                if (board[y][x] == 'O') {
                    board[y][x] = 'X';
                }
                if (board[y][x] == 'A') {
                    board[y][x] = 'O';
                }
            }
        }
    }

    void visitAndMark(int y, int x, char[][] board, boolean[][] visitedWhenMarking) {
        board[y][x] = 'A';
        if (y - 1 >= 0 && board[y - 1][x] == 'O') {
            visitAndMark(y - 1, x, board, visitedWhenMarking);
        }
        if (y + 1 < board.length && board[y + 1][x] == 'O') {
            visitAndMark(y + 1, x, board, visitedWhenMarking);
        }
        if (x - 1 >= 0 && board[y][x - 1] == 'O') {
            visitAndMark(y, x - 1, board, visitedWhenMarking);
        }
        if (x + 1 < board[0].length && board[y][x + 1] == 'O') {
            visitAndMark(y, x + 1, board, visitedWhenMarking);
        }
    }
}