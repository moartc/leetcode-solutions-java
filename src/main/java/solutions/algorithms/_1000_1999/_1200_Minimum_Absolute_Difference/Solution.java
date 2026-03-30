package solutions.algorithms._1000_1999._1200_Minimum_Absolute_Difference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        List<List<Integer>> answer = new ArrayList<>();

        int lowestDist = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int f = arr[i];
            int s = arr[i + 1];
            int dist = s - f;
            if (dist < lowestDist) {
                lowestDist = dist;
                answer.clear();
                answer.add(List.of(f, s));
            } else if (dist == lowestDist) {
                answer.add(List.of(f, s));
            } else {
                // do nothing
            }
        }
        return answer;
    }

}