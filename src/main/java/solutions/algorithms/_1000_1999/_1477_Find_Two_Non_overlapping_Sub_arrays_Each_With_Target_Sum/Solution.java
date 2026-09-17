package solutions.algorithms._1000_1999._1477_Find_Two_Non_overlapping_Sub_arrays_Each_With_Target_Sum;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int minSumOfLengths(int[] arr, int target) {

        List<int[]> allIntervals = new ArrayList<>();
        int l = 0;
        int r = -1;
        int currSum = 0;
        while (true) {
            if (r < l || currSum < target) {
                if (r + 1 < arr.length) {
                    r++;
                    currSum += arr[r];
                } else {
                    break;
                }
            } else if (currSum == target) {
                allIntervals.add(new int[]{l, r});
                currSum -= arr[l];
                l++;
            } else { // currSum > target
                currSum -= arr[l];
                l++;
            }
        }

        if (allIntervals.size() < 2) {
            return -1;
        }

        int[] postfix = new int[arr.length + 1];
        postfix[arr.length] = Integer.MAX_VALUE;
        int intervalIdx = allIntervals.size() - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int[] currInt = allIntervals.get(intervalIdx);
            if (i == currInt[0]) {
                int newIntervalSize = currInt[1] - currInt[0] + 1;
                postfix[i] = Math.min(postfix[i + 1], newIntervalSize);
                intervalIdx--;
                if (intervalIdx < 0) {
                    break;
                }
            } else {
                postfix[i] = postfix[i + 1];

            }
        }

        int bestFound = Integer.MAX_VALUE;
        for (int[] left : allIntervals) {
            int leftSize = left[1] - left[0] + 1;
            int bestRight = postfix[left[1] + 1];
            if (bestRight != Integer.MAX_VALUE) {
                int possible = leftSize + bestRight;
                bestFound = Math.min(bestFound, possible);
            }

        }
        if (bestFound == Integer.MAX_VALUE) {
            return -1;
        }
        return bestFound;
    }
}