package solutions.algorithms._1502_Can_Make_Arithmetic_Progression_From_Sequence;

import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);
        int firstDiff = arr[0] - arr[1];
        for (int i = 2; i < arr.length; i++) {
            int prev = arr[i - 1];
            int current = arr[i];
            if (prev - current != firstDiff) {
                return false;
            }
        }
        return true;
    }
}