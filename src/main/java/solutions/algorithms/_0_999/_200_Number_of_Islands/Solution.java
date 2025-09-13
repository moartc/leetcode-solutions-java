package solutions.algorithms._0_999._200_Number_of_Islands;

class Solution {

    /*
    I can iterate through the whole map, if there is a '1' (land), I start filling the land area with a number (Starting from 1),
    then I continue iterating, filling all unvisited land cells (still marked as '1') with incremented values.
    I used recursion method for filling and it beats 84%

    update:
    I can improve it by filling while iterating
    update2:
    no, I cannot, because I iterate through the rows one after another.

    So the final solution is actually the same as the previous one. The only difference is the way I iterate.
    Also, it beat 99% before, so apparently the previous iteration method was faster.
     */

    int[][] moves = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int numIslands(char[][] grid) {

        int counter = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == '1') {
                    fill(y, x, grid);
                    counter++;
                }
            }
        }
        return counter;
    }

    private void fill(int y, int x, char[][] grid) {
        grid[y][x] = 'x';
        // find neighbours
        for (int[] move : moves) {
            int ny = move[0];
            int nx = move[1];
            int newY = y + ny;
            int newX = x + nx;
            if (newY >= 0 && newY < grid.length && newX >= 0 && newX < grid[0].length && grid[newY][newX] == '1') {
                fill(newY, newX, grid);
            }
        }
    }
}