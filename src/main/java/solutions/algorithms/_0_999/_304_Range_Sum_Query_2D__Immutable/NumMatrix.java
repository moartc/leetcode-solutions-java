package solutions.algorithms._0_999._304_Range_Sum_Query_2D__Immutable;

class NumMatrix {

    /*
    Since sumRegion has to work in O(1), I need to pre-calculate everything and then just return the answer
    (probably after a few additional operations).

    I can actually pre-calculate all possible inputs of sumRegion method
    update - but I have Memory Limit Exceeded

    it looks like I could calculate all sums from (0,0) to (y,x)
    then, for a given range, I can get the pre-calculated sum for (ro2,col2),
    subtract from it the sum on the left and the sum above,
    and then add back the sum of the overlapping area of the 2 previously subtracted regions.
     */

    int[][] cache;

    public NumMatrix(int[][] matrix) {
        cache = new int[matrix.length][matrix[0].length];
        for (int y = 0; y < matrix.length; y++) {
            int currentRowSum = 0;
            for (int x = 0; x < matrix[0].length; x++) {
                // calculate only the sum of the current x, and get the previous sum from cache
                int prev = y > 0 ? cache[y - 1][x] : 0;
                currentRowSum += matrix[y][x];
                cache[y][x] = prev + currentRowSum;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        int totalToTheEnd = cache[row2][col2];
        int leftToSubtract = col1 > 0 ? cache[row2][col1 - 1] : 0;
        int topToSubtract = row1 > 0 ? cache[row1 - 1][col2] : 0;
        int commonArea = (col1 > 0 && row1 > 0) ? cache[row1 - 1][col1 - 1] : 0;

        return totalToTheEnd - leftToSubtract - topToSubtract + commonArea;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */