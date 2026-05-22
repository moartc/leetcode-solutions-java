package solutions.algorithms._3000_3999._3074_Apple_Redistribution_into_Boxes;

import java.util.Arrays;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        int totalApple = 0;

        for (int i : apple) {
            totalApple += i;
        }
        if (totalApple == 0) {
            return 0;
        }
        Arrays.sort(capacity);
        for (int i = capacity.length - 1; i >= 0; i--) {
            int cap = capacity[i];
            totalApple -= cap;

            if (totalApple <= 0) {
                return capacity.length - 1 - i + 1;
            }
        }
        return -1;
    }
}