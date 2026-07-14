package solutions.algorithms._3000_3999._3336_Find_the_Number_of_Subsequences_With_Equal_GCD;

class Solution {
    public int subsequencePairCount(int[] nums) {


        int mod = 1000000000+7;
        int[][] allGcd = new int[201][201];
        for (int a = 0; a <= 200; a++) {
            for (int b = 0; b <= 200; b++) {
                allGcd[a][b] = gcd(a, b);
            }
        }

        // 2nd dim 201 since the max num is 200
        int[][] current = new int[201][201];
        current[0][0] = 1;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int[][] next = new int[201][201];
            for (int i1 = 0; i1 < 201; i1++) {
                for (int i2 = 0; i2 < 201; i2++) {
                    int prevVal = current[i1][i2];
                    if (prevVal == 0) {
                        continue;
                    }
                    // ignore
                    next[i1][i2] += (prevVal% mod);
                    next[i1][i2] %= mod;

                    // seq1
                    int newGcd1 = allGcd[i1][num];
                    next[newGcd1][i2] += (prevVal% mod);
                    next[newGcd1][i2] %= mod;

                    //seq2
                    int newGcd2 = allGcd[num][i2];
                    next[i1][newGcd2] += (prevVal% mod);
                    next[i1][newGcd2] %= mod;
                }
            }
            current = next;
        }

        long ans = 0;
        for (int i = 1; i < 201; i++) {
            ans += current[i][i];
            ans %= mod;
        }
        return (int) ans;
    }


    int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}