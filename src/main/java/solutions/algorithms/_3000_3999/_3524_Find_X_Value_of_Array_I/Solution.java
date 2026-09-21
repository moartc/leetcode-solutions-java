package solutions.algorithms._3000_3999._3524_Find_X_Value_of_Array_I;

class Solution {
    public long[] resultArray(int[] nums, int k) {


        // dp[i][x] how many arrays at index
        // gives reminder x when divided by k
        long[][] dp = new long[nums.length + 1][k];

        int last = nums[nums.length - 1] % k;
        dp[nums.length - 1][last] = 1;
        int currVal = nums[nums.length - 1] % k;
        int[] currArr = new int[k];
        currArr[currVal]++;
        for (int i = nums.length - 2; i >= 0; i--) {
            int[] newArr = new int[k];
            currVal = nums[i] % k;
            newArr[currVal]++;
            // read prevVals
            for (int x = 0; x < k; x++) {
                int div = (currVal * x) % k;
                newArr[div] += dp[i + 1][x];
            }
            for (int x = 0; x < k; x++) {
                dp[i][x] = newArr[x];
            }
//            System.out.println("x");
        }

        long[] res = new long[k];
        for (int i = 0; i < dp.length; i++) {
            for (int ki = 0; ki < k; ki++) {
                res[ki] += dp[i][ki];
            }
        }


        return res;
    }
}