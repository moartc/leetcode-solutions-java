package solutions.algorithms._1000_1999._1340_Jump_Game_V;

class Solution {

    int[] cache;
    int globMax;

    public int maxJumps(int[] arr, int d) {
        globMax = 0;
        cache = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            findMax(i, arr, d);
        }
        return globMax;
    }

    int findMax(int currIdx, int[] arr, int d) {

        if (cache[currIdx] != 0) {
            return cache[currIdx];
        }

        int currVal = arr[currIdx];
        int bestFound = 1;

        // going left
        int iL = currIdx - 1;
        int maxToTheLeft = -1;
        while (iL >= 0 && iL >= currIdx - d && arr[iL] < currVal) {
            int valAtIdx = arr[iL];
            if (valAtIdx < currVal) {
                bestFound = Math.max(bestFound, 1 + findMax(iL, arr, d));
            }
            maxToTheLeft = Math.max(maxToTheLeft, valAtIdx);
            iL--;
        }

        // going right
        int iR = currIdx + 1;
        int maxToTheRight = -1;
        while (iR < arr.length && iR <= currIdx + d && arr[iR] < currVal) {
            int valAtIdx = arr[iR];
            if (valAtIdx < currVal) {
                bestFound = Math.max(bestFound, 1 + findMax(iR, arr, d));
            }
            maxToTheRight = Math.max(maxToTheRight, valAtIdx);
            iR++;
        }
        globMax = Math.max(globMax, bestFound);
        cache[currIdx] = bestFound;
        return cache[currIdx];
    }
}