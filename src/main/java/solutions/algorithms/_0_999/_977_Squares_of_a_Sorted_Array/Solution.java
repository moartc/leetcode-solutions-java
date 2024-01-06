package solutions.algorithms._0_999._977_Squares_of_a_Sorted_Array;

class Solution {
    public int[] sortedSquares(int[] nums) {

        if (nums.length == 1) {
            return new int[]{nums[0] * nums[0]};
        }
        int leftIndex = 0;
        while (leftIndex < nums.length && nums[leftIndex] < 0) {
            leftIndex++;
        }
        leftIndex--;
        int[] toReturn = new int[nums.length];
        int rightIndex = leftIndex + 1;
        int arrToReturnIndex = 0;
        while (leftIndex >= 0 && rightIndex <= nums.length - 1) {
            int left = nums[leftIndex] * nums[leftIndex];
            int right = nums[rightIndex] * nums[rightIndex];
            if (left < right) {
                toReturn[arrToReturnIndex++] = left;
                leftIndex--;
            } else {
                toReturn[arrToReturnIndex++] = right;
                rightIndex++;
            }
        }
        while (rightIndex < nums.length) {
            toReturn[arrToReturnIndex++] = nums[rightIndex] * nums[rightIndex];
            rightIndex++;
        }
        while (leftIndex >= 0) {
            toReturn[arrToReturnIndex++] = nums[leftIndex] * nums[leftIndex];
            leftIndex--;
        }
        return toReturn;
    }
}