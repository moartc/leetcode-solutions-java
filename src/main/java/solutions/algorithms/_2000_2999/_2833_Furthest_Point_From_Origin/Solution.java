package solutions.algorithms._2000_2999._2833_Furthest_Point_From_Origin;

class Solution {
    public int furthestDistanceFromOrigin(String moves) {


        int leftCounter = 0;
        int rightCounter = 0;
        int underscoreCounter = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'R') {
                rightCounter++;
            } else if (c == 'L') {
                leftCounter++;
            } else {
                underscoreCounter++;
            }
        }
        return Math.abs(leftCounter - rightCounter) + underscoreCounter;
    }
}