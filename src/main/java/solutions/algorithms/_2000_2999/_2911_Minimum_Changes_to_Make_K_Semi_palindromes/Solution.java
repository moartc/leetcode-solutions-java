package solutions.algorithms._2000_2999._2911_Minimum_Changes_to_Make_K_Semi_palindromes;

import java.util.Arrays;

class Solution {

    int[][] minCache;
    int[][] costCache;

    public int minimumChanges(String s, int k) {

        char[] array = s.toCharArray();
        costCache = new int[array.length][array.length];
        for (int[] ints : costCache) {
            Arrays.fill(ints, -1);
        }
        minCache = new int[array.length][k + 1];
        for (int[] ints : minCache) {
            Arrays.fill(ints, -1);
        }

        return findMin(0, k, array);
    }

    int findMin(int i, int k, char[] arr) {

        if (k == 1) {
            // can take only 1
            return minCost(i, arr.length - 1, arr);
        } else {
            // I have more than 1, for '1' I need to use at least 2 chars
            if (minCache[i][k] != -1) {
                return minCache[i][k];
            }
            int lastIdx = arr.length - (2 * (k - 1));
            int best = Integer.MAX_VALUE;
            for (int j = i + 1; j < lastIdx; j++) {
                int firstPart = minCost(i, j, arr);
                int rem = findMin(j + 1, k - 1, arr);
                int tot = firstPart + rem;
                best = Math.min(best, tot);
            }
            minCache[i][k] = best;
            return minCache[i][k];
        }


    }

    int minCost(int start, int end, char[] array) {
        int arrLength = end - start + 1;
        if (costCache[start][end] != -1) {
            return costCache[start][end];
        } else {
            int minCost = Integer.MAX_VALUE;
            for (int d = 1; d < arrLength; d++) {
                int dCost = 0;
                if (arrLength % d == 0) {
                    int groupSize = arrLength / d;
                    StringBuilder sb = new StringBuilder();
                    for (int x = 0; x < d; x++) {
                        int k = groupSize;
                        int toTake = start + x;
                        while (k > 0) {
                            sb.append(array[toTake]);
                            toTake += d;
                            k--;
                        }
                        String string = sb.toString();
                        char[] chars = string.toCharArray();
                        int arrL = chars.length;
                        // cost for the string
                        int ctr = 0;
                        for (int i = 0; i < arrL / 2; i++) {
                            if (chars[i] != chars[arrL - 1 - i]) {
                                ctr++;
                            }
                        }
                        dCost += ctr;
                        sb = new StringBuilder();
                    }
                    minCost = Math.min(minCost, dCost);
                }
            }

            costCache[start][end] = minCost;
            return costCache[start][end];
        }
    }
}