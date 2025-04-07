package solutions.algorithms._0_999._167_Two_Sum_II_Input_Array_Is_Sorted;

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i1 = 0;
        int i2 = numbers.length - 1;

        while (true) {
            int f = numbers[i1];
            int s = numbers[i2];

            int currentSum = f + s;
            if (currentSum == target) {
                return new int[]{i1 + 1, i2 + 1};
            } else if (currentSum < target) {
                i1++;
            } else { // currentSum > target
                i2--;
            }
        }
    }
}