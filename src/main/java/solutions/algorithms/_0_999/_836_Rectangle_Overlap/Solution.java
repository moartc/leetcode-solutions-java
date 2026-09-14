package solutions.algorithms._0_999._836_Rectangle_Overlap;

class Solution {
    /*
    all corners can be actually outside and there still might be an overlap
    there is no overlap if the (lest say) first one is either above, below, on the left or on the right from
    the 2nd one
     */
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        int r1x1 = rec1[0];
        int r1y1 = rec1[1];
        int r1x2 = rec1[2];
        int r1y2 = rec1[3];

        int r2x1 = rec2[0];
        int r2y1 = rec2[1];
        int r2x2 = rec2[2];
        int r2y2 = rec2[3];

        boolean isTheFirstOneAbove = r1y1 >= r2y2;
        boolean isTheFirstOneBelow = r1y2 <= r2y1;
        boolean isTheFirstOneOnTheLeft = r1x2 <= r2x1;
        boolean isTheFirstOneOnTheRight = r1x1 >= r2x2;
        if (isTheFirstOneAbove) {
            return false;
        }
        if (isTheFirstOneBelow) {
            return false;
        }
        if (isTheFirstOneOnTheLeft) {
            return false;
        }
        if (isTheFirstOneOnTheRight) {
            return false;
        }
        return true;

    }

}