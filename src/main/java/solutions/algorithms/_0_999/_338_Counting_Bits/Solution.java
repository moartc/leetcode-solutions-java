package solutions.algorithms._0_999._338_Counting_Bits;

class Solution {
    public int[] countBits(int n) {

        int[] answer = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            answer[i] = kernighanSetBits(i);
        }
        return answer;
    }

    public int kernighanSetBits(int n) {
        int ctr = 0;
        while (n > 0) {
            n = n & (n - 1);
            ctr++;
        }
        return ctr;
    }
}