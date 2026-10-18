package solutions.algorithms._0_999._349_Intersection_of_Two_Arrays;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        boolean[] smallerArrayPresence = new boolean[1001];

        int[] smaller;
        int[] bigger;
        if (nums1.length < nums2.length) {
            smaller = nums1;
            bigger = nums2;
        } else {
            smaller = nums2;
            bigger = nums1;
        }

        for (int n : smaller) {
            smallerArrayPresence[n] = true;
        }

        Set<Integer> answerSet = new HashSet<>();
        for (int v : bigger) {
            if (smallerArrayPresence[v]) {
                answerSet.add(v);
            }
        }

        int[] answer = new int[answerSet.size()];
        int i = 0;
        for (Integer v : answerSet) {
            answer[i] = v;
            i++;
        }
        return answer;
    }
}