package solutions.algorithms._1000_1999._1437_Check_If_All_1s_Are_at_Least_LengthK_Places_Away;

class Solution {
    public boolean kLengthApart(int[] nums, int k) {

        int prev = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (prev == -1) {
                    prev = i;
                } else {
                    int dist = i - prev - 1;
                    if (dist < k) {
                        return false;
                    } else {
                        prev = i;
                    }
                }
            }
        }
        return true;
    }
}