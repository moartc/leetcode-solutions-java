package solutions.algorithms._0_999._85_Maximal_Rectangle;

import java.util.Stack;

class Solution {

    /*
    brute force would be O(m*n*m*n) = O(m^2 * n^2)

    I could iterate through the array from right to left (left to right should also work xD)
    and store the number of consecutive 1s (on the right) for each cell.
    Then I scan each column from top to bottom, and for consecutive rows, track the minimum number (width),
    this number multiplied by the number of rows I scanned gives the area.

    example
    1 0 1 0 0
    1 0 1 1 1
    1 1 1 1 1
    1 0 0 1 0
    after processing
    1 0 1 0 0
    1 0 3 2 1
    5 4 3 2 1
    1 0 0 1 0
    when scanning, in the 2nd (o based) col, I encounter 3 and 3

    update:
    the problem is that when I scan this column I get 1 3 3, so with my logic I take the minimum which gives
    me 3 x 1. This greedy approach is not optimal in this case
    To solve this I can use the solution from problem 84 - actually it would've been better
    to calculate the first part vertically, but i can live with what I already have
     */
    public int maximalRectangle(char[][] matrix) {

        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for (int y = 0; y < matrix.length; y++) {
            int rowCtr = 1;
            for (int x = matrix[0].length - 1; x >= 0; x--) {
                if (matrix[y][x] == '1') {
                    newMatrix[y][x] = rowCtr;
                    rowCtr++;
                } else {
                    newMatrix[y][x] = 0;
                    rowCtr = 1;
                }
            }
        }
        // scan top to bottom
        int maxArea = 0;
        for (int x = 0; x < matrix[0].length; x++) {
            Stack<Integer> stack = new Stack<>();
            for (int y = 0; y <= matrix.length; y++) {
                int h = y == newMatrix.length ? 0 : newMatrix[y][x];
                while (!stack.isEmpty() && h < newMatrix[stack.peek()][x]) {
                    int idx = stack.pop();
                    int height = newMatrix[idx][x];
                    int width = stack.isEmpty() ? y : y - stack.peek() - 1;
                    maxArea = Math.max(maxArea, height * width);
                }
                stack.push(y);
            }
        }
        return maxArea;
    }
}