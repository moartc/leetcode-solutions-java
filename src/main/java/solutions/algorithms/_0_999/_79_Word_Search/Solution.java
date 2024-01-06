package solutions.algorithms._0_999._79_Word_Search;

class Solution {
    public boolean exist(char[][] board, String word) {

        char first = word.charAt(0);
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[0].length; x++) {
                if (first == board[y][x] && find(board, y, x, 1, word.toCharArray())) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean find(char[][] board, int y, int x, int next, char[] word) {
        if (y < 0 || y == board.length || x < 0 || x == board[0].length || board[y][x] == '0' || board[y][x] != word[next - 1]) {
            return false;
        }
        if (next == word.length) {
            return true;
        } else {
            char temp = board[y][x];
            board[y][x] = '0';
            if (find(board, y + 1, x, next + 1, word)) {
                return true;
            }
            if (find(board, y - 1, x, next + 1, word)) {
                return true;
            }
            if (find(board, y, x + 1, next + 1, word)) {
                return true;
            }
            if (find(board, y, x - 1, next + 1, word)) {
                return true;
            }
            board[y][x] = temp;
            return false;
        }
    }
}