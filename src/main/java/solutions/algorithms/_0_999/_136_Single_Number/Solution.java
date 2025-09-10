package solutions.algorithms._0_999._136_Single_Number;

class Solution {

    /*
    So basically it's about XOR
     */
    public int singleNumber(int[] nums) {

        int sum = 0;
        for (int num : nums) {
            sum ^= num;
        }
        return sum;
    }
}