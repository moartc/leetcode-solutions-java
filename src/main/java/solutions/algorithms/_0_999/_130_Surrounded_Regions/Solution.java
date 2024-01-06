package solutions.algorithms._0_999._130_Surrounded_Regions;

class Solution {
    public void solve(char[][] board) {

        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                connectNeighbour(i, 0, m, n, board, visited);
            }
            if (board[i][n - 1] == 'O') {
                connectNeighbour(i, n - 1, m, n, board, visited);
            }
        }

        for (int i = 0; i < n; i++) {
            if (board[m - 1][i] == 'O') {
                connectNeighbour(m - 1, i, m, n, board, visited);
            }
            if (board[0][i] == 'O') {
                connectNeighbour(0, i, m, n, board, visited);
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (board[i][j] == 'O' && !visited[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    void connectNeighbour(int y, int x, int m, int n, char[][] board, boolean[][] visitedNotToFlip) {
        visitedNotToFlip[y][x] = true;
        for (int[] move : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
            int newY = y + move[0];
            int newX = x + move[1];
            if (newY >= 0 && newY < m && newX >= 0 && newX < n && board[newY][newX] == 'O' && !visitedNotToFlip[newY][newX]) {
                connectNeighbour(newY, newX, m, n, board, visitedNotToFlip);
            }
        }
    }
}