package solutions.algorithms._1000_1999._1292_Maximum_Side_Length_of_a_Square_with_Sum_Less_than_or_Equal_to_Threshold;

class Solution {

    /*
    for each cell I can calc the total sum from 0,0 to that point
    then, the total sum in a square is equal to the prefix sum at the square's bottom-right corner
    minus (bottom, left-1), minus (top-1, right), plus (top-1, left-1)
    it beats 9% only
    update: then improving it with bin search (hint 2) (but probably still to improve, beats only 25%)
     */
    public int maxSideLength(int[][] mat, int threshold) {

        int[][] prefixSum = new int[mat.length][mat[0].length];

        for (int y = 0; y < mat.length; y++) {
            for (int x = 0; x < mat[0].length; x++) {
                int v = mat[y][x];
                if (y > 0) {
                    v += prefixSum[y - 1][x];
                }
                if (x > 0) {
                    v += prefixSum[y][x - 1];
                }
                if (y > 0 && x > 0) {
                    v -= prefixSum[y - 1][x - 1];
                }
                prefixSum[y][x] = v;
            }
        }


        int maxY = prefixSum.length - 1;
        int maxX = prefixSum[0].length - 1;

        int left = 0;
        int right = Math.max(maxY, maxX);
        int bestFound = 0;
        boolean anyFound = false;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (isAnySolution(mid, prefixSum, threshold)) {
                anyFound = true;
                bestFound = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return anyFound ? bestFound + 1 : 0;
    }

    boolean isAnySolution(int diag, int[][] prefixSum, int threshold) {
        for (int y = 0; y + diag < prefixSum.length; y++) {
            for (int x = 0; x + diag < prefixSum[0].length; x++) {
                if (isSolution(y, x, diag, prefixSum, threshold)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isSolution(int y, int x, int diag, int[][] prefixSum, int threshold) {
        int sqVal = prefixSum[y + diag][x + diag];
        if (x > 0) {
            sqVal -= prefixSum[y + diag][x - 1];
        }
        if (y > 0) {
            sqVal -= prefixSum[y - 1][x + diag];
        }
        if (y > 0 && x > 0) {
            sqVal += prefixSum[y - 1][x - 1];
        }
        if (sqVal <= threshold) {
            return true;
        }
        return false;
    }
}