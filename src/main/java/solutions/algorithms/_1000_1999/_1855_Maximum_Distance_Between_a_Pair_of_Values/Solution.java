package solutions.algorithms._1000_1999._1855_Maximum_Distance_Between_a_Pair_of_Values;

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {

        int maxFound = 0;
        for (int i = 0; i < nums1.length; i++) {
            int idx = findMaxIdx(nums1[i], i, nums2);
            if (idx != -1) {
                maxFound = Math.max(maxFound, idx - i);
            }
        }
        return maxFound;
    }

    int findMaxIdx(int v, int start, int[] nums) {

        int left = start;
        int right = nums.length - 1;
        int found = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int valAtMid = nums[mid];
            if (valAtMid >= v) {
                found = mid;
            }
            if (valAtMid < v) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return found;
    }
}