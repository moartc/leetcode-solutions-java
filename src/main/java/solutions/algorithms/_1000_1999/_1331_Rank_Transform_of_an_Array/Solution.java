package solutions.algorithms._1000_1999._1331_Rank_Transform_of_an_Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] arrayRankTransform(int[] arr) {

        if (arr.length == 0) {
            return arr;
        }
        int[] arrCopy = new int[arr.length];
        for (int i = 0; i < arrCopy.length; i++) {
            arrCopy[i] = arr[i];
        }

        Arrays.sort(arrCopy);
        Map<Integer, Integer> valToRank = new HashMap<>();
        int rank = 1;
        valToRank.put(arrCopy[0], 1);
        for (int i = 0; i < arrCopy.length; i++) {
            if (valToRank.containsKey(arrCopy[i])) {
                // do nothing
            } else {
                rank++;
                valToRank.put(arrCopy[i], rank);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int rankToSet = valToRank.get(arr[i]);
            arr[i] = rankToSet;
        }
        return arr;
    }
}