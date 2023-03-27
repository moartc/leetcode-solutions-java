package solutions.algorithms._1779_Find_Nearest_Point_That_Has_the_Same_X_or_Y_Cordinate;

class Solution {

    int index = -1;
    int lowest = Integer.MAX_VALUE;

    public int nearestValidPoint(int x, int y, int[][] points) {

        for (int i = 0; i < points.length; i++) {
            int x2 = points[i][0];
            int y2 = points[i][1];
            if (x == x2 || y == y2) {
                int md = Math.abs(x - x2) + Math.abs(y - y2);
                if (md < lowest) {
                    lowest = md;
                    index = i;
                }
            }
        }
        return index;
    }
}