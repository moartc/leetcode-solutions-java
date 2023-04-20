package solutions.algorithms._238_Product_of_Array_Except_Self;

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int prod1 = 1;
        int prod2 = 1;
        int[] prodRight = new int[nums.length];
        int[] prodLeft = new int[nums.length];
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            prod1 *= nums[i];
            prodRight[i] = prod1;
            prod2 *= nums[nums.length-1-i];
            prodLeft[nums.length-1-i] = prod2;
        }
        result[0] = prodLeft[1];
        result[nums.length-1] = prodRight[nums.length-2];
        for (int i = 1; i < nums.length-1; i++) {
            int res = prodRight[i-1] * prodLeft[i+1];
            result[i] = res;
        }
        return result;
    }
}