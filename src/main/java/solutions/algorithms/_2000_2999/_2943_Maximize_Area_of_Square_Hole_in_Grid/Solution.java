package solutions.algorithms._2000_2999._2943_Maximize_Area_of_Square_Hole_in_Grid;

import java.util.Arrays;

class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {

        Arrays.sort(hBars);
        Arrays.sort(vBars);

        int bestDiffOneH = 1;
        int diffOneCtrH = 1;
        for (int i = 1; i < hBars.length; i++) {
            if (hBars[i] - hBars[i - 1] == 1) {
                diffOneCtrH++;
                bestDiffOneH = Math.max(bestDiffOneH, diffOneCtrH);
            } else {
                diffOneCtrH = 1;
            }
        }

        int bestDiffOneV = 1;
        int diffOneCtrV = 1;
        for (int i = 1; i < vBars.length; i++) {
            if (vBars[i] - vBars[i - 1] == 1) {
                diffOneCtrV++;
                bestDiffOneV = Math.max(bestDiffOneV, diffOneCtrV);
            } else {
                diffOneCtrV = 1;
            }
        }

        int lower = Math.min(bestDiffOneH, bestDiffOneV);
        return (lower + 1) * (lower + 1);
    }
}