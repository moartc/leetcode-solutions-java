package solutions.algorithms._3000_3999._3756_Concatenate_Non_Zero_Digits_and_Multiply_by_Sum_II;

class Solution {

    private static final int MOD = 1000000000 + 7;

    public int[] sumAndMultiply(String s, int[][] queries) {

        char[] sArr = s.toCharArray();

        long[] sumPrefix = new long[sArr.length];
        long[] concatPrefix = new long[sArr.length];
        int[] nonZeroCount = new int[sArr.length];
        long[] pow10 = new long[sArr.length + 1];

        pow10[0] = 1;
        for (int i = 1; i <= sArr.length; i++) {
            pow10[i] = pow10[i - 1] * 10 % MOD;
        }

        long sum = 0;
        long x = 0;
        int count = 0;
        for (int i = 0; i < sArr.length; i++) {
            int dig = sArr[i] - 48;
            sum += dig;
            sumPrefix[i] = sum;
            if (dig != 0) {
                x = (x * 10 + dig) % MOD;
                count++;
            }
            concatPrefix[i] = x;
            nonZeroCount[i] = count;
        }
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int l = query[0];
            int r = query[1];
            long left = l > 0 ? concatPrefix[l - 1] : 0;
            int concat = nonZeroCount[r] - (l > 0 ? nonZeroCount[l - 1] : 0);
            long rangeConcat = (concatPrefix[r] - left * pow10[concat] % MOD + MOD) % MOD;
            long rangeSum = sumPrefix[r] - (l > 0 ? sumPrefix[l - 1] : 0);
            long ans = rangeConcat * (rangeSum % MOD) % MOD;
            answer[i] = (int) ans;
        }
        return answer;
    }


}