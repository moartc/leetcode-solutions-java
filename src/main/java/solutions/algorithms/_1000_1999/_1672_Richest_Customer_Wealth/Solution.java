package solutions.algorithms._1000_1999._1672_Richest_Customer_Wealth;

class Solution {
    public int maximumWealth(int[][] accounts) {

        int max = -1;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}