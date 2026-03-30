package solutions.algorithms._1000_1999._1470_Shuffle_the_Array;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int mp = 0;
        int i = 0;
        while (mp < 2 * n) {
            result[mp++] = nums[i];
            result[mp++] = nums[i + n];
            i++;
        }
        return result;
    }
}