package solutions.algorithms._2000_2999._2784_Check_if_Array_is_Good;

class Solution {
    public boolean isGood(int[] nums) {

        int n = nums.length;

        int[] allExpected = new int[n + 1]; // ignore 0

        for (int num : nums) {

            if (num < 1 || num > n - 1) {
                return false;
            }
            // in the range
            if (num != n - 1 && allExpected[num] == 1) {
                return false;
            } else if (allExpected[num] == 2) {
                return false;
            }
            allExpected[num]++;
        }
        // if i didn't return before, it\s true
        return allExpected[n - 1] == 2;
    }
}