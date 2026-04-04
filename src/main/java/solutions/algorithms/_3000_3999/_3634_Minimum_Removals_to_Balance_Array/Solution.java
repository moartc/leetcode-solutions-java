package solutions.algorithms._3000_3999._3634_Minimum_Removals_to_Balance_Array;

import java.util.Arrays;

class Solution {
    public int minRemoval(int[] nums, int k) {

        Arrays.sort(nums);

        int left = 0;
        int bestFound = Integer.MAX_VALUE;
        for (int r = 0; r < nums.length; r++) {
            while ((long) nums[left] * k < nums[r]) {
                left++;
            }
            int dist = r - left + 1;
            bestFound = Math.min(nums.length - dist, bestFound);
        }
        return bestFound;
    }

    public int minRemoval_v1(int[] nums, int k) {
        Arrays.sort(nums);
        int bestFound = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            long max = (long) start * k;
            int idx = idxOfFirstLowerEq(i, nums.length - 1, max, nums);
            int length = idx - i + 1;
            int toDelete = nums.length - length;
            bestFound = Math.min(toDelete, bestFound);
        }
        return bestFound;
    }

    int idxOfFirstLowerEq(int left, int right, long max, int[] nums) {
        int found = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > max) {
                right = mid - 1;
            } else {
                left = mid + 1;
                found = mid;
            }
        }
        return found;
    }

}