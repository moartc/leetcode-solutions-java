package solutions.algorithms._0_999._63_Unique_Paths_II;

class Solution {

    /*
    since a robot can only move right or down from position (0,0) it can visit either (0,1) or (1,0)
    Position (1,1) can be visited from (0,1) or (1,0) only.
    The number of unique paths to this position is equal to the sum of the unique paths to those 2 previous positions.
    In general the number of unique paths to position (i,j_ = number of unique paths to (i-1,j) + number of unique paths to (i,j-1).

    I can iterate through the array row by row and apply this calculation.
    Simulation for a grid 3x3 without any obstacles
    0 1 1
    1 2 3
    1 3 6
    I only need to initialise (0,0) with 1

    I also need to handle 2 corner case, where there is an obstacle at the starting and ending position

    update: The solution with a new array only beats 18.17%, so I will use the array passed as a parameter.
    update: it didn't really help - beats 18.17%
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        if (obstacleGrid[0][0] == 1 || obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] == 1) {
            return 0;
        }
        obstacleGrid[0][0] = 1;

        for (int y = 0; y < obstacleGrid.length; y++) {
            for (int x = 0; x < obstacleGrid[0].length; x++) {
                int v = obstacleGrid[y][x];
                if (y == 0 && x == 0) {
                    // skip
                    continue;
                }
                if (v == 1) {
                    // obstacle, set 0
                    obstacleGrid[y][x] = 0;
                } else {
                    // if it's the top row or there was an obstacle above
                    int valFromTop = y == 0 || obstacleGrid[y - 1][x] == 0 ? 0 : obstacleGrid[y - 1][x];
                    // if it's the most left, or there was an obstacle on the left side
                    int valFromLeft = x == 0 || obstacleGrid[y][x - 1] == 0 ? 0 : obstacleGrid[y][x - 1];
                    obstacleGrid[y][x] = valFromTop + valFromLeft;
                }
            }
        }
        return obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}