package solutions.algorithms._1822_Sign_of_the_Product_of_an_Array;

class Solution {
    public int arraySign(int[] nums) {

        int result = 1;
        for (int num : nums) {
            if(num == 0) {
                return 0;
            } else if(num < 0) {
                result *= -1;
            }
        }
        return result;
    }
}