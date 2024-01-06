package solutions.algorithms._0_999._413_Arithmetic_Slices;

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {

        if (nums.length < 3) {
            return 0;
        }
        int result = 0;
        int nextIdx = 1;
        int diff = nums[1] - nums[0];
        int counter = 2;
        while (nextIdx + 1 < nums.length) {
            if (nums[nextIdx + 1] - nums[nextIdx] == diff) {
                counter++;
            } else {
                if (counter >= 3) {
                    result += getSlicesNb(counter);
                }
                diff = nums[nextIdx + 1] - nums[nextIdx];
                counter = 2;
            }
            nextIdx++;
        }
        if (counter >= 3) {
            result += getSlicesNb(counter);
        }
        return result;
    }

    public int getSlicesNb(int size) {
        int result = 0;
        int counter = 1;
        while (size >= 3) {
            result += counter++;
            size--;
        }
        return result;
    }
}
