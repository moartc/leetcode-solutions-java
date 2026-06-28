package solutions.algorithms._1000_1999._1846_Maximum_Element_After_Decreasing_and_Rearranging;

import java.util.Arrays;

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {

        if (arr.length == 1) {
            return 1;
        }
        Arrays.sort(arr);
        arr[0] = 1;

        int minInt = 2;
        for (int i = 1; i < arr.length; i++) {
            int f = arr[i - 1];
            int s = arr[i];

            if (s == f) {
                // do nothing
            } else if (s - f == 1) {
                // update minInt, do nothing
                minInt = s + 1;
            } else {
                arr[i] = minInt;
                minInt++;
            }
        }
        return minInt - 1;
    }
}