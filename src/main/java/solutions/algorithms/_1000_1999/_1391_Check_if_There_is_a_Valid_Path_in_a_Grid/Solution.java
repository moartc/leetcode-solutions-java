package solutions.algorithms._1000_1999._1391_Check_if_There_is_a_Valid_Path_in_a_Grid;

class Solution {
    public boolean hasValidPath(int[][] grid) {

        return ride(0, 0, grid);

    }

    // set -1 when visited
    boolean ride(int y, int x, int[][] grid) {
        if (y == grid.length - 1 && x == grid[0].length - 1) {
            return true;
        }
        int current = grid[y][x];
        grid[y][x] = -1;

        if (current == 1) { // left or right
            if (canGoLeft(y, x, grid) && ride(y, x - 1, grid)) {
                return true;
            }
            if (canGoRight(y, x, grid) && ride(y, x + 1, grid)) {
                return true;
            }
        } else if (current == 2) {
            if (canGoUp(y, x, grid) && ride(y - 1, x, grid)) {
                return true;
            }
            if (canGoDown(y, x, grid) && ride(y + 1, x, grid)) {
                return true;
            }
        } else if (current == 3) {
            if (canGoLeft(y, x, grid) && ride(y, x - 1, grid)) {
                return true;
            }
            if (canGoDown(y, x, grid) && ride(y + 1, x, grid)) {
                return true;
            }
        } else if (current == 4) {
            if (canGoRight(y, x, grid) && ride(y, x + 1, grid)) {
                return true;
            }
            if (canGoDown(y, x, grid) && ride(y + 1, x, grid)) {
                return true;
            }
        } else if (current == 5) {
            if (canGoUp(y, x, grid) && ride(y - 1, x, grid)) {
                return true;
            }
            if (canGoLeft(y, x, grid) && ride(y, x - 1, grid)) {
                return true;
            }
        } else { // current == 6
            if (canGoUp(y, x, grid) && ride(y - 1, x, grid)) {
                return true;
            }
            if (canGoRight(y, x, grid) && ride(y, x + 1, grid)) {
                return true;
            }
        }
        grid[y][x] = current;
        return false;
    }

    boolean canGoLeft(int currY, int currX, int[][] grid) {
        int newY = currY;
        int newX = currX - 1;
        if (newX >= 0) {
            if (grid[newY][newX] == 1 || grid[newY][newX] == 4 || grid[newY][newX] == 6) {
                return true;
            }
        }
        return false;
    }

    boolean canGoRight(int currY, int currX, int[][] grid) {
        int newY = currY;
        int newX = currX + 1;
        if (newX < grid[0].length) {
            if (grid[newY][newX] == 1 || grid[newY][newX] == 3 || grid[newY][newX] == 5) {
                return true;
            }
        }
        return false;
    }

    boolean canGoUp(int currY, int currX, int[][] grid) {
        int newY = currY - 1;
        int newX = currX;
        if (newY >= 0) {
            if (grid[newY][newX] == 2 || grid[newY][newX] == 3 || grid[newY][newX] == 4) {
                return true;
            }
        }
        return false;
    }

    boolean canGoDown(int currY, int currX, int[][] grid) {
        int newY = currY + 1;
        int newX = currX;
        if (newY < grid.length) {
            if (grid[newY][newX] == 2 || grid[newY][newX] == 5 || grid[newY][newX] == 6) {
                return true;
            }
        }
        return false;
    }
}