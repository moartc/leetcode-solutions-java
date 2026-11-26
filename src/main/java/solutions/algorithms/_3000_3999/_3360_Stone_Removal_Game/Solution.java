package solutions.algorithms._3000_3999._3360_Stone_Removal_Game;

class Solution {
    public boolean canAliceWin(int n) {

        boolean aliceTurn = true;
        int stoneToRemove = 10;
        while (n > 0) {
            if (aliceTurn) {
                if (n > stoneToRemove) {
                    n -= stoneToRemove;
                    aliceTurn = false;
                } else return n == stoneToRemove;
                stoneToRemove--;
                if (stoneToRemove <= 0) {
                    return true;
                }
            } else {
                if (n > stoneToRemove) {
                    n -= stoneToRemove;
                    aliceTurn = true;
                } else return n != stoneToRemove;
                stoneToRemove--;
                if (stoneToRemove <= 0) {
                    return false;
                }
            }
        }
        // shouldn't happen
        return true;
    }
}