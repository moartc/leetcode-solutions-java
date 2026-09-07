package solutions.algorithms._0_999._940_Distinct_Subsequences_II;

class Solution {

    public int distinctSubseqII(String s) {

        int MOD = 1000000000 + 7;

        char[] cArr = s.toCharArray();
        long[] dupForChar = new long[26];
        long curr = 1;
        for (int i = 0; i < cArr.length; i++) {
            int idx = cArr[i] - 'a';
            long prev = dupForChar[idx];
            dupForChar[idx] = curr;
            curr = ((2 * curr) - prev + MOD) % MOD;
        }
        return (int) ((curr - 1 + MOD) % MOD);

    }
}