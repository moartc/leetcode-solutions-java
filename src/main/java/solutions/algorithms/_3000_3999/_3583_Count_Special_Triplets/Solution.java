package solutions.algorithms._3000_3999._3583_Count_Special_Triplets;

class Solution {
    public int specialTriplets(int[] nums) {

        int MOD = 1000000007;
        int maxVal = 100001;
        int[] rightFreq = new int[maxVal];

        for (int num : nums) {
            rightFreq[num]++;
        }

        int answer = 0;
        int[] leftFreq = new int[maxVal];
        leftFreq[nums[0]]++;
        rightFreq[nums[0]]--;
        for (int i = 1; i < nums.length - 1; i++) {
            int curr = nums[i];
            rightFreq[curr]--;
            int currDouble = curr * 2;
            if (currDouble >= maxVal) {
                leftFreq[curr]++;
                continue;
            }
            int left = leftFreq[currDouble];
            int right = rightFreq[currDouble];
            long sum = (long) left * right;
            answer = (int) ((answer + sum) % MOD);
            leftFreq[curr]++;
        }
        return answer;
    }
}