package solutions.algorithms._2000_2999._2267_Check_if_There_Is_a_Valid_Parentheses_String_Path;

class Solution {

    byte[][][] cache;

    public boolean hasValidPath(char[][] grid) {

        // 0 - unknow, 1 - false, 2 - true
        int bigger = Math.max(grid.length, grid[0].length);
        cache = new byte[grid.length][grid[0].length][bigger * 2];
        return findPath(0, 0, 0, grid);
    }

    boolean findPath(int y, int x, int open, char[][] grid) {

        if (cache[y][x][open] != 0) {
            return cache[y][x][open] != 1;
        }
        if (y == grid.length - 1 && x == grid[0].length - 1) {
            // if it's the last one
            if (open == 1 && grid[y][x] == ')') {
                cache[y][x][open] = 2;
                return true;
            } else {
                cache[y][x][open] = 1;
                return false;
            }
        }
        char c = grid[y][x];
        int newCtr = open;
        if (c == ')') {
            newCtr--;
        } else {
            newCtr++;
        }
        if (newCtr < 0) {
            // cannot go further
            cache[y][x][open] = 1;
            return false;
        }
        // go right
        if (x + 1 < grid[0].length) {
            if (findPath(y, x + 1, newCtr, grid)) {
                cache[y][x][open] = 2;
                return true;
            }
        }

        // go down
        if (y + 1 < grid.length) {
            if (findPath(y + 1, x, newCtr, grid)) {
                cache[y][x][open] = 2;
                return true;
            }
        }
        cache[y][x][open] = 1;
        return false;
    }
}