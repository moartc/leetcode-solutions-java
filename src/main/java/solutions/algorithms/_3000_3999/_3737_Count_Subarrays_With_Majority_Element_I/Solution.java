package solutions.algorithms._3000_3999._3737_Count_Subarrays_With_Majority_Element_I;

class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int ctr = 0;
            for (int j = i; j < nums.length; j++) {
                int size = j - i + 1;
                if (nums[j] == target) {
                    ctr++;
                }
                if (ctr * 2 > size) {
                    total++;
                }
            }
        }
        return total;
    }
}