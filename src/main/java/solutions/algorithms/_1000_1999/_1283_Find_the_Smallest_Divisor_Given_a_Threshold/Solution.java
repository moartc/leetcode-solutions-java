package solutions.algorithms._1000_1999._1283_Find_the_Smallest_Divisor_Given_a_Threshold;

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int min = 1;
        int max = -1;
        for (int num : nums) {
            max = Math.max(num, max);
        }
        int bestFound = -1;
        while (min <= max) {
            int mid = (min + max) / 2;
            int sum = 0;
            for (int num : nums) {
                sum += (int) Math.ceil((double) num / mid);
            }
            if (sum > threshold) {
                min = mid + 1;
            } else {
                bestFound = mid;
                max = mid - 1;
            }
        }
        return bestFound;
    }

}