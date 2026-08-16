package solutions.algorithms._2000_2999._2029_Stone_Game_IX;

class Solution {
    public boolean stoneGameIX(int[] stones) {

        int ctr0 = 0;
        int ctr1 = 0;
        int ctr2 = 0;
        for (int stone : stones) {
            int r = stone % 3;
            if (r == 0) {
                ctr0++;
            } else if (r == 1) {
                ctr1++;
            } else {
                ctr2++;
            }
        }
        if (ctr0 % 2 == 0) {
            return ctr1 >= 1 && ctr2 >= 1;
        } else {
            return Math.abs(ctr1 - ctr2) >= 3;
        }
    }
}