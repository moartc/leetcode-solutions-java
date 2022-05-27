package solutions.algorithms._209_Minimum_Size_Subarray_Sum;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int first = 0;
        int second = 0;
        int length = nums.length;
        int sum = nums[0];
        int result = 0;
        while (first < length) {
            if (sum >= target) {
                var res = second - first + 1;
                if (res < result || result == 0) {
                    result = res;
                }
                sum -= nums[first];
                first++;
            } else {
                second++;
                if (second < length) {
                    sum += nums[second];
                } else {
                    break;
                }
            }
        }
        return result;
    }
}