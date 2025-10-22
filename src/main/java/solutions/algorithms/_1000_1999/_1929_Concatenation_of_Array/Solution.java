package solutions.algorithms._1000_1999._1929_Concatenation_of_Array;

class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            int i2 = i + nums.length;
            ans[i] = nums[i];
            ans[i2] = nums[i];
        }
        return ans;
    }
}