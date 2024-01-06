package solutions.algorithms._0_999._986_Interval_List_Intersections;

import java.util.ArrayList;

class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        ArrayList<int[]> toReturn = new ArrayList<>();
        short ptr1 = 0;
        short ptr2 = 0;
        int l1 = firstList.length;
        int l2 = secondList.length;
        while (ptr1 < l1 && ptr2 < l2) {
            int max1 = firstList[ptr1][1];
            int max2 = secondList[ptr2][1];
            int maxMin = Math.max(firstList[ptr1][0], secondList[ptr2][0]);
            int minMax = Math.min(max1, max2);
            if (maxMin <= minMax) {
                toReturn.add(new int[]{maxMin, minMax});
            }
            if (max1 < max2) {
                ptr1++;
            } else {
                ptr2++;
            }
        }
        int[][] arrToReturn = new int[toReturn.size()][2];
        int ctr = 0;
        for (int[] arr : toReturn) {
            arrToReturn[ctr++] = arr;
        }
        return arrToReturn;
    }
}