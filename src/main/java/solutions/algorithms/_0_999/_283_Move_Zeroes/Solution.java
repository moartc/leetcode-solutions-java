package solutions.algorithms._0_999._283_Move_Zeroes;

class Solution {

    public void moveZeroes(int[] nums) {

        int length = nums.length;
        int ptr = 0;
        int counter = 0;
        while (ptr < length) {
            if (nums[ptr] != 0) {
                nums[counter] = nums[ptr];
                counter++;
            }
            ptr++;
        }
        while (counter < length) {
            nums[counter++] = 0;
        }
    }

}