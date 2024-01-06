package solutions.algorithms._0_999._59_Spiral_Matrix_II;

class Solution {
    public int[][] generateMatrix(int n) {

        int[][] res = new int[n][n];
        addNext(1, 0, 0, res, n, 'R');
        return res;
    }

    private void addNext(int i, int y, int x, int[][] res, int size, char direction) {

        if (inRange(y, x, size)) {
            res[y][x] = i;
        }
        if (i == size * size) {
            return;
        }
        if (direction == 'R') {
            if (inRange(y, x + 1, size) && res[y][x + 1] == 0) {
                addNext(i + 1, y, x + 1, res, size, 'R');
            } else { // go down
                addNext(i + 1, y + 1, x, res, size, 'D');
            }
        } else if (direction == 'D') {
            if (inRange(y + 1, x, size) && res[y + 1][x] == 0) {
                addNext(i + 1, y + 1, x, res, size, 'D');
            } else { // go left
                addNext(i + 1, y, x - 1, res, size, 'L');
            }
        } else if (direction == 'L') {
            if (inRange(y, x - 1, size) && res[y][x - 1] == 0) {
                addNext(i + 1, y, x - 1, res, size, 'L');
            } else { // go up
                addNext(i + 1, y - 1, x, res, size, 'U');
            }
        } else { // U
            if (inRange(y - 1, x, size) && res[y - 1][x] == 0) {
                addNext(i + 1, y - 1, x, res, size, 'U');
            } else { // go right
                addNext(i + 1, y, x + 1, res, size, 'R');
            }
        }
    }

    boolean inRange(int y, int x, int size) {
        return y < size && x < size && x >= 0 && y >= 0;
    }
}