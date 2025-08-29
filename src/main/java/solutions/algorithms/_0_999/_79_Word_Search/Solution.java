package solutions.algorithms._0_999._79_Word_Search;

class Solution {

    final static int[][] POSSIBLE_MOVES = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    /*
    notes:
    I can start from any cell where the first letter matches
    then check cells around (track already visited, to not visit it again) and go the next one if exist and matches next index
    I can go back to caller and remove the last added and with that visit another one
     */
    public boolean exist(char[][] board, String word) {

        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[0].length; x++) {
                // start only if the first letter matches
                if (board[y][x] == word.charAt(0)) {
                    visited[y][x] = true;
                    if (check(y, x, 0, visited, board, word)) {
                        return true;
                    }
                    visited[y][x] = false;
                }
            }
        }
        return false;
    }


    boolean check(int currentY, int currentX, int indexOfLetterToFind, boolean[][] alreadyVisited, char[][] board, String word) {

        if (indexOfLetterToFind == word.length() - 1) {
            // I entered here, and it means, that the letter matches, it's also the last letter I had to find, so I can return true
            return true;
        }

        // check indices
        for (int[] possibleMove : POSSIBLE_MOVES) {
            int newY = possibleMove[0] + currentY;
            int newX = possibleMove[1] + currentX;

            // check if it's in range
            if (newY < 0 || newY >= board.length || newX < 0 || newX >= board[0].length) {
                // nothing to do
            } else if (board[newY][newX] == word.charAt(indexOfLetterToFind + 1) && !alreadyVisited[newY][newX]) {
                alreadyVisited[newY][newX] = true;
                if (check(newY, newX, indexOfLetterToFind + 1, alreadyVisited, board, word)) {
                    return true;
                }
                alreadyVisited[newY][newX] = false;
            }
        }
        return false;
    }
}