package solutions.algorithms._0_999._875_Koko_Eating_Bananas;

import java.util.Arrays;

class Solution {

    int bestFound = Integer.MAX_VALUE;

    public int minEatingSpeed(int[] piles, int h) {

        Arrays.sort(piles);

        int minSpeed = 1;
        int maxSpeed = piles[piles.length - 1];

        binSearch(piles, minSpeed, maxSpeed, h);

        return bestFound;
    }

    void binSearch(int[] piles, int minSpeed, int maxSpeed, int maxAllowed) {

        if (minSpeed == maxSpeed) {
            boolean canEat = canEat(piles, maxSpeed, maxAllowed);
            if (canEat) {
                bestFound = Math.min(bestFound, maxSpeed);
                return;
            }
        }

        int speedToCheck = (minSpeed + maxSpeed) / 2;
        boolean canEat = canEat(piles, speedToCheck, maxAllowed);
        if (canEat) {
            binSearch(piles, minSpeed, speedToCheck, maxAllowed);
        } else {
            binSearch(piles, speedToCheck + 1, maxSpeed, maxAllowed);
        }


    }

    boolean canEat(int[] piles, int speed, int maxAllowed) {
        int total = 0;
        for (int pile : piles) {
            total += Math.ceil(pile / (double) speed);
            if (total > maxAllowed) {
                return false;
            }
        }
        return true;
    }
}