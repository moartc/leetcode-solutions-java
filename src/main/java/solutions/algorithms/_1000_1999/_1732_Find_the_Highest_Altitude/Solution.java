package solutions.algorithms._1000_1999._1732_Find_the_Highest_Altitude;

class Solution {
    public int largestAltitude(int[] gain) {


        int maxFound = 0;
        int altitude = 0;
        for (int diff : gain) {
            altitude += diff;
            maxFound = Math.max(maxFound, altitude);
        }
        return maxFound;
    }
}