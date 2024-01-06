package solutions.algorithms._1000_1999._1232_Check_If_It_Is_a_Straight_Line;

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int yDiff = coordinates[1][0] - coordinates[0][0];
        int xDiff = coordinates[1][1] - coordinates[0][1];

        for (int i = 2; i < coordinates.length; i++) {
            if ((coordinates[i][0] - coordinates[i - 1][0]) * xDiff != yDiff * (coordinates[i][1] - coordinates[i - 1][1])) {
                return false;
            }
        }
        return true;
    }
}