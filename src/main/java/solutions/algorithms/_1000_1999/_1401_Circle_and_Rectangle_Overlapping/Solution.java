package solutions.algorithms._1000_1999._1401_Circle_and_Rectangle_Overlapping;

class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {

        int y;
        if (yCenter < y1) {
            y = y1;
        } else if (yCenter > y2) {
            y = y2;
        } else {
            y = yCenter;
        }
        int x;
        if (xCenter < x1) {
            x = x1;
        } else if (xCenter > x2) {
            x = x2;
        } else {
            x = xCenter;
        }

        int distFromCircleToThePoint = (Math.abs(y - yCenter) * Math.abs(y - yCenter)) + (Math.abs(x - xCenter) * Math.abs(x - xCenter));
        if (distFromCircleToThePoint <= radius * radius) {
            return true;
        } else {
            return false;
        }
    }
}