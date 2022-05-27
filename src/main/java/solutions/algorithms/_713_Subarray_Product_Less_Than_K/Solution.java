package solutions.algorithms._713_Subarray_Product_Less_Than_K;

class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int length = nums.length;
        int first = 0;
        int second = 0;
        int counter = 0;
        int res = nums[first];
        while (first < length) {
            if (res < k) {
                counter += (second - first) + 1;
                if (second < length - 1) {
                    res *= nums[++second];
                } else {
                    return counter;
                }
            } else {
                res /= nums[first++];
            }
        }
        return counter;
    }
}