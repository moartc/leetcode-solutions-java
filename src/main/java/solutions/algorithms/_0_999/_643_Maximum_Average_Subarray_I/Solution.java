package solutions.algorithms._0_999._643_Maximum_Average_Subarray_I;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double bestAvg = Double.NEGATIVE_INFINITY;
        double avg = 0.0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        avg = sum / (double) k;
        bestAvg = Math.max(bestAvg, avg);
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            avg = sum / (double) k;
            bestAvg = Math.max(bestAvg, avg);
        }
        return bestAvg;
    }

}