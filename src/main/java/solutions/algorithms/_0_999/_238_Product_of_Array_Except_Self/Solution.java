package solutions.algorithms._0_999._238_Product_of_Array_Except_Self;

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];
        int totalPost = 1;

        for (int i = 0; i < nums.length; i++) {
            var postVal = nums[nums.length - 1 - i];
            totalPost *= postVal;
            answer[nums.length - 1 - i] = totalPost;
        }

        int leftProd = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                leftProd *= nums[i];
                answer[i] = answer[i + 1];
            } else if (i == nums.length - 1) {
                answer[i] = leftProd;
            } else {
                var toMultiply = nums[i];
                answer[i] = leftProd * answer[i + 1];
                leftProd *= toMultiply;
            }
        }
        return answer;
    }
}