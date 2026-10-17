package solutions.algorithms._3000_3999._3551_Minimum_Swaps_to_Sort_by_Digit_Sum;

import java.util.Arrays;

class Solution {
    public int minSwaps(int[] nums) {

        int[][] withIdx = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            withIdx[i][0] = nums[i];
            withIdx[i][1] = i;
        }

        Arrays.sort(withIdx, (o1, o2) -> {
            int d1 = digNum(o1[0]);
            int d2 = digNum(o2[0]);
            if (d1 != d2) {
                return d1 - d2;
            } else {
                return o1[0] - o2[0];
            }
        });

        boolean[] visited = new boolean[nums.length];

        // find cycles
        int numOfCycles = 0;
        for (int i = 0; i < withIdx.length; i++) {
            int curr = i;
            if (!visited[curr]) {
                numOfCycles++;

                visited[curr] = true;

                if (curr != withIdx[curr][1]) {
                    curr = withIdx[curr][1];
                    while (!visited[curr] && curr != withIdx[curr][1]) {
                        visited[curr] = true;
                        curr = withIdx[curr][1];
                    }
                }
            }
        }
        return nums.length - numOfCycles;
    }

    int digNum(int i) {

        int v = 0;
        while (i != 0) {
            int r = i % 10;
            v += r;
            i /= 10;
        }
        return v;
    }
}
