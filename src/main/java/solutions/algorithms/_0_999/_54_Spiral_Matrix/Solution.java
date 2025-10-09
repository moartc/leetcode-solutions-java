package solutions.algorithms._0_999._54_Spiral_Matrix;

import java.util.ArrayList;
import java.util.List;

class Solution {


    /*
    I can track the top, left, bottom, and right boundaries.

    start at (0,0) -> go to the right boundary, turn right, and update up boundary
    go to the bottom boundary, turn right, and update the right boundary,
    go to the left boundary, turn right, and update the bottom boundary,
    go to the top boundary (already updated), turn right, and update the left boundary.
    Repeat until after reaching a boundary I cannot move anymore.
     */

    public List<Integer> spiralOrder(int[][] matrix) {

        int topBound = -1;
        int rightBound = matrix[0].length;
        int bottomBound = matrix.length;
        int leftBound = -1;

        int y = 0;
        int x = 0;

        /*
        directions: 0 - right, 1 - down, 2 - left, 3 - up
        */
        int currentDir = 0;

        List<Integer> visitedElements = new ArrayList<>(matrix.length * matrix[0].length);
        while (true) {
            // here I can be on the boundary, which means I should return
            if (y == topBound || y == bottomBound || x == leftBound || x == rightBound) {
                return visitedElements;
            }
            visitedElements.add(matrix[y][x]);
            if (currentDir == 0) {
                if (x == rightBound - 1) {
                    // it means I reached the last allowed position, I should turn down
                    currentDir = 1;
                    // decrease upper bound
                    topBound++;
                    // and do the first step
                    y++;
                } else {
                    // just go further right
                    x++;
                }
            } else if (currentDir == 1) {
                if (y == bottomBound - 1) {
                    currentDir = 2;
                    rightBound--;
                    x--;
                } else {
                    y++;
                }
            } else if (currentDir == 2) {
                if (x == leftBound + 1) {
                    currentDir = 3;
                    bottomBound--;
                    y--;
                } else {
                    x--;
                }
            } else { // currentDir == 3
                if (y == topBound + 1) {
                    currentDir = 0;
                    leftBound++;
                    x++;
                } else {
                    y--;
                }
            }
        }
    }
}